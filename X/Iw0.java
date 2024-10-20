package X;

/* loaded from: Iw0.class */
public final class Iw0 implements Runnable {
    public static final String __redex_internal_original_name = "PostNullableTransactionListener$2";
    public final /* synthetic */ 7Vi A00;
    public final /* synthetic */ Throwable A01;

    public Iw0(7Vi r302, Throwable th) {
        this.A00 = r302;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A00.onError(this.A01);
    }
}
