package com.facebook.realtime.requeststream.api;

/* loaded from: StreamOptions.class */
public interface StreamOptions {
    String getRequestLogContext();

    long getRetryBackoffInterval();

    boolean shouldGenNewStreamIdPerRetry();
}
