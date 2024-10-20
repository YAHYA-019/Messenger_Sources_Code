package X;

/* loaded from: Hmo.class */
public final class Hmo {
    public final /* synthetic */ Ie2 A00;

    public Hmo(Ie2 ie2) {
        this.A00 = ie2;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.RuntimeException, X.J6u] */
    public void A00(HzD hzD) {
        Ie2 ie2;
        if (hzD.A04 == null && hzD.A01 == null) {
            ie2 = this.A00;
            ie2.A09 = 1BK.A0d();
            ie2.A07 = new RuntimeException("Could not retrieve data from photo processor.");
        } else {
            ie2 = this.A00;
            ie2.A09 = AnonymousClass001.A0K();
            ie2.A08 = hzD;
            if (ie2.A05) {
                if (ie2.A02.A01[((r0.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
        }
        ie2.A03.A01();
    }
}
