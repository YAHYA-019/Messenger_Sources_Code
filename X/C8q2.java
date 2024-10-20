package X;

/* renamed from: X.8q2, reason: invalid class name */
/* loaded from: 8q2.class */
public final class C8q2 extends 2Yv implements C54v {
    public boolean A00;

    public void A02(C2l4 c2l4) {
        if (A90(c2l4) != null) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.C54v
    public C3s9 A90(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 != 0) {
            return null;
        }
        Boolean bool = (Boolean) objArr[0];
        5X3 A02 = C3s9.A02("press");
        A02.A03(C2jm.A00);
        7zN.A12(C5sf.A00, A02, 150);
        this.A00 = bool.booleanValue();
        return A02;
    }
}
