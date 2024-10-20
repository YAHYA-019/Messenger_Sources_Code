package org.pytorch;

import X.C0gh;

/* loaded from: PyTorchAndroid.class */
public final class PyTorchAndroid {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.0gc] */
    static {
        if (!C0gh.A01()) {
            C0gh.A00(new Object());
        }
        C0gh.A02("pytorch_jni_lite");
        try {
            C0gh.A02("torch-code-gen");
        } catch (Throwable unused) {
        }
    }

    public static native void nativeSetNumThreads(int i);
}
