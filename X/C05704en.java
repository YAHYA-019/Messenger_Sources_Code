package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.fixie.fixes.signal.AppDeathSignalService;

/* renamed from: X.4en, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4en.class */
public final class C05704en extends AnonymousClass013 {
    public final Context A00;
    public final Handler A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642164416083L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05704en(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = r302
            r303 = r0
            r0 = r302
            X.00z r0 = (X.C00z) r0
            android.content.Context r0 = r0.A01
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r303
            X.00i r0 = r0.A02
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36317642164416083(0x8106b4004a2e53, double:3.03076137195918E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L4d
        L48:
            r0 = 0
            r308 = r0
            r0 = 0
            r303 = r0
        L4d:
            r0 = r301
            r1 = r308
            r0.A02 = r1
            r0 = r302
            android.os.Handler r0 = r0.AYc()
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05704en.<init>(X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "AppDeathSignalFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A02) {
            Context context = this.A00;
            Handler handler = this.A01;
            if (AppDeathSignalService.A02) {
                return;
            }
            AppDeathSignalService.A02 = true;
            FdN fdN = new FdN(context, handler);
            AppDeathSignalService.A00 = fdN;
            C0ft.A04(fdN, true);
        }
    }
}
