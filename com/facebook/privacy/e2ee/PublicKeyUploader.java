package com.facebook.privacy.e2ee;

import X.Qps;

/* loaded from: PublicKeyUploader.class */
public interface PublicKeyUploader {

    /* loaded from: PublicKeyUploader$Callback.class */
    public interface Callback {
        void onFailure(Throwable th);

        void onSuccess();
    }

    void uploadPublicKey(byte[] bArr, PublicKeyType publicKeyType, Qps qps, int i, Callback callback);
}
