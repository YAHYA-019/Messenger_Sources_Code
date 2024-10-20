package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Gtc.class */
public final class Gtc extends GuF implements JPa {
    public JLo A00;
    public JPl A01;
    public JLF A02;
    public Hnp A03;
    public Boolean A04;
    public CountDownLatch A05;
    public final JLo A06;
    public final JLo A07;
    public final JQ9 A08;
    public final JQ8 A09;
    public final StringBuffer A0A;
    public final AtomicBoolean A0B;
    public volatile Gu0 A0C;
    public volatile Integer A0D;
    public volatile boolean A0E;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.JLo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.JLo, java.lang.Object] */
    public Gtc(JOW jow) {
        super(jow);
        StringBuffer stringBuffer = new StringBuffer();
        this.A0A = stringBuffer;
        ?? obj = new Object();
        this.A06 = obj;
        this.A07 = new Object();
        this.A0D = 0S2.A0C;
        this.A00 = obj;
        this.A0E = false;
        this.A0B = DKC.A1E(false);
        HJS hjs = JQ8.A00;
        JOW jow2 = ((GuF) this).A00;
        this.A09 = (JQ8) jow2.AdD(hjs);
        this.A08 = (JQ9) jow2.AdD(JQ9.A00);
        stringBuffer.append("ctor,");
    }

    public void A0A() {
        this.A0A.append("init,");
        JLo jLo = this.A06;
        JOW jow = ((GuF) this).A00;
        jLo.BOn(jow);
        this.A07.BOn(jow);
        this.A04 = (Boolean) jow.Adm(Hxz.A02);
        this.A01 = (JPl) jow.AdC(JPl.A00);
        JQ3 jq3 = (JQ3) jow.AdC(JQ3.A00);
        this.A02 = ((Gtt) this.A01).A00;
        jq3.CwK(new Iec(this));
        this.A0E = true;
    }

    @Override // X.JQB
    public QQW Asd() {
        return JPa.A00;
    }
}
