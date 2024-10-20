package X;

import com.facebook.acra.util.StatFsUtil;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: H8o.class */
public final class H8o extends FilterInputStream {
    public long A00;
    public long A01;

    public H8o(InputStream inputStream) {
        super(inputStream);
        this.A01 = -1;
        this.A00 = StatFsUtil.IN_MEGA_BYTE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.A00);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            ((FilterInputStream) this).in.mark(i);
            this.A01 = this.A00;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
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
    public final int read(byte[] bArr, int i, int i2) {
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
    public final void reset() {
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
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.A00));
        this.A00 -= skip;
        return skip;
    }
}
