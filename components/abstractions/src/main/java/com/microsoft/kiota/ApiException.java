package com.microsoft.kiota;

import javax.annotation.Nonnull;

/** Parent type for exceptions thrown by the client when receiving failed responses to its requests. */
public class ApiException extends Exception {
    /** {@inheritDoc} */
    public ApiException() {
        super();
    }
    /** {@inheritDoc} */
    public ApiException(@Nonnull final String message) {
        super(message);
    }
    /** {@inheritDoc} */
    public ApiException(@Nonnull final String message, @Nonnull final Throwable cause) {
        super(message, cause);
    }
    /** {@inheritDoc} */
    public ApiException(@Nonnull final Throwable cause) {
        super(cause);
    }

    /** The HTTP status code  for the response*/
    public int responseStatusCode;
}
