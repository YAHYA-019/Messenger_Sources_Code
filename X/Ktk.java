package X;

/* loaded from: Ktk.class */
public final class Ktk {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final byte[] A06 = new byte[10];

    /* JADX WARN: Multi-variable type inference failed */
    public void A00(6aJ r302) {
        if (this.A01) {
            return;
        }
        byte[] bArr = this.A06;
        r302.CWz(bArr, 0, 10);
        ((6aI) r302).A01 = 0;
        byte b = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                if ((b2 & 255) == 187) {
                    b = true;
                }
                byte b3 = 8;
                if (b != false) {
                    b3 = 9;
                }
                if ((40 << ((bArr[b3 == true ? 1 : 0] >> 4) & 7)) != 0) {
                    this.A01 = true;
                }
            }
        }
    }

    public void A01(C6ao c6ao, C6a5 c6a5) {
        if (this.A00 > 0) {
            c6a5.CjG(c6ao, this.A02, this.A04, this.A03, this.A05);
            this.A00 = 0;
        }
    }

    public void A02(C6ao c6ao, C6a5 c6a5, int i, int i2, int i3, long j) {
        if (!DKD.A1V(this.A03, i2 + i3)) {
            throw AnonymousClass001.A0N(String.valueOf("TrueHD chunk samples must be contiguous in the sample queue."));
        }
        if (this.A01) {
            int i4 = this.A00;
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i4 == 0) {
                this.A05 = j;
                this.A02 = i;
                this.A04 = 0;
            }
            this.A04 += i2;
            this.A03 = i3;
            if (i5 >= 16) {
                A01(c6ao, c6a5);
            }
        }
    }
}
