package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.4s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4s0.class */
public final class C09964s0 extends C4s1 {
    public int A00;
    public int A01;
    public Context A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;

    public C09964s0() {
        super(FbInjector.A00());
        Context A00 = FbInjector.A00();
        this.A02 = A00;
        this.A03 = new 1HH(A00, 49246);
        this.A04 = new 1HH(A00, 49245);
        this.A05 = new 1BQ(16385);
        this.A01 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (((java.lang.Boolean) r301.A03.get()).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            android.content.Context r0 = r0.A05     // Catch: java.lang.Throwable -> L9a
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L54
            r0 = r302
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            r0 = r301
            X.00i r0 = r0.A05     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L9a
            r304 = r0
            r0 = r304
            X.1CO r0 = (X.1CO) r0     // Catch: java.lang.Throwable -> L9a
            r304 = r0
            r0 = 36314386574417828(0x8103be00011fa4, double:3.028702523735075E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)     // Catch: java.lang.Throwable -> L9a
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L54
            r0 = r302
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L9a
            r308 = r0
            r0 = 2131034118(0x7f050006, float:1.7678745E38)
            r307 = r0
            r0 = r308
            r1 = r307
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.Throwable -> L9a
            r309 = r0
            goto L95
        L54:
            r0 = r301
            X.00i r0 = r0.A04     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9a
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L8f
            r0 = r301
            X.00i r0 = r0.A03     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9a
            r303 = r0
            r0 = r303
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9a
            r307 = r0
            r0 = 1
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L95
        L8f:
            r0 = 0
            r309 = r0
            r0 = 0
            r308 = r0
        L95:
            r0 = r301
            monitor-exit(r0)
            r0 = r309
            return r0
        L9a:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09964s0.A00():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        if ((r0 != null ? X.1jW.A05(r0) : X.1jW.A01) != false) goto L55;
     */
    @Override // X.C4s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A08() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09964s0.A08():int");
    }

    public void A0A() {
        synchronized (this) {
            this.A01 = 0;
            this.A00 = 0;
            C4s1.A01(this, true);
        }
    }
}
