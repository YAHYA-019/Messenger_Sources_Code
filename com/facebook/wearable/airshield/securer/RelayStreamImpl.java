package com.facebook.wearable.airshield.securer;

import X.11T;
import X.C0il;
import X.KXS;
import X.LAk;
import X.MCT;
import X.Qq4;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function2;

/* loaded from: RelayStreamImpl.class */
public final class RelayStreamImpl implements MCT {
    public static final KXS Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native, reason: not valid java name */
    public final long f1native;
    public Function2 onReceived;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.KXS] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public RelayStreamImpl(long j) {
        this.f1native = j;
        this.mHybridData = initHybrid(this, j);
    }

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final void handleReceived(boolean z, ByteBuffer byteBuffer) {
        Function2 function2 = this.onReceived;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(z), byteBuffer);
        }
    }

    private final native HybridData initHybrid(RelayStreamImpl relayStreamImpl, long j);

    private final native int sendCommandNative(int i);

    private final native int sendSpanNative(ByteBuffer byteBuffer, int i, int i2);

    private final byte streamHeader(byte b) {
        return (byte) (((byte) (b & (-64))) | ((byte) streamIdNative()));
    }

    private final native int streamIdNative();

    public boolean flush(LAk lAk) {
        11T.A0F(lAk, 0);
        return flushWithErrorNative(lAk.A00);
    }

    public Function2 getOnReceived() {
        return this.onReceived;
    }

    public int getStreamId() {
        return streamIdNative();
    }

    public int send(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        byteBuffer.put(0, streamHeader(byteBuffer.get(0)));
        return sendSpanNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public int sendCommand(Qq4 qq4) {
        11T.A0F(qq4, 0);
        return sendCommandNative(qq4.code);
    }

    public void sendFromPeer(MCT mct, ByteBuffer byteBuffer) {
        11T.A0H(mct, byteBuffer);
        if (mct.equals(this)) {
            return;
        }
        send(byteBuffer);
    }

    public void setOnReceived(Function2 function2) {
        this.onReceived = function2;
    }
}
