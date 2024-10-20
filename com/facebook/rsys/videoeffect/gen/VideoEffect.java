package com.facebook.rsys.videoeffect.gen;

import X.2JQ;
import X.N0F;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: VideoEffect.class */
public class VideoEffect {
    public static 2JQ CONVERTER = N6e.A00(70);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        N0F.A00();
    }

    public VideoEffect(long j, int i, int i2, int i3, String str, String str2, String str3, String str4, VideoEffectSaveInfo videoEffectSaveInfo, int i4, VideoEffectAttribution videoEffectAttribution, ArrayList arrayList, String str5, int i5) {
        videoEffectSaveInfo.getClass();
        this.mNativeHolder = initNativeHolder(j, i, i2, i3, str, str2, str3, str4, videoEffectSaveInfo, i4, videoEffectAttribution, arrayList, str5, i5);
    }

    public VideoEffect(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native VideoEffect createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(long j, int i, int i2, int i3, String str, String str2, String str3, String str4, VideoEffectSaveInfo videoEffectSaveInfo, int i4, VideoEffectAttribution videoEffectAttribution, ArrayList arrayList, String str5, int i5);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VideoEffect)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getCryptoHash();

    public native int getDownloadState();

    public native VideoEffectAttribution getEffectAttribution();

    public native long getEffectId();

    public native int getEffectSource();

    public native int getEffectType();

    public native String getExternalName();

    public native String getInternalName();

    public native ArrayList getLicenses();

    public native String getManifestCapabilities();

    public native int getPrivacyRestrictions();

    public native VideoEffectSaveInfo getSaveInfo();

    public native int getServices();

    public native String getThumbnailUri();

    public native int hashCode();

    public native String toString();
}
