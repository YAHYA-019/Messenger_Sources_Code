package com.facebook.quickpromotion.ui;

import X.1Bq;
import X.1Br;
import X.7zU;
import X.C06c;
import X.F7p;
import X.GG8;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: QuickPromotionLoginInterstitialBloksActivity.class */
public final class QuickPromotionLoginInterstitialBloksActivity extends FbFragmentActivity implements GG8 {
    public final 1Br A00 = 1Bq.A00(99615);

    @Override // X.GG8
    public void CFB(String str) {
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Fragment A01 = ((F7p) 1Br.A0B(this.A00)).A01(getIntent());
        if (A01 == null) {
            finish();
        } else {
            A01.setRetainInstance(true);
            C06c A0D = 7zU.A0D(this);
            A0D.A0M(A01, R.id.content);
            A0D.A04();
        }
        overridePendingTransition(0, 0);
    }
}
