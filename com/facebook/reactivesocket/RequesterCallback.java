package com.facebook.reactivesocket;

/* loaded from: RequesterCallback.class */
public interface RequesterCallback {
    void onFailure(Throwable th);

    void onNext(String str, String str2);
}
