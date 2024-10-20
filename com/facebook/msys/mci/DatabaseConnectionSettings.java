package com.facebook.msys.mci;

import X.C1jh;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DatabaseConnectionSettings.class */
public class DatabaseConnectionSettings {
    public final NativeHolder mNativeHolder;

    static {
        C1jh.A00();
    }

    public DatabaseConnectionSettings(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public native void config(int i, boolean z, int i2, boolean z2, boolean z3, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, long j);
}
