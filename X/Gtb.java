package X;

/* loaded from: Gtb.class */
public final class Gtb extends GuF implements JPZ {
    public final JQ9 A00;
    public final JQ7 A01;
    public volatile JPk A02;
    public volatile JQ3 A03;
    public volatile ICm A04;

    public Gtb(JOW jow) {
        super(jow);
        HJS hjs = JQ9.A00;
        JOW jow2 = ((GuF) this).A00;
        this.A00 = (JQ9) jow2.AdD(hjs);
        this.A01 = (JQ7) jow2.AdD(JQ7.A00);
    }

    public void A0A() {
        GuJ guJ = JPi.A00;
        JOW jow = ((GuF) this).A00;
        this.A04 = ((Gtl) ((JPi) jow.AdC(guJ))).A02;
        GuJ guJ2 = JPk.A00;
        if (jow.BRD(guJ2)) {
            this.A02 = (JPk) jow.AdC(guJ2);
        }
        GuJ guJ3 = JQ3.A00;
        if (jow.BRD(guJ3)) {
            this.A03 = (JQ3) jow.AdC(guJ3);
        }
    }

    public QQW Asd() {
        return JPZ.A00;
    }
}
