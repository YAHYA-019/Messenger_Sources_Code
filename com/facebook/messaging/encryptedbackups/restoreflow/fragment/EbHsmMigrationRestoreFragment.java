package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Hv;
import X.1NK;
import X.7zL;
import X.7zM;
import X.7zR;
import X.7zU;
import X.9ZO;
import X.9lN;
import X.C0dp;
import X.C1ud;
import X.C1wg;
import X.C1wk;
import X.C1wl;
import X.C96q;
import X.C9qq;
import X.C9up;
import X.FAn;
import X.GF6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;

/* loaded from: EbHsmMigrationRestoreFragment.class */
public final class EbHsmMigrationRestoreFragment extends HsmPinCodeRestoreFragment implements GF6 {
    public 9lN A00;
    public EncryptedBackupsNuxViewData A01;
    public FAn A02;
    public InputMethodManager A03;
    public C0dp A04;
    public C1wk A05;
    public C1wl A06;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Context requireContext = requireContext();
        9lN r0 = new 9lN(requireContext, BaseFragment.A06(this, 68895), (9ZO) 1Bi.A03(68801));
        this.A00 = r0;
        String str = "setupViewData";
        r0.A03(bundle);
        9lN r02 = this.A00;
        if (r02 != null) {
            C96q c96q = C96q.A0A;
            11T.A0F(c96q, 0);
            r02.A00 = c96q;
            EncryptedBackupsNuxViewData encryptedBackupsNuxViewData = new EncryptedBackupsNuxViewData(BaseFragment.A06(this, 68827), requireContext);
            this.A01 = encryptedBackupsNuxViewData;
            encryptedBackupsNuxViewData.A02();
            this.A02 = 7zR.A0Y();
            this.A03 = (InputMethodManager) 1Hv.A02(requireContext, 100189);
            this.A04 = 7zR.A0G();
            this.A05 = 7zU.A0Q();
            this.A06 = (C1wl) 1Bn.A0A(68815);
            A1n().A01(c96q, 0S2.A01);
            C9up A1n = A1n();
            C1wl c1wl = this.A06;
            if (c1wl == null) {
                str = "hsmMigrationHelper";
            } else {
                A1n.A09("IS_HSM_RESTORE", String.valueOf(c1wl.A01()));
                C9up A1n2 = A1n();
                C1ud A1e = A1e();
                A1n2.A09("HSM_EB_OFF_SOFT_COOLDOWN_MIN", String.valueOf(7zM.A06(A1e, C1ud.A00(A1e), 36597901667733288L)));
                C9up A1n3 = A1n();
                C1wk c1wk = this.A05;
                str = "nuxFlagManager";
                if (c1wk != null) {
                    A1n3.A09("HSM_EB_OFF_RESTORE_SEEN_COUNT", String.valueOf(1BL.A0A(C1wk.A03(c1wk), C1wg.A00(c1wk, 1NK.A58))));
                    C0dp c0dp = this.A04;
                    if (c0dp == null) {
                        str = "clock";
                    } else {
                        long now = c0dp.now();
                        C1wk c1wk2 = this.A05;
                        if (c1wk2 != null) {
                            A1n().A09("HSM_EB_OFF_HOURS_SINCE_LAST_NUX", String.valueOf((now - c1wk2.A0C()) / 3600000));
                            return;
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment
    public void A1o() {
        if (this.A02 == null) {
            7zL.A1D();
            throw 0Q8.createAndThrow();
        }
        7zR.A10(A1a(), this, "hsm_restore_locked_out_error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C9qq.A00(this, A1m().A05, 52);
        9lN r0 = this.A00;
        if (r0 == null) {
            11T.A0L("setupViewData");
            throw 0Q8.createAndThrow();
        }
        C9qq.A00(this, 7zU.A0E(r0.A0E), 53);
    }
}
