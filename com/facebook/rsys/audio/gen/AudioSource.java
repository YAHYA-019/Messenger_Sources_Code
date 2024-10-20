package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: AudioSource.class */
public abstract class AudioSource {
    public static 2JQ CONVERTER = IR0.A00(9);

    /* loaded from: AudioSource$CProxy.class */
    public final class CProxy extends AudioSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioSource)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native int getAudioLevel();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native ArrayList getSinks();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewAudioFrame(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewAudioPosition(float f, float f2, float f3);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setPlayoutEnabled(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setPlayoutVolume(float f);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setSinks(ArrayList arrayList);
    }

    public abstract int getAudioLevel();

    public abstract ArrayList getSinks();

    public abstract void notifyNewAudioFrame(AudioFrame audioFrame);

    public abstract void notifyNewAudioPosition(float f, float f2, float f3);

    public abstract void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);

    public abstract void setSinks(ArrayList arrayList);
}
