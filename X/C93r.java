package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.93r, reason: invalid class name */
/* loaded from: 93r.class */
public final class C93r extends 2pB {
    public final MigColorScheme A00;

    public C93r(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    public 1LI A00(1LI r302, 1Iw r303, C2m6 c2m6, Object obj) {
        boolean A1X = 1BL.A1X(r303, r302);
        11T.A0F(c2m6, 3);
        A9W a9w = (A9W) ((2oT) c2m6).A01.A00(A9W.A01);
        if (a9w == null) {
            return r302;
        }
        String str = a9w.A00;
        C2p8 c2p8 = C2p6.A00;
        C1rq A00 = C1rg.A00(r303);
        A00.A2f(r302);
        8Q5 r0 = new 8Q5(r303, new C8ja());
        MigColorScheme migColorScheme = this.A00;
        C8ja c8ja = r0.A01;
        c8ja.A01 = migColorScheme;
        BitSet bitSet = r0.A02;
        bitSet.set(A1X ? 1 : 0);
        c8ja.A03 = str;
        bitSet.set(0);
        c8ja.A02 = c2p8.A06;
        bitSet.set(3);
        c8ja.A00 = c2p8.A02;
        bitSet.set(2);
        r0.A0S();
        7zP.A14(r0, c8ja, A00, bitSet, r0.A03);
        return A00.A00;
    }
}
