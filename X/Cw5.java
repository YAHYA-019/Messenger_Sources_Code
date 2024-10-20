package X;

/* loaded from: Cw5.class */
public final class Cw5 implements DHh {
    public final /* synthetic */ CbV A00;

    public Cw5(CbV cbV) {
        this.A00 = cbV;
    }

    @Override // X.DHh
    public void onFailure(Throwable th) {
        this.A00.A05.A02("Business inbox ban action graphql mutation failed.");
    }

    @Override // X.DHh
    public void onSuccess() {
        this.A00.A05.A01();
    }
}
