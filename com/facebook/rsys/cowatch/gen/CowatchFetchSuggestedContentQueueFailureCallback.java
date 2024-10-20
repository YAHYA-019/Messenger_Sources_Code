package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchFetchSuggestedContentQueueFailureCallback.class */
public abstract class CowatchFetchSuggestedContentQueueFailureCallback {
    public static 2JQ CONVERTER = IR0.A00(69);

    /* loaded from: CowatchFetchSuggestedContentQueueFailureCallback$CProxy.class */
    public final class CProxy extends CowatchFetchSuggestedContentQueueFailureCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchFetchSuggestedContentQueueFailureCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchSuggestedContentQueueFailureCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueFailureCallback
        public native void onFailure(String str, String str2);
    }

    public abstract void onFailure(String str, String str2);
}
