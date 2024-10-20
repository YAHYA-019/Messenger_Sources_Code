package X;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Inq.class */
public final class Inq implements Closeable {
    public boolean A00;
    public boolean A01;
    public final Object A02 = AnonymousClass001.A0R();
    public final List A03 = AnonymousClass001.A0s();
    public final ScheduledExecutorService A04 = C05064cq.A03.A02;

    public HlR A00() {
        HlR hlR;
        synchronized (this.A02) {
            if (this.A01) {
                throw AnonymousClass001.A0N("Object already closed");
            }
            hlR = new HlR(this);
        }
        return hlR;
    }

    public boolean A01() {
        boolean z;
        synchronized (this.A02) {
            if (this.A01) {
                throw AnonymousClass001.A0N("Object already closed");
            }
            z = this.A00;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.A02) {
            if (!this.A01) {
                List list = this.A03;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0Q("close");
                }
                list.clear();
                this.A01 = true;
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", AnonymousClass001.A0Y(this), 4YU.A14(this), Boolean.toString(A01()));
    }
}
