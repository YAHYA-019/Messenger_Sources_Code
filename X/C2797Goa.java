package X;

/* renamed from: X.Goa, reason: case insensitive filesystem */
/* loaded from: Goa.class */
public final class C2797Goa extends HDZ {
    public final String A00;
    public final String A01;

    public C2797Goa(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2797Goa)) {
                return false;
            }
            C2797Goa c2797Goa = (C2797Goa) obj;
            if (!11T.A0O(this.A00, c2797Goa.A00) || !11T.A0O(this.A01, c2797Goa.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }
}
