package X;

/* loaded from: JtC.class */
public final class JtC extends C04v {
    public static final JtC A07;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03 = 4.0f;
    public final float A04;
    public final float A05;
    public final float A06;

    static {
        float f = RXk.A00;
        float f2 = RXk.A02;
        A07 = new JtC(64.0f, f, f, f2, f2, RXk.A01);
    }

    public JtC(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A06 = f4;
        this.A04 = f5;
        this.A05 = f6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof JtC)) {
                return false;
            }
            JtC jtC = (JtC) obj;
            if (!AnonymousClass001.A1O(Float.compare(this.A01, jtC.A01)) || !AnonymousClass001.A1O(Float.compare(this.A02, jtC.A02)) || !AnonymousClass001.A1O(Float.compare(this.A00, jtC.A00)) || !AnonymousClass001.A1O(Float.compare(this.A06, jtC.A06)) || !AnonymousClass001.A1O(Float.compare(this.A04, jtC.A04)) || !AnonymousClass001.A1O(Float.compare(this.A05, jtC.A05)) || !AnonymousClass001.A1O(Float.compare(this.A03, jtC.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQz.A07(1BL.A00(1BL.A00(1BL.A00(1BL.A00(1BL.A00(JQz.A04(this.A01), this.A02), this.A00), this.A06), this.A04), this.A05), this.A03);
    }
}
