package X;

/* renamed from: X.1rg, reason: invalid class name */
/* loaded from: 1rg.class */
public abstract class C1rg {
    public static final C1rq A00(1Iw r301) {
        return A01(r301, null, 0);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.1rs, X.1rq] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1LI, X.1rh, X.1rj] */
    public static final C1rq A01(1Iw r301, String str, int i) {
        if (r301 == null) {
            throw 1BK.A0e();
        }
        if (str == null) {
            str = "Row";
        }
        ?? c1rj = new C1rj(str);
        c1rj.A00 = null;
        c1rj.A01 = null;
        c1rj.A02 = null;
        c1rj.A03 = null;
        c1rj.A05 = false;
        c1rj.A04 = null;
        ?? c1rs = new C1rs(c1rj, r301, 0, i);
        c1rs.A00 = c1rj;
        return c1rs;
    }
}
