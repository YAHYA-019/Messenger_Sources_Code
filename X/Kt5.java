package X;

/* loaded from: Kt5.class */
public abstract class Kt5 {
    public final int A00;
    public final int A01;

    public Kt5(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public byte[] A00() {
        byte[] bArr;
        if (this instanceof KJo) {
            KJo kJo = (KJo) this;
            int i = kJo.A01;
            int i2 = kJo.A00;
            int i3 = kJo.A01;
            if (i == i3 && i2 == kJo.A00) {
                bArr = kJo.A02;
            } else {
                int i4 = i * i2;
                bArr = new byte[i4];
                int i5 = 0;
                if (i == i3) {
                    System.arraycopy(kJo.A02, 0, bArr, 0, i4);
                    return bArr;
                }
                for (int i6 = 0; i6 < i2; i6++) {
                    System.arraycopy(kJo.A02, i5, bArr, i6 * i, i);
                    i5 += i3;
                }
            }
        } else {
            KJn kJn = (KJn) this;
            byte[] A00 = kJn.A00.A00();
            int i7 = kJn.A01 * kJn.A00;
            bArr = new byte[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                bArr[i8] = (byte) (255 - (A00[i8] & 255));
            }
        }
        return bArr;
    }

    public byte[] A01(byte[] bArr, int i) {
        if (this instanceof KJo) {
            KJo kJo = (KJo) this;
            if (i < 0 || i >= kJo.A00) {
                throw AnonymousClass001.A0L("Requested row is outside the image: ".concat(String.valueOf(i)));
            }
            int i2 = kJo.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            System.arraycopy(kJo.A02, i * kJo.A01, bArr, 0, i2);
        } else {
            KJn kJn = (KJn) this;
            bArr = kJn.A00.A01(bArr, i);
            int i3 = kJn.A01;
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i4] = (byte) (255 - (bArr[i4] & 255));
            }
        }
        return bArr;
    }

    public final String toString() {
        char c;
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder A0l = AnonymousClass001.A0l((i + 1) * i2);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return A0l.toString();
            }
            bArr = A01(bArr, i4);
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < i) {
                    int i7 = bArr[i6] & 255;
                    if (i7 < 64) {
                        c = '#';
                    } else if (i7 < 128) {
                        c = '+';
                    } else {
                        c = ' ';
                        if (i7 < 192) {
                            c = '.';
                        }
                    }
                    A0l.append(c);
                    i5 = i6 + 1;
                }
            }
            A0l.append('\n');
            i3 = i4 + 1;
        }
    }
}
