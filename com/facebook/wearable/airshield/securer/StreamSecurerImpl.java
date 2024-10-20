package com.facebook.wearable.airshield.securer;

import X.11T;
import X.AnonymousClass001;
import X.C0il;
import X.KO0;
import X.KXS;
import X.KXT;
import X.KXU;
import X.MCT;
import X.QqF;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: StreamSecurerImpl.class */
public final class StreamSecurerImpl {
    public static final KXU Companion = new Object();
    public final HybridData mHybridData = initHybrid(this);
    public Function1 onPreambleReady;
    public Function1 onSend;
    public Function2 onStreamClosed;
    public Function2 onStreamReady;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.KXU] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    private final native void closeStreamNative(int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final void handlePreambleReady(Preamble preamble) {
        Function1 function1 = this.onPreambleReady;
        if (function1 == null) {
            throw AnonymousClass001.A0N("onPreambleReady callback is not set");
        }
        function1.invoke(preamble);
    }

    private final int handleSend(ByteBuffer byteBuffer) {
        Function1 function1 = this.onSend;
        if (function1 != null) {
            return AnonymousClass001.A03(function1.invoke(byteBuffer));
        }
        throw AnonymousClass001.A0N("onSend callback is not set");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r308 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        r308 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void handleStreamClosed(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            kotlin.jvm.functions.Function2 r0 = r0.onStreamClosed
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lae
            r0 = r302
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r305 = r0
            X.QqF r0 = X.QqF.A08
            r306 = r0
            r0 = r306
            int r0 = r0.code
            r307 = r0
            r0 = r303
            r1 = r307
            if (r0 <= r1) goto L5c
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r308 = r0
            r0 = r308
            java.lang.String r1 = "Stream error returned an unknown code: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r308
            r1 = r303
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r308
            java.lang.String r1 = ". It may be dataX error: "
            java.lang.StringBuilder r0 = r0.append(r1)
            X.LAk r0 = new X.LAk
            r309 = r0
            r0 = r309
            r1 = r303
            r0.<init>(r1)
            r0 = r309
            r1 = r308
            java.lang.String r0 = X.AnonymousClass001.A0a(r0, r1)
            r308 = r0
            java.lang.String r0 = "StreamError"
            r309 = r0
            r0 = r309
            r1 = r308
            X.0fH.A0n(r0, r1)
        L5c:
            kotlin.enums.EnumEntries r0 = X.QqF.A00
            r309 = r0
            r0 = r309
            java.util.Iterator r0 = r0.iterator()
            r310 = r0
        L6a:
            r0 = r310
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            r0 = r310
            java.lang.Object r0 = r0.next()
            r308 = r0
            r0 = r308
            r309 = r0
            r0 = r308
            X.QqF r0 = (X.QqF) r0
            r309 = r0
            r0 = r309
            int r0 = r0.code
            r307 = r0
            r0 = r307
            r1 = r303
            if (r0 != r1) goto L6a
            r0 = r308
            if (r0 != 0) goto La2
        L9e:
            r0 = r306
            r308 = r0
        La2:
            r0 = r304
            r1 = r305
            r2 = r308
            java.lang.Object r0 = r0.invoke(r1, r2)
            return
        Lae:
            java.lang.String r0 = "onError callback is not set"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.airshield.securer.StreamSecurerImpl.handleStreamClosed(int, int):void");
    }

    private final void handleStreamReady(long j, byte[] bArr) {
        Stream stream = new Stream(j);
        Function2 function2 = this.onStreamReady;
        if (function2 == null) {
            throw AnonymousClass001.A0N("onStreamReady callback is not set");
        }
        function2.invoke(stream, bArr);
    }

    private final native HybridData initHybrid(StreamSecurerImpl streamSecurerImpl);

    private final native long openRelayedStreamNative();

    private final native int receiveDataNative(ByteBuffer byteBuffer, int i, int i2);

    private final native boolean relayEnabledNative();

    private final native void startNative();

    private final native void stopNative();

    public void closeStream(int i, QqF qqF) {
        11T.A0F(qqF, 1);
        closeStreamNative(i, qqF.code);
    }

    public Function1 getOnPreambleReady() {
        return this.onPreambleReady;
    }

    public Function1 getOnSend() {
        return this.onSend;
    }

    public Function2 getOnStreamClosed() {
        return this.onStreamClosed;
    }

    public Function2 getOnStreamReady() {
        return this.onStreamReady;
    }

    public boolean isRelayEnabled() {
        return relayEnabledNative();
    }

    public MCT openRelayStream() {
        if (!relayEnabledNative()) {
            return null;
        }
        KXS kxs = RelayStreamImpl.Companion;
        return new RelayStreamImpl(openRelayedStreamNative());
    }

    public KO0 receiveData(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        byteBuffer.position(byteBuffer.limit());
        return KXT.A00(receiveDataNative(byteBuffer, position, remaining));
    }

    public void setOnPreambleReady(Function1 function1) {
        this.onPreambleReady = function1;
    }

    public void setOnSend(Function1 function1) {
        this.onSend = function1;
    }

    public void setOnStreamClosed(Function2 function2) {
        this.onStreamClosed = function2;
    }

    public void setOnStreamReady(Function2 function2) {
        this.onStreamReady = function2;
    }

    public void start() {
        startNative();
    }

    public void stop() {
        stopNative();
    }
}
