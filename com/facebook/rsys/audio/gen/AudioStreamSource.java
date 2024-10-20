package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioStreamSource.class */
public abstract class AudioStreamSource {
    public static 2JQ CONVERTER = N6e.A00(4);

    /* loaded from: AudioStreamSource$CProxy.class */
    public final class CProxy extends AudioStreamSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioStreamSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioStreamSource)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native AudioFrame getAudioFrame(int i, int i2);

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native int getAudioLevel();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native void setPlayoutEnabled(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native void setPlayoutVolume(float f);
    }

    public abstract AudioFrame getAudioFrame(int i, int i2);

    public abstract int getAudioLevel();

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);
}
