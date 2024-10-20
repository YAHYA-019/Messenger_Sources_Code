package X;

/* loaded from: Iva.class */
public final class Iva implements Runnable {
    public static final String __redex_internal_original_name = "UIControlServiceCommonDelegate$11";
    public final /* synthetic */ int A00;
    public final /* synthetic */ IPF A01;

    public Iva(IPF ipf, int i) {
        this.A01 = ipf;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        IPF ipf = this.A01;
        ipf.A01.CBf(ipf.A05, this.A00);
    }
}
