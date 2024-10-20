package com.facebook.common.jit;

import X.0fH;
import X.C0il;
import android.content.Context;
import android.util.Log;
import com.facebook.common.jit.common.MethodInfo;
import java.util.List;

/* loaded from: JitUtilsNative.class */
public final class JitUtilsNative {
    public static final boolean PLATFORM_SUPPORTED;

    static {
        boolean z;
        try {
            C0il.A0B("fbjitjni");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            0fH.A0H(JitUtilsNative.class, "Error loading JitUtils", e);
            z = false;
        }
        PLATFORM_SUPPORTED = z;
    }

    public static boolean initialize(Context context, boolean z, List list, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (!PLATFORM_SUPPORTED) {
            return false;
        }
        String absolutePath = context.getDir("jitutils", 0).getAbsolutePath();
        Class cls = Boolean.TYPE;
        MethodInfo method = MethodInfo.getMethod(JitUtilsNative.class, "initialize", Context.class, cls, List.class, Integer.TYPE, cls, cls, cls, cls, cls, cls);
        if (method != null) {
            return nativeInitialize(z, (MethodInfo[]) list.toArray(new MethodInfo[list.size()]), method, i, z2, z3, z4, z5, z6, z7, absolutePath);
        }
        Log.e("JitUtilsNative", String.format("Jit initing failed: Cannot find %s.%s function.", JitUtilsNative.class.getName(), "initialize"));
        return false;
    }

    public static native boolean nativeDisableJit();

    public static native boolean nativeEnableJit(long j, boolean z, boolean z2, boolean z3);

    public static native Object nativeGetDefaultJITStatus();

    public static native String nativeGetErrorMessage();

    public static native Object nativeGetJITStatus();

    public static native Object nativeGetPgoMethodInfo(String str, Object[] objArr);

    public static native boolean nativeInitialize(boolean z, MethodInfo[] methodInfoArr, MethodInfo methodInfo, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str);

    public static native boolean nativeIsJitEnabled();

    public static native boolean nativeIsProfileChangeSignificant(String str, String str2, boolean z);

    public static native void nativeMarkAsPriorityThread();

    public static native boolean nativeStartJit();

    public static native void nativeStartPerfSensitiveScenario(int i);

    public static native boolean nativeStopJit();

    public static native void nativeStopPerfSensitiveScenario();

    public static native void nativeUnmarkAsPriorityThread();
}
