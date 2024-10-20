package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: H8z.class */
public final class H8z extends OutputStream {
    public boolean A00 = false;
    public final FileOutputStream A01;

    public H8z(File file) {
        this.A01 = GOn.A14(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        flush();
        try {
            this.A01.getFD().sync();
        } catch (IOException e) {
            5My.A06("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.A01.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }
}
