package X;

/* renamed from: X.Gj3, reason: case insensitive filesystem */
/* loaded from: Gj3.class */
public final class C2614Gj3 extends C04v {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C2614Gj3(Object obj, String str, String str2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = obj;
        this.A04 = z;
        this.A05 = z2;
    }

    public boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2614Gj3)) {
                return false;
            }
            C2614Gj3 c2614Gj3 = (C2614Gj3) obj;
            return c2614Gj3.A00 == 1 && 11T.A0O(this.A03, c2614Gj3.A03) && 11T.A0O(this.A02, c2614Gj3.A02) && 11T.A0O(this.A01, c2614Gj3.A01) && this.A04 == c2614Gj3.A04 && this.A05 == c2614Gj3.A05;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2614Gj3)) {
            return false;
        }
        C2614Gj3 c2614Gj32 = (C2614Gj3) obj;
        return c2614Gj32.A00 == 0 && this.A04 == c2614Gj32.A04 && 11T.A0O(this.A03, c2614Gj32.A03) && this.A05 == c2614Gj32.A05 && 11T.A0O(this.A01, c2614Gj32.A01) && 11T.A0O(this.A02, c2614Gj32.A02);
    }

    public int hashCode() {
        int A00;
        int A05;
        if (this.A00 != 0) {
            A05 = ((((((1BL.A05(this.A03) * 31) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A01)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31;
            A00 = AnonymousClass002.A00(this.A05 ? 1 : 0);
        } else {
            A00 = ((((((AnonymousClass002.A00(this.A04 ? 1 : 0) * 31) + 1BL.A05(this.A03)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A01)) * 31;
            A05 = 7zN.A05(this.A02);
        }
        return A05 + A00;
    }
}
