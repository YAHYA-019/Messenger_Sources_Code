package X;

import java.util.List;

/* renamed from: X.2sn, reason: invalid class name */
/* loaded from: 2sn.class */
public final class C2sn implements C2k6 {
    public final 1Iw A00;
    public final List A01;

    public C2sn(1Iw r302, List list) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A01 = list;
    }

    public final void A00(1LI r302) {
        if (r302 != null) {
            this.A01.add(r302);
        }
    }

    @Override // X.C2k6
    public 1Iw AeS() {
        return this.A00;
    }

    @Override // X.C2k7
    public C1qo B7k() {
        C1qo c1qo = AeS().A0E;
        11T.A0A(c1qo);
        return c1qo;
    }
}
