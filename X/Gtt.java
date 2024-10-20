package X;

import android.os.Handler;

/* loaded from: Gtt.class */
public final class Gtt extends GuG implements JPl {
    public JLF A00;
    public RtH A01;

    public void A08() {
        this.A00 = null;
        this.A01 = null;
    }

    public void A0A() {
        HJS hjs = JQ7.A00;
        JOW jow = ((GuG) this).A00;
        Handler A00 = JOW.A00(jow, hjs);
        11T.A0A(A00);
        JQ9 jq9 = (JQ9) jow.AdD(JQ9.A00);
        JQ8 jq8 = (JQ8) jow.AdD(JQ8.A00);
        JQC A0B = A0B(JPy.A01);
        11T.A0A(A0B);
        JPy jPy = (JPy) A0B;
        JQC A0B2 = A0B(JQ3.A00);
        11T.A0A(A0B2);
        JQ3 jq3 = (JQ3) A0B2;
        RtH rtH = new RtH(jPy, jq3);
        jq3.A7V(rtH);
        JEO jeo = ((C2415Gcc) jPy).A03.A07;
        11T.A0A(jeo);
        GuJ guJ = JPh.A00;
        IEE iee = jow.BRD(guJ) ? ((Gtk) ((JPh) A0B(guJ))).A02 : null;
        1BL.A1F(jq9, jq8);
        this.A00 = iee != null ? HH0.A00(A00, iee.A05(jeo), rtH, jq8, new IdI(jq9)) : HGz.A00(A00, rtH, jeo, jq8, new IdI(jq9));
        this.A01 = rtH;
    }

    @Override // X.JQC
    public GuJ Ase() {
        GuJ guJ = JPl.A00;
        11T.A0B(guJ);
        return guJ;
    }
}
