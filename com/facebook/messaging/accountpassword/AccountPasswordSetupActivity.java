package com.facebook.messaging.accountpassword;

import X.0Pz;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Hv;
import X.7zO;
import X.7zR;
import X.7zU;
import X.AlN;
import X.AnonymousClass001;
import X.Bbp;
import X.C06c;
import X.Cgx;
import X.DE5;
import X.F8q;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: AccountPasswordSetupActivity.class */
public class AccountPasswordSetupActivity extends FbFragmentActivity implements DE5 {
    public AlN A00;

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof AlN) {
            this.A00 = (AlN) fragment;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132541466);
        if (this.A00 == null) {
            String str = null;
            getIntent();
            if (7zO.A0H(this) != null) {
                str = 7zO.A0H(this).getString("funnel_start_action");
            }
            Bbp bbp = new Bbp(this);
            Cgx cgx = (Cgx) 1Bn.A0A(84885);
            cgx.A01 = "password_edit";
            cgx.A00 = bbp;
            cgx.A00();
            if (!AnonymousClass001.A1V(1Bn.A0A(83441))) {
                1BL.A0I().D0v("AccountPasswordSetupActivity", 0Pz.A0W("Non-Messenger Only accessed password flow from entrypoint: ", str));
                if (isFinishing()) {
                    return;
                }
                7zR.A1M((F8q) 1Hv.A02(this, 99435), 2131957317);
                finish();
                return;
            }
            AlN alN = new AlN();
            Bundle A05 = 1BK.A05();
            A05.putString("funnel_start_action", str);
            alN.setArguments(A05);
            this.A00 = alN;
            C06c A0D = 7zU.A0D(this);
            A0D.A0M(this.A00, 2131364228);
            C06c.A00(A0D, false);
        }
    }
}
