package X;

/* loaded from: L9r.class */
public final class L9r {
    public int A00;
    public 1Im A01;
    public Exception A02;
    public Integer A03;
    public String A04;
    public String A05;

    public L9r(1Im r302, Integer num, String str, String str2, int i) {
        this.A01 = r302;
        this.A05 = str2;
        this.A03 = num;
        this.A00 = i;
        this.A04 = str;
        this.A02 = null;
    }

    public L9r(KlV klV) {
        this.A01 = klV.A01;
        this.A05 = klV.A05;
        this.A03 = klV.A03;
        this.A00 = klV.A00;
        this.A04 = klV.A04;
        this.A02 = klV.A02;
    }

    public static void A00(C00i c00i, 1Im r302, String str, int i) {
        ((EwL) c00i.get()).A00(new L9r(r302, 0S2.A0u, null, str, -1));
        if (i != 0) {
            ((EwL) c00i.get()).A00(new L9r(r302, 0S2.A1G, null, str, -1));
        }
    }

    public static void A01(1Im r301, EwL ewL, Integer num, String str, String str2) {
        ewL.A00(new L9r(r301, num, str, str2, -1));
    }
}
