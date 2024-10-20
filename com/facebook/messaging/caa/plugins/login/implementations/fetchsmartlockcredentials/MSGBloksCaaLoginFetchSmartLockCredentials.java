package com.facebook.messaging.caa.plugins.login.implementations.fetchsmartlockcredentials;

import X.11T;
import X.1Bi;
import X.1Br;
import X.7zN;
import X.C2050DaD;
import X.DHx;
import X.DKC;
import X.DKM;
import X.DKc;
import X.EPg;
import X.Eke;
import X.FEK;
import X.FGb;
import X.FHh;
import X.FIM;
import X.Fa5;
import X.Fj1;
import X.Fwk;
import androidx.fragment.app.FragmentActivity;
import com.facebook.account.login.helper.credentialmanager.CredentialManagerFetchHelper;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: MSGBloksCaaLoginFetchSmartLockCredentials.class */
public final class MSGBloksCaaLoginFetchSmartLockCredentials {
    public final 1Br A00 = DKC.A0X();
    public final DHx A01 = new Fj1(this);

    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        List list = dKc.A00;
        if (list.size() == 0) {
            return null;
        }
        if (1Br.A07(this.A00).AZk(18304201427792678L)) {
            DKM A03 = DKM.A03(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
            A03.A0J((Object) null, 1);
            A03.A0J((Object) null, 2);
            A03.A0J((Object) null, 3);
            A03.A0J((Object) null, 4);
            FEK.A00(fHh, DKM.A07(A03, (Object) null, 5), FGb.A00(dKc, 0));
        }
        Eke eke = (Eke) 1Bi.A03(100104);
        if (((FIM) 1Br.A0B(eke.A01)).A07(EPg.A0d, true) != 1) {
            long A01 = 1Br.A01(eke.A00);
            AtomicLong atomicLong = eke.A02;
            if (A01 - atomicLong.get() >= 1000) {
                atomicLong.set(A01);
                Object obj = list.get(0);
                if (obj == null || !(fwk instanceof C2050DaD)) {
                    return null;
                }
                FragmentActivity activity = ((C2050DaD) fwk).A01.getActivity();
                11T.A0I(activity, "null cannot be cast to non-null type com.facebook.bloks.messenger.activity.MSGBloksActivity");
                if (activity == null) {
                    return null;
                }
                ((CredentialManagerFetchHelper) 7zN.A0l(fwk.A00, 1, 100106)).initCredentialManagerFetch(new Fa5(fwk, fHh, ((FGb) obj).A00));
                return null;
            }
        }
        DKM A032 = DKM.A03(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
        A032.A0J((Object) null, 1);
        A032.A0J((Object) null, 2);
        A032.A0J((Object) null, 3);
        A032.A0J((Object) null, 4);
        FEK.A00(fHh, DKM.A07(A032, (Object) null, 5), FGb.A00(dKc, 0));
        return null;
    }
}
