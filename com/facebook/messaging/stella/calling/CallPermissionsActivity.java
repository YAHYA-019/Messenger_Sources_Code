package com.facebook.messaging.stella.calling;

import X.0EV;
import X.1BV;
import X.1Bi;
import X.1Fv;
import X.53T;
import X.7zL;
import X.C00i;
import X.C2xd;
import X.C5iw;
import X.IgF;
import X.JKS;
import X.JQw;
import X.L27;
import android.app.KeyguardManager;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.google.common.base.Objects;

/* loaded from: CallPermissionsActivity.class */
public class CallPermissionsActivity extends FbFragmentActivity {
    public static final String[] A06 = {"android.permission.RECORD_AUDIO"};
    public static final String[] A07 = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
    public C00i A00;
    public 53T A01;
    public boolean A02;
    public C00i A03;
    public final JKS A04;
    public final L27 A05;

    public CallPermissionsActivity() {
        Pair pair = L27.A02;
        0EV r0 = new 0EV();
        r0.A05(JQw.A00(260));
        r0.A04("MANAGE_CALLING");
        this.A05 = new L27(r0.A00());
        this.A04 = new IgF(this, 1);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A03 = 1BV.A00(306);
        this.A00 = 7zL.A0R(this, 82256);
        if (this.A05.A00(this, getIntent(), ((1Fv) 1Bi.A03(66351)).A04()) == L27.A02) {
            if (Objects.equal(((1Fv) 1Bi.A03(66351)).A05(this).A02, getIntent().getStringExtra("user_id"))) {
                this.A01 = ((C2xd) this.A03.get()).A0M(this);
                this.A02 = getIntent().getBooleanExtra("allow_video_call", false);
                KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
                if (keyguardManager != null && keyguardManager.isDeviceLocked()) {
                    setShowWhenLocked(true);
                    keyguardManager.requestDismissKeyguard(this, null);
                }
                C5iw c5iw = new C5iw();
                c5iw.A00 = 1;
                c5iw.A06 = true;
                this.A01.AHQ(new RequestPermissionsConfig(c5iw), this.A04, this.A02 ? A07 : A06);
                return;
            }
        }
        finish();
    }
}
