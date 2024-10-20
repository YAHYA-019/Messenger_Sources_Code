package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.browserextensions.ipc.login.LoginDialogJSBridgeCallData;
import com.facebook.browserextensions.ipc.login.ShowLoginDialogJSBridgeCall;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: LUo.class */
public final class LUo implements MIJ {
    public ShowLoginDialogJSBridgeCall A00;
    public final L7M A01 = (L7M) 1Bn.A0A(131160);

    public String Asb() {
        return "showDialog";
    }

    public /* bridge */ /* synthetic */ void BM9(BusinessExtensionJSBridgeCall businessExtensionJSBridgeCall, RDn rDn) {
        Throwable th;
        ShowLoginDialogJSBridgeCall showLoginDialogJSBridgeCall = (ShowLoginDialogJSBridgeCall) businessExtensionJSBridgeCall;
        this.A00 = showLoginDialogJSBridgeCall;
        try {
            L7M l7m = this.A01;
            Context context = showLoginDialogJSBridgeCall.A01;
            Object A05 = showLoginDialogJSBridgeCall.A05("login_call_data");
            A05.getClass();
            LoginDialogJSBridgeCallData loginDialogJSBridgeCallData = (LoginDialogJSBridgeCallData) A05;
            Uri uri = loginDialogJSBridgeCallData.A00;
            if ("https".equals(uri.getScheme())) {
                Uri uri2 = loginDialogJSBridgeCallData.A01;
                if (uri2 != null) {
                    if (L7M.A01.contains(uri2.getHost())) {
                        String path = uri2.getPath();
                        if (path.startsWith("/intern/connect/xd_arbiter/js/connect/initXdArbiter.bundle.js") || path.startsWith("/connect/xd_arbiter.php") || path.startsWith("/connect/xd_arbiter")) {
                            String queryParameter = C0A2.A03(0Pz.A0W("http://dummy/?", uri2.getFragment())).getQueryParameter("origin");
                            if (queryParameter != null) {
                                Uri A03 = C0A2.A03(queryParameter);
                                if (A03 != null && uri.getScheme().equals(A03.getScheme()) && uri.getAuthority().equals(A03.getAuthority())) {
                                    String str = loginDialogJSBridgeCallData.A03;
                                    if (str.equals("oauth")) {
                                        ImmutableList copyOf = ImmutableList.copyOf((Collection) loginDialogJSBridgeCallData.A04);
                                        String str2 = loginDialogJSBridgeCallData.A02;
                                        Bundle A052 = 1BK.A05();
                                        Preconditions.checkArgument(AnonymousClass001.A1T(str2));
                                        A052.putString(AnonymousClass000.A00(179), str2);
                                        if (copyOf != null) {
                                            A052.putString("scope", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, copyOf));
                                        }
                                        A052.putString("source_ref", "FB_BROWSER");
                                        A052.putString("original_redirect_uri", uri2.toString());
                                        A052.putBoolean("is_account_link", loginDialogJSBridgeCallData.A05);
                                        A052.putString("return_scopes", loginDialogJSBridgeCallData.A06 ? "true" : "false");
                                        Intent A053 = AbF.A05();
                                        A053.setClassName(context, "com.facebook.gdp.ProxyAuth");
                                        if (!A052.containsKey("source_ref")) {
                                            A052.putString("source_ref", "DEFAULT_REF");
                                        }
                                        if (!A052.containsKey("legacy_override")) {
                                            A052.putString("legacy_override", "v2.10");
                                        }
                                        if (!A052.containsKey("response_type")) {
                                            A052.putString("response_type", "token,signed_request");
                                        }
                                        if (!A052.containsKey("ProxyAuthIntentBuilder.logger_ref")) {
                                            A052.putString("ProxyAuthIntentBuilder.logger_ref", 1BK.A0t());
                                        }
                                        JSONObject A12 = AnonymousClass001.A12();
                                        try {
                                            String string = A052.getString("ProxyAuthIntentBuilder.logger_ref");
                                            if (!Platform.stringIsNullOrEmpty(string)) {
                                                A12.put("0_auth_logger_id", string);
                                            }
                                            A12.put("3_method", "katana_proxy_auth");
                                        } catch (JSONException unused) {
                                        }
                                        A052.putString("state", A12.toString());
                                        A052.putString("auth_type", "rerequest");
                                        if (!A052.containsKey("return_scopes")) {
                                            A052.putBoolean("return_scopes", true);
                                        }
                                        A053.putExtras(A052);
                                        A053.setFlags(268435456);
                                        0LS.A0A(this.A00.A01, A053);
                                        return;
                                    }
                                    new Exception(0Pz.A0W("Unsupported dialog method: ", str));
                                } else {
                                    L7M.A00(loginDialogJSBridgeCallData, l7m, "gdp_iab_origin_check_failed");
                                    new Exception("Redirect uri doesn't match host");
                                }
                            } else {
                                L7M.A00(loginDialogJSBridgeCallData, l7m, "gdp_iab_origin_missing");
                                new Exception("Cannot find call origin url");
                            }
                        }
                    }
                    L7M.A00(loginDialogJSBridgeCallData, l7m, "gdp_iab_arbiter_check_failed");
                    new Exception("Redirect uri must be from JS SDK");
                } else {
                    L7M.A00(loginDialogJSBridgeCallData, l7m, "gdp_iab_redirect_url_invalid");
                    new Exception("Null redirect url");
                }
            } else {
                L7M.A00(loginDialogJSBridgeCallData, l7m, "gdp_iab_host_url_invalid");
                new Exception("Host url is invalid");
            }
            throw th;
        } catch (KPw e) {
            this.A00.A06(1349003, e.getMessage());
        }
    }
}
