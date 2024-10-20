package X;

import java.util.Arrays;

/* loaded from: Kre.class */
public final class Kre {
    public Kpt A01;
    public Object[] A02 = new Object[8];
    public int A00 = 0;

    public final LtI A00() {
        Kpt kpt = this.A01;
        if (kpt == null) {
            LtI A03 = LtI.A03(this, this.A02, this.A00);
            kpt = this.A01;
            if (kpt == null) {
                return A03;
            }
        }
        throw kpt.A00();
    }

    public final void A01(Object obj, Object obj2) {
        int i = this.A00 + 1;
        Object[] objArr = this.A02;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
                if (i3 < 0) {
                    i3 = (-1) >>> 1;
                }
            }
            this.A02 = Arrays.copyOf(objArr, i3);
        }
        KYH.A00(obj, obj2);
        Object[] objArr2 = this.A02;
        int i4 = this.A00;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.A00 = i4 + 1;
    }
}
