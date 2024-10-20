package com.fasterxml.jackson.annotation;

import X.3Da;
import X.C25t;
import X.C68k;

/* loaded from: JsonFormat.class */
public @interface JsonFormat {
    3Da lenient();

    String locale();

    String pattern();

    C25t shape();

    String timezone();

    C68k[] with();

    C68k[] without();
}
