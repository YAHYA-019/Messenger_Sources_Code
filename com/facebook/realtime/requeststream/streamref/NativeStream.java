package com.facebook.realtime.requeststream.streamref;

import X.C0il;
import com.facebook.jni.HybridData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: NativeStream.class */
public class NativeStream {
    public HybridData mHybridData;

    static {
        C0il.A0B("rs-streamref-jni");
    }

    public NativeStream(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void amend(byte[] bArr) {
        nativeAmend(bArr);
    }

    public ListenableFuture amendWithAck(byte[] bArr, String str) {
        return nativeAmendWithAck(bArr, str);
    }

    public void cancel() {
        nativeCancel();
    }

    public native void nativeAmend(byte[] bArr);

    public native ListenableFuture nativeAmendWithAck(byte[] bArr, String str);

    public native void nativeCancel();
}
