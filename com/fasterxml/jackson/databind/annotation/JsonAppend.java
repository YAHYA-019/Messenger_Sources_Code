package com.fasterxml.jackson.databind.annotation;

import X.C25d;

/* loaded from: JsonAppend.class */
public @interface JsonAppend {

    /* loaded from: JsonAppend$Attr.class */
    public @interface Attr {
        C25d include();

        String propName();

        String propNamespace();

        boolean required();

        String value();
    }

    /* loaded from: JsonAppend$Prop.class */
    public @interface Prop {
        C25d include();

        String name();

        String namespace();

        Class type();

        Class value();
    }

    Attr[] attrs();

    boolean prepend();

    Prop[] props();
}
