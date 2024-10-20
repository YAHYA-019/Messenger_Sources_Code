package X;

/* loaded from: Gtn.class */
public final class Gtn extends GuG implements JPk {
    public final JG4 A00;
    public volatile int A01;
    public volatile int A02;
    public volatile int A03;
    public volatile JPy A04;
    public volatile JPz A05;
    public volatile JQ3 A06;

    public Gtn(JOW jow) {
        super(jow);
        this.A00 = new Id9(this, 3);
    }

    public void A0A() {
        this.A05 = (JPz) A0B(JPz.A01);
        GuJ guJ = JPy.A01;
        JOW jow = ((GuG) this).A00;
        if (jow.BRD(guJ)) {
            this.A04 = (JPy) A0B(guJ);
        }
        GuJ guJ2 = JQ3.A00;
        if (jow.BRD(guJ2)) {
            JQC A0B = A0B(guJ2);
            11T.A0A(A0B);
            JQ3 jq3 = (JQ3) A0B;
            jq3.A7V(this.A00);
            this.A06 = jq3;
        }
    }

    @Override // X.JQC
    public GuJ Ase() {
        GuJ guJ = JPk.A00;
        11T.A0B(guJ);
        return guJ;
    }
}
