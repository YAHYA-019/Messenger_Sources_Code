package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: SocketLock.class */
public final class SocketLock implements Closeable {
    public final LocalSocketAddress mAddr;
    public LocalSocket mSocket;

    public SocketLock(String str) {
        this.mAddr = new LocalSocketAddress(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    public void release() {
        Fs.safeClose(this.mSocket);
        this.mSocket = null;
    }

    public boolean tryAcquire() {
        LocalSocket localSocket = new LocalSocket();
        try {
            try {
                localSocket.bind(this.mAddr);
                this.mSocket = localSocket;
                return true;
            } catch (IOException e) {
                String message = e.getMessage();
                if (message == null || !(message.contains(": EADDRINUSE (") || message.contains(": errno 98 ("))) {
                    throw AnonymousClass001.A0U(e);
                }
                Fs.safeClose(localSocket);
                return false;
            }
        } catch (Throwable th) {
            Fs.safeClose(localSocket);
            throw th;
        }
    }
}
