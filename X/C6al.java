package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.6al, reason: invalid class name */
/* loaded from: 6al.class */
public final class C6al {
    public long A00;
    public C6am A01;
    public C6am A02;
    public C6am A03;
    public final 6XD A04;
    public final 6aO A05 = new 6aO(32);

    public C6al(6XD r302) {
        this.A04 = r302;
        C6am c6am = new C6am(0L);
        this.A01 = c6am;
        this.A02 = c6am;
        this.A03 = c6am;
    }

    public static int A00(C6al c6al, int i) {
        6XE r309;
        C6am c6am = c6al.A03;
        C6am c6am2 = c6am;
        if (c6am.A03 == null) {
            6XC r0 = c6al.A04;
            synchronized (r0) {
                int i2 = r0.A00 + 1;
                r0.A00 = i2;
                int i3 = r0.A01;
                if (i3 > 0) {
                    6XE[] r02 = r0.A02;
                    int i4 = i3 - 1;
                    r0.A01 = i4;
                    r309 = r02[i4];
                    r309.getClass();
                    r0.A02[r0.A01] = null;
                } else {
                    new 6XE(new byte[65536]);
                    6XE[] r03 = r0.A02;
                    int length = r03.length;
                    if (i2 > length) {
                        r0.A02 = (6XE[]) Arrays.copyOf(r03, length * 2);
                    }
                }
            }
            c6am2 = c6al.A03;
            C6am c6am3 = new C6am(c6am2.A00);
            c6am.A03 = r309;
            c6am.A02 = c6am3;
        }
        return Math.min(i, (int) (c6am2.A00 - c6al.A00));
    }

    public static C6am A01(6WD r301, C6am c6am, C6an c6an, 6aO r304) {
        long j;
        ByteBuffer byteBuffer;
        int i;
        if ((((6WE) r301).A00 & 1073741824) == 1073741824) {
            long j2 = c6an.A01;
            r304.A0N(1);
            C6am A03 = A03(c6am, r304.A02, 1, j2);
            long j3 = j2 + 1;
            byte b = r304.A02[0];
            boolean A1N = AnonymousClass001.A1N(b & 128);
            int i2 = b & Byte.MAX_VALUE;
            6WF r0 = r301.A06;
            byte[] bArr = r0.A00;
            if (bArr == null) {
                r0.A00 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c6am = A03(A03, r0.A00, i2, j3);
            long j4 = j3 + i2;
            if (A1N) {
                r304.A0N(2);
                c6am = A03(c6am, r304.A02, 2, j4);
                j4 += 2;
                i = r304.A0A();
            } else {
                i = 1;
            }
            int[] iArr = r0.A02;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = r0.A03;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (A1N) {
                int i3 = i * 6;
                r304.A0N(i3);
                c6am = A03(c6am, r304.A02, i3, j4);
                j4 += i3;
                r304.A0P(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = r304.A0A();
                    iArr2[i4] = r304.A09();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c6an.A00 - ((int) (j4 - c6an.A01));
            }
            C6ao c6ao = c6an.A02;
            byte[] bArr2 = c6ao.A03;
            byte[] bArr3 = r0.A00;
            int i5 = c6ao.A01;
            int i6 = c6ao.A02;
            int i7 = c6ao.A00;
            r0.A02 = iArr;
            r0.A03 = iArr2;
            r0.A01 = bArr2;
            r0.A00 = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = r0.A04;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            6WG r02 = r0.A05;
            r02.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = r02.A00;
            pattern.set(i6, i7);
            r02.A01.setPattern(pattern);
            long j5 = c6an.A01;
            int i8 = (int) (j4 - j5);
            c6an.A01 = j5 + i8;
            c6an.A00 -= i8;
        }
        if ((((6WE) r301).A00 & 268435456) == 268435456) {
            r304.A0N(4);
            C6am A032 = A03(c6am, r304.A02, 4, c6an.A01);
            int A09 = r304.A09();
            c6an.A01 += 4;
            c6an.A00 -= 4;
            r301.A02(A09);
            c6am = A02(A032, r301.A02, A09, c6an.A01);
            c6an.A01 += A09;
            int i9 = c6an.A00 - A09;
            c6an.A00 = i9;
            ByteBuffer byteBuffer2 = r301.A03;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i9) {
                r301.A03 = ByteBuffer.allocate(i9);
            } else {
                r301.A03.clear();
            }
            j = c6an.A01;
            byteBuffer = r301.A03;
        } else {
            r301.A02(c6an.A00);
            j = c6an.A01;
            byteBuffer = r301.A02;
        }
        return A02(c6am, byteBuffer, c6an.A00, j);
    }

    public static C6am A02(C6am c6am, ByteBuffer byteBuffer, int i, long j) {
        while (j >= c6am.A00) {
            c6am = c6am.A02;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c6am.A00 - j));
            byteBuffer.put(c6am.A03.A00, (int) (j - c6am.A01), min);
            i -= min;
            j += min;
            if (j == c6am.A00) {
                c6am = c6am.A02;
            }
        }
        return c6am;
    }

    public static C6am A03(C6am c6am, byte[] bArr, int i, long j) {
        while (j >= c6am.A00) {
            c6am = c6am.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c6am.A00 - j));
            System.arraycopy(c6am.A03.A00, (int) (j - c6am.A01), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c6am.A00) {
                c6am = c6am.A02;
            }
        }
        return c6am;
    }

    public static void A04(C6am c6am, C6al c6al) {
        if (c6am.A03 != null) {
            C6am c6am2 = c6am;
            6XC r0 = c6al.A04;
            synchronized (r0) {
                do {
                    6XE[] r02 = r0.A02;
                    int i = r0.A01;
                    r0.A01 = i + 1;
                    6XE r03 = c6am2.A03;
                    r03.getClass();
                    r02[i] = r03;
                    r0.A00--;
                    c6am2 = c6am2.A02;
                    if (c6am2 == null) {
                        break;
                    }
                } while (c6am2.A03 != null);
                r0.notifyAll();
            }
            c6am.A03 = null;
            c6am.A02 = null;
        }
    }

    public void A05(long j) {
        C6am c6am;
        if (j == -1) {
            return;
        }
        while (true) {
            c6am = this.A01;
            if (j < c6am.A00) {
                break;
            }
            6XC r0 = this.A04;
            6XE r02 = c6am.A03;
            6XC r03 = r0;
            synchronized (r03) {
                6XE[] r04 = r03.A02;
                int i = r03.A01;
                r03.A01 = i + 1;
                r04[i] = r02;
                r03.A00--;
                r03.notifyAll();
            }
            C6am c6am2 = this.A01;
            c6am2.A03 = null;
            C6am c6am3 = c6am2.A02;
            c6am2.A02 = null;
            this.A01 = c6am3;
        }
        if (this.A02.A01 < c6am.A01) {
            this.A02 = c6am;
        }
    }
}
