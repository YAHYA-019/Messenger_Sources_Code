package X;

/* loaded from: Hmk.class */
public final class Hmk {
    public final /* synthetic */ Hpu A00;

    public Hmk(Hpu hpu) {
        this.A00 = hpu;
    }

    public void A00(RLd rLd) {
        Integer num = rLd.A02;
        int i = rLd.A01;
        int i2 = rLd.A00;
        int intValue = num.intValue();
        if (intValue == 0) {
            H4n h4n = this.A00.A02;
            h4n.A0X(i, i2);
            H4n.A01(h4n, (short) 2);
        } else {
            if (intValue == 1) {
                this.A00.A02.A0W(i, i2);
                return;
            }
            if (intValue == 4) {
                H4n.A01(this.A00.A02, (short) 3);
            }
            this.A00.A02.A0V();
        }
    }
}
