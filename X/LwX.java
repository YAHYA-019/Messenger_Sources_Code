package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: LwX.class */
public final class LwX implements MRZ, MRY, Cloneable, ByteChannel {
    public static final byte[] A02 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public long A00;
    public L8p A01;

    public static String A00(Charset charset, LwX lwX, long j) {
        String A0y;
        Ky2.A00(lwX.A00, 0L, j);
        if (charset == null) {
            throw AnonymousClass001.A0L("charset == null");
        }
        if (j > 2147483647L) {
            throw JQy.A0h("byteCount > Integer.MAX_VALUE: ", j);
        }
        if (j == 0) {
            A0y = "";
        } else {
            L8p l8p = lwX.A01;
            int i = l8p.A01;
            if (i + j > l8p.A00) {
                return new String(lwX.Caw(j), charset);
            }
            A0y = JQx.A0y(charset, l8p.A06, i, (int) j);
            int i2 = (int) (l8p.A01 + j);
            l8p.A01 = i2;
            lwX.A00 -= j;
            if (i2 == l8p.A00) {
                L8p.A00(lwX, l8p);
                return A0y;
            }
        }
        return A0y;
    }

    public final byte A01(long j) {
        L8p l8p;
        int i;
        long j2 = j;
        Ky2.A00(this.A00, j, 1L);
        long j3 = this.A00;
        if (j3 - j > j) {
            L8p l8p2 = this.A01;
            while (true) {
                l8p = l8p2;
                int i2 = l8p.A00;
                i = l8p.A01;
                long j4 = i2 - i;
                if (j2 < j4) {
                    break;
                }
                j2 -= j4;
                l8p2 = l8p.A02;
            }
        } else {
            j2 = j - j3;
            l8p = this.A01;
            do {
                l8p = l8p.A03;
                int i3 = l8p.A00;
                i = l8p.A01;
                j2 += i3 - i;
            } while (j2 < 0);
        }
        return l8p.A06[i + ((int) j2)];
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        r315 = r0[r0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A02(X.LyF r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LwX.A02(X.LyF, boolean):int");
    }

    public int A03(byte[] bArr, int i, int i2) {
        int A0D;
        Ky2.A00(bArr.length, i, i2);
        L8p l8p = this.A01;
        if (l8p == null) {
            A0D = -1;
        } else {
            int i3 = l8p.A00;
            int i4 = l8p.A01;
            A0D = JQx.A0D(i3, i4, i2);
            System.arraycopy(l8p.A06, i4, bArr, i, A0D);
            int i5 = l8p.A01 + A0D;
            l8p.A01 = i5;
            this.A00 -= A0D;
            if (i5 == l8p.A00) {
                L8p.A00(this, l8p);
                return A0D;
            }
        }
        return A0D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x014e, code lost:
    
        r315 = r315 + (r0 - r0);
        r319 = r319.A02;
        r307 = r315;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A04(byte r302, long r303, long r305) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LwX.A04(byte, long, long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b4, code lost:
    
        r325 = r325 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A05(X.Lix r302, long r303) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LwX.A05(X.Lix, long):long");
    }

    public String A06() {
        String A00;
        try {
            A00 = A00(Ky2.A00, this, this.A00);
            return A00;
        } catch (EOFException unused) {
            throw AnonymousClass001.A0J(A00);
        }
    }

    public String A07(long j) {
        String A00;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (A01(j3) == 13) {
                A00 = A00(Ky2.A00, this, j3);
                j2 = 2;
                D0k(j2);
                return A00;
            }
        }
        A00 = A00(Ky2.A00, this, j);
        D0k(j2);
        return A00;
    }

    public Lix A08() {
        byte[] Caw;
        try {
            Caw = Caw(this.A00);
            return new Lix(Caw);
        } catch (EOFException unused) {
            throw AnonymousClass001.A0J(Caw);
        }
    }

    public L8p A09(int i) {
        L8p l8p;
        if (i < 1 || i > 8192) {
            throw JQx.A0n();
        }
        L8p l8p2 = this.A01;
        if (l8p2 == null) {
            l8p = L72.A00();
            this.A01 = l8p;
            l8p.A03 = l8p;
            l8p.A02 = l8p;
        } else {
            l8p = l8p2.A03;
            if (l8p.A00 + i > 8192 || !l8p.A04) {
                L8p A00 = L72.A00();
                l8p.A03(A00);
                return A00;
            }
        }
        return l8p;
    }

    public final void A0A() {
        try {
            D0k(this.A00);
        } catch (EOFException unused) {
            throw AnonymousClass001.A0J(this);
        }
    }

    public void A0B(int i) {
        L8p A09 = A09(1);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        A09.A00 = i2 + 1;
        bArr[i2] = (byte) i;
        this.A00++;
    }

    public void A0C(int i) {
        L8p A09 = A09(4);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        int i3 = i2 + 1;
        JQx.A17(i >>> 24, bArr, i2);
        int i4 = i3 + 1;
        JQx.A17(i >>> 16, bArr, i3);
        int i5 = i4 + 1;
        JQx.A17(i >>> 8, bArr, i4);
        JQx.A17(i, bArr, i5);
        A09.A00 = i5 + 1;
        this.A00 += 4;
    }

    public void A0D(int i) {
        L8p A09 = A09(2);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        int i3 = i2 + 1;
        JQx.A17(i >>> 8, bArr, i2);
        JQx.A17(i, bArr, i3);
        A09.A00 = i3 + 1;
        this.A00 += 2;
    }

    public void A0E(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        A0B(63);
                        return;
                    }
                    i2 = (i >> 12) | 224;
                } else {
                    if (i > 1114111) {
                        throw 0Pz.A05("Unexpected code point: ", Integer.toHexString(i));
                    }
                    A0B((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                A0B(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            A0B(i3);
            i = (i & 63) | 128;
        }
        A0B(i);
    }

    public void A0F(long j) {
        if (j == 0) {
            A0B(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        L8p A09 = A09(numberOfTrailingZeros);
        byte[] bArr = A09.A06;
        int i = A09.A00;
        int i2 = i + numberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 < i) {
                A09.A00 = i2;
                this.A00 += numberOfTrailingZeros;
                return;
            } else {
                bArr[i2] = A02[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    public void A0G(String str, int i, int i2) {
        int i3;
        char charAt;
        int i4;
        int i5;
        if (i < 0) {
            throw 0Pz.A04("beginIndex < 0: ", i);
        }
        if (i2 < i) {
            throw JQy.A0i("endIndex < beginIndex: ", " < ", i2, i);
        }
        int length = str.length();
        if (i2 > length) {
            throw JQy.A0i("endIndex > string.length: ", " > ", i2, length);
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                L8p A09 = A09(1);
                byte[] bArr = A09.A06;
                int i6 = A09.A00 - i;
                int min = Math.min(i2, 8192 - i6);
                i3 = i + 1;
                bArr[i + i6] = (byte) charAt2;
                while (i3 < min && (charAt = str.charAt(i3)) < 128) {
                    bArr[i3 + i6] = (byte) charAt;
                    i3++;
                }
                int i7 = i6 + i3;
                int i8 = A09.A00;
                int i9 = i7 - i8;
                A09.A00 = i8 + i9;
                this.A00 += i9;
            } else {
                if (charAt2 < 2048) {
                    i4 = charAt2 >> 6;
                    i5 = 192;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    A0B((charAt2 >> '\f') | 224);
                    i4 = (charAt2 >> 6) & 63;
                    i5 = 128;
                } else {
                    i3 = i + 1;
                    char charAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        A0B(63);
                    } else {
                        int i10 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        A0B((i10 >> 18) | 240);
                        A0B(((i10 >> 12) & 63) | 128);
                        A0B(((i10 >> 6) & 63) | 128);
                        A0B((i10 & 63) | 128);
                        i += 2;
                    }
                }
                A0B(i4 | i5);
                A0B((charAt2 & '?') | 128);
                i++;
            }
            i = i3;
        }
    }

    public final void A0H(LwX lwX, long j, long j2) {
        L8p l8p;
        long j3 = j2;
        long j4 = j;
        if (lwX == null) {
            throw AnonymousClass001.A0L("out == null");
        }
        Ky2.A00(this.A00, j, j2);
        if (j2 != 0) {
            lwX.A00 += j2;
            L8p l8p2 = this.A01;
            while (true) {
                l8p = l8p2;
                if (j4 < l8p.A00 - l8p.A01) {
                    break;
                }
                j4 -= l8p.A00 - l8p.A01;
                l8p2 = l8p.A02;
            }
            while (j3 > 0) {
                L8p A022 = l8p.A02();
                int i = (int) (A022.A01 + j4);
                A022.A01 = i;
                A022.A00 = Math.min(i + ((int) j3), A022.A00);
                L8p l8p3 = lwX.A01;
                if (l8p3 == null) {
                    A022.A03 = A022;
                    A022.A02 = A022;
                    lwX.A01 = A022;
                } else {
                    l8p3.A03.A03(A022);
                }
                j3 -= A022.A00 - A022.A01;
                l8p = l8p.A02;
                j4 = 0;
            }
        }
    }

    public void A0I(byte[] bArr, int i) {
        int i2 = 0;
        if (bArr == null) {
            throw AnonymousClass001.A0L("source == null");
        }
        long j = i;
        Ky2.A00(bArr.length, 0L, j);
        while (i2 < i) {
            L8p A09 = A09(1);
            int i3 = A09.A00;
            int min = Math.min(i - i2, 8192 - i3);
            System.arraycopy(bArr, i2, A09.A06, i3, min);
            i2 += min;
            A09.A00 += min;
        }
        this.A00 += j;
    }

    @Override // X.MRZ, X.MRY
    public LwX ACc() {
        return this;
    }

    @Override // X.MRZ
    public boolean ARO() {
        return AnonymousClass001.A1O((this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1)));
    }

    @Override // X.MRZ
    public LwX Aa7() {
        return this;
    }

    @Override // X.MRZ
    public long BOb(byte b) {
        return A04((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Override // X.MRZ
    public long BOc(Lix lix) {
        return A05(lix, 0L);
    }

    @Override // X.MRZ
    public InputStream BPa() {
        return new KLz(this);
    }

    @Override // X.MQv
    public long Cat(LwX lwX, long j) {
        if (lwX == null) {
            throw AnonymousClass001.A0L("sink == null");
        }
        if (j < 0) {
            throw JQy.A0h("byteCount < 0: ", j);
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        if (j > j2) {
            j = j2;
        }
        lwX.DAx(this, j);
        return j;
    }

    @Override // X.MRZ
    public byte[] Caw(long j) {
        Ky2.A00(this.A00, 0L, j);
        if (j > 2147483647L) {
            throw JQy.A0h("byteCount > Integer.MAX_VALUE: ", j);
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return bArr;
            }
            int A03 = A03(bArr, i3, i - i3);
            if (A03 == -1) {
                throw new EOFException();
            }
            i2 = i3 + A03;
        }
    }

    @Override // X.MRZ
    public Lix Cax(long j) {
        return new Lix(Caw(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104 A[EDGE_INSN: B:40:0x0104->B:37:0x0104 BREAK  A[LOOP:0: B:4:0x001a->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.LwX, java.lang.Object] */
    @Override // X.MRZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long Cb2() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LwX.Cb2():long");
    }

    @Override // X.MRZ
    public int Cb3() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // X.MRZ
    public short CbA() {
        int readShort = readShort() & ((char) (-1));
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // X.MRZ
    public String CbC() {
        return CbD(Long.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.LwX, java.lang.Object] */
    @Override // X.MRZ
    public String CbD(long j) {
        if (j < 0) {
            throw JQy.A0h("limit < 0: ", j);
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        long A04 = A04((byte) 10, 0L, j2);
        if (A04 != -1) {
            return A07(A04);
        }
        if (j2 < this.A00 && A01(j2 - 1) == 13 && A01(j2) == 10) {
            return A07(j2);
        }
        ?? obj = new Object();
        A0H(obj, 0L, Math.min(32, this.A00));
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("\\n not found: limit=");
        A0k.append(Math.min(this.A00, j));
        A0k.append(" content=");
        A0k.append(obj.A08().A08());
        throw new EOFException(AnonymousClass001.A0g(A0k, (char) 8230));
    }

    @Override // X.MRZ
    public boolean Cgi(long j) {
        return 1BL.A1S((this.A00 > j ? 1 : (this.A00 == j ? 0 : -1)));
    }

    @Override // X.MRZ
    public void ChH(long j) {
        if (this.A00 < j) {
            throw new EOFException();
        }
    }

    @Override // X.MRZ
    public int CkH(LyF lyF) {
        int A022 = A02(lyF, false);
        if (A022 == -1) {
            return -1;
        }
        try {
            D0k(lyF.A01[A022].A06());
            return A022;
        } catch (EOFException unused) {
            throw JQx.A0m();
        }
    }

    @Override // X.MRZ
    public void D0k(long j) {
        while (j > 0) {
            L8p l8p = this.A01;
            if (l8p == null) {
                throw new EOFException();
            }
            int i = l8p.A00;
            int i2 = l8p.A01;
            int min = (int) Math.min(j, i - i2);
            long j2 = min;
            this.A00 -= j2;
            j -= j2;
            int i3 = i2 + min;
            l8p.A01 = i3;
            if (i3 == i) {
                L8p.A00(this, l8p);
            }
        }
    }

    @Override // X.MQv, X.MQy
    public L5K D4G() {
        return L5K.A03;
    }

    @Override // X.MRY
    public /* bridge */ /* synthetic */ MRY DAr(byte[] bArr) {
        if (bArr == null) {
            throw AnonymousClass001.A0L("source == null");
        }
        A0I(bArr, bArr.length);
        return this;
    }

    @Override // X.MQy
    public void DAx(LwX lwX, long j) {
        L8p A00;
        L8p l8p;
        long j2 = j;
        if (lwX == null) {
            throw AnonymousClass001.A0L("source == null");
        }
        if (lwX == this) {
            throw AnonymousClass001.A0L("source == this");
        }
        Ky2.A00(lwX.A00, 0L, j);
        while (j2 > 0) {
            L8p l8p2 = lwX.A01;
            int i = l8p2.A00 - l8p2.A01;
            if (j2 < i) {
                L8p l8p3 = this.A01;
                if (l8p3 != null && (l8p = l8p3.A03) != null && l8p.A04) {
                    if ((l8p.A00 + j2) - (l8p.A05 ? 0 : l8p.A01) <= OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) {
                        l8p2.A04(l8p, (int) j2);
                        lwX.A00 -= j2;
                        this.A00 += j2;
                        return;
                    }
                }
                int i2 = (int) j2;
                if (i2 <= 0 || i2 > i) {
                    throw JQx.A0n();
                }
                if (i2 >= 1024) {
                    A00 = l8p2.A02();
                } else {
                    A00 = L72.A00();
                    System.arraycopy(l8p2.A06, l8p2.A01, A00.A06, 0, i2);
                }
                A00.A00 = A00.A01 + i2;
                l8p2.A01 += i2;
                l8p2.A03.A03(A00);
                lwX.A01 = A00;
                l8p2 = A00;
            }
            int i3 = l8p2.A00 - l8p2.A01;
            long j3 = i3;
            lwX.A01 = l8p2.A01();
            L8p l8p4 = this.A01;
            if (l8p4 == null) {
                this.A01 = l8p2;
                l8p2.A03 = l8p2;
                l8p2.A02 = l8p2;
            } else {
                l8p4.A03.A03(l8p2);
                L8p l8p5 = l8p2.A03;
                if (l8p5 == l8p2) {
                    throw JQx.A0o();
                }
                if (l8p5.A04) {
                    if (i3 <= (8192 - l8p5.A00) + (l8p5.A05 ? 0 : l8p5.A01)) {
                        l8p2.A04(l8p5, i3);
                        l8p2.A01();
                        L72.A01(l8p2);
                    }
                }
            }
            lwX.A00 -= j3;
            this.A00 += j3;
            j2 -= j3;
        }
    }

    @Override // X.MRY
    public /* bridge */ /* synthetic */ MRY DB2(int i) {
        A0B(i);
        return this;
    }

    @Override // X.MRY
    public /* bridge */ /* synthetic */ MRY DB8(long j) {
        A0F(j);
        return this;
    }

    @Override // X.MRY
    public /* bridge */ /* synthetic */ MRY DBA(int i) {
        A0C(i);
        return this;
    }

    @Override // X.MRY
    public /* bridge */ /* synthetic */ MRY DBG(int i) {
        A0D(i);
        return this;
    }

    @Override // X.MRY
    public /* bridge */ /* synthetic */ MRY DBM(String str) {
        A0G(str, 0, str.length());
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LwX, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object clone() {
        ?? obj = new Object();
        long j = this.A00;
        if (j != 0) {
            L8p A022 = this.A01.A02();
            obj.A01 = A022;
            A022.A03 = A022;
            A022.A02 = A022;
            L8p l8p = this.A01;
            while (true) {
                l8p = l8p.A02;
                if (l8p == l8p) {
                    break;
                }
                A022.A03.A03(l8p.A02());
            }
            obj.A00 = j;
        }
        return obj;
    }

    @Override // X.MQv, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, X.MQy
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LwX)) {
                return false;
            }
            LwX lwX = (LwX) obj;
            long j = this.A00;
            if (j != lwX.A00) {
                return false;
            }
            long j2 = 0;
            if (j != 0) {
                L8p l8p = this.A01;
                L8p l8p2 = lwX.A01;
                int i = l8p.A01;
                int i2 = l8p2.A01;
                while (j2 < j) {
                    long A0D = JQx.A0D(l8p2.A00, i2, l8p.A00 - i);
                    int i3 = 0;
                    while (i3 < A0D) {
                        int i4 = i + 1;
                        int i5 = i2 + 1;
                        if (l8p.A06[i] != l8p2.A06[i2]) {
                            return false;
                        }
                        i3++;
                        i = i4;
                        i2 = i5;
                    }
                    if (i == l8p.A00) {
                        l8p = l8p.A02;
                        i = l8p.A01;
                    }
                    if (i2 == l8p2.A00) {
                        l8p2 = l8p2.A02;
                        i2 = l8p2.A01;
                    }
                    j2 += A0D;
                }
            }
        }
        return true;
    }

    @Override // X.MRY, X.MQy, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        L8p l8p = this.A01;
        int i = 1;
        if (l8p == null) {
            return 0;
        }
        do {
            int i2 = l8p.A00;
            for (int i3 = l8p.A01; i3 < i2; i3++) {
                i = (i * 31) + l8p.A06[i3];
            }
            l8p = l8p.A02;
        } while (l8p != l8p);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        int A0D;
        L8p l8p = this.A01;
        if (l8p == null) {
            A0D = -1;
        } else {
            int remaining = byteBuffer.remaining();
            int i = l8p.A00;
            int i2 = l8p.A01;
            A0D = JQx.A0D(i, i2, remaining);
            byteBuffer.put(l8p.A06, i2, A0D);
            int i3 = l8p.A01 + A0D;
            l8p.A01 = i3;
            this.A00 -= A0D;
            if (i3 == l8p.A00) {
                L8p.A00(this, l8p);
                return A0D;
            }
        }
        return A0D;
    }

    @Override // X.MRZ
    public byte readByte() {
        long j = this.A00;
        if (j == 0) {
            throw AnonymousClass001.A0N("size == 0");
        }
        L8p l8p = this.A01;
        int i = l8p.A01;
        int i2 = l8p.A00;
        byte[] bArr = l8p.A06;
        int i3 = i + 1;
        byte b = bArr[i];
        this.A00 = j - 1;
        if (i3 == i2) {
            L8p.A00(this, l8p);
            return b;
        }
        l8p.A01 = i3;
        return b;
    }

    @Override // X.MRZ
    public int readInt() {
        long j = this.A00;
        long j2 = 4;
        if (j < j2) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0h(AnonymousClass001.A0n("size < 4: "), j));
        }
        L8p l8p = this.A01;
        int i = l8p.A01;
        int i2 = l8p.A00;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = l8p.A06;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 24;
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        this.A00 = j - j2;
        if (i9 == i2) {
            L8p.A00(this, l8p);
            return i10;
        }
        l8p.A01 = i9;
        return i10;
    }

    @Override // X.MRZ
    public short readShort() {
        int i;
        long j = this.A00;
        long j2 = 2;
        if (j < j2) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0h(AnonymousClass001.A0n("size < 2: "), j));
        }
        L8p l8p = this.A01;
        int i2 = l8p.A01;
        int i3 = l8p.A00;
        if (i3 - i2 < 2) {
            i = ((readByte() & 255) << 8) | (readByte() & 255);
        } else {
            byte[] bArr = l8p.A06;
            int i4 = i2 + 1;
            int i5 = (bArr[i2] & 255) << 8;
            int i6 = i4 + 1;
            i = i5 | (bArr[i4] & 255);
            this.A00 = j - j2;
            if (i6 == i3) {
                L8p.A00(this, l8p);
            } else {
                l8p.A01 = i6;
            }
        }
        return (short) i;
    }

    public String toString() {
        long j = this.A00;
        if (j > 2147483647L) {
            throw JQy.A0h("size > Integer.MAX_VALUE: ", j);
        }
        int i = (int) j;
        return (i == 0 ? Lix.A02 : new MAV(this, i)).toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw AnonymousClass001.A0L("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            L8p A09 = A09(1);
            int i2 = A09.A00;
            int min = Math.min(i, 8192 - i2);
            byteBuffer.get(A09.A06, i2, min);
            i -= min;
            A09.A00 += min;
        }
        this.A00 += remaining;
        return remaining;
    }
}
