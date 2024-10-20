package com.facebook.wearable.common.comms.hera.host.rsys;

import X.04S;
import X.11T;
import X.2aI;
import X.4dB;
import X.4dC;
import X.4dH;
import X.AnonymousClass001;
import X.C00q;
import X.C0Bd;
import X.Gyi;
import X.JDZ;
import X.JDe;
import X.JDf;
import X.JOP;
import X.QV6;
import X.QV7;
import X.RSd;
import X.RVq;
import X.S3d;
import X.SCP;
import android.opengl.EGLContext;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: HeraRsysVideoBridge.class */
public final class HeraRsysVideoBridge implements IHeraVideoBridge {
    public final JDe cameraProxy;
    public final JOP eglBase;
    public QV7 peerFrameInput;
    public final 4dH peerFrameInputMutex;
    public JDZ peerFrameSink;
    public final JDf peerVideoProxy;
    public final Object sharedEglContext;

    /* renamed from: com.facebook.wearable.common.comms.hera.host.rsys.HeraRsysVideoBridge$1, reason: invalid class name */
    /* loaded from: HeraRsysVideoBridge$1.class */
    public final class AnonymousClass1 extends C00q implements C0Bd {
        public AnonymousClass1() {
            super(3);
        }

        @Override // X.C0Bd
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RSd) obj, obj2, AnonymousClass001.A03(obj3));
            return 04S.A00;
        }

        public final void invoke(RSd rSd, Object obj, int i) {
            int i2;
            11T.A0F(rSd, 0);
            4dC r0 = HeraRsysVideoBridge.this.peerFrameInputMutex;
            while (true) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 4dC.A02;
                int i3 = atomicIntegerFieldUpdater.get(r0);
                int i4 = r0.A00;
                if (i3 > i4) {
                    do {
                        i2 = atomicIntegerFieldUpdater.get(r0);
                        if (i2 > i4) {
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(r0, i2, i4));
                } else {
                    if (i3 <= 0) {
                        return;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(r0, i3, i3 - 1)) {
                        4dB.A01.set(r0, null);
                        QV6 qv6 = HeraRsysVideoBridge.this.peerFrameInput;
                        if (qv6 != null) {
                            QV6 qv62 = qv6;
                            rSd.A01.retain();
                            qv62.A03.A04.A02().post(new SCP(rSd, qv62));
                        }
                        HeraRsysVideoBridge.this.peerFrameInputMutex.D5h((Object) null);
                        return;
                    }
                }
            }
        }
    }

    public HeraRsysVideoBridge(JDf jDf, JDe jDe) {
        11T.A0F(jDf, 1);
        this.peerVideoProxy = jDf;
        this.cameraProxy = jDe;
        int[] iArr = JOP.A01;
        RVq rVq = RVq.$redex_init_class;
        S3d s3d = new S3d((EGLContext) null, iArr);
        this.eglBase = s3d;
        this.sharedEglContext = s3d.A02();
        this.peerFrameInputMutex = new 4dB();
        ((Gyi) jDf).A00 = new AnonymousClass1();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #0 {all -> 0x00dd, blocks: (B:12:0x00ae, B:15:0x00ba, B:17:0x00c3, B:18:0x00c9, B:19:0x00cd, B:19:0x00cd), top: B:11:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object deinitPeerVideoProxy(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.host.rsys.HeraRsysVideoBridge.deinitPeerVideoProxy(X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge
    public Object getSharedEglContext() {
        return this.sharedEglContext;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge
    public void initCameraProxy(Object obj, 2aI r303) {
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0116 A[Catch: all -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01cb, blocks: (B:35:0x00fa, B:37:0x0100, B:38:0x0104, B:40:0x010d, B:43:0x0116, B:46:0x0126, B:49:0x0132, B:52:0x013e, B:54:0x0147, B:55:0x014e, B:56:0x0155, B:57:0x015b, B:59:0x0163, B:61:0x016e, B:63:0x0178, B:65:0x018a), top: B:34:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126 A[Catch: all -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01cb, blocks: (B:35:0x00fa, B:37:0x0100, B:38:0x0104, B:40:0x010d, B:43:0x0116, B:46:0x0126, B:49:0x0132, B:52:0x013e, B:54:0x0147, B:55:0x014e, B:56:0x0155, B:57:0x015b, B:59:0x0163, B:61:0x016e, B:63:0x0178, B:65:0x018a), top: B:34:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object maybeInitPeerVideoProxy(java.lang.Object r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.host.rsys.HeraRsysVideoBridge.maybeInitPeerVideoProxy(java.lang.Object, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object release(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.host.rsys.HeraRsysVideoBridge.release(X.0DR):java.lang.Object");
    }
}
