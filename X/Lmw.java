package X;

/* loaded from: Lmw.class */
public final class Lmw implements Runnable {
    public static final String __redex_internal_original_name = "ServicesMediaUploader$1$1$1";
    public final /* synthetic */ float A00;
    public final /* synthetic */ LVv A01;

    public Lmw(LVv lVv, float f) {
        this.A01 = lVv;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public void run() {
        Lr9 lr9 = (Lr9) this.A01.A01;
        GJj gJj = lr9.A04;
        if (gJj != null) {
            FHh fHh = lr9.A01;
            DKM dkm = new DKM();
            dkm.A0H(Float.valueOf(this.A00));
            FEK.A00(fHh, dkm.A0G(), gJj);
        }
    }
}
