package X;

import android.content.Context;

/* renamed from: X.4ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ep.class */
public final class C05724ep extends AnonymousClass013 {
    public final boolean A00;
    public final Context A01;
    public final 01G A02;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642159894063L) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05724ep(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = 6
            r303 = r0
            X.Jol r0 = new X.Jol
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r302
            X.00z r0 = (X.C00z) r0
            r302 = r0
            r0 = r302
            android.content.Context r0 = r0.A01
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r305 = r0
            java.lang.String r0 = android.os.Build.BRAND
            r306 = r0
            java.lang.String r0 = "HUAWEI"
            r304 = r0
            r0 = r304
            r1 = r306
            boolean r0 = r0.equalsIgnoreCase(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L56
            java.lang.String r0 = "HONOR"
            r304 = r0
            r0 = r304
            r1 = r306
            boolean r0 = r0.equalsIgnoreCase(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L90
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r303 = r0
            r0 = 28
            r307 = r0
            r0 = r303
            r1 = r307
            if (r0 != r1) goto L90
            r0 = r305
            if (r0 == 0) goto L90
            r0 = r305
            X.00i r0 = r0.A02
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r305 = r0
            r0 = 36317642159894063(0x8106b400052e2f, double:3.0307613690994363E-306)
            r308 = r0
            r0 = r305
            r1 = r308
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            if (r0 != 0) goto L95
        L90:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
        L95:
            r0 = r301
            r1 = r307
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05724ep.<init>(X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "HuaweiStackTraceFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A00) {
            01Q.A01(this.A02);
            01Q.A00(this.A01, "activity");
            A07();
        }
    }
}
