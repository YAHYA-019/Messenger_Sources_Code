package com.facebook.cameracore.ardelivery.storage.interfaces;

/* loaded from: StorageCallback.class */
public interface StorageCallback {
    void onCachePutFinish(boolean z);

    void onCachePutStart();

    void onDecryptionFinish(boolean z, String str);

    void onDecryptionOperationFinish();

    void onDecryptionOperationStart();

    void onDecryptionStart();

    void onEncodingFinish(boolean z, String str);

    void onEncodingOperationFinish();

    void onEncodingOperationStart();

    void onEncodingStart();

    void onExtractionFinish(boolean z, String str);

    void onExtractionStart();
}
