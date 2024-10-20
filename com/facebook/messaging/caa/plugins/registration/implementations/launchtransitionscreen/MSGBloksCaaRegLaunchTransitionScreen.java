package com.facebook.messaging.caa.plugins.registration.implementations.launchtransitionscreen;

import X.04R;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1H2;
import X.1Ql;
import X.1pI;
import X.2W0;
import X.4YW;
import X.7zS;
import X.C2050DaD;
import X.C4O5;
import X.DKC;
import X.DKD;
import X.DKY;
import X.DKc;
import X.DLQ;
import X.ENB;
import X.EOk;
import X.EOn;
import X.EOt;
import X.EP2;
import X.EU9;
import X.F3D;
import X.FFt;
import X.FHf;
import X.FHh;
import X.FZt;
import X.Fwk;
import X.FxJ;
import X.FyG;
import X.GJj;
import X.GKg;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* loaded from: MSGBloksCaaRegLaunchTransitionScreen.class */
public final class MSGBloksCaaRegLaunchTransitionScreen {
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        Context context;
        11T.A0F(fwk, 0);
        FyG fyG = fHh.A03;
        if (fyG == null || (context = fyG.A00) == null) {
            return null;
        }
        1H2 r0 = (1H2) 1Bi.A03(33032);
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        LinkedHashMap A0A = 4YW.A0A("flow_name", DKC.A11(dKc, DKC.A17(A10), 1), 1BK.A1G("flow_type", A10));
        11T.A0I(A0A, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
        LinkedHashMap A14 = 7zS.A14("offline_experiment_group", "caa_iteration_v3_perf_msg_6", 1BK.A1G("flow_info", DKD.A0y(A0A)), 1BK.A1G("device_id", r0.A02()));
        EU9.A00(context);
        EOt eOt = FZt.A0M;
        EOk eOk = FZt.A0P;
        EnumEntries enumEntries = EOn.A01;
        FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, DKY.A01(eOt, eOk, EP2.A05), 2130771992, 2130771997, (String) null, 0, false);
        if (fwk instanceof C2050DaD) {
            FragmentActivity activity = ((C2050DaD) fwk).A01.getActivity();
            if (activity != null) {
                activity.finish();
            }
            1Ql.A01(1BL.A0W().edit(), 2W0.A0D, false);
            F3D.A00.A03(activity, context, fHh, (GJj) null, (ENB) null);
        }
        FFt.A00("com.bloks.www.bloks.caa.reg.transition", C4O5.A02(A14), 04R.A0G()).A03(context, fxJ);
        return null;
    }
}
