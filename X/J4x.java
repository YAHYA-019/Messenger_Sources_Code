package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

/* loaded from: J4x.class */
public final class J4x implements Callable {
    public final InputStream A00;
    public final OutputStream A01;

    public J4x(InputStream inputStream, OutputStream outputStream) {
        this.A00 = inputStream;
        this.A01 = outputStream;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(this.A00);
        try {
            OutputStream outputStream = this.A01;
            byte[] bArr = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read == -1) {
                    gZIPInputStream.close();
                    outputStream.close();
                    return null;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            gZIPInputStream.close();
            this.A01.close();
            throw th;
        }
    }
}
