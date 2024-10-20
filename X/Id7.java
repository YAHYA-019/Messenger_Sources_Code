package X;

/* loaded from: Id7.class */
public final class Id7 implements JG4 {
    public final /* synthetic */ IRK A00;

    public Id7(IRK irk) {
        this.A00 = irk;
    }

    @Override // X.JG4
    public void CAR(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i3 % 180;
        IRK irk = this.A00;
        if (i5 == 0) {
            irk.A04 = i;
            irk.A03 = i2;
        } else {
            irk.A04 = i2;
            irk.A03 = i;
        }
        IRK.A05(irk);
    }
}
