package X;

/* renamed from: X.2g3, reason: invalid class name */
/* loaded from: 2g3.class */
public final class C2g3 extends C04v implements C2g4 {
    public final C2fr A00;
    public final String A01;

    public C2g3(C2fr c2fr, String str) {
        this.A00 = c2fr;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2g3)) {
                return false;
            }
            C2g3 c2g3 = (C2g3) obj;
            if (!11T.A0O(this.A00, c2g3.A00) || !11T.A0O(this.A01, c2g3.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }
}
