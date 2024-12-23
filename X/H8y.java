package X;

import java.io.OutputStream;

/* loaded from: H8y.class */
public final class H8y extends OutputStream {
    public final OutputStream A00;
    public final OutputStream A01;

    public H8y(OutputStream outputStream, OutputStream outputStream2) {
        this.A00 = outputStream;
        this.A01 = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.A00.flush();
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.A00.write(i);
        this.A01.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.A00.write(bArr);
        this.A01.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
        this.A01.write(bArr, i, i2);
    }
}
