package com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.7zL;
import X.7zP;
import X.7zU;
import X.AQn;
import X.AZL;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2iw;
import X.C96q;
import X.C97j;
import X.C9qq;
import X.C9uq;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;
import com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbConfirmRecoveryCodeFragment;

/* loaded from: EbConfirmRecoveryCodeFragment.class */
public final class EbConfirmRecoveryCodeFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 1Iw A00;
    public AZL A01;
    public final C2iw A03 = 7zL.A0Z();
    public final 1Br A02 = 1Bq.A00(68794);
    public final C01i A04 = C01g.A00(C03i.A02, AQn.A01(this, 38));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 7zP.A0T(this);
        this.A01 = new AZL() { // from class: X.9us
            public void CHP() {
                EbConfirmRecoveryCodeFragment ebConfirmRecoveryCodeFragment = EbConfirmRecoveryCodeFragment.this;
                7zU.A0P(ebConfirmRecoveryCodeFragment.A02).A08("CONFIRM_40C_CODE_API_FAILURE_DIALOG_IMPRESSION");
                DR6 A0O = 7zV.A0O(ebConfirmRecoveryCodeFragment);
                A0O.A00(2131952787);
                A0O.A06(2131952785);
                C9oG.A02(A0O, ebConfirmRecoveryCodeFragment, 31, 2131957198);
                7zN.A13(A0O);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbConfirmRecoveryCodeFragment, com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment] */
            public void CHR() {
                ?? r0 = EbConfirmRecoveryCodeFragment.this;
                1Br r02 = r0.A02;
                7zU.A0P(r02).A08("CONFIRM_40C_CODE_API_SUCCESS");
                C9uq A0P = 7zU.A0P(r02);
                if (!A0P.A02) {
                    1Br.A0C(A0P.A08);
                }
                A0P.A00 = C96q.A0L;
                A0P.A01 = null;
                4YV.A0Z(A0P.A07).flowEndSuccess(A0P.A03);
                7zU.A1O(C97j.A0D, (EncryptedBackupsBaseFragment) r0);
                7zQ.A16(r0.requireContext(), 2131963858);
            }
        };
        if (A1l()) {
            1Br r0 = this.A02;
            C9uq.A01(7zU.A0P(r0), C96q.A0D, null, null);
            7zU.A0P(r0).A0A("TOUCH_POINT", "CONFIRM_40C");
            7zU.A0P(r0).A0A("DAY", "FOUR");
        }
        EncryptedBackupsNuxViewData A1o = A1o();
        1Br r02 = this.A02;
        C9uq A0P = 7zU.A0P(r02);
        11T.A0F(A0P, 0);
        A1o.A00 = A0P;
        7zU.A0P(r02).A08("CONFIRM_SCREEN_IMPRESSION");
    }

    @Override // X.GF6
    public boolean Bkd() {
        boolean A08 = BaseFragment.A08(this);
        C9uq A0P = 7zU.A0P(this.A02);
        if (A08) {
            A0P.A08("BACK_BUTTON_TAP");
            return false;
        }
        A0P.A06("BACK_BUTTON_TAP");
        7zU.A1O(C97j.A0O, this);
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("recovery_code", A1o().A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C9qq.A00(this, A1o().A03, 48);
        C9qq.A00(this, A1o().A04, 49);
        C9qq.A00(this, A1o().A02, 50);
        if (bundle == null || (string = bundle.getString("recovery_code")) == null) {
            return;
        }
        A1o().A01 = string;
    }
}
