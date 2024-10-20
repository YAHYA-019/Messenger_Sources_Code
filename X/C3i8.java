package X;

/* renamed from: X.3i8, reason: invalid class name */
/* loaded from: 3i8.class */
public final class C3i8 implements Runnable {
    public static final String __redex_internal_original_name = "TouchLoggingLithoView$AsyncContinuityRunnableWrapper";
    public final 2lP A00;
    public final 2lN A01;
    public final Runnable A02;
    public final /* synthetic */ 2lR A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C3i8(2lN r302, 2lR r303, Runnable runnable) {
        this.A03 = r303;
        this.A01 = r302;
        this.A02 = runnable;
        Object obj = r303.A00;
        obj = obj == null ? new Object() : obj;
        2lP r0 = r302.A03;
        obj.A00 = r0.A00;
        obj.A01 = r0.A01;
        obj.A03 = r0.A03;
        obj.A02 = r0.A02;
        Object obj2 = obj.A04;
        obj2 = obj2 == null ? new Object() : obj2;
        obj.A04 = obj2;
        2lP r02 = r0.A04;
        obj2.A00 = r02.A00;
        obj2.A01 = r02.A01;
        obj2.A03 = r02.A03;
        obj2.A02 = r02.A02;
        this.A00 = obj;
        r303.A00 = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        2lN r0 = this.A01;
        2lP r02 = this.A00;
        r0.A01 = r02;
        try {
            this.A02.run();
        } finally {
            r0.A01 = null;
            this.A03.A00 = r02;
        }
    }
}
