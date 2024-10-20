package X;

/* loaded from: D4s.class */
public final class D4s implements GHF {
    public final C0dr A00;
    public final CJ8 A01;

    public D4s(C0dr c0dr, CJ8 cj8) {
        11T.A0F(c0dr, 2);
        this.A01 = cj8;
        this.A00 = c0dr;
    }

    public void ARF(FFD ffd, DLG dlg) {
        String A00;
        boolean A1X = 7zP.A1X(dlg);
        Object obj = ffd.A02;
        CNS cns = (CNS) obj;
        if (cns == null || (A00 = BWb.A00(cns)) == null) {
            return;
        }
        long now = this.A00.now();
        int intValue = dlg.A02(ffd).intValue();
        if (intValue != A1X) {
            if (intValue == 2) {
                0fH.A0g(String.valueOf(obj), "LifeEventViewpointAction", "log impression ends: %s");
                this.A01.A01(Long.valueOf(now), cns, A00);
                return;
            }
            return;
        }
        0fH.A0g(String.valueOf(obj), "LifeEventViewpointAction", "log impression starts: %s");
        CJ8 cj8 = this.A01;
        Long valueOf = Long.valueOf(now);
        Integer A0h = 7zN.A0h();
        cj8.A04(A0h, A0h, valueOf, cns, A00);
    }
}
