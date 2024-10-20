package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import X.C0bm;
import android.util.Log;

/* loaded from: Mlog.class */
public final class Mlog {
    public static final String TAG = "DexLibLoader";
    public static final boolean VERBOSE = true;

    public static void assertThat(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        String A00 = C0bm.A00(str, objArr);
        Log.e(TAG, A00);
        throw AnonymousClass001.A0J(0Pz.A0j(TAG, ": ", A00));
    }

    public static void d(String str, Object... objArr) {
        Log.d(TAG, C0bm.A00(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.d(TAG, C0bm.A00(str, objArr, th));
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, C0bm.A00(str, objArr));
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, C0bm.A00(str, objArr), th);
    }

    public static void i(String str, Object... objArr) {
        Log.i(TAG, C0bm.A00(str, objArr));
    }

    public static void i(Throwable th, String str, Object... objArr) {
        Log.i(TAG, C0bm.A00(str, objArr, th));
    }

    public static void v(String str, Object... objArr) {
        Log.v(TAG, C0bm.A00(str, objArr));
    }

    public static void v(Throwable th, String str, Object... objArr) {
        Log.v(TAG, C0bm.A00(str, objArr, th));
    }

    public static void w(String str, Object... objArr) {
        Log.w(TAG, C0bm.A00(str, objArr));
    }

    public static void w(Throwable th, String str, Object... objArr) {
        Log.w(TAG, C0bm.A00(str, objArr, th));
    }
}
