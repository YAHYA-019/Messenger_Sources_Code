package com.facebook.rsys.mediastats.gen;

import X.2JQ;
import X.HN7;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MediaStatsProxy.class */
public abstract class MediaStatsProxy {
    public static 2JQ CONVERTER = IR0.A00(ActionId.MQTT_DISCONNECTED);

    /* loaded from: MediaStatsProxy$CProxy.class */
    public final class CProxy extends MediaStatsProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN7.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MediaStatsProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaStatsProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.mediastats.gen.MediaStatsProxy
        public native void setApi(MediaStatsApi mediaStatsApi);
    }

    public abstract void setApi(MediaStatsApi mediaStatsApi);
}
