package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Br;
import X.1G9;
import X.1NK;
import X.48X;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zR;
import X.9TU;
import X.C00i;
import X.C1ud;
import X.C1wg;
import X.C1wk;
import X.C95e;
import X.C96q;
import X.C97j;
import X.C9bq;
import X.C9cq;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: EbHsmMigrationResetPinFragment.class */
public final class EbHsmMigrationResetPinFragment extends EbNuxPinSetupFragment {
    public C9bq A00;
    public 9TU A01;
    public 48X A02;

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment, com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = (C9bq) 1Bn.A0A(68808);
        this.A02 = 7zQ.A0f();
        this.A01 = (9TU) 1Bn.A0A(68896);
    }

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment, com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment
    public void A1o() {
        super.A1o();
        9TU r0 = this.A01;
        if (r0 == null) {
            11T.A0L("hsmMigrationResetPinViewData");
            throw 0Q8.createAndThrow();
        }
        ((C9cq) 1Br.A0B(r0.A04)).A00();
    }

    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment, X.GF6
    public boolean Bkd() {
        String str;
        boolean A0A = BaseFragment.A0A(this);
        super.Bkd();
        if (!A0A) {
            C9bq c9bq = this.A00;
            if (c9bq == null) {
                str = "confirmOrResetTouchPointProvider";
            } else if (c9bq.A00().type == C95e.A02) {
                48X r0 = this.A02;
                if (r0 != null) {
                    r0.A00();
                    if (((EbNuxPinSetupFragment) this).A01 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    7zR.A10(Bundle.EMPTY, this, C97j.A0I.key);
                    return false;
                }
                str = "coolDownFlagHelper";
            } else {
                9TU r02 = this.A01;
                if (r02 == null) {
                    str = "hsmMigrationResetPinViewData";
                } else {
                    ((C9cq) 1Br.A0B(r02.A04)).A02("PIN_CREATION_ERROR_SCREEN_CANCEL_CLICK");
                    if (((EbNuxPinSetupFragment) this).A01 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    7zR.A10(Bundle.EMPTY, this, C97j.A0O.key);
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        return true;
    }

    @Override // com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        9TU r0 = this.A01;
        if (r0 == null) {
            11T.A0L("hsmMigrationResetPinViewData");
            throw 0Q8.createAndThrow();
        }
        C00i c00i = r0.A03.A00;
        long A0C = 1BK.A0G(c00i).A0C();
        C1wk A0G = 1BK.A0G(c00i);
        FbSharedPreferences A03 = C1wk.A03(A0G);
        1G9 r02 = 1NK.A57;
        boolean A07 = C1wk.A07(A0G);
        long A0A = 1BL.A0A(A03, C1wg.A02(r02));
        C00i c00i2 = r0.A02.A00;
        C1ud A0z = 7zM.A0z(c00i2);
        long A06 = 7zM.A06(A0z, C1ud.A00(A0z), 36597901667012389L);
        C1ud A0z2 = 7zM.A0z(c00i2);
        long A062 = 7zM.A06(A0z2, C1ud.A00(A0z2), 36597901667077926L);
        boolean A0O = 1BK.A0G(c00i).A0O();
        C96q c96q = ((C9bq) 1Br.A0B(r0.A01)).A00().type != C95e.A04 ? C96q.A05 : C96q.A0A;
        long A00 = (1Br.A00(r0.A00) - A0C) / 3600000;
        C00i c00i3 = r0.A04.A00;
        ((C9cq) c00i3.get()).A01(c96q, A07);
        ((C9cq) c00i3.get()).A03("EXPIRED_PIN_RESET_SCREEN_IMPRESSION");
        ((C9cq) c00i3.get()).A04("HSM_NUX_LAST_COMPLETED_TIMESTAMP", A0C);
        ((C9cq) c00i3.get()).A04("HSM_NUX_IMPRESSION_COUNT", A0A);
        ((C9cq) c00i3.get()).A04("HSM_EB_ON_HOURS_SINCE_LAST_NUX", A00);
        ((C9cq) c00i3.get()).A04("HSM_EB_ON_SOFT_COOLDOWN_MIN", A06);
        ((C9cq) c00i3.get()).A04("HSM_EB_ON_SOFT_TO_HARD_COOLDOWN_MIN", A062);
        C9cq c9cq = (C9cq) c00i3.get();
        String valueOf = String.valueOf(A0O);
        Long l = c9cq.A00;
        if (l != null) {
            4YV.A0Z(c9cq.A01).flowAnnotate(l.longValue(), "HSM_RESTORED_WITHOUT_PIN_RESET", valueOf);
        }
    }
}
