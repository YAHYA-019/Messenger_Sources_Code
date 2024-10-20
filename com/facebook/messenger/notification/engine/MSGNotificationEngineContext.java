package com.facebook.messenger.notification.engine;

import X.4SJ;
import X.C46T;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: MSGNotificationEngineContext.class */
public final class MSGNotificationEngineContext {
    public static final 4SJ Companion = new Object();
    public NativeHolder mNativeHolder;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SJ, java.lang.Object] */
    static {
        C46T.A00();
    }

    public MSGNotificationEngineContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public final native Map getNotificationContextDict();
}
