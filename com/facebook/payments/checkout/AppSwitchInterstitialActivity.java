package com.facebook.payments.checkout;

import X.0FI;
import X.1BK;
import X.1BQ;
import X.1Iw;
import X.1iF;
import X.7zL;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AnonymousClass001;
import X.AnonymousClass488;
import X.C00i;
import X.C0A2;
import X.C1rs;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DNS;
import X.ELS;
import X.FG0;
import X.FIQ;
import X.FXq;
import X.Fsa;
import X.QKg;
import X.RCa;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.payments.checkout.model.AppSwitchParams;
import com.facebook.payments.checkout.model.CheckoutAnalyticsParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.facebook.quicklog.PointEditor;
import java.util.Iterator;

/* loaded from: AppSwitchInterstitialActivity.class */
public class AppSwitchInterstitialActivity extends FbFragmentActivity {
    public int A00;
    public int A01;
    public Intent A02;
    public CountDownTimer A03;
    public AppSwitchParams A04;
    public boolean A05;
    public C00i A06;
    public LithoView A07;
    public CheckoutAnalyticsParams A08;
    public final C00i A0B = 1BQ.A02(99089);
    public final C00i A0A = 1BQ.A02(98533);
    public final C00i A09 = 1BQ.A01();

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1rs, X.Drd] */
    public static void A12(AppSwitchInterstitialActivity appSwitchInterstitialActivity, int i) {
        LithoView lithoView = appSwitchInterstitialActivity.A07;
        1Iw A0W = 7zL.A0W(appSwitchInterstitialActivity);
        QKg qKg = new QKg();
        ?? c1rs = new C1rs(qKg, A0W, 0, 0);
        c1rs.A01 = qKg;
        c1rs.A00 = A0W;
        AppSwitchParams appSwitchParams = appSwitchInterstitialActivity.A04;
        qKg.A00 = appSwitchParams.A01;
        qKg.A03 = appSwitchParams.A05;
        qKg.A05 = appSwitchParams.A09;
        qKg.A07 = appSwitchParams.A0B;
        boolean z = appSwitchInterstitialActivity.A05;
        qKg.A06 = z ? appSwitchParams.A0A : appSwitchParams.A0C;
        qKg.A09 = appSwitchParams.A0G;
        qKg.A02 = FXq.A00(appSwitchInterstitialActivity, 33);
        qKg.A08 = appSwitchParams.A0D;
        qKg.A01 = FXq.A00(appSwitchInterstitialActivity, 32);
        qKg.A0A = z;
        c1rs.A01.A04 = i >= 0 ? appSwitchParams.A08.replace("#num#", Integer.valueOf(i).toString()) : null;
        c1rs.A0J();
        lithoView.A0x(c1rs.A01);
    }

    public static void A15(AppSwitchInterstitialActivity appSwitchInterstitialActivity, boolean z) {
        CountDownTimer countDownTimer = appSwitchInterstitialActivity.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        boolean z2 = appSwitchInterstitialActivity.A05;
        AppSwitchParams appSwitchParams = appSwitchInterstitialActivity.A04;
        String str = z2 ? appSwitchParams.A07 : appSwitchParams.A0E;
        C00i c00i = appSwitchInterstitialActivity.A0B;
        DKF.A0Z(c00i).A0A(appSwitchInterstitialActivity.A08.A00, appSwitchInterstitialActivity.A05 ? z ? "auto" : "manual" : "install", "app_switch_type");
        FIQ A0Z = DKF.A0Z(c00i);
        PaymentsLoggingSessionData paymentsLoggingSessionData = appSwitchInterstitialActivity.A08.A00;
        PaymentsFlowStep paymentsFlowStep = PaymentsFlowStep.A0B;
        String str2 = "payflows_click";
        if (appSwitchInterstitialActivity.A05 && z) {
            str2 = "payflows_redirect";
        }
        A0Z.A07(paymentsFlowStep, paymentsLoggingSessionData, str2);
        ((FG0) appSwitchInterstitialActivity.A0A.get()).A07(appSwitchInterstitialActivity.A05 ? "app_switch_interstitial_redirect" : "app_switch_interstitial_install", Integer.valueOf(appSwitchInterstitialActivity.A01));
        if (str == null) {
            appSwitchInterstitialActivity.setResult(0);
        } else {
            Intent A05 = AbG.A05();
            A05.setData(DKH.A0A(appSwitchInterstitialActivity.A09, str));
            appSwitchInterstitialActivity.setResult(-1, A05);
        }
        appSwitchInterstitialActivity.finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKH.A0K();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A06 = AbH.A0S();
        AppSwitchParams appSwitchParams = (AppSwitchParams) getIntent().getParcelableExtra("app_switch_params");
        this.A04 = appSwitchParams;
        appSwitchParams.getClass();
        AppSwitchParams appSwitchParams2 = this.A04;
        this.A08 = appSwitchParams2.A02;
        this.A00 = appSwitchParams2.A00;
        Intent A05 = AbG.A05();
        boolean z = true;
        A05.setData(C0A2.A01(new AnonymousClass488(1BK.A09(this.A09), "SecureUriParser"), this.A04.A07));
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(A05, 65600).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ResolveInfo next = it.next();
            ActivityInfo activityInfo = next.activityInfo;
            if (activityInfo != null && ((ComponentInfo) activityInfo).applicationInfo != null && this.A04.A06.equals(((PackageItemInfo) activityInfo).packageName)) {
                Intent A052 = AbF.A05();
                this.A02 = A052;
                ActivityInfo activityInfo2 = next.activityInfo;
                DKD.A18(A052, ((PackageItemInfo) activityInfo2).packageName, ((PackageItemInfo) activityInfo2).name);
                this.A02.setAction(A05.getAction());
                if (A05.getCategories() != null) {
                    Iterator<String> it2 = A05.getCategories().iterator();
                    while (it2.hasNext()) {
                        this.A02.addCategory(AnonymousClass001.A0i(it2));
                    }
                }
                this.A02.setData(A05.getData());
                this.A02.setType(A05.getType());
                if (A05.getExtras() != null) {
                    this.A02.putExtras(A05.getExtras());
                }
            }
        }
        this.A05 = z;
        String str = this.A04.A0F;
        C00i c00i = this.A0B;
        DKF.A0Z(c00i).A0A(this.A08.A00, str, "payment_method_name");
        FIQ A0Z = DKF.A0Z(c00i);
        PaymentsLoggingSessionData paymentsLoggingSessionData = this.A08.A00;
        boolean z2 = this.A05;
        AppSwitchParams appSwitchParams3 = this.A04;
        A0Z.A0A(paymentsLoggingSessionData, z2 ? appSwitchParams3.A07 : appSwitchParams3.A0E, "app_switch_destination");
        DKF.A0Z(c00i).A06(bundle, PaymentsFlowStep.A0B, this.A08.A00, this.A04.A03);
        this.A01 = 1BK.A0R(this.A06).ArU(RCa.A00, 0);
        PointEditor A02 = ((FG0) this.A0A.get()).A02(Integer.valueOf(this.A01), "app_switch_interstitial_screen_displayed");
        if (A02 != null) {
            A02.addPointData("is_app_installed", this.A05).markerEditingCompleted();
        }
        this.A07 = 7zO.A0V(this);
        A12(this, this.A04.A00);
        setContentView(2132541509);
        ViewGroup viewGroup = (ViewGroup) A2c(2131362069);
        viewGroup.addView(this.A07);
        PaymentsTitleBarViewStub A0n = DKG.A0n(this);
        A0n.setVisibility(0);
        A0n.A01(viewGroup, ELS.A02, PaymentsTitleBarStyle.A05, new Fsa(this, 3));
        A0n.A03(PaymentsTitleBarTitleStyle.A03, this.A04.A04, 2132345429);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-764805129);
        super.onPause();
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
        }
        0FI.A07(-1023631029, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1689046271);
        super.onResume();
        if (this.A05) {
            this.A03 = new DNS(this, this.A00 * 1000).start();
        }
        0FI.A07(1696617461, A00);
    }
}
