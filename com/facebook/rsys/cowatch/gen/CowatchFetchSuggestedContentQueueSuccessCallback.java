package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: CowatchFetchSuggestedContentQueueSuccessCallback.class */
public abstract class CowatchFetchSuggestedContentQueueSuccessCallback {
    public static 2JQ CONVERTER = IR0.A00(70);

    /* loaded from: CowatchFetchSuggestedContentQueueSuccessCallback$CProxy.class */
    public final class CProxy extends CowatchFetchSuggestedContentQueueSuccessCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchFetchSuggestedContentQueueSuccessCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchSuggestedContentQueueSuccessCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueSuccessCallback
        public native void onSuccess(ArrayList arrayList);
    }

    public abstract void onSuccess(ArrayList arrayList);
}
