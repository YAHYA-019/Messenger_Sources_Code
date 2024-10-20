package X;

/* loaded from: Lr9.class */
public final class Lr9 implements Runnable {
    public static final String __redex_internal_original_name = "ServicesMediaUploader$1";
    public final /* synthetic */ EnE A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ GJj A03;
    public final /* synthetic */ GJj A04;
    public final /* synthetic */ GJj A05;
    public final /* synthetic */ String A06;

    public Lr9(EnE enE, FHh fHh, GJj gJj, GJj gJj2, GJj gJj3, GJj gJj4, String str) {
        this.A00 = enE;
        this.A06 = str;
        this.A03 = gJj;
        this.A01 = fHh;
        this.A04 = gJj2;
        this.A02 = gJj3;
        this.A05 = gJj4;
    }

    @Override // java.lang.Runnable
    public void run() {
        EnE enE = this.A00;
        String str = this.A06;
        1BK.A1E(enE.A01).execute(new IzP(enE, new LVv(this, 0), str));
    }
}
