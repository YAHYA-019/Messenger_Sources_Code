package X;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;

/* loaded from: Faj.class */
public final class Faj implements GHU {
    public final /* synthetic */ AuthFragmentLogoViewGroup A00;

    public Faj(AuthFragmentLogoViewGroup authFragmentLogoViewGroup) {
        this.A00 = authFragmentLogoViewGroup;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.auth.login.ui.AuthFragmentLogoViewGroup, android.view.View] */
    private void A00() {
        ?? r0 = this.A00;
        LinearLayout linearLayout = (LinearLayout) r0.mLogoGroup;
        LinearLayout linearLayout2 = (LinearLayout) r0.mSplashGroup;
        DisplayMetrics A09 = DKD.A09((View) r0);
        boolean A1R = AnonymousClass001.A1R(A09.widthPixels, A09.heightPixels);
        linearLayout.setOrientation(A1R ? 1 : 0);
        linearLayout2.setOrientation(A1R ? 1 : 0);
    }

    public void onAttachedToWindow() {
        A00();
        AuthFragmentLogoViewGroup authFragmentLogoViewGroup = this.A00;
        if (authFragmentLogoViewGroup.getArguments() != null && authFragmentLogoViewGroup.getArguments().getString(AuthFragmentLogoViewGroup.HELP_URL) != null) {
            authFragmentLogoViewGroup.mHelpButton.setVisibility(0);
        }
        FXr.A03(authFragmentLogoViewGroup.mHelpButton, this, 6);
        authFragmentLogoViewGroup.getArguments().getClass();
        authFragmentLogoViewGroup.getArguments().getSerializable(AuthFragmentLogoViewGroup.SPLASH_TRANSITION);
        authFragmentLogoViewGroup.mLogo1View.setImageResource(authFragmentLogoViewGroup.mLogo1ResId);
        authFragmentLogoViewGroup.mLogo2View.setImageResource(authFragmentLogoViewGroup.mLogo2ResId);
        authFragmentLogoViewGroup.mSplashGroup.setVisibility(8);
        authFragmentLogoViewGroup.mRootGroup.setVisibility(0);
        authFragmentLogoViewGroup.mLogoGroup.setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        A00();
    }
}
