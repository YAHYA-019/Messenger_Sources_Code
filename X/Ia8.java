package X;

/* loaded from: Ia8.class */
public final class Ia8 implements 2Yl {
    public final int A00;
    public final Object A01;

    public Ia8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BoD() {
        C2375GbC c2375GbC;
        switch (this.A00) {
            case 0:
                c2375GbC = ((C2387Gbp) this.A01).A02;
                if (c2375GbC == null) {
                    11T.A0L("locationSharingPresenter");
                    throw 0Q8.createAndThrow();
                }
                break;
            case 1:
                c2375GbC = ((C2388Gbq) this.A01).A06;
                break;
            default:
                HXz hXz = ((GWH) this.A01).A02;
                if (hXz != null) {
                    H4x h4x = hXz.A00;
                    H4x.A08(h4x, true);
                    h4x.A0X.A02.callOnClick();
                    return;
                }
                return;
        }
        c2375GbC.A0D();
    }
}
