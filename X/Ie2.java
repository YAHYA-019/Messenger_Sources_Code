package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* loaded from: Ie2.class */
public final class Ie2 implements JLH, JIp {
    public static final float[] A0A = new float[4];
    public static final int[] A0B = new int[18];
    public Long A00;
    public final I1n A02;
    public final Htl A03;
    public final boolean A05;
    public final JGI A06;
    public volatile HzD A08;
    public volatile Boolean A09;
    public volatile J6u A07 = new RuntimeException("Uninitialized exception.");
    public WeakReference A01 = DKD.A11();
    public final Hmo A04 = new Hmo(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.RuntimeException, X.J6u] */
    public Ie2(boolean z, boolean z2) {
        Ie1 ie1 = new Ie1(this);
        this.A06 = ie1;
        this.A05 = z;
        long j = z2 ? 20000L : 10000L;
        Htl htl = new Htl();
        this.A03 = htl;
        htl.A00 = ie1;
        htl.A02(j);
        this.A02 = new I1n();
    }

    @Override // X.JIp
    public void ACQ() {
        this.A03.A00();
    }

    @Override // X.JIp
    public /* bridge */ /* synthetic */ Object B7p() {
        if (this.A09 == null) {
            throw AnonymousClass001.A0N("Photo capture operation hasn't completed yet.");
        }
        if (!this.A09.booleanValue()) {
            throw this.A07;
        }
        HzD hzD = this.A08;
        if (hzD == null || (hzD.A04 == null && hzD.A01 == null)) {
            throw AnonymousClass001.A0N("Photo capture data is null.");
        }
        return hzD;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x00d3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public void BnE(X.JLt r302, X.Hmp r303) {
        /*
            r301 = this;
            X.I8m r0 = X.I8m.A00()
            r304 = r0
            r0 = r304
            long r0 = r0.A03
            r305 = r0
            r0 = 6
            r307 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            X.I8m.A01(r0, r1, r2)
            r0 = r301
            X.I1n r0 = r0.A02
            r308 = r0
            r0 = r308
            r1 = r303
            X.I41 r0 = r0.A01(r1)
            r304 = r0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch: java.lang.IllegalArgumentException -> Lcf
            r308 = r0
            r0 = r303
            r1 = r308
            java.lang.Object r0 = r0.A00(r1)     // Catch: java.lang.IllegalArgumentException -> Lcf
            r308 = r0
            r0 = r308
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch: java.lang.IllegalArgumentException -> Lcf
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L56
            float[] r0 = X.Ie2.A0A     // Catch: java.lang.IllegalArgumentException -> Lcf
            r309 = r0
            r0 = r308
            r1 = r309
            r2 = 0
            r0.copyTo(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Lcf
            X.HX8 r0 = X.I41.A0H     // Catch: java.lang.IllegalArgumentException -> Lcf java.lang.IllegalArgumentException -> Lcf
            r308 = r0
            r0 = r304
            r1 = r308
            r2 = r309
            r0.A01(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Lcf
        L56:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch: java.lang.IllegalArgumentException -> Lcf java.lang.IllegalArgumentException -> Ld3
            r308 = r0
            r0 = r303
            r1 = r308
            java.lang.Object r0 = r0.A00(r1)     // Catch: java.lang.IllegalArgumentException -> Ld3
            r308 = r0
            r0 = r308
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch: java.lang.IllegalArgumentException -> Ld3
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L89
            int[] r0 = X.Ie2.A0B     // Catch: java.lang.IllegalArgumentException -> Ld3
            r309 = r0
            r0 = r308
            r1 = r309
            r2 = 0
            r0.copyElements(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Ld3
            X.HX8 r0 = X.I41.A0I     // Catch: java.lang.IllegalArgumentException -> Ld3 java.lang.IllegalArgumentException -> Ld3
            r308 = r0
            r0 = r304
            r1 = r308
            r2 = r309
            r0.A01(r1, r2)     // Catch: java.lang.IllegalArgumentException -> Ld3
        L89:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME     // Catch: java.lang.IllegalArgumentException -> Ld3
            r308 = r0
            r0 = r303
            r1 = r308
            java.lang.Object r0 = r0.A00(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A00 = r1
            r0 = r301
            boolean r0 = r0.A05
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lce
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r309 = r0
            r0 = r301
            java.lang.Boolean r0 = r0.A09
            r308 = r0
            r0 = r309
            r1 = r308
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lce
            r0 = r301
            X.Htl r0 = r0.A03
            r308 = r0
            r0 = r308
            r0.A01()
        Lce:
            return
        Lcf:
            goto L56
        Ld3:
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ie2.BnE(X.JLt, X.Hmp):void");
    }

    public void BnJ(JLt jLt, HX4 hx4) {
        this.A01.clear();
    }

    public void BnT(CaptureRequest captureRequest, JLt jLt, long j, long j2) {
        I8m.A00().A03 = SystemClock.elapsedRealtime();
    }

    public void C5R(int i) {
        WeakReference weakReference = this.A01;
        weakReference.get();
        if (i == 100) {
            weakReference.clear();
        }
    }
}
