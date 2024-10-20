package X;

/* loaded from: F5r.class */
public final class F5r {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 99468);
    public final C00i A02 = AbH.A0N();
    public final C00i A03 = 1BV.A01((1BY) null, 99467);

    public F5r(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static EQd A00(String str) {
        switch (str.hashCode()) {
            case -1479469166:
                if (str.equals("INSTAGRAM")) {
                    return EQd.A03;
                }
                return EQd.A08;
            case -1373164234:
                if (str.equals("INSTAGRAM_DIRECT")) {
                    return EQd.A04;
                }
                return EQd.A08;
            case -601251396:
                if (str.equals("UNIFIED_THREADS")) {
                    return EQd.A07;
                }
                return EQd.A08;
            case 760001057:
                if (str.equals("UNIFIED_COMMENTS")) {
                    return EQd.A06;
                }
                return EQd.A08;
            case 1279756998:
                if (str.equals("FACEBOOK")) {
                    return EQd.A02;
                }
                return EQd.A08;
            case 1350486771:
                if (str.equals("MESSENGER")) {
                    return EQd.A05;
                }
                return EQd.A08;
            default:
                return EQd.A08;
        }
    }
}
