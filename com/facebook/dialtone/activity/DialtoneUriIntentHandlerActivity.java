package com.facebook.dialtone.activity;

import X.1BQ;
import X.1iF;
import X.1vL;
import X.C00i;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: DialtoneUriIntentHandlerActivity.class */
public class DialtoneUriIntentHandlerActivity extends FbFragmentActivity {
    public final C00i A00 = 1BQ.A02(99939);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(Long.toString(0L), 0L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        ((1vL) this.A00.get()).A0N(this, getIntent());
        finish();
    }
}
