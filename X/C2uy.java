package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2uy, reason: invalid class name */
/* loaded from: 2uy.class */
public final class C2uy extends C2u6 implements C2uz {
    public final C2u6 A02;
    public final Executor A03;
    public final C2u6[] A05;
    public final AtomicInteger A04 = new AtomicInteger(0);
    public boolean A00 = false;
    public final int A01 = 2;

    public C2uy(C2u6 c2u6, Executor executor, C2u6[] c2u6Arr) {
        this.A05 = c2u6Arr;
        this.A03 = executor;
        this.A02 = c2u6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r302.contains("proxyservice") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C2u6 A00(X.C2uy r301, java.util.Set r302) {
        /*
            r0 = r301
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L30
            r0 = r301
            X.2u6 r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L30
            java.lang.String r0 = "proxyservice"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L30
        L23:
            r0 = r304
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "FailoverVoltronDownloader"
            java.lang.String r2 = "using %s downloader"
            X.0fH.A0g(r0, r1, r2)
            r0 = r304
            return r0
        L30:
            r0 = r301
            X.2u6[] r0 = r0.A05
            r306 = r0
            r0 = r301
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A04
            r305 = r0
            r0 = r305
            int r0 = r0.get()
            r303 = r0
            r0 = r306
            r1 = r303
            r0 = r0[r1]
            r304 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2uy.A00(X.2uy, java.util.Set):X.2u6");
    }
}
