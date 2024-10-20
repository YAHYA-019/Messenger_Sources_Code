package X;

/* renamed from: X.5fd, reason: invalid class name */
/* loaded from: 5fd.class */
public final class C5fd implements Runnable {
    public static final String __redex_internal_original_name = "PostTransactionListener$1";
    public final /* synthetic */ 5fZ A00;
    public final /* synthetic */ Object A01;

    public C5fd(5fZ r302, Object obj) {
        this.A00 = r302;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A00.onSuccess(this.A01);
    }
}
