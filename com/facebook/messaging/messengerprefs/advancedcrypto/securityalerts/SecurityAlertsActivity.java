package com.facebook.messaging.messengerprefs.advancedcrypto.securityalerts;

import X.11T;
import X.1Bn;
import X.1Br;
import X.1pK;
import X.20U;
import X.AbE;
import X.B96;
import X.B9C;
import X.C04I;
import X.C9bw;
import X.CmC;
import X.Grb;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;

/* loaded from: SecurityAlertsActivity.class */
public final class SecurityAlertsActivity extends MessengerSettingActivity {
    public static final PrivacyContext A01;
    public String A00 = "";

    static {
        PrivacyContext newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, "AdvancedCrypto");
        11T.A0A(newPrivacyContextWithTransportKeyNative);
        A01 = newPrivacyContextWithTransportKeyNative;
    }

    public static final void A12(1pK r301, SecurityAlertsActivity securityAlertsActivity, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(AbE.A00(342), securityAlertsActivity.A00);
        r301.setArguments(bundle);
        securityAlertsActivity.A3D(r301, z);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        if (fragment instanceof B9C) {
            B9C b9c = (B9C) fragment;
            b9c.A01 = new CmC(this);
            C9bw c9bw = new C9bw();
            c9bw.A01 = 2131963506;
            b9c.A04 = c9bw.A00();
        }
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        B9C b96;
        super.A2y(bundle);
        setTitle(2131963506);
        A3B();
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.A00 = obj;
        20U r0 = (20U) 1Bn.A0A(66576);
        if (r0.A03()) {
            b96 = new B9C();
        } else {
            if (!1Br.A07(r0.A00).AZk(36314176128884332L)) {
                A3C(new Grb());
                setRequestedOrientation(1);
            }
            b96 = new B96();
        }
        A12(b96, this, false);
        setRequestedOrientation(1);
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity
    public void A3C(1pK r302) {
        11T.A0F(r302, 0);
        A3D(r302, false);
    }

    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity
    public void A3D(1pK r302, boolean z) {
        11T.A0F(r302, 0);
        super.A3D(r302, z);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        11T.A0F(context, 0);
        super.attachBaseContext(context);
    }
}
