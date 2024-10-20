package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;

/* renamed from: X.57d, reason: invalid class name */
/* loaded from: 57d.class */
public final class C57d implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        FbUserSession A0C = 4YV.A0C(r302.A0D);
        C1850Aun c1850Aun = new C1850Aun(r302, new AyN());
        AyN ayN = c1850Aun.A01;
        ayN.A00 = A0C;
        BitSet bitSet = c1850Aun.A02;
        bitSet.set(0);
        ayN.A01 = (C57e) anonymousClass544;
        bitSet.set(1);
        C1rs.A00(bitSet, c1850Aun.A03);
        c1850Aun.A0J();
        return ayN;
    }

    public Class BDi() {
        return C57e.class;
    }
}
