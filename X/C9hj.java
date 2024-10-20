package X;

/* renamed from: X.9hj, reason: invalid class name */
/* loaded from: 9hj.class */
public final class C9hj {
    public static final C9gg A04 = new Object();
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public C9hj(Integer num, Integer num2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = num2;
        this.A02 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(obj, this)) {
                return false;
            }
            C9hj c9hj = (C9hj) obj;
            if (c9hj.A01 != this.A01 || c9hj.A02 != this.A02 || c9hj.A00 != this.A00 || c9hj.A03 != this.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int i = ((this.A00 * 31) + this.A01) * 31;
        int intValue = this.A03.intValue();
        int A07 = 7zR.A07(intValue != 0 ? "BACKGROUND" : "DEFAULT", intValue, i);
        int intValue2 = this.A02.intValue();
        switch (intValue2) {
            case 1:
                str = "DARK";
                break;
            case 2:
                str = "DEFAULT";
                break;
            case 3:
                str = "WASH";
                break;
            default:
                str = "LIGHT";
                break;
        }
        return A07 + 7zM.A04(str, intValue2);
    }
}
