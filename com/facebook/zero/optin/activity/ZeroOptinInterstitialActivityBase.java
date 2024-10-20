package com.facebook.zero.optin.activity;

import X.04J;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1JF;
import X.1QE;
import X.1UG;
import X.4YU;
import X.AbH;
import X.C00i;
import X.DMV;
import X.ED6;
import X.ED7;
import X.EY7;
import X.F8I;
import X.FG8;
import X.Fsv;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: ZeroOptinInterstitialActivityBase.class */
public abstract class ZeroOptinInterstitialActivityBase extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public final C00i A05 = 1BQ.A02(98478);
    public final C00i A03 = 1BQ.A01();
    public final C00i A04 = 1BQ.A02(84011);

    private void A12(Bundle bundle, FbUserSession fbUserSession, String str, String str2, String str3, String str4) {
        ((F8I) this.A05.get()).A01(this, fbUserSession, new Fsv(bundle, this, str3, str2), (1JF.A0C(str3, "dialtone://switch_to_dialtone") || 1JF.A0C(str3, "fb-messenger://dialtone/switch_to_dialtone")) ? 1QE.A01 : 1JF.A0C(str3, "dialtone://switch_to_full_fb") ? 1QE.A02 : null, str, str2, str4);
    }

    public static void A15(TextView textView, String str) {
        int i;
        if (1JF.A0B(str)) {
            i = 8;
        } else {
            if (str == null) {
                str = "";
            }
            Spanned fromHtml = Html.fromHtml(str);
            textView.setText(fromHtml);
            textView.setContentDescription(fromHtml);
            i = 0;
        }
        textView.setVisibility(i);
    }

    public static void A16(FbUserSession fbUserSession, ZeroOptinInterstitialActivityBase zeroOptinInterstitialActivityBase) {
        fbUserSession.getClass();
        zeroOptinInterstitialActivityBase.A3K(fbUserSession, null);
    }

    private CallerContext A3B() {
        return this instanceof ZeroFlexOptinReconsiderActivity ? ZeroFlexOptinReconsiderActivity.A05 : this instanceof ZeroFlexOptinInterstitialRedesignActivity ? ZeroFlexOptinInterstitialRedesignActivity.A04 : this instanceof LightswitchOptinInterstitialActivityNew ? LightswitchOptinInterstitialActivityNew.A0A : DialtoneOptinInterstitialActivityNew.A0D;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = AbH.A0S();
        this.A00 = AbH.A0K();
        this.A02 = AbH.A0N();
    }

    public FG8 A3C() {
        if (this instanceof ZeroFlexOptinReconsiderActivity) {
            ZeroFlexOptinReconsiderActivity zeroFlexOptinReconsiderActivity = (ZeroFlexOptinReconsiderActivity) this;
            return ED6.A00(zeroFlexOptinReconsiderActivity, (FbSharedPreferences) 4YU.A0p(zeroFlexOptinReconsiderActivity.A00));
        }
        if (!(this instanceof ZeroFlexOptinInterstitialRedesignActivity)) {
            return this instanceof LightswitchOptinInterstitialActivityNew ? ((LightswitchOptinInterstitialActivityNew) this).A04 : ((DialtoneOptinInterstitialActivityNew) this).A04;
        }
        ZeroFlexOptinInterstitialRedesignActivity zeroFlexOptinInterstitialRedesignActivity = (ZeroFlexOptinInterstitialRedesignActivity) this;
        return ED6.A00(zeroFlexOptinInterstitialRedesignActivity, (FbSharedPreferences) 4YU.A0p(zeroFlexOptinInterstitialRedesignActivity.A00));
    }

    public String A3D() {
        Intent intent = getIntent();
        if (intent.getStringExtra("location") != null) {
            return intent.getStringExtra("location");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A3E() {
        FbUserSession fbUserSession;
        DialtoneOptinInterstitialActivityNew dialtoneOptinInterstitialActivityNew;
        if (this instanceof ZeroFlexOptinReconsiderActivity) {
            ((ZeroFlexOptinReconsiderActivity) this).CDr();
            return;
        }
        if (this instanceof ZeroFlexOptinInterstitialRedesignActivity) {
            ((ZeroFlexOptinInterstitialRedesignActivity) this).CDr();
            return;
        }
        if (this instanceof LightswitchOptinInterstitialActivityNew) {
            LightswitchOptinInterstitialActivityNew lightswitchOptinInterstitialActivityNew = (LightswitchOptinInterstitialActivityNew) this;
            LightswitchOptinInterstitialActivityNew.A12(lightswitchOptinInterstitialActivityNew);
            fbUserSession = lightswitchOptinInterstitialActivityNew.A02;
            dialtoneOptinInterstitialActivityNew = lightswitchOptinInterstitialActivityNew;
        } else {
            DialtoneOptinInterstitialActivityNew dialtoneOptinInterstitialActivityNew2 = (DialtoneOptinInterstitialActivityNew) this;
            DialtoneOptinInterstitialActivityNew.A12(dialtoneOptinInterstitialActivityNew2);
            fbUserSession = dialtoneOptinInterstitialActivityNew2.A02;
            dialtoneOptinInterstitialActivityNew = dialtoneOptinInterstitialActivityNew2;
        }
        fbUserSession.getClass();
        dialtoneOptinInterstitialActivityNew.A3J(fbUserSession, null);
    }

    public void A3F() {
        DMV dmv;
        if (this instanceof ZeroFlexOptinReconsiderActivity) {
            ZeroFlexOptinReconsiderActivity.A12((ZeroFlexOptinReconsiderActivity) this);
            return;
        }
        if (this instanceof ZeroFlexOptinInterstitialRedesignActivity) {
            ZeroFlexOptinInterstitialRedesignActivity.A12((ZeroFlexOptinInterstitialRedesignActivity) this);
            return;
        }
        if (this instanceof LightswitchOptinInterstitialActivityNew) {
            LightswitchOptinInterstitialActivityNew lightswitchOptinInterstitialActivityNew = (LightswitchOptinInterstitialActivityNew) this;
            if (!lightswitchOptinInterstitialActivityNew.A04.A06) {
                LightswitchOptinInterstitialActivityNew.A12(lightswitchOptinInterstitialActivityNew);
                A16(lightswitchOptinInterstitialActivityNew.A02, lightswitchOptinInterstitialActivityNew);
                return;
            }
            dmv = lightswitchOptinInterstitialActivityNew.A03;
        } else {
            DialtoneOptinInterstitialActivityNew dialtoneOptinInterstitialActivityNew = (DialtoneOptinInterstitialActivityNew) this;
            if (!dialtoneOptinInterstitialActivityNew.A04.A09) {
                DialtoneOptinInterstitialActivityNew.A12(dialtoneOptinInterstitialActivityNew);
                A16(dialtoneOptinInterstitialActivityNew.A02, dialtoneOptinInterstitialActivityNew);
                return;
            }
            dmv = dialtoneOptinInterstitialActivityNew.A03;
        }
        dmv.show();
    }

    public void A3G() {
        super.onBackPressed();
    }

    public void A3H() {
        1UG A08 = 1BK.A08((04J) 4YU.A0p(this.A02), "optin_interstitial_back_pressed");
        if (A08.isSampled()) {
            A08.A7R("caller_context", A3B().toString());
            A08.BZL();
        }
    }

    public void A3I() {
        1UG A08 = 1BK.A08((04J) 4YU.A0p(this.A02), "iorg_optin_interstitial_shown");
        if (A08.isSampled()) {
            A08.A7R("caller_context", A3B().toString());
            A08.BZL();
        }
    }

    public void A3J(FbUserSession fbUserSession, String str) {
        String str2 = A3C().A05;
        Bundle A05 = 1BK.A05();
        A05.putString("ref", "dialtone_optin_screen");
        A12(A05, fbUserSession, ((this instanceof ZeroFlexOptinReconsiderActivity) || (this instanceof ZeroFlexOptinInterstitialRedesignActivity) || (this instanceof LightswitchOptinInterstitialActivityNew)) ? "free_facebook" : "dialtone", "in", str2, str);
    }

    public void A3K(FbUserSession fbUserSession, String str) {
        A3L(fbUserSession, A3C().A06, null);
    }

    public void A3L(FbUserSession fbUserSession, String str, String str2) {
        Bundle A05 = 1BK.A05();
        A05.putString("ref", "dialtone_optin_screen");
        A12(A05, fbUserSession, ((this instanceof ZeroFlexOptinReconsiderActivity) || (this instanceof ZeroFlexOptinInterstitialRedesignActivity) || (this instanceof LightswitchOptinInterstitialActivityNew)) ? "free_facebook" : "dialtone", "out", str, str2);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        A3H();
        ED7 A3C = A3C();
        String str = A3C instanceof ED7 ? A3C.A01 : ((FG8) A3C).A01;
        if (1JF.A0B(str)) {
            1BK.A09(this.A03).D0v("ZeroOptinInterstitialActivityBase", 0Pz.A0v("Encountered ", str == null ? "null" : "empty", " back_button_behavior string in ", A3B().A03));
            super.onBackPressed();
        }
        Integer A00 = EY7.A00(str);
        if (A00 != null) {
            if (A00 == 0S2.A00) {
                finish();
                return;
            }
            if (A00 == 0S2.A01) {
                return;
            }
            if (A00 == 0S2.A0C) {
                A3E();
                return;
            } else if (A00 == 0S2.A0N) {
                A3F();
                return;
            } else if (A00 != 0S2.A0Y) {
                0fH.A0o("ZeroOptinInterstitialActivityBase", "Encountered a totally unexpected ZeroOptinInterstitialActivityBase.BackButtonBehavior");
                return;
            }
        }
        super.onBackPressed();
    }
}
