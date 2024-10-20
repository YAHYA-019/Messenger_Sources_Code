package X;

import java.util.List;

/* renamed from: X.6ys, reason: invalid class name */
/* loaded from: 6ys.class */
public abstract class C6ys {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C6ys(C6yn c6yn) {
        String str = c6yn.A04;
        if (str == null) {
            throw 1BK.A0h();
        }
        this.A04 = str;
        this.A06 = c6yn.A06;
        this.A05 = c6yn.A05;
        this.A02 = c6yn.A02;
        this.A01 = c6yn.A01;
        this.A00 = c6yn.A00;
        this.A03 = c6yn.A03;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C6ys) {
            C6ys c6ys = (C6ys) obj;
            if (this.A06 == c6ys.A06 && 11T.A0O(this.A04, c6ys.A04) && 11T.A0O(this.A05, c6ys.A05) && this.A02 == c6ys.A02 && this.A01 == c6ys.A01 && this.A00 == c6ys.A00 && this.A03 == c6ys.A03) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass002.A07(this.A04, super.hashCode() * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A04(this.A05)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03;
    }
}
