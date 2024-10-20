package X;

/* loaded from: AGe.class */
public final class AGe implements Runnable {
    public static final String __redex_internal_original_name = "NTFDSToggleActionAdapter$clickHandlerForAction$1$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FAd A01;
    public final /* synthetic */ FyG A02;
    public final /* synthetic */ boolean A03;

    public AGe(FAd fAd, FyG fyG, int i, boolean z) {
        this.A01 = fAd;
        this.A03 = z;
        this.A00 = i;
        this.A02 = fyG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A04(this.A02, Boolean.valueOf(this.A03), "NTFDSToggleActionAdapter.dispatchOnEvent", 52, this.A00);
    }
}
