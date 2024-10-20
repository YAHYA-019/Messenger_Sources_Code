package com.facebook.messaging.authapplock;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1iF;
import X.AbF;
import X.AbstractC2326GOr;
import X.DKH;
import X.F7R;
import X.HQd;
import X.I0i;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: DeviceCredentialAuthActivity.class */
public final class DeviceCredentialAuthActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public HQd A01;
    public F7R A02;
    public boolean A03;
    public final 1Br A04 = 1Bq.A00(66345);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(796330954455679L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        String str;
        super.A2l();
        F7R f7r = this.A02;
        if (f7r == null) {
            str = "chatHeadsOpenActivityHelper";
        } else {
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                f7r.A00(this, fbUserSession);
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542724);
        this.A00 = DKH.A0H(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A02 = (F7R) 1Bn.A0A(99423);
        this.A01 = (HQd) 1Bn.A0E(this, (1BY) null, 116339);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1102) {
            AbstractC2326GOr.A1F(this.A04);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onRestoreInstanceState(bundle);
        this.A03 = bundle.getBoolean("DeviceCredentialLaunched");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1408615461);
        super.onResume();
        if (!this.A03) {
            HQd hQd = this.A01;
            if (hQd == null) {
                11T.A0L("authLockStringResolver");
                throw 0Q8.createAndThrow();
            }
            I0i.A00(this, hQd, 1102);
            this.A03 = true;
        }
        0FI.A07(-2047245719, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("DeviceCredentialLaunched", this.A03);
    }
}
