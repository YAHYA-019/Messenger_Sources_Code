package X;

/* renamed from: X.8q6, reason: invalid class name */
/* loaded from: 8q6.class */
public final class C8q6 extends 2Yv implements C54v {
    public boolean A00;

    public void A02(C2l4 c2l4) {
        if (A90(c2l4) != null) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.C54v
    public C3s9 A90(C2l4 c2l4) {
        5X3 A02;
        int i;
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 != 0) {
            return null;
        }
        Boolean valueOf = Boolean.valueOf(this.A00);
        float A00 = 7zM.A00(objArr[0]);
        Object obj = objArr[1];
        boolean A1Z = 7zO.A1Z(objArr, 2);
        11T.A0F(obj, 2);
        if (11T.A0O(valueOf, true)) {
            A02 = null;
        } else {
            valueOf = true;
            A02 = C3s9.A02("ACTION_DRAWER_TRANSITION_KEY");
            if (A1Z) {
                A02.A03(C2jm.A00);
                7zM.A1U(A02, 50);
                A02.A02(0.0f);
                i = 6;
            } else {
                A02.A03(C2jm.A09);
                7zM.A1U(A02, 250);
                A02.A02(A00);
                i = 7;
            }
            ((5X4) A02).A05 = new A2E(obj, i);
        }
        this.A00 = valueOf.booleanValue();
        return A02;
    }
}
