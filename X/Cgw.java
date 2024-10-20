package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.common.util.JSONUtil;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import com.facebook.messaging.phoneconfirmation.protocol.RegisterMessengerOnlyUserParams;
import com.facebook.messaging.phoneconfirmation.protocol.RegisterMessengerOnlyUserRegData;
import com.facebook.messaging.phoneconfirmation.protocol.RegisterMessengerOnlyUserResult;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgw.class */
public final class Cgw implements 1Ro {
    public static final String __redex_internal_original_name = "RegisterMessengerOnlyUserMethod";
    public final 5DO A05 = (5DO) 1Bn.A0A(85192);
    public final 1Oe A01 = (1Oe) 1Bi.A03(16617);
    public final C00i A04 = AbH.A0T();
    public final C00i A03 = FbInjector.A00;
    public final Kqg A02 = (Kqg) 1Bn.A0A(131243);
    public final EuM A00 = (EuM) 1Bn.A0A(100127);
    public final C15h A06 = DBe.A00(this, 89);

    public static void A00(24X r301, String str, String str2, List list) {
        24X A0C = r301.A0C(str);
        if (A0C != null) {
            list.add(new ApiErrorResult(C5om.API_EC_DOMAIN, JSONUtil.A0H(A0C.A0D(TraceFieldType.Error), ""), str2, null, null, null, null, null, JSONUtil.A02(A0C.A0D(TraceFieldType.ErrorCode), 0), 0, true));
        }
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RegisterMessengerOnlyUserParams registerMessengerOnlyUserParams = (RegisterMessengerOnlyUserParams) obj;
        registerMessengerOnlyUserParams.getClass();
        RegisterMessengerOnlyUserRegData registerMessengerOnlyUserRegData = registerMessengerOnlyUserParams.A00;
        registerMessengerOnlyUserRegData.getClass();
        3MN r0 = (3MN) this.A02.A00("register_messenger_only_user").get();
        ArrayList A0s = AnonymousClass001.A0s();
        String A0z = AbJ.A0z(this.A04);
        String A04 = this.A01.A04(C1fe.A2a);
        String str = r0.A03;
        int A03 = C0A8.A03(1BL.A0B(this.A03), 100.0f);
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("pic_size_px", Integer.toString(A03)));
        A0s.add(new BasicNameValuePair("device_id", A0z));
        if (!TextUtils.isEmpty(A04)) {
            A0z = A04;
        }
        A0s.add(new BasicNameValuePair("family_device_id", A0z));
        A0s.add(new BasicNameValuePair("secure_family_device_id", str));
        A0s.add(new BasicNameValuePair("phone_country", registerMessengerOnlyUserRegData.A04));
        A0s.add(new BasicNameValuePair("phone_number", registerMessengerOnlyUserRegData.A05));
        A0s.add(new BasicNameValuePair("first_name", registerMessengerOnlyUserRegData.A00));
        A0s.add(new BasicNameValuePair("last_name", registerMessengerOnlyUserRegData.A02));
        A0s.add(new BasicNameValuePair("password", registerMessengerOnlyUserRegData.A03));
        String str2 = registerMessengerOnlyUserRegData.A01;
        if (!TextUtils.isEmpty(str2)) {
            A0s.add(new BasicNameValuePair("instagram_access_token", str2));
        }
        String str3 = registerMessengerOnlyUserParams.A02;
        if (!TextUtils.isEmpty(str3)) {
            A0s.add(new BasicNameValuePair("entry_point", str3));
        }
        String str4 = registerMessengerOnlyUserParams.A01;
        if (!TextUtils.isEmpty(str4)) {
            A0s.add(new BasicNameValuePair("entered_code", str4));
        }
        if (registerMessengerOnlyUserParams.A03) {
            A0s.add(new BasicNameValuePair("skip_soft_match", "true"));
        }
        5DO r02 = this.A05;
        if (!TextUtils.isEmpty(r02.A00())) {
            A0s.add(new BasicNameValuePair("advertiser_id", r02.A00()));
        }
        1G1 A00 = 1Fw.A00();
        String str5 = A00.A02;
        if (!A00.A07) {
            A0s.add(new BasicNameValuePair("logged_in_uid", str5));
            InterfaceC09434q3 interfaceC09434q3 = (InterfaceC09434q3) 1Bi.A03(66417);
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = interfaceC09434q3.AVB().iterator();
            while (it.hasNext()) {
                String str6 = AbF.A0W(it).A0A;
                if (!str5.equals(str6)) {
                    A0s2.add(str6);
                }
            }
            if (!A0s2.isEmpty()) {
                A0s.add(new BasicNameValuePair("account_switcher_uids ", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0s2)));
            }
        }
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "registerMessengerOnlyUser");
        return AbN.A0F(c04083zw, "register_messenger_only_user", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        AuthenticationResultImpl authenticationResultImpl;
        int i;
        RegisterMessengerOnlyUserParams registerMessengerOnlyUserParams = (RegisterMessengerOnlyUserParams) obj;
        24X A0w = AbH.A0w(anonymousClass439);
        24X A0C = A0w.A0C("exception");
        if (A0C != null) {
            throw new 2L0(new ApiErrorResult(C5om.API_EC_DOMAIN, C3o5.A0P(A0C, TraceFieldType.Error, ""), null, null, null, null, null, null, JSONUtil.A02(A0C.A0D(TraceFieldType.ErrorCode), 0), 0, true));
        }
        24X A0C2 = A0w.A0C("reg_validation_errors");
        if (A0C2 != null) {
            24X A0C3 = A0w.A0C("conf_code");
            if (A0C3 != null) {
                throw new 2L0(new ApiErrorResult(C5om.API_EC_DOMAIN, C3o5.A0P(A0C3, TraceFieldType.Error, ""), null, null, null, null, null, null, JSONUtil.A02(A0C3.A0D(TraceFieldType.ErrorCode), 0), 0, true));
            }
            ArrayList A0s = AnonymousClass001.A0s();
            A00(A0C2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "nameValidationError", A0s);
            A00(A0C2, "password", "passwordValidationError", A0s);
            A00(A0C2, "contactpoint", "contactPointValidationError", A0s);
            if (!A0s.isEmpty()) {
                return new RegisterMessengerOnlyUserResult(registerMessengerOnlyUserParams, A0s);
            }
        }
        24X A0C4 = A0w.A0C("softmatch_results");
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (A0C4 != null && A0C4.A0R()) {
            Iterator it = A0C4.iterator();
            while (it.hasNext()) {
                24X r0 = (24X) it.next();
                if (r0 != null && !1JF.A0B(C3o5.A0P(r0, "encrypted_account_id", ""))) {
                    String A0P = C3o5.A0P(r0, "result_type", "");
                    if ("facebook".equals(A0P)) {
                        i = 0;
                    } else if ("messenger_only".equals(A0P)) {
                        i = 1;
                    }
                    A0s2.add(new RecoveredAccount(C3o5.A0P(r0, "encrypted_account_id", ""), C3o5.A0P(r0, "first_name", ""), C3o5.A0P(r0, "last_name", ""), C3o5.A0P(r0, "full_name", ""), C3o5.A0P(r0, "profile_pic_uri", ""), C3o5.A0P(r0, "email", C3o5.A0P(r0, "obfuscated_drive_email", "")), i, 4YU.A1Z(r0, "is_twofac_user")));
                }
            }
        }
        24X A0C5 = A0w.A0C("new_session_info");
        if (A0C5 != null) {
            authenticationResultImpl = this.A00.A00(A0C5, registerMessengerOnlyUserParams.A00.A05, AnonymousClass001.A0X(this), 1BL.A1a(this.A06));
        } else {
            authenticationResultImpl = null;
        }
        24X A0D = A0w.A0D("sent_conf_code");
        boolean z = false;
        if (A0D != null) {
            z = JSONUtil.A0J(A0D, false);
        }
        return new RegisterMessengerOnlyUserResult(authenticationResultImpl, registerMessengerOnlyUserParams, A0s2, z);
    }
}
