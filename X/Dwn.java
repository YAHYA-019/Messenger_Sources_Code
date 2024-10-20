package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dwn.class */
public final class Dwn extends C1rj {
    public FbUserSession A00;
    public MigColorScheme A01;
    public GRD A02;

    public Dwn() {
        super("MediaSyncAdCountdownPluginComponent");
    }

    public final Object[] A0k() {
        MigColorScheme migColorScheme = this.A01;
        Integer A0i = 7zN.A0i();
        return new Object[]{migColorScheme, A0i, this.A00, A0i, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        GRD grd = this.A02;
        MigColorScheme migColorScheme = this.A01;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A00.A05 = true;
        Dsh dsh = new Dsh(r302, new DyH());
        DyH dyH = dsh.A01;
        dyH.A02 = fbUserSession;
        BitSet bitSet = dsh.A02;
        bitSet.set(2);
        dyH.A04 = migColorScheme;
        bitSet.set(1);
        dyH.A00 = 1;
        dyH.A01 = 1;
        dyH.A03 = new IUj(grd);
        bitSet.set(0);
        C1rs.A03(bitSet, dsh.A03);
        dsh.A0J();
        return 7zL.A0V(A01, dyH);
    }
}
