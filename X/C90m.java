package X;

import java.util.Arrays;

/* renamed from: X.90m, reason: invalid class name */
/* loaded from: 90m.class */
public final class C90m extends C90n implements Ab4 {
    public final long A00;
    public final long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90m(RNo rNo, C9by c9by) {
        super(c9by);
        long j = rNo.A00;
        long j2 = rNo.A01;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.A1n
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C90m) || !super.equals(obj)) {
                return false;
            }
            C90m c90m = (C90m) obj;
            if (this.A00 != c90m.A00 || this.A01 != c90m.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.A1n
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Long.valueOf(this.A00), Long.valueOf(this.A01)});
    }
}
