package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* loaded from: Inn.class */
public final class Inn implements Closeable {
    public C4Ez A00;
    public final URL A01;
    public volatile InputStream A02;

    public Inn(URL url) {
        this.A01 = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    Hwe.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", 4YT.A00(636), (Throwable) e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
