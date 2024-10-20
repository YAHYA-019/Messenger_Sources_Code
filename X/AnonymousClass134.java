package X;

import org.tukaani.xz.lzma.LZMAEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* renamed from: X.134, reason: invalid class name */
/* loaded from: 134.class */
public final class AnonymousClass134 {
    public static final AnonymousClass134 $redex_init_class = null;
    public AnonymousClass130[] A00;
    public final int A01;
    public final int A02 = (1 << 0) - 1;
    public final /* synthetic */ C0yj A03;
    public final /* synthetic */ LZMAEncoder A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Class] */
    static {
        if (LZMAEncoder.A0F == null) {
            ?? r0 = "org.tukaani.xz.lzma.LZMAEncoder";
            try {
                r0 = Class.forName("org.tukaani.xz.lzma.LZMAEncoder");
                LZMAEncoder.A0F = r0;
            } catch (ClassNotFoundException unused) {
                throw AnonymousClass002.A0N(r0);
            }
        }
    }

    public AnonymousClass134(LZMAEncoder lZMAEncoder, int i) {
        this.A04 = lZMAEncoder;
        this.A03 = lZMAEncoder;
        this.A01 = i;
        int i2 = 1 << i;
        AnonymousClass130[] anonymousClass130Arr = new AnonymousClass130[i2];
        this.A00 = anonymousClass130Arr;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return;
            }
            anonymousClass130Arr[i4] = new AnonymousClass130(this);
            i3 = i4 + 1;
        }
    }

    public int A00(C0ye c0ye, int i, int i2, int i3, int i4) {
        int i5;
        LZMAEncoder lZMAEncoder = this.A04;
        short[][] sArr = ((C0yj) lZMAEncoder).A0A;
        int i6 = c0ye.A00;
        short s = sArr[i6][((C0yj) lZMAEncoder).A00 & i4];
        int[] iArr = RangeEncoder.A06;
        int i7 = iArr[s >>> 4];
        int i8 = this.A01;
        int i9 = (i3 >> (8 - i8)) + ((i4 & this.A02) << i8);
        AnonymousClass130[] anonymousClass130Arr = this.A00;
        if (i6 < 7) {
            AnonymousClass130 anonymousClass130 = anonymousClass130Arr[i9];
            int i10 = i | 256;
            i5 = 0;
            do {
                i5 = AnonymousClass002.A08(iArr, anonymousClass130.A00[i10 >>> 8], (-((i10 >>> 7) & 1)) & 2047, i5);
                i10 <<= 1;
            } while (i10 < 65536);
        } else {
            AnonymousClass130 anonymousClass1302 = anonymousClass130Arr[i9];
            int i11 = 256;
            int i12 = i | 256;
            i5 = 0;
            do {
                i2 <<= 1;
                i5 = AnonymousClass002.A08(iArr, anonymousClass1302.A00[(i2 & i11) + i11 + (i12 >>> 8)], (-((i12 >>> 7) & 1)) & 2047, i5);
                i12 <<= 1;
                i11 &= (i2 ^ i12) ^ (-1);
            } while (i12 < 65536);
        }
        return i7 + i5;
    }
}
