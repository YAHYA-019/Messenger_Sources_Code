package X;

/* renamed from: X.3h0, reason: invalid class name */
/* loaded from: 3h0.class */
public final class C3h0 implements Runnable {
    public static final String __redex_internal_original_name = "RsysAppModelStateImpl$onNewModel$1";
    public final /* synthetic */ 2JN A00;
    public final /* synthetic */ 2JS A01;

    public C3h0(2JN r302, 2JS r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2JN r0 = this.A00;
        2JS r02 = this.A01;
        r0.A00 = r02;
        for (2JM r03 : r0.A05) {
            C00j.A05(0Pz.A0W(r03.BGe(), ".onModelUpdate"), -1091845553);
            try {
                r03.C7K(r02);
                C00j.A01(-100484005);
            } catch (Throwable th) {
                C00j.A01(-1845836179);
                throw th;
            }
        }
    }
}
