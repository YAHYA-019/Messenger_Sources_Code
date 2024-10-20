package X;

/* renamed from: X.3l4, reason: invalid class name */
/* loaded from: 3l4.class */
public final class C3l4 extends C4G3 implements 2Zt {
    public final String A00;
    public final Throwable A01;

    public C3l4(String str, Throwable th) {
        this.A01 = th;
        this.A00 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Throwable r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3c
            java.lang.String r0 = "Module with the Main dispatcher had failed to initialize"
            r303 = r0
            r0 = r301
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L22
            java.lang.String r0 = ". "
            r1 = r304
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L26
        L22:
            java.lang.String r0 = ""
            r305 = r0
        L26:
            r0 = r303
            r1 = r305
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r304 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r305 = r0
            r0 = r305
            r1 = r304
            r2 = r302
            r0.<init>(r1, r2)
            r0 = r305
            throw r0
        L3c:
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3l4.A00():void");
    }

    @Override // X.C4G3
    public C4G3 A01() {
        return this;
    }

    public C2a8 BQJ(Runnable runnable, 0DE r303, long j) {
        A00();
        throw 0Q8.createAndThrow();
    }

    public /* bridge */ /* synthetic */ void Cjn(C2s8 c2s8, long j) {
        A00();
        throw 0Q8.createAndThrow();
    }

    public /* bridge */ /* synthetic */ void dispatch(0DE r302, Runnable runnable) {
        A00();
        throw 0Q8.createAndThrow();
    }

    public boolean isDispatchNeeded(0DE r302) {
        A00();
        throw 0Q8.createAndThrow();
    }

    @Override // X.C4G3
    public 2Zs limitedParallelism(int i) {
        A00();
        throw 0Q8.createAndThrow();
    }

    public String toString() {
        Throwable th = this.A01;
        return 0Pz.A0X("Dispatchers.Main[missing", th != null ? AnonymousClass001.A0Z(th, ", cause=", AnonymousClass001.A0k()) : "", ']');
    }
}
