package X;

/* loaded from: Drl.class */
public final class Drl extends C1rs {
    public 1Iw A00;
    public Dzk A01;

    public static void A06(Drl drl) {
        Dzk dzk = drl.A01;
        C2ko c2ko = dzk.A0R;
        if (c2ko == null) {
            c2ko = 1LI.A0D(dzk, drl.A00, 270236861);
        }
        Dzk dzk2 = drl.A01;
        dzk2.A0R = c2ko;
        C2ko c2ko2 = dzk2.A0Q;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(dzk2, drl.A00, -1508228149);
        }
        drl.A01.A0Q = c2ko2;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        A06(this);
        A0J();
        return this.A01;
    }
}
