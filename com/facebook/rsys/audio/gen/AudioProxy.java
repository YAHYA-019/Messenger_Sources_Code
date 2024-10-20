package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: AudioProxy.class */
public abstract class AudioProxy {
    public static 2JQ CONVERTER = IR0.A00(8);

    /* loaded from: AudioProxy$CProxy.class */
    public final class CProxy extends AudioProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native AudioProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native ArrayList createAvailableAudioInputRoutes();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native ArrayList createAvailableAudioOutputRoutes();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setApi(AudioApi audioApi);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioOn(boolean z, boolean z2);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setIsCallActive(boolean z);
    }

    public abstract ArrayList createAvailableAudioInputRoutes();

    public abstract ArrayList createAvailableAudioOutputRoutes();

    public abstract void setApi(AudioApi audioApi);

    public abstract void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOn(boolean z, boolean z2);

    public abstract void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2);

    public abstract void setIsCallActive(boolean z);
}
