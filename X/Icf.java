package X;

import android.os.Handler;

/* loaded from: Icf.class */
public final class Icf implements JLE {
    public Icw A00;
    public Ici A01;
    public boolean A02;
    public boolean A03;
    public final IHB A04;
    public final HZj A05;
    public final HPD A06;
    public final I1d A07;
    public final Ici A08;
    public final boolean A09;

    public Icf(Handler handler, HPD hpd, I1d i1d, boolean z) {
        this.A07 = i1d;
        this.A09 = z;
        this.A06 = hpd;
        HZj hZj = new HZj(this);
        this.A05 = hZj;
        this.A04 = new IHB(handler, hZj, z, z);
        this.A08 = new Ici(i1d);
        this.A01 = new Ici(i1d);
        this.A00 = z ? null : new Icw(i1d, new Gu6(), new Gu5());
    }

    public void AAv(JMu jMu) {
    }

    public void AN3() {
        IHB ihb = this.A04;
        ihb.A0G = false;
        ihb.A08.post(ihb.A0A);
    }

    public void BOo(I9U i9u) {
        11T.A0F(i9u, 0);
        i9u.A03(this.A08);
        i9u.A03(this.A01);
    }

    public void release() {
    }
}
