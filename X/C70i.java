package X;

/* renamed from: X.70i, reason: invalid class name */
/* loaded from: 70i.class */
public final class C70i {
    public final 1Br A00 = 1Bq.A00(99390);

    public long A00(C5fv c5fv) {
        5uO AxW;
        long j = 2147483647L;
        if (c5fv != null && !A01(c5fv) && (AxW = c5fv.AxW(5tE.A00)) != null) {
            Long l = AxW.A01;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    j = longValue - ((C0dp) this.A00.A00.get()).now();
                }
            }
            Long l2 = AxW.A02;
            if (l2 == null) {
                l2 = 0L;
            }
            return l2.longValue();
        }
        return j;
    }

    public boolean A01(C5fv c5fv) {
        Long l;
        if (c5fv == null || !A03(c5fv)) {
            return true;
        }
        if ((C5ul.A02(c5fv) && c5fv.AxW(5tE.A00) == null) || C5ul.A00(c5fv)) {
            return true;
        }
        5uO AxW = c5fv.AxW(5tE.A00);
        if (AxW == null) {
            l = 0L;
        } else {
            l = AxW.A02;
            if (l == null) {
                return false;
            }
        }
        return l.longValue() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (A00(r302) > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(X.C5fv r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.A01(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L20
            r0 = r301
            r1 = r302
            long r0 = r0.A00(r1)
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 <= 0) goto L22
        L20:
            r0 = 0
            r303 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70i.A02(X.5fv):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v2 java.lang.Long, still in use, count: 2, list:
          (r304v2 java.lang.Long) from 0x0023: PHI (r304v4 java.lang.Long) = (r304v2 java.lang.Long) binds: [B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]
          (r304v2 java.lang.Long) from 0x0046: IF  (r304v2 java.lang.Long) != (null java.lang.Long)  -> B:4:0x0023 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public boolean A03(X.C5fv r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            X.5tE r0 = X.5tE.A00
            r304 = r0
            r0 = r302
            r1 = r304
            X.5PP r0 = r0.AxW(r1)
            X.5uO r0 = (X.5uO) r0
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L40
            r0 = 0
            r305 = r0
            r0 = r305
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r304 = r0
        L23:
            r0 = 0
            r307 = r0
            r0 = r304
            long r0 = r0.longValue()
            r309 = r0
            r0 = r309
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = 1
            r303 = r0
            r0 = r311
            if (r0 != 0) goto L3e
        L3a:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L3e:
            r0 = r303
            return r0
        L40:
            r0 = r304
            java.lang.Long r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3a
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70i.A03(X.5fv):boolean");
    }
}
