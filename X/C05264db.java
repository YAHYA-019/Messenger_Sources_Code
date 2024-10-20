package X;

import java.io.InputStream;

/* renamed from: X.4db, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4db.class */
public final class C05264db extends InputStream {
    public int A00;
    public int A01;
    public final 4dR A02;

    public C05264db(4dR r302) {
        C0By.A02(Boolean.valueOf(!r302.isClosed()));
        this.A02 = r302;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A02.size() - this.A01;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.A00 = this.A01;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        4dR r0 = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return r0.read(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(0Pz.A0q("length=", "; regionStart=", "; regionLength=", bArr.length, i, i2));
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.A02.read(this.A01, bArr, i, min);
        this.A01 += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.A01 = this.A00;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        C0By.A02(Boolean.valueOf(z));
        int min = Math.min((int) j, available());
        this.A01 += min;
        return min;
    }
}
