package org.tukaani.xz;

import X.AnonymousClass002;
import X.C0yx;
import X.C12p;
import java.io.DataOutputStream;
import java.io.IOException;
import org.tukaani.xz.lz.HC4;
import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.lzma.LZMAEncoder;
import org.tukaani.xz.lzma.LZMAEncoderNormal;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* loaded from: LZMA2OutputStream.class */
public final class LZMA2OutputStream extends C0yx {
    public C0yx A00;
    public final int A07;
    public final DataOutputStream A08;
    public final LZEncoder A09;
    public final RangeEncoder A0A;
    public final LZMAEncoder A0B;
    public boolean A01 = true;
    public boolean A03 = true;
    public boolean A02 = true;
    public int A04 = 0;
    public boolean A06 = false;
    public IOException A05 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class] */
    static {
        ?? r0 = "org.tukaani.xz.LZMA2OutputStream";
        try {
            r0 = Class.forName("org.tukaani.xz.LZMA2OutputStream");
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass002.A0N(r0);
        }
    }

    /* JADX WARN: Type inference failed for: r319v0, types: [org.tukaani.xz.lzma.LZMAEncoder, X.15b] */
    public LZMA2OutputStream(C0yx c0yx, LZMA2Options lZMA2Options) {
        LZEncoder hc4;
        LZMAEncoderNormal lZMAEncoderNormal;
        this.A00 = c0yx;
        this.A08 = new DataOutputStream(c0yx);
        RangeEncoder rangeEncoder = new RangeEncoder(65536);
        this.A0A = rangeEncoder;
        int i = lZMA2Options.A01;
        int i2 = 65536 > i ? 65536 - i : 0;
        int i3 = lZMA2Options.A02;
        int i4 = lZMA2Options.A06;
        int i5 = lZMA2Options.A04;
        int i6 = lZMA2Options.A05;
        int i7 = lZMA2Options.A03;
        int i8 = lZMA2Options.A00;
        Class cls = LZMAEncoder.A0F;
        if (i5 == 1) {
            int max = Math.max(i2, 1);
            LZEncoder lZEncoder = LZEncoder.$redex_init_class;
            if (i7 == 4) {
                hc4 = new HC4(i, max, 272, i6, i8);
            } else {
                if (i7 != 20) {
                    throw new IllegalArgumentException();
                }
                hc4 = new C12p(i, max, 272, i6, i8);
            }
            ?? lZMAEncoder = new LZMAEncoder(hc4, rangeEncoder, i3, i4, i, i6);
            lZMAEncoder.A00 = null;
            lZMAEncoderNormal = lZMAEncoder;
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException();
            }
            lZMAEncoderNormal = new LZMAEncoderNormal(rangeEncoder, i3, i4, i, i2, i6, i7, i8);
        }
        this.A0B = lZMAEncoderNormal;
        this.A09 = ((LZMAEncoder) lZMAEncoderNormal).A07;
        this.A07 = (lZMA2Options.A06 * 5 * 9) + lZMA2Options.A02;
    }

    private void A00() {
        int i;
        RangeEncoder rangeEncoder = this.A0A;
        int i2 = 0;
        do {
            RangeEncoder.A01(rangeEncoder);
            i2++;
        } while (i2 < 5);
        int i3 = rangeEncoder.A01;
        LZMAEncoder lZMAEncoder = this.A0B;
        int i4 = lZMAEncoder.A04;
        if (i3 + 2 < i4) {
            if (this.A02) {
                i = 192;
                if (this.A01) {
                    i = 224;
                }
            } else {
                i = 128;
                if (this.A03) {
                    i = 160;
                }
            }
            int i5 = i4 - 1;
            int i6 = i | (i5 >>> 16);
            DataOutputStream dataOutputStream = this.A08;
            dataOutputStream.writeByte(i6);
            dataOutputStream.writeShort(i5);
            dataOutputStream.writeShort(i3 - 1);
            if (this.A02) {
                dataOutputStream.writeByte(this.A07);
            }
            this.A00.write(rangeEncoder.A05, 0, rangeEncoder.A01);
            this.A02 = false;
            this.A03 = false;
            this.A01 = false;
        } else {
            lZMAEncoder.A05();
            i4 = lZMAEncoder.A04;
            int i7 = i4;
            while (true) {
                int i8 = 1;
                if (i7 <= 0) {
                    break;
                }
                int min = Math.min(i7, 65536);
                DataOutputStream dataOutputStream2 = this.A08;
                if (!this.A01) {
                    i8 = 2;
                }
                dataOutputStream2.writeByte(i8);
                dataOutputStream2.writeShort(min - 1);
                LZEncoder lZEncoder = this.A09;
                this.A00.write(lZEncoder.A08, (lZEncoder.A02 + 1) - i7, min);
                i7 -= min;
                this.A01 = false;
            }
            this.A03 = true;
        }
        this.A04 -= i4;
        lZMAEncoder.A04 = 0;
        rangeEncoder.A04 = 0L;
        rangeEncoder.A03 = -1;
        rangeEncoder.A00 = (byte) 0;
        rangeEncoder.A02 = 1;
        rangeEncoder.A01 = 0;
    }

    private void A01() {
        IOException iOException = this.A05;
        if (iOException != null) {
            throw iOException;
        }
        LZEncoder lZEncoder = this.A09;
        lZEncoder.A01 = lZEncoder.A03 - 1;
        lZEncoder.A04 = true;
        LZEncoder.A00(lZEncoder);
        while (this.A04 > 0) {
            try {
                this.A0B.A07();
                A00();
            } catch (IOException e) {
                this.A05 = e;
                throw e;
            }
        }
        this.A00.write(0);
        this.A06 = true;
    }

    @Override // X.C0yx
    public void A02() {
        if (this.A06) {
            return;
        }
        A01();
        try {
            this.A00.A02();
            this.A06 = true;
        } catch (IOException e) {
            this.A05 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A00 != null) {
            if (!this.A06) {
                try {
                    A01();
                } catch (IOException unused) {
                }
            }
            try {
                this.A00.close();
            } catch (IOException e) {
                if (this.A05 == null) {
                    this.A05 = e;
                }
            }
            this.A00 = null;
        }
        IOException iOException = this.A05;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        IOException iOException = this.A05;
        if (iOException == null) {
            if (!this.A06) {
                try {
                    LZEncoder lZEncoder = this.A09;
                    lZEncoder.A01 = lZEncoder.A03 - 1;
                    LZEncoder.A00(lZEncoder);
                    while (this.A04 > 0) {
                        this.A0B.A07();
                        A00();
                    }
                    this.A00.flush();
                    return;
                } catch (IOException e) {
                    this.A05 = e;
                    throw e;
                }
            }
            iOException = new IOException("Stream finished or closed");
        }
        throw iOException;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        AnonymousClass002.A0T(this, i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.A05;
        if (iOException == null) {
            if (!this.A06) {
                while (i2 > 0) {
                    try {
                        LZEncoder lZEncoder = this.A09;
                        int i4 = i2;
                        int i5 = lZEncoder.A02;
                        byte[] bArr2 = lZEncoder.A08;
                        int length = bArr2.length;
                        int i6 = lZEncoder.A05;
                        if (i5 >= length - i6) {
                            int i7 = ((i5 + 1) - lZEncoder.A06) & (-16);
                            System.arraycopy(bArr2, i7, bArr2, 0, lZEncoder.A03 - i7);
                            lZEncoder.A02 -= i7;
                            lZEncoder.A01 -= i7;
                            lZEncoder.A03 -= i7;
                        }
                        int i8 = lZEncoder.A03;
                        int i9 = length - i8;
                        if (i2 > i9) {
                            i4 = i9;
                        }
                        System.arraycopy(bArr, i, bArr2, i8, i4);
                        int i10 = lZEncoder.A03 + i4;
                        lZEncoder.A03 = i10;
                        if (i10 >= i6) {
                            lZEncoder.A01 = i10 - i6;
                        }
                        LZEncoder.A00(lZEncoder);
                        i += i4;
                        i2 -= i4;
                        this.A04 += i4;
                        if (this.A0B.A07()) {
                            A00();
                        }
                    } catch (IOException e) {
                        this.A05 = e;
                        throw e;
                    }
                }
                return;
            }
            iOException = new IOException("Stream finished or closed");
        }
        throw iOException;
    }
}
