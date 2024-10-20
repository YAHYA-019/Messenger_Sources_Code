package X;

/* renamed from: X.3l6, reason: invalid class name */
/* loaded from: 3l6.class */
public final class C3l6 extends C2aq {
    public static final String __redex_internal_original_name = "TaskImpl";
    public final Runnable A00;

    public C3l6(Runnable runnable, 2aT r303, long j) {
        super.A00 = j;
        this.A01 = r303;
        this.A00 = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x000c: THROW (r0 I:java.lang.Throwable), block:B:8:0x000c */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.lang.Runnable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Runnable r0 = r0.A00     // Catch: java.lang.Throwable -> Lc
            r302 = r0
            r0 = r302
            r0.run()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3l6.run():void");
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Task[");
        Runnable runnable = this.A00;
        A0k.append(AnonymousClass001.A0X(runnable));
        1BL.A1J(runnable, A0k, '@');
        A0k.append(", ");
        A0k.append(super.A00);
        A0k.append(", ");
        A0k.append(this.A01);
        return AnonymousClass001.A0g(A0k, ']');
    }
}
