package X;

import android.content.Context;

/* loaded from: Fy9.class */
public final class Fy9 implements GOh {
    public static final Fy6 A01;
    public static final Fy6 A02;
    public static final Fy6 A03;
    public static final Fy6 A04;
    public final GJA A00;

    static {
        EM5 em5 = EM5.A09;
        A02 = new Fy6(MfW.A1r, em5);
        MfW mfW = MfW.A2B;
        A03 = new Fy6(mfW, em5);
        A04 = new Fy6(mfW, EM5.A07);
        A01 = new Fy6(MfW.A1Y, em5);
    }

    public Fy9(GJA gja) {
        this.A00 = gja;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        boolean A1W = 1BL.A1W(context, c6tP);
        int A00 = FHT.A00(MfW.A1r, c6tP);
        int A002 = FHT.A00(MfW.A2M, c6tP);
        int A003 = FHT.A00(MfW.A0A, c6tP);
        int A012 = FHT.A01(c6tP, 0S2.A07);
        9cU r0 = new 9cU(A1W ? 1 : 0, A012, FHT.A00(MfW.A0L, c6tP));
        9cU r02 = new 9cU(A1W ? 1 : 0, A012, FHT.A00(MfW.A0M, c6tP));
        Fy6 fy6 = A02;
        Fy6 fy62 = A03;
        Fy6 fy63 = A04;
        Fy6 fy64 = A01;
        Integer num = 0S2.A01;
        return new Ezb(fy6, fy62, fy63, fy64, r0, r02, r02, this.A00, null, 0S2.A00, null, num, num, A1W ? 1 : 0, A00, 4, 4, A1W ? 1 : 0, 4, 4, A1W ? 1 : 0, 10, 60, 16, 10, 16, 10, A1W ? 1 : 0, A002, A002, A003, 12, 12);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Fy9) && 11T.A0O(this.A00, ((Fy9) obj).A00));
    }

    public int hashCode() {
        return 961 + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsTextInputVariant(maxLines=");
        A0k.append(1);
        DKG.A1X(A0k, ", startAddOn=");
        A0k.append(", endAddOn=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
