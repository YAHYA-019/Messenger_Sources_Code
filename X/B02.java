package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: B02.class */
public final class B02 extends C1rj {
    public static final MigColorScheme A06 = LightColorScheme.A00();
    public FbUserSession A00;
    public BroadcastFlowMnetItem A01;
    public Ct2 A02;
    public BKo A03;
    public DIh A04;
    public MigColorScheme A05;

    public B02() {
        super("AddToStoryRowComponent");
        this.A05 = A06;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A05, this.A00, this.A01, this.A02, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Object A00;
        1G1 r0 = this.A00;
        DIh dIh = this.A04;
        Ct2 ct2 = this.A02;
        BKo bKo = this.A03;
        MigColorScheme migColorScheme = this.A05;
        BroadcastFlowMnetItem broadcastFlowMnetItem = this.A01;
        UserKey A0X = 1BK.A0X(r0.A02);
        Context context = r302.A0D;
        2fZ r02 = (2fZ) 1Lo.A04(context, r0, (1BY) null, 17067);
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A00 = 3715933003L;
        A0p.A08 = r02.A0I(A0X);
        A0p.A08(r302.A0D(2131952374));
        CJh.A02(A0p, r302.A0D(2131952375));
        A0p.A05(migColorScheme);
        BnU bnU = (BnU) 1Bn.A0A(84084);
        C5F c5f = (C5F) 1Bn.A0A(84083);
        ImmutableList.Builder builder = ImmutableList.builder();
        1fF r03 = (1fF) 1Bi.A03(66655);
        if (bKo == BKo.A02 && AbG.A1b(1Br.A07(((C9Jk) 1Br.A0B(r03.A01)).A00), 72341229383586297L)) {
            builder.m11011add((Object) COF.A00(2MQ.A2o, 2Re.A03, Cx1.A01(dIh, 40), migColorScheme, context.getString(2131960462)));
        }
        if (bKo == BKo.A01) {
            String A0D = r302.A0D(2131952405);
            bnU.A01 = A0D;
            bnU.A00 = migColorScheme;
            11T.A0F(migColorScheme, 1);
            A00 = new C59o(AnonymousClass553.A01, migColorScheme, A0D);
        } else {
            c5f.A03 = r302.A0D(2131952317);
            c5f.A01 = migColorScheme;
            c5f.A00 = new Cwr(11, broadcastFlowMnetItem, dIh, ct2);
            A00 = c5f.A00();
        }
        A0p.A06(AbG.A0z(builder, A00));
        return 7zM.A10(A0p.A00(), 55M.A00(r302));
    }
}
