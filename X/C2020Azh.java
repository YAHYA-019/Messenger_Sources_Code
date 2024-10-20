package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;

/* renamed from: X.Azh, reason: case insensitive filesystem */
/* loaded from: Azh.class */
public final class C2020Azh extends C1rj {
    public 06Z A00;
    public FbUserSession A01;
    public 7XT A02;
    public 7XP A03;
    public ThreadKey A04;
    public ThreadSummary A05;
    public 6Fe A06;
    public 7XU A07;
    public MigColorScheme A08;
    public User A09;

    public C2020Azh() {
        super("ContextBannerButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A01, this.A00, this.A06, this.A07, this.A09, this.A04, this.A03, this.A05, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i;
        Capabilities capabilities;
        B1K A0P = 4YU.A0P(r302);
        FbUserSession fbUserSession = this.A01;
        MigColorScheme migColorScheme = this.A08;
        ThreadKey threadKey = this.A04;
        User user = this.A09;
        06Z r0 = this.A00;
        7XP r02 = this.A03;
        ThreadSummary threadSummary = this.A05;
        6Fe r03 = this.A06;
        1Kn r04 = A0P.A00;
        CJ6 cj6 = (CJ6) 1Bn.A0A(83668);
        boolean A1Y = (threadSummary == null || (capabilities = threadSummary.A1C) == null) ? false : 4YU.A1Y(capabilities, 21);
        3yU r05 = 3yU.A0C;
        3yV r06 = 3yV.A0P;
        cj6.A05(r05, r06, r04);
        cj6.A03(BOo.A0O, r05, r06, true);
        1Kn r07 = 1Kn.A04;
        if (r04.equals(r07)) {
            cj6.A01(EnumC3497Mfs.A02, Long.parseLong(user.A13));
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        4YU.A1N(A01, 2RH.A04);
        AwP awP = new AwP(r302, new AzK());
        awP.A2W((1Kn.A03 == r04 || r07 == r04 || !(1Kn.A05 == r04 || 1Kn.A01 == r04)) ? 2131954918 : 2131954933);
        AzK azK = awP.A01;
        azK.A05 = migColorScheme;
        BitSet bitSet = awP.A02;
        bitSet.set(1);
        azK.A03 = new CZ6(0, fbUserSession, r302, user, r0, r03, r04, A1Y);
        bitSet.set(2);
        1Kn r08 = 1Kn.A05;
        if (r08 == r04) {
            i = 2131954934;
        } else if (r07 == r04) {
            i = 2131954943;
        } else {
            i = 2131954919;
            if (1Kn.A01 == r04) {
                i = 2131954932;
            }
        }
        awP.A2X(i);
        awP.A2Y((r08 == r04 || r07 == r04 || 1Kn.A01 == r04) ? 2MQ.A1W : 2MQ.A1V);
        azK.A06 = AnonymousClass001.A1W(r07, r04);
        AbG.A1N(awP, r302, C2020Azh.class, "ContextBannerButtonComponent", -1714935487);
        A01.A2e(awP);
        AwP awP2 = new AwP(r302, new AzK());
        awP2.A2W(2131954953);
        AzK azK2 = awP2.A01;
        azK2.A05 = migColorScheme;
        BitSet bitSet2 = awP2.A02;
        bitSet2.set(1);
        azK2.A03 = new CYx(r0, r302, r02, threadKey, user, A1Y);
        bitSet2.set(2);
        awP2.A2X(2131954955);
        awP2.A2Y(2MQ.A0A);
        A01.A2e(awP2);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1714935487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iw r0 = r302.A00.A00;
        r0.A06();
        Bga bga = (Bga) 1Bi.A03(68507);
        1Kn r02 = bga.A00;
        bga.A00 = null;
        if (r02 == null) {
            return null;
        }
        bga.A00 = null;
        if (r0.A02 != null) {
            r0.A0G(7zS.A0N((Object) null), "updateState:ContextBannerButtonComponent.updateFriendshipStatusState");
        }
        bga.A00 = null;
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((B1K) r303).A00 = this.A09.A0a;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
