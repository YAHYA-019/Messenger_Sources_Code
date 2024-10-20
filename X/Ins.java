package X;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: Ins.class */
public final class Ins implements Closeable {
    public final InputStream A00;
    public final boolean A01;

    public Ins(InputStream inputStream, boolean z) {
        this.A00 = inputStream;
        this.A01 = z;
    }

    public static Ins A00(String str) {
        return new Ins(new FileInputStream(AnonymousClass001.A0E(str)), true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A01) {
            this.A00.close();
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImageSource{mInputStream=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
