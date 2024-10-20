package X;

/* renamed from: X.5bq, reason: invalid class name */
/* loaded from: 5bq.class */
public final class C5bq extends 2Yv implements C54v {
    public 3yB A00;
    public boolean A01;

    public void A02(C2l4 c2l4) {
        if (A90(c2l4) != null) {
            throw AnonymousClass001.A0p();
        }
    }

    @Override // X.C54v
    public C3s9 A90(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 != 0) {
            return null;
        }
        Boolean bool = (Boolean) objArr[0];
        5X3 A00 = C3s9.A00(5Rn.A01, "press");
        A00.A03(C2jm.A04);
        ((5X4) A00).A02 = new C5X0(C5sf.A00, 150);
        this.A01 = bool.booleanValue();
        return A00;
    }
}
