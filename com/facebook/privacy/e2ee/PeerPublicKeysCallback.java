package com.facebook.privacy.e2ee;

import java.util.List;

/* loaded from: PeerPublicKeysCallback.class */
public interface PeerPublicKeysCallback {
    void onFailure(Throwable th);

    void onSuccess(List list);
}
