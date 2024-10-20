package com.facebook.nativetemplates.fb.shell.messenger;

import X.11T;
import X.7zO;
import X.7zU;
import X.C06c;
import X.DZR;
import X.FJ5;
import X.FXq;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: NativeTemplatesMessengerActivity.class */
public final class NativeTemplatesMessengerActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        super.A2x(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        setContentView(2132542811);
        View A2c = A2c(2131368112);
        11T.A0I(A2c, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        Toolbar toolbar = (Toolbar) A2c;
        Bundle A0H = 7zO.A0H(this);
        11T.A0D(A0H);
        String A01 = FJ5.A01(A0H.getString("title"));
        11T.A0A(A01);
        Bundle A0H2 = 7zO.A0H(this);
        11T.A0D(A0H2);
        if (A0H2.getBoolean("hide_title_bar")) {
            toolbar.setVisibility(8);
        } else {
            toolbar.A0T(A01);
            FXq.A02(toolbar, this, 3);
        }
        Fragment dzr = new DZR();
        dzr.setArguments(7zO.A0H(this));
        C06c A0D = 7zU.A0D(this);
        A0D.A0M(dzr, 2131366032);
        A0D.A04();
    }
}
