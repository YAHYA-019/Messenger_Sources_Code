package X;

/* loaded from: G0w.class */
public final /* synthetic */ class G0w implements Runnable {
    public static final String __redex_internal_original_name = "BackgroundPreparer$$ExternalSyntheticLambda0";
    public final /* synthetic */ G6V A00;

    @Override // java.lang.Runnable
    public final void run() {
        G6V g6v = this.A00;
        g6v.run();
        synchronized (FGV.class) {
            FGV.A01.remove(g6v);
        }
    }
}
