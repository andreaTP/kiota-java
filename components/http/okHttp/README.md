# To-do

- [ ] checkstyles
- [ ] spotbugs
- [ ] javadoc
- [ ] cobertura

## Using the OkHttp implementations

1. In `build.gradle` in the `repositories` section:

    ```Groovy
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }  
    ```

1. In `build.gradle` in the `dependencies` section:

    ```Groovy
    implementation 'com.microsoft.kiota:microsoft-kiota-http-okHttp:0.0.7-SNAPSHOT'
    ```

