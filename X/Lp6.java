package X;

/* loaded from: Lp6.class */
public final class Lp6 implements Runnable {
    public static final String __redex_internal_original_name = "RequestExecutor$ReplyRunnable$1";
    public final /* synthetic */ LjC A00;
    public final /* synthetic */ C06i A01;
    public final /* synthetic */ Object A02;

    public Lp6(LjC ljC, C06i c06i, Object obj) {
        this.A00 = ljC;
        this.A01 = c06i;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.accept(this.A02);
    }
}
