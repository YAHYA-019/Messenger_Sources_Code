package X;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: H8p.class */
public final class H8p extends FilterInputStream {
    public long A00;
    public long A01;

    public H8p(InputStream inputStream, long j) {
        super(inputStream);
        this.A01 = -1;
        Preconditions.checkArgument(1BL.A1S((j > 0L ? 1 : (j == 0L ? 0 : -1))), "limit must be non-negative");
        this.A00 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.A00);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
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
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.A00 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        IOException A0G;
        synchronized (this) {
            if (!((FilterInputStream) this).in.markSupported()) {
                A0G = AnonymousClass001.A0G("Mark not supported");
            } else if (this.A01 != -1) {
                ((FilterInputStream) this).in.reset();
                this.A00 = this.A01;
            } else {
                A0G = AnonymousClass001.A0G("Mark not set");
            }
            throw A0G;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.A00));
        this.A00 -= skip;
        return skip;
    }
}
