package X;

/* loaded from: L1s.class */
public final class L1s {
    public int A00;
    public int[] A01 = new int[10];

    public static int A00(L1s l1s) {
        int[] iArr = l1s.A01;
        int i = l1s.A00 - 1;
        l1s.A00 = i;
        return iArr[i];
    }

    public final void A01(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            iArr = JQz.A1a(iArr, length * 2);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }
}
