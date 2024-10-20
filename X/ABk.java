package X;

/* loaded from: ABk.class */
public final class ABk implements 1K9 {
    public final Object A00;
    public final /* synthetic */ 9hT A01;

    public ABk(9hT r302, Object obj) {
        this.A01 = r302;
        this.A00 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.9UA, java.lang.Object] */
    public void onFailure(Throwable th) {
        1Im r0;
        9Yu r02 = (9Yu) this.A01.A06.get();
        if (r02 != null) {
            Object obj = this.A00;
            C1qb c1qb = r02.A00;
            if (c1qb.A0J() != null && (r0 = ((C8qh) c1qb.A0J()).A00) != null) {
                if (obj == null) {
                    obj = "";
                }
                ?? obj2 = new Object();
                ((9UA) obj2).A04 = false;
                ((9UA) obj2).A01 = obj;
                ((9UA) obj2).A03 = th;
                ((9UA) obj2).A00 = null;
                ((9UA) obj2).A02 = null;
                r0.A00((Object) obj2);
            }
            if (c1qb.A0J() != null) {
                c1qb.A0G(7zQ.A0V(th, 1), "updateState:ContentSearchLoaderSection.updateErrorState");
            }
            2Yg.A0H(c1qb, 0S2.A0N, th, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        if (r0.A00.isEmpty() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r306 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            X.9Pv r0 = (X.9Pv) r0
            r302 = r0
            r0 = r301
            X.9hT r0 = r0.A01
            r303 = r0
            r0 = r303
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.9Yu r0 = (X.9Yu) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L74
            r0 = r303
            java.util.concurrent.atomic.AtomicReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L34
            r0 = r301
            java.lang.Object r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4c
        L34:
            r0 = r301
            java.lang.Object r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L74
            r0 = r306
            r1 = r304
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L74
        L4c:
            r0 = r305
            r1 = r302
            r2 = r306
            r0.A00(r1, r2)
            r0 = r302
            if (r0 == 0) goto L6b
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A00
            boolean r0 = r0.isEmpty()
            r308 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r308
            if (r0 == 0) goto L6e
        L6b:
            r0 = 1
            r307 = r0
        L6e:
            r0 = r303
            r1 = r307
            r0.A00 = r1
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABk.onSuccess(java.lang.Object):void");
    }
}
