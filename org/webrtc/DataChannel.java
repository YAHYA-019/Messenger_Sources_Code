package org.webrtc;

/* loaded from: DataChannel.class */
public abstract class DataChannel {

    /* loaded from: DataChannel$Init.class */
    public class Init {
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";
        public int id = -1;
    }

    /* loaded from: DataChannel$Observer.class */
    public interface Observer {
    }

    /* loaded from: DataChannel$State.class */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j);
}
