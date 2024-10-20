package X;

/* loaded from: D8v.class */
public final class D8v implements Runnable {
    public static final String __redex_internal_original_name = "GroupIdMobileConfigFetcher$createLiveData$1$onActive$1";
    public final /* synthetic */ AfP A00;
    public final /* synthetic */ Bve A01;
    public final /* synthetic */ String A02;

    public D8v(AfP afP, Bve bve, String str) {
        this.A01 = bve;
        this.A02 = str;
        this.A00 = afP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bve bve = this.A01;
        1CL AvS = ((C05204d8) 1Br.A0B(bve.A03)).A00(this.A02).AvS();
        AfP afP = this.A00;
        C05924fb c05924fb = new C05924fb();
        c05924fb.A01 = new CxH(afP, bve);
        if (AbJ.A0Q(bve.A01).A09()) {
            c05924fb.A05 = true;
        } else {
            c05924fb.A00 = 30000;
        }
        AvS.updateConfigs(c05924fb);
    }
}
