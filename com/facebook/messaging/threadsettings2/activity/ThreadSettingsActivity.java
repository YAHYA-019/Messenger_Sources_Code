package com.facebook.messaging.threadsettings2.activity;

import X.0Q8;
import X.11T;
import X.1Bi;
import X.1iF;
import X.1lN;
import X.1pH;
import X.2M3;
import X.2Or;
import X.5oO;
import X.7zK;
import X.AbF;
import X.AbH;
import X.AbL;
import X.BBc;
import X.C01i;
import X.CfA;
import X.CfB;
import X.Cuo;
import X.DCz;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.threadsettings2.params.ThreadSettingsParams;

/* loaded from: ThreadSettingsActivity.class */
public final class ThreadSettingsActivity extends FbFragmentActivity implements 1lN {
    public 1pH A00;
    public final 2M3 A02 = new CfB(this, 6);
    public final C01i A01 = DCz.A00(this, 30);

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.A2b(fragment);
        2Or.A00(fragment, this.A02);
        if (fragment instanceof BBc) {
            BBc bBc = (BBc) fragment;
            bBc.A01 = new Cuo(this);
            BBc.A03(bBc);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(2139908416177407L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A06();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        ((5oO) 1Bi.A03(68467)).A09(this);
        AbL.A0l(this);
        View AUH = this.A02.AUH();
        11T.A0I(AUH, 7zK.A00(0));
        1pH A02 = 1pH.A02((ViewGroup) AUH, BDe(), new CfA(this, 9), false);
        this.A00 = A02;
        if (bundle == null) {
            int i = BBc.A09;
            ThreadSettingsParams threadSettingsParams = (ThreadSettingsParams) this.A01.getValue();
            11T.A0F(threadSettingsParams, 0);
            BBc bBc = new BBc();
            bBc.setArguments(AbH.A05(threadSettingsParams, "params"));
            A02.Czy(bBc, "thread_settings");
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    public String AWg() {
        C01i c01i = this.A01;
        return ((ThreadSettingsParams) c01i.getValue()).A01.A1A() ? "community_messenger_thread_settings" : ((ThreadSettingsParams) c01i.getValue()).A01.A1E() ? "community_settings" : "messenger_thread_settings";
    }

    public Long Am7() {
        return 2139908416177407L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A00;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A07();
    }
}
