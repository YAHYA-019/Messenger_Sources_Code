package X;

/* loaded from: Lmg.class */
public final class Lmg implements Runnable {
    public static final String __redex_internal_original_name = "SystemForegroundService$3";
    public final /* synthetic */ int A00;
    public final /* synthetic */ ServiceC3019Jgi A01;

    public Lmg(ServiceC3019Jgi serviceC3019Jgi, int i) {
        this.A01 = serviceC3019Jgi;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A00.cancel(this.A00);
    }
}
