package X;

/* loaded from: Lbx.class */
public final class Lbx implements MG5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lbx(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.MG5
    public final void BQ8(Object obj) {
        switch (this.A00) {
            case 5:
                Ks1 ks1 = (Ks1) this.A01;
                ((MKu) obj).CCX((6ZV) this.A02, ks1);
                return;
            case 7:
                ((MKu) obj).CUJ((Ks1) this.A01, (6WV) this.A02);
                return;
            case 10:
                ((MKu) obj).Buu((Ks1) this.A01, (6aF) this.A02);
                return;
            case 11:
                ((MKu) obj).CTw((Ks1) this.A01, (6VN) this.A02);
                return;
            default:
                return;
        }
    }
}
