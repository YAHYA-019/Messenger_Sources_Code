package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.AudioFrameData;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioFrame.class */
public abstract class AudioFrame {
    public static 2JQ CONVERTER = N6e.A00(1);

    /* loaded from: AudioFrame$CProxy.class */
    public final class CProxy extends AudioFrame {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioFrame createFrame(AudioFrameData audioFrameData, AudioFrameMetadata audioFrameMetadata);

        public static native AudioFrame createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioFrame)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.audio.gen.AudioFrame
        public native AudioFrameData getAudioData();

        @Override // com.facebook.rsys.audio.gen.AudioFrame
        public native AudioFrameMetadata getMetadata();

        public native int hashCode();
    }

    public abstract AudioFrameData getAudioData();

    public abstract AudioFrameMetadata getMetadata();
}
