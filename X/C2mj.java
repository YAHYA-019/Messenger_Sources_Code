package X;

import com.facebook.messaging.model.send.PendingSendQueueKey;
import java.util.LinkedList;

/* renamed from: X.2mj, reason: invalid class name */
/* loaded from: 2mj.class */
public final class C2mj {
    public long A01;
    public String A02;
    public final long A03;
    public final C0dr A04;
    public final PendingSendQueueKey A05;
    public volatile long A07;
    public volatile boolean A08;
    public final LinkedList A06 = new LinkedList();
    public int A00 = 0;

    public C2mj(C0dr c0dr, PendingSendQueueKey pendingSendQueueKey) {
        this.A04 = c0dr;
        this.A05 = pendingSendQueueKey;
        this.A03 = c0dr.now();
    }

    public static void A00(C2mj c2mj) {
        synchronized (c2mj) {
            c2mj.A02 = null;
            c2mj.A00 = 0;
            c2mj.A01 = -1;
        }
    }

    public boolean A01() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.A06.isEmpty();
        }
        return isEmpty;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r305 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.util.LinkedList r0 = r0.A06     // Catch: java.lang.Throwable -> L4f
            r303 = r0
            r0 = r303
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4f
            r304 = r0
        Lc:
            r0 = r304
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L4f
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3f
            r0 = r304
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L4f
            r303 = r0
            r0 = r303
            com.facebook.messaging.model.messages.Message r0 = (com.facebook.messaging.model.messages.Message) r0     // Catch: java.lang.Throwable -> L4f
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.A1g     // Catch: java.lang.Throwable -> L4f
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)     // Catch: java.lang.Throwable -> L4f
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lc
            r0 = r304
            r0.remove()     // Catch: java.lang.Throwable -> L4f
            goto L47
        L3f:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            goto L4a
        L47:
            r0 = 1
            r305 = r0
        L4a:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            return r0
        L4f:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2mj.A02(java.lang.String):boolean");
    }
}
