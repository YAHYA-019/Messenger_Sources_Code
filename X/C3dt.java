package X;

/* renamed from: X.3dt, reason: invalid class name */
/* loaded from: 3dt.class */
public final class C3dt implements 1K9 {
    public final /* synthetic */ 2VP A00;
    public final /* synthetic */ 2ZG A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C3dt(2VP r302, 2ZG r303, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = r303;
        this.A03 = z2;
        this.A00 = r302;
    }

    public void onFailure(Throwable th) {
        this.A01.A04 = false;
        this.A00.BxV();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            X.0Oa r0 = (X.0Oa) r0
            r302 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L9c
            r0 = r301
            X.2ZG r0 = r0.A01
            r304 = r0
            r0 = r304
            com.google.common.collect.ImmutableList r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9c
            r0 = r305
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L9c
            r0 = r304
            com.google.common.collect.ImmutableList r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lad
            r0 = r305
            java.util.ArrayList r0 = X.1BK.A17(r0)
            r306 = r0
            r0 = r302
            java.lang.Object r0 = r0.first
            java.util.Collection r0 = (java.util.Collection) r0
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.addAll(r1)
            r0 = r306
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r305 = r0
        L59:
            r0 = r304
            r1 = r305
            r0.A01 = r1
            r0 = r302
            java.lang.Object r0 = r0.second
            X.2JX r0 = (X.2JX) r0
            r305 = r0
            r0 = r304
            r1 = r305
            r0.A00 = r1
            r0 = r302
            java.lang.Object r0 = r0.third
            java.lang.String r0 = (java.lang.String) r0
            r305 = r0
            r0 = r304
            r1 = r305
            r0.A02 = r1
            r0 = r304
            r1 = 0
            r0.A04 = r1
            r0 = r301
            boolean r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L92
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r303
            r0.A03 = r1
        L92:
            r0 = r301
            X.2VP r0 = r0.A00
            r0.onSuccess()
            return
        L9c:
            r0 = r301
            X.2ZG r0 = r0.A01
            r304 = r0
            r0 = r302
            java.lang.Object r0 = r0.first
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            r305 = r0
            goto L59
        Lad:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3dt.onSuccess(java.lang.Object):void");
    }
}
