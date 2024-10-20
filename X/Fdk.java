package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.account.login.encryption.protocol.PasswordEncryptionKeyFetchMethod$Params;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.credentials.BrowserToNativeSSOCredentials;
import com.facebook.auth.credentials.DeviceBasedLoginCredentials;
import com.facebook.auth.credentials.OpenIDLoginCredentials;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.protocol.ConfirmedMessengerCredentials;
import com.facebook.auth.protocol.ConfirmedMessengerOnlyUserCredentials;
import com.facebook.auth.protocol.CreateMessengerAccountCredentials;
import com.facebook.auth.protocol.GetLoggedInUserGraphQLResult;
import com.facebook.auth.protocol.InstagramPasswordCredentials;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.openidconnect.model.OpenIDCredential;
import com.facebook.user.model.User;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Fdk.class */
public final class Fdk implements 1Tu {
    public final Context A00;
    public final Fck A01 = (Fck) 1Bi.A03(100221);
    public final FcZ A02 = (FcZ) 1Bi.A03(100100);
    public final C00i A03;

    public Fdk(Context context) {
        this.A00 = context;
        this.A03 = 7zL.A0R(context, 100223);
    }

    public static final Fdk A00(Object obj) {
        return new Fdk((Context) obj);
    }

    /* JADX WARN: Type inference failed for: r315v15, types: [com.facebook.auth.credentials.TwoFactorCredentials, com.facebook.auth.credentials.PasswordCredentials] */
    public OperationResult BMQ(1TC r302) {
        OpenIDLoginCredentials openIDLoginCredentials;
        String str;
        Parcelable A1G;
        OpenIDLoginCredentials openIDLoginCredentials2;
        String str2;
        String str3 = r302.A06;
        FbUserSession A0C = 4YV.A0C(this.A00);
        if (str3.equals("auth_reauth")) {
            A1G = this.A01.A1Q(r302.A00.getString("password"));
        } else if (str3.equals("auth_sso")) {
            A1G = this.A01.A1j(r302.A00.getString("accessToken"));
        } else if (str3.equals(1BJ.A00(999))) {
            A1G = this.A01.A1k(r302.A00.getString("accessToken"));
        } else if (str3.equals(1BJ.A00(338))) {
            A1G = this.A01.A1l(r302.A00.getString("accessToken"));
        } else if (str3.equals(1BJ.A00(1913))) {
            A1G = this.A01.A1i(r302.A00.getString("accessToken"));
        } else if (str3.equals(1BJ.A00(1001))) {
            Bundle bundle = r302.A00;
            A1G = this.A01.A1n(bundle.getString("accessToken"), bundle.getString("targetWorkEmail"));
        } else {
            BrowserToNativeSSOCredentials browserToNativeSSOCredentials = null;
            if (str3.equals(1BJ.A00(1877))) {
                Bundle bundle2 = r302.A00;
                OpenIDLoginCredentials openIDLoginCredentials3 = (OpenIDLoginCredentials) bundle2.getParcelable("openIDCredentials");
                String string = bundle2.getString(AbE.A00(649));
                if (!1JF.A0B(string)) {
                    browserToNativeSSOCredentials = CJm.A00(string);
                }
                A1G = this.A01.A1V(openIDLoginCredentials3, browserToNativeSSOCredentials, bundle2.getStringArrayList("openid_tokens"));
            } else if (str3.equals(1BJ.A00(942))) {
                Fck fck = this.A01;
                Bundle bundle3 = r302.A00;
                A1G = fck.A1p(bundle3.getString("accessToken"), bundle3.getString("proxyUserId"), bundle3.getString("proxySignedIds"), bundle3.getString("deviceToken"), bundle3.getString("appId"), bundle3.getString("appSecret"));
            } else if (str3.equals(1BJ.A00(941))) {
                Bundle bundle4 = r302.A00;
                A1G = this.A01.A1c((PasswordCredentials) bundle4.getParcelable("passwordCredentials"), bundle4.getString("proxyUserId"), bundle4.getString("proxySignedIds"), bundle4.getString("deviceToken"), bundle4.getString("appId"), bundle4.getString("appSecret"));
            } else if (str3.equals(1BJ.A00(943))) {
                Bundle bundle5 = r302.A00;
                PasswordCredentials passwordCredentials = (PasswordCredentials) bundle5.getParcelable("passwordCredentials");
                if (passwordCredentials == null) {
                    OperationResult.A03(29B.A0H, AnonymousClass001.A0L("null credentials"));
                }
                A1G = this.A01.A1b(passwordCredentials, bundle5.getString("proxyUserId"), bundle5.getString("proxySignedIds"));
            } else if (str3.equals("determine_user_type")) {
                Bundle bundle6 = r302.A00;
                A1G = this.A01.A1u(bundle6.getString("ig_access_token"), bundle6.getString("fb_user_id"));
            } else if (str3.equals("ig_authenticate")) {
                A1G = this.A01.A1t((InstagramPasswordCredentials) r302.A00.getParcelable("ig_auth_credentials"));
            } else if (str3.equals("auth_password")) {
                A1G = this.A01.A1Y((PasswordCredentials) r302.A00.getParcelable("passwordCredentials"));
            } else if (str3.equals(1BJ.A00(998))) {
                A1G = this.A01.A1Z((PasswordCredentials) r302.A00.getParcelable("passwordCredentials"));
            } else if (str3.equals(1BJ.A00(554))) {
                A1G = this.A01.A1a((PasswordCredentials) r302.A00.getParcelable("passwordCredentials"));
            } else if (str3.equals(1BJ.A00(201))) {
                Bundle bundle7 = r302.A00;
                A1G = this.A01.A1s(new Bo9(bundle7.getString("user_id"), bundle7.getString(AbE.A00(767)), bundle7.getString("param_name")));
            } else if (str3.equals(1BJ.A00(1912))) {
                Bundle bundle8 = r302.A00;
                PasswordCredentials passwordCredentials2 = (PasswordCredentials) bundle8.getParcelable("passwordCredentials");
                String string2 = bundle8.getString("first_factor");
                String string3 = bundle8.getString("user_id");
                PasswordCredentials passwordCredentials3 = passwordCredentials2;
                if (!1JF.A0B(string2)) {
                    passwordCredentials3 = passwordCredentials2;
                    if (!1JF.A0B(string3)) {
                        passwordCredentials3 = passwordCredentials2;
                        if (passwordCredentials2 != null) {
                            String str4 = passwordCredentials2.A02;
                            String str5 = passwordCredentials2.A03;
                            ?? passwordCredentials4 = new PasswordCredentials(EPM.A0Q, str4, str5);
                            passwordCredentials4.A02 = string3;
                            passwordCredentials4.A01 = str5;
                            passwordCredentials4.A00 = string2;
                            passwordCredentials3 = passwordCredentials4;
                        }
                    }
                }
                A1G = this.A01.A1X(passwordCredentials3);
            } else if (str3.equals("auth_messenger_soap_account_switch")) {
                Bundle bundle9 = r302.A00;
                A1G = this.A01.A1P(bundle9.getString(AbE.A00(732)), bundle9.getString("accessToken"), bundle9.getString("sessionCookies"));
            } else if (str3.equals(1BJ.A00(80))) {
                Bundle bundle10 = r302.A00;
                A1G = this.A01.A1J(A0C, bundle10.getString(AbE.A00(544)), bundle10.getString(AbE.A00(543)), bundle10.getString("sessionCookies"));
            } else if (str3.equals(1BJ.A00(81))) {
                Bundle bundle11 = r302.A00;
                A1G = this.A01.A1L(bundle11.getString("igUserId"), bundle11.getString(AbE.A00(549)));
            } else if (str3.equals("auth_password_work")) {
                Bundle bundle12 = r302.A00;
                A1G = this.A01.A1d((PasswordCredentials) bundle12.getParcelable("passwordCredentials"), bundle12.getString("targetWorkEmail"), bundle12.getString("workCodeVerifier", null), bundle12.getString("community_id"), bundle12.getString("ssoRequestId"), bundle12.getString("idpSid", null));
            } else if (1BJ.A00(337).equals(str3)) {
                A1G = this.A01.A1U(r302.A00.getParcelable(AbE.A00(635)));
            } else if (1BJ.A00(336).equals(str3)) {
                A1G = this.A01.A1S(r302.A00.getParcelable("nativeSSO"));
            } else if (str3.equals(1BJ.A00(1002))) {
                A1G = this.A01.A1e(r302.A00.getParcelable("workUserSwitchCredentials"));
            } else {
                boolean z = false;
                if (str3.equals("auth_logout")) {
                    this.A01.A1y(null, false);
                    return OperationResult.A00;
                }
                if ("login".equals(str3)) {
                    this.A02.A00();
                    Ezc A0K = DKC.A0K(this.A03);
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add(new DVI(A0K, DKD.A0j(A0K.A0y)));
                    Iterator A1D = DKC.A1D(new C1508AjV(A0K, DKD.A0j(A0K.A0q)), A0s);
                    while (A1D.hasNext()) {
                        try {
                            DKC.A14(A1D).run();
                        } catch (Exception unused) {
                        }
                    }
                    return OperationResult.A00;
                }
                if (1BJ.A00(944).equals(str3)) {
                    ViewerContext viewerContext = (ViewerContext) r302.A00.getParcelable("viewer_context");
                    if (viewerContext == null) {
                        return OperationResult.A03(29B.A0H, AnonymousClass001.A0L("VC is null"));
                    }
                    FcZ fcZ = this.A02;
                    C04033zm c04033zm = new C04033zm();
                    c04033zm.A01(0S2.A0C);
                    F4j f4j = (F4j) fcZ.A03.get();
                    try {
                        try {
                            C00i c00i = f4j.A01;
                            1Rl r0 = (1Rl) c00i.get();
                            r0.A01 = true;
                            r0.A00 = viewerContext;
                            GetLoggedInUserGraphQLResult getLoggedInUserGraphQLResult = (GetLoggedInUserGraphQLResult) ((1Rl) c00i.get()).A07((CallerContext) null, DKC.A0S(f4j.A00), c04033zm, (Object) null);
                            1Kh r02 = new 1Kh();
                            r02.A03(getLoggedInUserGraphQLResult.A00);
                            BrowserToNativeSSOCredentials user = new User(r02);
                            1Rl r03 = (1Rl) c00i.get();
                            r03.A01 = false;
                            r03.A00 = null;
                            browserToNativeSSOCredentials = user;
                        } catch (Exception e) {
                            0fH.A0s("AlohaStatelessLoginRunner", "Exception while login", e);
                            1Rl r04 = (1Rl) f4j.A01.get();
                            r04.A01 = false;
                            r04.A00 = null;
                        }
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable("loggedin_user", browserToNativeSSOCredentials);
                        return OperationResult.A04(A05);
                    } catch (Throwable th) {
                        1Rl r05 = (1Rl) f4j.A01.get();
                        r05.A01 = false;
                        r05.A00 = null;
                        throw th;
                    }
                }
                if (1BJ.A00(994).equals(str3)) {
                    Bundle bundle13 = r302.A00;
                    CreateMessengerAccountCredentials createMessengerAccountCredentials = (CreateMessengerAccountCredentials) bundle13.getParcelable("createAccountParams");
                    boolean z2 = bundle13.getBoolean("search_for_soft_matched_account", false);
                    A1G = this.A01.A1h(createMessengerAccountCredentials, (InstagramUserInfo) bundle13.getParcelable("ig_user_info"), bundle13.getString("account_recovery_id"), z2);
                } else if (1BJ.A00(996).equals(str3)) {
                    A1G = this.A01.A1f((ConfirmedMessengerCredentials) r302.A00.getParcelable("loginMessengerAccountParams"));
                } else if (1BJ.A00(997).equals(str3)) {
                    A1G = this.A01.A1g((ConfirmedMessengerOnlyUserCredentials) r302.A00.getParcelable("loginMessengerOnlyUserAccountParams"));
                } else {
                    boolean equals = "auth_switch_accounts".equals(str3);
                    String A00 = AbE.A00(387);
                    if (equals) {
                        String str6 = "";
                        try {
                            Bundle bundle14 = r302.A00;
                            PasswordCredentials passwordCredentials5 = (PasswordCredentials) bundle14.getParcelable("passwordCredentials");
                            try {
                                str6 = bundle14.getString(A00);
                                z = bundle14.getBoolean("mo_account", false);
                            } catch (Exception unused2) {
                            }
                            if (passwordCredentials5 != null) {
                                A1G = this.A01.A1I(passwordCredentials5, str6, z);
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            browserToNativeSSOCredentials = (BrowserToNativeSSOCredentials) r302.A00.getParcelable("nativeSSO");
                        } catch (Exception unused4) {
                        }
                        A1G = this.A01.A1E(browserToNativeSSOCredentials, str6);
                    } else if (AbE.A00(11).equals(str3)) {
                        try {
                            Bundle bundle15 = r302.A00;
                            openIDLoginCredentials = (OpenIDLoginCredentials) bundle15.getParcelable("openIDCredentials");
                            try {
                                str = bundle15.getString(A00);
                                try {
                                    browserToNativeSSOCredentials = bundle15.getStringArrayList("openid_tokens");
                                } catch (Exception unused5) {
                                }
                            } catch (Exception unused6) {
                                str = null;
                            }
                        } catch (Exception unused7) {
                            openIDLoginCredentials = null;
                            str = null;
                        }
                        A1G = this.A01.A1G(openIDLoginCredentials, str, browserToNativeSSOCredentials);
                    } else if (1BJ.A00(ActionId.ACTION_BAR_COMPLETE).equals(str3)) {
                        try {
                            Bundle bundle16 = r302.A00;
                            openIDLoginCredentials2 = (OpenIDLoginCredentials) bundle16.getParcelable("openIDCredentials");
                            try {
                                str2 = bundle16.getString(A00);
                                try {
                                    browserToNativeSSOCredentials = bundle16.getStringArrayList("openid_tokens");
                                } catch (Exception unused8) {
                                }
                            } catch (Exception unused9) {
                                str2 = null;
                            }
                        } catch (Exception unused10) {
                            openIDLoginCredentials2 = null;
                            str2 = null;
                        }
                        A1G = this.A01.A1H(openIDLoginCredentials2, str2, browserToNativeSSOCredentials);
                    } else if (1BJ.A00(ActionId.FUTURE_LISTENERS_COMPLETE).equals(str3)) {
                        Bundle bundle17 = r302.A00;
                        A1G = this.A01.A1N(bundle17.getString("accessToken"), bundle17.getString(A00));
                    } else if (1BJ.A00(42).equals(str3)) {
                        Bundle bundle18 = r302.A00;
                        A1G = this.A01.A1F((DeviceBasedLoginCredentials) bundle18.getParcelable(AbE.A00(486)), A0C, bundle18.getString(A00), bundle18.getString("login_source"), bundle18.getString("machine_id"));
                    } else if ("auth_messenger_page_account_switch".equals(str3)) {
                        Bundle bundle19 = r302.A00;
                        A1G = this.A01.A1O(bundle19.getString("pageId"), bundle19.getString(AbE.A00(657)), bundle19.getString("userStorageKey"));
                    } else if (1BJ.A00(ActionId.APPLY_FINISHED_LIST).equals(str3)) {
                        Bundle bundle20 = r302.A00;
                        A1G = this.A01.A1M(bundle20.getString(AbE.A00(386)), bundle20.getString(AbE.A00(385)));
                    } else if ("auth_messenger_page_to_admin_account_switch".equals(str3)) {
                        A1G = this.A01.A1K(r302.A00.getString("userStorageKey"));
                    } else if (1BJ.A00(1226).equals(str3)) {
                        A1G = this.A01.A1T((DeviceBasedLoginCredentials) r302.A00.getParcelable("dblAuthCredentials"));
                    } else if (1BJ.A00(ActionId.APPLY_FINISHED_LIST_AGAIN).equals(str3)) {
                        A1G = this.A01.A1W((PasswordCredentials) r302.A00.getParcelable("passwordCredentials"));
                    } else if (1BJ.A00(1000).equals(str3)) {
                        Bundle bundle21 = r302.A00;
                        A1G = this.A01.A1o(bundle21.getString("user_id"), bundle21.getString("temporary_login_nonce"), bundle21.getString("community_id"));
                    } else if (str3.equals("pwd_key_fetch")) {
                        A1G = this.A01.A1D((PasswordEncryptionKeyFetchMethod$Params) r302.A00.getParcelable("pwd_key_fetch_params"));
                    } else {
                        if (str3.equals(AbE.A00(24))) {
                            Bundle bundle22 = r302.A00;
                            return OperationResult.A06(this.A01.A1v(new Bte(bundle22.getString(Property.SYMBOL_Z_ORDER_SOURCE), bundle22.getStringArrayList("tokens"), bundle22.getIntegerArrayList(AbE.A00(550)), bundle22.getIntegerArrayList(AbE.A00(368)), (HashMap) bundle22.getSerializable(AbE.A00(552)))));
                        }
                        if (str3.equals(1BJ.A00(993))) {
                            Bundle bundle23 = r302.A00;
                            A1G = this.A01.A1q((PasswordCredentials) bundle23.getParcelable("passwordCredentials"), (OpenIDCredential) bundle23.getParcelable("openid_credential_parcelable_key"));
                        } else if (str3.equals(1BJ.A00(995))) {
                            Bundle bundle24 = r302.A00;
                            A1G = this.A01.A1r((PasswordCredentials) bundle24.getParcelable("passwordCredentials"), bundle24.getString("case"), bundle24.getStringArrayList("uids"), bundle24.getStringArrayList("emails"), bundle24.getStringArrayList("openid_tokens"));
                        } else {
                            if (!str3.equals(1BJ.A00(959))) {
                                throw 0Pz.A05(AbE.A00(ActionId.RTMP_CONNECTION_CONNECTED), str3);
                            }
                            Bundle bundle25 = r302.A00;
                            String A0p = DKD.A0p(bundle25, "ROOM_URL");
                            String A0p2 = DKD.A0p(bundle25, "GUEST_USER_NAME");
                            bundle25.getParcelable("passwordCredentials");
                            A1G = this.A01.A1m(A0p, A0p2);
                        }
                    }
                }
            }
        }
        return OperationResult.A04(A1G);
    }
}
