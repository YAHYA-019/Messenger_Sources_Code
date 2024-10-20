package com.facebook.models;

import X.C0il;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: ModelMetadata.class */
public class ModelMetadata {
    public final HybridData mHybridData;

    static {
        C0il.A0B("models-common");
    }

    public ModelMetadata(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native List getAllAssetMetadatasNative();

    private native ModelAssetMetadata getAssetMetadataNative(String str);

    private native String getAssetNative(String str);

    private native String getPropertyNative(String str);

    public List getAllAssetMetadatas() {
        return getAllAssetMetadatasNative();
    }

    public String getAsset(String str) {
        String assetNative = getAssetNative(str);
        if (assetNative.isEmpty()) {
            assetNative = null;
        }
        return assetNative;
    }

    public ModelAssetMetadata getAssetMetadata(String str) {
        return getAssetMetadataNative(str);
    }

    public native long getVersion();
}
