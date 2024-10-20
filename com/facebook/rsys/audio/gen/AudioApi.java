package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: AudioApi.class */
public abstract class AudioApi {
    public static 2JQ CONVERTER = IR0.A00(2);

    /* loaded from: AudioApi$CProxy.class */
    public final class CProxy extends AudioApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void addSink(String str, int i, AudioSourceSink audioSourceSink);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void enableAudio(ArrayList arrayList);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void enableNoiseSuppression(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native AudioFrame getAudioFrame(String str, int i, int i2, int i3);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native int getAudioLevel(String str, int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleFrame(AudioFrame audioFrame);

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void removeSink(String str, int i, AudioSourceSink audioSourceSink);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void resetNsAecAlgorithms();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setAudioActivationState(int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setAudioOutputRoute(AudioOutputRoute audioOutputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setPlaybackVolumeDeprecated(ArrayList arrayList);
    }

    public abstract void addSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void enableAudio(ArrayList arrayList);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract AudioFrame getAudioFrame(String str, int i, int i2, int i3);

    public abstract int getAudioLevel(String str, int i);

    public abstract void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void handleFrame(AudioFrame audioFrame);

    public abstract void removeSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void resetNsAecAlgorithms();

    public abstract void setAudioActivationState(int i);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOutputRoute(AudioOutputRoute audioOutputRoute);

    public abstract void setPlaybackVolumeDeprecated(ArrayList arrayList);
}
