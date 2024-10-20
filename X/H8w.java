package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: H8w.class */
public final class H8w extends InputStream {
    public int A00;
    public int A01;
    public IOException A02;
    public Queue A03;
    public boolean A04;

    public H8w() {
        this.A03 = AbF.A1F();
    }

    public H8w(int i) {
    }

    @Override // java.io.InputStream
    public int available() {
        int i;
        synchronized (this) {
            i = this.A00;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        11T.A0F(bArr, 0);
        if (i2 == 0) {
            return 0;
        }
        synchronized (this) {
            i3 = -1;
            if (!this.A04 || this.A00 != 0) {
                while (!this.A04 && this.A03.isEmpty() && this.A02 == null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        0fH.A0s("[MP] ResponseBodyStream", "Interrupted while waiting for response body", e);
                    }
                }
                Throwable th = this.A02;
                if (th == null) {
                    if (!this.A04 || this.A00 != 0) {
                        int min = (int) Math.min(i2, this.A00);
                        i3 = 0;
                        while (min > 0) {
                            Queue queue = this.A03;
                            byte[] bArr2 = (byte[]) queue.peek();
                            if (bArr2 != null) {
                                double d = min;
                                int length = bArr2.length;
                                int i4 = this.A01;
                                int min2 = (int) Math.min(d, length - i4);
                                System.arraycopy(bArr2, i4, bArr, i, min2);
                                i3 += min2;
                                int i5 = this.A01 + min2;
                                this.A01 = i5;
                                i += min2;
                                min -= min2;
                                this.A00 -= min2;
                                if (i5 == length) {
                                    queue.remove();
                                    this.A01 = 0;
                                }
                            } else {
                                th = AnonymousClass001.A0T("Response body stream is in an invalid state: available bytes > 0, but no buffers remain");
                            }
                        }
                    }
                }
                throw th;
            }
        }
        return i3;
    }
}
