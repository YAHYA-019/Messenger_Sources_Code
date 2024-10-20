package X;

import android.content.Context;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: C9X.class */
public final class C9X {
    public Boolean A00;
    public Boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 53U A05;
    public final ReentrantReadWriteLock A06;

    public C9X(Context context) {
        11T.A0F(context, 1);
        this.A06 = new ReentrantReadWriteLock();
        this.A03 = 1Bu.A00(82997);
        1Br A01 = 1Bu.A01(context, 49478);
        this.A04 = A01;
        this.A05 = ((53S) 1Br.A0B(A01)).A00(context);
        this.A02 = 7zM.A0N();
    }

    public final void A00() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A06;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.A00 = null;
            this.A01 = null;
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r303 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(boolean r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A06
            r304 = r0
            r0 = r304
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r305 = r0
            r0 = r304
            int r0 = r0.getWriteHoldCount()
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L3a
            r0 = r304
            int r0 = r0.getReadHoldCount()
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r309 = r0
        L25:
            r0 = r306
            r1 = r308
            if (r0 >= r1) goto L3d
            r0 = r305
            r0.unlock()
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L25
        L3a:
            r0 = 0
            r308 = r0
        L3d:
            r0 = r304
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r310 = r0
            r0 = r310
            r0.lock()
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L60
            java.lang.Boolean r0 = X.AnonymousClass001.A0K()     // Catch: java.lang.Throwable -> L8a
            r309 = r0
            r0 = r301
            r1 = r309
            r0.A00 = r1     // Catch: java.lang.Throwable -> L8a
            r0 = r303
            if (r0 == 0) goto L6f
            goto L6a
        L60:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L8a
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1     // Catch: java.lang.Throwable -> L8a
        L6a:
            r0 = r301
            r1 = r304
            r0.A01 = r1     // Catch: java.lang.Throwable -> L8a
        L6f:
            r0 = r307
            r1 = r308
            if (r0 >= r1) goto L84
            r0 = r305
            r0.lock()
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L6f
        L84:
            r0 = r310
            r0.unlock()
            return
        L8a:
            r309 = move-exception
        L8c:
            r0 = r307
            r1 = r308
            if (r0 >= r1) goto La1
            r0 = r305
            r0.lock()
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L8c
        La1:
            r0 = r310
            r0.unlock()
            r0 = r309
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9X.A01(boolean, boolean):void");
    }

    public final void A02(boolean z, boolean z2) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A06;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (z) {
                Boolean A0K = AnonymousClass001.A0K();
                this.A00 = A0K;
                this.A01 = A0K;
            } else {
                this.A01 = false;
                if (z2) {
                    this.A00 = null;
                }
            }
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final boolean A03() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.A06;
        reentrantReadWriteLock.readLock().lock();
        if (this.A00 == null) {
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            if (this.A00 == null) {
                boolean AZk = 1Br.A07(this.A02).AZk(72340215772614002L);
                C00i c00i = this.A03.A00;
                CJ9 cj9 = (CJ9) c00i.get();
                String[] A06 = AZk ? cj9.A06() : cj9.A04();
                53U r0 = this.A05;
                if (r0.BNK(A06) || r0.BNK(((CJ9) c00i.get()).A01())) {
                    this.A00 = AnonymousClass001.A0K();
                } else {
                    Boolean A0d = 1BK.A0d();
                    this.A00 = A0d;
                    this.A01 = A0d;
                }
            }
            reentrantReadWriteLock.readLock().lock();
            reentrantReadWriteLock.writeLock().unlock();
        }
        Boolean bool = this.A00;
        if (bool == null) {
            throw 1BK.A0h();
        }
        boolean booleanValue = bool.booleanValue();
        reentrantReadWriteLock.readLock().unlock();
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0114, code lost:
    
        if (r0.BNK(((X.CJ9) r0.get()).A01()) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A04() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9X.A04():boolean");
    }
}
