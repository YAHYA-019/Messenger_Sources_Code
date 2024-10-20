package com.facebook.rtc.activities;

import X.4YT;
import X.AbM;
import X.C2121Dea;
import X.DKS;
import X.FKB;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: HeadlessDialogActivity.class */
public class HeadlessDialogActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        Intent intent = getIntent();
        if (4YT.A00(999).equals(intent.getAction())) {
            C2121Dea A03 = C2121Dea.A03(this);
            String stringExtra = intent.getStringExtra("TITLE");
            stringExtra.getClass();
            A03.A0B(stringExtra);
            String stringExtra2 = intent.getStringExtra("MESSAGE");
            stringExtra2.getClass();
            A03.A0A(stringExtra2);
            DKS.A01(A03, getString(2131955719), this, 87);
            ((DKS) A03).A01.A06 = new FKB(this, 8);
            AbM.A1I(A03);
        }
    }
}
