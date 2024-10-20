package X;

/* loaded from: L8p.class */
public final class L8p {
    public int A00;
    public int A01;
    public L8p A02;
    public L8p A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public L8p() {
        this.A06 = new byte[8192];
        this.A04 = true;
        this.A05 = false;
    }

    public L8p(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = true;
        this.A04 = false;
    }

    public static void A00(LwX lwX, L8p l8p) {
        lwX.A01 = l8p.A01();
        L72.A01(l8p);
    }

    public final L8p A01() {
        L8p l8p = this.A02;
        L8p l8p2 = null;
        if (l8p != this) {
            l8p2 = l8p;
        }
        L8p l8p3 = this.A03;
        l8p3.A02 = l8p;
        this.A02.A03 = l8p3;
        this.A02 = null;
        this.A03 = null;
        return l8p2;
    }

    public final L8p A02() {
        this.A05 = true;
        return new L8p(this.A06, this.A01, this.A00);
    }

    public final void A03(L8p l8p) {
        l8p.A03 = this;
        l8p.A02 = this.A02;
        this.A02.A03 = l8p;
        this.A02 = l8p;
    }

    public final void A04(L8p l8p, int i) {
        if (!l8p.A04) {
            throw JQx.A0n();
        }
        int i2 = l8p.A00;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (l8p.A05) {
                throw JQx.A0n();
            }
            int i4 = l8p.A01;
            if (i3 - i4 > 8192) {
                throw JQx.A0n();
            }
            byte[] bArr = l8p.A06;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = l8p.A00 - l8p.A01;
            l8p.A00 = i2;
            l8p.A01 = 0;
        }
        System.arraycopy(this.A06, this.A01, l8p.A06, i2, i);
        l8p.A00 += i;
        this.A01 += i;
    }
}
