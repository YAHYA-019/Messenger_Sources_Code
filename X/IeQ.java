package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.io.File;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: IeQ.class */
public final class IeQ implements JNk {
    public static final java.util.Map A0u;
    public static volatile IeQ A0v;
    public static volatile IeQ A0w;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public Matrix A04;
    public Rect A05;
    public CaptureRequest.Builder A06;
    public IEU A07;
    public Gul A08;
    public Gum A09;
    public JOV A0A;
    public JOO A0B;
    public JNx A0C;
    public I1R A0D;
    public IBB A0E;
    public HsF A0F;
    public FutureTask A0G;
    public FutureTask A0H;
    public boolean A0I;
    public IBB A0J;
    public boolean A0K;
    public final int A0L;
    public final CameraManager A0M;
    public final IEC A0Q;
    public final Huf A0R;
    public final I8W A0S;
    public final IEe A0T;
    public final Hsy A0U;
    public final I9G A0Y;
    public final I5y A0Z;
    public final Context A0c;
    public volatile int A0j;
    public volatile CameraDevice A0k;
    public volatile Ie3 A0l;
    public volatile HrO A0m;
    public volatile JNZ A0n;
    public volatile boolean A0o;
    public volatile boolean A0p;
    public volatile boolean A0q;
    public volatile boolean A0r;
    public volatile boolean A0s;
    public volatile boolean A0t;
    public final I4V A0W = I4V.A00();
    public final I4V A0X = I4V.A00();
    public final I4V A0V = I4V.A00();
    public final Gug A0P = new Htl();
    public final Object A0a = AnonymousClass001.A0R();
    public final HWv A0N = new HWv(this);
    public final HWw A0O = new HWw(this);
    public final HWx A0e = new HWx(this);
    public final HWy A0f = new HWy(this);
    public final HWz A0g = new HWz(this);
    public final HX0 A0h = new HX0(this);
    public final JKL A0d = new Ids(this);
    public final HX1 A0i = new HX1(this);
    public final Callable A0b = new J5U(this, 24);

    static {
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u = A0u2;
        Integer A0k = 4YU.A0k();
        A0u2.put(A0k, A0k);
        AnonymousClass001.A1A(7zN.A0i(), A0u2, 90);
        AnonymousClass001.A1A(2, A0u2, 180);
        AnonymousClass001.A1A(AbG.A11(), A0u2, 270);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Htl, X.Gug] */
    public IeQ(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A0c = applicationContext;
        I5y i5y = new I5y();
        this.A0Z = i5y;
        I9G i9g = new I9G(i5y);
        this.A0Y = i9g;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        this.A0M = cameraManager;
        IEC iec = new IEC(applicationContext.getPackageManager(), cameraManager, i9g, i5y);
        this.A0Q = iec;
        this.A0S = new I8W(i9g, i5y);
        this.A0U = new Hsy(iec, i5y);
        this.A0L = Math.round(TypedValue.applyDimension(1, 30.0f, 7zO.A0I(context)));
        this.A0R = new Huf(i5y);
        this.A0T = new IEe(i5y);
    }

    private int A00() {
        Number number = (Number) 7zN.A0r(A0u, this.A01);
        if (number != null) {
            return ((this.A02 - number.intValue()) + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        }
        throw 0Pz.A04("Invalid display rotation value: ", this.A01);
    }

    public static void A01(IeQ ieQ) {
        ieQ.A0Z.A06("Method closeCamera() must run on the Optic Background Thread.");
        Hsy hsy = ieQ.A0U;
        if (hsy.A0D && (!ieQ.A0t || hsy.A0C)) {
            hsy.A00();
        }
        A07(ieQ, false);
        Huf huf = ieQ.A0R;
        huf.A0A.A02(false, "Failed to release PreviewController.");
        huf.A03 = null;
        huf.A01 = null;
        huf.A00 = null;
        huf.A07 = null;
        huf.A06 = null;
        huf.A05 = null;
        huf.A04 = null;
        huf.A02 = null;
        I8W i8w = ieQ.A0S;
        i8w.A0C.A02(false, "Failed to release PhotoCaptureController.");
        i8w.A00 = null;
        i8w.A07 = null;
        i8w.A05 = null;
        i8w.A03 = null;
        i8w.A04 = null;
        i8w.A02 = null;
        i8w.A01 = null;
        i8w.A06 = null;
        JMF jmf = i8w.A08;
        if (jmf != null) {
            jmf.release();
            i8w.A08 = null;
        }
        JMF jmf2 = i8w.A09;
        if (jmf2 != null) {
            jmf2.release();
            i8w.A09 = null;
        }
        JMF jmf3 = i8w.A0A;
        if (jmf3 != null) {
            jmf3.release();
            i8w.A0A = null;
        }
        hsy.A09.A02(false, "Failed to release VideoCaptureController.");
        hsy.A0B = null;
        hsy.A05 = null;
        hsy.A03 = null;
        hsy.A04 = null;
        hsy.A02 = null;
        hsy.A01 = null;
        if (ieQ.A0k != null) {
            Gug gug = ieQ.A0P;
            gug.A00 = ieQ.A0k.getId();
            gug.A02(0L);
            CameraDevice cameraDevice = ieQ.A0k;
            0Rx r0 = 0Rx.$redex_init_class;
            cameraDevice.close();
            if (0Es.A03()) {
                0Es.A00(cameraDevice);
            }
            gug.A00();
        }
        ieQ.A0T.A0Q.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.IeQ r301) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.A02(X.IeQ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x014d, code lost:
    
        if (r0 == 180) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0150, code lost:
    
        r305 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0155, code lost:
    
        r323 = r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d8, code lost:
    
        r305 = r0 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x026b, code lost:
    
        if (r0 == 270) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0222, code lost:
    
        r304 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0226, code lost:
    
        r323 = r304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x026e, code lost:
    
        r304 = r0 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d5, code lost:
    
        if (r0 == 180) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x021f, code lost:
    
        if (r0 == 90) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.IeQ r301) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.A03(X.IeQ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x02ef, code lost:
    
        if (A08(r301) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0319, code lost:
    
        if (r301.A0o != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.IeQ r301, java.lang.Float r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 2087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.A04(X.IeQ, java.lang.Float, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (X.GOq.A1V(X.JOV.A00, r301.A0A) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016a, code lost:
    
        if (X.GOq.A1V(X.JOV.A0M, r0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b0, code lost:
    
        if (X.GOq.A1V(X.JOV.A00, r0) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(X.IeQ r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.A05(X.IeQ, java.lang.String):void");
    }

    public static void A06(final IeQ ieQ, String str, int i) {
        final List list = ieQ.A0V.A00;
        final UUID uuid = ieQ.A0Y.A03;
        HrO hrO = ieQ.A0m;
        if (hrO != null && !hrO.A00.isEmpty()) {
            I9z.A00(new Isv(hrO));
        }
        final J7E j7e = new J7E(i, str);
        ieQ.A0Z.A05(new Runnable() { // from class: X.J26
            public static final String __redex_internal_original_name = "Camera2Device$$ExternalSyntheticLambda12";

            @Override // java.lang.Runnable
            public final void run() {
                IeQ ieQ2 = ieQ;
                List list2 = list;
                J7E j7e2 = j7e;
                UUID uuid2 = uuid;
                int size = list2.size();
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= size) {
                        ieQ2.A0Y.A05(uuid2);
                        ieQ2.ANZ(null);
                        return;
                    } else {
                        ((JG9) list2.get(i3)).BwL(j7e2);
                        i2 = i3 + 1;
                    }
                }
            }
        }, uuid);
    }

    public static void A07(IeQ ieQ, boolean z) {
        final IEe iEe;
        I5y i5y = ieQ.A0Z;
        i5y.A06("Method stopCameraPreview() must run on the Optic Background Thread.");
        synchronized (IEe.A0U) {
            iEe = ieQ.A0T;
            HtV htV = iEe.A0J;
            htV.A02(false, "Failed to release PreviewController.");
            iEe.A0S = false;
            JOO joo = iEe.A0D;
            if (joo != null) {
                joo.release();
                iEe.A0D = null;
            }
            Ie3 ie3 = iEe.A08;
            if (ie3 != null) {
                ie3.A0I = false;
                iEe.A08 = null;
            }
            if (z) {
                try {
                    htV.A01("Method closeCameraSession must be called on Optic Thread.");
                    JLt jLt = iEe.A09;
                    if (jLt == null || !jLt.BSU()) {
                        Iea iea = iEe.A0M;
                        iea.A03 = 3;
                        iea.A01.A02(0L);
                        iEe.A0P.A04("camera_session_abort_capture_on_camera_handler_thread", new J5U(iEe, 29));
                    }
                    Iea iea2 = iEe.A0M;
                    iea2.A03 = 2;
                    iea2.A01.A02(0L);
                    iEe.A0P.A04("camera_session_close_on_camera_handler_thread", new J5U(iEe, 30));
                } catch (Exception unused) {
                }
            }
            if (iEe.A0E != null) {
                iEe.A0E = null;
            }
            Surface surface = iEe.A04;
            if (surface != null) {
                if (iEe.A0G) {
                    surface.release();
                }
                iEe.A04 = null;
            }
            JLt jLt2 = iEe.A09;
            if (jLt2 != null) {
                jLt2.close();
                iEe.A09 = null;
            }
            iEe.A06 = null;
            iEe.A02 = null;
            iEe.A0I = null;
            iEe.A0H = null;
            iEe.A01 = null;
            iEe.A0A = null;
            iEe.A0B = null;
            iEe.A0C = null;
            iEe.A0F = null;
            iEe.A00 = null;
            synchronized (ieQ.A0a) {
                FutureTask futureTask = ieQ.A0H;
                if (futureTask != null) {
                    i5y.A08(futureTask);
                    ieQ.A0H = null;
                }
            }
            ieQ.A0l = null;
            ieQ.A06 = null;
            ieQ.A0J = null;
            ieQ.A0S.A0G = false;
        }
        HrO hrO = iEe.A0R;
        if (hrO != null && !hrO.A00.isEmpty()) {
            I9z.A00(new Iss(hrO));
        }
        if (iEe.A0O.A00.isEmpty()) {
            return;
        }
        I9z.A00(new Runnable() { // from class: X.Isp
            public static final String __redex_internal_original_name = "PreviewController$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                List list = iEe.A0O.A00;
                int size = list.size();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        return;
                    }
                    ((RQC) list.get(i2)).A00();
                    i = i2 + 1;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.BNA() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A08(X.IeQ r301) {
        /*
            r0 = r301
            X.JOO r0 = r0.A0B
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r302
            boolean r0 = r0.BNA()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L1a
        L16:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L1a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.A08(X.IeQ):boolean");
    }

    public void A09(JLJ jlj, I3b i3b) {
        IEe iEe;
        JOV jov = this.A0A;
        int A03 = jov != null ? AnonymousClass001.A03(jov.AUY(JOV.A0K)) : 0;
        I8W i8w = this.A0S;
        CameraManager cameraManager = this.A0M;
        int i = this.A00;
        int i2 = (((this.A0j + 45) / 90) * 90) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        int i3 = this.A00;
        int i4 = this.A02;
        int i5 = i4 + i2;
        if (i3 == 1) {
            i5 = (i4 - i2) + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        }
        int i6 = i5 % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        int A00 = A00();
        Integer valueOf = A03 != 0 ? Integer.valueOf(A03) : null;
        CaptureRequest.Builder builder = this.A06;
        JNx jNx = this.A0C;
        boolean A08 = A08(this);
        Ie3 ie3 = this.A0l;
        if (i8w.A00 == null || (iEe = i8w.A02) == null || !iEe.A0S) {
            i8w.A01(jlj, new RuntimeException("Camera not ready to take photo."));
            return;
        }
        if (i8w.A0G) {
            i8w.A01(jlj, new RuntimeException("Cannot take photo, another capture in progress."));
            return;
        }
        Hsy hsy = i8w.A03;
        hsy.getClass();
        if (hsy.A0D) {
            i8w.A01(jlj, new RuntimeException("Cannot take photo, video recording in progress."));
            return;
        }
        Gul gul = i8w.A05;
        gul.getClass();
        int A0D = GOq.A0D(I82.A0h, gul);
        ID3.A00 = 19;
        ID3.A00(19, A0D, (Object) null);
        i8w.A0G = true;
        Huf huf = i8w.A01;
        huf.getClass();
        huf.A00();
        i8w.A0F.A00(new Gua(jlj, i8w, 5), "take_photo", new J5T(cameraManager, builder, i8w, ie3, jNx, jlj, i3b, valueOf, i, i6, A00, A08));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (X.GOq.A1V(X.JOV.A0E, r301.A0A) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.A0A(java.lang.String):void");
    }

    @Override // X.JNk
    public void A5d(JG9 jg9) {
        this.A0V.A02(jg9);
    }

    @Override // X.JNk
    public void A5t(HWk hWk) {
        if (this.A0m == null) {
            this.A0m = new HrO();
            this.A0T.A0R = this.A0m;
        }
        this.A0m.A00.add(hWk);
    }

    @Override // X.JNk
    public void A6p(JGC jgc) {
        if (jgc == null) {
            throw AnonymousClass001.A0L("Cannot add null OnPreviewFrameListener.");
        }
        JOO joo = this.A0B;
        if (joo != null) {
            boolean z = !A08(this);
            boolean A6A = joo.A6A(jgc);
            if (z && A6A && joo.BWT()) {
                this.A0Z.A07("restart_preview_to_resume_cpu_frames", new J5U(this, 19));
            }
        }
    }

    @Override // X.JNk
    public void A6q(JGD jgd) {
        if (jgd == null) {
            throw AnonymousClass001.A0L("Cannot add null OnPreviewStartedListener.");
        }
        this.A0T.A0N.A02(jgd);
    }

    @Override // X.JNk
    public void A6r(RQC rqc) {
        if (rqc == null) {
            throw AnonymousClass001.A0L("Cannot add null OnPreviewStoppedListener.");
        }
        this.A0T.A0O.A02(rqc);
    }

    @Override // X.JNk
    public void A7k(JGE jge) {
        IEU ieu = this.A07;
        if (ieu != null) {
            ieu.A0F.A02(jge);
        }
    }

    @Override // X.JNk
    public int ADK(int i, int i2) {
        return this.A0Q.A05(i, this.A02, i2);
    }

    @Override // X.JNk
    public void AHX(Hbr hbr, I95 i95, Ht4 ht4, JOV jov, HsF hsF, String str, int i, int i2) {
        ID3.A00 = 9;
        ID3.A00(9, 0, (Object) null);
        this.A0Z.A00(ht4, "connect", new J5G(this, jov, hsF, i, i2, 1));
        ID3.A00(10, 0, (Object) null);
    }

    @Override // X.JNk
    public boolean ANZ(Ht4 ht4) {
        ID3.A00(23, 0, (Object) null);
        UUID uuid = this.A0Y.A03;
        IEe iEe = this.A0T;
        iEe.A0N.A01();
        iEe.A0O.A01();
        JOO joo = this.A0B;
        this.A0B = null;
        if (joo != null) {
            joo.AFc();
        }
        this.A0W.A01();
        this.A0X.A01();
        IEU ieu = this.A07;
        if (ieu != null) {
            ieu.A0F.A01();
        }
        this.A0p = false;
        I5y i5y = this.A0Z;
        i5y.A00(ht4, "disconnect", new J5V(uuid, this, 31));
        i5y.A07("disconnect_guard", new J4s(2));
        return true;
    }

    @Override // X.JNk
    public void ATR(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0L;
        rect.inset(i3, i3);
        this.A0Z.A00(new GuV(this, 12), "focus", new J5V(rect, this, 29));
    }

    @Override // X.JNk
    public int AbA() {
        return this.A00;
    }

    @Override // X.JNk
    public I1R Abc() {
        I1R i1r;
        if (!isConnected() || (i1r = this.A0D) == null) {
            throw new J77("Cannot get camera capabilities");
        }
        return i1r;
    }

    @Override // X.JNk
    public int BA0() {
        return this.A02;
    }

    @Override // X.JNk
    public I82 BAH() {
        Gul gul;
        if (!isConnected() || (gul = this.A08) == null) {
            throw new J77("Cannot get camera settings");
        }
        return gul;
    }

    @Override // X.JNk
    public int BLM() {
        IEU ieu = this.A07;
        if (ieu == null) {
            return -1;
        }
        return ieu.A07();
    }

    @Override // X.JNk
    public void BPC(Matrix matrix, int i, int i2, int i3) {
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        matrix.mapRect(rectF);
        Rect rect = this.A05;
        if (rect == null) {
            rect = (Rect) HwT.A00(this.A0M, this.A0Q.A07(i3)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A00 = A00();
        if (A00 == 90 || A00 == 270) {
            rect.getClass();
            rectF2.set(rect.left, rect.top, rect.bottom, rect.right);
        }
        Matrix A0F = GOn.A0F();
        A0F.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        A0F.postScale(this.A00 == 1 ? -1.0f : 1.0f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A00 / 90);
        Matrix A0F2 = GOn.A0F();
        for (int i4 = 0; i4 < abs; i4++) {
            Matrix A0F3 = GOn.A0F();
            float width = rectF2.width() / 2.0f;
            A0F3.setRotate(-90.0f, width, width);
            A0F3.mapRect(rectF2);
            A0F2.postConcat(A0F3);
        }
        A0F.postConcat(A0F2);
        this.A04 = A0F;
    }

    @Override // X.JNk
    public boolean BSo() {
        return !this.A0R.A0D;
    }

    @Override // X.JNk
    public boolean BV6() {
        return !this.A0T.A0S;
    }

    @Override // X.JNk
    public boolean BVI() {
        return this.A0U.A0D;
    }

    @Override // X.JNk
    public boolean BWX() {
        Hec[] hecArr;
        int length;
        boolean z = false;
        try {
            IEC iec = this.A0Q;
            if (IEC.A04(iec)) {
                length = IEC.A06;
            } else {
                if (iec.A05 != null) {
                    hecArr = iec.A05;
                } else {
                    iec.A01.A06("Number of cameras must be loaded on background thread.");
                    IEC.A02(iec);
                    hecArr = iec.A05;
                    hecArr.getClass();
                }
                length = hecArr.length;
            }
            if (length > 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    @Override // X.JNk
    public void BZH(Ht4 ht4, boolean z, boolean z2, boolean z3) {
        this.A0Z.A00(ht4, "lock_camera_values", new J56(1, this, z2, z));
    }

    @Override // X.JNk
    public boolean BcI(float[] fArr) {
        Matrix matrix = this.A04;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    @Override // X.JNk
    public void BeT(Ht4 ht4, Hqp hqp) {
        this.A0Z.A00(ht4, "modify_settings_on_background_thread", new J5V(hqp, this, 32));
    }

    @Override // X.JNk
    public void Bft() {
    }

    @Override // X.JNk
    public void CAI(int i) {
        if (this.A0K) {
            return;
        }
        this.A0j = i;
        JNZ jnz = this.A0n;
        if (jnz != null) {
            jnz.Btb(this.A0j);
        }
    }

    @Override // X.JNk
    public void CVU(Ht4 ht4, String str, int i) {
        this.A0Z.A00(ht4, "open_camera", new J4z(i, 11, this));
    }

    @Override // X.JNk
    public void CVp(Ht4 ht4, String str, int i) {
        this.A0Z.A00(ht4, 0Pz.A0W("open_concurrent_camera_", i == 0 ? "back" : "front"), new J4z(i, 10, this));
    }

    @Override // X.JNk
    public void CWw(Ht4 ht4) {
    }

    @Override // X.JNk
    public void Cbc(View view, String str) {
        if (this.A0m != null) {
            HrO hrO = this.A0m;
            if (view == null || hrO.A00.isEmpty()) {
                return;
            }
            I9z.A00(new Ixj(view, hrO));
        }
    }

    @Override // X.JNk
    public void CeF(JG9 jg9) {
        this.A0V.A03(jg9);
    }

    @Override // X.JNk
    public void CeP(HWk hWk) {
        if (this.A0m != null) {
            this.A0m.A00.remove(hWk);
            if (7zM.A1b(this.A0m.A00)) {
                return;
            }
            this.A0m = null;
            this.A0T.A0R = null;
        }
    }

    @Override // X.JNk
    public void Cep(JGC jgc) {
        JOO joo = this.A0B;
        if (jgc == null || joo == null || !joo.Cea(jgc) || A08(this) || !joo.BWT()) {
            return;
        }
        synchronized (this.A0a) {
            FutureTask futureTask = this.A0H;
            if (futureTask != null) {
                this.A0Z.A08(futureTask);
            }
            this.A0H = this.A0Z.A02("restart_preview_if_to_stop_cpu_frames", this.A0b, 200L);
        }
    }

    @Override // X.JNk
    public void Ceq(JGD jgd) {
        this.A0T.A0N.A03(jgd);
    }

    @Override // X.JNk
    public void Cmc(int i) {
        Process.setThreadPriority(this.A0Z.A04.getThreadId(), -4);
    }

    @Override // X.JNk
    public void Cov(JGA jga) {
        this.A0R.A02 = jga;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (X.GOq.A1V(X.JOV.A0B, r0) == false) goto L14;
     */
    @Override // X.JNk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CpJ(X.Ht4 r302, boolean r303) {
        /*
            r301 = this;
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r301
            X.I1R r0 = r0.A0D
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L48
            X.HX6 r0 = X.I1R.A0N
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = X.GOp.A1Y(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L48
            r0 = r301
            boolean r0 = r0.A0o
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L48
            r0 = r301
            X.JOV r0 = r0.A0A
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L48
            X.HX5 r0 = X.JOV.A0B
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = X.GOq.A1V(r0, r1)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L4b
        L48:
            r0 = 0
            r307 = r0
        L4b:
            r0 = r301
            X.Gul r0 = r0.A08
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La3
            X.HX7 r0 = X.I82.A0J
            r308 = r0
            r0 = r305
            r1 = r308
            java.lang.Object r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La3
            r0 = r301
            X.Gul r0 = r0.A08
            r305 = r0
            r0 = r308
            r1 = r305
            boolean r0 = X.GOq.A1W(r0, r1)
            r306 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto La3
            X.I4E r0 = new X.I4E
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r307
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r305 = r0
            r0 = r304
            r1 = r308
            r2 = r305
            r0.A02(r1, r2)
            r0 = r304
            X.Hqp r0 = r0.A01()
            r305 = r0
            r0 = r301
            r1 = r302
            r2 = r305
            r0.BeT(r1, r2)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.CpJ(X.Ht4, boolean):void");
    }

    @Override // X.JNk
    public void CpL(int i) {
        Process.setThreadPriority(this.A0Z.A05.getThreadId(), -1);
    }

    @Override // X.JNk
    public void CrA(boolean z) {
        this.A0K = z;
        if (z) {
            this.A0j = 0;
            JNZ jnz = this.A0n;
            if (jnz != null) {
                jnz.Btb(this.A0j);
            }
        }
    }

    @Override // X.JNk
    public void Crx(JGB jgb) {
        this.A0Y.A04(jgb);
    }

    @Override // X.JNk
    public void CtD(Ht4 ht4, int i) {
        this.A01 = i;
        this.A0Z.A00(ht4, "set_rotation", new J5U(this, 21));
    }

    @Override // X.JNk
    public void Cwp(Ht4 ht4, int i) {
        this.A0Z.A00(ht4, "set_zoom_level", new J4z(i, 9, this));
    }

    @Override // X.JNk
    public void Cwq(float f, float f2) {
        this.A0Z.A07("set_zoom_percent", new J5Q(this, f2, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        if (r0 == 180) goto L10;
     */
    @Override // X.JNk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cwx(android.graphics.Matrix r302, int r303, int r304, int r305, int r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IeQ.Cwx(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    @Override // X.JNk
    public void D0q(Ht4 ht4, float f) {
        this.A0Z.A00(null, "smooth_zoom_to", new J5Q(this, f, 2));
    }

    @Override // X.JNk
    public void D19(Ht4 ht4, int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0L;
        rect.inset(i3, i3);
        this.A0Z.A00(ht4, "spot_meter", new J5V(rect, this, 30));
    }

    @Override // X.JNk
    public void D2R(Ht4 ht4, I1h i1h) {
        Hsy hsy;
        File file = (File) i1h.A00(I1h.A02);
        String str = (String) i1h.A00(I1h.A04);
        FileDescriptor fileDescriptor = (FileDescriptor) i1h.A00(I1h.A03);
        boolean equals = Boolean.TRUE.equals(i1h.A00(I1h.A05));
        if (file != null) {
            hsy = this.A0U;
            fileDescriptor = null;
            str = file.getAbsolutePath();
        } else if (str != null) {
            hsy = this.A0U;
            fileDescriptor = null;
        } else {
            if (fileDescriptor == null) {
                return;
            }
            hsy = this.A0U;
            str = null;
        }
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A0j;
        JNZ jnz = this.A0n;
        Hsy hsy2 = hsy;
        hsy2.A01(this.A06, ht4, this.A0d, this.A0i, this.A0l, jnz, fileDescriptor, str, i, i2, i3, equals, A08(this));
    }

    @Override // X.JNk
    public void D2S(Ht4 ht4, File file, File file2) {
        Hsy hsy = this.A0U;
        String absolutePath = file.getAbsolutePath();
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A0j;
        JNZ jnz = this.A0n;
        JKL jkl = this.A0d;
        HX1 hx1 = this.A0i;
        hsy.A01(this.A06, ht4, jkl, hx1, this.A0l, jnz, null, absolutePath, i, i2, i3, false, A08(this));
    }

    @Override // X.JNk
    public void D2T(Ht4 ht4, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2) {
        Hsy hsy = this.A0U;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A0j;
        JNZ jnz = this.A0n;
        JKL jkl = this.A0d;
        HX1 hx1 = this.A0i;
        hsy.A01(this.A06, ht4, jkl, hx1, this.A0l, jnz, fileDescriptor, null, i, i2, i3, false, A08(this));
    }

    @Override // X.JNk
    public void D2U(Ht4 ht4, String str, String str2) {
        Hsy hsy = this.A0U;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A0j;
        JNZ jnz = this.A0n;
        JKL jkl = this.A0d;
        HX1 hx1 = this.A0i;
        hsy.A01(this.A06, ht4, jkl, hx1, this.A0l, jnz, null, str, i, i2, i3, false, A08(this));
    }

    @Override // X.JNk
    public void D30(Ht4 ht4, boolean z) {
        Hsy hsy = this.A0U;
        CaptureRequest.Builder builder = this.A06;
        boolean A08 = A08(this);
        Ie3 ie3 = this.A0l;
        if (!hsy.A0D) {
            ht4.A03(AnonymousClass001.A0N("Not recording video."));
        } else {
            hsy.A0A.A00(ht4, "stop_video_capture", new J5E(builder, hsy, ie3, SystemClock.elapsedRealtime(), z, A08));
        }
    }

    @Override // X.JNk
    public void D3q(Ht4 ht4) {
        int i = this.A00;
        ID3.A00 = 14;
        ID3.A00(14, i, (Object) null);
        this.A0Z.A00(ht4, "switch_camera", new J5U(this, 23));
    }

    @Override // X.JNk
    public void D44(JLJ jlj, I3b i3b) {
        Gul gul = this.A08;
        if (gul != null) {
            HX7 hx7 = I82.A0e;
            Number number = (Number) gul.A05(hx7);
            if (number != null && number.intValue() == 2) {
                I4E i4e = new I4E();
                I4E.A00(hx7, i4e, 1);
                BeT(new GuX(1, jlj, i3b, this), i4e.A01());
                return;
            }
        }
        A09(jlj, i3b);
    }

    @Override // X.JNk
    public void D5j(Ht4 ht4, boolean z, boolean z2, boolean z3) {
        this.A0Z.A00(ht4, "unlock_camera_values", new J56(2, this, z2, z));
    }

    @Override // X.JNk
    public boolean DAD(I95 i95, String str, int i) {
        if (i95 != null) {
            ID3.A01.A02(i95);
        }
        GOp.A1I(5);
        FutureTask futureTask = this.A0G;
        if (futureTask != null) {
            this.A0Z.A08(futureTask);
        }
        this.A0Z.A00(new Gua(i95, this, 4), "warm_camera", new J4z(i, 8, this));
        return true;
    }

    @Override // X.JNk
    public boolean isConnected() {
        if (this.A0k != null) {
            return this.A0r || this.A0s;
        }
        return false;
    }
}
