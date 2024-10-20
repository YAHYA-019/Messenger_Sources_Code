package X;

/* renamed from: X.Gj6, reason: case insensitive filesystem */
/* loaded from: Gj6.class */
public final class C2617Gj6 extends C04v {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final java.util.Map A05;
    public final java.util.Map A06;
    public final boolean A07;

    public C2617Gj6(String str, String str2, String str3, String str4, String str5, java.util.Map map, java.util.Map map2, boolean z) {
        this.A07 = z;
        this.A03 = str;
        this.A06 = map;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = str5;
        this.A05 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2617Gj6)) {
                return false;
            }
            C2617Gj6 c2617Gj6 = (C2617Gj6) obj;
            if (this.A07 != c2617Gj6.A07 || !11T.A0O(this.A03, c2617Gj6.A03) || !11T.A0O(this.A06, c2617Gj6.A06) || !11T.A0O(this.A02, c2617Gj6.A02) || !11T.A0O(this.A01, c2617Gj6.A01) || !11T.A0O(this.A00, c2617Gj6.A00) || !11T.A0O(this.A04, c2617Gj6.A04) || !11T.A0O(this.A05, c2617Gj6.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A05, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A00, AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A06, AnonymousClass002.A07(this.A03, AnonymousClass002.A00(this.A07 ? 1 : 0) * 31)))))));
    }
}
