package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.1xG;
import X.2yD;
import X.7zL;
import X.7zO;
import X.7zR;
import X.8Z5;
import X.9IV;
import X.AQn;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C8sz;
import X.C9qq;
import X.FAn;
import X.FIu;
import X.RZ0;
import android.os.Bundle;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EbSetupOptOutFragment.class */
public final class EbSetupOptOutFragment extends BaseFragment {
    public FIu A00;
    public RZ0 A01;
    public FAn A02;
    public 1xG A03;
    public final C01i A04 = C01g.A00(C03i.A02, AQn.A01(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = new RZ0(BaseFragment.A06(this, 68831), requireContext());
        this.A03 = (1xG) 1Bi.A03(66259);
        this.A02 = 7zR.A0Y();
        this.A00 = (FIu) 7zO.A0l(this, 100011);
        A1d().A08("SETUP_LOCAL_STORAGE_SCREEN_IMPRESSION");
        A1d().A09("EbSetupOptOutFragment");
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1g() {
        String str;
        LithoView A1c = A1c();
        MigColorScheme A1f = A1f();
        9IV r0 = (9IV) this.A04.getValue();
        RZ0 rz0 = this.A01;
        if (rz0 == null) {
            str = "viewData";
        } else {
            boolean A0O = 11T.A0O(rz0.A00.getValue(), C8sz.A00);
            1xG r02 = this.A03;
            if (r02 != null) {
                A1c.A0y(new 8Z5(r0, A1f, A0O, 2yD.A03(1xG.A00(r02), 36322293611382066L)));
                return;
            }
            str = "messageExpirationConfig";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        RZ0 rz0 = this.A01;
        if (rz0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C9qq.A01(getViewLifecycleOwner(), rz0.A00, this, 37);
    }
}
