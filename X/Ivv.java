package X;

/* loaded from: Ivv.class */
public final class Ivv implements Runnable {
    public static final String __redex_internal_original_name = "ThreadUtil$2";
    public final /* synthetic */ JIA A00;
    public final /* synthetic */ Exception A01;

    public Ivv(JIA jia, Exception exc) {
        this.A00 = jia;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.ARA(this.A01);
    }
}
