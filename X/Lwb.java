package X;

import java.io.IOException;

/* loaded from: Lwb.class */
public final class Lwb implements MQv {
    public final /* synthetic */ MAX A00;
    public final /* synthetic */ MQv A01;

    public Lwb(MAX max, MQv mQv) {
        this.A00 = max;
        this.A01 = mQv;
    }

    @Override // X.MQv
    public long Cat(LwX lwX, long j) {
        MAX max = this.A00;
        max.A09();
        try {
            try {
                long Cat = this.A01.Cat(lwX, j);
                max.A0A();
                return Cat;
            } catch (IOException e) {
                e = e;
                if (max.A0B()) {
                    e = max.A07(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            max.A0B();
            throw th;
        }
    }

    @Override // X.MQv, X.MQy
    public L5K D4G() {
        return this.A00;
    }

    @Override // X.MQv, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, X.MQy
    public void close() {
        MAX max = this.A00;
        max.A09();
        try {
            try {
                this.A01.close();
                max.A0A();
            } catch (IOException e) {
                e = e;
                if (max.A0B()) {
                    e = max.A07(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            max.A0B();
            throw th;
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AsyncTimeout.source(");
        return JQy.A0r(this.A01, A0k);
    }
}
