package com.facebook.messaging.stella.intents;

import X.0EV;
import X.1BL;
import X.C1oi;
import X.DKB;
import X.L27;
import X.LCl;
import X.LE7;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.List;

/* loaded from: OptInFlowActivity.class */
public class OptInFlowActivity extends FbFragmentActivity {
    public final L27 A00;

    public OptInFlowActivity() {
        List list = L27.A03;
        0EV r0 = new 0EV();
        r0.A05("com.facebook.orca.fbpermission.MANAGE_CONTACTS");
        r0.A04(DKB.A00(73));
        this.A00 = new L27(r0.A00());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        C1oi.A00(this, 1);
        if (this.A00.A00(this, getIntent(), 1BL.A0F()) != L27.A02) {
            finish();
            return;
        }
        setContentView(2132541481);
        NavHostFragment navHostFragment = (NavHostFragment) BDe().A0Y(2131365938);
        if (navHostFragment != null) {
            LE7 le7 = (LE7) navHostFragment.A03.getValue();
            LE7.A04(null, le7, ((LCl) le7.A0I.getValue()).A04(2131755008));
        }
    }
}
