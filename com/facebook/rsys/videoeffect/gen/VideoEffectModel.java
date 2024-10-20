package com.facebook.rsys.videoeffect.gen;

import X.2JQ;
import X.7zP;
import X.N0F;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: VideoEffectModel.class */
public class VideoEffectModel {
    public static 2JQ CONVERTER = N6e.A00(75);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        N0F.A00();
    }

    public VideoEffectModel(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public VideoEffectModel(ArrayList arrayList, ArrayList arrayList2, VideoEffectInstruction videoEffectInstruction, ArrayList arrayList3, ArrayList arrayList4, boolean z, boolean z2, int i, ArrayList arrayList5, Map map, ArrayList arrayList6, long j, Map map2, Map map3, Long l, Long l2, boolean z3, long j2, VideoEffectRandomPickerModel videoEffectRandomPickerModel, VideoEffectPrivacyModel videoEffectPrivacyModel, ArrayList arrayList7) {
        7zP.A1S(arrayList, arrayList2, arrayList3);
        7zP.A1S(arrayList4, arrayList5, map);
        7zP.A1S(arrayList6, map2, map3);
        arrayList7.getClass();
        this.mNativeHolder = initNativeHolder(arrayList, arrayList2, videoEffectInstruction, arrayList3, arrayList4, z, z2, i, arrayList5, map, arrayList6, j, map2, map3, l, l2, z3, j2, videoEffectRandomPickerModel, videoEffectPrivacyModel, arrayList7);
    }

    public static native VideoEffectModel createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(ArrayList arrayList, ArrayList arrayList2, VideoEffectInstruction videoEffectInstruction, ArrayList arrayList3, ArrayList arrayList4, boolean z, boolean z2, int i, ArrayList arrayList5, Map map, ArrayList arrayList6, long j, Map map2, Map map3, Long l, Long l2, boolean z3, long j2, VideoEffectRandomPickerModel videoEffectRandomPickerModel, VideoEffectPrivacyModel videoEffectPrivacyModel, ArrayList arrayList7);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VideoEffectModel)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native long getActiveCallLayoutEffectId();

    public native ArrayList getAppliedEffectIdxs();

    public native ArrayList getAvailableEffects();

    public native boolean getComposedLayoutNeeded();

    public native boolean getContainsPromoEffects();

    public native VideoEffectInstruction getCurrentEffectInstruction();

    public native int getEffectMode();

    public native ArrayList getEffects();

    public native Map getEffectsTriggers();

    public native boolean getEnableEffectBroadcast();

    public native Long getFailedSelectedEffectId();

    public native ArrayList getInitialEffectIds();

    public native ArrayList getPeerEffects();

    public native ArrayList getPendingFetchEffects();

    public native Map getPendingPeerEffects();

    public native long getPendingSelectingEffectId();

    public native VideoEffectPrivacyModel getPrivacyModel();

    public native VideoEffectRandomPickerModel getRandomEffectPickerModel();

    public native ArrayList getSelectedEffectIdxs();

    public native Long getSelectedGradientIdx();

    public native Map getVariantModels();

    public native int hashCode();

    public native String toString();
}
