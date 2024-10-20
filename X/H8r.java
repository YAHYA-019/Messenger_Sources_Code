package X;

import com.facebook.cipher.jni.DecryptHybrid;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: H8r.class */
public final class H8r extends FilterInputStream {
    public boolean A00;
    public final DecryptHybrid A01;

    public H8r(DecryptHybrid decryptHybrid, InputStream inputStream) {
        super(new H8l(inputStream));
        this.A01 = decryptHybrid;
    }

    private void A00() {
        if (this.A00) {
            return;
        }
        H8l h8l = (H8l) ((FilterInputStream) this).in;
        DecryptHybrid decryptHybrid = this.A01;
        if (h8l.A00 != h8l.A02) {
            throw AnonymousClass001.A0G("Not enough tail data");
        }
        boolean end = decryptHybrid.end(h8l.A03);
        this.A00 = true;
        if (!end) {
            throw new 3DQ();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in.close();
        A00();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read < 0) {
            A00();
            return read;
        }
        this.A01.read(bArr, i, bArr, i, read);
        return read;
    }
}
