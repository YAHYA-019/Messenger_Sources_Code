package X;

/* loaded from: Iaa.class */
public final class Iaa implements 3wJ {
    public final int A00;
    public final Object A01;

    public Iaa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void CPj(int i) {
        if (this.A00 != 0) {
            C2736Gml.A0B((C2736Gml) this.A01, i, false, false);
            return;
        }
        ICJ A0J = AbstractC2326GOr.A0J(((HzU) this.A01).A04.A00);
        boolean z = i != 0;
        if (A0J.A05 != z) {
            A0J.A05 = z;
        }
        ICJ.A01(A0J);
        A0J.A03();
    }
}
