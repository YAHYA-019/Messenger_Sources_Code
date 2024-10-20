package X;

import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.lzma.LZMAEncoder;

/* renamed from: X.130, reason: invalid class name */
/* loaded from: 130.class */
public final class AnonymousClass130 {
    public final short[] A00 = new short[768];
    public final /* synthetic */ AnonymousClass134 A01;
    public final /* synthetic */ AnonymousClass134 A02;

    public AnonymousClass130(AnonymousClass134 anonymousClass134) {
        this.A02 = anonymousClass134;
        this.A01 = anonymousClass134;
    }

    public void A00() {
        AnonymousClass134 anonymousClass134 = this.A02;
        AnonymousClass134 anonymousClass1342 = AnonymousClass134.$redex_init_class;
        LZMAEncoder lZMAEncoder = anonymousClass134.A04;
        LZEncoder lZEncoder = lZMAEncoder.A07;
        int i = lZMAEncoder.A03;
        byte[] bArr = lZEncoder.A08;
        int i2 = lZEncoder.A02;
        int i3 = 256;
        int i4 = (bArr[i2 - i] & 255) | 256;
        C0ye c0ye = ((C0yj) lZMAEncoder).A01;
        if (!AnonymousClass001.A1R(c0ye.A00, 7)) {
            int i5 = bArr[i2 - ((((C0yj) lZMAEncoder).A02[0] + 1) + i)] & 255;
            do {
                i5 <<= 1;
                lZMAEncoder.A0B.A03(this.A00, (i5 & i3) + i3 + (i4 >>> 8), (i4 >>> 7) & 1);
                i4 <<= 1;
                i3 &= (i5 ^ i4) ^ (-1);
            } while (i4 < 65536);
            c0ye.A00();
        }
        do {
            lZMAEncoder.A0B.A03(this.A00, i4 >>> 8, (i4 >>> 7) & 1);
            i4 <<= 1;
        } while (i4 < 65536);
        c0ye.A00();
    }
}
