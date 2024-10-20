package X;

/* loaded from: Foj.class */
public final class Foj implements GFx {
    public final /* synthetic */ DS7 A00;

    public Foj(DS7 ds7) {
        this.A00 = ds7;
    }

    @Override // X.GFx
    public void CPu(String str) {
        DS7 ds7 = this.A00;
        ds7.A00 = str;
        DKF.A0J(ds7.A09).A00(ds7.A05, Boolean.valueOf(ds7.A0G.BTX(new RvR(str))));
    }
}
