package X;

import java.io.Closeable;

/* loaded from: ACc.class */
public final class ACc implements Closeable {
    public final /* synthetic */ 9Yh A00;

    public ACc(9Yh r302) {
        this.A00 = r302;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.A00.A01.readLock().unlock();
        } catch (IllegalMonitorStateException unused) {
        }
    }
}
