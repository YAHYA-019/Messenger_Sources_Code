package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.6ai, reason: invalid class name */
/* loaded from: 6ai.class */
public final class C6ai implements C6aj {
    public final int A00;
    public final int A01;
    public final 6aO A02;

    public C6ai(6Yl r302, 6aX r303) {
        6aO r0 = r303.A00;
        this.A02 = r0;
        r0.A0P(12);
        int A09 = r0.A09();
        if ("audio/raw".equals(r302.A0W)) {
            int A03 = Util.A03(r302.A0C, r302.A06);
            if (A09 == 0 || A09 % A03 != 0) {
                5My.A04("AtomParsers", 0Pz.A0C(A03, A09, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                A09 = A03;
            }
            this.A00 = A09;
            this.A01 = r0.A09();
        }
        if (A09 == 0) {
            A09 = -1;
        }
        this.A00 = A09;
        this.A01 = r0.A09();
    }

    @Override // X.C6aj
    public int Ame() {
        return this.A00;
    }

    @Override // X.C6aj
    public int B8Y() {
        return this.A01;
    }

    @Override // X.C6aj
    public int Cb5() {
        int i = this.A00;
        if (i == -1) {
            i = this.A02.A09();
        }
        return i;
    }
}
