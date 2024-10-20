package com.facebook.models;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: UnresolvedModelAssetMetadata.class */
public class UnresolvedModelAssetMetadata {
    public final HybridData mHybridData;

    static {
        C0il.A0B("models-common");
    }

    public UnresolvedModelAssetMetadata(String str, long j, String str2, String str3, String str4, String str5) {
        this(str, j, str2, str3, str4, str5, "");
    }

    public UnresolvedModelAssetMetadata(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        this.mHybridData = initHybrid(str, j, str2, str3, str4, str5, str6);
    }

    public static native HybridData initHybrid(String str, long j, String str2, String str3, String str4, String str5, String str6);

    public void addDeltaCacheEntry(String str, String str2) {
        addDeltaCacheEntryNative(str, str2);
    }

    public native void addDeltaCacheEntryNative(String str, String str2);
}
