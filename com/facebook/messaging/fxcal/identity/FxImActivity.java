package com.facebook.messaging.fxcal.identity;

import X.1BK;
import X.1JF;
import X.1JW;
import X.DKE;
import X.E1J;
import X.E1K;
import X.E1N;
import X.E1P;
import X.E1Q;
import X.E1S;
import X.InterfaceC03733yw;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: FxImActivity.class */
public class FxImActivity extends MessengerSettingActivity implements InterfaceC03733yw {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        E1P e1n;
        Bundle A05;
        super.A2y(bundle);
        A3B();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("surface");
        if (stringExtra != null) {
            short s = -1;
            int i = 1;
            switch (stringExtra.hashCode()) {
                case -2137322134:
                    s = DKE.A18("avatar_setting", stringExtra);
                    break;
                case -1137852596:
                    s = DKE.A19("photo_selector", stringExtra);
                    break;
                case 109683011:
                    s = DKE.A1A("photo_setting", stringExtra);
                    break;
                case 347801554:
                    if (stringExtra.equals("identity_detail_view")) {
                        s = 3;
                        break;
                    }
                    break;
                case 494143570:
                    if (stringExtra.equals("sync_flow")) {
                        s = 4;
                        break;
                    }
                    break;
            }
            switch (s) {
                case 0:
                    if (intent.getIntExtra("avatar_present", 0) != 1) {
                        i = 0;
                    }
                    A05 = 1BK.A05();
                    A05.putInt("avatar_present", i);
                    e1n = new E1S();
                    break;
                case 1:
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("profile_list");
                    if (parcelableArrayListExtra == null) {
                        e1n = new E1J();
                        A3C(e1n);
                    }
                    Parcelable parcelableExtra = intent.getParcelableExtra("screen_content");
                    A05 = 1BK.A05();
                    A05.putParcelableArrayList("profile_list", 1JW.A02(parcelableArrayListExtra));
                    A05.putParcelable("screen_content", parcelableExtra);
                    e1n = new E1J();
                    break;
                case 2:
                    e1n = new E1P();
                    A3C(e1n);
                case 3:
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("profile");
                    Parcelable parcelableExtra3 = intent.getParcelableExtra("screen_content");
                    if (parcelableExtra2 != null && parcelableExtra3 != null) {
                        A05 = 1BK.A05();
                        A05.putParcelable("profile", parcelableExtra2);
                        A05.putParcelable("screen_content", parcelableExtra3);
                        e1n = new E1K();
                        break;
                    } else {
                        return;
                    }
                    break;
                case 4:
                    String stringExtra2 = intent.getStringExtra("entry_point");
                    String stringExtra3 = !1JF.A0B(intent.getStringExtra("upsell_type")) ? intent.getStringExtra("upsell_type") : "";
                    A05 = 1BK.A05();
                    A05.putString("entry_point", stringExtra2);
                    A05.putString("upsell_type", stringExtra3);
                    e1n = new E1Q();
                    break;
            }
            e1n.setArguments(A05);
            A3C(e1n);
        }
        e1n = new E1N();
        A3C(e1n);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Iterator it = DKE.A15(this).iterator();
        while (it.hasNext()) {
            if (it.next() instanceof E1N) {
                finish();
                return;
            }
        }
        super.onBackPressed();
    }
}
