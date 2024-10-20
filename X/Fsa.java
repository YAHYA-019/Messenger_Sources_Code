package X;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.auth.settings.PaymentPinSettingsActivity;
import com.facebook.payments.checkout.AppSwitchInterstitialActivity;
import com.facebook.payments.checkout.activity.ShippingPickerActivity;
import com.facebook.payments.checkout.activity.TetraShippingOptionPickerActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.p2p.phases.PaymentPhaseActivity;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;

/* loaded from: Fsa.class */
public final class Fsa implements GGc {
    public final int A00;
    public final Object A01;

    public Fsa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ViewGroup viewGroup, PaymentsDecoratorParams paymentsDecoratorParams, PaymentsTitleBarViewStub paymentsTitleBarViewStub, Object obj, int i) {
        Fsa fsa = new Fsa(obj, i);
        paymentsTitleBarViewStub.A01(viewGroup, paymentsDecoratorParams.paymentsDecoratorAnimation.mTitleBarNavIconStyle, paymentsDecoratorParams.paymentsTitleBarStyle, fsa);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GGc
    public void onBackPressed() {
        Activity A1P;
        FbFragmentActivity fbFragmentActivity;
        switch (this.A00) {
            case 0:
                ((DZt) this.A01).Bkd();
                return;
            case 1:
                PaymentPinSettingsActivity paymentPinSettingsActivity = (PaymentPinSettingsActivity) this.A01;
                paymentPinSettingsActivity.setResult(0);
                paymentPinSettingsActivity.finish();
                return;
            case 2:
                A1P = ((1pK) this.A01).A1P();
                if (A1P != null) {
                    A1P.setResult(0);
                    A1P.finish();
                    return;
                }
                return;
            case 3:
                AppSwitchInterstitialActivity appSwitchInterstitialActivity = (AppSwitchInterstitialActivity) this.A01;
                ((FG0) appSwitchInterstitialActivity.A0A.get()).A07("app_switch_interstitial_back", Integer.valueOf(appSwitchInterstitialActivity.A01));
                fbFragmentActivity = appSwitchInterstitialActivity;
                fbFragmentActivity.onBackPressed();
                return;
            case 4:
                GI7 gi7 = ((Ex1) this.A01).A00;
                if (gi7 != null) {
                    gi7.BkY();
                    return;
                }
                return;
            case 5:
                ((ShippingPickerActivity) this.A01).onBackPressed();
                return;
            case 6:
                ((TetraShippingOptionPickerActivity) this.A01).onBackPressed();
                return;
            case 7:
                Ef0 ef0 = ((Eot) this.A01).A00;
                if (ef0 != null) {
                    ef0.A00.onBackPressed();
                    return;
                }
                return;
            case 8:
                fbFragmentActivity = (FbFragmentActivity) this.A01;
                fbFragmentActivity.onBackPressed();
                return;
            case 9:
            case 12:
            case 14:
            default:
                DKH.A07((Fragment) this.A01).onBackPressed();
                return;
            case 10:
                ((PaymentPhaseActivity) this.A01).onBackPressed();
                return;
            case 11:
                EfP efP = ((Eqi) this.A01).A02;
                if (efP != null) {
                    efP.A00.onBackPressed();
                    return;
                }
                return;
            case 13:
                EfZ efZ = ((F6L) this.A01).A00;
                if (efZ != null) {
                    efZ.A00.onBackPressed();
                    return;
                }
                return;
            case 15:
                Q4j q4j = (Q4j) this.A01;
                Q4j.A03(q4j, "payflows_cancel");
                q4j.A1P().setResult(0);
                A1P = q4j.A1P();
                A1P.finish();
                return;
        }
    }
}
