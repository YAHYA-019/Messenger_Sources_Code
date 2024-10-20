package com.truepic.lenssdkverify;

import X.C0il;

/* loaded from: LibC2PA.class */
public class LibC2PA {
    static {
        C0il.A0B("android_c2pa");
    }

    public static native String filenameGetC2PAJson(String str);

    public static native Object[] filenameGetC2PAJsonWithThumbnails(String str);

    public static native String getC2PAJson(byte[] bArr);
}
