package com.facebook.realtime.requeststream.api;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.facebook.realtime.requeststream.streamref.NativeStream;
import java.util.concurrent.Executor;

/* loaded from: BaseRequestStreamClient.class */
public abstract class BaseRequestStreamClient {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rs-api-jni");
    }

    public BaseRequestStreamClient(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public NativeStream createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, 0, null);
    }

    public NativeStream createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, i, null);
    }

    public NativeStream createStream(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i, StreamOptions streamOptions) {
        return createStreamNative(str, bArr, str2, streamEventHandler, executor, i, streamOptions);
    }

    public native NativeStream createStreamNative(String str, byte[] bArr, String str2, StreamEventHandler streamEventHandler, Executor executor, int i, StreamOptions streamOptions);

    public native void onClientSessionEnded();
}
