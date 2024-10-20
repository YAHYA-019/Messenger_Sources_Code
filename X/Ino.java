package X;

import java.io.Closeable;
import java.io.OutputStream;

/* loaded from: Ino.class */
public final class Ino implements Closeable {
    public final OutputStream A00;
    public final boolean A01;

    public Ino(OutputStream outputStream, boolean z) {
        this.A00 = outputStream;
        this.A01 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A01) {
            this.A00.close();
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImageSink{mOutputStream=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
