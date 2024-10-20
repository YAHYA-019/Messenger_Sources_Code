package X;

/* renamed from: X.2j1, reason: invalid class name */
/* loaded from: 2j1.class */
public final class C2j1 {
    public int[] A01 = new int[10];
    public int A00 = 0;

    public void A00(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            int[] iArr2 = new int[length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }
}
