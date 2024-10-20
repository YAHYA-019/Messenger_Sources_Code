package X;

import java.util.Iterator;

/* loaded from: Lfi.class */
public final class Lfi implements MJg {
    public static final Lfi A00 = new Object();

    @Override // X.MJg
    public Class Aqu() {
        return MDb.class;
    }

    @Override // X.MJg
    public Class B4p() {
        return MDb.class;
    }

    @Override // X.MJg
    public /* bridge */ /* synthetic */ Object DAn(L0X l0x) {
        if (l0x.A00 == null) {
            throw JQx.A10("no primary in primitive set");
        }
        Iterator A1A = 1BK.A1A(l0x.A03);
        while (A1A.hasNext()) {
            Iterator A1G = GOn.A1G(A1A.next());
            while (A1G.hasNext()) {
                A1G.next();
            }
        }
        return new Lfv(l0x);
    }
}
