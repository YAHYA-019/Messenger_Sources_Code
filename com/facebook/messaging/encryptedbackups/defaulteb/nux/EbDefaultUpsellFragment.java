package com.facebook.messaging.encryptedbackups.defaulteb.nux;

import X.0Q8;
import X.11T;
import X.7zL;
import X.7zU;
import X.8Co;
import X.8VI;
import X.9IK;
import X.AQb;
import X.AQt;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C96q;
import X.C9uq;
import android.os.Bundle;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: EbDefaultUpsellFragment.class */
public final class EbDefaultUpsellFragment extends BaseFragment {
    public 9IK A00;
    public 8Co A01;

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        AQb A00 = AQb.A00(this, 42);
        C01i A002 = C01g.A00(C03i.A02, AQb.A00(AQb.A00(this, 39), 40));
        8Co r0 = (8Co) 7zU.A0F(AQb.A00(A002, 41), A00, AQt.A01(null, A002, 39), 7zL.A18(8Co.class)).getValue();
        this.A01 = r0;
        this.A00 = new 9IK(this);
        if (r0 == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        if (bundle == null) {
            C00i c00i = r0.A02.A00;
            C9uq.A01(7zU.A0O(c00i), C96q.A02, null, null);
            7zU.A0O(c00i).A08("DEFAULT_EB_UPSELL_IMPRESSION");
            7zU.A0O(c00i).A0B("DEFAULT_EB_REQUESTED", ConstantsKt.CAMERA_ID_FRONT);
        }
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView A1c = A1c();
        MigColorScheme A1f = A1f();
        9IK r0 = this.A00;
        if (r0 != null) {
            A1c.A0y(new 8VI(r0, A1f));
        } else {
            11T.A0L("componentListener");
            throw 0Q8.createAndThrow();
        }
    }
}
