package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8py, reason: invalid class name */
/* loaded from: 8py.class */
public final class C8py extends 2Yv {
    public C6wc A00;
    public AtomicBoolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            this.A04 = 7zO.A1Z(objArr, 0);
            return;
        }
        if (i == 1) {
            C6wc c6wc = this.A00;
            C6wc c6wc2 = (C6wc) objArr[0];
            11T.A0F(c6wc2, 1);
            if (!c6wc2.equals(c6wc)) {
                c6wc = c6wc2;
            }
            this.A00 = c6wc;
            return;
        }
        if (i == 2) {
            Boolean valueOf = Boolean.valueOf(this.A02);
            Boolean bool = (Boolean) objArr[0];
            if (!11T.A0O(bool, valueOf)) {
                valueOf = bool;
            }
            this.A02 = valueOf.booleanValue();
            return;
        }
        if (i == 3) {
            Boolean valueOf2 = Boolean.valueOf(this.A03);
            Boolean bool2 = (Boolean) objArr[0];
            if (!11T.A0O(bool2, valueOf2)) {
                valueOf2 = bool2;
            }
            this.A03 = valueOf2.booleanValue();
        }
    }
}
