package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: H8n.class */
public final class H8n extends FilterInputStream {
    public int A00;
    public int A01;

    public H8n(InputStream inputStream, int i) {
        super(inputStream);
        if (i < 0) {
            throw AnonymousClass001.A0L("limit must be >= 0");
        }
        this.A00 = i;
        this.A01 = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.A00);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.A01 = this.A00;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read;
        int i3 = this.A00;
        if (i3 == 0) {
            read = -1;
        } else {
            read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
            if (read > 0) {
                this.A00 -= read;
                return read;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw AnonymousClass001.A0G("mark is not supported");
        }
        if (this.A01 == -1) {
            throw AnonymousClass001.A0G("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.A00 = this.A01;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.A00));
        this.A00 = (int) (this.A00 - skip);
        return skip;
    }
}
