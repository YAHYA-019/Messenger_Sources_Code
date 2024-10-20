package X;

import java.util.Arrays;

/* renamed from: X.90d, reason: invalid class name */
/* loaded from: 90d.class */
public class C90d extends A1n implements Ab5 {
    public final int A00;
    public final long A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90d(RLi rLi, C9by c9by) {
        super(c9by);
        int i = rLi.A00;
        String str = rLi.A02;
        long j = rLi.A01;
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.A1n
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ab5) || !super.equals(obj)) {
                return false;
            }
            C90d c90d = (C90d) ((Ab5) obj);
            if (this.A01 != c90d.A01 || this.A00 != c90d.A00 || !this.A02.equals(c90d.A02)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.A1n
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A02});
    }
}
