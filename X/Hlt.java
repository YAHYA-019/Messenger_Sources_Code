package X;

/* loaded from: Hlt.class */
public final class Hlt {
    public final /* synthetic */ IEI A00;

    public Hlt(IEI iei) {
        this.A00 = iei;
    }

    public void A00(Integer num, int i) {
        IEI iei = this.A00;
        if (iei.A04 != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                IEI.A01(iei).BbB(IEI.A00(iei));
            } else if (intValue != 1) {
                IEI.A01(iei).BbE(i, IEI.A00(iei));
            } else {
                IEI.A01(iei).BbA(i, IEI.A00(iei));
            }
        }
    }
}
