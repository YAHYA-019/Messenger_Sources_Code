package X;

/* loaded from: Ix5.class */
public final class Ix5 implements Runnable {
    public static final String __redex_internal_original_name = "SelfVideoParticipantPresenter$updateDebugText$1";
    public final /* synthetic */ GrA A00;
    public final /* synthetic */ String A01;

    public Ix5(GrA grA, String str) {
        this.A00 = grA;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GrA grA = this.A00;
        Hhg A00 = GrA.A00(grA);
        A00.A02 = this.A01;
        grA.A0Z(new IZg(A00));
    }
}
