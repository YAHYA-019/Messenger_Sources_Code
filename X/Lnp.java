package X;

/* loaded from: Lnp.class */
public final class Lnp implements Runnable {
    public static final String __redex_internal_original_name = "ClickableToastCoordinator$2";
    public final /* synthetic */ KuH A00;
    public final /* synthetic */ Kj9 A01;

    public Lnp(KuH kuH, Kj9 kj9) {
        this.A01 = kj9;
        this.A00 = kuH;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A01();
        this.A01.A01 = true;
    }
}
