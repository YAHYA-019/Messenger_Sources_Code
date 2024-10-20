package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.9zf, reason: invalid class name */
/* loaded from: 9zf.class */
public final class C9zf implements 3wJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9zf(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CPj(int i) {
        switch (this.A00) {
            case 0:
                DLQ dlq = (DLQ) this.A02;
                GJj AlB = dlq.AlB(43);
                DKM dkm = new DKM();
                FyG fyG = (FyG) this.A01;
                dkm.A0H(fyG);
                dkm.A0I(11T.A03(Integer.valueOf(i)));
                FAv.A01(dlq, fyG, new DKc(dkm.A00), AlB);
                return;
            case 1:
                ((C2ky) this.A01).A04(((int[]) this.A02)[i], 0);
                return;
            case 2:
                C8i1 c8i1 = (C8i1) this.A02;
                8HA r0 = c8i1.A03.A00;
                r0.A00 = i;
                if (i == 1) {
                    r0.A09 = true;
                    2ZG r02 = r0.A05;
                    if (r02 == null) {
                        11T.A0L("inboxPymkRepository");
                        throw 0Q8.createAndThrow();
                    }
                    r02.A04(r0.A0I, "PYMK_MESSENGER_FRIEND_REQUESTS_LEFT_NAV", 2yD.A00(2VJ.A00((2VJ) 1Br.A0B(r0.A0G)), 36606787947929127L));
                }
                8HA.A07(r0, 1BK.A0b());
                if (i == 0) {
                    C8i1.A01(3yM.A03, (C4Ll) this.A01, c8i1);
                    return;
                } else {
                    if (i == 1) {
                        C8i1.A0L(3yM.A03, (C4Ll) this.A01, c8i1);
                        return;
                    }
                    return;
                }
            default:
                AcQ.A0G((ViewPager) this.A02, (AcQ) this.A01, i, false);
                return;
        }
    }
}
