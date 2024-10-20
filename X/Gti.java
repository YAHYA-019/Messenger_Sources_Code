package X;

import android.os.Handler;

/* loaded from: Gti.class */
public final class Gti extends GuG implements JPs, JNv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public JPz A04;
    public JPr A05;
    public JPt A06;
    public JQ3 A07;
    public Integer A08;
    public final Handler A09;
    public final JHp A0A;
    public final JHp A0B;
    public final Ied A0C;
    public final JG4 A0D;
    public final JQ8 A0E;
    public final Hnp A0F;
    public final JMQ A0G;

    public Gti(JOW jow) {
        super(jow);
        this.A0D = new Id9(this, 2);
        this.A0A = new INs(this);
        this.A0B = new INt(this);
        HJS hjs = JQ8.A00;
        JOW jow2 = ((GuG) this).A00;
        JQ9 jq9 = null;
        this.A0E = jow2.BRE(hjs) ? (JQ8) jow2.AdD(hjs) : null;
        HJS hjs2 = JQ9.A00;
        jq9 = jow2.BRE(hjs2) ? (JQ9) jow2.AdD(hjs2) : jq9;
        this.A09 = JOW.A00(jow2, JQ7.A00);
        this.A0C = new Ied(this);
        this.A0F = (Hnp) jow2.Adn(JNv.A01);
        this.A0G = new IdI(jq9);
    }

    public void A0A() {
        this.A05 = (JPr) A0B(JPr.A00);
        GuJ guJ = JPt.A00;
        JOW jow = ((GuG) this).A00;
        if (jow.BRD(guJ)) {
            this.A06 = (JPt) A0B(guJ);
        }
        GuJ guJ2 = JQ3.A00;
        if (jow.BRD(guJ2)) {
            JQ3 jq3 = (JQ3) A0B(guJ2);
            this.A07 = jq3;
            jq3.A7V(this.A0D);
            this.A07.CwK(this.A0C);
        } else {
            JMx jMx = this.A06;
            if (jMx != null) {
                ((JQ3) Ic7.A07((Ic7) jMx, guJ2)).CwK(this.A0C);
            }
        }
        GuJ guJ3 = JPz.A01;
        if (jow.BRD(guJ3)) {
            this.A04 = (JPz) A0B(guJ3);
        }
        this.A08 = 0S2.A00;
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JPs.A00;
    }

    @Override // X.JPs
    public void D3u(Integer num) {
        synchronized (this) {
            if (this.A08 != num) {
                JLF AIp = this.A05.AIp(this.A09, this.A0G, num);
                Ied ied = this.A0C;
                JLF jlf = ied.A01;
                if (jlf != null) {
                    jlf.release();
                }
                ied.A01 = AIp;
                this.A08 = num;
            }
        }
    }
}
