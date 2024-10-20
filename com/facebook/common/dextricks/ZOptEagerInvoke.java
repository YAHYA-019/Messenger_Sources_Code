package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.content.Context;

/* loaded from: ZOptEagerInvoke.class */
public class ZOptEagerInvoke {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    public static void run(Context context) {
        ?? r0 = "com.facebook.common.zopt.ZOpt";
        try {
            r0 = Class.forName("com.facebook.common.zopt.ZOpt").getMethod("notePostColdStart", Context.class, Boolean.class).invoke(null, context, null);
        } catch (Exception unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }
}
