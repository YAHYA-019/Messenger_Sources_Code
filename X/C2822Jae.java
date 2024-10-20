package X;

/* renamed from: X.Jae, reason: case insensitive filesystem */
/* loaded from: Jae.class */
public final class C2822Jae extends KuM {
    public float A00;
    public float A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C2822Jae)) {
            return false;
        }
        C2822Jae c2822Jae = (C2822Jae) obj;
        return c2822Jae.A00 == this.A00 && c2822Jae.A01 == this.A01;
    }

    public int hashCode() {
        return JQz.A07(JQz.A04(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AnimationVector2D: v1 = ");
        A0k.append(this.A00);
        A0k.append(", v2 = ");
        A0k.append(this.A01);
        return A0k.toString();
    }
}
