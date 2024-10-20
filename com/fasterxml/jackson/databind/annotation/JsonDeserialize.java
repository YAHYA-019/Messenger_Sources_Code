package com.fasterxml.jackson.databind.annotation;

/* loaded from: JsonDeserialize.class */
public @interface JsonDeserialize {
    Class as();

    Class builder();

    Class contentAs();

    Class contentConverter();

    Class contentUsing();

    Class converter();

    Class keyAs();

    Class keyUsing();

    Class using();
}
