package com.facebook.rsys.reactions.gen;

import X.2JQ;
import X.HNC;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: ReactionsApi.class */
public abstract class ReactionsApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APPLY_FINISHED_LIST_AGAIN);

    /* loaded from: ReactionsApi$CProxy.class */
    public final class CProxy extends ReactionsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNC.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native ReactionsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ReactionsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.reactions.gen.ReactionsApi
        public native void sendEmoji(SendEmojiInputModel sendEmojiInputModel);

        @Override // com.facebook.rsys.reactions.gen.ReactionsApi
        public native void setAllowedGifDomains(ArrayList arrayList);
    }

    public abstract void sendEmoji(SendEmojiInputModel sendEmojiInputModel);

    public abstract void setAllowedGifDomains(ArrayList arrayList);
}
