package X;

/* loaded from: Iw1.class */
public final class Iw1 implements Runnable {
    public static final String __redex_internal_original_name = "PostTransactionListener$2";
    public final /* synthetic */ 5fZ A00;
    public final /* synthetic */ Throwable A01;

    public Iw1(5fZ r302, Throwable th) {
        this.A00 = r302;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A00.onError(this.A01);
    }
}
