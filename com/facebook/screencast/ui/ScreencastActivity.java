package com.facebook.screencast.ui;

import X.1iF;
import X.7zU;
import X.AbL;
import X.C06c;
import X.Q4b;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: ScreencastActivity.class */
public class ScreencastActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(1);
        setContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        C06c A0D = 7zU.A0D(this);
        A0D.A0L(new Q4b(), 1);
        A0D.A04();
    }
}
