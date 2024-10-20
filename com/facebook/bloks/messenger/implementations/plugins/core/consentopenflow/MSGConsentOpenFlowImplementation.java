package com.facebook.bloks.messenger.implementations.plugins.core.consentopenflow;

import X.11T;
import X.1BK;
import X.DKC;
import X.DKD;
import X.DKc;
import X.FGb;
import X.FHh;
import X.FHj;
import X.FyG;
import X.GJj;
import X.QS2;
import android.content.Context;
import java.util.List;

/* loaded from: MSGConsentOpenFlowImplementation.class */
public final class MSGConsentOpenFlowImplementation {
    public static final Object A00(FHh fHh, DKc dKc) {
        Context context;
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        String A17 = DKC.A17(A10);
        String str = (String) A10;
        Object A00 = dKc.A00();
        11T.A0I(A00, A17);
        String str2 = (String) A00;
        List list = dKc.A00;
        String A0x = DKD.A0x(list, 2);
        String A0x2 = DKD.A0x(list, 3);
        String A0x3 = DKD.A0x(list, 4);
        String str3 = (String) DKC.A11(dKc, A17, 5);
        GJj A002 = FGb.A00(dKc, 6);
        GJj A003 = FGb.A00(dKc, 7);
        GJj A004 = FGb.A00(dKc, 8);
        GJj A005 = FGb.A00(dKc, 9);
        FyG fyG = fHh.A03;
        if (fyG == null || (context = fyG.A00) == null) {
            throw 1BK.A0h();
        }
        FHj.A01(context, new QS2(fHh, A002, A003, A004, A005), FHj.A00, str2, str, A0x, A0x2, A0x3, str3);
        return null;
    }
}
