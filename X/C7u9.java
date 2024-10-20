package X;

/* renamed from: X.7u9, reason: invalid class name */
/* loaded from: 7u9.class */
public final class C7u9 {
    public int A00;
    public final byte[] A01;

    public C7u9(C7u9 c7u9) {
        this.A00 = 0;
        this.A01 = c7u9.A01;
        this.A00 = c7u9.A00;
    }

    public C7u9(byte[] bArr) {
        this.A00 = 0;
        this.A01 = bArr;
    }

    public int A00() {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        do {
            byte[] bArr = this.A01;
            int i4 = this.A00;
            byte b = bArr[i4];
            this.A00 = i4 + 1;
            int i5 = b & 255;
            i |= (i5 & 127) << (i2 * 7);
            i3 <<= 7;
            i2++;
            if ((i5 & 128) != 128) {
                if (((i3 >> 1) & i) != 0) {
                    i |= i3;
                }
                return i;
            }
        } while (i2 < 5);
        throw AnonymousClass001.A0L("LEB128 larger than 28bit");
    }
}
