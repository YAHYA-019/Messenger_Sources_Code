package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.credentials.BrowserToNativeSSOCredentials;
import com.facebook.auth.credentials.NonceCredentials;
import java.util.HashMap;

/* loaded from: B2l.class */
public abstract class B2l extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginCredentialsSSOBaseFragment";
    public COx A04;
    public COx A05;
    public final C00i A09 = AbF.A0S(this, 17037);
    public final C00i A0A = 1BV.A00(84018);
    public final C00i A0B = 1BV.A00(32993);
    public final C00i A08 = 1BQ.A01();
    public final C00i A07 = AbI.A0N();
    public String A00 = "";
    public String A01 = "";
    public String A03 = "";
    public String A02 = "";
    public String A06 = "";
    public final BPY A0C = new B37(this, 3);

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        String A00 = 1BJ.A00(336);
        BPY bpy = this.A0C;
        COx cOx = new COx(this, ((AlJ) this).A00, (C00) null, bpy, A00, "auth_browser_to_native_sso_operation", "nativeSSO", true);
        COx.A02(cOx);
        this.A04 = cOx;
        COx cOx2 = new COx(this, ((AlJ) this).A00, (C00) null, bpy, 1BJ.A00(337), "auth_nonce_operation", "nonceCredentials", true);
        COx.A02(cOx2);
        this.A05 = cOx2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String A1e(String str) {
        Intent intent;
        String stringExtra;
        String queryParameter;
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.hasExtra("is_msite_sso_uri") && (stringExtra = intent.getStringExtra("is_msite_sso_uri")) != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(stringExtra);
            } catch (SecurityException unused) {
            }
            if (uri != null && (queryParameter = uri.getQueryParameter(str)) != null) {
                return queryParameter;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1f() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        activity.getIntent().setData(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1g() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (((4DK) this.A0B.get()).A05(intent)) {
                intent.getData().getClass();
                if (!TextUtils.isEmpty(r0.getQueryParameter("nonce"))) {
                    COx cOx = this.A05;
                    String queryParameter = intent.getData().getQueryParameter("nonce");
                    String queryParameter2 = intent.getData().getQueryParameter(ErrorReportingConstants.USER_ID_KEY);
                    A1f();
                    C3T0 c3t0 = (C3T0) this.A0A.get();
                    HashMap A0u = AnonymousClass001.A0u();
                    A0u.put(ErrorReportingConstants.USER_ID_KEY, queryParameter2);
                    C3T0.A01(c3t0, "nonce_login_attempt", A0u);
                    CQH.A03(this, BMG.A0s, (CQH) this.A07.get());
                    cOx.A04(new NonceCredentials(Qpm.A02, queryParameter2, queryParameter), "action_auth_with_msite_nonce", 2131952189);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1h() {
        Intent intent;
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null || intent.getData() == null) {
            return;
        }
        C00i c00i = this.A0B;
        if (((4DK) c00i.get()).A04(intent)) {
            String BD0 = 1BK.A0R(((4DK) c00i.get()).A01).BD0(2W0.A09);
            String A03 = ((4DK) c00i.get()).A03();
            String queryParameter = intent.getData().getQueryParameter("token");
            String queryParameter2 = intent.getData().getQueryParameter("blob");
            A1f();
            if (TextUtils.isEmpty(A03) || TextUtils.isEmpty(queryParameter) || !A03.equals(queryParameter)) {
                return;
            }
            COx cOx = this.A04;
            C3T0.A01((C3T0) this.A0A.get(), "native_sso_login_attempt", null);
            CQH.A03(this, BMG.A0r, (CQH) this.A07.get());
            cOx.A04(new BrowserToNativeSSOCredentials(Qph.A01, BD0, queryParameter2), "action_auth_with_browser_to_native_sso", 2131952189);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1i(BMG bmg) {
        Context context = getContext();
        if (context != null) {
            this.A01 = A1e("entry_point");
            String A1e = A1e("vcuid");
            this.A03 = A1e;
            if ("page_message_button".equals(this.A01) && 1JF.A0B(A1e)) {
                return;
            }
            this.A02 = bmg == BMG.A0z ? "fb4a_sso_screen_" : "login_form_screen_";
            this.A00 = A1e("browser_name");
            this.A06 = A1e("mb");
            C00i c00i = this.A07;
            CQH.A03(this, BMG.A0y, (CQH) c00i.get());
            CQH.A03(this, BMG.A11, (CQH) c00i.get());
            CQH.A03(this, bmg, (CQH) c00i.get());
            ((2Vz) this.A09.get()).A05(context, 0S2.A00, this.A00, this.A06, true, false);
        }
    }
}
