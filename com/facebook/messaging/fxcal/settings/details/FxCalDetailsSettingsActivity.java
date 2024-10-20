package com.facebook.messaging.fxcal.settings.details;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.E1L;
import X.E1T;
import X.F70;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: FxCalDetailsSettingsActivity.class */
public final class FxCalDetailsSettingsActivity extends MessengerSettingActivity {
    public static final F70 A00 = new Object();

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        super.A2x(intent);
        setIntent(intent);
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        Bundle A05;
        E1L e1t;
        super.A2y(bundle);
        A3B();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("surface");
        if (stringExtra != null) {
            if (stringExtra.equals("select_account")) {
                String stringExtra2 = intent.getStringExtra("details");
                A05 = 1BK.A05();
                A05.putString("service_id", stringExtra2);
                e1t = new E1L();
            } else if (stringExtra.equals("main_settings")) {
                String stringExtra3 = intent.getStringExtra("account_type");
                if (stringExtra3 != null) {
                    str = GraphQLStringDefUtil.A00().ATw("GraphQLMAEntAccountType", stringExtra3);
                    11T.A0A(str);
                } else {
                    str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
                String stringExtra4 = intent.getStringExtra("details");
                String stringExtra5 = intent.getStringExtra("product_type");
                String stringExtra6 = intent.getStringExtra("session_id");
                Bundle bundleExtra = intent.getBundleExtra("extra_data");
                A05 = 1BK.A05();
                if (stringExtra4 != null) {
                    A05.putString("details", stringExtra4);
                }
                A05.putString("account_type", str);
                if (stringExtra5 != null) {
                    A05.putString("product_type", stringExtra5);
                }
                if (stringExtra6 != null) {
                    A05.putString("session_id", stringExtra6);
                }
                if (bundleExtra != null) {
                    A05.putBundle("extra_data", bundleExtra);
                }
                e1t = new E1T();
            }
            e1t.setArguments(A05);
            A3C(e1t);
            overridePendingTransition(2130772065, 2130772071);
            return;
        }
        throw AnonymousClass001.A0L("Tried to launch details activity with unrecognized surface");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772064, 2130772072);
    }
}
