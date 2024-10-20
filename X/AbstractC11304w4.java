package X;

import java.io.IOException;

/* renamed from: X.4w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4w4.class */
public abstract class AbstractC11304w4 extends AbstractC11284w2 {
    public long A00;

    public void A00() {
    }

    public void A01(IOException iOException) {
        C11294w3 c11294w3 = (C11294w3) this;
        c11294w3.A00 = true;
        c11294w3.A02.A01.markerEnd(42991646, c11294w3.A01, (short) 3);
        throw iOException;
    }

    @Override // X.AbstractC11284w2, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
            A00();
        } catch (IOException e) {
            A01(e);
            throw null;
        }
    }

    @Override // X.AbstractC11284w2, java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            A01(e);
            throw null;
        }
    }

    @Override // X.AbstractC11284w2, java.io.OutputStream
    public void write(int i) {
        try {
            super.write(i);
            this.A00++;
        } catch (IOException e) {
            A01(e);
            throw null;
        }
    }

    @Override // X.AbstractC11284w2, java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            super.write(bArr);
            this.A00 += bArr.length;
        } catch (IOException e) {
            A01(e);
            throw null;
        }
    }

    @Override // X.AbstractC11284w2, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            super.write(bArr, i, i2);
            this.A00 += i2;
        } catch (IOException e) {
            A01(e);
            throw null;
        }
    }
}
