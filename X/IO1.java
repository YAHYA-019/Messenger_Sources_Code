package X;

/* loaded from: IO1.class */
public final class IO1 implements JHr {
    public final /* synthetic */ Iid A00;

    public IO1(Iid iid) {
        this.A00 = iid;
    }

    @Override // X.JHr
    public I5B ATu(int i, int i2) {
        return I5B.A00(i / 4, i2);
    }

    @Override // X.JHr
    public I5B ATv(int i, int i2, int i3) {
        int i4 = Hv8.A00(I5B.A00(i, i2), i3, i3).A01;
        int i5 = i4 - (i4 % 4);
        return I5B.A00(i5, (int) (r0.A00 * (i5 / i4)));
    }
}
