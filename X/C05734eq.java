package X;

import android.content.Context;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.4eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4eq.class */
public final class C05734eq extends AnonymousClass013 {
    public final Context A00;
    public final Handler A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642159762990L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05734eq(X.AnonymousClass010 r302) {
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
            r304 = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r305 = r0
            java.lang.String r0 = "samsung"
            r303 = r0
            r0 = r303
            r1 = r305
            boolean r0 = r0.equalsIgnoreCase(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5d
            r0 = r304
            if (r0 == 0) goto L5d
            r0 = r304
            X.00i r0 = r0.A02
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36317642159762990(0x8106b400032e2e, double:3.030761369016545E-306)
            r307 = r0
            r0 = r304
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 1
            r306 = r0
            r0 = r309
            if (r0 != 0) goto L62
        L5d:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L62:
            r0 = r301
            r1 = r306
            r0.A02 = r1
            r0 = r302
            android.os.Handler r0 = r0.AYc()
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05734eq.<init>(X.010):void");
    }

    public static void A00(C01a c01a, C05734eq c05734eq, String str) {
        try {
            Class A01 = c01a.A01(str);
            if (A01 != null) {
                Context context = c05734eq.A00;
                Object systemService = context.getSystemService((Class<Object>) A01);
                if (systemService == null) {
                    Method A04 = c01a.A04(A01, "getInstance", Context.class);
                    if (A04 == null) {
                        return;
                    }
                    A04.setAccessible(true);
                    systemService = A04.invoke(null, context);
                    if (systemService == null) {
                        return;
                    }
                }
                Field A03 = c01a.A03(systemService.getClass(), "mContext");
                if (A03 != null) {
                    A03.setAccessible(true);
                    A03.set(systemService, context);
                }
            }
        } catch (Throwable th) {
            c05734eq.A0A(th);
        }
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "SamsungContextLeakFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A02) {
            this.A01.postDelayed(new 5Cs(this), 180000L);
            A07();
        }
    }
}
