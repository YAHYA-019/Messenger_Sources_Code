package X;

/* renamed from: X.2od, reason: invalid class name */
/* loaded from: 2od.class */
public final class C2od extends C04v implements C2g4 {
    public final C2fr A00;
    public final String A01;

    public C2od(C2fr c2fr, String str) {
        this.A00 = c2fr;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2od)) {
                return false;
            }
            C2od c2od = (C2od) obj;
            if (!11T.A0O(this.A00, c2od.A00) || !11T.A0O(this.A01, c2od.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }
}
