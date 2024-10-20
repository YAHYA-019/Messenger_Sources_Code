package com.facebook.nativetemplates.fb.action.zeroopenzeroratedcheckoutv2;

import X.0CU;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.1CO;
import X.1FV;
import X.1Fv;
import X.1UG;
import X.2MR;
import X.2Me;
import X.2Mg;
import X.5Dh;
import X.7zL;
import X.7zM;
import X.7zR;
import X.7zU;
import X.AbG;
import X.AbI;
import X.AbstractC00603o4;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C01643sd;
import X.DKC;
import X.DKI;
import X.DPI;
import X.DPM;
import X.EQs;
import X.ERb;
import X.FGx;
import X.FHi;
import X.FXq;
import X.FwK;
import X.G1M;
import X.G1N;
import X.Q96;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.location.platform.api.Location;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: OpenZeroRatedCheckoutActivity.class */
public final class OpenZeroRatedCheckoutActivity extends FbFragmentActivity {
    public LinearLayout A01;
    public ProgressBar A02;
    public TextView A03;
    public TextView A04;
    public FbUserSession A05;
    public GlyphView A06;
    public GlyphView A07;
    public SecureWebView A08;
    public FGx A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public JSONArray A0D;
    public boolean A0E;
    public TextView A0F;
    public TextView A0G;
    public GlyphView A0H;
    public FHi A0I;
    public JSONObject A0J;
    public final 1Br A0M = AbG.A0K();
    public final 1Br A0L = 1BK.A0D();
    public final 1CO A0N = 7zR.A0i();
    public int A00 = (-1) >>> 1;
    public final 1Br A0K = 7zM.A0Y();

    public static final void A12(EQs eQs, OpenZeroRatedCheckoutActivity openZeroRatedCheckoutActivity, String str, Map map) {
        List A0L;
        String A14;
        1UG A08 = 1BK.A08(1Br.A02(openZeroRatedCheckoutActivity.A0L), "zero_rated_checkout_session_logging");
        JSONObject jSONObject = openZeroRatedCheckoutActivity.A0J;
        String str2 = Location.EXTRAS;
        if (jSONObject != null) {
            String string = jSONObject.getString("carrier_id");
            String str3 = "";
            if (string == null) {
                string = str3;
            }
            JSONObject jSONObject2 = openZeroRatedCheckoutActivity.A0J;
            if (jSONObject2 != null) {
                String string2 = jSONObject2.getString("upsell_session_id");
                if (string2 == null) {
                    string2 = str3;
                }
                boolean z = true;
                if (str != null && (A0L = 0CU.A0L(str, new char[]{'?'}, 0)) != null && (A14 = 1BK.A14(A0L, 0)) != null) {
                    str3 = A14;
                }
                if (!A08.isSampled()) {
                    return;
                }
                A08.A5c(eQs, AnonymousClass000.A00(97));
                String str4 = openZeroRatedCheckoutActivity.A0C;
                if (str4 == null) {
                    str2 = "sessionId";
                } else {
                    A08.A7R("checkout_session_id", str4);
                    A08.A7R("target_host", str3);
                    A08.A6H("carrier_id", 1BK.A0n(string));
                    A08.A7R("upsell_session_id", string2);
                    A08.A6J(str2, map);
                    String str5 = openZeroRatedCheckoutActivity.A0B;
                    if (str5 != null) {
                        if (str5.length() <= 0) {
                            z = false;
                        }
                        A08.A5H("is_proxy", Boolean.valueOf(z));
                        A08.A6H("timestamp", AnonymousClass002.A0G());
                        A08.BZL();
                        return;
                    }
                    str2 = "proxyHost";
                }
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        FGx fGx;
        EQs eQs = EQs.A0G;
        SecureWebView secureWebView = this.A08;
        String str = "webView";
        if (secureWebView != null) {
            A12(eQs, this, secureWebView.getUrl(), null);
            FHi fHi = this.A0I;
            if (fHi != null) {
                if (!fHi.A0A.get()) {
                    fHi.A08.flowEndCancel(fHi.A00, "");
                }
                if (fHi.A07.AZk(2378183263639702932L)) {
                    fHi.A02 = true;
                } else {
                    ScheduledExecutorService scheduledExecutorService = fHi.A01;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdown();
                        fHi.A01 = null;
                    }
                }
            }
            if (this.A08 != null) {
                try {
                    fGx = this.A09;
                } catch (ERb e) {
                    A12(EQs.A0F, this, null, 1BK.A1D("ERROR_DESCRIPTION", 0Pz.A1B("Failed to unset proxy with error message: ", e)));
                }
                if (fGx == null) {
                    11T.A0L("webViewProxyUtil");
                    throw 0Q8.createAndThrow();
                }
                fGx.A03("", 0);
                String str2 = this.A0B;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        GraphQlQueryParamSet A0M = 7zL.A0M();
                        String str3 = this.A0C;
                        if (str3 == null) {
                            str = "sessionId";
                        } else {
                            A0M.A05("session_id", str3);
                            5Dh A00 = 5Dh.A00(A0M, new C01643sd(Q96.class, "TerminateZeroRatedCheckoutSession", null, null, "fbandroid", 625947252, 0, 3486038393L, 3486038393L, false, true));
                            if (this.A05 == null) {
                                str = "fbUserSession";
                            } else {
                                1FV A0n = 7zR.A0n(getApplicationContext(), A00);
                                1Br.A0D(this.A0M, FwK.A01(this, 9), A0n);
                            }
                        }
                    }
                    super.A2l();
                    return;
                }
                str = "proxyHost";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        String str2;
        FGx fGx;
        super.A2y(bundle);
        this.A05 = ((1Fv) 1Br.A0B(this.A0K)).A05(this);
        String stringExtra = getIntent().getStringExtra("CHECKOUT_URL");
        getIntent();
        if (stringExtra == null) {
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("SESSION_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.A0C = stringExtra2;
        try {
            JSONObject A1F = DKC.A1F(getIntent().getStringExtra("EXTRAS"));
            this.A0J = A1F;
            this.A0D = new JSONArray(A1F.getString("iab_blocked_url_patterns"));
        } catch (JSONException e) {
            0fH.A0r("OpenZeroRatedCheckoutActivity", AbstractC00603o4.A00(349), e);
        }
        if (this.A0N.AZk(72340254425681298L)) {
            String str3 = this.A0C;
            if (str3 == null) {
                str2 = "sessionId";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            }
            FHi fHi = new FHi(str3);
            this.A0I = fHi;
            if (fHi.A01 == null) {
                0fH.A0k("BalanceDetectionController", "Schedule executor service is null on attempting to start detection");
            } else {
                UserFlowLogger userFlowLogger = fHi.A08;
                long generateNewFlowId = userFlowLogger.generateNewFlowId(342886180);
                fHi.A00 = generateNewFlowId;
                AbI.A1U(userFlowLogger, "external_balance_detection", generateNewFlowId, true);
                FHi.A02(fHi, fHi.A00, 0L);
                if (fHi.A07.AZk(2378183263639702932L)) {
                    for (int i = 0; i < fHi.A04; i++) {
                        fHi.A01.schedule((Runnable) new G1M(fHi), fHi.A05 * i, TimeUnit.SECONDS);
                    }
                } else {
                    fHi.A01.scheduleAtFixedRate(new G1N(fHi), 0L, fHi.A05, TimeUnit.SECONDS);
                }
            }
        }
        setContentView(2132541691);
        this.A08 = (SecureWebView) DKC.A0F(this, 2131362991);
        LinearLayout linearLayout = (LinearLayout) DKC.A0F(this, 2131363922);
        this.A01 = linearLayout;
        if (linearLayout == null) {
            str2 = "errorComponent";
        } else {
            linearLayout.setVisibility(8);
            GlyphView glyphView = (GlyphView) DKC.A0F(this, 2131363925);
            this.A0H = glyphView;
            if (glyphView == null) {
                str2 = "errorIcon";
            } else {
                Context applicationContext = getApplicationContext();
                2MR r0 = 2MR.A1B;
                2Mg r02 = 2Me.A02;
                glyphView.A00(r02.A03(applicationContext, r0));
                this.A0G = (TextView) DKC.A0F(this, 2131363929);
                this.A0F = (TextView) DKC.A0F(this, 2131363928);
                TextView textView = this.A0G;
                if (textView == null) {
                    str2 = "errorComponentTitle";
                } else {
                    DKC.A1K(getResources(), textView, 2131968275);
                    TextView textView2 = this.A0F;
                    if (textView2 != null) {
                        DKC.A1K(getResources(), textView2, 2131968274);
                        this.A02 = (ProgressBar) DKC.A0F(this, 2131366701);
                        SecureWebView secureWebView = this.A08;
                        if (secureWebView == null) {
                            str = "webView";
                        } else {
                            secureWebView.setWebChromeClient(new DPI(this, 0));
                            this.A04 = (TextView) DKC.A0F(this, 2131368286);
                            Uri A0C = 7zU.A0C(stringExtra);
                            TextView textView3 = this.A04;
                            if (textView3 == null) {
                                str = "urlTextView";
                            } else {
                                textView3.setText(A0C.getHost());
                                GlyphView glyphView2 = (GlyphView) DKC.A0F(this, 2131363057);
                                this.A06 = glyphView2;
                                str = "closeIcon";
                                if (glyphView2 != null) {
                                    glyphView2.A00(r02.A03(getApplicationContext(), 2MR.A1g));
                                    GlyphView glyphView3 = this.A06;
                                    if (glyphView3 != null) {
                                        FXq.A01(glyphView3, this, 2);
                                        GlyphView glyphView4 = (GlyphView) DKC.A0F(this, 2131367530);
                                        this.A07 = glyphView4;
                                        if (glyphView4 == null) {
                                            str = "lockIcon";
                                        } else {
                                            glyphView4.A00(r02.A03(getApplicationContext(), 2MR.A28));
                                            TextView textView4 = (TextView) DKC.A0F(this, 2131362068);
                                            this.A03 = textView4;
                                            if (textView4 == null) {
                                                str = "appNameTextView";
                                            } else {
                                                textView4.setText(getApplication().getPackageManager().getApplicationLabel(getApplication().getApplicationInfo()).toString());
                                                SecureWebView secureWebView2 = this.A08;
                                                str2 = "webView";
                                                if (secureWebView2 != null) {
                                                    DKI.A0S(secureWebView2);
                                                    secureWebView2.setWebViewClient(new DPM(this, 3));
                                                    SecureWebView secureWebView3 = this.A08;
                                                    if (secureWebView3 != null) {
                                                        secureWebView3.getSettings().setJavaScriptEnabled(true);
                                                        if (this.A08 != null) {
                                                            this.A09 = new FGx(getApplicationContext(), getApplication().getClass(), AnonymousClass001.A0v());
                                                            String stringExtra3 = getIntent().getStringExtra("PROXY_HOST");
                                                            if (stringExtra3 == null) {
                                                                stringExtra3 = "";
                                                            }
                                                            this.A0B = stringExtra3;
                                                            int intExtra = getIntent().getIntExtra("PROXY_PORT", 0);
                                                            try {
                                                                fGx = this.A09;
                                                            } catch (ERb e2) {
                                                                A12(EQs.A0F, this, null, 1BK.A1D("ERROR_DESCRIPTION", 0Pz.A1B("Failed to set proxy with error message: ", e2)));
                                                            }
                                                            if (fGx == null) {
                                                                11T.A0L("webViewProxyUtil");
                                                            } else {
                                                                String str4 = this.A0B;
                                                                if (str4 == null) {
                                                                    11T.A0L("proxyHost");
                                                                } else {
                                                                    Integer A03 = fGx.A03(str4, intExtra);
                                                                    11T.A0A(A03);
                                                                    if (A03 == 0S2.A0N) {
                                                                        A12(EQs.A0F, this, null, 1BK.A1D("ERROR_DESCRIPTION", "Failed to set proxy"));
                                                                    }
                                                                    String format = String.format("Opening URL: %s", Arrays.copyOf(new Object[]{stringExtra}, 1));
                                                                    11T.A0A(format);
                                                                    0fH.A0j("OpenZeroRatedCheckoutActivity", format);
                                                                    A12(EQs.A0J, this, stringExtra, null);
                                                                    SecureWebView secureWebView4 = this.A08;
                                                                    if (secureWebView4 != null) {
                                                                        secureWebView4.loadUrl(stringExtra);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                            throw 0Q8.createAndThrow();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        11T.A0L(str);
                        throw 0Q8.createAndThrow();
                    }
                    str2 = "errorComponentDescription";
                }
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        EQs eQs = EQs.A05;
        SecureWebView secureWebView = this.A08;
        String str = "webView";
        if (secureWebView != null) {
            A12(eQs, this, secureWebView.getUrl(), null);
            LinearLayout linearLayout = this.A01;
            if (linearLayout == null) {
                str = "errorComponent";
            } else {
                if (linearLayout.getVisibility() == 0) {
                    finish();
                    return;
                }
                SecureWebView secureWebView2 = this.A08;
                if (secureWebView2 != null) {
                    if (!secureWebView2.canGoBack()) {
                        super.onBackPressed();
                        return;
                    }
                    SecureWebView secureWebView3 = this.A08;
                    if (secureWebView3 != null) {
                        secureWebView3.goBack();
                        return;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
