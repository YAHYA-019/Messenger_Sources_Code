package X;

/* loaded from: Fq5.class */
public final class Fq5 implements GGI {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Fq5(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public void onFailure(Throwable th) {
        if (this.A00 == 0) {
            FIT A00 = F9N.A00((DZW) this.A01);
            if (A00 != null) {
                A00.A0I("native_templates_error", 0Pz.A0W("Error rendering ", this.A02), th);
                return;
            }
            return;
        }
        DZW dzw = ((Fpy) this.A01).A00;
        dzw.A0G.A01();
        dzw.A0E.Ccf(this.A02, "A network error has occurred", "NETWORK_FAILURE");
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0I("native_templates_error", "Error rendering NT Generic Dialog", th);
        }
    }
}
