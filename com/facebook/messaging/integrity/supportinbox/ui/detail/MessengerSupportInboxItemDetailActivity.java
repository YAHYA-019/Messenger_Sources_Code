package com.facebook.messaging.integrity.supportinbox.ui.detail;

import X.1BK;
import X.1Bi;
import X.AbK;
import X.AbL;
import X.B9A;
import X.C9U;
import android.os.Bundle;
import com.facebook.messaging.integrity.supportinbox.ui.MessengerSupportInboxBaseActivity;

/* loaded from: MessengerSupportInboxItemDetailActivity.class */
public class MessengerSupportInboxItemDetailActivity extends MessengerSupportInboxBaseActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        AbK.A1D(this, AbL.A08(this));
        String stringExtra = getIntent().getStringExtra("item_id");
        String stringExtra2 = getIntent().getStringExtra("screen_title");
        Bundle A05 = 1BK.A05();
        A05.putString("item_id", stringExtra);
        A05.putString("screen_title", stringExtra2);
        B9A b9a = new B9A();
        b9a.setArguments(A05);
        A3B(b9a);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((C9U) 1Bi.A03(81940)).A03("report_detail_closed");
        super.onBackPressed();
    }
}
