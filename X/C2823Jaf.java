package X;

/* renamed from: X.Jaf, reason: case insensitive filesystem */
/* loaded from: Jaf.class */
public final class C2823Jaf extends KuM {
    public float A00;
    public float A01;
    public float A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C2823Jaf)) {
            return false;
        }
        C2823Jaf c2823Jaf = (C2823Jaf) obj;
        return c2823Jaf.A00 == this.A00 && c2823Jaf.A01 == this.A01 && c2823Jaf.A02 == this.A02;
    }

    public int hashCode() {
        return JQz.A07(1BL.A00(JQz.A04(this.A00), this.A01), this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AnimationVector3D: v1 = ");
        A0k.append(this.A00);
        A0k.append(", v2 = ");
        A0k.append(this.A01);
        A0k.append(", v3 = ");
        A0k.append(this.A02);
        return A0k.toString();
    }
}
