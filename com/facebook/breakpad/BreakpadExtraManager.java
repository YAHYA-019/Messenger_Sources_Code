package com.facebook.breakpad;

import X.0fH;
import X.C0il;

/* loaded from: BreakpadExtraManager.class */
public class BreakpadExtraManager {
    static {
        try {
            C0il.A0B("breakpad_extra");
        } catch (UnsatisfiedLinkError e) {
            0fH.A0r("BreakpadExtra", "Failed to load breakpad extra jni library: ", e);
        }
    }

    public static native boolean appendSessionIdInTombstone(String str);
}
