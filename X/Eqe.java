package X;

import java.util.List;

/* loaded from: Eqe.class */
public final class Eqe {
    public final double A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final EM0 A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final C01i A08;
    public final Bbe[] A09;

    public Eqe(EM0 em0, String str, String str2, List list, Bbe[] bbeArr, int i, long j) {
        11T.A0F(em0, 4);
        this.A05 = str;
        this.A06 = str2;
        this.A04 = em0;
        this.A03 = j;
        this.A09 = bbeArr;
        this.A07 = list;
        float f = i;
        this.A01 = 0.01f * f;
        this.A02 = f;
        this.A00 = i;
        this.A08 = C01g.A00(C03i.A02, new DKb(this, 49));
    }
}
