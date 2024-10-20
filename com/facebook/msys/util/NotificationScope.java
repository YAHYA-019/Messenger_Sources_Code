package com.facebook.msys.util;

import X.1XV;
import X.1Xv;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NotificationScope.class */
public final class NotificationScope implements 1Xv {
    public final McfReferenceHolder mMcfReference = new McfReferenceHolder();
    public final NativeHolder mNativeHolder = initNativeHolder(this);

    static {
        1XV.A00();
    }

    public static native NativeHolder initNativeHolder(NotificationScope notificationScope);

    public long getNativeReference() {
        return this.mMcfReference.nativeReference;
    }
}
