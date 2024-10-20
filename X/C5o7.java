package X;

/* renamed from: X.5o7, reason: invalid class name */
/* loaded from: 5o7.class */
public final class C5o7 extends C04v {
    public static final C5o7 A02 = new C5o7(0S2.A00, -1);
    public final int A00;
    public final Integer A01;

    public C5o7(Integer num, int i) {
        this.A00 = i;
        this.A01 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5o7)) {
                return false;
            }
            C5o7 c5o7 = (C5o7) obj;
            if (this.A00 != c5o7.A00 || this.A01 != c5o7.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00 * 31;
        int intValue = this.A01.intValue();
        return i + (1 != intValue ? "DEFAULT" : "TOP").hashCode() + intValue;
    }
}
