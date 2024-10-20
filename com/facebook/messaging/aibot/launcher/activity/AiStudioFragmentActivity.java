package com.facebook.messaging.aibot.launcher.activity;

import X.06Z;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1pH;
import X.7zM;
import X.83Z;
import X.BOj;
import X.InterfaceC00633oW;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: AiStudioFragmentActivity.class */
public final class AiStudioFragmentActivity extends FbFragmentActivity {
    public 1pH A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A06();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = 1pH.A01((ViewGroup) 7zM.A0F(this), BDe(), (InterfaceC00633oW) null);
        BOj serializableExtra = getIntent().getSerializableExtra("AiStudioFragmentActivity.entry_point");
        11T.A0I(serializableExtra, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.AIAgentEntryPoint");
        BOj bOj = serializableExtra;
        83Z A0F = 1BK.A0F();
        if (A0F != null) {
            06Z BDe = BDe();
            1pH r0 = this.A00;
            if (r0 == null) {
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            }
            A0F.A03(this, BDe, bOj, r0, true);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        if (r0.A07()) {
            return;
        }
        super.onBackPressed();
    }
}
