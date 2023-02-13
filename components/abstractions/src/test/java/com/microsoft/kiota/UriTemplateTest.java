package com.microsoft.kiota;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Map;

public class UriTemplateTest {

    Gson gson = new GsonBuilder()
            .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .create();

    @ParameterizedTest
    @CsvFileSource(resources = "/nest_templates.csv", numLinesToSkip = 1)
    void testNestTemplates(String template, String nested, String stringArgs, String result) {
        UriTemplate uriTemplate = new UriTemplate(template);
        Map<String, Object> arguments = gson.fromJson(stringArgs, Map.class);
        Assertions.assertEquals(result, uriTemplate.nest(nested).expand(arguments));
    }
}
