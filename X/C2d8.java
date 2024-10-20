package X;

/* renamed from: X.2d8, reason: invalid class name */
/* loaded from: 2d8.class */
public abstract class C2d8 extends C2d9 {
    public final int A00;
    public final int[] A01;

    public C2d8(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public final int A01(CharSequence charSequence, int i, int i2) {
        return A02(charSequence, this.A01, 0, this.A00, i, i2);
    }

    public abstract int A02(CharSequence charSequence, int[] iArr, int i, int i2, int i3, int i4);
}
