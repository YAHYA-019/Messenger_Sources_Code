package X;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1lk, reason: invalid class name */
/* loaded from: 1lk.class */
public final class C1lk {
    public 1nK A00;
    public final C1lh A01;
    public final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();

    public C1lk(C1lh c1lh) {
        this.A01 = c1lh;
    }

    public final void A00() {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = null;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            AnonymousClass001.A1L(this.A02);
            throw th;
        }
    }

    public final void A01(1nK r302) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = r302;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            AnonymousClass001.A1L(this.A02);
            throw th;
        }
    }

    public final boolean A02(final 5Ck r302) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            1nK r0 = this.A00;
            boolean A01 = r0 == null ? this.A01.A01(new Runnable() { // from class: X.3h9
                public static final String __redex_internal_original_name = "Subscriber$subscribe$1";

                @Override // java.lang.Runnable
                public final void run() {
                    1nK r02 = C1lk.this.A00;
                    if (r02 != null) {
                        5Ck r03 = r302;
                        r02.subscribe(r03.A02, r03.A01, r03.A00);
                    }
                }
            }) : r0.subscribe(r302.A02, r302.A01, r302.A00);
            reentrantReadWriteLock.readLock().unlock();
            return A01;
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }

    public final boolean A03(List list) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            1nK r0 = this.A00;
            boolean unsubscribe = r0 != null ? r0.unsubscribe(list) : false;
            reentrantReadWriteLock.readLock().unlock();
            return unsubscribe;
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }
}
