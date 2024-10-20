package com.facebook.bloks.messenger.implementations.plugins.core.cds.opencdsbottomsheet;

import X.04R;
import X.0S2;
import X.11T;
import X.1pI;
import X.AnonymousClass001;
import X.C2050DaD;
import X.DKD;
import X.DKE;
import X.DKc;
import X.DLQ;
import X.EU5;
import X.FFt;
import X.FHf;
import X.FHh;
import X.FIV;
import X.FIX;
import X.FIv;
import X.FZt;
import X.Fwk;
import X.FxJ;
import X.FyG;
import X.GHK;
import X.GKg;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksOpenCdsBottomSheetImplementation.class */
public final class MSGBloksOpenCdsBottomSheetImplementation {
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        1pI A02;
        11T.A0F(fwk, 0);
        List list = dKc.A00;
        DLQ A0k = DKE.A0k(list, 0);
        DLQ A0k2 = DKE.A0k(list, 1);
        Object obj = list.get(2);
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) obj;
        11T.A0F(A0k, 0);
        1pI r310 = null;
        FHf A01 = FIv.A01(fHh, A0k);
        FZt A04 = FIX.A04((FyG) null, fHh, A0k2);
        if ((fwk instanceof C2050DaD) && (A02 = ((C2050DaD) fwk).A02()) != null) {
            r310 = A02;
        }
        String A06 = FIv.A06(A0k);
        HashMap A022 = FIV.A02(map);
        if (A022 == null) {
            A022 = AnonymousClass001.A0u();
        }
        DLQ A023 = FIv.A02(A0k);
        Integer A00 = A023 != null ? EU5.A00(DKD.A0t(A023, "none", 36)) : 0S2.A0N;
        FFt fFt = new FFt(A022, 04R.A0G(), A06);
        fFt.A00 = FIv.A00(A0k);
        fFt.A01 = A0k;
        fFt.A05(FIv.A08(fHh, A0k));
        fFt.A04(fwk.A00, new FxJ((GKg) null, r310, (MigColorScheme) null, A01, (DLQ) null, A0k, A04, (Integer) null, (Integer) null, (String) null, 0, false), (GHK) null, A00, 32, false);
        return null;
    }
}
