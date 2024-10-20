package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioPipelineContext.class */
public class AudioPipelineContext {
    public static 2JQ CONVERTER = IR0.A00(7);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMh.A00();
    }

    public AudioPipelineContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioPipelineContext(byte[] bArr, McfReference mcfReference, McfReference mcfReference2, McfReference mcfReference3, McfReference mcfReference4, String str, String str2) {
        this.mNativeHolder = initNativeHolder(bArr, mcfReference, mcfReference2, mcfReference3, mcfReference4, str, str2);
    }

    public static native AudioPipelineContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(byte[] bArr, McfReference mcfReference, McfReference mcfReference2, McfReference mcfReference3, McfReference mcfReference4, String str, String str2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioPipelineContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getAutomosNsModelPath();

    public native McfReference getDolbyVoiceClientAdaptor();

    public native String getFerrarisNsModelPath();

    public native byte[] getNoiseSuppressionMachineLearningModelData();

    public native McfReference getPostProcessAudioBuffer();

    public native McfReference getPreProcessAudioBuffer();

    public native McfReference getRawAudioBuffer();

    public native int hashCode();

    public native String toString();
}
