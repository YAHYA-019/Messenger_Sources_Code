package X;

import android.os.Process;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2t2, reason: invalid class name */
/* loaded from: 2t2.class */
public final class C2t2 {
    public final java.util.Map A00;
    public final C2t3 A01;
    public final Object A02;

    public C2t2() {
        this(false);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.locks.ReentrantLock, X.2t3] */
    public C2t2(boolean z) {
        this.A02 = new Object();
        this.A01 = new ReentrantLock();
        this.A00 = new HashMap(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        r0 = android.os.Process.getThreadPriority(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r0 <= r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (r0 == r0.A00) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r0.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        android.os.Process.setThreadPriority(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        r0.A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        r0.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2t2.A00():void");
    }

    public void A01() {
        C2t3 c2t3 = this.A01;
        if (!c2t3.isHeldByCurrentThread()) {
            throw AnonymousClass001.A0N("Cannot unlock since this thread does not hold a lock currently");
        }
        synchronized (this.A02) {
            Thread currentThread = Thread.currentThread();
            java.util.Map map = this.A00;
            2tI r0 = (2tI) map.get(currentThread);
            if (r0 != null) {
                int i = r0.A01 - 1;
                r0.A01 = i;
                if (i == 0) {
                    map.remove(currentThread);
                }
                int i2 = r0.A03;
                if (r0.A00 == Process.getThreadPriority(i2)) {
                    Process.setThreadPriority(i2, r0.A02);
                }
            }
            c2t3.unlock();
        }
    }
}
