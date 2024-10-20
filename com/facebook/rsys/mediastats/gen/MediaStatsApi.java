package com.facebook.rsys.mediastats.gen;

import X.2JQ;
import X.HN7;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: MediaStatsApi.class */
public abstract class MediaStatsApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.MQTT_CONNECTING);

    /* loaded from: MediaStatsApi$CProxy.class */
    public final class CProxy extends MediaStatsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN7.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native MediaStatsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaStatsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.mediastats.gen.MediaStatsApi
        public native void fetchAudioLevels(ArrayList arrayList, AudioLevelsCallback audioLevelsCallback);

        public native int hashCode();

        @Override // com.facebook.rsys.mediastats.gen.MediaStatsApi
        public native void registerListener(MediaStatsListener mediaStatsListener);

        @Override // com.facebook.rsys.mediastats.gen.MediaStatsApi
        public native void unregisterListener(MediaStatsListener mediaStatsListener);
    }

    public abstract void fetchAudioLevels(ArrayList arrayList, AudioLevelsCallback audioLevelsCallback);

    public abstract void registerListener(MediaStatsListener mediaStatsListener);

    public abstract void unregisterListener(MediaStatsListener mediaStatsListener);
}
