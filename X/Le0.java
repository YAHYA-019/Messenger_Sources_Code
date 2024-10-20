package X;

/* loaded from: Le0.class */
public final class Le0 implements C4F2 {
    public final /* synthetic */ 2vH A00;
    public final /* synthetic */ C51j A01;

    public Le0(2vH r302, C51j c51j) {
        this.A01 = c51j;
        this.A00 = r302;
    }

    @Override // X.C4F2
    public void onFailure(Exception exc) {
        this.A00.A00(exc);
    }
}
