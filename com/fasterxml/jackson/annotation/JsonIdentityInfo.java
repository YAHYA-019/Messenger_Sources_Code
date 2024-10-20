package com.fasterxml.jackson.annotation;

/* loaded from: JsonIdentityInfo.class */
public @interface JsonIdentityInfo {
    Class generator();

    String property();

    Class resolver();

    Class scope();
}
