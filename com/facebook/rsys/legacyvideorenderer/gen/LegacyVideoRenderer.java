package com.facebook.rsys.legacyvideorenderer.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HEG;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LegacyVideoRenderer.class */
public abstract class LegacyVideoRenderer {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APP_DID_FINISH_LAUNCHING);

    /* loaded from: LegacyVideoRenderer$CProxy.class */
    public final class CProxy extends LegacyVideoRenderer {
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

        public static native LegacyVideoRenderer createFromMcfType(McfReference mcfReference);

        public static native LegacyVideoRenderer createRenderer();

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.legacyvideorenderer.gen.LegacyVideoRenderer
        public native LegacyRenderTarget createRenderTarget(Object obj);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LegacyVideoRenderer)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.legacyvideorenderer.gen.LegacyVideoRenderer
        public native VideoRenderApi getApi();

        @Override // com.facebook.rsys.legacyvideorenderer.gen.LegacyVideoRenderer
        public native VideoRenderProxy getVideoRenderProxy();

        public native int hashCode();
    }

    public abstract LegacyRenderTarget createRenderTarget(Object obj);

    public abstract VideoRenderApi getApi();

    public abstract VideoRenderProxy getVideoRenderProxy();
}
