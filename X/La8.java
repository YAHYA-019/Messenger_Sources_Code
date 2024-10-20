package X;

import com.google.android.exoplayer2.util.Util;

/* loaded from: La8.class */
public final class La8 implements JTE {
    public long A09 = -9223372036854775807L;
    public long A0B = -9223372036854775807L;
    public long A0A = -9223372036854775807L;
    public long A04 = -9223372036854775807L;
    public float A07 = 0.97f;
    public float A01 = 1.03f;
    public float A00 = 1.0f;
    public long A08 = -9223372036854775807L;
    public long A03 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A06 = -9223372036854775807L;
    public long A05 = -9223372036854775807L;

    private void A00() {
        long j = this.A09;
        if (j != -9223372036854775807L) {
            long j2 = this.A0B;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.A0A;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.A04;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.A03 != j) {
            this.A03 = j;
            this.A02 = j;
            this.A06 = -9223372036854775807L;
            this.A05 = -9223372036854775807L;
            this.A08 = -9223372036854775807L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0200, code lost:
    
        if (r306 > r336) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float AW1(long r302, long r304) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.La8.AW1(long, long):float");
    }

    public long BER() {
        return this.A02;
    }

    public void BgZ() {
        long j = this.A02;
        if (j != -9223372036854775807L) {
            long j2 = j + 500000;
            this.A02 = j2;
            long j3 = this.A04;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.A02 = j3;
            }
            this.A08 = -9223372036854775807L;
        }
    }

    public void Cqm(6Y0 r302) {
        this.A09 = Util.A0B(r302.A04);
        this.A0A = Util.A0B(r302.A03);
        this.A04 = Util.A0B(r302.A02);
        float f = r302.A01;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.A07 = f;
        float f2 = r302.A00;
        float f3 = 1.03f;
        if (f2 != -3.4028235E38f) {
            f3 = f2;
        }
        this.A01 = f3;
        if (f == 1.0f && f3 == 1.0f) {
            this.A09 = -9223372036854775807L;
        }
        A00();
    }

    public void CvD(long j) {
        this.A0B = j;
        A00();
    }
}
