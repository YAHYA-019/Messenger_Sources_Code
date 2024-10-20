package com.facebook.messaging.internalprefs.fxpf;

import X.CZD;
import X.DKC;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: FXPFDebugActivity.class */
public final class FXPFDebugActivity extends FbFragmentActivity {
    public final FragmentActivity A00 = this;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542068);
        CZD.A01(DKC.A0F(this, 2131365165), this, 127);
        CZD.A01(DKC.A0F(this, 2131365164), this, 128);
        CZD.A01(DKC.A0F(this, 2131365163), this, ActionId.MESSENGER_QUEUE_CREATION);
    }
}
