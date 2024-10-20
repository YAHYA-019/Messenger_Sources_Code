package com.facebook.quicksilver.webviewprocess;

import X.0ER;
import X.0FI;
import X.0LS;
import X.0Q8;
import X.0QD;
import X.0eS;
import X.0fH;
import X.11T;
import X.16J;
import X.1Iw;
import X.2Wo;
import X.7zL;
import X.7zP;
import X.7zU;
import X.8oB;
import X.Aak;
import X.AbF;
import X.AnonymousClass001;
import X.C0fs;
import X.C0ft;
import X.C0g6;
import X.C1rs;
import X.C8nw;
import X.DKC;
import X.DKD;
import X.Du2;
import X.Du3;
import X.EOz;
import X.Eyq;
import X.FpK;
import X.Fq0;
import X.GIR;
import X.GKI;
import X.JQw;
import X.KoY;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.litho.LithoView;
import com.facebook.quicksilver.model.QuicksilverIntentExtras;
import com.facebook.quicksilver.webviewcommon.api.QuicksilverWebViewParams;
import com.facebook.quicksilver.webviewcommon.api.WebViewToServiceMessageEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: QuicksilverWebViewActivity.class */
public final class QuicksilverWebViewActivity extends Activity implements GKI {
    public View A01;
    public GIR A02;
    public Eyq A03;
    public QuicksilverSeparateProcessWebView A04;
    public Fq0 A05;
    public 2Wo A06;
    public String A07;
    public String A08;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public long A0D;
    public long A0E;
    public ViewStub A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A00 = 1;
    public final KoY A0O = new Object();
    public String A09 = "";
    public final Aak A0P = new FpK(this);

    public static final void A00(QuicksilverWebViewActivity quicksilverWebViewActivity, String str) {
        View inflate;
        TextView A06;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - quicksilverWebViewActivity.A0D <= 5000) {
            quicksilverWebViewActivity.finish();
            return;
        }
        quicksilverWebViewActivity.A0D = elapsedRealtime;
        if (str.length() == 0 || (A06 = AbF.A06((inflate = View.inflate(quicksilverWebViewActivity, 2132542082, null)), 2131364296)) == null) {
            return;
        }
        A06.setText(str);
        Toast toast = new Toast(quicksilverWebViewActivity);
        toast.setView(inflate);
        toast.setDuration(0);
        toast.show();
    }

    public final void A01() {
        QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView = this.A04;
        if (quicksilverSeparateProcessWebView == null || this.A0C) {
            return;
        }
        quicksilverSeparateProcessWebView.onPause();
        Fq0 fq0 = this.A05;
        if (fq0 != null) {
            fq0.A09(null, WebViewToServiceMessageEnum.A14);
        }
        this.A0C = true;
    }

    public final void A02(Boolean bool, Boolean bool2) {
        LithoView lithoView;
        8oB r308;
        if (bool != null) {
            this.A0N = bool.booleanValue();
        }
        if (bool2 != null) {
            this.A0M = bool2.booleanValue();
        }
        2Wo r0 = this.A06;
        if (r0 != null) {
            r0.A01();
            if (this.A0H == null) {
                this.A0H = "";
            }
            if (this.A0G == null) {
                this.A0G = "";
            }
            if (this.A0I == null) {
                this.A0I = "";
            }
            2Wo r02 = this.A06;
            if (r02 == null || (lithoView = (LithoView) r02.A01()) == null) {
                return;
            }
            1Iw A0W = 7zL.A0W(this);
            Aak aak = this.A0P;
            boolean A1Q = AnonymousClass001.A1Q(this.A00, 11);
            boolean z = this.A0N;
            String str = this.A0H;
            if (str == null) {
                str = "";
            }
            String str2 = this.A0I;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.A0G;
            if (str3 == null) {
                str3 = "";
            }
            boolean z2 = this.A0J;
            boolean z3 = this.A0K;
            boolean z4 = this.A0M;
            if (this.A0L) {
                Du3 du3 = new Du3(A0W, new 8oB());
                r308 = du3.A01;
                r308.A00 = aak;
                BitSet bitSet = du3.A02;
                bitSet.set(0);
                r308.A02 = A1Q;
                bitSet.set(2);
                r308.A03 = true;
                bitSet.set(3);
                r308.A01 = true;
                bitSet.set(1);
                C1rs.A02(bitSet, du3.A03);
                du3.A0J();
            } else {
                Du2 du2 = new Du2(A0W, new C8nw());
                r308 = du2.A01;
                r308.A00 = aak;
                BitSet bitSet2 = du2.A02;
                bitSet2.set(0);
                r308.A05 = A1Q;
                bitSet2.set(5);
                r308.A08 = z;
                r308.A02 = str;
                bitSet2.set(3);
                r308.A03 = str2;
                bitSet2.set(4);
                r308.A01 = str3;
                bitSet2.set(2);
                r308.A04 = z2;
                bitSet2.set(1);
                r308.A06 = z3;
                r308.A07 = z4;
                bitSet2.set(6);
                7zP.A16(du2, bitSet2, du2.A03);
            }
            lithoView.A0x(r308);
        }
    }

    public void C07() {
        QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView = this.A04;
        if (quicksilverSeparateProcessWebView != null) {
            quicksilverSeparateProcessWebView.A04 = true;
        }
    }

    public void CEN(int i) {
    }

    public void CKa() {
        synchronized (this) {
            C0ft.A06(C0g6.A70, "alive");
            0fH.A0j(JQw.A00(53), "main_process_state = alive");
        }
    }

    public void CKb() {
        synchronized (this) {
            this.A0O.A00();
        }
        finish();
    }

    public void CKe() {
    }

    public void CKf(String str) {
    }

    @Override // android.app.Activity
    public void finish() {
        Fq0 fq0 = this.A05;
        if (fq0 != null) {
            fq0.A09(null, WebViewToServiceMessageEnum.A0M);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        String str = this.A08;
        if (str == null) {
            11T.A0L("confirmExitMessage");
            throw 0Q8.createAndThrow();
        }
        A00(this, str);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int A00 = 0FI.A00(-43039880);
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.setExtrasClassLoader(QuicksilverWebViewParams.class.getClassLoader());
        QuicksilverWebViewParams quicksilverWebViewParams = (QuicksilverWebViewParams) intent.getParcelableExtra("webview_params_intent");
        if (quicksilverWebViewParams == null) {
            finish();
            i = -1304611023;
        } else {
            String str = quicksilverWebViewParams.A03;
            if (str == null) {
                str = "";
            }
            this.A08 = str;
            String str2 = quicksilverWebViewParams.A02;
            if (str2 == null) {
                str2 = "";
            }
            this.A07 = str2;
            String str3 = quicksilverWebViewParams.A04;
            if (str3 == null) {
                str3 = "";
            }
            this.A0H = str3;
            String str4 = quicksilverWebViewParams.A01;
            if (str4 == null) {
                str4 = "";
            }
            this.A0G = str4;
            String str5 = quicksilverWebViewParams.A05;
            if (str5 == null) {
                str5 = "";
            }
            this.A0I = str5;
            this.A00 = quicksilverWebViewParams.A00;
            this.A0J = quicksilverWebViewParams.A0F;
            this.A0K = quicksilverWebViewParams.A0J;
            this.A0N = false;
            this.A0M = false;
            this.A0L = quicksilverWebViewParams.A0K;
            if ((bundle != null ? bundle.keySet() : null) == null || bundle.keySet().isEmpty()) {
                int i2 = 2132543212;
                if (this.A00 == 11) {
                    i2 = 2132543213;
                }
                setContentView(i2);
                QuicksilverSeparateProcessWebView findViewById = findViewById(2131366801);
                this.A04 = findViewById;
                if (findViewById == null) {
                    finish();
                    i = 1868425812;
                } else {
                    this.A0F = (ViewStub) DKC.A0F(this, 2131365933);
                    QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView = this.A04;
                    11T.A0D(quicksilverSeparateProcessWebView);
                    Fq0 fq0 = new Fq0(quicksilverSeparateProcessWebView);
                    this.A05 = fq0;
                    fq0.A02.A00 = this;
                    fq0.A01 = this;
                    fq0.A04.A01 = this;
                    Intent className = AbF.A05().setClassName(this, "com.facebook.quicksilver.webviewservice.QuicksilverWebviewService");
                    Fq0 fq02 = this.A05;
                    11T.A0D(fq02);
                    bindService(className, (ServiceConnection) fq02.A02, 520);
                    if (quicksilverWebViewParams.A0I) {
                        WebView.setWebContentsDebuggingEnabled(true);
                    }
                    setRequestedOrientation(this.A00);
                    if (getWindow() != null) {
                        View A0B = DKD.A0B(this);
                        11T.A0A(A0B);
                        A0B.setSystemUiVisibility(5894);
                    }
                    String str6 = quicksilverWebViewParams.A09;
                    if (str6 == null) {
                        finish();
                        i = 211844827;
                    } else {
                        List list = quicksilverWebViewParams.A0D;
                        if (list == null) {
                            list = AbF.A1F();
                        }
                        ArrayList A0P = 0QD.A0P("facebook.com", list);
                        C0fs c0fs = new C0fs();
                        16J r0 = new 16J();
                        String[] strArr = (String[]) A0P.toArray(new String[0]);
                        r0.A02((String[]) Arrays.copyOf(strArr, strArr.length));
                        0ER A002 = r0.A00();
                        11T.A0A(A002);
                        c0fs.A00.add(A002);
                        0eS A01 = c0fs.A01();
                        QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView2 = this.A04;
                        if (quicksilverSeparateProcessWebView2 != null) {
                            quicksilverSeparateProcessWebView2.A01 = A01;
                        }
                        List list2 = quicksilverWebViewParams.A0C;
                        if (list2 == null) {
                            list2 = AnonymousClass001.A0s();
                        }
                        if (quicksilverSeparateProcessWebView2 != null) {
                            quicksilverSeparateProcessWebView2.A03 = list2;
                        }
                        Uri A0C = 7zU.A0C(str6);
                        16J r02 = new 16J();
                        r02.A02(new String[]{"facebook.com"});
                        r02.A04(new String[]{"/games/instant/console/"});
                        if (r02.A00().A01(A0C)) {
                            List list3 = quicksilverWebViewParams.A0E;
                            QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView3 = this.A04;
                            if (quicksilverSeparateProcessWebView3 != null) {
                                quicksilverSeparateProcessWebView3.A0A(str6, list3);
                            }
                        } else {
                            QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView4 = this.A04;
                            if (quicksilverSeparateProcessWebView4 != null) {
                                quicksilverSeparateProcessWebView4.A02 = str6;
                                quicksilverSeparateProcessWebView4.A0A(str6, null);
                            }
                        }
                        View findViewById2 = findViewById(2131365933);
                        if (findViewById2 != null) {
                            this.A06 = 2Wo.A00((ViewStub) findViewById2);
                            A02(false, false);
                        }
                        Window window = getWindow();
                        if (window != null) {
                            window.addFlags(128);
                        }
                        i = 1019542393;
                    }
                }
            } else {
                this.A0B = true;
                this.A09 = bundle.getString("GAME_ID");
                finish();
                i = 1396132007;
            }
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(1044536557);
        QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView = this.A04;
        if (quicksilverSeparateProcessWebView != null) {
            quicksilverSeparateProcessWebView.loadData("", null, null);
        }
        Fq0 fq0 = this.A05;
        if (fq0 != null) {
            if (fq0.A02 != null) {
                synchronized (this) {
                    C0ft.A05(C0g6.A70);
                    C0ft.A05(C0g6.A6z);
                    0fH.A0j(JQw.A00(53), "main_process_state = N/A");
                }
                Fq0 fq02 = this.A05;
                11T.A0D(fq02);
                unbindService(fq02.A02);
            }
            Fq0 fq03 = this.A05;
            if (fq03 != null) {
                fq03.A03.removeJavascriptInterface("QuicksilverAndroid");
            }
            Fq0 fq04 = this.A05;
            if (fq04 != null) {
                fq04.A04.A01 = null;
            }
        }
        this.A04 = null;
        super.onDestroy();
        if (this.A0B) {
            try {
                String str = this.A09;
                if (str != null && str.length() != 0) {
                    Intent A05 = AbF.A05();
                    A05.setComponent(new ComponentName(this, "com.facebook.quicksilver.shortcut.QuicksilverShortcutExternalActivity"));
                    A05.putExtra("app_id", this.A09);
                    0LS.A0A(this, A05);
                }
            } catch (Exception unused) {
            }
        }
        0FI.A07(859224795, A00);
    }

    @Override // android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1561600879);
        super.onResume();
        QuicksilverSeparateProcessWebView quicksilverSeparateProcessWebView = this.A04;
        if (quicksilverSeparateProcessWebView != null && this.A0C) {
            quicksilverSeparateProcessWebView.onResume();
            Fq0 fq0 = this.A05;
            if (fq0 != null) {
                fq0.A09(null, WebViewToServiceMessageEnum.A15);
            }
            this.A0C = false;
        }
        0FI.A07(-2123147422, A00);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        QuicksilverIntentExtras quicksilverIntentExtras = (QuicksilverIntentExtras) getIntent().getParcelableExtra("quicksilver_intent");
        if (quicksilverIntentExtras != null) {
            bundle.putString("GAME_ID", quicksilverIntentExtras.A0F);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        Fq0 fq0;
        int A00 = 0FI.A00(-617139885);
        super.onStart();
        if (this.A0A && (fq0 = this.A05) != null) {
            fq0.A09(null, WebViewToServiceMessageEnum.A13);
        }
        0FI.A07(-1332425659, A00);
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(2145999699);
        super.onStop();
        if (!isFinishing() && this.A0A) {
            Fq0 fq0 = this.A05;
            if (fq0 != null) {
                fq0.A0A(EOz.A0B, "");
                Fq0 fq02 = this.A05;
                if (fq02 != null) {
                    fq02.A09(null, WebViewToServiceMessageEnum.A12);
                }
            }
            A01();
        }
        0FI.A07(-1999891857, A00);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A0E > 1000) {
            this.A0E = elapsedRealtime;
            Fq0 fq0 = this.A05;
            if (fq0 != null) {
                fq0.A09(null, WebViewToServiceMessageEnum.A0m);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z || getWindow() == null) {
            return;
        }
        View A0B = DKD.A0B(this);
        11T.A0A(A0B);
        A0B.setSystemUiVisibility(5894);
    }
}
