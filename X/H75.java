package X;

import android.net.Uri;

/* loaded from: H75.class */
public final class H75 extends 6DJ {
    public int A00;
    public int A01;
    public Uri A02;
    public boolean A03;
    public final byte[] A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H75(byte[] bArr) {
        super(false);
        boolean z = false;
        bArr.getClass();
        6DP.A03(bArr.length > 0 ? true : z);
        this.A04 = bArr;
    }

    public Uri BIM() {
        return this.A02;
    }

    public long CVO(6DQ r302) {
        this.A02 = r302.A06;
        A02();
        long j = r302.A04;
        int length = this.A04.length;
        if (j > length) {
            throw new 6Dc();
        }
        int i = (int) j;
        this.A01 = i;
        int i2 = length - i;
        this.A00 = i2;
        long j2 = r302.A03;
        long j3 = -1;
        if (j2 != j3) {
            this.A00 = (int) Math.min(i2, j2);
        }
        this.A03 = true;
        A04(r302);
        if (j2 == j3) {
            j2 = this.A00;
        }
        return j2;
    }

    public void close() {
        if (this.A03) {
            this.A03 = false;
            A01();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A04, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A03(min);
        return min;
    }
}
