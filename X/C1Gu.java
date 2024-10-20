package X;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: X.1Gu, reason: invalid class name */
/* loaded from: 1Gu.class */
public final class C1Gu {
    public final 1Gv A00;
    public final Executor A01;

    public C1Gu(Executor executor) {
        11T.A0F(executor, 1);
        this.A01 = executor;
        this.A00 = new 1D3();
    }

    public void A00(1Gw r302, int i) {
        11T.A0F(r302, 0);
        this.A00.A00(Integer.valueOf(i), r302);
    }

    public void A01(1Gw r302, int... iArr) {
        11T.A0F(r302, 0);
        11T.A0F(iArr, 1);
        1Gv r0 = this.A00;
        int length = iArr.length;
        HashSet hashSet = new HashSet(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                r0.A02(r302, hashSet);
                return;
            } else {
                hashSet.add(Integer.valueOf(iArr[i2]));
                i = i2 + 1;
            }
        }
    }

    public void A02(1Gw r302, int... iArr) {
        1Gv r0 = this.A00;
        HashSet hashSet = new HashSet(1);
        hashSet.add(Integer.valueOf(iArr[0]));
        r0.A03(r302, hashSet);
    }
}
