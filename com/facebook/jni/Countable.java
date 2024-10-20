package com.facebook.jni;

import X.0FI;
import X.C0gh;

/* loaded from: Countable.class */
public class Countable {
    public long mInstance = 0;

    static {
        C0gh.A03("fb");
    }

    public native void dispose();

    public void finalize() {
        int A03 = 0FI.A03(-1205671323);
        dispose();
        0FI.A09(-2037648308, A03);
    }
}
