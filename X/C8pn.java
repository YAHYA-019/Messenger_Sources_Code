package X;

import java.util.List;

/* renamed from: X.8pn, reason: invalid class name */
/* loaded from: 8pn.class */
public final class C8pn extends 2Yv {
    public int A00;
    public List A01;
    public boolean A02;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            Number valueOf = Integer.valueOf(this.A00);
            Number number = (Number) objArr[0];
            int intValue = number.intValue();
            if (valueOf == null || valueOf.intValue() != intValue) {
                valueOf = number;
            }
            this.A00 = valueOf.intValue();
            return;
        }
        if (i == 1) {
            this.A02 = true;
        } else if (i == 2) {
            List list = (List) objArr[0];
            11T.A0F(list, 1);
            this.A01 = list;
        }
    }
}
