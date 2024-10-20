package com.facebook.messaging.contactacquisition;

import X.0FI;
import X.0Pz;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Iw;
import X.1LI;
import X.4YU;
import X.4YV;
import X.AbE;
import X.AbF;
import X.AbJ;
import X.AbK;
import X.AbN;
import X.C00i;
import X.C0S;
import X.C1rs;
import X.CfG;
import X.DKC;
import X.DKF;
import X.DKG;
import X.DeL;
import X.DeR;
import X.Ezs;
import X.G73;
import X.QC3;
import X.QJT;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.growth.model.Contactpoint;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.BitSet;
import java.util.HashMap;
import java.util.concurrent.Future;

/* loaded from: GmailAcquisitionBottomSheetDialogFragment.class */
public class GmailAcquisitionBottomSheetDialogFragment extends MigBottomSheetDialogFragment implements CallerContextable {
    public CfG A02;
    public Context A03;
    public int A00 = 3;
    public int A01 = 3;
    public final CallerContext A08 = CallerContext.A06(GmailAcquisitionBottomSheetDialogFragment.class);
    public final C00i A05 = 1BQ.A02(49965);
    public final C00i A04 = 1BV.A00(82273);
    public final C00i A09 = AbF.A0S(this, 33031);
    public final C00i A06 = 1BQ.A02(99455);
    public final C00i A0A = DKG.A0T();
    public final C00i A07 = DKC.A0W(this, 99435);

    public static void A05(Account account, GmailAcquisitionBottomSheetDialogFragment gmailAcquisitionBottomSheetDialogFragment, String str) {
        ListenableFuture A00;
        Future future;
        if (account.type != null) {
            C00i c00i = gmailAcquisitionBottomSheetDialogFragment.A06;
            Integer A01 = ((Ezs) c00i.get()).A01(account.type);
            if (A01 == null) {
                A0C(gmailAcquisitionBottomSheetDialogFragment, 2131958893);
                return;
            }
            Ezs ezs = (Ezs) c00i.get();
            String A0N = 0Pz.A0N("GOOGLE", '_', account.hashCode());
            HashMap hashMap = ezs.A06;
            if (!hashMap.containsKey(A0N) || hashMap.get(A0N) == null || ((future = (Future) hashMap.get(A0N)) != null && future.isDone())) {
                A00 = G73.A00(AbJ.A0u(ezs.A02), account, ezs, A01, 9);
                11T.A0D(A00);
            } else {
                Object obj = hashMap.get(A0N);
                if (obj == null) {
                    throw 1BK.A0h();
                }
                A00 = (ListenableFuture) obj;
            }
            DKF.A0h(gmailAcquisitionBottomSheetDialogFragment.A0A).A04(new DeR(account, gmailAcquisitionBottomSheetDialogFragment, A01, str), A00, "GET_OPEN_ID_TOKEN_CONF_FUTURE");
        }
    }

    public static void A08(Contactpoint contactpoint, GmailAcquisitionBottomSheetDialogFragment gmailAcquisitionBottomSheetDialogFragment, Integer num, String str) {
        GmailConfirmationMethod$Params gmailConfirmationMethod$Params = new GmailConfirmationMethod$Params(contactpoint, 0S2.A0N, str);
        Bundle A05 = 1BK.A05();
        A05.putParcelable(AbE.A00(600), gmailConfirmationMethod$Params);
        DKF.A0h(gmailAcquisitionBottomSheetDialogFragment.A0A).A04(new DeL(contactpoint, gmailAcquisitionBottomSheetDialogFragment, num, str, 0), AbK.A0H(A05, gmailAcquisitionBottomSheetDialogFragment.A08, 4YU.A0L(gmailAcquisitionBottomSheetDialogFragment.A09), 1BJ.A00(480)), "CONFIRM_OAUTH_FUTURE");
    }

    public static void A0C(GmailAcquisitionBottomSheetDialogFragment gmailAcquisitionBottomSheetDialogFragment, int i) {
        AbN.A1Q(AbF.A0v(gmailAcquisitionBottomSheetDialogFragment.A07), i);
        ((C0S) gmailAcquisitionBottomSheetDialogFragment.A04.get()).A00("FAILURE_TO_CONFIRM", 4YV.A0j());
        CfG cfG = gmailAcquisitionBottomSheetDialogFragment.A02;
        if (cfG != null) {
            cfG.D2v();
        }
        gmailAcquisitionBottomSheetDialogFragment.A0o();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        QC3 qc3 = new QC3(r302, new QJT());
        MigColorScheme A1F = A1F();
        1LI r0 = qc3.A01;
        ((QJT) r0).A01 = A1F;
        BitSet bitSet = qc3.A02;
        bitSet.set(0);
        ((QJT) r0).A00 = this;
        bitSet.set(1);
        C1rs.A00(bitSet, qc3.A03);
        qc3.A0J();
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1469286032);
        super.onCreate(bundle);
        Context context = getContext();
        this.A03 = context;
        if (context != null) {
            this.A02 = new CfG(context, 2131958888);
        }
        0FI.A08(-2062656949, A02);
    }
}
