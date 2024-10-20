package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioDeviceModule.class */
public abstract class AudioDeviceModule {
    public static 2JQ CONVERTER = IR0.A00(3);

    /* loaded from: AudioDeviceModule$CProxy.class */
    public final class CProxy extends AudioDeviceModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioDeviceModule createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceModule)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void startPlayout();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void startRecording();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void stopPlayout();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void stopRecording();
    }

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
