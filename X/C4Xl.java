package X;

/* renamed from: X.4Xl, reason: invalid class name */
/* loaded from: 4Xl.class */
public final class C4Xl implements C15h {
    public final int A00;
    public final Object A01;

    public C4Xl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        switch (this.A00) {
            case 0:
                i = 67603;
                break;
            case 1:
                i = 83859;
                break;
            case 2:
                return 1Bi.A03(84633);
            case 3:
                return 1Fw.A00();
            default:
                return 1Bn.A0A(99409);
        }
        return 1De.A00(((C4Tz) this.A01).A00, i);
    }
}
