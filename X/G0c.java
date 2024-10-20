package X;

/* loaded from: G0c.class */
public final class G0c implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverSDKController$1$1";
    public final /* synthetic */ Efs A00;

    public G0c(Efs efs) {
        this.A00 = efs;
    }

    @Override // java.lang.Runnable
    public void run() {
        FJB fjb = this.A00.A00;
        FJB.A00(fjb).A0C("sdk_info_succeeded");
        fjb.A05 = 0S2.A0C;
        GIU giu = fjb.A00;
        if (giu != null) {
            giu.CIV();
        }
        FJB.A03(fjb);
    }
}
