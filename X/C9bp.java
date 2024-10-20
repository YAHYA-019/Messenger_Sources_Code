package X;

import java.util.List;

/* renamed from: X.9bp, reason: invalid class name */
/* loaded from: 9bp.class */
public final class C9bp {
    public int A00;
    public final C01i A02 = C01g.A01(AL8.A00);
    public final C01i A03 = C01g.A01(AL9.A00);
    public final List A01 = AnonymousClass001.A0s();
    public final C01i A04 = C01g.A01(ALA.A00);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x008b, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(X.1LI r302, java.lang.Object r303, boolean r304) {
        /*
            r301 = this;
            r0 = r303
            r305 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r306 = r0
            r0 = r302
            r307 = r0
            r0 = r303
            if (r0 != 0) goto Lad
            r0 = r302
            if (r0 == 0) goto L8e
            r0 = r302
            int r0 = r0.A05
            r308 = r0
            r0 = r301
            X.01i r0 = r0.A04
            r309 = r0
            r0 = r309
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r310 = r0
            r0 = r308
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r311 = r0
            r0 = r309
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r312 = r0
            r0 = r311
            r1 = r312
            java.lang.Number r0 = X.1BK.A0o(r0, r1)
            int r0 = X.7zR.A05(r0)
            r1 = 1
            int r0 = r0 + r1
            r313 = r0
            r0 = r311
            r1 = r310
            r2 = r313
            X.1BK.A1P(r0, r1, r2)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r310 = r0
            r0 = r310
            r1 = r308
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 58
            r313 = r0
            r0 = r310
            r1 = r313
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r309
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r1 = r311
            java.lang.Object r0 = r0.get(r1)
            r312 = r0
            r0 = r312
            r1 = r310
            java.lang.String r0 = X.AnonymousClass001.A0a(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto Lb2
        L8e:
            java.lang.String r0 = "staticId:"
            r311 = r0
            r0 = r301
            int r0 = r0.A00
            r314 = r0
            r0 = r314
            r1 = 1
            int r0 = r0 + r1
            r313 = r0
            r0 = r301
            r1 = r313
            r0.A00 = r1
            r0 = r311
            r1 = r314
            java.lang.String r0 = X.0Pz.A0T(r0, r1)
            r305 = r0
        Lad:
            r0 = r302
            if (r0 != 0) goto Lb2
            return
        Lb2:
            X.Dq9 r0 = new X.Dq9
            r315 = r0
            r0 = r315
            r1 = r307
            r2 = r305
            r3 = 0
            r4 = 0
            r5 = r306
            r6 = r304
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r301
            java.util.List r0 = r0.A01
            r1 = r315
            boolean r0 = r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9bp.A00(X.1LI, java.lang.Object, boolean):void");
    }

    public final void A01(Object obj, C00m c00m, Object[] objArr, float f, boolean z) {
        Object obj2 = obj;
        11T.A0F(objArr, 5);
        if (obj == null) {
            int i = this.A00;
            this.A00 = i + 1;
            obj2 = 0Pz.A0T("staticId:", i);
        }
        this.A01.add(new Dq9(null, obj2, new DKb(c00m, 41), objArr, f, z));
    }
}
