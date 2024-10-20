package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zP;
import X.7zR;
import X.7zS;
import X.9Bn;
import X.9Bt;
import X.9IW;
import X.9Nr;
import X.AQn;
import X.AQv;
import X.C00i;
import X.C01i;
import X.C0dv;
import X.C8bv;
import X.C96c;
import X.C96q;
import X.C9qq;
import X.GF6;
import X.RTT;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: EbSetupRecoveryCodeFragment.class */
public class EbSetupRecoveryCodeFragment extends BaseFragment implements GF6 {
    public 9Nr A00;
    public RTT A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final C01i A05 = AQn.A00(this, 6);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0B(EbSetupRecoveryCodeFragment ebSetupRecoveryCodeFragment) {
        Context requireContext = ebSetupRecoveryCodeFragment.requireContext();
        RTT rtt = ebSetupRecoveryCodeFragment.A01;
        if (rtt == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C0dv.A02(requireContext, rtt.A00);
        if (Build.VERSION.SDK_INT < 33) {
            7zR.A0z(ebSetupRecoveryCodeFragment.requireContext(), ebSetupRecoveryCodeFragment.getText(2131964239));
        }
    }

    public static final void A0C(EbSetupRecoveryCodeFragment ebSetupRecoveryCodeFragment) {
        if (!ebSetupRecoveryCodeFragment.A04) {
            ebSetupRecoveryCodeFragment.A1d().A08("SETUP_ADVANCED_SETUP_40DIGIT_CODE_SETUP_CANCEL_CLICK");
            return;
        }
        9Nr r0 = ebSetupRecoveryCodeFragment.A00;
        if (r0 == null) {
            11T.A0L("generateRecoveryCodeFlowLogger");
            throw 0Q8.createAndThrow();
        }
        C00i c00i = r0.A01.A00;
        UserFlowLogger A0c = 7zN.A0c(c00i);
        long j = r0.A00;
        A0c.flowMarkPoint(j, "GENERATE_NEW_RECOVERY_CODE_BACK_BUTTON_CLICKED");
        7zN.A0c(c00i).flowEndCancel(j, CancelReason.USER_CANCELLED);
    }

    public static final void A0D(EbSetupRecoveryCodeFragment ebSetupRecoveryCodeFragment, String str, String str2) {
        if (!ebSetupRecoveryCodeFragment.A04) {
            ebSetupRecoveryCodeFragment.A1d().A08(str2);
            return;
        }
        9Nr r0 = ebSetupRecoveryCodeFragment.A00;
        if (r0 != null) {
            4YV.A0Z(r0.A01).flowMarkPoint(r0.A00, str);
        } else {
            11T.A0L("generateRecoveryCodeFlowLogger");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        this.A04 = A1a().getBoolean("is_generate_new_recovery_code_flow");
        this.A02 = A1a().getString("entry_point_key");
        super.A1S(bundle);
        this.A01 = new RTT(BaseFragment.A06(this, 68832), requireContext());
        9Nr r0 = (9Nr) 1Bn.A0A(68802);
        11T.A0F(r0, 0);
        this.A00 = r0;
        if (this.A04) {
            C96q A00 = 9Bn.A00(this.A02);
            if (A00 == null) {
                A00 = C96q.A0L;
            }
            C00i c00i = r0.A01.A00;
            UserFlowLogger A0c = 7zN.A0c(c00i);
            long j = r0.A00;
            String obj = A00.toString();
            7zN.A1Z(A0c, obj, j, false);
            7zS.A1G(c00i, obj, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1g() {
        RTT rtt = this.A01;
        if (rtt != null) {
            9Bt.A00(this, rtt.A01);
            1Iw A0T = 7zP.A0T(this);
            LithoView A1c = A1c();
            MigColorScheme A1f = A1f();
            9IW r0 = (9IW) this.A05.getValue();
            RTT rtt2 = this.A01;
            if (rtt2 != null) {
                A1c.A0y(new C8bv(BaseFragment.A03(A0T, this), r0, A1f, rtt2.A00, rtt2.A01, A1e().A07()));
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }

    public final void A1m() {
        A0D(this, "GENERATE_NEW_RECOVERY_CODE_SUCCESS", "SETUP_ADVANCED_SETUP_40DIGIT_CODE_SETUP_SUCCESS");
        if (!this.A04) {
            AQv.A02(A1d(), C96c.A06);
        }
    }

    @Override // X.GF6
    public boolean Bkd() {
        A0C(this);
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        bundle.putBoolean("KEY_SHOWN_RC_COPIED", this.A03);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        RTT rtt = this.A01;
        if (rtt != null) {
            C9qq.A00(this, rtt.A02, 38);
            RTT rtt2 = this.A01;
            if (rtt2 != null) {
                rtt2.A00();
                A1g();
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewStateRestored(Bundle bundle) {
        int A02 = 0FI.A02(-1120959267);
        boolean z = true;
        if (bundle == null || !bundle.getBoolean("KEY_SHOWN_RC_COPIED", false)) {
            z = false;
        }
        this.A03 = z;
        super/*androidx.fragment.app.Fragment*/.onViewStateRestored(bundle);
        0FI.A08(93101458, A02);
    }
}
