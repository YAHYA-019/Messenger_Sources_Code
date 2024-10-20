package com.facebook.zero.messenger.free;

import X.04J;
import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1UG;
import X.1tJ;
import X.2BQ;
import X.2BX;
import X.2Bc;
import X.4YV;
import X.7zM;
import X.AbG;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.C2yk;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKF;
import X.DKH;
import X.DR5;
import X.FHW;
import X.FXq;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: AutoMessengerNuxActivity.class */
public final class AutoMessengerNuxActivity extends FbFragmentActivity {
    public TextView A00;
    public final 1Br A02 = 7zM.A0f(this);
    public final 1Br A04 = 1Bu.A00(33101);
    public final 2BQ A06 = DKE.A0h();
    public final 04J A01 = 4YV.A0B();
    public final QuickPerformanceLogger A05 = DKE.A0d();
    public final AtomicInteger A07 = DKD.A14();
    public final 1Br A03 = AbG.A0M();
    public final DR5 A08 = new DR5(this, 1);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        this.A05.markerEnd(238947189, (short) 2);
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        int i;
        String str;
        super.A2y(bundle);
        setContentView(2132541552);
        ImageView imageView = (ImageView) A2c(2131362189);
        int i2 = 2132346721;
        if (FHW.A04(this)) {
            i2 = 2132346722;
        }
        imageView.setImageResource(i2);
        View A2c = A2c(2131362188);
        C00i c00i = this.A02.A00;
        A2c.setBackgroundColor(7zM.A11(c00i).BDl());
        TextView A0J = DKC.A0J(this, 2131362187);
        this.A00 = A0J;
        if (A0J != null) {
            FXq.A01(A0J, this, ActionId.BEGIN_START_ACTIVITY);
        }
        TextView A0J2 = DKC.A0J(this, 2131362190);
        if (A0J2 != null) {
            DKF.A12(this, A0J2, 2131953024);
            AbH.A1M(A0J2, 7zM.A11(c00i));
        }
        TextView A0J3 = DKC.A0J(this, 2131362180);
        if (A0J3 != null) {
            DKH.A0v(this, A0J3, FHW.A00((2BX) 1Br.A0B(this.A04)), 2131953021);
            DKH.A1A(A0J3, c00i);
        }
        TextView A0J4 = DKC.A0J(this, 2131362183);
        2BQ r0 = this.A06;
        if (r0.A04("semi_auto_messenger_nux_content")) {
            if (A0J4 != null) {
                i = 2131965666;
                DKF.A12(this, A0J4, i);
                DKH.A1A(A0J4, c00i);
            }
        } else if (A0J4 != null) {
            i = 2131953022;
            DKF.A12(this, A0J4, i);
            DKH.A1A(A0J4, c00i);
        }
        TextView A0J5 = DKC.A0J(this, 2131362186);
        if (A0J5 != null) {
            DKF.A12(this, A0J5, 2131953023);
            DKH.A1A(A0J5, c00i);
        }
        r0.A01(2Bc.A01(getIntent().getStringExtra("nux_feature")));
        04J r02 = this.A01;
        if (r02 == null) {
            throw 1BK.A0h();
        }
        1UG A08 = 1BK.A08(r02, "iorg_core_flow_messenger_nux");
        if (A08.isSampled()) {
            2BX r03 = (2BX) 1Br.A0B(this.A04);
            A08.A7R("carrier_id", r03.A08(2BX.A02(r03)));
            try {
                str = 11T.A02(AnonymousClass001.A12().put("product", "auto_messenger"));
            } catch (JSONException unused) {
                str = "";
            }
            A08.A7R("extra", str);
            A08.BZL();
        }
        String stringExtra = getIntent().getStringExtra("extra_feature_qpl_instance_key");
        if (stringExtra != null) {
            try {
                this.A07.set(Integer.parseInt(stringExtra));
            } catch (NumberFormatException e) {
                1Br.A04(this.A03).softReport("ZeroMessengerOptinActivity", "instance key can't be resolved", e);
                this.A05.markerEnd(238951010, (short) 3);
            }
            this.A05.markerPoint(238951010, this.A07.get(), "start_nux_activity");
        }
        B03().A06(this.A08, this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        setTheme(2132608263);
        Window window = getWindow();
        if (window != null) {
            C00i c00i = this.A02.A00;
            C2yk.A00(window, 7zM.A11(c00i).BDl());
            1tJ.A06(window, 7zM.A11(c00i).BDl());
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-482955661);
        super.onResume();
        this.A05.markerPoint(238951010, this.A07.get(), "nux_is_interactable");
        0FI.A07(1937088488, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(926090456);
        super.onStart();
        this.A05.markerPoint(238951010, this.A07.get(), "nux_is_shown");
        0FI.A07(1899787759, A00);
    }
}
