package com.facebook.rsys.livevideo.gen;

import X.2JQ;
import X.HN4;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LiveVideoBroadcastLifecycleCallback.class */
public abstract class LiveVideoBroadcastLifecycleCallback {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APP_DID_BECOME_ACTIVE);

    /* loaded from: LiveVideoBroadcastLifecycleCallback$CProxy.class */
    public final class CProxy extends LiveVideoBroadcastLifecycleCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN4.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native LiveVideoBroadcastLifecycleCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoBroadcastLifecycleCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastCancelled(boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastCreated(boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastEnded(boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastStarted(boolean z);
    }

    public abstract void roomsBroadcastCancelled(boolean z);

    public abstract void roomsBroadcastCreated(boolean z);

    public abstract void roomsBroadcastEnded(boolean z);

    public abstract void roomsBroadcastStarted(boolean z);
}
