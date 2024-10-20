package X;

import java.util.List;

/* renamed from: X.6va, reason: invalid class name */
/* loaded from: 6va.class */
public final class C6va extends C04v {
    public static final C6va A06 = new C6va(null, null, C0ty.A00, 0, 0, false);
    public final int A00;
    public final long A01;
    public final 8Lu A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    public C6va(8Lu r302, String str, List list, int i, long j, boolean z) {
        this.A01 = j;
        this.A00 = i;
        this.A05 = z;
        this.A04 = list;
        this.A03 = str;
        this.A02 = r302;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6va)) {
                return false;
            }
            C6va c6va = (C6va) obj;
            if (this.A01 != c6va.A01 || this.A00 != c6va.A00 || this.A05 != c6va.A05 || !11T.A0O(this.A04, c6va.A04) || !11T.A0O(this.A03, c6va.A03) || !11T.A0O(this.A02, c6va.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A04, ((((1BL.A01(this.A01) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + 1BL.A05(this.A03)) * 31) + 4YU.A03(this.A02);
    }
}
