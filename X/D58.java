package X;

/* loaded from: D58.class */
public final class D58 implements Runnable {
    public static final String __redex_internal_original_name = "SmartLockManagerImpl$tryConnectAndRun$1";
    public final /* synthetic */ Runnable A00;

    public D58(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        0fH.A0j("SmartLockManagerImpl", "tryConnectAndRun: connection failed");
        this.A00.run();
    }
}
