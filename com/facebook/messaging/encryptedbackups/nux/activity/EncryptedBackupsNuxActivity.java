package com.facebook.messaging.encryptedbackups.nux.activity;

import X.03Y;
import X.0PK;
import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.1Lm;
import X.1iF;
import X.4YV;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zS;
import X.8Kx;
import X.9IS;
import X.9rD;
import X.AQv;
import X.AnonymousClass001;
import X.C01i;
import X.C03i;
import X.C95d;
import X.C97j;
import X.C9m7;
import X.C9up;
import X.DKy;
import X.DZD;
import X.F8h;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.fragment.DefaultNavigableFragmentController;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbSetupSettingRecoveryCodeFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.NuxLoadingFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import java.util.Map;

/* loaded from: EncryptedBackupsNuxActivity.class */
public final class EncryptedBackupsNuxActivity extends FbFragmentActivity {
    public static final Map A06 = 7zS.A14(C95d.A02, C97j.A0H, 1BK.A1G(C95d.A04, C97j.A0i), 1BK.A1G(C95d.A03, C97j.A0j));
    public DefaultNavigableFragmentController A00;
    public final 1Br A02;
    public final 1Br A04;
    public final C01i A05;
    public final 1Br A01 = 7zM.A0f(this);
    public final 1Br A03 = 7zM.A0Y();

    public EncryptedBackupsNuxActivity() {
        C01i A00 = AQv.A00(this, C03i.A02, 25);
        this.A05 = A00;
        this.A02 = 1Lm.A00(this, 7zM.A0I(A00), 68877);
        this.A04 = 1Lm.A00(this, 7zM.A0I(this.A05), 99445);
    }

    private final C95d A12() {
        String string;
        Bundle A0H = 7zO.A0H(this);
        if (A0H != null && (string = A0H.getString("initial_state")) != null) {
            for (C95d c95d : C95d.values()) {
                if (11T.A0O(c95d.name(), string)) {
                    return c95d;
                }
            }
        }
        throw AnonymousClass001.A0L("please create nux activity by getIntent, missing initial_state");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
        if (fragment instanceof DZD) {
            ((DZD) fragment).A01 = new 9rD(this);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return 7zR.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        03Y[] r304;
        8Kx A01;
        super.A2y(bundle);
        setContentView(2132541929);
        MigColorScheme.A00(A2c(2131363887), 7zQ.A0m(this.A01));
        ((DKy) 1Br.A0B(this.A04)).A01(this);
        Object A0Y = BDe().A0Y(2131363890);
        11T.A0I(A0Y, "null cannot be cast to non-null type com.facebook.base.fragment.DefaultNavigableFragmentController");
        this.A00 = (DefaultNavigableFragmentController) A0Y;
        if (bundle == null) {
            C95d A12 = A12();
            Bundle A0H = 7zO.A0H(this);
            boolean z = A0H != null ? A0H.getBoolean("is_from_deep_link") : false;
            Object obj = A06.get(A12);
            if (obj == null) {
                throw 1BK.A0h();
            }
            C97j c97j = (C97j) obj;
            String str = null;
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                str = extras.getString("entry_point_key");
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("from bundle value from Deeplink (");
            A0k.append(z);
            A0k.append("), entry point (");
            A0k.append(str);
            0fH.A0j("EncryptedBackupsNuxActivity", 4YV.A0x(A0k));
            DefaultNavigableFragmentController defaultNavigableFragmentController = this.A00;
            if (defaultNavigableFragmentController == null) {
                11T.A0L("fragmentController");
                throw 0Q8.createAndThrow();
            }
            9IS r0 = (9IS) 1Br.A0B(this.A02);
            if (c97j.ordinal() != 2) {
                r304 = 7zO.A1b("entry_point_key", str, 7zP.A0y("is_from_deep_link", z));
            } else {
                Bundle extras2 = getIntent().getExtras();
                Serializable serializable = extras2 != null ? extras2.getSerializable("is_generate_new_recovery_code_flow") : null;
                11T.A0I(serializable, 1BJ.A00(0));
                r304 = new 03Y[]{1BK.A1G("is_generate_new_recovery_code_flow", serializable), 7zP.A0y("is_from_deep_link", z), 1BK.A1G("entry_point_key", str)};
            }
            Bundle A00 = 0PK.A00(r304);
            C9m7 c9m7 = (C9m7) 1Br.A0B(r0.A00);
            String str2 = c97j.key;
            11T.A0F(str2, 0);
            if (str2.equals(C97j.A0i.key) || str2.equals(C97j.A0j.key)) {
                A01 = C9m7.A01(A00, c9m7, NuxLoadingFragment.class, str2);
                if (A01 == null) {
                    throw 1BK.A0h();
                }
            } else {
                if (!str2.equals(C97j.A0H.key)) {
                    throw AnonymousClass001.A0N(0Pz.A0W("Improper initial intent arguments: ", str2));
                }
                1Br.A0C(c9m7.A02);
                A01 = new 8Kx((Bundle) null, EbSetupSettingRecoveryCodeFragment.class, true, false);
            }
            Class cls = A01.A01;
            11T.A0F(cls, 0);
            Intent intent = new F8h(cls).A00;
            intent.putExtra("com.facebook.fragment.BUNDLE_EXTRAS", A00);
            DZD.A06(intent, defaultNavigableFragmentController, (NavigableFragment) null);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DefaultNavigableFragmentController defaultNavigableFragmentController = this.A00;
        if (defaultNavigableFragmentController == null) {
            11T.A0L("fragmentController");
            throw 0Q8.createAndThrow();
        }
        if (defaultNavigableFragmentController.A1X()) {
            return;
        }
        int ordinal = A12().ordinal();
        if (ordinal == 0) {
            7zR.A0X().A03();
        } else if (ordinal == 1) {
            C9up c9up = (C9up) 1Bi.A03(68799);
            if (c9up.A01) {
                if (c9up.A00.finishEventOnBackPressed) {
                    c9up.A07("EXIT_WITH_BACK_BUTTON");
                } else {
                    c9up.A05("EXIT_WITH_BACK_BUTTON");
                }
            }
        }
        super.onBackPressed();
    }
}
