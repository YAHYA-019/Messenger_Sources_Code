package com.facebook.common.terminate_handler;

import X.C0il;

/* loaded from: TerminateHandlerManager.class */
public final class TerminateHandlerManager {
    public static final TerminateHandlerManager INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.common.terminate_handler.TerminateHandlerManager] */
    static {
        C0il.A0B("terminate_handler_manager");
    }

    public static final native void nativeInstallTerminateHandler();
}
