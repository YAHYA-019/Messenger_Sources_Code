package com.facebook.common.dextricks.storer;

import X.C0il;

/* loaded from: Storer.class */
public class Storer {
    static {
        C0il.A0B("storer-jni");
    }

    public static native void cleanup(long j);

    public static native void finish(long j);

    public static native long open(String str, int i);

    public static native void start(long j, String str, int i);

    public static native void start_unaligned(long j, String str, int i);

    public static native void write(long j, byte[] bArr, int i);
}
