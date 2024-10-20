package X;

/* renamed from: X.5ny, reason: invalid class name */
/* loaded from: 5ny.class */
public final class C5ny extends C04v {
    public static final C5ny A03 = new C5ny(null, 0S2.A00, null);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C5ny(String str, Integer num, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5ny)) {
                return false;
            }
            C5ny c5ny = (C5ny) obj;
            if (!11T.A0O(this.A01, c5ny.A01) || !11T.A0O(this.A02, c5ny.A02) || this.A00 != c5ny.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = 1BL.A05(this.A01) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (A05 + i) * 31;
        int intValue = this.A00.intValue();
        return i2 + (1 != intValue ? "DEFAULT" : "TOP").hashCode() + intValue;
    }
}
