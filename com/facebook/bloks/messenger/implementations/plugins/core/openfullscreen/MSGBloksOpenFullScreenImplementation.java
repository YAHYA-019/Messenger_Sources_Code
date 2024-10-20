package com.facebook.bloks.messenger.implementations.plugins.core.openfullscreen;

import X.0S2;
import X.1BK;
import X.1pI;
import X.AnonymousClass001;
import X.C2050DaD;
import X.DKC;
import X.DKD;
import X.DKc;
import X.DLQ;
import X.DZU;
import X.EUf;
import X.Ebb;
import X.F0E;
import X.F2Z;
import X.FAu;
import X.FFt;
import X.FHf;
import X.FHh;
import X.FIV;
import X.FIv;
import X.FZo;
import X.FZt;
import X.Fwk;
import X.FxJ;
import X.GKg;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.proxygen.TraceEventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksOpenFullScreenImplementation.class */
public final class MSGBloksOpenFullScreenImplementation {
    public static Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        List list = dKc.A00;
        Object obj = list.get(0);
        obj.getClass();
        DLQ dlq = (DLQ) obj;
        DLQ dlq2 = (DLQ) list.get(2);
        Map A09 = FIv.A09(fHh, dlq2, 38);
        if (fwk instanceof C2050DaD) {
            C2050DaD c2050DaD = (C2050DaD) fwk;
            Context context = fwk.A00;
            String A06 = FIv.A06(dlq);
            String str = null;
            FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, FIv.A01(fHh, dlq), (DLQ) null, dlq, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
            HashMap A02 = FIV.A02((HashMap) DKC.A13(list));
            if (A02 == null) {
                A02 = AnonymousClass001.A0u();
            }
            Bundle A05 = 1BK.A05();
            F0E.A01(A05, fxJ);
            ArrayList A0s = AnonymousClass001.A0s();
            int A00 = FIv.A00(dlq);
            Map A08 = FIv.A08(fHh, dlq);
            if (AnonymousClass001.A1Q(dlq.A05, 13784)) {
                str = dlq.getString(55);
            }
            long j = -1;
            FZo fZo = new FZo((SparseArray) null, (Ebb) null, (Ebb) null, dlq, (String) null, A06, str, (String) null, A02, A0s, A08, A09, A09, -1, A00, j, j, false, false);
            FAu.A00(context, A06, fZo.A0A, A02);
            FZo.A03(A05, fZo);
            Integer num = 0S2.A0Y;
            if (dlq2 != null) {
                if (F2Z.A00(dlq2, 36, false)) {
                    num = 0S2.A0u;
                } else if ("modal".equals(DKD.A0t(dlq2, TraceEventType.Push, 35))) {
                    num = 0S2.A0j;
                }
            }
            DZU A002 = EUf.A00(A05, 100, false);
            String A07 = FIv.A07(dlq);
            1pI A022 = c2050DaD.A02();
            if (A022 != null) {
                if (A07 == null) {
                    A07 = "MSGBloksScreenFragment";
                }
                A022.Czz(A002, num, A07);
                return null;
            }
        }
        String A062 = FIv.A06(dlq);
        FxJ fxJ2 = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, dlq, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
        HashMap A023 = FIV.A02((HashMap) DKC.A13(list));
        if (A023 == null) {
            A023 = AnonymousClass001.A0u();
        }
        FFt A003 = FFt.A00(A062, A023, A09);
        A003.A01 = dlq;
        A003.A02 = dlq2;
        A003.A05(FIv.A08(fHh, dlq));
        A003.A03 = AnonymousClass001.A1Q(dlq.A05, 13784) ? dlq.getString(55) : null;
        A003.A02(fwk.A00, fxJ2);
        return null;
    }
}
