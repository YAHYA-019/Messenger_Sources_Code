package X;

/* loaded from: Ip9.class */
public final /* synthetic */ class Ip9 implements Runnable {
    public static final String __redex_internal_original_name = "MsqrdCameraViewCoordinator$$ExternalSyntheticLambda0";
    public final /* synthetic */ IRS A00;

    @Override // java.lang.Runnable
    public final void run() {
        IRS irs = this.A00;
        if (IRF.A06(irs.A0B) == null) {
            0fH.A0B(IRS.class, "Null MediaCaptureSink when trying to start camera.");
        } else {
            0fH.A0A(IRS.class, "start");
            IRS.A01(irs);
        }
    }
}
