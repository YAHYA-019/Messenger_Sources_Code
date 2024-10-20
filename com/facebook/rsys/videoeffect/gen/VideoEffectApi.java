package com.facebook.rsys.videoeffect.gen;

import X.2JQ;
import X.N0F;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: VideoEffectApi.class */
public abstract class VideoEffectApi {
    public static 2JQ CONVERTER = N6e.A00(71);

    /* loaded from: VideoEffectApi$CProxy.class */
    public final class CProxy extends VideoEffectApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0F.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native VideoEffectApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoEffectApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void removeVideoEffects(ArrayList arrayList, ArrayList arrayList2);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void selectEffect(long j, int i, boolean z, String str);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void setComposedLayoutNeeded(boolean z);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void setNativeUiPickerSelectedVariant(long j, int i);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void setNativeUiPickerVariantConfiguration(long j, VideoEffectVariantConfiguration videoEffectVariantConfiguration);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void setNativeUiPickerVisibility(long j, boolean z);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void showInstruction(VideoEffectInstruction videoEffectInstruction);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void showInstructionToken(long j, String str);

        @Override // com.facebook.rsys.videoeffect.gen.VideoEffectApi
        public native void toggleEffectMode(int i);
    }

    public abstract void removeVideoEffects(ArrayList arrayList, ArrayList arrayList2);

    public abstract void selectEffect(long j, int i, boolean z, String str);

    public abstract void setComposedLayoutNeeded(boolean z);

    public abstract void setNativeUiPickerSelectedVariant(long j, int i);

    public abstract void setNativeUiPickerVariantConfiguration(long j, VideoEffectVariantConfiguration videoEffectVariantConfiguration);

    public abstract void setNativeUiPickerVisibility(long j, boolean z);

    public abstract void showInstruction(VideoEffectInstruction videoEffectInstruction);

    public abstract void showInstructionToken(long j, String str);

    public abstract void toggleEffectMode(int i);
}
