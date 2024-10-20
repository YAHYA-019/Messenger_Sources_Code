package com.facebook.rsys.audiomodule.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HDy;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioModule.class */
public abstract class AudioModule {
    public static 2JQ CONVERTER = IR0.A00(16);

    /* loaded from: AudioModule$CProxy.class */
    public final class CProxy extends AudioModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HDy.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysaudiomodulejniStaging" : "rsysaudiomodulejniLatest");
            HDy.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioModule createFromMcfType(McfReference mcfReference);

        public static native AudioModule createImp(AudioPipelineContext audioPipelineContext, OverlayConfigManagerHolder overlayConfigManagerHolder);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void deliverAppLevelAudio(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void enableNoiseSuppression(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioModule)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void resetNsAecAlgorithms();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void startPlayout();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void startRecording();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void stopPlayout();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void stopRecording();
    }

    public abstract void deliverAppLevelAudio(AudioFrame audioFrame);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract void resetNsAecAlgorithms();

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
