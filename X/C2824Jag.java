package X;

/* renamed from: X.Jag, reason: case insensitive filesystem */
/* loaded from: Jag.class */
public final class C2824Jag extends KuM {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof C2824Jag)) {
            return false;
        }
        C2824Jag c2824Jag = (C2824Jag) obj;
        return c2824Jag.A00 == this.A00 && c2824Jag.A01 == this.A01 && c2824Jag.A02 == this.A02 && c2824Jag.A03 == this.A03;
    }

    public int hashCode() {
        return JQz.A07(1BL.A00(1BL.A00(JQz.A04(this.A00), this.A01), this.A02), this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AnimationVector4D: v1 = ");
        A0k.append(this.A00);
        A0k.append(", v2 = ");
        A0k.append(this.A01);
        A0k.append(", v3 = ");
        A0k.append(this.A02);
        A0k.append(", v4 = ");
        A0k.append(this.A03);
        return A0k.toString();
    }
}
