package X;

/* renamed from: X.8t8, reason: invalid class name */
/* loaded from: 8t8.class */
public final class C8t8 extends 8tD {
    public final long A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8t8(String str, long j) {
        super("ShowCode");
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8t8)) {
                return false;
            }
            C8t8 c8t8 = (C8t8) obj;
            if (!11T.A0O(this.A01, c8t8.A01) || this.A00 != c8t8.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + 1BL.A01(this.A00);
    }
}
