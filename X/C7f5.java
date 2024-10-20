package X;

/* renamed from: X.7f5, reason: invalid class name */
/* loaded from: 7f5.class */
public final class C7f5 extends C04v {
    public final long A00;
    public final Long A01;
    public final String A02;

    public C7f5(Long l, String str, long j) {
        11T.A0F(str, 2);
        this.A00 = j;
        this.A02 = str;
        this.A01 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7f5)) {
                return false;
            }
            C7f5 c7f5 = (C7f5) obj;
            if (this.A00 != c7f5.A00 || !11T.A0O(this.A02, c7f5.A02) || !11T.A0O(this.A01, c7f5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A02, 1BL.A01(this.A00) * 31) + AnonymousClass001.A02(this.A01);
    }
}
