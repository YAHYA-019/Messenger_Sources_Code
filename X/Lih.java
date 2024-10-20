package X;

import java.util.Arrays;

/* loaded from: Lih.class */
public final class Lih implements Cloneable {
    public int A00 = 0;
    public int[] A01 = new int[1];

    public static void A00(Lih lih, int i) {
        int[] iArr = lih.A01;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            lih.A01 = iArr2;
        }
    }

    public void A01(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw AnonymousClass001.A0L("Num bits must be between 0 and 32");
        }
        A00(this, this.A00 + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            A02(z);
            i2--;
        }
    }

    public void A02(boolean z) {
        A00(this, this.A00 + 1);
        if (z) {
            int[] iArr = this.A01;
            int i = this.A00;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.A00++;
    }

    public boolean A03(int i) {
        boolean z = true;
        if (((1 << (i & 31)) & this.A01[i / 32]) == 0) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Lih] */
    public /* bridge */ /* synthetic */ Object clone() {
        int[] iArr = (int[]) this.A01.clone();
        int i = this.A00;
        ?? obj = new Object();
        obj.A01 = iArr;
        obj.A00 = i;
        return obj;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Lih) {
            Lih lih = (Lih) obj;
            if (this.A00 == lih.A00 && Arrays.equals(this.A01, lih.A01)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        int i = this.A00;
        StringBuilder A0l = AnonymousClass001.A0l((i / 8) + i + 1);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return A0l.toString();
            }
            if ((i3 & 7) == 0) {
                A0l.append(' ');
            }
            char c = '.';
            if (A03(i3)) {
                c = 'X';
            }
            A0l.append(c);
            i2 = i3 + 1;
        }
    }
}
