package X;

/* loaded from: Lmy.class */
public final class Lmy implements Runnable {
    public static final String __redex_internal_original_name = "ServicesMediaUploader$1$1$4";
    public final /* synthetic */ LVv A00;
    public final /* synthetic */ String A01;

    public Lmy(LVv lVv, String str) {
        this.A00 = lVv;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Lr9 lr9 = (Lr9) this.A00.A01;
        GJj gJj = lr9.A05;
        if (gJj != null) {
            FHh fHh = lr9.A01;
            DKM dkm = new DKM();
            dkm.A0H(this.A01);
            FEK.A00(fHh, dkm.A0G(), gJj);
        }
    }
}
