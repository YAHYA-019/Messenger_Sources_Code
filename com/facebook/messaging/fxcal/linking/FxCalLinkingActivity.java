package com.facebook.messaging.fxcal.linking;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.C00i;
import X.DSI;
import X.E1U;
import X.InterfaceC03733yw;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: FxCalLinkingActivity.class */
public final class FxCalLinkingActivity extends MessengerSettingActivity implements InterfaceC03733yw {
    public DSI A00;
    public final 1Br A02 = 7zM.A0S();
    public final 1Br A01 = 1Bu.A00(98490);

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        DSI dsi;
        super.A2y(bundle);
        C00i c00i = this.A02.A00;
        1BK.A0V(c00i).markerStart(857807376);
        A3B();
        this.A00 = new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) 1Br.A0B(this.A01)).get(DSI.class);
        String stringExtra = getIntent().getStringExtra("FXCAL_FLOW");
        1BK.A0V(c00i).markerAnnotate(857807376, "entry_point", stringExtra == null ? "" : stringExtra);
        if (stringExtra != null && (dsi = this.A00) != null) {
            dsi.A03 = stringExtra;
        }
        E1U e1u = new E1U();
        E1U.A0G = e1u;
        A3C(e1u);
    }
}
