package com.fasterxml.jackson.annotation;

/* loaded from: JsonIgnoreProperties.class */
public @interface JsonIgnoreProperties {
    boolean allowGetters();

    boolean allowSetters();

    boolean ignoreUnknown();

    String[] value();
}
