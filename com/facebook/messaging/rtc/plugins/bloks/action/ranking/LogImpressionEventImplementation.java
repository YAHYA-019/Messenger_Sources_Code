package com.facebook.messaging.rtc.plugins.bloks.action.ranking;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1Lm;
import X.AbH;
import X.AnonymousClass001;
import X.DKD;
import X.DKE;
import X.DKc;
import X.EUl;
import X.FHh;
import X.Hjn;
import X.HsZ;
import X.K92;
import X.K93;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: LogImpressionEventImplementation.class */
public final class LogImpressionEventImplementation {
    public final Context A00;

    public LogImpressionEventImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final Object A00(FHh fHh, DKc dKc) {
        List list = dKc.A00;
        Object obj = list.get(0);
        11T.A0A(obj);
        List<Map> list2 = (List) obj;
        String A13 = DKE.A13(list, 1);
        HsZ hsZ = (HsZ) 1Lm.A05(this.A00, EUl.A00(fHh), 115395);
        hsZ.A01 = A13;
        for (Map map : list2) {
            String A1C = AbH.A1C("mi", map);
            Object obj2 = map.get(K93.__redex_internal_original_name);
            11T.A0I(obj2, 1BJ.A00(0));
            boolean A1V = AnonymousClass001.A1V(obj2);
            String A1C2 = AbH.A1C("bi", map);
            int A05 = DKD.A05(map.get(K92.__redex_internal_original_name), "null cannot be cast to non-null type kotlin.Int");
            Hjn hjn = new Hjn(1BK.A0l(DKD.A05(map.get("sp"), "null cannot be cast to non-null type kotlin.Int")), A1C, A1C2, AbH.A1C("r", map), AbH.A1C("ti", map), AbH.A1C("si", map), A05, A1V);
            Object obj3 = map.get("i");
            11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Long");
            hjn.A01 = AnonymousClass001.A05(obj3);
            Object obj4 = map.get("d");
            11T.A0I(obj4, "null cannot be cast to non-null type kotlin.Long");
            hjn.A00 = AnonymousClass001.A05(obj4);
            hsZ.A01(hjn, false);
        }
        return null;
    }
}
