package com.facebook.common.earlystartupperf;

import X.C0il;

/* loaded from: Odex.class */
public final class Odex {
    public static final Odex INSTANCE = new Odex();

    static {
        C0il.A0B("earlystartupperf-jni");
    }

    public static final native int getOdexSize(boolean z);
}
