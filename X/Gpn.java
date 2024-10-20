package X;

/* loaded from: Gpn.class */
public final class Gpn extends HG0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Gpn(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A01(Integer num, Integer num2) {
        IDX idx;
        int i = this.A00;
        11T.A0F(num2, 1);
        Integer num3 = 0S2.A0N;
        if (i == 0) {
            if (num2 == num3) {
                IF3 if3 = (IF3) this.A02;
                if (2yD.A03(GOq.A0f(if3.A06), 36314296384167780L)) {
                    4YV.A11(if3.A0D).execute(SEz.A00);
                    return;
                }
                return;
            }
            return;
        }
        if (num2 == num3) {
            ((JEd) this.A01).BkR();
            idx = (IDX) this.A02;
        } else {
            if (num2 != 0S2.A01) {
                return;
            }
            idx = (IDX) this.A02;
            idx.A06((JEd) this.A01);
        }
        GOp.A0T(idx.A03).A0C(this);
    }
}
