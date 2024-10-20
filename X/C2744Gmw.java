package X;

/* renamed from: X.Gmw, reason: case insensitive filesystem */
/* loaded from: Gmw.class */
public final class C2744Gmw extends AbstractC1534Akn {
    public static final String __redex_internal_original_name = "LocationSharingSearchFragment";
    public JEv A00;
    public boolean A01 = false;

    @Override // X.AbstractC1534Akn
    public JEv A1Z() {
        return this.A00;
    }

    @Override // X.AbstractC1534Akn
    public HRV A1a() {
        return null;
    }

    @Override // X.AbstractC1534Akn
    public AbstractC2385Gbm A1b() {
        QPN b5y;
        if (this.A01) {
            b5y = new QPN();
        } else {
            b5y = new B5Y();
            b5y.A00 = 10;
            b5y.A09 = true;
        }
        return (AbstractC2385Gbm) b5y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534Akn
    public String A1c() {
        return getString(2131958683);
    }
}
