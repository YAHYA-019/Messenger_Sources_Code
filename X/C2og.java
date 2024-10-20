package X;

/* renamed from: X.2og, reason: invalid class name */
/* loaded from: 2og.class */
public final class C2og extends C04v implements C2g4 {
    public final 7QI A00;
    public final C2fr A01;
    public final boolean A02;
    public final boolean A03;

    public C2og(7QI r302, C2fr c2fr, boolean z, boolean z2) {
        this.A01 = c2fr;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2og)) {
                return false;
            }
            C2og c2og = (C2og) obj;
            if (!11T.A0O(this.A01, c2og.A01) || this.A02 != c2og.A02 || this.A03 != c2og.A03 || !11T.A0O(this.A00, c2og.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, (((1BL.A03(this.A01) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31);
    }
}
