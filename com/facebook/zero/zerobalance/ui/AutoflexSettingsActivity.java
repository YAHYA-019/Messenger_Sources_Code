package com.facebook.zero.zerobalance.ui;

import X.0FI;
import X.1BV;
import X.1iF;
import X.4YU;
import X.7zL;
import X.AbF;
import X.C00i;
import X.DKE;
import X.F8b;
import X.FJ7;
import X.Fuc;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: AutoflexSettingsActivity.class */
public class AutoflexSettingsActivity extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKE.A0Q();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("location") != null ? intent.getStringExtra("location") : "bookmark";
        1BV A0R = 7zL.A0R(this, 98502);
        this.A00 = A0R;
        this.A01 = AbF.A0Q(this, 98596);
        ((F8b) 4YU.A0p(A0R)).A01(this, new Fuc(this), stringExtra, "", false);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1158671729);
        super.onPause();
        ((FJ7) 4YU.A0p(this.A01)).A06.A01();
        0FI.A07(-63720679, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(287857393);
        super.onResume();
        FJ7 fj7 = (FJ7) 4YU.A0p(this.A01);
        fj7.A06.A00();
        FJ7.A06(fj7);
        0FI.A07(-691194338, A00);
    }
}
