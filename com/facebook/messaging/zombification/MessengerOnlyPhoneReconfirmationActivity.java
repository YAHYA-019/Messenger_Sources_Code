package com.facebook.messaging.zombification;

import X.0FI;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1iF;
import X.20O;
import X.4YU;
import X.AbJ;
import X.AbK;
import X.C1io;
import X.CIZ;
import X.DZD;
import X.Erg;
import X.F8h;
import X.FAE;
import X.Fat;
import X.InterfaceC03743yx;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.fragment.DefaultNavigableFragmentController;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Map;

/* loaded from: MessengerOnlyPhoneReconfirmationActivity.class */
public class MessengerOnlyPhoneReconfirmationActivity extends FbFragmentActivity implements C1io, InterfaceC03743yx {
    public 20O A00;
    public DefaultNavigableFragmentController A01;
    public FAE A02;
    public CIZ A03;
    public FbSharedPreferences A04;
    public boolean A05;

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof DZD) {
            ((DZD) fragment).A01 = new Fat(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbK.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = (FAE) 1Bn.A0A(100132);
        this.A03 = (CIZ) 1Bi.A03(84886);
        this.A00 = (20O) 1Bn.A0E(this, (1BY) null, 33180);
        this.A04 = AbJ.A0i();
        if (bundle != null) {
            this.A05 = bundle.getBoolean("is_initialized", false);
        }
        setContentView(2132543095);
        this.A01 = (DefaultNavigableFragmentController) BDe().A0Y(2131366434);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.A01.A1X()) {
            getWindow().setSoftInputMode(2);
        } else {
            ((Erg) 4YU.A0m(99364)).A00(this);
            this.A05 = false;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_initialized", this.A05);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-274634782);
        super.onStart();
        if (!this.A05) {
            FAE.A00(4YU.A0H("phone_reconfirmation_launched_event"), this.A02, (String) null, (Map) null);
            F8h f8h = new F8h(PhoneReconfirmationForkFragment.class);
            f8h.A02(2130772018, 2130772020, 2130772018, 2130772020);
            Intent intent = f8h.A00;
            intent.putExtra("com.facebook.fragment.CLEAR_BACK_STACK", true);
            DZD.A06(intent, this.A01, (NavigableFragment) null);
            this.A05 = true;
        }
        0FI.A07(1763855684, A00);
    }
}
