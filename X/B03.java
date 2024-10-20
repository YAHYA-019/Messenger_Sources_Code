package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;

/* loaded from: B03.class */
public final class B03 extends C1rj {
    public static final MigColorScheme A06 = LightColorScheme.A00();
    public FbUserSession A00;
    public BroadcastFlowMnetItem A01;
    public BKo A02;
    public DK7 A03;
    public CtF A04;
    public MigColorScheme A05;

    public B03() {
        super("MoreWaysToShareItemComponent");
        this.A05 = A06;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A02, this.A05, this.A00, this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        CtF ctF = this.A04;
        DK7 dk7 = this.A03;
        BKo bKo = this.A02;
        BroadcastFlowMnetItem broadcastFlowMnetItem = this.A01;
        MigColorScheme migColorScheme = this.A05;
        1fF r0 = (1fF) 1Bi.A03(66655);
        if (!(dk7 instanceof Ct2)) {
            return null;
        }
        if (!1Br.A07(((C9Jk) 1Br.A0B(r0.A01)).A00).AZk(72341229383258613L) && 1fF.A00(r0).AZk(36325222777770466L)) {
            return null;
        }
        AvZ avZ = new AvZ(r302, new B02());
        B02 b02 = avZ.A01;
        b02.A00 = fbUserSession;
        BitSet bitSet = avZ.A02;
        bitSet.set(1);
        b02.A04 = ctF;
        bitSet.set(3);
        b02.A02 = (Ct2) dk7;
        bitSet.set(2);
        b02.A01 = broadcastFlowMnetItem;
        b02.A03 = bKo;
        bitSet.set(0);
        b02.A05 = migColorScheme;
        C1rs.A02(bitSet, avZ.A03);
        avZ.A0J();
        return b02;
    }
}
