package com.facebook.bugreporter;

import X.06Z;
import X.0FI;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1iF;
import X.1yM;
import X.2Ov;
import X.7zL;
import X.C06c;
import X.C0dr;
import X.C3Om;
import X.C5ic;
import X.DKG;
import X.DR6;
import X.EhP;
import X.FXL;
import X.JZj;
import X.SAI;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.facebook.bugreporter.activity.bugreport.BugReportFragment;
import java.lang.ref.SoftReference;

/* loaded from: BugReporterM4aThankYouFragment.class */
public class BugReporterM4aThankYouFragment extends 2Ov {
    public EhP A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0m(06Z r302, String str) {
        try {
            C06c A0G = 7zL.A0G(r302);
            A0G.A0O(this, str);
            A0G.A04();
        } catch (IllegalStateException e) {
            1BL.A0I().softReport("BugReporterM4aThankYouFragment", "Encountered IllegalStateException when showing ThankYouFragment for Messenger", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        String A01 = C3Om.A01(requireContext, (1yM) 1Bi.A03(16885));
        DR6 A02 = ((C5ic) 1Bn.A0A(67527)).A02(requireContext);
        A02.A00(2131953579);
        A02.A0J(1BK.A0v(requireContext, A01, 2131953580));
        JZj A04 = A02.A04();
        View view = this.mView;
        if (view != null) {
            onViewCreated(view, null);
        }
        return A04;
    }

    public 1iF A17() {
        return DKG.A0F();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        EhP ehP = this.A00;
        if (ehP != null) {
            BugReportFragment bugReportFragment = (BugReportFragment) ((FXL) ehP.A01.A01).A01;
            bugReportFragment.A0A = false;
            BugReportFragment.A07(ehP.A00, bugReportFragment);
        }
    }

    public void onStart() {
        int A02 = 0FI.A02(53030616);
        super/*X.0D2*/.onStart();
        SoftReference softReference = new SoftReference(this);
        ((Handler) 1Bn.A0A(100187)).postAtTime(new SAI(this, softReference), this, ((C0dr) 1Bi.A03(84488)).now() + 4000);
        0FI.A08(-434283181, A02);
    }
}
