package X;

import java.util.Arrays;

/* loaded from: Lfd.class */
public final class Lfd implements MJ0 {
    public final MJ0 A00;
    public final KPX A01;
    public final byte[] A02;

    public Lfd(MJ0 mj0, KPX kpx, byte[] bArr) {
        this.A00 = mj0;
        this.A01 = kpx;
        this.A02 = bArr;
    }

    @Override // X.MJ0
    public byte[] AMP(byte[] bArr, byte[] bArr2) {
        MJ0 mj0;
        if (this.A01 == KPX.A03) {
            mj0 = this.A00;
        } else {
            if (!L9b.A02(this.A02, bArr)) {
                throw JQx.A10("wrong prefix");
            }
            mj0 = this.A00;
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
        }
        return mj0.AMP(bArr, bArr2);
    }

    @Override // X.MJ0
    public byte[] AQ2(byte[] bArr, byte[] bArr2) {
        if (this.A01 == KPX.A03) {
            return this.A00.AQ2(bArr, bArr2);
        }
        return L9R.A00(this.A00.AQ2(bArr, bArr2), this.A02);
    }
}
