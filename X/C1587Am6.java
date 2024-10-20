package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.rtc.incall.impl.widgets.CallStatusView;
import com.facebook.messaging.rtc.safetywarning.SafetyWarningInterstitialDialogFragment;
import com.facebook.messaging.rtc.safetywarning.SafetyWarningInterstitialViewState;

/* renamed from: X.Am6, reason: case insensitive filesystem */
/* loaded from: Am6.class */
public final class C1587Am6 extends 1pK implements JFq {
    public static final String __redex_internal_original_name = "SafetyWarningInterstitialFragment";
    public SafetyWarningInterstitialDialogFragment A00;
    public final C01i A01 = C01g.A01(new AQV(this, 8));

    public 1iF A1R() {
        return AbF.A0C(3461599647265142L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        Parcelable parcelable = (SafetyWarningInterstitialViewState) jdb;
        11T.A0F(parcelable, 0);
        if (this.mFragmentManager.A0b("SafetyWarningInterstitial") == null) {
            Bundle A05 = 1BK.A05();
            A05.putParcelable("safety_warning_interstitial_view_state", parcelable);
            0D2 safetyWarningInterstitialDialogFragment = new SafetyWarningInterstitialDialogFragment();
            safetyWarningInterstitialDialogFragment.setArguments(A05);
            this.A00 = safetyWarningInterstitialDialogFragment;
            safetyWarningInterstitialDialogFragment.A01 = new B7a(this);
            safetyWarningInterstitialDialogFragment.A0m(this.mFragmentManager, "SafetyWarningInterstitial");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-743914010);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543282, viewGroup, false);
        0FI.A08(15514087, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        Dialog dialog;
        int A02 = 0FI.A02(1206535999);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        B7g b7g = (B7g) this.A01.getValue();
        if (!b7g.A00) {
            b7g.A0d();
        }
        SafetyWarningInterstitialDialogFragment safetyWarningInterstitialDialogFragment = this.A00;
        if (safetyWarningInterstitialDialogFragment != null && (dialog = ((0D2) safetyWarningInterstitialDialogFragment).A01) != null) {
            dialog.dismiss();
        }
        0FI.A08(-774726268, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1223947837);
        super/*androidx.fragment.app.Fragment*/.onPause();
        AbI.A1X(this.A01);
        0FI.A08(1147230824, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1679914837);
        super/*androidx.fragment.app.Fragment*/.onResume();
        AbI.A1S(this, this.A01);
        0FI.A08(859374001, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        ((CallStatusView) 7zL.A0F(this, 2131362798)).Cup("");
    }
}
