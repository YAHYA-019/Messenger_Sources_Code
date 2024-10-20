package X;

import java.util.Arrays;

/* loaded from: Lii.class */
public final class Lii implements Cloneable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public Lii(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw AnonymousClass001.A0L("Both dimensions must be greater than 0");
        }
        this.A02 = i;
        this.A00 = i2;
        int i3 = (i + 31) / 32;
        this.A01 = i3;
        this.A03 = new int[i3 * i2];
    }

    public Lii(int[] iArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
    }

    public void A00(int i, int i2) {
        int i3 = (i2 * this.A01) + (i / 32);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void A01(int i, int i2) {
        int i3 = (i2 * this.A01) + (i / 32);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void A02(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw AnonymousClass001.A0L("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw AnonymousClass001.A0L("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.A00 || i5 > this.A02) {
            throw AnonymousClass001.A0L("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.A01 * i2;
            int i8 = i;
            while (true) {
                int i9 = i8;
                if (i9 < i5) {
                    int[] iArr = this.A03;
                    int i10 = (i9 / 32) + i7;
                    iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                    i8 = i9 + 1;
                }
            }
            i2++;
        }
    }

    public boolean A03(int i, int i2) {
        boolean z = true;
        if (((this.A03[(i2 * this.A01) + (i / 32)] >>> (i & 31)) & 1) == 0) {
            z = false;
        }
        return z;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new Lii((int[]) this.A03.clone(), this.A02, this.A00, this.A01);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Lii) {
            Lii lii = (Lii) obj;
            if (this.A02 == lii.A02 && this.A00 == lii.A00 && this.A01 == lii.A01 && Arrays.equals(this.A03, lii.A03)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = this.A02;
        return (((((((i * 31) + i) * 31) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03);
    }

    public String toString() {
        int i = this.A00;
        int i2 = this.A02;
        StringBuilder A0l = AnonymousClass001.A0l((i2 + 1) * i);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i) {
                return A0l.toString();
            }
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < i2) {
                    String str = "  ";
                    if (A03(i6, i4)) {
                        str = "X ";
                    }
                    A0l.append(str);
                    i5 = i6 + 1;
                }
            }
            A0l.append("\n");
            i3 = i4 + 1;
        }
    }
}
