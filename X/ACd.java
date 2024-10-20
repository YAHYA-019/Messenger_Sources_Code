package X;

import java.io.Closeable;

/* loaded from: ACd.class */
public final class ACd implements Closeable {
    public final /* synthetic */ 9Yh A00;

    public ACd(9Yh r302) {
        this.A00 = r302;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.A00.A01.writeLock().unlock();
        } catch (IllegalMonitorStateException unused) {
        }
    }
}
