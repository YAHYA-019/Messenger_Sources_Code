package X;

/* loaded from: G4d.class */
public final /* synthetic */ class G4d implements Runnable {
    public static final String __redex_internal_original_name = "HeadersSubscriber$$ExternalSyntheticLambda0";
    public final /* synthetic */ InterfaceC01693sk A00;
    public final /* synthetic */ 1Pp A01;
    public final /* synthetic */ FuK A02;

    public /* synthetic */ G4d(InterfaceC01693sk interfaceC01693sk, 1Pp r303, FuK fuK) {
        this.A02 = fuK;
        this.A00 = interfaceC01693sk;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FuK fuK = this.A02;
        Ejv ejv = new Ejv(this.A00.get(this.A01.A00.getState()), true);
        5Y6 r0 = fuK.A00;
        if (r0 != null) {
            r0.A00();
            fuK.A00 = null;
        }
        if (fuK.A01) {
            return;
        }
        fuK.A01 = true;
        fuK.A02.CKJ(ejv.A00);
    }
}
