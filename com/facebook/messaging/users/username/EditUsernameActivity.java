package com.facebook.messaging.users.username;

import X.0S2;
import X.11T;
import X.1Bn;
import X.1iF;
import X.AbK;
import X.AbN;
import X.B9M;
import X.BVA;
import X.BiP;
import X.C6v;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: EditUsernameActivity.class */
public final class EditUsernameActivity extends MessengerSettingActivity {
    public C6v A00;
    public B9M A01;

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbK.A0E();
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        Integer num;
        super.A2y(bundle);
        A3B();
        String stringExtra = getIntent().getStringExtra("entrypoint");
        Integer[] A00 = 0S2.A00(3);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = 0S2.A0C;
                break;
            }
            num = A00[i];
            if (11T.A0O(BVA.A00(num), stringExtra)) {
                break;
            } else {
                i++;
            }
        }
        Bundle A09 = AbN.A09(num);
        A09.putString("entrypoint", BVA.A00(num));
        B9M b9m = new B9M();
        b9m.setArguments(A09);
        this.A01 = b9m;
        b9m.A08 = new BiP(this);
        A3C(b9m);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A00 = (C6v) 1Bn.A0A(83971);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        B9M b9m;
        C6v c6v = this.A00;
        if (c6v != null && (b9m = this.A01) != null) {
            c6v.A01(b9m.A00);
        }
        super.onBackPressed();
    }
}
