package com.facebook.privacy.e2ee;

import java.util.List;

/* loaded from: PeerPublicKeyDownloader.class */
public interface PeerPublicKeyDownloader {

    /* loaded from: PeerPublicKeyDownloader$Callback.class */
    public interface Callback {
        void onFailure(Throwable th);

        void onSuccess(List list);
    }

    void downloadPeerPublicKeys(Callback callback);
}
