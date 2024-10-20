package X;

/* loaded from: Is6.class */
public final class Is6 implements Runnable {
    public static final String __redex_internal_original_name = "SelfVideoParticipantPresenter$showLoadingRunnable$1";
    public final /* synthetic */ GrA A00;

    public Is6(GrA grA) {
        this.A00 = grA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GrA grA = this.A00;
        if (GS2.A07(grA)) {
            Hhg A00 = GrA.A00(grA);
            A00.A03 = true;
            grA.A0Z(new IZg(A00));
        }
    }
}
