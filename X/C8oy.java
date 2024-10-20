package X;

/* renamed from: X.8oy, reason: invalid class name */
/* loaded from: 8oy.class */
public final class C8oy extends 2Yv {
    public int A00;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 == 0) {
            Number valueOf = Integer.valueOf(this.A00);
            Number number = (Number) objArr[0];
            if (valueOf.intValue() != number.intValue()) {
                valueOf = number;
            }
            this.A00 = valueOf.intValue();
        }
    }
}
