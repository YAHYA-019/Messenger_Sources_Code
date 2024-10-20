package X;

/* renamed from: X.721, reason: invalid class name */
/* loaded from: 721.class */
public final class AnonymousClass721 extends C04v implements AnonymousClass720 {
    public final String A00;
    public final String A01;
    public final int A02;
    public final String A03;

    public AnonymousClass721(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = i;
        this.A00 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass721)) {
                return false;
            }
            AnonymousClass721 anonymousClass721 = (AnonymousClass721) obj;
            if (!11T.A0O(this.A01, anonymousClass721.A01) || !11T.A0O(this.A03, anonymousClass721.A03) || this.A02 != anonymousClass721.A02 || !11T.A0O(this.A00, anonymousClass721.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A03, 4YV.A02(this.A01)) + this.A02) * 31) + 1BL.A05(this.A00);
    }
}
