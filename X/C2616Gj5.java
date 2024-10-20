package X;

import java.util.List;

/* renamed from: X.Gj5, reason: case insensitive filesystem */
/* loaded from: Gj5.class */
public final class C2616Gj5 extends C04v {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C2616Gj5(List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = z;
        this.A01 = list;
        this.A00 = i;
        this.A02 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A05 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2616Gj5)) {
                return false;
            }
            C2616Gj5 c2616Gj5 = (C2616Gj5) obj;
            if (this.A03 != c2616Gj5.A03 || !11T.A0O(this.A01, c2616Gj5.A01) || this.A00 != c2616Gj5.A00 || this.A02 != c2616Gj5.A02 || this.A04 != c2616Gj5.A04 || this.A06 != c2616Gj5.A06 || this.A05 != c2616Gj5.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass002.A05(this.A01, AnonymousClass002.A00(this.A03 ? 1 : 0) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0);
    }
}
