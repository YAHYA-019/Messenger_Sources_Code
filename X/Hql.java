package X;

import android.content.Context;

/* loaded from: Hql.class */
public final class Hql {
    public float A00;
    public H9X A01;
    public QUp A02;
    public GRD A03;
    public GRD A04;
    public 6TI A05;
    public 6U2 A06;
    public 6U2 A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final long A0B;
    public final 1De A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final IqB A0I;
    public final IqC A0J;
    public final 1CO A0K;
    public final IY8 A0L;
    public final Context A0M;

    public Hql(1De r302) {
        this.A0C = r302;
        1BY r0 = r302.A00;
        this.A0H = 1Bu.A03(r0, 16428);
        this.A0E = 1Bu.A03(r0, 115741);
        1CO A0j = GOp.A0j();
        this.A0K = A0j;
        this.A00 = 1.7777778f;
        this.A01 = H9X.A03;
        this.A0F = 1Bu.A03(r0, 16430);
        this.A0G = 1Bu.A03(r0, 115401);
        Context A0I = 7zQ.A0I(r0);
        this.A0M = A0I;
        this.A0D = 1HG.A00(A0I, 100191);
        this.A0B = A0j.Auy(36595865848777554L);
        this.A0L = IY8.A01(this, 3);
        this.A0I = new IqB(this);
        this.A0J = new IqC(this);
    }

    public void A00() {
        String str;
        DKE.A0K(this.A0F).removeCallbacks(this.A0I);
        6U2 r0 = this.A07;
        if (r0 == null) {
            str = "hostRichVideoPlayerEventBus";
        } else {
            H9X h9x = H9X.A03;
            r0.A06(new H2Q(h9x, this.A01));
            6U2 r02 = this.A06;
            if (r02 != null) {
                r02.A06(new H2Q(h9x, this.A01));
                this.A02 = null;
                this.A01 = h9x;
                return;
            }
            str = "adRichVideoPlayerEventBus";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
