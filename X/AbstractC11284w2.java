package X;

import java.io.OutputStream;

/* renamed from: X.4w2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4w2.class */
public abstract class AbstractC11284w2 extends OutputStream {
    public final OutputStream A00;

    public AbstractC11284w2(OutputStream outputStream) {
        this.A00 = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.A00.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.A00.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.A00.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
    }
}
