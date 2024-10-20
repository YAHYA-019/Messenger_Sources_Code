package X;

/* renamed from: X.7a4, reason: invalid class name */
/* loaded from: 7a4.class */
public final class C7a4 extends C04v implements 7yS {
    public final long A00;
    public final String A01;

    public C7a4(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public AnonymousClass815 D3x() {
        return AnonymousClass815.A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7a4)) {
                return false;
            }
            C7a4 c7a4 = (C7a4) obj;
            if (!11T.A0O(this.A01, c7a4.A01) || this.A00 != c7a4.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + 1BL.A01(this.A00);
    }
}
