package X;

/* loaded from: Ey9.class */
public final class Ey9 {
    public final Object A00;
    public final String A01;

    public Ey9(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey9)) {
                return false;
            }
            Ey9 ey9 = (Ey9) obj;
            if (!11T.A0O(this.A01, ey9.A01) || !11T.A0O(this.A00, ey9.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScreenKey(name=");
        A0k.append(this.A01);
        A0k.append(", args=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
