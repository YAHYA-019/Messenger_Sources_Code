package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.8pm, reason: invalid class name */
/* loaded from: 8pm.class */
public final class C8pm extends 2Yv {
    public int A00;
    public ELK A01;
    public ImmutableList A02;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            this.A00 = 7zO.A08(objArr, 0);
            return;
        }
        if (i == 1) {
            ELK elk = (ELK) objArr[0];
            ImmutableList immutableList = (ImmutableList) objArr[1];
            11T.A0F(elk, 2);
            this.A01 = elk;
            this.A02 = immutableList;
        }
    }
}
