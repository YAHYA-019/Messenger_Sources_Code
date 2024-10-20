package com.facebook.common.lyra;

import X.C0il;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: LyraManager.class */
public final class LyraManager {
    public static final LyraManager INSTANCE = new Object();
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.common.lyra.LyraManager, java.lang.Object] */
    static {
        C0il.A0B("lyramanager");
    }

    public static final native void installLibraryIdentifierFunction();

    public static final native boolean nativeInstallLyraHook(boolean z);
}
