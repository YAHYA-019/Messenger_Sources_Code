package X;

/* loaded from: I01.class */
public final class I01 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public final /* synthetic */ IDA A09;

    public I01(IDA ida, int i, int i2) {
        this.A09 = ida;
        this.A00 = i;
        this.A08 = i2;
        A00(this);
    }

    public static final void A00(I01 i01) {
        IDA ida = i01.A09;
        int[] iArr = ida.A02;
        int[] iArr2 = ida.A03;
        int i = (-1) >>> 1;
        int i2 = (-1) >>> 1;
        int i3 = (-1) >>> 1;
        int i4 = (-1) << (-1);
        int i5 = (-1) << (-1);
        int i6 = (-1) << (-1);
        int i7 = 0;
        for (int i8 = i01.A00; i8 <= i01.A08; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        i01.A06 = i;
        i01.A03 = i4;
        i01.A05 = i2;
        i01.A02 = i5;
        i01.A04 = i3;
        i01.A01 = i6;
        i01.A07 = i7;
    }
}
