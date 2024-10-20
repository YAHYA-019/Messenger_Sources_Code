package X;

/* renamed from: X.Jd1, reason: case insensitive filesystem */
/* loaded from: Jd1.class */
public final class C2913Jd1 extends KR9 {
    public final float A00 = 4.0f;
    public final float A01;
    public final int A02;

    public /* synthetic */ C2913Jd1(float f, int i) {
        this.A01 = f;
        this.A02 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2913Jd1)) {
                return false;
            }
            C2913Jd1 c2913Jd1 = (C2913Jd1) obj;
            if (this.A01 != c2913Jd1.A01 || this.A00 != c2913Jd1.A00 || this.A02 != c2913Jd1.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A00(JQz.A04(this.A01), this.A00) + this.A02) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Stroke(width=");
        A0k.append(this.A01);
        A0k.append(", miter=");
        A0k.append(this.A00);
        A0k.append(", cap=");
        int i = this.A02;
        A0k.append(i == 0 ? "Butt" : i == 1 ? "Round" : "Square");
        A0k.append(", join=");
        A0k.append((Object) "Miter");
        A0k.append(", pathEffect=");
        return AnonymousClass002.A0K(null, A0k);
    }
}
