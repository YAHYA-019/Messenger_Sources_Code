package com.facebook.payments.p2p.messenger.common.contactselector;

import X.06Z;
import X.1BK;
import X.1pK;
import X.7zL;
import X.C06c;
import X.C1589Am8;
import X.C5fi;
import X.CZF;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: PaymentContactSelectorActivity.class */
public class PaymentContactSelectorActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132543027);
        PaymentContactSelectorConfiguration paymentContactSelectorConfiguration = (PaymentContactSelectorConfiguration) getIntent().getParcelableExtra("contact_selector_config");
        if (paymentContactSelectorConfiguration != null) {
            06Z BDe = BDe();
            C06c A0G = 7zL.A0G(BDe);
            String stringExtra = getIntent().getStringExtra("feature");
            Bundle bundleExtra = getIntent().getBundleExtra("extras_bundle");
            1pK c1589Am8 = new C1589Am8();
            Bundle A05 = 1BK.A05();
            A05.putString("feature", stringExtra);
            A05.putParcelable("contact_selector_config", paymentContactSelectorConfiguration);
            A05.putBundle("extras_bundle", bundleExtra);
            c1589Am8.setArguments(A05);
            A0G.A0L(c1589Am8, 2131366340);
            C06c.A00(A0G, true);
            BDe.A0t();
            Toolbar toolbar = (Toolbar) A2c(2131366338);
            toolbar.A0T(paymentContactSelectorConfiguration.A00);
            toolbar.A0Q(CZF.A00(this, 95));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C5fi.A00(this);
    }
}
