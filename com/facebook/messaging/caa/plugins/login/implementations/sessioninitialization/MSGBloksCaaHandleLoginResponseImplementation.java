package com.facebook.messaging.caa.plugins.login.implementations.sessioninitialization;

import X.06Z;
import X.0DE;
import X.0NA;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1Ew;
import X.1G2;
import X.1HG;
import X.1Kd;
import X.1Od;
import X.1Ql;
import X.2W0;
import X.2aK;
import X.2fT;
import X.4YV;
import X.7zM;
import X.7zN;
import X.7zO;
import X.9TN;
import X.AJL;
import X.AnonymousClass001;
import X.BUp;
import X.Bm8;
import X.C00i;
import X.C2050DaD;
import X.DKC;
import X.ENB;
import X.ENC;
import X.EPg;
import X.EWP;
import X.Eke;
import X.EwA;
import X.Exb;
import X.F3D;
import X.FGr;
import X.FHh;
import X.FIM;
import X.FIO;
import X.Fvm;
import X.FwA;
import X.Fwk;
import X.G2I;
import X.GJj;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.account.login.helper.credentialmanager.CredentialManagerSaveHelper;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import java.util.Set;

/* loaded from: MSGBloksCaaHandleLoginResponseImplementation.class */
public final class MSGBloksCaaHandleLoginResponseImplementation {
    public 1Ew A00;
    public ENB A01;
    public ENC A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final Set A0H;
    public final Context A0I;
    public final 1Br A0G = 1Bq.A00(16490);
    public final 1Br A0B = 7zM.A0R();
    public final 1Br A0C = 1Bq.A00(68335);
    public final 1Br A08 = 1BK.A0E();
    public final 1Br A07 = 1Bq.A00(100141);

    public MSGBloksCaaHandleLoginResponseImplementation(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        this.A0I = context;
        this.A0A = 1Bq.A00(100107);
        this.A06 = 1HG.A00(context, 65730);
        this.A05 = 1Bu.A03(r0, 100223);
        this.A0E = DKC.A0X();
        this.A09 = 1Bu.A03(r0, 82982);
        this.A04 = 1Bu.A03(r0, 85283);
        this.A0D = 1Bu.A03(r0, 100101);
        Set set = (Set) 1Bn.A0E((Context) null, r0, 255);
        11T.A0A(set);
        this.A0H = set;
        this.A0F = 1Bq.A00(16442);
    }

    public static final void A00(Context context, Fwk fwk, MSGBloksCaaHandleLoginResponseImplementation mSGBloksCaaHandleLoginResponseImplementation, FHh fHh, GJj gJj) {
        FGr fGr;
        String str = "loginSource";
        FragmentActivity fragmentActivity = null;
        if (fwk instanceof C2050DaD) {
            FragmentActivity activity = ((C2050DaD) fwk).A01.getActivity();
            if (!1Br.A07(mSGBloksCaaHandleLoginResponseImplementation.A0E).AZk(18304205722759975L)) {
                ENC enc = mSGBloksCaaHandleLoginResponseImplementation.A02;
                if (enc == null) {
                    str = "loginType";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                if (enc == ENC.A08 && activity != null && ((FIM) 1Br.A0B(((Eke) 1Bi.A03(100104)).A01)).A07(EPg.A0d, true) != 1) {
                    CredentialManagerSaveHelper credentialManagerSaveHelper = (CredentialManagerSaveHelper) 7zN.A0l(context, 1, 100105);
                    9TN r0 = new 9TN(context, activity, mSGBloksCaaHandleLoginResponseImplementation, fHh, gJj);
                    C00i c00i = credentialManagerSaveHelper.A03.A00;
                    ((EwA) c00i.get()).A00();
                    ((EwA) c00i.get()).A01("init_save");
                    FIO fio = (FIO) 1Br.A0B(credentialManagerSaveHelper.A02);
                    FIO.A02(fio, 0S2.A0B, 0S2.A01, 0S2.A1G, 0S2.A15, (Long) null, (String) null, FIO.A00(fio));
                    ComponentCallbacks2 A04 = 0NA.A04(credentialManagerSaveHelper.A01);
                    if (!(A04 instanceof LifecycleOwner)) {
                        ((EwA) c00i.get()).A01("credential_manager_save_activity_null");
                        return;
                    } else {
                        2aK.A03((Integer) null, (0DE) null, new AJL(credentialManagerSaveHelper, r0, null, null, null, 0), 7zO.A16((LifecycleOwner) A04), 3);
                        return;
                    }
                }
            }
            fGr = F3D.A00;
            if (activity instanceof Activity) {
                fragmentActivity = activity;
            }
        } else {
            fGr = F3D.A00;
        }
        ENB enb = mSGBloksCaaHandleLoginResponseImplementation.A01;
        if (enb != null) {
            fGr.A03(fragmentActivity, context, fHh, gJj, enb);
            return;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A01(Context context, Fwk fwk, MSGBloksCaaHandleLoginResponseImplementation mSGBloksCaaHandleLoginResponseImplementation, FHh fHh, GJj gJj, boolean z, boolean z2) {
        1Br r0 = mSGBloksCaaHandleLoginResponseImplementation.A0A;
        ((Exb) 1Br.A0B(r0)).A00("broadcast_login_update_info_done");
        2fT A0B = 1Kd.A0B(new Fvm(1Bq.A00(100100), mSGBloksCaaHandleLoginResponseImplementation, 0), 4YV.A11(mSGBloksCaaHandleLoginResponseImplementation.A0B));
        1Br.A0D(mSGBloksCaaHandleLoginResponseImplementation.A0G, new FwA(context, fwk, mSGBloksCaaHandleLoginResponseImplementation, fHh, gJj, z), A0B);
        ((Exb) 1Br.A0B(r0)).A00("run_after_login_components_done");
        if (z) {
            A00(context, fwk, mSGBloksCaaHandleLoginResponseImplementation, fHh, gJj);
        }
        if (z2) {
            EWP ewp = (EWP) 1Br.A0B(mSGBloksCaaHandleLoginResponseImplementation.A09);
            AnonymousClass001.A07().postDelayed(new G2I(1Bq.A00(16616), ewp), 5000L);
        }
    }

    public static final void A02(MSGBloksCaaHandleLoginResponseImplementation mSGBloksCaaHandleLoginResponseImplementation) {
        Activity A09 = ((1Od) 1Bi.A03(16616)).A09();
        06Z BDe = A09 != null ? ((FragmentActivity) A09).BDe() : null;
        User user = (User) 1De.A00(mSGBloksCaaHandleLoginResponseImplementation.A03, 83430);
        C00i c00i = mSGBloksCaaHandleLoginResponseImplementation.A08.A00;
        FbSharedPreferences A0S = 1BK.A0S(c00i);
        1G2 r0 = 2W0.A0M;
        if (!A0S.AZn(r0, false) || user == null) {
            return;
        }
        Name name = user.A0X;
        if (name.displayName == null || BDe == null || BDe.A0B) {
            return;
        }
        1Ql.A03(r0, c00i.get(), false);
        BUp.A00((Bm8) null, name.displayName, user.A13, (String) null, false, false).A0m(BDe, "SSO_auto_login_bottom_sheet");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A03(X.Fwk r302, X.FHh r303, X.DKc r304) {
        /*
            Method dump skipped, instructions count: 1843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.caa.plugins.login.implementations.sessioninitialization.MSGBloksCaaHandleLoginResponseImplementation.A03(X.Fwk, X.FHh, X.DKc):java.lang.Object");
    }
}
