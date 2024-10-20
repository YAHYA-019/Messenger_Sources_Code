package com.facebook.tigon;

import java.nio.ByteBuffer;

/* loaded from: TigonBodyStream.class */
public interface TigonBodyStream {
    void reportBodyLength(int i);

    void reportError(TigonError tigonError);

    int transferBytes(ByteBuffer byteBuffer, int i);

    int transferBytes(byte[] bArr, int i);

    void writeEOM();
}
