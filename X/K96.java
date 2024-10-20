package X;

/* loaded from: K96.class */
public final class K96 extends Lra {
    public static final String __redex_internal_original_name = "r";
    public final /* synthetic */ 4FE A00;
    public final /* synthetic */ KRn A01;
    public final /* synthetic */ Kjj A02;
    public final /* synthetic */ byte[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K96(4FE r302, 4FE r303, KRn kRn, Kjj kjj, byte[] bArr) {
        super(r302);
        this.A02 = kjj;
        this.A03 = bArr;
        this.A00 = r303;
        this.A01 = kRn;
    }

    @Override // X.Lra
    public final void A00(Exception exc) {
        if (exc instanceof Lx2) {
            super.A00(new K2E(-9, exc));
        } else {
            super.A00(exc);
        }
    }
}
