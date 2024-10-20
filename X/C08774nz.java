package X;

import com.facebook.quicklog.QuickEventFilter;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4nz.class */
public final /* synthetic */ class C08774nz implements QuickEventFilter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1KI A01;
    public final /* synthetic */ TimeUnit A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C08774nz(1KI r302, TimeUnit timeUnit, long j, boolean z, boolean z2) {
        this.A01 = r302;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = timeUnit;
        this.A00 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r302.A0C == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (X.1KI.A06(r302, r0.toMillis(r0)) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        r0.Caj((X.0El) null, r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0035, code lost:
    
        if (r302.A0S == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r302.A0T != false) goto L12;
     */
    @Override // com.facebook.quicklog.QuickEventFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldRemove(X.1Qb r302) {
        /*
            r301 = this;
            r0 = r301
            X.1KI r0 = r0.A01
            r303 = r0
            r0 = r301
            boolean r0 = r0.A03
            r304 = r0
            r0 = r301
            boolean r0 = r0.A04
            r305 = r0
            r0 = r301
            java.util.concurrent.TimeUnit r0 = r0.A02
            r306 = r0
            r0 = r301
            long r0 = r0.A00
            r307 = r0
            r0 = r303
            X.1K6 r0 = r0.A04
            r309 = r0
            r0 = r309
            r1 = 0
            r2 = r302
            r0.Cai(r1, r2)
            r0 = r304
            if (r0 == 0) goto L38
            r0 = r302
            boolean r0 = r0.A0S     // Catch: java.lang.Throwable -> L6d
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L46
        L38:
            r0 = r305
            if (r0 == 0) goto L7f
            r0 = r302
            boolean r0 = r0.A0T     // Catch: java.lang.Throwable -> L6d
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L7f
        L46:
            r0 = r302
            long r0 = r0.A0C     // Catch: java.lang.Throwable -> L6d
            r310 = r0
            r0 = -1
            long r0 = (long) r0
            r312 = r0
            r0 = r310
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L8a
            r0 = r306
            r1 = r307
            long r0 = r0.toMillis(r1)     // Catch: java.lang.Throwable -> L6d
            r314 = r0
            r0 = r302
            r1 = r314
            boolean r0 = X.1KI.A06(r0, r1)     // Catch: java.lang.Throwable -> L6d
            r304 = r0
            goto L7b
        L6d:
            r316 = move-exception
            r0 = r309
            r1 = 0
            r2 = r302
            r0.Caj(r1, r2)
            r0 = r316
            throw r0
        L7b:
            r0 = r304
            if (r0 == 0) goto L8a
        L7f:
            r0 = r309
            r1 = 0
            r2 = r302
            r0.Caj(r1, r2)
            r0 = 1
            return r0
        L8a:
            r0 = r309
            r1 = 0
            r2 = r302
            r0.Caj(r1, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08774nz.shouldRemove(X.1Qb):boolean");
    }
}
