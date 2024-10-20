package X;

import android.content.Context;
import android.view.ViewOutlineProvider;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Ays, reason: case insensitive filesystem */
/* loaded from: Ays.class */
public final class C1999Ays extends C1rj {
    public 06Z A00;
    public 2O4 A01;
    public FbUserSession A02;
    public C2kx A03;
    public 2YW A04;
    public 2Vk A05;
    public Blb A06;
    public CDf A07;
    public 2MX A08;
    public 2Un A09;
    public MigColorScheme A0A;
    public C5xv A0B;
    public AbU A0C;
    public Boolean A0D;

    public C1999Ays() {
        super("MarketplaceInboxRootComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A0A, this.A08, this.A02, this.A00, this.A04, this.A0D, this.A0C, this.A05, this.A0B, this.A01, this.A03, this.A06, this.A09, this.A07};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QIZ qiz;
        MigColorScheme migColorScheme = this.A0A;
        FbUserSession fbUserSession = this.A02;
        2Un r0 = this.A09;
        2YW r02 = this.A04;
        AbU abU = this.A0C;
        2Vk r03 = this.A05;
        2O4 r04 = this.A01;
        Boolean bool = this.A0D;
        C2kx c2kx = this.A03;
        CDf cDf = this.A07;
        C5xv c5xv = this.A0B;
        final 2MX r05 = this.A08;
        06Z r06 = this.A00;
        Blb blb = this.A06;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        2Mb r07 = (2Mb) 1Bi.A03(68519);
        if (r07.A00() && r07.A03()) {
            r05.getClass();
            Context context = r302.A0D;
            2QB r08 = (2QB) 1Hv.A02(context, 33094);
            AbV abV = new AbV(r302, new 2RG());
            String string = context.getString(2131966987);
            2RG r09 = abV.A01;
            r09.A09 = string;
            2RL r010 = (2RL) 1Bn.A0A(17018);
            B67 b67 = new B67();
            ((2ON) b67).A00 = r05;
            r09.A08 = r010.A00(2RM.A00(context, r06, fbUserSession, (1pI) null, b67, 1BJ.A00(798), false, false, false));
            BitSet bitSet = abV.A02;
            bitSet.set(0);
            r09.A0B = !bool.booleanValue();
            bitSet.set(4);
            r09.A06 = migColorScheme;
            bitSet.set(2);
            r09.A02 = r08.A00;
            r09.A05 = new 2Rq() { // from class: X.3Zw
                public void C7Y() {
                    r05.CVh(0S2.A00);
                }

                public boolean C7b(Context context2, 06Z r303) {
                    if (r303 == null) {
                        return false;
                    }
                    return 3Gk.A00(context2, r303);
                }

                public void CEF(Context context2) {
                }

                public boolean CEG(Context context2, 06Z r303) {
                    return false;
                }
            };
            bitSet.set(1);
            r09.A00 = r06;
            bitSet.set(3);
            qiz = abV.A2W();
        } else {
            QCc qCc = new QCc(r302, new QIZ());
            qiz = qCc.A01;
            qiz.A00 = migColorScheme;
            BitSet bitSet2 = qCc.A02;
            bitSet2.set(0);
            qiz.A01 = c5xv;
            bitSet2.set(1);
            qCc.A0w(4YU.A00(2RH.A07));
            qCc.A1g(!bool.booleanValue() ? ViewOutlineProvider.BOUNDS : null);
            C1rs.A00(bitSet2, qCc.A03);
            qCc.A0J();
        }
        A01.A2e(qiz);
        new C1qb(r302.A0D.getApplicationContext());
        2Yf b2a = new B2A();
        ((B2A) b2a).A06 = migColorScheme;
        ((B2A) b2a).A00 = fbUserSession;
        ((B2A) b2a).A05 = r0;
        ((B2A) b2a).A01 = r02;
        ((B2A) b2a).A07 = abU;
        ((B2A) b2a).A02 = r03;
        ((B2A) b2a).A04 = cDf;
        ((B2A) b2a).A03 = blb;
        C2ki A00 = C2kV.A00(r302);
        A00.A2j(false);
        A00.A2d(b2a);
        int AZc = migColorScheme.AZc();
        C2kV c2kV = A00.A01;
        c2kV.A05 = AZc;
        c2kV.A0Q = Integer.valueOf(migColorScheme.Abp());
        A00.A0Q();
        A00.A2e(c2kx);
        A00.A2Z(r04);
        AbG.A1M(A01, A00);
        return A01.A00;
    }
}
