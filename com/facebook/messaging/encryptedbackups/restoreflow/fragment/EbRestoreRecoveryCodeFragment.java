package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.7zL;
import X.7zO;
import X.7zP;
import X.9TX;
import X.AQo;
import X.AZL;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2iw;
import X.C96q;
import X.C9Ik;
import X.C9qq;
import X.FIu;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreRecoveryCodeFragment;

/* loaded from: EbRestoreRecoveryCodeFragment.class */
public final class EbRestoreRecoveryCodeFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 1Iw A00;
    public FIu A01;
    public AZL A02;
    public C9Ik A03;
    public 9TX A04;
    public final C01i A06 = C01g.A00(C03i.A02, AQo.A01(this, 3));
    public final C2iw A05 = 7zL.A0Z();

    public static final void A0C(EbRestoreRecoveryCodeFragment ebRestoreRecoveryCodeFragment) {
        9TX r0 = ebRestoreRecoveryCodeFragment.A04;
        if (r0 != null) {
            7zO.A0Z(r0.A03).A07("RESTORE_WITH_RC_NOT_NOW");
            9TX r02 = ebRestoreRecoveryCodeFragment.A04;
            if (r02 != null) {
                7zO.A0Z(r02.A03).A07("RESTORE_SKIP_CONFIRMATION_ALERT_SHOW");
                ebRestoreRecoveryCodeFragment.A1k(AQo.A01(ebRestoreRecoveryCodeFragment, 1), AQo.A01(ebRestoreRecoveryCodeFragment, 2), 2131964500, 2131964498, 2131956450, 2131964499);
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = (FIu) 7zO.A0l(this, 100011);
        this.A02 = new AZL() { // from class: X.9ut
            /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreRecoveryCodeFragment] */
            public void CHP() {
                ?? r0 = EbRestoreRecoveryCodeFragment.this;
                9TX r02 = r0.A04;
                if (r02 == null) {
                    7zL.A1B();
                    throw 0Q8.createAndThrow();
                }
                7zO.A0Z(r02.A03).A07("RESTORE_WITH_RC_FAILED");
                r0.A1j(7zN.A0s((Fragment) r0, 2131956453), 7zN.A0s((Fragment) r0, 2131956451), 7zN.A0s((Fragment) r0, 2131956452), 7zN.A0s((Fragment) r0, 2131956454), AQn.A01(r0, 49), AQo.A01(r0, 0));
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.base.fragment.AbstractNavigableFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreRecoveryCodeFragment] */
            public void CHR() {
                ?? r0 = EbRestoreRecoveryCodeFragment.this;
                9TX r02 = r0.A04;
                if (r02 == null) {
                    7zL.A1B();
                    throw 0Q8.createAndThrow();
                }
                7zO.A0Z(r02.A03).A07("RESTORE_WITH_RC_SUCCESS");
                7zO.A0Z(r02.A03).A03(0S2.A00);
                boolean A1l = r0.A1l();
                C97j c97j = C97j.A0E;
                if (A1l) {
                    7zU.A1O(c97j, (EncryptedBackupsBaseFragment) r0);
                    return;
                }
                Bundle bundle2 = Bundle.EMPTY;
                11T.A0B(bundle2);
                r0.A1p();
                r0.A1Y(FAn.A01(c97j.key, bundle2));
                7zQ.A16(r0.requireContext(), 2131956442);
            }
        };
        this.A03 = new C9Ik(this);
        this.A04 = (9TX) 1Bn.A0A(68889);
        this.A00 = 7zP.A0T(this);
        9TX r0 = this.A04;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C96q A1n = A1n();
        11T.A0F(A1n, 0);
        if (A1n.equals(C96q.A0I)) {
            7zO.A0Z(r0.A03).A01(A1n, 0S2.A01);
        }
        7zO.A0Z(r0.A03).A07("RESTORE_ENTER_RECOVERY_CODE_SCREEN_IMPRESSION");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF6
    public boolean Bkd() {
        if (this.mFragmentManager.A0U() > 0 || !A1l()) {
            return false;
        }
        A0C(this);
        return true;
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
        C9qq.A00(this, A1o().A03, 55);
        C9qq.A00(this, A1o().A04, 56);
        C9qq.A00(this, A1o().A02, 57);
        if (bundle == null || (string = bundle.getString("recovery_code")) == null) {
            return;
        }
        A1o().A01 = string;
    }
}
