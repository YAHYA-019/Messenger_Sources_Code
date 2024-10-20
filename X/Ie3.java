package X;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* loaded from: Ie3.class */
public final class Ie3 implements JLH, JIp {
    public static int A0K = 16;
    public static int A0L = 400;
    public static long A0M = 30000000;
    public static int A0N;
    public static boolean A0O;
    public static boolean A0P;
    public static final float[] A0Q = new float[4];
    public static final int[] A0R = new int[18];
    public J6u A00;
    public HWx A01;
    public HWz A02;
    public HX0 A03;
    public HX2 A04;
    public JGF A05;
    public JGG A06;
    public JGH A07;
    public I1n A08;
    public JLt A09;
    public Boolean A0A;
    public Integer A0B;
    public boolean A0C;
    public final Htl A0E;
    public final JGI A0F;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile boolean A0J;
    public int A0D = 0;
    public volatile int A0G = 0;

    public Ie3() {
        Idz idz = new Idz(this);
        this.A0F = idz;
        this.A0I = true;
        Htl htl = new Htl();
        this.A0E = htl;
        htl.A00 = idz;
    }

    private void A00(JLt jLt) {
        if (this.A0G != 1) {
            throw AnonymousClass001.A0T("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
        }
        this.A0G = 0;
        this.A0A = true;
        this.A09 = jLt;
        this.A0E.A01();
        JGH jgh = this.A07;
        if (jgh != null) {
            jgh.CDk();
        }
    }

    private void A01(JLt jLt) {
        if (this.A0G != 7) {
            throw AnonymousClass001.A0T("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
        }
        this.A0G = 0;
        this.A0A = AnonymousClass001.A0K();
        this.A09 = jLt;
        this.A0E.A01();
    }

    public static boolean A02(Hmp hmp) {
        Number number = (Number) hmp.A00(CaptureResult.SENSOR_EXPOSURE_TIME);
        Number number2 = (Number) hmp.A00(CaptureResult.SENSOR_SENSITIVITY);
        boolean z = false;
        if (number != null && number2 != null) {
            boolean z2 = A0P;
            long longValue = number.longValue();
            if (z2 ? !(longValue <= A0M * 0.5d || number2.intValue() <= A0L * 0.5d) : !(longValue <= A0M || number2.intValue() <= A0L)) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.JIp
    public void ACQ() {
        this.A0E.A00();
    }

    @Override // X.JIp
    public /* bridge */ /* synthetic */ Object B7p() {
        Boolean bool = this.A0A;
        if (bool == null) {
            throw AnonymousClass001.A0N("Start Preview operation hasn't completed yet.");
        }
        if (bool.booleanValue()) {
            return this.A09;
        }
        throw this.A00;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:39:0x068d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BnE(X.JLt r302, X.Hmp r303) {
        /*
            Method dump skipped, instructions count: 1689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ie3.BnE(X.JLt, X.Hmp):void");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.RuntimeException, X.J6u] */
    public void BnJ(JLt jLt, HX4 hx4) {
        HrO hrO;
        if (this.A0I) {
            if (this.A0G == 1 || this.A0G == 7) {
                this.A0G = 0;
                this.A0A = false;
                this.A00 = new RuntimeException(0Pz.A0T("Failed to start operation. Reason: ", hx4.A00));
                HWx hWx = this.A01;
                if (hWx != null && (hrO = hWx.A00.A0m) != null && !hrO.A00.isEmpty()) {
                    I9z.A00(new Ist(hrO));
                }
                this.A0E.A01();
            }
        }
    }

    public void BnT(CaptureRequest captureRequest, JLt jLt, long j, long j2) {
        if (this.A0I) {
            if (this.A0G == 1) {
                A00(jLt);
            } else if (this.A0G == 7) {
                A01(jLt);
            }
        }
    }

    public void C5R(int i) {
    }
}
