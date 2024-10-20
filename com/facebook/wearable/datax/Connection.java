package com.facebook.wearable.datax;

import X.11T;
import X.7zS;
import X.AnonymousClass001;
import X.C0Bd;
import X.KLm;
import X.KXc;
import X.Kam;
import X.Kop;
import X.LAk;
import X.M0s;
import X.R3v;
import X.SGF;
import com.facebook.wearable.datax.util.MessageInfo;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Connection.class */
public final class Connection extends Kam implements Closeable {
    public static final KXc Companion = new Object();

    /* renamed from: native, reason: not valid java name */
    public final SGF f2native;
    public Function1 onRead;
    public C0Bd onWriteError;
    public final Kop receiveFragment;
    public final Function2 writer;

    public Connection(long j) {
        this(Long.valueOf(j), null);
    }

    public Connection(Long l, Function2 function2) {
        this.writer = function2;
        this.f2native = new SGF(this, new M0s(Companion, 9), allocateNative(7zS.A08(l)));
        this.receiveFragment = new Kop(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Connection(Function2 function2) {
        this(null, function2);
        11T.A0F(function2, 1);
    }

    private final native long allocateNative(long j);

    private final native void closeNative(long j);

    private final native boolean closedNative(long j);

    public static final native void deallocateNative(long j);

    private final native MessageInfo getMessageInfoNative(long j, ByteBuffer byteBuffer, int i, int i2, boolean z);

    private final native long handleNative(long j);

    private final void handleRead(MessageInfo messageInfo) {
        Function1 function1 = this.onRead;
        if (function1 != null) {
            function1.invoke(messageInfo);
        }
    }

    private final int handleWrite(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        Function2 function2 = this.writer;
        if (function2 != null) {
            return ((LAk) function2.invoke(byteBuffer, byteBuffer2)).A00;
        }
        throw AnonymousClass001.A0N("invalid connection configuration");
    }

    private final int handleWriteError(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        LAk lAk;
        C0Bd c0Bd = this.onWriteError;
        if (c0Bd != null && (lAk = (LAk) c0Bd.invoke(new LAk(i), byteBuffer, byteBuffer2)) != null) {
            i = lAk.A00;
        }
        return i;
    }

    private final native int interruptCodeNative(long j);

    private final native void interruptNative(long j, int i);

    private final native int mtuNative(long j);

    private final native boolean onReceivedNative(long j, ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int pollReceiveFragmentNative(long j, ByteBuffer byteBuffer, int i);

    private final native void registerServiceNative(long j, long j2);

    private final native void resetNative(long j);

    private final native int versionNative(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeNative(this.f2native.A00());
        R3v.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (closedNative(r301.f2native.A00()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getClosed() {
        /*
            r301 = this;
            r0 = r301
            X.SGF r0 = r0.f2native
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
            X.SGF r0 = r0.f2native
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.datax.Connection.getClosed():boolean");
    }

    public final long getHandle$fbandroid_java_com_facebook_wearable_datax_datax() {
        return handleNative(this.f2native.A00());
    }

    public final MessageInfo getMessageInfo(ByteBuffer byteBuffer, boolean z) {
        11T.A0F(byteBuffer, 0);
        return getMessageInfoNative(this.f2native.A00(), byteBuffer, byteBuffer.remaining(), byteBuffer.position(), z);
    }

    public final int getMtu() {
        return mtuNative(this.f2native.A00());
    }

    public final Function1 getOnRead() {
        return this.onRead;
    }

    public final C0Bd getOnWriteError() {
        return this.onWriteError;
    }

    public final Kop getReceiveFragment() {
        return this.receiveFragment;
    }

    public final int getVersion() {
        return versionNative(this.f2native.A00());
    }

    public final void interruptWithError(LAk lAk) {
        11T.A0F(lAk, 0);
        interruptNative(this.f2native.A00(), lAk.A00);
    }

    public final void onReceived(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A0N("Bytes buffer must be direct");
        }
        if (!onReceivedNative(this.f2native.A00(), byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
            throw new KLm(LAk.A07);
        }
        byteBuffer.position(byteBuffer.limit());
    }

    public final LAk onReceivedWithInterrupt(ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 0);
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A0N("Bytes buffer must be direct");
        }
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        byteBuffer.position(byteBuffer.limit());
        if (!onReceivedNative(this.f2native.A00(), byteBuffer, position, remaining)) {
            throw new KLm(LAk.A07);
        }
        int interruptCodeNative = interruptCodeNative(this.f2native.A00());
        return interruptCodeNative != 0 ? new LAk(interruptCodeNative) : LAk.A08;
    }

    public final LocalChannel openChannel(int i) {
        return new LocalChannel(this, i);
    }

    public final void register(Service service) {
        11T.A0F(service, 0);
        registerServiceNative(this.f2native.A00(), service.getHandle$fbandroid_java_com_facebook_wearable_datax_datax());
    }

    public final void reset() {
        resetNative(this.f2native.A00());
    }

    public final void setOnRead(Function1 function1) {
        this.onRead = function1;
    }

    public final void setOnWriteError(C0Bd c0Bd) {
        this.onWriteError = c0Bd;
    }
}
