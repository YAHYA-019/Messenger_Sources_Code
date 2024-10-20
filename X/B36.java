package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.protocol.ApiErrorResult;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: B36.class */
public class B36 extends C00 {
    public final DIO A00;
    public final Context A01;

    public B36(Context context, DIO dio) {
        super(context);
        this.A01 = context;
        this.A00 = dio;
    }

    @Override // X.C00
    public boolean A00(ServiceException serviceException, int i) {
        ApiErrorResult A0H;
        String str;
        DIO dio;
        DIO dio2;
        String A04;
        String str2 = null;
        if (i == 406) {
            ApiErrorResult A0H2 = AbI.A0H(serviceException);
            if (A0H2 == null) {
                return false;
            }
            LoginErrorData A01 = LoginErrorData.A01(A0H2.A02());
            ((C2R) 1Bn.A0A(85275)).A00(A01);
            DIO dio3 = this.A00;
            if (dio3 == null) {
                return false;
            }
            String str3 = A0H2.mJsonResponse;
            boolean z = false;
            if (str3 != null) {
                try {
                    z = new JSONObject(str3).getJSONObject("error").getBoolean("error_should_update_two_factor_content");
                } catch (JSONException unused) {
                }
                if (z) {
                    str2 = A0H2.mErrorUserTitle;
                    A04 = A0H2.A04();
                    return dio3.CS6(A01, str2, A04, z);
                }
            }
            A04 = A0H2.A03();
            return dio3.CS6(A01, str2, A04, z);
        }
        if (i == 400) {
            ApiErrorResult A0H3 = AbI.A0H(serviceException);
            if (A0H3 == null || (dio2 = this.A00) == null) {
                return false;
            }
            return dio2.C51(A0H3.A03());
        }
        if (i == 401) {
            ApiErrorResult A0H4 = AbI.A0H(serviceException);
            if (A0H4 == null || (dio = this.A00) == null) {
                return false;
            }
            return dio.CAt(LoginErrorData.A01(A0H4.A02()), A0H4.A03());
        }
        if (i == 405) {
            ApiErrorResult A0H5 = AbI.A0H(serviceException);
            if (A0H5 == null) {
                return false;
            }
            try {
                24X A0I = ((AnonymousClass244) 1Bn.A0A(68334)).A0I(A0H5.A02());
                String A0P = C3o5.A0P(A0I, "url", "");
                String A0P2 = C3o5.A0P(A0I, "flow_id", "");
                if (TextUtils.isEmpty(A0P) || TextUtils.isEmpty(A0P2)) {
                    return false;
                }
                1Bn.A0A(147859);
                1Bn.A0A(84008);
                CAB.A00(this.A01, new Rpv(A0H5, this, A0P, A0P2), (String) null, (String) null, (String) null).show();
                return true;
            } catch (IOException e) {
                e = e;
                str = "failed to parse checkpoint error";
            }
        } else {
            if (i != 368 || (A0H = AbI.A0H(serviceException)) == null) {
                return false;
            }
            try {
                24X A0I2 = ((AnonymousClass244) 1Bn.A0A(68334)).A0I(A0H.A02());
                String A0P3 = C3o5.A0P(A0I2, "url", "");
                String A0P4 = C3o5.A0P(A0I2, "flow_id", "");
                String A0P5 = C3o5.A0P(A0I2, "error_title_string", null);
                String A0P6 = C3o5.A0P(A0I2, "error_message_string", null);
                String A0P7 = C3o5.A0P(A0I2, "error_button_string", null);
                if (TextUtils.isEmpty(A0P3) || !A0P4.equals("pre_authentication")) {
                    return false;
                }
                1Bn.A0A(147859);
                1Bn.A0A(84008);
                CAB.A00(this.A01, new Rpw(A0H, this, A0P3, A0P4), A0P5, A0P6, A0P7).show();
                return true;
            } catch (IOException e2) {
                e = e2;
                str = "failed to parse sentry block error";
            }
        }
        0fH.A0r("AuthErrorHandler", str, e);
        return false;
    }
}
