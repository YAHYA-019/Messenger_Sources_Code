package X;

/* loaded from: Cpq.class */
public final class Cpq implements DFe {
    public final int A00;
    public final Object A01;

    public Cpq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DFe
    public /* bridge */ /* synthetic */ void BsT(C1323Ae1 c1323Ae1, DIW diw, ByH byH, Object obj) {
        C1325Ae3 c1325Ae3;
        Cf3 cf3;
        switch (this.A00) {
            case 0:
                Cf3 cf32 = (Cf3) this.A01;
                c1325Ae3 = cf32.A02;
                cf3 = cf32;
                break;
            case 1:
                Cf2 cf2 = (Cf2) this.A01;
                c1325Ae3 = cf2.A01;
                cf3 = cf2;
                break;
            case 2:
                1BK.A1E(((CMK) this.A01).A06).execute(new SD5(c1323Ae1, this, (String) obj));
                return;
            case 3:
                ((C1320Ady) this.A01).A0F(c1323Ae1, diw, byH, obj);
                return;
            default:
                11T.A0F(c1323Ae1, 2);
                Cpt cpt = (Cpt) this.A01;
                C1325Ae3 c1325Ae32 = cpt.A02;
                C1323Ae1 c1323Ae12 = C1323Ae1.A03;
                c1325Ae32.BsT(new C1323Ae1(cpt.A01.D4u(byH, c1323Ae1.A01), c1323Ae1.A02), cpt, byH, obj);
                return;
        }
        c1325Ae3.BsT(c1323Ae1, cf3, byH, obj);
    }
}
