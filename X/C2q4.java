package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.2q4, reason: invalid class name */
/* loaded from: 2q4.class */
public final class C2q4 extends C1rs {
    public 1Iw A00;
    public C2q3 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2q4(1Iw r302, C2q3 c2q3) {
        super(c2q3, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "userKeys"};
        BitSet bitSet = new BitSet(3);
        this.A02 = bitSet;
        this.A01 = c2q3;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2q3 A2W() {
        C1rs.A05(this.A02, this.A03, 3);
        A0J();
        return this.A01;
    }

    public void A2X(FbUserSession fbUserSession) {
        this.A01.A01 = fbUserSession;
        this.A02.set(1);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A0A = migColorScheme;
        this.A02.set(0);
    }

    public void A2Z(ImmutableList immutableList) {
        this.A01.A0E = immutableList;
        this.A02.set(2);
    }
}
