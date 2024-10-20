package X;

/* renamed from: X.8pa, reason: invalid class name */
/* loaded from: 8pa.class */
public final class C8pa extends 2Yv {
    public int A00;
    public boolean A01;
    public boolean A02;

    public void A02(C2l4 c2l4) {
        int i = c2l4.A00;
        if (i != 0) {
            if (i == 1) {
                this.A01 = false;
                return;
            }
            return;
        }
        Integer valueOf = Integer.valueOf(this.A00);
        int i2 = 1;
        if (valueOf != null) {
            i2 = valueOf.intValue() + 1;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        this.A01 = true;
        this.A00 = valueOf2.intValue();
        this.A02 = true;
    }
}
