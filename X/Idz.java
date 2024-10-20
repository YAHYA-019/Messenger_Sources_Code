package X;

/* loaded from: Idz.class */
public final class Idz implements JGI {
    public final /* synthetic */ Ie3 A00;

    public Idz(Ie3 ie3) {
        this.A00 = ie3;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.RuntimeException, X.J6u] */
    public void CQd() {
        HrO hrO;
        Ie3 ie3 = this.A00;
        if (ie3.A0I) {
            if (ie3.A0G != 1 && ie3.A0G != 7) {
                if (ie3.A0G == 2 || ie3.A0G == 3 || ie3.A0G == 4) {
                    ie3.A0G = 0;
                    return;
                }
                return;
            }
            ie3.A0G = 0;
            ie3.A0A = false;
            ie3.A00 = new RuntimeException("Failed to start operation. Operation timed out.");
            HWx hWx = ie3.A01;
            if (hWx == null || (hrO = hWx.A00.A0m) == null || hrO.A00.isEmpty()) {
                return;
            }
            I9z.A00(new Ist(hrO));
        }
    }
}
