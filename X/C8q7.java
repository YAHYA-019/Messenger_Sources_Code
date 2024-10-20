package X;

/* renamed from: X.8q7, reason: invalid class name */
/* loaded from: 8q7.class */
public final class C8q7 extends 2Yv implements C54v {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Boolean A04;
    public final Boolean A05;

    public void A02(C2l4 c2l4) {
        if (A90(c2l4) != null) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.C54v
    public C3s9 A90(C2l4 c2l4) {
        Object obj;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == ((-1) << (-1))) {
            this.A01 = 7zO.A1Z(objArr, 0);
            return null;
        }
        if (i == -2147483647) {
            obj = objArr[0];
        } else {
            if (i == 0) {
                this.A03 = 7zO.A1Z(objArr, 0);
                return null;
            }
            if (i != 1) {
                if (i == 2) {
                    this.A02 = false;
                    return null;
                }
                if (i == 3) {
                    5XA A0G = 7zV.A0G();
                    this.A02 = true;
                    this.A01 = true;
                    this.A00 = 0;
                    return A0G;
                }
                if (i != 4) {
                    return null;
                }
                5X3 A02 = C3s9.A02("game_icon_transition_key");
                A02.A03(C2jm.A00);
                ((5X4) A02).A02 = new 5Rl(300.0d, 35.0d);
                this.A02 = false;
                return A02;
            }
            obj = 0;
            this.A02 = true;
            this.A01 = true;
        }
        this.A00 = AnonymousClass001.A03(obj);
        return null;
    }
}
