package com.facebook.proxygen;

/* loaded from: ByteEventLogger.class */
public interface ByteEventLogger {
    void onBytesReceived(String str, long j);

    void onBytesSent(String str, long j);
}
