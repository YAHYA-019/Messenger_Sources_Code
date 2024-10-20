package X;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: H8k.class */
public final class H8k extends BufferedOutputStream {
    public boolean A00;

    public void A00(OutputStream outputStream) {
        6DP.A04(this.A00);
        ((FilterOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th;
        this.A00 = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((FilterOutputStream) this).out.close();
            if (th == null) {
                return;
            }
        } finally {
            if (th == null) {
            }
            throw th;
        }
        throw th;
    }
}
