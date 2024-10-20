package X;

/* loaded from: Iog.class */
public final class Iog implements Runnable {
    public static final String __redex_internal_original_name = "StateCallbackNotifier$1";
    public final /* synthetic */ JHq A00;

    public Iog(JHq jHq) {
        this.A00 = jHq;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.onSuccess();
    }
}
