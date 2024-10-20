package com.facebook.payments.p2p.messenger.plugins.bloksactions.sendpaymentarmadillo;

import X.11T;
import X.1BK;
import X.1BY;
import X.1Br;
import X.1De;
import X.1Lm;
import X.1Uj;
import X.1Um;
import X.4YU;
import X.7zM;
import X.AnonymousClass001;
import X.C2050DaD;
import X.C21S;
import X.C21h;
import X.DKE;
import X.DKc;
import X.E2v;
import X.EUl;
import X.EsE;
import X.FGb;
import X.FHh;
import X.FkM;
import X.Fwk;
import X.GJj;
import X.Ibl;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: SendPaymentArmadilloImplementation.class */
public final class SendPaymentArmadilloImplementation {
    public C21h A00;
    public final 1Br A01 = 7zM.A0P();
    public final 1De A02;

    public SendPaymentArmadilloImplementation(1De r302) {
        this.A02 = r302;
    }

    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        11T.A0I(fHh.A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        List list = dKc.A00;
        String A13 = DKE.A13(list, 1);
        Object obj = list.get(2);
        11T.A0A(obj);
        int A03 = AnonymousClass001.A03(obj);
        Object obj2 = list.get(3);
        11T.A0A(obj2);
        long A05 = AnonymousClass001.A05(obj2);
        String str = (String) 4YU.A0q(list, 4);
        11T.A0A(list.get(5));
        String str2 = (String) 4YU.A0q(list, 6);
        11T.A0A(list.get(7));
        String str3 = (String) 4YU.A0q(list, 8);
        String str4 = (String) 4YU.A0q(list, 9);
        GJj A00 = FGb.A00(dKc, 10);
        GJj A002 = FGb.A00(dKc, 11);
        GJj A003 = FGb.A00(dKc, 12);
        GJj A004 = FGb.A00(dKc, 13);
        FbUserSession A005 = EUl.A00(fHh);
        1BY r0 = this.A02.A00;
        1Uj r02 = (1Uj) 1Lm.A07(A005, r0, 16686);
        EsE esE = (EsE) 1Lm.A07(A005, r0, 100089);
        String A006 = esE.A00(A13, "recipient_name");
        String A007 = esE.A00(A13, "recipient_id");
        String valueOf = String.valueOf(A05);
        C21h c21h = this.A00;
        if (c21h != null) {
            C21S.A01(c21h, r02);
            this.A00 = null;
        }
        E2v e2v = new E2v(r02, this, fHh, A002, A003, A004, A00, valueOf, A006);
        this.A00 = e2v;
        C21S.A00(e2v, r02);
        if (str3.length() == 0) {
            str3 = null;
        }
        MailboxFeature mailboxFeature = new MailboxFeature(r02);
        Long A0n = 1BK.A0n(A007);
        Long A0n2 = 1BK.A0n(str2);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%.2f", Double.valueOf(A03 / 100.0d));
        11T.A0A(formatStrLocaleSafe);
        Long valueOf2 = Long.valueOf(A05);
        FkM fkM = new FkM(r02, this, 2);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, fkM);
        1Um.A02(AQV, new Ibl(mailboxFeature, A0n2, A0n, valueOf2, A0Q, str3, str, formatStrLocaleSafe, str4, 1), A0Q, false);
        return null;
    }
}
