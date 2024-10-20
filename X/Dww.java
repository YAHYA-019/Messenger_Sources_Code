package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: Dww.class */
public final class Dww extends C1rj {
    public FbUserSession A00;
    public ElL A01;
    public MigColorScheme A02;
    public ImmutableList A03;
    public String A04;
    public String A05;
    public boolean A06;

    public Dww() {
        super("FxImSettingsProfilesLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A05, this.A02, this.A00, Boolean.valueOf(this.A06), this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QIV A0Y;
        String str;
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A02;
        ImmutableList immutableList = this.A03;
        boolean z = this.A06;
        ElL elL = this.A01;
        String str2 = this.A04;
        String str3 = this.A05;
        1Bn.A0A(147565);
        Erq erq = (Erq) 1Bn.A0E(r302.A0D, (1BY) null, 99817);
        if (!z) {
            QCB qcb = new QCB(r302, new QIV());
            A0Y = qcb.A01;
            A0Y.A00 = migColorScheme;
            BitSet bitSet = qcb.A02;
            bitSet.set(0);
            qcb.A0R();
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AccountProfileModel accountProfileModel = (AccountProfileModel) it.next();
                String str4 = accountProfileModel.A0D;
                String str5 = accountProfileModel.A0B;
                55D A00 = erq.A00(fbUserSession, migColorScheme, str4, str5);
                String str6 = accountProfileModel.A0A;
                if (!1JF.A0B(str6)) {
                    AnonymousClass557 anonymousClass557 = new AnonymousClass557();
                    anonymousClass557.A08(str6);
                    str = "";
                    if (str5 == null) {
                        str5 = str;
                    }
                    String str7 = accountProfileModel.A06;
                    str = str7 != null ? str7 : "";
                    11T.A0F(migColorScheme, 0);
                    Fk7.A00(A00, anonymousClass557, migColorScheme, str5, str);
                    anonymousClass557.A05(migColorScheme);
                    anonymousClass557.A01 = new Fk2(accountProfileModel, elL, 2);
                    builder.m11011add((Object) anonymousClass557.A00());
                }
            }
            A0Y.A01 = builder.build();
            bitSet.set(1);
            C1rs.A00(bitSet, qcb.A03);
            qcb.A0J();
        } else if (1JF.A0B(str2) || 1JF.A0B(str3)) {
            A0Y = 7zL.A0Y();
        } else {
            QFN qfn = new QFN(r302, new QJ0());
            qfn.A2Z(str2);
            qfn.A2a(str3);
            qfn.A2Y(migColorScheme);
            qfn.A2X(new RFY(r302));
            qfn.A2b(true);
            A0Y = qfn.A2W();
        }
        return (1LI) A0Y;
    }
}
