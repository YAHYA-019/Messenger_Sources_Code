package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0BG;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1CO;
import X.1G9;
import X.1Lm;
import X.1NK;
import X.48X;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.AQv;
import X.C00i;
import X.C01i;
import X.C03i;
import X.C0dp;
import X.C1ud;
import X.C1wg;
import X.C1wj;
import X.C1wk;
import X.C1wv;
import X.C3RG;
import X.C96q;
import X.C97j;
import X.C9bq;
import X.C9c7;
import X.C9cq;
import X.C9qq;
import X.GF6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: EbInvalidPinResetInterstitialFragment.class */
public final class EbInvalidPinResetInterstitialFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public C9cq A00;
    public C9c7 A01;
    public C0dp A02;
    public C1wk A03;
    public 48X A04;
    public C9bq A05;
    public final C01i A06 = AQv.A00(this, C03i.A02, 41);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        C9cq c9cq;
        long A06;
        String str;
        super.A1S(bundle);
        this.A05 = (C9bq) 1Bn.A0A(68808);
        this.A04 = 7zQ.A0f();
        this.A03 = 7zU.A0Q();
        this.A00 = (C9cq) 1Bi.A03(68796);
        this.A02 = 7zR.A0G();
        C9c7 c9c7 = new C9c7(BaseFragment.A06(this, 68826), requireContext());
        this.A01 = c9c7;
        Context requireContext = requireContext();
        if (((0BG) 1Br.A0B(c9c7.A04)).A00(requireContext) && c9c7.A00 == null) {
            c9c7.A00 = (C3RG) 1Lm.A05(requireContext, c9c7.A01, 67247);
        }
        C9c7 c9c72 = this.A01;
        if (c9c72 == null) {
            11T.A0L("viewData");
            throw 0Q8.createAndThrow();
        }
        C96q c96q = c9c72.A01() ? C96q.A05 : C96q.A0A;
        1Br r0 = c9c72.A0A;
        boolean z = true;
        ((C9cq) 1Br.A0B(r0)).A01(c96q, true);
        ((C9cq) 1Br.A0B(r0)).A03("PIN_CREATION_ERROR_SCREEN_IMPRESSION");
        C00i c00i = c9c72.A09.A00;
        C1wk A0G = 1BK.A0G(c00i);
        FbSharedPreferences A03 = C1wk.A03(A0G);
        1G9 r02 = 1NK.A4o;
        long j = 0;
        if (A03.Av1(C1wg.A01(A0G, r02, 1), 0L) != 0) {
            long A00 = 1Br.A00(c9c72.A05);
            C1wk A0G2 = 1BK.A0G(c00i);
            j = (A00 - C1wk.A03(A0G2).Av1(C1wg.A01(A0G2, r02, 1), 0L)) / 3600000;
        }
        ((C9cq) 1Br.A0B(r0)).A04("PIN_CREATION_ERROR_HOURS_SINCE_LAST_NUX", j);
        C1wv c1wv = (C1wv) 1Br.A0B(c9c72.A03);
        C1wv.A04(c1wv);
        if (c1wv.A02.getValue() != C1wj.A04) {
            z = false;
        }
        C9cq c9cq2 = (C9cq) 1Br.A0B(r0);
        String valueOf = String.valueOf(z);
        Long l = c9cq2.A00;
        if (l != null) {
            4YV.A0Z(c9cq2.A01).flowAnnotate(l.longValue(), "PIN_CREATION_ERROR_IS_EB_ON", valueOf);
        }
        C9cq c9cq3 = (C9cq) 1Br.A0B(r0);
        C1wk A0G3 = 1BK.A0G(c00i);
        c9cq3.A04("PIN_CREATION_ERROR_COMPLETION_COUNT", 1BL.A0A(C1wk.A03(A0G3), C1wg.A00(A0G3, 1NK.A4n)));
        C9cq c9cq4 = (C9cq) 1Br.A0B(r0);
        C00i c00i2 = c9c72.A07.A00;
        C1ud A0z = 7zM.A0z(c00i2);
        1CO A002 = C1ud.A00(A0z);
        if (z) {
            c9cq4.A04("PIN_CREATION_ERROR_EB_ON_IMPRESSION_LIMIT", 7zM.A06(A0z, A002, 36597901668257579L));
            C9cq c9cq5 = (C9cq) 1Br.A0B(r0);
            C1ud A0z2 = 7zM.A0z(c00i2);
            c9cq5.A04("PIN_CREATION_ERROR_EB_ON_SOFT_COOLDOWN_MIN", 7zM.A06(A0z2, C1ud.A00(A0z2), 36597901668126506L));
            c9cq = (C9cq) 1Br.A0B(r0);
            C1ud A0z3 = 7zM.A0z(c00i2);
            A06 = 7zM.A06(A0z3, C1ud.A00(A0z3), 36597901667995433L);
            str = "PIN_CREATION_ERROR_EB_ON_SOFT_TO_HARD_COOLDOWN_MIN";
        } else {
            c9cq4.A04("PIN_CREATION_ERROR_EB_OFF_IMPRESSION_LIMIT", 7zM.A06(A0z, A002, 36597901669633841L));
            c9cq = (C9cq) 1Br.A0B(r0);
            C1ud A0z4 = 7zM.A0z(c00i2);
            A06 = 7zM.A06(A0z4, C1ud.A00(A0z4), 36597901668781869L);
            str = "PIN_CREATION_ERROR_EB_OFF_SOFT_COOLDOWN_MIN";
        }
        c9cq.A04(str, A06);
        C9cq c9cq6 = (C9cq) 1Br.A0B(r0);
        Long l2 = c9cq6.A00;
        if (l2 != null) {
            4YV.A0Z(c9cq6.A01).flowAnnotateWithCrucialData(l2.longValue(), "LAST_SCREEN", "EncryptedBackupsSettingFragmentViewData");
        }
    }

    @Override // X.GF6
    public boolean Bkd() {
        String str;
        C9c7 c9c7 = this.A01;
        if (c9c7 == null) {
            str = "viewData";
        } else {
            if (c9c7.A01()) {
                7zU.A1N(C97j.A0J, this);
                return false;
            }
            C9cq c9cq = this.A00;
            if (c9cq != null) {
                c9cq.A02("PIN_CREATION_ERROR_SCREEN_CANCEL_CLICK");
                7zU.A1N(C97j.A0O, this);
                return true;
            }
            str = "settingPinSetupFlowLogger";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        String str;
        int A02 = 0FI.A02(604439417);
        C9c7 c9c7 = this.A01;
        if (c9c7 != null) {
            if (c9c7.A01()) {
                48X r0 = this.A04;
                if (r0 == null) {
                    str = "coolDownFlagHelper";
                } else {
                    r0.A00();
                }
            }
            super/*androidx.fragment.app.Fragment*/.onDestroy();
            0FI.A08(445849963, A02);
            return;
        }
        str = "viewData";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C9c7 c9c7 = this.A01;
        if (c9c7 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C9qq.A00(this, c9c7.A02, 25);
    }
}
