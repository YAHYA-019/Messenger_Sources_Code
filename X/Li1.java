package X;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: Li1.class */
public final class Li1 implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ Li6 A05;

    public Li1(Li6 li6, InputStream inputStream, Charset charset) {
        this.A05 = li6;
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(Li6.A0F)) {
            throw AnonymousClass001.A0L("Unsupported encoding");
        }
        this.A03 = inputStream;
        this.A04 = charset;
        this.A02 = new byte[8192];
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0159, code lost:
    
        if (r0[r305] == 13) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A00() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Li1.A00():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
