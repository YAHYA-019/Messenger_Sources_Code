package com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1G9;
import X.1NK;
import X.1xK;
import X.48X;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zU;
import X.9Z8;
import X.AnonymousClass001;
import X.C00i;
import X.C1wg;
import X.C1wk;
import X.C96q;
import X.C97j;
import X.C9qq;
import X.C9uq;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: EbEmployeeRecoveryCodeMigrationFragment.class */
public final class EbEmployeeRecoveryCodeMigrationFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 9Z8 A00;
    public 48X A01;
    public 1xK A02;
    public final 1Br A03 = 1Bq.A00(68793);

    public static final boolean A0C(EbEmployeeRecoveryCodeMigrationFragment ebEmployeeRecoveryCodeMigrationFragment) {
        1xK r0 = ebEmployeeRecoveryCodeMigrationFragment.A02;
        if (r0 == null) {
            11T.A0L("touchPointProvider");
            throw 0Q8.createAndThrow();
        }
        C1wk A00 = 1xK.A00(r0);
        FbSharedPreferences A03 = C1wk.A03(A00);
        1G9 A002 = C1wg.A00(A00, 1NK.A4v);
        long j = -1;
        return AnonymousClass001.A1W(7zM.A18((A03.Av1(A002, j) > j ? 1 : (A03.Av1(A002, j) == j ? 0 : -1))), 0S2.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FbUserSession A06 = BaseFragment.A06(this, 147594);
        C00i c00i = this.A03.A00;
        this.A00 = new 9Z8(A06, 7zU.A0O(c00i));
        this.A02 = (1xK) 7zN.A0n(this, A1b(), 68817);
        this.A01 = 7zQ.A0f();
        C9uq.A01(7zU.A0O(c00i), C96q.A03, null, null);
        7zU.A0O(c00i).A0A("ENTRY_POINT", A0C(this) ? "HARD_BLOCK_NUX" : "NUX");
        7zU.A0O(c00i).A08("NUX_IMPRESSION");
    }

    @Override // X.GF6
    public boolean Bkd() {
        7zU.A0P(this.A03).A06("BACK_BUTTON_TAP");
        48X r0 = this.A01;
        if (r0 == null) {
            11T.A0L("cooldownHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A00();
        if (A0C(this)) {
            return false;
        }
        7zU.A1O(C97j.A0O, this);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        9Z8 r0 = this.A00;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C9qq.A00(this, r0.A00, 51);
    }
}
