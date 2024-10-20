package X;

/* loaded from: Hls.class */
public final class Hls {
    public final /* synthetic */ ICT A00;

    public Hls(ICT ict) {
        this.A00 = ict;
    }

    public void A00(HBA hba) {
        ICT ict;
        Integer num;
        HQw hQw = this.A00.A00;
        if (hQw != null) {
            6Sm r0 = hQw.A00;
            if (r0.A04 != null) {
                int ordinal = hba.ordinal();
                boolean z = true;
                if (ordinal == 0 || ordinal == 3) {
                    6Sm.A05(r0, 0S2.A0C);
                    return;
                }
                if (ordinal == 1) {
                    r0.A05.A08();
                    ict = r0.A04;
                    num = 0S2.A0C;
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 4) {
                            if (6Sm.A01(r0, false) == null) {
                                z = false;
                            }
                            r0.A0G = z;
                            return;
                        }
                        return;
                    }
                    r0.A05.A07();
                    ict = r0.A04;
                    num = 0S2.A0N;
                }
                ict.A04(num);
            }
        }
    }
}
