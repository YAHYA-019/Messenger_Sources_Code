package X;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: Lwc.class */
public final class Lwc implements MQv {
    public final /* synthetic */ InputStream A00;
    public final /* synthetic */ L5K A01;

    public Lwc(InputStream inputStream, L5K l5k) {
        this.A01 = l5k;
        this.A00 = inputStream;
    }

    @Override // X.MQv
    public long Cat(LwX lwX, long j) {
        Throwable e;
        if (j < 0) {
            e = JQy.A0h("byteCount < 0: ", j);
        } else {
            if (j == 0) {
                return 0L;
            }
            try {
                this.A01.A05();
                L8p A09 = lwX.A09(1);
                int read = this.A00.read(A09.A06, A09.A00, (int) Math.min(j, 8192 - r0));
                if (read == -1) {
                    if (A09.A01 == A09.A00) {
                        L8p.A00(lwX, A09);
                    }
                    return -1;
                }
                A09.A00 += read;
                long j2 = read;
                lwX.A00 += j2;
                return j2;
            } catch (AssertionError e2) {
                e = e2;
                if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                    throw new IOException(e);
                }
            }
        }
        throw e;
    }

    @Override // X.MQv, X.MQy
    public L5K D4G() {
        return this.A01;
    }

    @Override // X.MQv, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, X.MQy
    public void close() {
        this.A00.close();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("source(");
        return JQy.A0r(this.A00, A0k);
    }
}
