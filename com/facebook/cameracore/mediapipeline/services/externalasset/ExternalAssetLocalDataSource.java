package com.facebook.cameracore.mediapipeline.services.externalasset;

import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: ExternalAssetLocalDataSource.class */
public interface ExternalAssetLocalDataSource {
    boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2);

    String getStreamingURI(String str, String str2);
}
