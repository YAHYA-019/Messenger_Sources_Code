package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.android.exoplayer2.util.Util;

/* loaded from: La9.class */
public final class La9 implements 6XG {
    public int A00;
    public boolean A01;
    public final 6XC A02;

    public La9() {
        6XC r0 = new 6XC();
        0Pz.A0j("bufferForPlaybackMs", " cannot be less than ", ConstantsKt.CAMERA_ID_FRONT);
        0Pz.A0j("bufferForPlaybackAfterRebufferMs", " cannot be less than ", ConstantsKt.CAMERA_ID_FRONT);
        0Pz.A0j("minBufferMs", " cannot be less than ", "bufferForPlaybackMs");
        0Pz.A0j("minBufferMs", " cannot be less than ", "bufferForPlaybackAfterRebufferMs");
        0Pz.A0j("maxBufferMs", " cannot be less than ", "minBufferMs");
        0Pz.A0j("backBufferDurationMs", " cannot be less than ", ConstantsKt.CAMERA_ID_FRONT);
        this.A02 = r0;
        this.A00 = 13107200;
    }

    public 6XD AWO() {
        return this.A02;
    }

    public long AYS() {
        return 0L;
    }

    public void CDX() {
        this.A00 = 13107200;
        this.A01 = false;
    }

    public void CGC() {
        this.A00 = 13107200;
        this.A01 = false;
        this.A02.A00();
    }

    public void CNp() {
        this.A00 = 13107200;
        this.A01 = false;
        this.A02.A00();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0031. Please report as an issue. */
    public void CRT(6YO r302, 6W8[] r303, 6Y9[] r304) {
        int i = 0;
        for (int i2 = 0; i2 < r303.length; i2++) {
            if (r304[i2] != null) {
                int i3 = 131072;
                switch (r303[i2].BGm()) {
                    case -2:
                        i3 = 0;
                        i += i3;
                        break;
                    case -1:
                    default:
                        throw JQx.A0n();
                    case 0:
                        i3 = 144310272;
                        i += i3;
                        break;
                    case 1:
                        i3 = 13107200;
                        i += i3;
                        break;
                    case 2:
                        i3 = 131072000;
                        i += i3;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i += i3;
                        break;
                }
            }
        }
        int max = Math.max(13107200, i);
        this.A00 = max;
        this.A02.A01(max);
    }

    public boolean CiS() {
        return false;
    }

    public void CoG(long j, long j2) {
        throw 0Q8.createAndThrow();
    }

    public void CsO(long j) {
    }

    public /* synthetic */ boolean CxP(Klf klf) {
        return CxQ(klf.A00, klf.A02, klf.A01, klf.A05);
    }

    public boolean CxQ(float f, long j, long j2, boolean z) {
        boolean z2 = true;
        boolean A1U = AbJ.A1U(this.A02.BGU(), this.A00);
        long j3 = 50000000;
        if (f > 1.0f) {
            j3 = Math.min(Util.A08(f, 50000000L), 50000000L);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (A1U) {
                z2 = false;
            }
            this.A01 = z2;
            if (!z2 && j2 < 500000) {
                5My.A04("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= 50000000 || A1U) {
            this.A01 = false;
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (r301.A02.BGU() >= r301.A00) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cyr(float r302, long r303, long r305, boolean r307, boolean r308) {
        /*
            r301 = this;
            r0 = r302
            r1 = r303
            long r0 = com.google.android.exoplayer2.util.Util.A09(r0, r1)
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L70
            r0 = 5000000(0x4c4b40, double:2.470328E-317)
            r311 = r0
        L11:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r313 = r0
            r0 = r305
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = r315
            if (r0 == 0) goto L36
            r0 = 2
            long r0 = (long) r0
            r313 = r0
            r0 = r305
            r1 = r313
            long r0 = r0 / r1
            r305 = r0
            r0 = r305
            r1 = r311
            long r0 = java.lang.Math.min(r0, r1)
            r311 = r0
        L36:
            r0 = 0
            r313 = r0
            r0 = r311
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = r315
            if (r0 <= 0) goto L6a
            r0 = r309
            r1 = r311
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = r315
            if (r0 >= 0) goto L6a
            r0 = r301
            X.6XC r0 = r0.A02
            int r0 = r0.BGU()
            r316 = r0
            r0 = r301
            int r0 = r0.A00
            r317 = r0
            r0 = 0
            r315 = r0
            r0 = r316
            r1 = r317
            if (r0 < r1) goto L6d
        L6a:
            r0 = 1
            r315 = r0
        L6d:
            r0 = r315
            return r0
        L70:
            r0 = 2500000(0x2625a0, double:1.235164E-317)
            r311 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.La9.Cyr(float, long, long, boolean, boolean):boolean");
    }
}
