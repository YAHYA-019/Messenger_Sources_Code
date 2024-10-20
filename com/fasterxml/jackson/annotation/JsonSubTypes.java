package com.fasterxml.jackson.annotation;

/* loaded from: JsonSubTypes.class */
public @interface JsonSubTypes {

    /* loaded from: JsonSubTypes$Type.class */
    public @interface Type {
        String name();

        String[] names();

        Class value();
    }

    Type[] value();
}
