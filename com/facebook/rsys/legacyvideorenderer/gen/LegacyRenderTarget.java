package com.facebook.rsys.legacyvideorenderer.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HEG;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LegacyRenderTarget.class */
public abstract class LegacyRenderTarget {
    public static 2JQ CONVERTER = IR0.A00(ActionId.MESSENGER_QUEUE_CREATION);

    /* loaded from: LegacyRenderTarget$CProxy.class */
    public final class CProxy extends LegacyRenderTarget {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HEG.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsyslegacyvideorendererjniStaging" : "rsyslegacyvideorendererjniLatest");
            HEG.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native LegacyRenderTarget createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LegacyRenderTarget)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.legacyvideorenderer.gen.LegacyRenderTarget
        public native void handleFrame(RSVideoFrame rSVideoFrame);

        public native int hashCode();
    }

    public abstract void handleFrame(RSVideoFrame rSVideoFrame);
}
