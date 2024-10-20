package X;

/* loaded from: Icg.class */
public final class Icg implements JLE {
    public int A00 = 0;
    public JMu A01;
    public I9U A02;
    public IFJ A03;
    public Gu4 A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public final I1d A09;
    public final JMv A0A;
    public final JKJ A0B;
    public final Icp A0C;

    public Icg(I1d i1d, JMv jMv, JKJ jkj, boolean z, boolean z2) {
        this.A09 = i1d;
        this.A0C = new Icp(i1d, z2);
        this.A0B = jkj;
        this.A0A = jMv;
        this.A07 = z;
    }

    public void AAv(JMu jMu) {
        this.A01 = jMu;
        JLE jle = this.A0B;
        if (jle instanceof JLE) {
            jle.AAv(jMu);
        }
    }

    public void AN3() {
        this.A01 = null;
        JLE jle = this.A0B;
        if (jle instanceof JLE) {
            jle.AN3();
        }
        Gu4 gu4 = this.A04;
        if (gu4 != null) {
            gu4.AN3();
            ((Ico) this.A04).A01 = null;
            this.A04 = null;
        }
    }

    public void BOo(I9U i9u) {
        this.A02 = i9u;
        JLE jle = this.A0B;
        if (jle instanceof JLE) {
            jle.BOo(i9u);
        }
    }

    public void release() {
        this.A02 = null;
        JLE jle = this.A0B;
        if (jle instanceof JLE) {
            jle.release();
        }
    }
}
