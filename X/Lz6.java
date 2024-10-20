package X;

import java.util.List;

/* loaded from: Lz6.class */
public final class Lz6 extends C00v implements MRN {
    public int A00;
    public final int A01;
    public final MRN A02;

    public Lz6(MRN mrn, int i, int i2) {
        11T.A0F(mrn, 1);
        this.A02 = mrn;
        this.A01 = i;
        A00(i, i2, mrn.size());
        this.A00 = i2 - i;
    }

    public static final void A00(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(0Pz.A0q("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
        }
        if (i > i2) {
            throw JQy.A0i("fromIndex: ", " > toIndex: ", i, i2);
        }
    }

    @Override // X.C00w
    public int A08() {
        return this.A00;
    }

    @Override // X.C00v, java.util.List
    public Object get(int i) {
        Kwk.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    @Override // X.C00v, java.util.List
    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        A00(i, i2, this.A00);
        MRN mrn = this.A02;
        int i3 = this.A01;
        return new Lz6(mrn, i + i3, i3 + i2);
    }
}
