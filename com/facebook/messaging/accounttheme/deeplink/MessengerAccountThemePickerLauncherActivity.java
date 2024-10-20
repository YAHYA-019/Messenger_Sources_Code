package com.facebook.messaging.accounttheme.deeplink;

import X.1FV;
import X.1Fw;
import X.1Kd;
import X.2FP;
import X.2JX;
import X.2Jf;
import X.77H;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zR;
import X.7zU;
import X.8GH;
import X.AC8;
import X.AQZ;
import X.C00i;
import X.C06c;
import X.C9a0;
import X.In5;
import android.R;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Executor;

/* loaded from: MessengerAccountThemePickerLauncherActivity.class */
public final class MessengerAccountThemePickerLauncherActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("extra_entry_point");
        Fragment fragment = new 8GH();
        C06c A0D = 7zU.A0D(this);
        A0D.A0L(fragment, R.id.content);
        A0D.A04();
        C9a0 c9a0 = new C9a0(this, fragment, BDe(), stringExtra, new AQZ(fragment, 7));
        FbUserSession A01 = 1Fw.A01(FbInjector.A00());
        Context context = c9a0.A00;
        77H r0 = new 77H(context, A01, false);
        1FV A0i = 7zO.A0i(A01, 1);
        AC8.A02(7zR.A0n(context, 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "NMEBrandedThreadsConfigInfoQuery", (String) null, "fbandroid", -917695948, 0, 2692045359L, 2692045359L, false, true))), A0i, 1);
        In5 in5 = new In5(r0, 2);
        C00i c00i = c9a0.A06.A00;
        1Kd.A0F(AC8.A00(c9a0, 35), 2FP.A00(in5, A0i, (Executor) c00i.get()), (Executor) c00i.get());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
