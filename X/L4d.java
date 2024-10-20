package X;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;

/* loaded from: L4d.class */
public final class L4d {
    public static final L4d A08;
    public static final L4d A09;
    public static final L4d A0A;
    public static final L4d A0B;
    public static final L4d A0C;
    public static final L4d A0D;
    public final int A00;
    public final Kug A01;
    public final Kug A02;
    public final int[] A03;
    public final int[] A04;
    public final int A05;
    public static final L4d A07 = new L4d(4201, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
    public static final L4d A06 = new L4d(1033, 1024);

    static {
        L4d l4d = new L4d(67, 64);
        A08 = l4d;
        A0A = new L4d(19, 16);
        A0D = new L4d(285, 256);
        L4d l4d2 = new L4d(301, 256);
        A0B = l4d2;
        A09 = l4d2;
        A0C = l4d;
    }

    public L4d(int i, int i2) {
        this.A05 = i;
        this.A00 = i2;
        int[] iArr = new int[i2];
        this.A03 = iArr;
        int[] iArr2 = new int[i2];
        this.A04 = iArr2;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            i3 <<= 1;
            if (i3 >= i2) {
                i3 = (i3 ^ i) & (i2 - 1);
            }
        }
        for (int i5 = 0; i5 < i2 - 1; i5++) {
            iArr2[iArr[i5]] = i5;
        }
        this.A02 = new Kug(this, new int[]{0});
        this.A01 = new Kug(this, new int[]{1});
    }

    public int A00(int i) {
        if (i != 0) {
            return this.A03[(this.A00 - this.A04[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A03;
        int[] iArr2 = this.A04;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A00 - 1)];
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("GF(0x");
        JQz.A1Q(A0o, this.A05);
        A0o.append(',');
        return DKH.A0p(A0o, this.A00);
    }
}
