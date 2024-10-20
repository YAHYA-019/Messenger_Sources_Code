package X;

/* renamed from: X.4Wx, reason: invalid class name */
/* loaded from: 4Wx.class */
public final /* synthetic */ class C4Wx implements Runnable {
    public static final String __redex_internal_original_name = "TransactionExecutor$$ExternalSyntheticLambda0";
    public final /* synthetic */ 4JR A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C4Wx(4JR r302, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.A01;
        4JR r0 = this.A00;
        try {
            runnable.run();
        } finally {
            4JR.A00(r0);
        }
    }
}
