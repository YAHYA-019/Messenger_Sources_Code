package com.facebook.bloks.messenger.implementations.plugins.core.openscreen;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1pI;
import X.AnonymousClass001;
import X.C2050DaD;
import X.DKT;
import X.DKc;
import X.DLQ;
import X.DZU;
import X.DqD;
import X.EUf;
import X.Ebb;
import X.F0E;
import X.FAu;
import X.FHf;
import X.FIV;
import X.FZo;
import X.FZt;
import X.Fwk;
import X.FxJ;
import X.GKg;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksOpenScreenImplementation.class */
public final class MSGBloksOpenScreenImplementation {
    public static Object A00(Fwk fwk, DKc dKc) {
        List list = dKc.A00;
        Object obj = list.get(0);
        obj.getClass();
        String str = (String) obj;
        HashMap A02 = FIV.A02((HashMap) list.get(1));
        if (A02 == null) {
            A02 = AnonymousClass001.A0u();
        }
        if (fwk instanceof C2050DaD) {
            C2050DaD c2050DaD = (C2050DaD) fwk;
            Context context = ((Fwk) c2050DaD).A00;
            FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
            Bundle A05 = 1BK.A05();
            F0E.A01(A05, fxJ);
            long j = -1;
            FZo fZo = new FZo((SparseArray) null, (Ebb) null, (Ebb) null, (Object) null, (String) null, str, (String) null, (String) null, A02, AnonymousClass001.A0s(), (Map) null, (Map) null, (Map) null, -1, 0, j, j, false, false);
            FAu.A00(context, str, (String) null, A02);
            FZo.A03(A05, fZo);
            DZU A00 = EUf.A00(A05, 100, false);
            1pI A022 = c2050DaD.A02();
            if (A022 != null) {
                A022.Czz(A00, 0S2.A0Y, str);
                return null;
            }
        }
        11T.A0F(str, 1);
        ((DKT) 1Bn.A0A(98520)).A0A(fwk.A00, new DqD(null, null, str, null, A02, 1BK.A1C(), 719983200, false));
        return null;
    }
}
