package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: H8m.class */
public final class H8m extends FilterInputStream {
    public int A00;
    public int A01;
    public final byte[] A02;

    public H8m(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        bArr.getClass();
        this.A02 = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.A01 = this.A00;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            int i = this.A00;
            byte[] bArr = this.A02;
            if (i < bArr.length) {
                this.A00 = i + 1;
                return bArr[i] & 255;
            }
            read = -1;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read == -1) {
            read = 0;
            if (i2 != 0) {
                while (read < i2) {
                    int i3 = this.A00;
                    byte[] bArr2 = this.A02;
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    this.A00 = i3 + 1;
                    int i4 = bArr2[i3] & 255;
                    if (i4 == -1) {
                        break;
                    }
                    bArr[i + read] = (byte) i4;
                    read++;
                }
                if (read > 0) {
                    return read;
                }
                return -1;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw AnonymousClass001.A0G("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.A00 = this.A01;
    }
}
