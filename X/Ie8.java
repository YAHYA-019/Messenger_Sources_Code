package X;

import java.util.List;

/* loaded from: Ie8.class */
public final class Ie8 implements JGJ {
    public int A00;
    public JGJ A01;
    public final I9a A02;

    public Ie8(I9a i9a) {
        11T.A0F(i9a, 1);
        this.A02 = i9a;
        Integer A03 = i9a.A03();
        int intValue = A03 != null ? A03.intValue() : 30;
        this.A00 = intValue;
        this.A01 = new Ie7(intValue);
    }

    public int[] B4M(List list, int i) {
        11T.A0F(list, 1);
        Integer A03 = this.A02.A03();
        if (A03 != null) {
            int i2 = this.A00;
            int intValue = A03.intValue();
            if (intValue != i2) {
                this.A00 = intValue;
                this.A01 = new Ie7(intValue);
            }
        }
        int[] B4M = this.A01.B4M(list, 30000);
        11T.A0A(B4M);
        return B4M;
    }
}
