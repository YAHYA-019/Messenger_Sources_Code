package com.facebook.messaging.history;

import X.1pH;
import X.AbL;
import android.R;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: HistoryActivity.class */
public final class HistoryActivity extends FbFragmentActivity {
    public 1pH A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 != null) {
            r0.A06();
        }
        this.A00 = null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = AbL.A0B(this, requireViewById(R.id.content));
        AbL.A0l(this);
        setContentView(2132541838);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null || !r0.A07()) {
            super.onBackPressed();
            overridePendingTransition(2130772066, 2130772070);
        }
    }
}
