package com.facebook.payments.p2p.messenger.plugins.bloksactions.acceptrequestarmadillo;

import X.11T;
import X.1BK;
import X.1Br;
import X.1De;
import X.1Uj;
import X.1Um;
import X.4YU;
import X.7zM;
import X.AnonymousClass001;
import X.C2050DaD;
import X.C21S;
import X.C21h;
import X.DKc;
import X.EUl;
import X.FGb;
import X.FHh;
import X.FkM;
import X.Fwk;
import X.GJj;
import X.Ibd;
import X.QQ6;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: AcceptRequestArmadilloImplementation.class */
public final class AcceptRequestArmadilloImplementation {
    public C21h A00;
    public final 1Br A01 = 7zM.A0P();
    public final 1De A02;

    public AcceptRequestArmadilloImplementation(1De r302) {
        this.A02 = r302;
    }

    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        List list = dKc.A00;
        String str = (String) 4YU.A0q(list, 3);
        Object obj = list.get(5);
        11T.A0A(obj);
        long A05 = AnonymousClass001.A05(obj);
        String str2 = (String) 4YU.A0q(list, 8);
        String str3 = (String) 4YU.A0q(list, 10);
        String str4 = (String) 4YU.A0q(list, 11);
        GJj A00 = FGb.A00(dKc, 12);
        GJj A002 = FGb.A00(dKc, 13);
        GJj A003 = FGb.A00(dKc, 14);
        GJj A004 = FGb.A00(dKc, 15);
        1Uj r0 = (1Uj) 4YU.A0n(EUl.A00(fHh), this.A02, 16686);
        String valueOf = String.valueOf(A05);
        C21h c21h = this.A00;
        if (c21h != null) {
            C21S.A01(c21h, r0);
            this.A00 = null;
        }
        QQ6 qq6 = new QQ6(r0, this, fHh, A003, A004, A002, A00, valueOf);
        this.A00 = qq6;
        C21S.A00(qq6, r0);
        MailboxFeature mailboxFeature = new MailboxFeature(r0);
        Long A0n = 1BK.A0n(str);
        Long A0n2 = 1BK.A0n(str2);
        FkM fkM = new FkM(r0, this, 1);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, fkM);
        1Um.A02(AQV, new Ibd(A0Q, mailboxFeature, A0n, A0n2, valueOf, str3, str4, 0), A0Q, false);
        return null;
    }
}
