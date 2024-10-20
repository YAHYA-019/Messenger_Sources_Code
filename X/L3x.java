package X;

/* loaded from: L3x.class */
public abstract class L3x {
    public final float A00;
    public final float A01;

    public L3x(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public static float A00(L3x l3x, L3x l3x2) {
        float f = l3x.A00;
        float f2 = l3x.A01;
        float f3 = f - l3x2.A00;
        return (float) JQy.A01(f2 - l3x2.A01, f3 * f3);
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof L3x) {
            L3x l3x = (L3x) obj;
            if (this.A00 == l3x.A00 && this.A01 == l3x.A01) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        return JQz.A07(JQz.A04(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("(");
        A0o.append(this.A00);
        A0o.append(',');
        A0o.append(this.A01);
        return 4YV.A0x(A0o);
    }
}
