package X;

/* renamed from: X.6ae, reason: invalid class name */
/* loaded from: 6ae.class */
public final class C6ae {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C6ae() {
    }

    public C6ae(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public static void A00(C6ae c6ae) {
        int i;
        int i2 = c6ae.A02;
        6DP.A04(i2 >= 0 && (i2 < (i = c6ae.A01) || (i2 == i && c6ae.A00 == 0)));
    }

    public int A01() {
        return ((this.A01 - this.A02) * 8) - this.A00;
    }

    public int A02(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        int i3 = this.A00 + i;
        this.A00 = i3;
        int i4 = 0;
        while (true) {
            i2 = i4;
            if (i3 <= 8) {
                break;
            }
            i3 -= 8;
            this.A00 = i3;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            this.A02 = i5 + 1;
            i4 = i2 | ((bArr[i5] & 255) << i3);
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int i7 = ((-1) >>> (32 - i)) & (i2 | ((bArr2[i6] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i6 + 1;
        }
        A00(this);
        return i7;
    }

    public void A03() {
        if (this.A00 != 0) {
            this.A00 = 0;
            this.A02++;
            A00(this);
        }
    }

    public void A04() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A00(this);
    }

    public void A05(int i) {
        int i2 = i / 8;
        this.A02 = i2;
        this.A00 = i - (i2 * 8);
        A00(this);
    }

    public void A06(int i) {
        int i2 = i / 8;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = this.A00 + (i - (i2 * 8));
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A00(this);
    }

    public void A07(int i) {
        6DP.A04(AnonymousClass001.A1O(this.A00));
        this.A02 += i;
        A00(this);
    }

    public void A08(6aO r302) {
        byte[] bArr = r302.A02;
        int i = r302.A00;
        this.A03 = bArr;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = i;
        A05(r302.A01 * 8);
    }

    public void A09(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A03;
            int i4 = this.A02;
            int i5 = i4 + 1;
            this.A02 = i5;
            byte b = bArr2[i4];
            int i6 = this.A00;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.A00;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.A03;
                int i9 = this.A02;
                this.A02 = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
                this.A00 = i8;
            }
            int i10 = i8 + i7;
            this.A00 = i10;
            byte[] bArr4 = this.A03;
            int i11 = this.A02;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.A00 = 0;
                this.A02 = i11 + 1;
            }
            A00(this);
        }
    }

    public boolean A0A() {
        boolean A1N = AnonymousClass001.A1N(this.A03[this.A02] & (128 >> this.A00));
        A04();
        return A1N;
    }
}
