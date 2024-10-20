package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;

/* renamed from: X.57f, reason: invalid class name */
/* loaded from: 57f.class */
public final class C57f implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        FbUserSession A0C = 4YV.A0C(r302.A0D);
        C1849Aum c1849Aum = new C1849Aum(r302, new C2009Az4());
        C2009Az4 c2009Az4 = c1849Aum.A01;
        c2009Az4.A00 = A0C;
        BitSet bitSet = c1849Aum.A02;
        bitSet.set(0);
        c2009Az4.A01 = (C57g) anonymousClass544;
        bitSet.set(1);
        C1rs.A00(bitSet, c1849Aum.A03);
        c1849Aum.A0J();
        return c2009Az4;
    }

    public Class BDi() {
        return C57g.class;
    }
}
