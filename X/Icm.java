package X;

/* loaded from: Icm.class */
public final class Icm implements JLE, JDF {
    public int A00;
    public int A01;
    public JMu A02;
    public JMy A03;
    public boolean A04;
    public final JEF A05;
    public final I5I A06;
    public final HcY A07;
    public final H3X A08;

    public Icm() {
        this(new IOU());
    }

    public Icm(JEF jef) {
        this.A05 = jef;
        this.A06 = new I5I();
        this.A08 = new H3X(true);
        this.A07 = new HcY();
    }

    public void AAv(JMu jMu) {
        11T.A0F(jMu, 0);
        this.A02 = jMu;
        JMy jMy = this.A03;
        if (jMy != null) {
            jMy.CPE(jMu.B57());
        }
        this.A08.A00 = jMu.B57();
    }

    public void AN3() {
        JMy jMy = this.A03;
        if (jMy != null) {
            jMy.CPG();
        }
        this.A08.CPG();
        this.A02 = null;
    }

    public void BOo(I9U i9u) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        JMy jMy = this.A03;
        JMy jMy2 = ((Icm) obj).A03;
        if (jMy != jMy2) {
            return jMy != null && jMy.equals(jMy2);
        }
        return true;
    }

    public int hashCode() {
        JMy jMy = this.A03;
        int i = 0;
        if (jMy != null) {
            i = jMy.hashCode();
        }
        return i;
    }

    public void release() {
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GlLegacyRenderer(");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
