package com.facebook.payments.p2p.messenger.plugins.addcard.implementation.addcard;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1FV;
import X.DKC;
import X.DKD;
import X.DKc;
import X.EUl;
import X.EXJ;
import X.Eqo;
import X.FGb;
import X.FHh;
import X.Fch;
import X.FwH;
import X.Fwk;
import X.FyG;
import X.GJj;
import android.content.Context;

/* loaded from: P2pPaymentsAddCardImplementation.class */
public final class P2pPaymentsAddCardImplementation {
    public final 1Br A00 = 1Bq.A00(16470);
    public final 1Br A01 = 1Bq.A00(98927);

    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        Context context = fwk.A00;
        FyG fyG = fHh.A03;
        11T.A0I(fyG, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A00 = dKc.A00();
        String A17 = DKC.A17(A00);
        String str = (String) A00;
        String A0u = DKD.A0u(dKc, A17, 2);
        String A0u2 = DKD.A0u(dKc, A17, 3);
        String A0u3 = DKD.A0u(dKc, A17, 4);
        String A0u4 = DKD.A0u(dKc, A17, 5);
        String A0u5 = DKD.A0u(dKc, A17, 6);
        String A0u6 = DKD.A0u(dKc, A17, 7);
        String A0u7 = DKD.A0u(dKc, A17, 8);
        GJj A002 = FGb.A00(dKc, 9);
        GJj A003 = FGb.A00(dKc, 10);
        String str2 = EUl.A00(fHh).A02;
        1FV A004 = EXJ.A00(context, (Fch) 1Br.A0B(this.A01), new Eqo(null, null, null, null, null, A0u4, str, null, null, A0u, Integer.parseInt(A0u2), Integer.parseInt(A0u3), false), A0u5, str2, A0u6, A0u7);
        1Br.A0D(this.A00, new FwH(7, A003, fHh, fyG, A002), A004);
        return null;
    }
}
