package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;

/* loaded from: Li4.class */
public final class Li4 implements Closeable {
    public Ki6 A00;
    public final InputStream A02;
    public final byte[] A03 = new byte[8];
    public final L1T A01 = new L1T();

    public Li4(InputStream inputStream) {
        this.A02 = inputStream;
    }

    public static final long A00(Li4 li4) {
        long j;
        long j2;
        Ki6 ki6 = li4.A00;
        byte b = ki6.A01;
        if (b < 24) {
            long j3 = b;
            li4.A00 = null;
            return j3;
        }
        if (b == 24) {
            int read = li4.A02.read();
            if (read == -1) {
                throw new EOFException();
            }
            li4.A00 = null;
            return read & 255;
        }
        if (b == 25) {
            li4.A03(li4.A03, 2);
            return ((r0[0] & 255) << 8) | (255 & r0[1]);
        }
        if (b == 26) {
            byte[] bArr = li4.A03;
            li4.A03(bArr, 4);
            long j4 = bArr[0];
            long j5 = bArr[1];
            long j6 = bArr[2];
            j = ((j5 & 255) << 16) | ((j4 & 255) << 24) | ((j6 & 255) << 8);
            j2 = bArr[3] & 255;
        } else {
            if (b != 27) {
                throw AnonymousClass001.A0G(String.format("invalid additional information %s for major type %s", AnonymousClass001.A1b(Byte.valueOf(b), (ki6.A00 >> 5) & 7)));
            }
            byte[] bArr2 = li4.A03;
            li4.A03(bArr2, 8);
            long j7 = bArr2[0];
            long j8 = bArr2[1];
            long j9 = bArr2[2];
            long j10 = bArr2[3];
            long j11 = bArr2[4];
            long j12 = bArr2[5];
            long j13 = bArr2[6];
            long j14 = bArr2[7];
            long j15 = (j11 & 255) << 24;
            long j16 = j7 & 255;
            long j17 = j8 & 255;
            long j18 = j9 & 255;
            long j19 = j10 & 255;
            j = ((j12 & 255) << 16) | (j18 << 40) | (j16 << 56) | (j17 << 48) | (j19 << 32) | j15 | ((j13 & 255) << 8);
            j2 = j14 & 255;
        }
        return j2 | j;
    }

    public static final void A01(Li4 li4) {
        li4.A05();
        byte b = li4.A00.A01;
        if (b == 31) {
            throw JQy.A0k("expected definite length but found %s", new Object[]{Byte.valueOf(b)});
        }
    }

    public static final void A02(Li4 li4, byte b) {
        li4.A05();
        byte b2 = li4.A00.A00;
        if (b2 != b) {
            throw JQy.A0k("expected major type %s but found %s", AnonymousClass001.A1b(Integer.valueOf((b >> 5) & 7), (b2 >> 5) & 7));
        }
    }

    private final void A03(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 == i) {
                this.A00 = null;
                return;
            }
            int read = this.A02.read(bArr, i3, i - i3);
            if (read == -1) {
                throw new EOFException();
            }
            i2 = i3 + read;
        }
    }

    public static final byte[] A04(Li4 li4) {
        A01(li4);
        long A00 = A00(li4);
        if (A00 < 0 || A00 > 2147483647L) {
            throw AnonymousClass001.A0q(String.format("the maximum supported byte/text string length is %s bytes", AnonymousClass001.A1a((-1) >>> 1)));
        }
        if (li4.A02.available() < A00) {
            throw new EOFException();
        }
        int i = (int) A00;
        byte[] bArr = new byte[i];
        li4.A03(bArr, i);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f9, code lost:
    
        if (r0 == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.Ki6 A05() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Li4.A05():X.Ki6");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
        this.A01.A01();
    }
}
