package com.facebook.wearable.datax;

import X.11T;
import X.AnonymousClass001;
import X.KLm;
import X.KXe;
import X.Kam;
import X.Kzi;
import X.LAk;
import X.M0s;
import X.SGF;
import java.nio.ByteBuffer;

/* loaded from: RemoteChannel.class */
public final class RemoteChannel extends Kam {
    public static final KXe Companion = new Object();

    /* renamed from: native, reason: not valid java name */
    public final SGF f4native;

    public RemoteChannel(long j) {
        this.f4native = new SGF(this, new M0s(Companion, 11), allocateNative(j));
    }

    private final native long allocateNative(long j);

    public static final native void deallocateNative(long j);

    private final native int idNative(long j);

    private final native int sendErrorNative(long j, int i);

    private final native int sendNative(long j, int i, ByteBuffer byteBuffer, int i2, int i3);

    public final int getId() {
        return idNative(this.f4native.A00());
    }

    public final void send(Kzi kzi) {
        11T.A0F(kzi, 0);
        ByteBuffer byteBuffer = kzi.A00;
        if (byteBuffer == null) {
            throw AnonymousClass001.A0N("invalid buffer");
        }
        LAk lAk = new LAk(sendNative(this.f4native.A00(), kzi.A01, byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
        if (!lAk.equals(LAk.A08)) {
            throw new KLm(lAk);
        }
        byteBuffer.position(byteBuffer.limit());
    }

    public final void send(LAk lAk) {
        11T.A0F(lAk, 0);
        LAk lAk2 = new LAk(sendErrorNative(this.f4native.A00(), lAk.A00));
        if (!lAk2.equals(LAk.A08)) {
            throw new KLm(lAk2);
        }
    }
}
