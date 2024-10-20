package com.facebook.tigon;

import X.C42M;
import X.C42g;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.ByteBuffer;

/* loaded from: TigonCallbacks.class */
public interface TigonCallbacks {
    void onBody(ByteBuffer byteBuffer);

    void onBodyExperimental(byte[] bArr);

    void onEOM(C42g c42g);

    void onError(TigonError tigonError, C42g c42g);

    void onFirstByteFlushed(long j);

    void onHeaderBytesReceived(long j, long j2);

    void onLastByteAcked(long j, long j2);

    void onResponse(C42M c42m);

    void onStarted(TigonRequest tigonRequest);

    void onUploadProgress(long j, long j2);

    void onWillRetry(TigonError tigonError, C42g c42g);
}
