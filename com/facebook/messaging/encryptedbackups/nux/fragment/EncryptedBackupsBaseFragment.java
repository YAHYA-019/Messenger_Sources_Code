package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.2Zo;
import X.2Zs;
import X.7zL;
import X.7zN;
import X.7zQ;
import X.7zR;
import X.9Bn;
import X.9C8;
import X.AKf;
import X.C00m;
import X.C1360Af2;
import X.C1ud;
import X.C96q;
import X.C97j;
import X.C9up;
import X.FAn;
import X.FIu;
import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;

/* loaded from: EncryptedBackupsBaseFragment.class */
public abstract class EncryptedBackupsBaseFragment extends BaseFragment {
    public FIu A00;
    public C9up A01;
    public EncryptedBackupsNuxViewData A02;
    public FAn A03;
    public 9C8 A04;
    public 2Zs A05 = 2Zo.A00();
    public 2Zs A06 = 7zN.A0x();

    public static final C1360Af2 A0B(EncryptedBackupsBaseFragment encryptedBackupsBaseFragment, String str, C00m c00m) {
        return new C1360Af2(new AKf(c00m, encryptedBackupsBaseFragment, str, 5), encryptedBackupsBaseFragment.A1f().Atv(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Context requireContext = requireContext();
        FAn A0Y = 7zR.A0Y();
        11T.A0F(A0Y, 0);
        this.A03 = A0Y;
        9C8 r0 = (9C8) 1Bn.A0A(68891);
        11T.A0F(r0, 0);
        this.A04 = r0;
        this.A02 = new EncryptedBackupsNuxViewData(BaseFragment.A06(this, 68827), requireContext);
        A1o().A02();
        FIu A0d = 7zQ.A0d(requireContext);
        11T.A0F(A0d, 0);
        this.A00 = A0d;
        C1ud c1ud = (C1ud) 1Bi.A03(65997);
        11T.A0F(c1ud, 0);
        ((BaseFragment) this).A04 = c1ud;
        C9up c9up = (C9up) 1Bi.A03(68799);
        11T.A0F(c9up, 0);
        this.A01 = c9up;
    }

    public final C9up A1m() {
        C9up c9up = this.A01;
        if (c9up != null) {
            return c9up;
        }
        11T.A0L("restoreFlowLogger");
        throw 0Q8.createAndThrow();
    }

    public final C96q A1n() {
        if (!A1a().getBoolean("is_from_deep_link")) {
            return A1l() ? C96q.A0A : C96q.A0I;
        }
        C96q A00 = 9Bn.A00(A1a().getString("entry_point_key"));
        if (A00 == null) {
            A00 = C96q.A0F;
        }
        return A00;
    }

    public final EncryptedBackupsNuxViewData A1o() {
        EncryptedBackupsNuxViewData encryptedBackupsNuxViewData = this.A02;
        if (encryptedBackupsNuxViewData != null) {
            return encryptedBackupsNuxViewData;
        }
        11T.A0L("encryptedBackupsNuxViewData");
        throw 0Q8.createAndThrow();
    }

    public final void A1p() {
        if (this.A03 != null) {
            return;
        }
        7zL.A1D();
        throw 0Q8.createAndThrow();
    }

    public final void A1q(Bundle bundle, C97j c97j) {
        Bundle A05 = 1BK.A05();
        A05.putAll(bundle);
        A05.putBoolean("is_nux_flow", A1l());
        if (A1l()) {
            A1r(c97j.key, A05);
        } else {
            A1p();
            A1Y(FAn.A01(c97j.key, A05));
        }
    }

    public final void A1r(String str, Bundle bundle) {
        A1p();
        7zR.A10(bundle, this, str);
    }
}
