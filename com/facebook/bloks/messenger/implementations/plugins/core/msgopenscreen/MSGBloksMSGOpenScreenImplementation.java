package com.facebook.bloks.messenger.implementations.plugins.core.msgopenscreen;

import X.0S2;
import X.1BK;
import X.1Bn;
import X.1pI;
import X.AnonymousClass001;
import X.C2050DaD;
import X.DKC;
import X.DKD;
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
import X.FHh;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksMSGOpenScreenImplementation.class */
public final class MSGBloksMSGOpenScreenImplementation {
    public static Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        List list = dKc.A00;
        DLQ dlq = (DLQ) list.get(0);
        dlq.getClass();
        HashMap A02 = FIV.A02((HashMap) DKC.A13(list));
        DLQ A06 = dlq.A06(41);
        int i = 719983200;
        if (A06 != null) {
            i = A06.getInt(45, 719983200);
        }
        if (fwk instanceof C2050DaD) {
            C2050DaD c2050DaD = (C2050DaD) fwk;
            Context context = ((Fwk) c2050DaD).A00;
            HashMap A0u = A02 == null ? AnonymousClass001.A0u() : DKC.A1C(A02);
            String A0t = DKD.A0t(dlq, "", 35);
            FHf fHf = null;
            DLQ A062 = dlq.A06(36);
            if (A062 != null) {
                fHf = FHf.A00(fHh, A062);
            }
            FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, fHf, dlq, (DLQ) null, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
            Bundle A05 = 1BK.A05();
            F0E.A01(A05, fxJ);
            long j = -1;
            FZo fZo = new FZo((SparseArray) null, (Ebb) null, (Ebb) null, (Object) null, (String) null, A0t, (String) null, (String) null, A0u, AnonymousClass001.A0s(), (Map) null, (Map) null, (Map) null, -1, i, j, j, false, false);
            FAu.A00(context, A0t, (String) null, A0u);
            FZo.A03(A05, fZo);
            DZU A00 = EUf.A00(A05, 100, false);
            String string = dlq.A06(41) != null ? dlq.A06(41).getString(36) : null;
            1pI A022 = c2050DaD.A02();
            if (A022 != null) {
                if (string == null) {
                    string = "MSGBloksScreenFragment";
                }
                A022.Czz(A00, 0S2.A0Y, string);
                return null;
            }
        }
        String A0t2 = DKD.A0t(dlq, "", 35);
        LinkedHashMap A1C = 1BK.A1C();
        if (A02 == null) {
            A02 = AnonymousClass001.A0u();
        }
        ((DKT) 1Bn.A0A(98520)).A0A(fwk.A00, new DqD(null, dlq, A0t2, null, A02, A1C, i, false));
        return null;
    }
}
