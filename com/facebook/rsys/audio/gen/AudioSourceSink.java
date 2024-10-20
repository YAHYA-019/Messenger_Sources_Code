package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioSourceSink.class */
public abstract class AudioSourceSink {
    public static 2JQ CONVERTER = IR0.A00(10);

    /* loaded from: AudioSourceSink$CProxy.class */
    public final class CProxy extends AudioSourceSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioSourceSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioSourceSink)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioSourceSink
        public native void onEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioSourceSink
        public native void onFrame(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audio.gen.AudioSourceSink
        public native void onPositionUpdate(float f, float f2, float f3);
    }

    public abstract void onEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void onFrame(AudioFrame audioFrame);

    public abstract void onPositionUpdate(float f, float f2, float f3);
}
