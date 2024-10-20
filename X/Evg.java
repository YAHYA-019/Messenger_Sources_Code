package X;

import android.content.Context;

/* loaded from: Evg.class */
public final class Evg {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final GGe A03;
    public final C01i A04;
    public final C01i A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;
    public final C01i A0A;
    public final C01i A0B;
    public final C01i A0C;
    public final C01i A0D;
    public final C01i A0E;

    public Evg(Context context) {
        this.A00 = context;
        C03i c03i = C03i.A03;
        this.A0E = C01g.A00(c03i, G9t.A00);
        this.A01 = 1Bq.A00(83603);
        this.A0A = C01g.A00(c03i, new AQU(this, 48));
        this.A02 = 1BK.A0C();
        this.A09 = C01g.A00(c03i, G9r.A00);
        this.A05 = C01g.A00(c03i, G9p.A00);
        this.A0B = C01g.A00(c03i, new AQU(this, 49));
        this.A08 = C01g.A00(c03i, new AQU(this, 47));
        this.A04 = C01g.A00(c03i, new AQU(this, 45));
        this.A06 = C01g.A00(c03i, G9q.A00);
        this.A07 = C01g.A00(c03i, new AQU(this, 46));
        this.A0C = C01g.A00(c03i, G9s.A00);
        this.A0D = C01g.A00(c03i, new M3L(this, 0));
        1Br.A0B(this.A01);
        this.A03 = new Fsf();
    }

    public void A00() {
        CN2 cn2;
        C01i c01i = this.A0B;
        if (!c01i.isInitialized() || (cn2 = (CN2) c01i.getValue()) == null) {
            return;
        }
        cn2.A00.close();
    }
}
