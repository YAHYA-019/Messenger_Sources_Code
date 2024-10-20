package X;

/* loaded from: Lmx.class */
public final class Lmx implements Runnable {
    public static final String __redex_internal_original_name = "ServicesMediaUploader$1$1$2";
    public final /* synthetic */ 5DD A00;
    public final /* synthetic */ LVv A01;

    public Lmx(5DD r302, LVv lVv) {
        this.A01 = lVv;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        Lr9 lr9 = (Lr9) this.A01.A01;
        GJj gJj = lr9.A03;
        if (gJj != null) {
            FHh fHh = lr9.A01;
            DKM dkm = new DKM();
            dkm.A0H(this.A00.getMessage());
            FEK.A00(fHh, dkm.A0G(), gJj);
        }
    }
}
