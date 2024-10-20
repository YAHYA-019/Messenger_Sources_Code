package com.facebook.quicksilver.webviewservice;

import X.0FI;
import X.0LS;
import X.0Pz;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Hv;
import X.1Ih;
import X.1Lm;
import X.67O;
import X.7zL;
import X.Aak;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AnonymousClass001;
import X.AnonymousClass025;
import X.AnonymousClass074;
import X.C00i;
import X.C01w;
import X.C08o;
import X.C0A2;
import X.C1Ur;
import X.C3X;
import X.C3o5;
import X.C50u;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DNc;
import X.DQj;
import X.DQn;
import X.EOz;
import X.ETK;
import X.ETb;
import X.ETr;
import X.EXd;
import X.Efz;
import X.EjY;
import X.Eq7;
import X.Eqs;
import X.Eqx;
import X.Er6;
import X.EtT;
import X.EuZ;
import X.Eug;
import X.EvF;
import X.ExK;
import X.EzV;
import X.EzW;
import X.Ezm;
import X.Ezv;
import X.F5Y;
import X.F6C;
import X.F9N;
import X.FAX;
import X.FFy;
import X.FHM;
import X.FHN;
import X.FHy;
import X.FI3;
import X.FIc;
import X.FJ0;
import X.FJB;
import X.FcN;
import X.FiL;
import X.FpL;
import X.G4P;
import X.GKQ;
import X.GKb;
import X.I3c;
import X.I5A;
import X.I5a;
import X.JZj;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLGamesInstantPlaySupportedOrientation;
import com.facebook.quicksilver.QuicksilverActivity;
import com.facebook.quicksilver.model.QuicksilverIntentExtras;
import com.facebook.quicksilver.screenshot.QuicksilverScreenshotDetector;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: QuicksilverWebviewService.class */
public class QuicksilverWebviewService extends Service implements GKb, AnonymousClass025 {
    public Intent A01;
    public ContextThemeWrapper A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public JZj A07;
    public JZj A08;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public C00i A0M;
    public C00i A0N;
    public C00i A0O;
    public C00i A0P;
    public C00i A0Q;
    public C00i A0R;
    public C00i A0S;
    public C00i A0T;
    public C00i A0U;
    public C00i A0V;
    public C00i A0W;
    public Ezv A0X;
    public FAX A0Y;
    public FJB A0Z;
    public EzV A0a;
    public ETb A0b;
    public Eq7 A0c;
    public EzW A0d;
    public QuicksilverIntentExtras A0e;
    public F9N A0f;
    public Eqs A0g;
    public DQn A0h;
    public DQj A0i;
    public ETK A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public JSONObject A0n;
    public Messenger A0r;
    public C00i A0s;
    public C00i A0t;
    public C00i A0u;
    public C00i A0v;
    public C00i A0w;
    public C00i A0x;
    public C00i A0y;
    public C00i A0z;
    public C00i A10;
    public C00i A11;
    public C00i A12;
    public DNc A13;
    public 1Ih A14;
    public final AnonymousClass074 A1G = new Object();
    public final C00i A1A = DKG.A0Q();
    public final C00i A18 = 7zL.A0R(this, 67677);
    public final C00i A17 = 1BQ.A02(16616);
    public final C00i A16 = 1BQ.A02(16387);
    public final C00i A1D = 1BQ.A02(98310);
    public final C00i A1H = 1BV.A00(98348);
    public final C00i A1E = 1BQ.A02(16939);
    public final C00i A19 = 1BQ.A02(32846);
    public final C00i A1B = 1BQ.A02(98367);
    public int A00 = 1;
    public boolean A0p = false;
    public EuZ A09 = (EuZ) 1Hv.A02(this, 98394);
    public final C00i A1C = 1BQ.A02(98346);
    public Messenger A02 = null;
    public boolean A0q = false;
    public boolean A0o = false;
    public final AtomicBoolean A1K = DKC.A1E(false);
    public boolean A15 = false;
    public final 67O A1F = new FiL(this);
    public final Efz A1J = new Efz(this);
    public final Aak A1I = new FpL(this);

    public static ContextThemeWrapper A00(QuicksilverWebviewService quicksilverWebviewService) {
        ContextThemeWrapper contextThemeWrapper = quicksilverWebviewService.A03;
        if (contextThemeWrapper == null) {
            contextThemeWrapper = new ContextThemeWrapper(quicksilverWebviewService, 2132607851);
            quicksilverWebviewService.A03 = contextThemeWrapper;
        }
        return contextThemeWrapper;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0w6, java.lang.Object] */
    public static String A01(QuicksilverWebviewService quicksilverWebviewService) {
        String str;
        FAX fax = quicksilverWebviewService.A0Y;
        String str2 = fax.A08;
        if (str2 == null) {
            str2 = fax.A0F;
        }
        if (str2 == null) {
            Er6 er6 = fax.A03;
            if (er6 == null || (str = er6.A0g) == null) {
                C00i c00i = quicksilverWebviewService.A0Q;
                if (c00i != null && c00i.get() != null) {
                    DKG.A0q(quicksilverWebviewService).A0G("async_share_failure", "No link or game ID could be found for share url");
                }
            } else {
                str2 = 0Pz.A0W("https://fb.gg/play/", str);
            }
        }
        if (quicksilverWebviewService.A0j != null && 1BK.A0N(quicksilverWebviewService.A16).AZk(72339919418886639L)) {
            String str3 = quicksilverWebviewService.A0j.A01;
            if (str2 == null) {
                str2 = null;
            } else if (str3 != null) {
                try {
                    Uri A00 = C0A2.A00(new Object(), str2);
                    if (A00 != null) {
                        Uri.Builder buildUpon = A00.buildUpon();
                        buildUpon.appendQueryParameter("payload", str3);
                        return buildUpon.build().toString();
                    }
                } catch (NullPointerException e) {
                    C00i c00i2 = quicksilverWebviewService.A0Q;
                    if (c00i2 != null) {
                        DKF.A0c(c00i2).A0I("json_exception", "Error appending json payload to url", e);
                        return str2;
                    }
                }
            }
        }
        return str2;
    }

    private void A02() {
        int i;
        GraphQLGamesInstantPlaySupportedOrientation graphQLGamesInstantPlaySupportedOrientation = this.A0Y.A03.A0A;
        if (GraphQLGamesInstantPlaySupportedOrientation.PORTRAIT.equals(graphQLGamesInstantPlaySupportedOrientation)) {
            i = 1;
        } else if (!GraphQLGamesInstantPlaySupportedOrientation.LANDSCAPE.equals(graphQLGamesInstantPlaySupportedOrientation)) {
            return;
        } else {
            i = 11;
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01f0, code lost:
    
        if (r303.A0Y.A03.A0x != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(com.facebook.auth.usersession.FbUserSession r301, X.Er6 r302, com.facebook.quicksilver.webviewservice.QuicksilverWebviewService r303) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverWebviewService.A03(com.facebook.auth.usersession.FbUserSession, X.Er6, com.facebook.quicksilver.webviewservice.QuicksilverWebviewService):void");
    }

    public static void A04(QuicksilverWebviewService quicksilverWebviewService, String str) {
        if ((str != null && !TextUtils.isEmpty(str)) || A01(quicksilverWebviewService) != null) {
            1Bn.A0A(147783);
            return;
        }
        ETK etk = quicksilverWebviewService.A0j;
        if (etk != null) {
            quicksilverWebviewService.Ccf(etk.A03, "There was an error while opening the share dialog", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            FI3.A03(DKG.A0r(quicksilverWebviewService).A08);
            EzV ezV = quicksilverWebviewService.A0a;
            if (ezV != null) {
                ezV.A00();
            }
        }
    }

    public ETr A05() {
        return (ETr) 1Hv.A02(A00(this), 98316);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0.equals("COPLAY") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.DQk A06(android.content.Context r302) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverWebviewService.A06(android.content.Context):X.DQk");
    }

    public EtT A07() {
        C00i c00i = this.A1H;
        if (c00i == null) {
            return null;
        }
        return (EtT) c00i.get();
    }

    public void A08() {
        if (((Eug) this.A12.get()).A02) {
            return;
        }
        try {
            QuicksilverIntentExtras quicksilverIntentExtras = this.A0e;
            if (quicksilverIntentExtras != null && quicksilverIntentExtras.A0T && this.A01 == null && this.A1K.compareAndSet(false, true)) {
                this.A0I.get();
            } else if (this.A0o && this.A1K.compareAndSet(false, true)) {
                this.A0I.get();
            }
        } catch (Exception e) {
            DKG.A0q(this).A0I("exception_message", 0Pz.A1B("Redirection failed w/ exception ", e), e);
        }
    }

    public void A09() {
        QuicksilverIntentExtras quicksilverIntentExtras;
        FAX fax = this.A0Y;
        Integer num = 0S2.A01;
        fax.A07 = num;
        fax.A0B = 1BK.A0t();
        ((Ezm) this.A0P.get()).A00();
        Ckm(EOz.A03, this.A0Z.A0F());
        DKG.A0r(this).A06();
        DKG.A0q(this).A0C("game_loading_view_completed");
        DKG.A0q(this).A0C("game_active");
        if (((FcN) this.A0U.get()).A02() && !A0E() && !A0F() && ((quicksilverIntentExtras = this.A0e) == null || (!quicksilverIntentExtras.A0O && !quicksilverIntentExtras.A0N))) {
            A0C(null, num, null);
        }
        int A00 = C1Ur.A00(FHN.A00(this.A1A), 0, 36592618887447441L);
        if (A00 > 0) {
            ((Eug) this.A12.get()).A00(A00);
        }
    }

    public void A0A() {
        synchronized (this) {
            if ((A0E() || A0F()) && !this.A15) {
                EzW ezW = this.A0d;
                if (ezW != null && this.A02 != null) {
                    String A00 = ezW.A00();
                    if ("SUPPORTED".equals(A00) || "USER_CAN_ONLY_PLAY_ON_FB".equals(A00)) {
                        Bundle A05 = 1BK.A05();
                        A05.putString("game_uri", this.A0Y.A03.A0i);
                        A0B(A05, EOz.A02);
                    } else {
                        A0B(null, EOz.A02);
                    }
                    this.A15 = true;
                }
            }
        }
    }

    public void A0B(Bundle bundle, EOz eOz) {
        String string;
        if (this.A02 != null) {
            Message obtain = Message.obtain();
            Bundle A05 = 1BK.A05();
            A05.putSerializable(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, eOz);
            if (bundle != null) {
                A05.putParcelable("content", bundle);
                C00i c00i = this.A1A;
                if (FHN.A00(c00i).AZk(36311143920109992L) && !this.A0Y.A0H && (string = bundle.getString("data")) != null) {
                    try {
                        JSONObject A1F = DKC.A1F(string);
                        FHN A0d = DKF.A0d(c00i);
                        ArrayList A0s = AnonymousClass001.A0s();
                        try {
                            JSONArray jSONArray = new JSONArray(1Br.A06(A0d.A00).BCy(36874093873594641L));
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                1BK.A1N(jSONArray.get(i), A0s);
                            }
                        } catch (JSONException unused) {
                        }
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            if (A1F.has(AnonymousClass001.A0i(it))) {
                                DKG.A0q(this).A0I("webview_service_message_send_fail", "Message send contains sensitive info when not TOSed", (Throwable) null);
                                return;
                            }
                        }
                    } catch (JSONException unused2) {
                    }
                }
            }
            obtain.obj = A05;
            try {
                this.A02.send(obtain);
            } catch (RemoteException unused3) {
            } catch (Exception e) {
                DKG.A0q(this).A0I("webview_service_message_send_fail", "Message send failed with non remote exception", e);
            }
        }
    }

    public void A0C(EjY ejY, Integer num, String str) {
        AbG.A0B(this.A0A).Ciz(new G4P(ejY, this, num));
        Intent A0D = C3o5.A0D(this, QuicksilverHSShortcutActivity.class);
        A0D.putExtra("promiseID", str);
        A0D.setFlags(268500992);
        0LS.A0A(this, A0D);
        ((FcN) this.A0U.get()).A00 = true;
        ((C3X) this.A0x.get()).A00(this.A0Y.A03.A0g);
    }

    public void A0D(String str, String str2, String str3) {
        DKG.A0q(this).A0C("game_switch_dialog_accepted");
        ((FHy) this.A0H.get()).A04(1BL.A0F());
        if (str3 == null) {
            Integer num = 0S2.A02;
            this.A0s.get();
            Integer num2 = 0S2.A0R;
            11T.A0F(num2, 3);
            str3 = EXd.A00(num2, num);
        }
        Intent A0D = C3o5.A0D(this, QuicksilverActivity.class);
        this.A01 = A0D;
        A0D.putExtra("app_id", str);
        this.A01.putExtra(Property.SYMBOL_Z_ORDER_SOURCE, str3);
        this.A01.putExtra("source_id", this.A0Y.A04.A08);
        this.A01.putExtra("source_context", this.A0Y.A04.A01.toString());
        this.A01.putExtra("should_end_funnel", true);
        this.A01.putExtra("entry_point_data", str2);
        this.A01.putExtra("open_tab_on_close", true);
        this.A01.putExtra("open_play_pivot_tab_on_close", true);
        this.A01.addFlags(335544320);
        DKG.A0r(this).A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A0P == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.quicksilver.model.QuicksilverIntentExtras r0 = r0.A0e
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A0P
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverWebviewService.A0E():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A0Q == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0F() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.quicksilver.model.QuicksilverIntentExtras r0 = r0.A0e
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A0Q
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverWebviewService.A0F():boolean");
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        return this.A1G.A00(obj);
    }

    @Override // X.GKb
    public boolean BUH() {
        return false;
    }

    @Override // X.GKb
    public void BYe(String str, String str2, String str3, String str4) {
    }

    @Override // X.GKb
    public void Ccf(String str, String str2, String str3) {
        Bundle A09 = DKG.A09(str);
        A09.putString("message", str2);
        A09.putSerializable("code", str3);
        A0B(A09, EOz.A0H);
    }

    @Override // X.GKb
    public void Ci7(String str, Object obj) {
        String str2;
        String str3;
        Bundle A09 = DKG.A09(str);
        DKD.A1A(A09, obj, "data");
        if (obj instanceof JSONArray) {
            str2 = "data_type";
            str3 = "data_type_json_array";
        } else if (obj instanceof JSONObject) {
            str2 = "data_type";
            str3 = "data_type_json_object";
        } else {
            if (!(obj instanceof String)) {
                return;
            }
            str2 = "data_type";
            str3 = "data_type_string";
        }
        A09.putString(str2, str3);
        A0B(A09, EOz.A0K);
    }

    @Override // X.GKb
    public void Ckl(EOz eOz) {
        A0B(null, eOz);
    }

    @Override // X.GKb
    public void Ckm(EOz eOz, Object obj) {
        Bundle A05 = 1BK.A05();
        DKD.A1A(A05, obj, "data");
        A0B(A05, eOz);
    }

    @Override // X.GKb
    public void Cqq(boolean z) {
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        this.A1G.A01(obj, obj2);
    }

    @Override // X.GKb
    public void D0L(boolean z) {
    }

    @Override // X.GKb
    public void destroy() {
        stopSelf();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.A14;
        if (resources == null) {
            resources = getApplicationContext().getResources();
        }
        return resources;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        FI3.A01(this);
        Messenger messenger = new Messenger((Handler) this.A13);
        this.A0r = messenger;
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1741807339);
        int A04 = 0FI.A04(-278031100);
        this.A0v = AbF.A0Q(this, 98386);
        this.A0G = 7zL.A0R(this, 98329);
        this.A0y = 7zL.A0R(this, 594);
        this.A0M = 7zL.A0R(this, 82747);
        this.A0A = AbH.A0K();
        this.A0O = 1BV.A00(98401);
        this.A0W = 1BV.A00(66170);
        this.A0V = 1BV.A00(592);
        this.A0E = 7zL.A0R(this, 593);
        this.A0T = 7zL.A0R(this, 595);
        this.A14 = (1Ih) 1Bi.A03(67196);
        this.A0R = 7zL.A0R(this, 98374);
        this.A0L = 7zL.A0R(this, 98327);
        this.A0s = AbF.A0Q(this, 98387);
        this.A0u = AbF.A0Q(this, 98381);
        this.A0b = (ETb) 1Hv.A02(this, 98386);
        this.A0I = 7zL.A0R(this, 147467);
        this.A0C = AbH.A0a();
        this.A0B = 1BQ.A02(83426);
        this.A0S = 1BV.A00(100159);
        this.A11 = 7zL.A0R(this, 98308);
        this.A0D = AbF.A0Q(this, 98389);
        this.A0t = AbF.A0Q(this, 98400);
        this.A0w = AbF.A0Q(this, 82751);
        this.A13 = (DNc) 1Hv.A02(this, 98347);
        this.A0K = AbF.A0Q(this, 98325);
        this.A0P = AbF.A0Q(this, 82736);
        this.A0J = AbF.A0Q(this, 98400);
        this.A0H = AbF.A0Q(this, 98360);
        this.A0Q = DKG.A0R(this);
        this.A12 = AbF.A0Q(this, 98350);
        this.A0N = AbF.A0Q(this, 98376);
        this.A10 = AbF.A0Q(this, 98309);
        this.A0z = AbF.A0Q(this, 98307);
        this.A0U = AbF.A0Q(this, 98363);
        this.A0x = AbF.A0Q(this, 82748);
        super.onCreate();
        this.A0Y = ((F6C) this.A0w.get()).A00;
        this.A0Z = ((Eqx) this.A0z.get()).A00;
        this.A0F = AbH.A0Z();
        0FI.A0A(-173078186, A04);
        C08o.A02(986876867, A00);
    }

    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Object, X.Hff] */
    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this) {
            int A04 = 0FI.A04(1811853118);
            C00i c00i = this.A0Q;
            if (c00i != null && c00i.get() != null) {
                DKG.A0q(this).A07();
            }
            C00i c00i2 = this.A12;
            if (c00i2 != null && c00i2.get() != null) {
                Eug eug = (Eug) this.A12.get();
                Handler handler = eug.A00;
                if (handler != null) {
                    Runnable runnable = eug.A01;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                    eug.A00 = null;
                }
            }
            C00i c00i3 = this.A0K;
            if (c00i3 != null && c00i3.get() != null) {
                ExK exK = (ExK) this.A0K.get();
                exK.A02 = null;
                exK.A01 = null;
                exK.A00 = null;
            }
            FJB fjb = this.A0Z;
            if (fjb != null) {
                fjb.A0H((String) null);
            }
            C00i c00i4 = this.A0H;
            if (c00i4 != null && c00i4.get() != null) {
                ((FHy) this.A0H.get()).A04(1BL.A0F());
            }
            Ezv ezv = this.A0X;
            if (ezv != null) {
                FHM fhm = ezv.A01;
                if (fhm != null) {
                    FHM.A03(fhm);
                    fhm.A01 = null;
                }
            }
            FAX fax = this.A0Y;
            if (fax != null) {
                FAX.A00(fax);
                fax.A04 = null;
                fax.A01 = null;
                fax.A00 = null;
            }
            FJB fjb2 = this.A0Z;
            if (fjb2 != null) {
                ScheduledFuture scheduledFuture = fjb2.A0E;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = fjb2.A0D;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                fjb2.A0I = false;
                fjb2.A0G = false;
            }
            C00i c00i5 = this.A0Q;
            if (c00i5 != null && c00i5.get() != null) {
                this.A0Q.get();
            }
            DNc dNc = this.A13;
            if (dNc != null) {
                C00i c00i6 = dNc.A07;
                if (c00i6 != null && c00i6.get() != null) {
                    ((EvF) c00i6.get()).A00 = null;
                }
                C00i c00i7 = dNc.A0A;
                if (c00i7 != null && c00i7.get() != null && ((F5Y) c00i7.get()).A00) {
                    C00i c00i8 = dNc.A09;
                    if (c00i8 != null && c00i8.get() != null) {
                        ((GKQ) c00i8.get()).destroy();
                    }
                }
                dNc.A01 = null;
            }
            C00i c00i9 = this.A0N;
            if (c00i9 != null && c00i9.get() != null) {
                ((C50u) ((FFy) this.A0N.get()).A02.get()).onDestroy();
            }
            C00i c00i10 = this.A1C;
            if (c00i10.get() != null) {
                DKF.A0f(c00i10).A05();
            }
            C00i c00i11 = this.A0L;
            if (c00i11 != null && c00i11.get() != null) {
                ((FJ0) this.A0L.get()).A09();
            }
            C00i c00i12 = this.A0D;
            if (c00i12 != null && c00i12.get() != null) {
                FIc fIc = (FIc) this.A0D.get();
                1BY r0 = fIc.A02.A00;
                FbUserSession A0D = AbK.A0D(r0);
                if (!FIc.A05(A0D, fIc)) {
                    I5a i5a = (I5a) 1Lm.A07(A0D, r0, 98355);
                    ?? obj = new Object();
                    obj.A00 = I5A.A04.A01();
                    obj.A01 = 0S2.A05;
                    i5a.A02(new I3c(obj));
                }
                FIc fIc2 = (FIc) this.A0D.get();
                Efz efz = this.A1J;
                11T.A0F(efz, 0);
                fIc2.A09.remove(efz);
            }
            C00i c00i13 = this.A1D;
            if (c00i13.get() != null) {
                ((QuicksilverScreenshotDetector) c00i13.get()).A00.clear();
            }
            C00i c00i14 = this.A1H;
            if (c00i14.get() != null) {
                ((EtT) c00i14.get()).A00.clear();
            }
            EuZ euZ = this.A09;
            if (euZ != null) {
                euZ.A00 = null;
                euZ.A01 = null;
            }
            super.onDestroy();
            Intent intent = this.A01;
            if (intent != null) {
                0LS.A0A(this, intent);
            }
            this.A0a = null;
            this.A0c = null;
            this.A0f = null;
            this.A0m = null;
            this.A0l = null;
            this.A0n = null;
            this.A0i = null;
            this.A04 = null;
            this.A03 = null;
            this.A0d = null;
            this.A01 = null;
            this.A0k = null;
            this.A0q = false;
            this.A0p = false;
            JZj jZj = this.A07;
            if (jZj != null && jZj.isShowing()) {
                this.A07.dismiss();
            }
            this.A07 = null;
            0FI.A0A(1094859940, A04);
            C01w.A00(this);
        }
    }

    @Override // X.GKb
    public void onPause() {
        A0B(null, EOz.A0B);
    }

    @Override // X.GKb
    public void onResume() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01fd, code lost:
    
        if (r0.equals("COPLAY") != false) goto L118;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverWebviewService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        synchronized (this) {
            this.A02 = null;
        }
        QuicksilverIntentExtras quicksilverIntentExtras = this.A0e;
        if ((quicksilverIntentExtras == null || (!quicksilverIntentExtras.A0O && !quicksilverIntentExtras.A0N)) && !A0F()) {
            C00i c00i = this.A0F;
            if (c00i != null && c00i.get() != null) {
                this.A0F.get();
            }
            A08();
        }
        stopSelf();
        return false;
    }

    @Override // X.GKb
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }
}
