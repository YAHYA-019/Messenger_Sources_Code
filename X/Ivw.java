package X;

/* loaded from: Ivw.class */
public final class Ivw implements Runnable {
    public static final String __redex_internal_original_name = "ThreadUtil$3";
    public final /* synthetic */ JIA A00;
    public final /* synthetic */ Object A01;

    public Ivw(JIA jia, Object obj) {
        this.A00 = jia;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.D3Q(this.A01);
    }
}
