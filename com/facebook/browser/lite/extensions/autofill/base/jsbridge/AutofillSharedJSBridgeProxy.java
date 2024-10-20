package com.facebook.browser.lite.extensions.autofill.base.jsbridge;

import X.0FI;
import X.0Pz;
import X.0RC;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1CO;
import X.2yD;
import X.4YT;
import X.7kQ;
import X.7zM;
import X.8Lq;
import X.AbstractC3252Jnp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C11384wc;
import X.C11424wg;
import X.C11444wi;
import X.C11454wj;
import X.C11474wl;
import X.C3216Jmt;
import X.C3243Jnf;
import X.C82b;
import X.DKC;
import X.DKD;
import X.FzY;
import X.JQz;
import X.JR1;
import X.Jsp;
import X.JtD;
import X.KVf;
import X.KW3;
import X.Kbr;
import X.KoZ;
import X.Ktt;
import X.Kvk;
import X.Kvl;
import X.KxI;
import X.L2P;
import X.L8t;
import X.L9H;
import X.LCd;
import X.LDF;
import X.LDu;
import X.LEA;
import X.LET;
import X.LkT;
import X.Ln0;
import X.Lqq;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: AutofillSharedJSBridgeProxy.class */
public final class AutofillSharedJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public int A00;
    public Long A01;
    public String A02;
    public String A03;
    public final Intent A04;
    public final L8t A05;
    public final C11474wl A06;
    public final KoZ A07;
    public final BrowserLiteJSBridgeCallback A08;
    public final WeakReference A09;

    /* loaded from: AutofillSharedJSBridgeProxy$AutofillJSBridgeCallback.class */
    public final class AutofillJSBridgeCallback extends BrowserLiteJSBridgeCallback.Stub {
        public /* synthetic */ AutofillJSBridgeCallback() {
            0FI.A09(1344741880, 0FI.A03(2070390607));
            0FI.A09(-1278671524, 0FI.A03(1494410591));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final boolean A00(android.content.Context r301, com.facebook.browser.lite.extensions.autofill.model.AutofillData r302) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.AutofillJSBridgeCallback.A00(android.content.Context, com.facebook.browser.lite.extensions.autofill.model.AutofillData):boolean");
        }

        /* JADX WARN: Type inference failed for: r0v49, types: [com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback
        public void BmG(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i) {
            FzY lkT;
            int i2;
            boolean z;
            C3243Jnf A0S;
            int A03 = 0FI.A03(-976148486);
            AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = AutofillSharedJSBridgeProxy.this;
            WeakReference weakReference = autofillSharedJSBridgeProxy.A09;
            C3243Jnf A0S2 = JQz.A0S(weakReference);
            if (A0S2 == null) {
                i2 = -779279474;
            } else {
                String str = browserLiteJSBridgeCall.A05;
                if (str.equals("requestAutoFill")) {
                    ?? businessExtensionJSBridgeCall = new BusinessExtensionJSBridgeCall(browserLiteJSBridgeCall.A01, browserLiteJSBridgeCall.A02, browserLiteJSBridgeCall.A03, browserLiteJSBridgeCall.A04, "requestAutoFill", browserLiteJSBridgeCall.A06);
                    C11474wl c11474wl = autofillSharedJSBridgeProxy.A06;
                    C11424wg c11424wg = c11474wl.A00;
                    11T.A0F(c11424wg, 1);
                    JtD jtD = c11424wg.A03;
                    RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) businessExtensionJSBridgeCall.A05("requestAutofillData");
                    jtD.A00 = requestAutofillJSBridgeCallData == null ? null : requestAutofillJSBridgeCallData.A00;
                    jtD.A07 = businessExtensionJSBridgeCall.A07();
                    RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData2 = (RequestAutofillJSBridgeCallData) businessExtensionJSBridgeCall.A05("requestAutofillData");
                    jtD.A04 = requestAutofillJSBridgeCallData2 == null ? null : requestAutofillJSBridgeCallData2.A01;
                    Jsp jsp = c11424wg.A07;
                    jsp.A01 = businessExtensionJSBridgeCall.Aaz();
                    jsp.A00 = businessExtensionJSBridgeCall.A05;
                    jsp.A02 = businessExtensionJSBridgeCall.A06;
                    Integer valueOf = Integer.valueOf(businessExtensionJSBridgeCall.A02.getInt("instanceKey", 0));
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A02 = LEA.A02(bundle.getStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"));
                    if (!A02.isEmpty()) {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        Iterator it = A02.iterator();
                        while (it.hasNext()) {
                            Map A0v = JQz.A0v((AutofillData) it.next());
                            11T.A0A(A0v);
                            8Lq A00 = Kvk.A00(A0v);
                            if (A00 != null) {
                                A0s2.add(A00);
                            }
                        }
                        c11424wg.A0B.A00 = A0s2;
                        C11384wc c11384wc = c11474wl.A04;
                        if (c11384wc.A0B(true) || c11384wc.A08() || c11384wc.A09()) {
                            Iterator it2 = A02.iterator();
                            while (it2.hasNext()) {
                                AutofillData autofillData = (AutofillData) it2.next();
                                if (KW3.A00(c11424wg, autofillData)) {
                                    A0s.add(autofillData);
                                }
                            }
                        } else {
                            AutofillData autofillData2 = (AutofillData) A02.get(0);
                            C82b c82b = c11424wg.A0K;
                            if (c82b.A00 != null || c82b.A02 != null) {
                                String BCy = c11384wc.A00.BCy(36874789625594261L);
                                11T.A0D(BCy);
                                if (!BCy.equals("control")) {
                                    autofillData2 = Kvl.A00(c11424wg, c11384wc);
                                }
                            }
                            if (KW3.A00(c11424wg, autofillData2)) {
                                A0s.add(autofillData2);
                            }
                        }
                    }
                    Context A07 = autofillSharedJSBridgeProxy.A07();
                    if (!A0s.isEmpty() && A07 != null && (A0S = JQz.A0S(weakReference)) != null) {
                        AutofillData autofillData3 = (AutofillData) A0s.get(0);
                        11T.A0F(autofillData3, 0);
                        String A0b = AnonymousClass001.A0b("email", autofillData3.A00);
                        boolean z2 = true;
                        if (A0b == null || !DKD.A1X(A0b, Patterns.EMAIL_ADDRESS)) {
                            z2 = false;
                        }
                        A0S.A0T = z2;
                        A0S.A0U = A00(A07, autofillData3);
                    }
                    if (autofillSharedJSBridgeProxy.A07() != null && !A0s.isEmpty()) {
                        C11384wc c11384wc2 = c11474wl.A04;
                        Iterator it3 = A0s.iterator();
                        while (it3.hasNext()) {
                            Map map = ((AutofillData) it3.next()).A00;
                            if (AnonymousClass001.A0b("email", map) != null || AnonymousClass001.A0b("tel", map) != null) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        1CO r0 = c11384wc2.A00;
                        if (z ? r0.AZk(36311839667457544L) : 2yD.A03(r0, 36311839667457544L)) {
                            Context A072 = autofillSharedJSBridgeProxy.A07();
                            Iterator it4 = A0s.iterator();
                            while (it4.hasNext()) {
                                AutofillData autofillData4 = (AutofillData) it4.next();
                                Set set = jtD.A07;
                                if (set != null && autofillData4 != null && set.contains("tel") && set.contains("email")) {
                                    Map map2 = autofillData4.A00;
                                    String A0b2 = AnonymousClass001.A0b("email", map2);
                                    if (A0b2 == null || !DKD.A1X(A0b2, Patterns.EMAIL_ADDRESS)) {
                                        map2.remove("email");
                                    }
                                    if (!A00(A072, autofillData4)) {
                                        map2.remove("tel");
                                    }
                                }
                            }
                            ListIterator listIterator = A0s.listIterator();
                            while (listIterator.hasNext()) {
                                AutofillData autofillData5 = (AutofillData) listIterator.next();
                                if (autofillData5 != null) {
                                    Map map3 = autofillData5.A00;
                                    if (!map3.isEmpty()) {
                                        TreeSet treeSet = new TreeSet(map3.keySet());
                                        treeSet.removeAll(Arrays.asList(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ent_id", "usage_frequency"));
                                        if (!7zM.A1b(treeSet)) {
                                        }
                                    }
                                    listIterator.remove();
                                }
                            }
                        }
                    }
                    if (A0s.isEmpty()) {
                        autofillSharedJSBridgeProxy.A05.A05(A0S2.A06(), 0S2.A0u, jtD.A00);
                        KxI.A00(new LkT(A0S2));
                        C3216Jmt c3216Jmt = A0S2.A06;
                        if (c3216Jmt != null) {
                            c3216Jmt.A00();
                        }
                        C11454wj c11454wj = c11474wl.A02;
                        c11454wj.A03(valueOf, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                        c11454wj.A01(valueOf, null, 772805755);
                    } else {
                        A0S2.A0C(autofillSharedJSBridgeProxy, valueOf, A0s);
                    }
                } else if (str.equals("saveAutofillData")) {
                    if (A0S2.A0V) {
                        lkT = new FzY(A0S2);
                        KxI.A00(lkT);
                    }
                } else if (str.equals("hideAutoFillBar")) {
                    lkT = new LkT(A0S2);
                    KxI.A00(lkT);
                }
                Log.d("AutofillSharedJSBridgeProxy", "onCallComplete");
                i2 = -1262187364;
            }
            0FI.A09(i2, A03);
        }
    }

    public AutofillSharedJSBridgeProxy(Intent intent, L8t l8t, C11474wl c11474wl, KoZ koZ, AbstractC3252Jnp abstractC3252Jnp, String str, WeakReference weakReference) {
        super.A01 = str;
        A0D(abstractC3252Jnp);
        this.A08 = new AutofillJSBridgeCallback();
        this.A09 = weakReference;
        this.A04 = intent;
        this.A05 = l8t;
        this.A06 = c11474wl;
        this.A07 = koZ;
    }

    public static final AutofillData A00(JSONObject jSONObject) {
        HashMap A0u = AnonymousClass001.A0u();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("raw_autofill_data");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                11T.A0D(A0i);
                String string = jSONObject2.getJSONArray(A0i).getString(0);
                11T.A0A(string);
                A0u.put(A0i, string);
            }
        } catch (JSONException e) {
            Log.e("AutofillSharedUtil", "Save autofill JSON wrongly formatted", e);
        }
        return new AutofillData(A0u);
    }

    public static final String A01(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A0s = AnonymousClass001.A0s();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                A0s.add(jSONArray.getString(i));
            }
            0RC.A0x(A0s);
            return TextUtils.join(", ", A0s);
        } catch (JSONException e) {
            LCd.A02("AutofillSharedUtil", "Failed to parseRequestedFields", e, new Object[]{e});
            return null;
        }
    }

    public static final String A02(JSONObject jSONObject) {
        try {
            return jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            LCd.A02("AutofillSharedUtil", "Failed to get autofill tag", e, new Object[]{e});
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject A03(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r302
            org.json.JSONObject r0 = X.DKC.A1F(r0)     // Catch: org.json.JSONException -> L1f
            r303 = r0
            java.lang.String r0 = "nonce"
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.String r0 = r0.optString(r1)     // Catch: org.json.JSONException -> L30
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.A02     // Catch: org.json.JSONException -> L30
            r304 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L30
            r306 = r0
            goto L27
        L1f:
            r0 = 0
            r303 = r0
        L22:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L27:
            r0 = r306
            if (r0 == 0) goto L2e
            r0 = r303
            return r0
        L2e:
            r0 = 0
            return r0
        L30:
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.A03(java.lang.String):org.json.JSONObject");
    }

    public static void A04(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, String str) {
        if (autofillSharedJSBridgeProxy.A07() != null) {
            autofillSharedJSBridgeProxy.A02 = 1BK.A0t();
            BusinessExtensionJSBridgeCall businessExtensionJSBridgeCall = new BusinessExtensionJSBridgeCall(autofillSharedJSBridgeProxy.A07(), autofillSharedJSBridgeProxy.A08(), BusinessExtensionJSBridgeCall.A02(DKC.A1F(str)), autofillSharedJSBridgeProxy.A0A(), "getNonce", autofillSharedJSBridgeProxy.A0B());
            C11424wg c11424wg = autofillSharedJSBridgeProxy.A06.A00;
            11T.A0F(c11424wg, 1);
            Jsp jsp = c11424wg.A07;
            jsp.A01 = businessExtensionJSBridgeCall.Aaz();
            jsp.A00 = businessExtensionJSBridgeCall.A05;
            jsp.A02 = businessExtensionJSBridgeCall.A06;
            String Aaz = businessExtensionJSBridgeCall.Aaz();
            String str2 = autofillSharedJSBridgeProxy.A02;
            JSONObject A12 = AnonymousClass001.A12();
            try {
                A12.put("nonce", str2);
            } catch (JSONException e) {
                LCd.A02("GetNonceJSBridgeCall", "Failed to set nonce result", e, new Object[]{e});
            }
            autofillSharedJSBridgeProxy.A0G(BusinessExtensionJSBridgeCall.A01(Aaz, A12));
            C3243Jnf A0S = JQz.A0S(autofillSharedJSBridgeProxy.A09);
            if (A0S != null) {
                autofillSharedJSBridgeProxy.A01 = null;
                autofillSharedJSBridgeProxy.A00 = 0;
                c11424wg.A01.A05 = 1BK.A0t();
                A0S.A0K = null;
                A0S.A0B = null;
            }
        }
    }

    private void A05(Integer num, String str) {
        String str2;
        try {
            Bundle A01 = BusinessExtensionJSBridgeCall.A01(null, DKC.A1F(str));
            String str3 = this.A03;
            String string = A01.getString("callback_result");
            switch (num.intValue()) {
                case 0:
                    str2 = "setJsExperimentValues";
                    break;
                case 1:
                    str2 = "setContactAutofillValueInAllFramesForIABIOS";
                    break;
                default:
                    str2 = "sendJsPing";
                    break;
            }
            L2P l2p = new L2P(str3, "", string, str2, true);
            String str4 = this.A03;
            11T.A0F(str4, 0);
            if (Kbr.A00.contains(str4)) {
                AbstractC3252Jnp A09 = A09();
                if (A09 != null) {
                    ((SystemWebView) A09).A03.post(new Ln0(l2p, A09));
                }
            }
        } catch (JSONException e) {
            0fH.A0p("AutofillSharedJSBridgeProxy", "Error parsing JSON passed to callJsBridgeFunction", e);
        }
    }

    private void A06(String str) {
        C3243Jnf A0S = JQz.A0S(this.A09);
        if (A0S != null) {
            LEA.A07(A0S.A06(), this.A06, this.A05.A03(str, false).A01());
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall, com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall] */
    public SaveAutofillDataJSBridgeCall A0F(JSONObject jSONObject) {
        C3243Jnf A0S = JQz.A0S(this.A09);
        if (A0S != null) {
            A0S.A0i.put(LDu.A01(A0S.A0c.A00.A08.A01), A00(jSONObject));
        }
        Context A07 = A07();
        String A0A = A0A();
        return new BusinessExtensionJSBridgeCall(A07, A08(), SaveAutofillDataJSBridgeCall.A00(jSONObject), A0A, "saveAutofillData", A0B());
    }

    public void A0G(Bundle bundle) {
        L2P l2p;
        Jsp jsp = this.A06.A00.A07;
        String str = jsp.A00;
        if (str != null) {
            if (str.equals("getNonce")) {
                l2p = BusinessExtensionJSBridgeCall.A03(bundle, this.A03);
            } else if (str.equals("requestAutoFill")) {
                l2p = BusinessExtensionJSBridgeCall.A03(bundle, this.A03);
                A05(0S2.A01, bundle.getString("callback_result"));
            } else {
                0fH.A14("AutofillSharedJSBridgeProxy", "No valid callback found for call: %s", new Object[]{str});
                l2p = null;
            }
            String str2 = jsp.A02;
            String str3 = this.A03;
            11T.A0F(str3, 1);
            AbstractC3252Jnp A09 = A09();
            if (A09 == null || l2p == null) {
                return;
            }
            ((SystemWebView) A09).A03.post(new Lqq(this, l2p, A09, str2, str3));
        }
    }

    public void autofillAppliedStatusesV2(String str) {
        JSONObject A03 = A03(str);
        if (A03 == null) {
            0fH.A0j("AutofillSharedJSBridgeProxy", "Invalid message format for autofillAppliedStatusesV2");
            return;
        }
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("DETECTION_SOURCE", "jsSdk");
        JSONArray jSONArray = A03.getJSONArray("autofillAppliedStatuses");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            A0u2.put(jSONObject.getString("autoCompleteTag"), jSONObject.getString("autofillStatus"));
        }
        A0u.put("autofillAppliedStatuses", new Gson().A07(A0u2, A0u2.getClass()));
        L8t l8t = this.A05;
        C3243Jnf A0S = JQz.A0S(l8t.A00);
        if (A0S != null) {
            Ktt A032 = l8t.A03("AUTOFILL_APPLY_COMPLETED", false);
            A032.A03(A0u);
            A032.A06 = A0S.A0H;
            A032.A07 = A0S.A0I;
            A032.A0F = A0S.A0J;
            LDF.A00().A0B((Bundle) null, A032.A01().A01());
        }
    }

    public void formSubmitted(String str) {
        C3243Jnf A0S;
        if (A03(str) == null || (A0S = JQz.A0S(this.A09)) == null) {
            return;
        }
        String A0B = A0B();
        LET let = A0S.A03;
        if (let != null) {
            AutofillData A00 = C3243Jnf.A00(let, A0S);
            let.A08 = 0S2.A0N;
            let.A0T(A00, A0B, false);
        }
    }

    public void getNonce(String str) {
        A04(this, str);
    }

    public void hideAutoFillBar(String str) {
        JSONObject A03 = A03(str);
        if (A03 != null) {
            Context A07 = A07();
            String A0A = A0A();
            KVf.A00(new BusinessExtensionJSBridgeCall(A07, A08(), BusinessExtensionJSBridgeCall.A02(A03), A0A, "hideAutoFillBar", A0B()), this.A08);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (r0.A09() != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initializeCallbackHandler(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy.initializeCallbackHandler(java.lang.String):void");
    }

    public void jsPing(String str) {
        JSONObject A03 = A03(str);
        if (A03 == null) {
            0fH.A0j("AutofillSharedJSBridgeProxy", "Invalid message format for jsPing");
        } else {
            this.A06.A02.A04(A03);
        }
    }

    public void jsQPL(String str) {
        JSONObject A03 = A03(str);
        if (A03 == null) {
            0fH.A0j("AutofillSharedJSBridgeProxy", "Invalid message format for jsQPL");
        } else {
            this.A06.A02.A04(A03);
        }
    }

    public void notifyAutofillFocusoutEventV2(String str) {
        JSONObject A03 = A03(str);
        if (A03 == null) {
            0fH.A0j("AutofillSharedJSBridgeProxy", "Invalid message format for notifyAutofillFocusoutEventV2");
            return;
        }
        String optString = A03.optString("action");
        String optString2 = A03.optString("fieldName");
        String optString3 = A03.optString("fieldNameScenario");
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(optString2, optString3);
        if (!optString.equals("FILL_FIELD_END") && !optString.equals("EDIT_FIELD_END")) {
            throw AnonymousClass001.A0L("Notify focus out event action is not supported");
        }
        C11444wi c11444wi = this.A06.A01;
        C11444wi.A01(null, c11444wi, optString, JR1.A0w(L9H.A00(c11444wi.A00)), A0u);
    }

    public void requestAutoFill(String str) {
        C3243Jnf A0S;
        String str2;
        C11474wl c11474wl = this.A06;
        1CO r0 = c11474wl.A04.A00;
        if (2yD.A03(r0, 36311839672700481L) || (A0S = JQz.A0S(this.A09)) == null) {
            return;
        }
        A06(4YT.A00(657));
        C11454wj c11454wj = c11474wl.A02;
        Integer A00 = c11454wj.A00(null, 772805755, 0);
        c11454wj.A03(A00, "prompt_type", "CONTACT_AUTOFILL", 772805755);
        JSONObject A03 = A03(str);
        if (A03 == null) {
            this.A05.A05(A0S.A06(), 0S2.A01, null);
            c11454wj.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
            c11454wj.A01(A00, null, 772805755);
            KoZ koZ = this.A07;
            String A0j = 0Pz.A0j(str, ";\n nonce: ", this.A02);
            11T.A0F(A0j, 0);
            koZ.A00.ACu(A0j, 772816852).report();
            return;
        }
        if (this.A01 == null) {
            this.A01 = AnonymousClass002.A0G();
            Ktt A01 = L8t.A01(this.A05, "FIRST_FORM_INTERACTION");
            A01.A0A = c11474wl.A00.A01.A05;
            try {
                JSONArray jSONArray = new JSONArray(A03.getString("allFields"));
                ArrayList A0s = AnonymousClass001.A0s();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    A0s.add(jSONArray.getString(i));
                }
                0RC.A0x(A0s);
                str2 = TextUtils.join(", ", A0s);
            } catch (JSONException e) {
                LCd.A02("AutofillSharedUtil", "Failed to parseAllFields", e, new Object[]{e});
                str2 = null;
            }
            A01.A06 = str2;
            A01.A0F = A01(A03);
            A01.A0G = A02(A03);
            A01.A08 = A0B();
            LEA.A0B(c11474wl, A0S, A01);
            A0S.A0E = this.A01;
            r0.AZk(36311839670079012L);
        }
        Intent intent = this.A04;
        if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
            DKC.A1I(A07(), "requestAutofill", 0);
            Log.d("autofill", 0Pz.A0W("requestAutofill: ", str));
        }
        if (!7kQ.A00(c11474wl.A00)) {
            this.A05.A05(A0S.A06(), 0S2.A0C, A02(A03));
            c11454wj.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
            c11454wj.A01(A00, null, 772805755);
        } else {
            Bundle A05 = A08() == null ? 1BK.A05() : (Bundle) A08().clone();
            A05.putInt("instanceKey", A00 != null ? A00.intValue() : 0);
            KVf.A00(new BrowserLiteJSBridgeCall(A07(), A05, RequestAutofillJSBridgeCall.A00(A03), A0A(), "requestAutoFill", A0B()), this.A08);
        }
    }

    public void saveAutofillData(String str) {
        Bundle bundle;
        C3243Jnf A0S = JQz.A0S(this.A09);
        if (A0S != null) {
            A06("JS_SAVE_AUTOFILL_DATA");
            C11474wl c11474wl = this.A06;
            C11454wj c11454wj = c11474wl.A02;
            Integer A00 = c11454wj.A00(null, 772805755, 0);
            c11454wj.A03(A00, "prompt_type", "SAVE_CONTACT_AUTOFILL", 772805755);
            JSONObject A03 = A03(str);
            if (A03 == null) {
                c11454wj.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c11454wj.A01(A00, null, 772805755);
                return;
            }
            Long l = this.A01;
            Long valueOf = Long.valueOf(l == null ? 0L : System.currentTimeMillis() - l.longValue());
            Ktt A01 = L8t.A01(this.A05, "FORM_COMPLETION");
            A01.A02 = valueOf.longValue();
            int i = this.A00 + 1;
            this.A00 = i;
            A01.A00 = i;
            C11424wg c11424wg = c11474wl.A00;
            A01.A0A = c11424wg.A01.A05;
            A01.A08 = A0B();
            A01.A06 = A01(A03);
            A01.A0F = A01(A03);
            A01.A0G = A02(A03);
            LEA.A0B(c11474wl, A0S, A01);
            Intent intent = this.A04;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                DKC.A1I(A07(), "saveAutofillData", 0);
                Log.d("autofill", 0Pz.A0W("saveAutofillData: ", str));
            }
            if (!7kQ.A00(c11424wg)) {
                c11454wj.A03(A00, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c11454wj.A01(A00, null, 772805755);
                return;
            }
            AutofillData A002 = A00(A03);
            A0S.A0A = A002;
            if (A03.has("autofillFields")) {
                try {
                    bundle = RequestAutofillJSBridgeCall.A00(A03);
                } catch (JSONException unused) {
                    bundle = Bundle.EMPTY;
                }
            } else {
                bundle = Bundle.EMPTY;
            }
            A0S.A0A(bundle, this, A002, A00);
        }
    }

    public void selectedContactFieldTag(String str) {
    }
}
