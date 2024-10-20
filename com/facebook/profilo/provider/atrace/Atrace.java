package com.facebook.profilo.provider.atrace;

import X.0S3;
import X.AnonymousClass001;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: Atrace.class */
public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative(boolean z);

    public static boolean hasHacks(MultiBufferLogger multiBufferLogger, boolean z) {
        boolean z2;
        synchronized (Atrace.class) {
            z2 = sHasHook;
            if (!z2 && !sHookFailed) {
                z2 = installSystraceHook(multiBufferLogger, 0S3.A00, z);
                sHasHook = z2;
                sHookFailed = AnonymousClass001.A1O(z2 ? 1 : 0);
            }
        }
        return z2;
    }

    public static native boolean installSystraceHook(MultiBufferLogger multiBufferLogger, int i, boolean z);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative(boolean z);
}
