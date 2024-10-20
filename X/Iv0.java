package X;

/* loaded from: Iv0.class */
public final class Iv0 implements Runnable {
    public static final String __redex_internal_original_name = "EglRenderer$1";
    public final /* synthetic */ IJG A00;

    public Iv0(IJG ijg) {
        this.A00 = ijg;
    }

    @Override // java.lang.Runnable
    public void run() {
        IJG ijg = this.A00;
        synchronized (ijg.A0N) {
            ijg.A0C = null;
        }
    }
}
