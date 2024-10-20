package com.facebook.cameracore.camerasdk.camera;

import X.0Q8;
import X.0S2;
import X.0Sf;
import X.1FX;
import X.1K9;
import X.1Kd;
import X.4YU;
import X.7zN;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.DKD;
import X.GOn;
import X.GOo;
import X.GcP;
import X.Gtz;
import X.H9F;
import X.HAP;
import X.HAQ;
import X.HAZ;
import X.HCB;
import X.HGX;
import X.HMG;
import X.HOG;
import X.HlU;
import X.HoE;
import X.Hqd;
import X.HyQ;
import X.Hz3;
import X.I4V;
import X.I6x;
import X.I7e;
import X.I92;
import X.IAe;
import X.IBO;
import X.IEg;
import X.IEp;
import X.IGm;
import X.IGn;
import X.INJ;
import X.INN;
import X.INV;
import X.INa;
import X.INb;
import X.INd;
import X.INe;
import X.IS8;
import X.IS9;
import X.IvM;
import X.IvN;
import X.Ize;
import X.Izf;
import X.Izg;
import X.J4z;
import X.J5U;
import X.J7B;
import X.JE3;
import X.JE4;
import X.JGA;
import X.JHl;
import X.JJd;
import X.JNO;
import X.JNj;
import X.JOg;
import X.JOi;
import X.JQ9;
import X.RQo;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.util.Log;
import com.facebook.cameracore.camerasdk.fboptic.Camera1Device;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: FbCameraPhysicalDeviceLifecycleWrapperV2.class */
public final class FbCameraPhysicalDeviceLifecycleWrapperV2 implements JNj {
    public JOi A00;
    public Hz3 A01;
    public JE3 A02;
    public I7e A03;
    public HlU A04;
    public boolean A05 = false;
    public final IBO A06;
    public final Camera1Device A07;
    public final HoE A08;
    public volatile boolean A09;

    public FbCameraPhysicalDeviceLifecycleWrapperV2(IBO ibo, Hz3 hz3, Camera1Device camera1Device, HoE hoE) {
        this.A06 = ibo;
        this.A07 = camera1Device;
        this.A01 = hz3;
        this.A08 = hoE;
    }

    public static SettableFuture A00(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd, 1K9 r303, boolean z) {
        1FX A0j = 4YU.A0j();
        if (fbCameraPhysicalDeviceLifecycleWrapperV2.A05) {
            A03(fbCameraPhysicalDeviceLifecycleWrapperV2, jJd);
            A0j.set("camera_switch_interrupted");
        } else {
            if (r303 != null) {
                1Kd.A0E(r303, A0j);
            }
            fbCameraPhysicalDeviceLifecycleWrapperV2.A09 = true;
            HyQ hyQ = new HyQ(HAZ.A02, new INd(0, fbCameraPhysicalDeviceLifecycleWrapperV2, jJd, A0j, z), fbCameraPhysicalDeviceLifecycleWrapperV2.A01.A04);
            IBO ibo = fbCameraPhysicalDeviceLifecycleWrapperV2.A06;
            ibo.A03(new IvM(hyQ, ibo));
            if (fbCameraPhysicalDeviceLifecycleWrapperV2 == I6x.A02) {
                I6x.A01(false);
                return A0j;
            }
        }
        return A0j;
    }

    public static void A01(Rect rect, IEg iEg) {
        IEg.A04(iEg, true);
        JGA jga = iEg.A08;
        if (jga != null) {
            jga.BzD((Point) null, 0S2.A01);
            iEg.A08.BzD(new Point(rect.centerX(), rect.centerY()), 0S2.A00);
        }
    }

    public static void A02(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, Hqd hqd, JJd jJd, boolean z) {
        Hz3 hz3 = fbCameraPhysicalDeviceLifecycleWrapperV2.A01;
        try {
            HyQ hyQ = new HyQ(HAZ.A06, new INd(1, fbCameraPhysicalDeviceLifecycleWrapperV2, hqd, jJd, z), hz3.A04);
            IBO ibo = fbCameraPhysicalDeviceLifecycleWrapperV2.A06;
            ibo.A03(new IvM(hyQ, ibo));
        } catch (Exception e) {
            A07(fbCameraPhysicalDeviceLifecycleWrapperV2, "lifecyclewrapper::startPreview", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    public static void A03(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd) {
        A08(new IvN(fbCameraPhysicalDeviceLifecycleWrapperV2, jJd));
    }

    public static void A04(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd, Throwable th) {
        A08(new Izg(fbCameraPhysicalDeviceLifecycleWrapperV2, jJd, th));
    }

    public static void A05(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd, Throwable th) {
        fbCameraPhysicalDeviceLifecycleWrapperV2.A01.A03.BZg(Gtz.A01(th), "camera_error", "com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2", "high", "logCameraError", null, GOn.A0B(fbCameraPhysicalDeviceLifecycleWrapperV2));
        Hz3.A00(fbCameraPhysicalDeviceLifecycleWrapperV2.A07.A0C.A04(fbCameraPhysicalDeviceLifecycleWrapperV2.A01.A02) ? HAZ.A03 : HAZ.A01, fbCameraPhysicalDeviceLifecycleWrapperV2.A06, fbCameraPhysicalDeviceLifecycleWrapperV2);
        A04(fbCameraPhysicalDeviceLifecycleWrapperV2, jJd, th);
    }

    public static void A06(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd, boolean z) {
        if (jJd instanceof JOi) {
            fbCameraPhysicalDeviceLifecycleWrapperV2.A06.A03(new Ize(fbCameraPhysicalDeviceLifecycleWrapperV2, jJd, z));
        } else {
            A08(new Izf(fbCameraPhysicalDeviceLifecycleWrapperV2, jJd, z));
        }
    }

    public static void A07(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, String str, Throwable th, boolean z) {
        fbCameraPhysicalDeviceLifecycleWrapperV2.A01.A03.BZg(new Gtz(str, th), "camera_error", "com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2", "high", "logCameraError", null, GOn.A0B(fbCameraPhysicalDeviceLifecycleWrapperV2));
        if (z) {
            Throwables.propagate(th);
            throw 0Q8.createAndThrow();
        }
    }

    public static void A08(Runnable runnable) {
        if (DKD.A10() == Thread.currentThread()) {
            runnable.run();
        } else {
            HMG.A00.post(runnable);
        }
    }

    @Override // X.JNj
    public void A5j(JE4 je4) {
        try {
            I4V i4v = this.A07.A0A.A00;
            if (i4v.A00.contains(je4)) {
                return;
            }
            i4v.A02(je4);
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::addFrameCallback", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public SettableFuture AGF(JJd jJd, 1K9 r303, boolean z) {
        if (z) {
            this.A01.A03.BZj("camera_update_requested", "com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2", "SWITCH", null, GOn.A0B(this));
        }
        return A00(this, jJd, r303, z);
    }

    @Override // X.JNj
    public Integer Ab4() {
        try {
            return 0S2.A00;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::getCameraApiLevel", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public JNO Ab5() {
        try {
            return this.A07.A0C.A03;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::getCameraCharacteristics", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public H9F AbB() {
        return this.A01.A02;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v6 ??, still in use, count: 2, list:
          (r304v6 ??) from 0x0020: PHI (r304v1 ??) = (r304v0 ??), (r304v6 ??) binds: [B:6:0x0010, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r304v6 ?? I:X.RQo) from 0x001d: IPUT (r304v6 ?? I:X.RQo), (r0v5 ?? I:X.I92) A[Catch: Exception -> 0x0084] X.I92.A00 X.RQo
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // X.JNj
    public X.RQo Afq() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.cameracore.camerasdk.fboptic.Camera1Device r0 = r0.A07     // Catch: java.lang.Exception -> L84
            r302 = r0
            r0 = r302
            X.I92 r0 = r0.A0C     // Catch: java.lang.Exception -> L84
            r303 = r0
            r0 = r303
            X.RQo r0 = r0.A00     // Catch: java.lang.Exception -> L84
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L20
            X.RQo r0 = new X.RQo     // Catch: java.lang.Exception -> L84
            r304 = r0
            r0 = r304
            r0.<init>()     // Catch: java.lang.Exception -> L84
            r0 = r303
            r1 = r304
            r0.A00 = r1     // Catch: java.lang.Exception -> L84
        L20:
            X.IEg r0 = X.IEg.A0O     // Catch: java.lang.Exception -> L84 java.lang.Exception -> L84
            r302 = r0
            r0 = r302
            X.IEp r0 = r0.A07     // Catch: java.lang.Exception -> L84
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L82
            r0 = r305
            monitor-enter(r0)     // Catch: java.lang.Exception -> L84
            r0 = r305
            java.lang.String r0 = r0.A01     // Catch: java.lang.Throwable -> L7c
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L5f
            r0 = r305
            android.hardware.Camera$Parameters r0 = r0.A00     // Catch: java.lang.Throwable -> L7c
            r302 = r0
            r0 = r302
            r1 = r304
            java.lang.String r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L7c
            r304 = r0
            r0 = r304
            boolean r0 = android.text.TextUtils.isDigitsOnly(r0)     // Catch: java.lang.Throwable -> L7c
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L5f
            r0 = r304
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L7c
            r306 = r0
        L5f:
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Exception -> L84
            r0 = r303
            X.RQo r0 = r0.A00     // Catch: java.lang.Exception -> L84
            r304 = r0
            r0 = r304
            int r0 = r0.A00     // Catch: java.lang.Exception -> L84
            r308 = r0
            r0 = r308
            r1 = r306
            if (r0 == r1) goto L82
            r0 = r304
            r1 = r306
            r0.A00 = r1     // Catch: java.lang.Exception -> L84
            r0 = r304
            return r0
        L7c:
            r302 = move-exception
            r0 = r305
            monitor-exit(r0)     // Catch: java.lang.Exception -> L84
            r0 = r302
            throw r0     // Catch: java.lang.Exception -> L84
        L82:
            r0 = r304
            return r0
        L84:
            r307 = move-exception
            r0 = r301
            java.lang.String r1 = "lifecyclewrapper::getCurrentPreviewSensorExposureSetting"
            r2 = r307
            r3 = 1
            A07(r0, r1, r2, r3)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2.Afq():X.RQo");
    }

    @Override // X.JNj
    public int AgA() {
        try {
            try {
                return IEg.A0O.A05();
            } catch (RuntimeException e) {
                Log.w("com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "Failed to get zoom level", e);
                return 0;
            }
        } catch (Exception e2) {
            A07(this, "lifecyclewrapper::getCurrentZoomLevel", e2, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public int Ahj() {
        try {
            return this.A07.A00;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::getDeviceRotation", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public int B6w() {
        return 0;
    }

    @Override // X.JNj
    public int BA0() {
        try {
            HCB hcb = this.A01.A02 == H9F.FRONT ? HCB.A03 : HCB.A02;
            HCB.A00(hcb);
            Camera.CameraInfo cameraInfo = hcb.mCameraInfo;
            if (cameraInfo == null) {
                cameraInfo = HCB.A00;
            }
            return cameraInfo.orientation;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::getSensorOrientation", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0 != false) goto L22;
     */
    @Override // X.JNj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BR7() {
        /*
            r301 = this;
            X.IEg r0 = X.IEg.A0O     // Catch: java.lang.Exception -> L34
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0C     // Catch: java.lang.Exception -> L34
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L30
            r0 = r302
            X.IEp r0 = r0.A07     // Catch: java.lang.Exception -> L34
            r304 = r0
            r0 = r304
            monitor-enter(r0)     // Catch: java.lang.Exception -> L34
            r0 = r304
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L1f
            r305 = r0
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Exception -> L34
            goto L26
        L1f:
            r306 = move-exception
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Exception -> L34
            r0 = r306
            throw r0     // Catch: java.lang.Exception -> L34
        L26:
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L32
        L30:
            r0 = 1
            r303 = r0
        L32:
            r0 = r303
            return r0
        L34:
            r304 = move-exception
            r0 = r301
            java.lang.String r1 = "lifecyclewrapper::isCameraFocusLocked"
            r2 = r304
            r3 = 1
            A07(r0, r1, r2, r3)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2.BR7():boolean");
    }

    @Override // X.JNj
    public boolean BV4() {
        boolean z = false;
        try {
            if (isOpen()) {
                IEg iEg = IEg.A0O;
                if (iEg.A0K != null) {
                    if (iEg.A0L) {
                        z = true;
                    }
                }
            }
            return z;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::isPreviewShowing", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public boolean BVO() {
        return false;
    }

    @Override // X.JNj
    public void BZI(JHl jHl, RQo rQo) {
        try {
            Camera1Device camera1Device = this.A07;
            H9F h9f = this.A01.A02;
            I92 i92 = camera1Device.A0C;
            if (i92.A04(h9f)) {
                INN inn = new INN(jHl, camera1Device, 1);
                IEg iEg = IEg.A0O;
                IEp iEp = iEg.A07;
                if (iEp != null) {
                    if (rQo != null) {
                        int i = rQo.A00;
                        if (i > 0) {
                            synchronized (iEp) {
                                IEp.A01(iEp);
                                if (iEp.A01 != null) {
                                    ArrayList A06 = iEp.A06();
                                    if (A06 != null && !A06.isEmpty()) {
                                        int i2 = (-1) >>> 1;
                                        int i3 = 0;
                                        Iterator it = A06.iterator();
                                        while (it.hasNext()) {
                                            int A09 = GOn.A09(it.next());
                                            int A05 = GOn.A05(A09, i);
                                            if (A05 < i2) {
                                                i3 = A09;
                                                i2 = A05;
                                            }
                                        }
                                        try {
                                            iEp.A00.set(iEp.A01, (String) 7zN.A0r(iEp.A02, i3));
                                            IEp.A03(iEp);
                                        } catch (Exception e) {
                                            Log.e("CameraFeatures", "Unable to apply iso setting.", e);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    GOo.A1G(new IS8(inn, i92, 1), new J5U(iEg, 1));
                }
            }
        } catch (Exception e2) {
            A07(this, "lifecyclewrapper::lockCameraExposureAndFocus", e2, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void BZJ(JHl jHl) {
        IllegalStateException A0N;
        try {
            Camera1Device camera1Device = this.A07;
            H9F h9f = this.A01.A02;
            I92 i92 = camera1Device.A0C;
            if (i92.A04(h9f)) {
                INN inn = new INN(jHl, camera1Device, 0);
                IEg iEg = IEg.A0O;
                IGm iGm = new IGm(inn, i92);
                if (iEg.A0A()) {
                    iEg.A0K.autoFocus(new IGn(iGm, iEg));
                    return;
                }
                new J7B(iEg, "Failed to lock auto focus.");
            } else {
                A0N = AnonymousClass001.A0N("Unable to lock camera focus when camera is not open.");
            }
            throw A0N;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::lockCameraFocus", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void BeQ(Hqd hqd) {
        String flashMode;
        IBO ibo = this.A06;
        if (ibo.A04(ibo.A01)) {
            return;
        }
        try {
            Camera1Device camera1Device = this.A07;
            Hz3 hz3 = this.A01;
            H9F h9f = hz3.A02;
            I92 i92 = camera1Device.A0C;
            if (!i92.A04(h9f)) {
                Log.w("com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "Cannot call modifyCaptureSettings when the camera is closed.");
                return;
            }
            HAP hap = hqd.A03;
            if (hap != null) {
                camera1Device.A06 = AnonymousClass001.A1W(hap, HAP.A05);
            }
            IEp iEp = IEg.A0O.A07;
            if (iEp != null) {
                HAQ haq = hqd.A04;
                if (haq != null) {
                    I92.A01(i92, haq, iEp);
                }
                if (hap != null) {
                    String A0b = AnonymousClass001.A0b(hap, HOG.A01);
                    if (A0b != null) {
                        synchronized (iEp) {
                            flashMode = iEp.A00.getFlashMode();
                        }
                        if (!A0b.equals(flashMode)) {
                            iEp.A0A(A0b);
                        }
                    }
                }
                Float f = hqd.A08;
                if (f != null) {
                    HGX.A00(iEp, f.floatValue());
                }
                try {
                    iEp.A0E(true);
                } catch (RuntimeException e) {
                    StringBuffer stringBuffer = new StringBuffer("modifyCaptureSettings failure ");
                    stringBuffer.append(hqd.toString());
                    hz3.A03.BZg(new Gtz(e.getMessage() != null ? e.getMessage() : "modifyCaptureSettings failure", e), "camera_error", "FbOpticDeviceController", "high", stringBuffer.toString(), null, GOn.A0B(i92));
                }
            }
        } catch (Exception e2) {
            A07(this, "lifecyclewrapper::modifyCaptureSettings", e2, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void CVQ(JJd jJd) {
        if (I6x.A02 != null) {
            I6x.A00();
            synchronized (I6x.class) {
                if (I6x.A02 != this) {
                    I6x.A02 = this;
                }
            }
        }
        Hz3 hz3 = this.A01;
        try {
            if (this.A05) {
                A03(this, jJd);
                return;
            }
            HyQ hyQ = new HyQ(HAZ.A04, new INa(this, jJd, 2), hz3.A04);
            IBO ibo = this.A06;
            ibo.A03(new IvM(hyQ, ibo));
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::open", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void CVV(Hqd hqd, JJd jJd, I7e i7e) {
        Hqd hqd2 = hqd;
        this.A03 = i7e;
        if (hqd == null) {
            hqd2 = new Hqd(null, null, null, null, null, null, null, null, null, null, null, Collections.emptyMap(), 0.0f, false, false);
        }
        CVQ(new INJ(this, hqd2, jJd, false));
    }

    @Override // X.JNj
    public void CeJ(JE4 je4) {
        try {
            this.A07.A0A.A00.A03(je4);
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::removeFrameCallback", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void Cm9(JOi jOi) {
        this.A00 = jOi;
    }

    @Override // X.JNj
    public void Cmi(I7e i7e) {
        try {
            Camera1Device camera1Device = this.A07;
            camera1Device.A03 = i7e;
            camera1Device.A0C.A01 = i7e;
            camera1Device.A00 = i7e.A06;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::setCameraSettings", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void CoZ(JE3 je3) {
        this.A02 = je3;
    }

    @Override // X.JNj
    public void Cot(int i, int i2, float f, float f2) {
        IllegalStateException A0N;
        String focusMode;
        try {
            Camera1Device camera1Device = this.A07;
            Hz3 hz3 = this.A01;
            H9F h9f = hz3.A02;
            I92 i92 = camera1Device.A0C;
            if (!i92.A04(h9f)) {
                A0N = AnonymousClass001.A0N("Camera is not open");
            } else if (camera1Device.A03 != null) {
                float f3 = f / i;
                float f4 = f2 / i2;
                IEg iEg = IEg.A0O;
                int A00 = IEg.A00(iEg.A05, iEg.A00);
                Matrix A0F = GOn.A0F();
                A0F.setRectToRect(new RectF(0.0f, 0.0f, 1.0f, 1.0f), new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), Matrix.ScaleToFit.FILL);
                A0F.postRotate(-A00);
                float f5 = 1.0f;
                if (h9f == H9F.FRONT) {
                    f5 = -1.0f;
                }
                A0F.postScale(f5, 1.0f);
                float[] fArr = new float[2];
                fArr[0] = f3;
                fArr[1] = f4;
                A0F.mapPoints(fArr);
                Point point = new Point(Math.max(-1000, Math.min(1000, (int) fArr[0])), Math.max(-1000, Math.min(1000, (int) fArr[1])));
                int i3 = point.x;
                int i4 = point.y;
                Rect rect = new Rect(i3, i4, i3, i4);
                float f6 = 0.0f / 0.0f;
                rect.inset(-30, -30);
                if (!i92.A04(h9f)) {
                    A0N = AnonymousClass001.A0N("Camera is not open");
                } else {
                    if (camera1Device.A03 != null) {
                        JQ9 jq9 = hz3.A03;
                        try {
                            IEp iEp = iEg.A07;
                            if (iEp != null && iEp.A0H()) {
                                iEg.A08 = camera1Device.A0D;
                                camera1Device.A07 = true;
                                if (iEg.A0A()) {
                                    ArrayList A0Z = AbstractC2327GOs.A0Z(new Rect(rect));
                                    IEp iEp2 = iEg.A07;
                                    iEp2.A0C(A0Z);
                                    if (!iEg.A0B) {
                                        synchronized (iEp2) {
                                            focusMode = iEp2.A00.getFocusMode();
                                        }
                                        iEg.A0A = focusMode;
                                    }
                                    iEp2.A0B("auto");
                                    A01(rect, iEg);
                                    IEg.A03(iEg, iEp2, rect.centerX(), rect.centerY());
                                }
                            }
                        } catch (RuntimeException e) {
                            Log.w("com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "Failed to set focus point", e);
                            jq9.BZg(new Gtz("setFocusAndMeteringRect: Failed to set focus point", e), "camera_error", "com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "low", "setFocusAndMeteringRect", null, GOn.A0B(camera1Device));
                        }
                        try {
                            IEp iEp3 = iEg.A07;
                            if (iEp3 == null || !iEp3.A0I()) {
                                return;
                            }
                            iEg.A08 = camera1Device.A0D;
                            camera1Device.A07 = true;
                            if (iEg.A0A()) {
                                ArrayList A0Z2 = AbstractC2327GOs.A0Z(new Rect(rect));
                                IEp iEp4 = iEg.A07;
                                iEp4.A0D(A0Z2);
                                A01(rect, iEg);
                                IEg.A03(iEg, iEp4, rect.centerX(), rect.centerY());
                                return;
                            }
                            return;
                        } catch (RuntimeException e2) {
                            Log.w("com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "Failed to set metering point", e2);
                            jq9.BZg(new Gtz("setFocusAndMeteringRect: Failed to set metering point", e2), "camera_error", "com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "low", "setFocusAndMeteringRect", null, GOn.A0B(camera1Device));
                            return;
                        }
                    }
                    A0N = AnonymousClass001.A0N("Camera settings are not set");
                }
            } else {
                A0N = AnonymousClass001.A0N("Camera settings are not set");
            }
            throw A0N;
        } catch (Exception e3) {
            A07(this, "lifecyclewrapper::setFocusAndMeteringPoint", e3, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void CtB(HlU hlU) {
        this.A04 = hlU;
    }

    @Override // X.JNj
    public void Cu7(JHl jHl, int i) {
        try {
            Camera1Device camera1Device = this.A07;
            if (camera1Device.A00 == i) {
                jHl.onSuccess(null);
                return;
            }
            camera1Device.A00 = i;
            I92 i92 = camera1Device.A0C;
            int i2 = (HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH - (i * 90)) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
            IEg iEg = IEg.A0O;
            if (!iEg.A0D) {
                iEg.A01 = i2;
            }
            GOo.A1G(new IS8(new INN(jHl, camera1Device, 4), i92, 0), new J4z(i, 1, iEg));
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::setRotation", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void Cwo(int i) {
        try {
            try {
                IEg iEg = IEg.A0O;
                if (i != iEg.A05()) {
                    iEg.A06(i);
                }
            } catch (RuntimeException e) {
                Log.w("com.facebook.cameracore.camerasdk.fboptic.Camera1Device", "Failed to set zoom level", e);
            }
        } catch (Exception e2) {
            A07(this, "lifecyclewrapper::setZoomLevel", e2, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void D24(Hqd hqd, JJd jJd, boolean z) {
        JQ9 jq9 = this.A01.A03;
        if (z) {
            A02(this, hqd, new INe(1, this, jJd, jq9), true);
        } else {
            A02(this, hqd, jJd, false);
        }
    }

    @Override // X.JNj
    public void D2o() {
        try {
            IEg iEg = IEg.A0O;
            if (iEg.A0K != null) {
                synchronized (iEg.A0H) {
                    if (iEg.A0M) {
                        0Sf.A02(iEg.A0K);
                        iEg.A0M = false;
                    }
                }
            }
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::stopPreview", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void D3p(JJd jJd) {
        JQ9 jq9 = this.A01.A03;
        jq9.BZj("camera_update_requested", "com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2", "SWITCH", null, GOn.A0B(this));
        A00(this, new INb(this, jJd, jq9, this.A07.A00), null, true);
    }

    @Override // X.JNj
    public void D40(Hqd hqd, JOg jOg) {
        Throwable A0L;
        try {
            Camera1Device camera1Device = this.A07;
            Hz3 hz3 = this.A01;
            if (jOg != null) {
                if (!camera1Device.A0C.A04(hz3.A02)) {
                    A0L = AnonymousClass001.A0N("Camera is not open");
                } else if (camera1Device.A03 != null) {
                    IEg iEg = IEg.A0O;
                    if (iEg.A0K != null && iEg.A0L) {
                        if (camera1Device.A07) {
                            camera1Device.A07 = false;
                        }
                        HAP hap = hqd.A03;
                        if (hap != null) {
                            camera1Device.A06 = AnonymousClass001.A1W(hap, HAP.A05);
                        }
                        IAe iAe = hz3.A01;
                        if (!camera1Device.A06 || iAe == null) {
                            Camera1Device.A00(hz3, hqd, jOg, camera1Device);
                            return;
                        } else {
                            iAe.A00 = hqd.A01;
                            iAe.A03(new INV(hz3, hqd, jOg, camera1Device), 2000);
                            return;
                        }
                    }
                    A0L = AnonymousClass001.A0N("Preview is not yet shown");
                } else {
                    A0L = AnonymousClass001.A0N("Camera settings are not set");
                }
            } else {
                A0L = AnonymousClass001.A0L("Taking photo without a callback");
            }
            throw A0L;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::Failed to take photo.", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void D5k(JHl jHl) {
        try {
            Camera1Device camera1Device = this.A07;
            H9F h9f = this.A01.A02;
            I92 i92 = camera1Device.A0C;
            if (!i92.A04(h9f)) {
                throw AnonymousClass001.A0N("Unable to unlock camera exposure and focus when camera is not open.");
            }
            INN inn = new INN(jHl, camera1Device, 2);
            IEg iEg = IEg.A0O;
            IEp iEp = iEg.A07;
            if (iEp != null) {
                iEp.A08();
                GOo.A1G(new IS9(0, inn, i92, iEp), new J5U(iEg, 2));
            }
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::unlockCameraExposureAndFocus", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void D5l(JHl jHl) {
        IllegalStateException A0N;
        try {
            Camera1Device camera1Device = this.A07;
            if (camera1Device.A0C.A04(this.A01.A02)) {
                IEg iEg = IEg.A0O;
                if (iEg.A0A()) {
                    IEg.A02(iEg);
                    iEg.A07.A07();
                    iEg.A0C = false;
                    jHl.onSuccess(null);
                    return;
                }
                new J7B(iEg, "Failed to unlock auto focus.");
            } else {
                A0N = AnonymousClass001.A0N("Unable to unlock camera focus when camera is not open.");
            }
            throw A0N;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::unlockCameraFocus", e, true);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // X.JNj
    public void close() {
        A00(this, GcP.A00, null, false);
    }

    @Override // X.JNj
    public void destroy() {
        A00(this, GcP.A00, null, false);
        this.A05 = true;
    }

    @Override // X.JNj
    public boolean isOpen() {
        boolean z;
        try {
            IBO ibo = this.A06;
            String str = this.A01.A04;
            int ordinal = ibo.A00.ordinal();
            if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                String str2 = ibo.A01;
                if (str2 != null && str2.equals(str) && !IBO.A02(HAZ.A02, ibo, str)) {
                    Camera1Device camera1Device = this.A07;
                    H9F h9f = this.A01.A02;
                    I92 i92 = camera1Device.A0C;
                    if (i92.A04(h9f)) {
                        z = true;
                        if (i92.A03 == null) {
                            A07(this, "lifecyclewrapper::isOpen::null_camera_characteristics", AnonymousClass001.A0Q("Camera characteristics is null."), false);
                            return false;
                        }
                        return z;
                    }
                }
            }
            z = false;
            return z;
        } catch (Exception e) {
            A07(this, "lifecyclewrapper::isOpen", e, true);
            throw 0Q8.createAndThrow();
        }
    }
}
