package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.messengerprefs.advancedcrypto.securityalerts.SecurityAlertsActivity;

/* loaded from: B96.class */
public final class B96 extends BJB {
    public static final String __redex_internal_original_name = "SecurityAlertsManagementFragment";
    public FbUserSession A00;
    public 1GU A01;
    public C5dO A02;
    public 20U A03;
    public boolean A04;
    public boolean A05;
    public boolean A07;
    public String A06 = "";
    public final CmE A08 = new CmE(this);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 7zT.A08(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a() {
        C5x2.A00(SecurityAlertsActivity.A01, null, this.A06, 4);
        20U r0 = this.A03;
        if (r0 == null) {
            11T.A0L("privacyGating");
            throw 0Q8.createAndThrow();
        }
        if (r0.A03() || this.A07) {
            this.mFragmentManager.A0w();
        } else {
            7zR.A14(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r307 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            r301 = this;
            r0 = -1164687108(0xffffffffba9448fc, float:-0.0011313255)
            r305 = r0
            r0 = r302
            r1 = r305
            int r0 = X.7zQ.A04(r0, r1)
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L1d
            r0 = r304
            java.lang.String r1 = "SecurityAlertsLoggerFlowId"
            java.lang.String r0 = r0.getString(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L22
        L1d:
            java.lang.String r0 = X.7zR.A0s()
            r307 = r0
        L22:
            r0 = r301
            r1 = r307
            r0.A06 = r1
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L58
            java.lang.String r0 = "popBackStackOnClose"
            r307 = r0
            r0 = r308
            r1 = r307
            boolean r0 = r0.getBoolean(r1)
            r305 = r0
        L40:
            r0 = r301
            r1 = r305
            r0.A07 = r1
            r0 = r302
            r1 = r303
            r2 = r301
            com.facebook.litho.LithoView r0 = X.7zU.A0J(r0, r1, r2)
            r308 = r0
            r0 = 121446289(0x73d1f91, float:1.4228056E-34)
            r1 = r306
            X.0FI.A08(r0, r1)
            r0 = r308
            return r0
        L58:
            r0 = 0
            r305 = r0
            r0 = 0
            r307 = r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B96.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-1825866328);
        super/*androidx.fragment.app.Fragment*/.onStart();
        this.A02 = (C5dO) 1Bn.A0E(requireContext(), (1BY) null, 116343);
        this.A01 = 7zQ.A0Q();
        this.A03 = (20U) 1Bn.A0A(66576);
        C5dO c5dO = this.A02;
        if (c5dO != null) {
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                CmE cmE = this.A08;
                c5dO.A01(fbUserSession, cmE);
                C5dO c5dO2 = this.A02;
                if (c5dO2 != null) {
                    FbUserSession fbUserSession2 = this.A00;
                    if (fbUserSession2 != null) {
                        ((1xC) 4YU.A0o(fbUserSession2, c5dO2.A01, 33148)).A02(Czg.A00(cmE, c5dO2, fbUserSession2, 20), "should_present_security_alert", 7zP.A1X(cmE));
                        A1c();
                        0FI.A08(197670357, A02);
                        return;
                    }
                }
            }
            11T.A0L("fbUserSession");
            throw 0Q8.createAndThrow();
        }
        11T.A0L("controller");
        throw 0Q8.createAndThrow();
    }
}
