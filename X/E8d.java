package X;

import com.facebook.rendercore.RenderTreeNode;

/* loaded from: E8d.class */
public final class E8d extends C1rF {
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.F8i] */
    @Override // X.C1rF
    public void A0G(2JG r302, 25G r303, 25G r304, Object obj, Object obj2, Object obj3) {
        long A0I = (((int) r303.A0I()) << 27) | Long.MIN_VALUE;
        FHF A0i = DKD.A0i();
        if (A0i == null) {
            super.A0G(r302, r303, r304, obj, obj2, obj3);
            return;
        }
        ?? obj4 = new Object();
        Object obj5 = FHF.A02()[1];
        FHF.A01((Object) obj4, 1);
        Object obj6 = obj5;
        if (!(obj5 instanceof F8i)) {
            obj6 = null;
        }
        try {
            F8i f8i = (F8i) obj6;
            super.A0G(r302, r303, r304, obj, obj2, obj3);
            if (!obj4.A02() && f8i != null) {
                f8i.A01(A0I);
            }
            FHF.A01(obj5, 1);
            if (obj4.A02()) {
                return;
            }
            A0i.A03.A01(new Ems(null, null, F8i.A00(obj4)), A0I, false);
        } catch (Throwable th) {
            FHF.A01(obj5, 1);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.F8i] */
    @Override // X.C1rF
    public void A0I(RenderTreeNode renderTreeNode) {
        11T.A0F(renderTreeNode, 0);
        ThreadLocal threadLocal = EbC.A01;
        if (threadLocal.get() != null) {
            long A0I = (((int) renderTreeNode.A06.A0I()) << 27) | Long.MIN_VALUE;
            FHF fhf = (FHF) threadLocal.get();
            if (fhf != null) {
                ?? obj = new Object();
                Object obj2 = FHF.A02()[1];
                FHF.A01((Object) obj, 1);
                Object obj3 = obj2;
                if (!(obj2 instanceof F8i)) {
                    obj3 = null;
                }
                try {
                    F8i f8i = (F8i) obj3;
                    super.A0I(renderTreeNode);
                    if (!obj.A02() && f8i != null) {
                        f8i.A01(A0I);
                    }
                    FHF.A01(obj2, 1);
                    if (obj.A02()) {
                        return;
                    }
                    fhf.A03.A01(new Ems(null, null, F8i.A00(obj)), A0I, false);
                    return;
                } catch (Throwable th) {
                    FHF.A01(obj2, 1);
                    throw th;
                }
            }
        }
        super.A0I(renderTreeNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (X.EYo.A00(r0) != false) goto L14;
     */
    @Override // X.C1rF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0J(X.25G r302, X.25G r303, java.lang.Object r304, java.lang.Object r305) {
        /*
            r301 = this;
            X.FHF r0 = X.DKD.A0i()
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L6e
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L68
            r0 = r304
            r1 = r305
            boolean r0 = X.EYO.A00(r0, r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L68
            r0 = r303
            long r0 = r0.A0I()
            r309 = r0
            r0 = r309
            int r0 = (int) r0
            long r0 = (long) r0
            r311 = r0
            r0 = 27
            r308 = r0
            r0 = r311
            r1 = r308
            long r0 = r0 << r1
            r311 = r0
            r0 = -9223372036854775808
            r313 = r0
            r0 = r311
            r1 = r313
            long r0 = r0 | r1
            r311 = r0
            r0 = r306
            X.Ewt r0 = r0.A04
            r315 = r0
            r0 = r315
            if (r0 == 0) goto L6b
            r0 = r315
            r1 = r311
            X.Ems r0 = r0.A00(r1)
            r315 = r0
            r0 = r315
            if (r0 == 0) goto L6b
            r0 = r311
            boolean r0 = X.EYo.A00(r0)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L6b
        L68:
            r0 = 1
            r307 = r0
        L6b:
            r0 = r307
            return r0
        L6e:
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            boolean r0 = super.A0J(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8d.A0J(X.25G, X.25G, java.lang.Object, java.lang.Object):boolean");
    }
}
