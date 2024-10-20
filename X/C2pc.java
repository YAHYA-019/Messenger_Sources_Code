package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.BitSet;

/* renamed from: X.2pc, reason: invalid class name */
/* loaded from: 2pc.class */
public final class C2pc extends 2pB {
    public final MigColorScheme A00;
    public final boolean A01;

    public C2pc(MigColorScheme migColorScheme, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = z;
    }

    public 1LI A00(1LI r302, 1Iw r303, C2m6 c2m6, Object obj) {
        String str;
        11T.A0F(r303, 0);
        11T.A0F(r302, 1);
        11T.A0F(c2m6, 3);
        2oT r0 = (2oT) c2m6;
        HeterogeneousMap heterogeneousMap = r0.A01;
        AnonymousClass207 anonymousClass207 = C2nw.A03;
        C2nw c2nw = (C2nw) heterogeneousMap.A00(anonymousClass207);
        if (c2nw == null || (str = c2nw.A00) == null) {
            return r302;
        }
        C2nw c2nw2 = (C2nw) heterogeneousMap.A00(anonymousClass207);
        boolean z = false;
        boolean z2 = c2nw2 != null ? c2nw2.A02 : false;
        C2nw c2nw3 = (C2nw) heterogeneousMap.A00(anonymousClass207);
        if (c2nw3 != null) {
            z = c2nw3.A01;
        }
        C2p8 A00 = C2p6.A00((!r0.A04 || this.A01) ? z2 ? 0S2.A0Y : 0S2.A01 : 0S2.A0N);
        C1rq A01 = C1rg.A01(r303, null, 0);
        A01.A2f(r302);
        C2zk c2zk = new C2zk(r303, new C2pg());
        MigColorScheme migColorScheme = this.A00;
        C2pg c2pg = c2zk.A01;
        c2pg.A01 = migColorScheme;
        BitSet bitSet = c2zk.A02;
        bitSet.set(0);
        c2pg.A03 = str;
        bitSet.set(3);
        c2pg.A02 = A00.A07;
        bitSet.set(2);
        c2pg.A04 = z;
        c2pg.A00 = A00.A03;
        bitSet.set(1);
        c2zk.A0k(0.0f);
        A01.A2f(c2zk.A2W());
        return A01.A00;
    }
}
