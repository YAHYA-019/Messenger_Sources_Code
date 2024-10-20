package com.facebook.wearable.datax;

import X.11T;
import X.AnonymousClass001;
import X.C00m;
import X.KLm;
import X.KXd;
import X.Kam;
import X.Kzi;
import X.LAk;
import X.M0s;
import X.R3v;
import X.SGF;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;

/* loaded from: LocalChannel.class */
public final class LocalChannel extends Kam implements Closeable {
    public static final KXd Companion = new Object();

    /* renamed from: native, reason: not valid java name */
    public final SGF f3native;
    public C00m onClosed;
    public Function1 onError;
    public Function1 onReceived;
    public final int service;

    public LocalChannel(Connection connection, int i) {
        11T.A0F(connection, 1);
        this.service = i;
        this.f3native = new SGF(this, new M0s(Companion, 10), allocateNative(connection.getHandle$fbandroid_java_com_facebook_wearable_datax_datax(), i));
    }

    private final native long allocateNative(long j, int i);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final void handleClosed() {
        C00m c00m = this.onClosed;
        if (c00m != null) {
            c00m.invoke();
        }
        R3v.A00();
    }

    private final void handleError(int i) {
        Function1 function1 = this.onError;
        if (function1 != null) {
            function1.invoke(new KLm(new LAk(i)));
        }
    }

    private final void handleReceived(int i, ByteBuffer byteBuffer) {
        Function1 function1 = this.onReceived;
        if (function1 != null) {
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            11T.A0A(asReadOnlyBuffer);
            Kzi kzi = new Kzi(i, asReadOnlyBuffer);
            try {
                function1.invoke(kzi);
            } finally {
                kzi.A00 = null;
            }
        }
    }

    private final native int idNative(long j);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeNative(this.f3native.A00());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (closedNative(r301.f3native.A00()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getClosed() {
        /*
            r301 = this;
            r0 = r301
            X.SGF r0 = r0.f3native
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01
            r302 = r0
            r0 = r302
            long r0 = r0.get()
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L36
            r0 = r301
            X.SGF r0 = r0.f3native
            r302 = r0
            r0 = r302
            long r0 = r0.A00()
            r308 = r0
            r0 = r301
            r1 = r308
            boolean r0 = r0.closedNative(r1)
            r307 = r0
            r0 = 0
            r310 = r0
            r0 = r307
            if (r0 == 0) goto L39
        L36:
            r0 = 1
            r310 = r0
        L39:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.datax.LocalChannel.getClosed():boolean");
    }

    public final int getId() {
        return idNative(this.f3native.A00());
    }

    public final C00m getOnClosed() {
        return this.onClosed;
    }

    public final Function1 getOnError() {
        return this.onError;
    }

    public final Function1 getOnReceived() {
        return this.onReceived;
    }

    public final int getService() {
        return this.service;
    }

    public final void send(Kzi kzi) {
        11T.A0F(kzi, 0);
        ByteBuffer byteBuffer = kzi.A00;
        if (byteBuffer == null) {
            throw AnonymousClass001.A0N("invalid buffer");
        }
        LAk lAk = new LAk(sendNative(this.f3native.A00(), kzi.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
        if (!lAk.equals(LAk.A08)) {
            throw new KLm(lAk);
        }
        byteBuffer.position(byteBuffer.limit());
    }

    public final void setOnClosed(C00m c00m) {
        this.onClosed = c00m;
    }

    public final void setOnError(Function1 function1) {
        this.onError = function1;
    }

    public final void setOnReceived(Function1 function1) {
        this.onReceived = function1;
    }
}
