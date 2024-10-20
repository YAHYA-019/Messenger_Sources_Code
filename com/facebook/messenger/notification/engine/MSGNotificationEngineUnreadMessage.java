package com.facebook.messenger.notification.engine;

import X.C46T;
import X.C4Ud;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MSGNotificationEngineUnreadMessage.class */
public final class MSGNotificationEngineUnreadMessage {
    public static final C4Ud Companion = new Object();
    public NativeHolder mNativeHolder;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Ud, java.lang.Object] */
    static {
        C46T.A00();
    }

    public MSGNotificationEngineUnreadMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static final native NativeHolder initNativeHolder(Long l, String str, Long l2, String str2, String str3, String str4);

    public final native String getMessageId();

    public final native String getPreviewUrl();

    public final native Long getSenderId();

    public final native String getSenderName();

    public final native String getText();

    public final native Long getTimestampMs();
}
