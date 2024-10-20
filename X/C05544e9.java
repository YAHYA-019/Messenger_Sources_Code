package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.4e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4e9.class */
public final class C05544e9 extends AnonymousClass013 {
    public static final boolean A03;
    public final Context A00;
    public final 01G A01;
    public final boolean A02;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A03 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(2342160651374308916L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05544e9(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = 4
            r303 = r0
            X.Jol r0 = new X.Jol
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r302
            X.00z r0 = (X.C00z) r0
            r302 = r0
            r0 = r302
            android.content.Context r0 = r0.A01
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L59
            r0 = r304
            X.00i r0 = r0.A02
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r305 = r0
            r0 = 2342160651374308916(0x208106b400102e34, double:4.063586632448773E-152)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            if (r0 != 0) goto L5e
        L59:
            r0 = 0
            r308 = r0
            r0 = 0
            r304 = r0
        L5e:
            r0 = r301
            r1 = r308
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05544e9.<init>(X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "ContentProviderFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A02) {
            01Q.A01(this.A01);
            01Q.A00(this.A00, "activity");
            A07();
        }
    }
}
