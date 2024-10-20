package com.facebook.browserextensions.ipc;

import X.0FI;
import X.AbE;
import X.AnonymousClass001;
import X.DKC;
import X.DKf;
import X.JQz;
import X.KVf;
import X.LCd;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.InitJSBridgeCallData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: BrowserExtensionsJSBridgeProxy.class */
public final class BrowserExtensionsJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public static final Parcelable.Creator CREATOR = new DKf(56);
    public String A00;
    public final MessengerExtensionsJSBridgeCallbackHandler A01;

    /* loaded from: BrowserExtensionsJSBridgeProxy$MessengerExtensionsJSBridgeCallbackHandler.class */
    public final class MessengerExtensionsJSBridgeCallbackHandler extends BrowserLiteJSBridgeCallback.Stub {
        public /* synthetic */ MessengerExtensionsJSBridgeCallbackHandler() {
            0FI.A09(-1315797140, 0FI.A03(1108749891));
            0FI.A09(-1902128817, 0FI.A03(1225823455));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:273:0x0797, code lost:
        
            if (r317 != null) goto L351;
         */
        /* JADX WARN: Code restructure failed: missing block: B:277:0x055f, code lost:
        
            if (r0.equals("init") == false) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:269:0x05ac A[Catch: Exception -> 0x0819, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0819, blocks: (B:6:0x001f, B:8:0x002a, B:10:0x0036, B:11:0x003d, B:16:0x004b, B:19:0x005a, B:22:0x008c, B:23:0x0091, B:24:0x0098, B:25:0x009f, B:27:0x00ac, B:29:0x00b2, B:31:0x00bd, B:37:0x0069, B:38:0x0070, B:40:0x0085, B:42:0x00c9, B:44:0x00d2, B:46:0x00d5, B:47:0x00da, B:48:0x00e1, B:52:0x01a4, B:54:0x01b7, B:57:0x06c3, B:60:0x06cf, B:62:0x06dc, B:66:0x06ef, B:68:0x06f8, B:69:0x06fd, B:72:0x070e, B:74:0x07eb, B:76:0x07f6, B:79:0x0674, B:82:0x0680, B:84:0x068d, B:89:0x06a0, B:90:0x06a7, B:92:0x06b4, B:95:0x01da, B:98:0x01e6, B:100:0x01f1, B:102:0x01fa, B:104:0x0205, B:106:0x0212, B:107:0x0219, B:110:0x0225, B:111:0x022a, B:135:0x0512, B:137:0x052a, B:139:0x0537, B:144:0x050a, B:151:0x02d1, B:154:0x02dd, B:156:0x02ea, B:160:0x02fc, B:162:0x0309, B:163:0x0310, B:171:0x0337, B:172:0x033e, B:174:0x034b, B:178:0x035a, B:180:0x0365, B:182:0x0373, B:185:0x037f, B:187:0x038a, B:189:0x0393, B:191:0x039e, B:193:0x03ab, B:194:0x03b2, B:197:0x03be, B:266:0x05a0, B:269:0x05ac, B:271:0x05b5, B:275:0x0556, B:279:0x056c, B:282:0x0578, B:284:0x0585, B:292:0x05d6, B:295:0x05e2, B:297:0x05ed, B:299:0x05f6, B:301:0x0601, B:303:0x060f, B:309:0x0658, B:311:0x0665, B:321:0x0647, B:325:0x071d, B:328:0x0729, B:330:0x0736, B:335:0x0767, B:338:0x0771, B:340:0x077a, B:342:0x0781, B:343:0x0786, B:345:0x078f, B:347:0x074a, B:348:0x074f, B:351:0x0760, B:353:0x07a4, B:356:0x07b0, B:358:0x07bd, B:362:0x07d0, B:363:0x07d7, B:365:0x07e4, B:367:0x0807, B:369:0x0811, B:313:0x061e, B:315:0x0627, B:317:0x062f, B:166:0x031f, B:168:0x0329), top: B:2:0x0012, inners: #0, #4, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x06cf A[Catch: Exception -> 0x0819, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0819, blocks: (B:6:0x001f, B:8:0x002a, B:10:0x0036, B:11:0x003d, B:16:0x004b, B:19:0x005a, B:22:0x008c, B:23:0x0091, B:24:0x0098, B:25:0x009f, B:27:0x00ac, B:29:0x00b2, B:31:0x00bd, B:37:0x0069, B:38:0x0070, B:40:0x0085, B:42:0x00c9, B:44:0x00d2, B:46:0x00d5, B:47:0x00da, B:48:0x00e1, B:52:0x01a4, B:54:0x01b7, B:57:0x06c3, B:60:0x06cf, B:62:0x06dc, B:66:0x06ef, B:68:0x06f8, B:69:0x06fd, B:72:0x070e, B:74:0x07eb, B:76:0x07f6, B:79:0x0674, B:82:0x0680, B:84:0x068d, B:89:0x06a0, B:90:0x06a7, B:92:0x06b4, B:95:0x01da, B:98:0x01e6, B:100:0x01f1, B:102:0x01fa, B:104:0x0205, B:106:0x0212, B:107:0x0219, B:110:0x0225, B:111:0x022a, B:135:0x0512, B:137:0x052a, B:139:0x0537, B:144:0x050a, B:151:0x02d1, B:154:0x02dd, B:156:0x02ea, B:160:0x02fc, B:162:0x0309, B:163:0x0310, B:171:0x0337, B:172:0x033e, B:174:0x034b, B:178:0x035a, B:180:0x0365, B:182:0x0373, B:185:0x037f, B:187:0x038a, B:189:0x0393, B:191:0x039e, B:193:0x03ab, B:194:0x03b2, B:197:0x03be, B:266:0x05a0, B:269:0x05ac, B:271:0x05b5, B:275:0x0556, B:279:0x056c, B:282:0x0578, B:284:0x0585, B:292:0x05d6, B:295:0x05e2, B:297:0x05ed, B:299:0x05f6, B:301:0x0601, B:303:0x060f, B:309:0x0658, B:311:0x0665, B:321:0x0647, B:325:0x071d, B:328:0x0729, B:330:0x0736, B:335:0x0767, B:338:0x0771, B:340:0x077a, B:342:0x0781, B:343:0x0786, B:345:0x078f, B:347:0x074a, B:348:0x074f, B:351:0x0760, B:353:0x07a4, B:356:0x07b0, B:358:0x07bd, B:362:0x07d0, B:363:0x07d7, B:365:0x07e4, B:367:0x0807, B:369:0x0811, B:313:0x061e, B:315:0x0627, B:317:0x062f, B:166:0x031f, B:168:0x0329), top: B:2:0x0012, inners: #0, #4, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0680 A[Catch: Exception -> 0x0819, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0819, blocks: (B:6:0x001f, B:8:0x002a, B:10:0x0036, B:11:0x003d, B:16:0x004b, B:19:0x005a, B:22:0x008c, B:23:0x0091, B:24:0x0098, B:25:0x009f, B:27:0x00ac, B:29:0x00b2, B:31:0x00bd, B:37:0x0069, B:38:0x0070, B:40:0x0085, B:42:0x00c9, B:44:0x00d2, B:46:0x00d5, B:47:0x00da, B:48:0x00e1, B:52:0x01a4, B:54:0x01b7, B:57:0x06c3, B:60:0x06cf, B:62:0x06dc, B:66:0x06ef, B:68:0x06f8, B:69:0x06fd, B:72:0x070e, B:74:0x07eb, B:76:0x07f6, B:79:0x0674, B:82:0x0680, B:84:0x068d, B:89:0x06a0, B:90:0x06a7, B:92:0x06b4, B:95:0x01da, B:98:0x01e6, B:100:0x01f1, B:102:0x01fa, B:104:0x0205, B:106:0x0212, B:107:0x0219, B:110:0x0225, B:111:0x022a, B:135:0x0512, B:137:0x052a, B:139:0x0537, B:144:0x050a, B:151:0x02d1, B:154:0x02dd, B:156:0x02ea, B:160:0x02fc, B:162:0x0309, B:163:0x0310, B:171:0x0337, B:172:0x033e, B:174:0x034b, B:178:0x035a, B:180:0x0365, B:182:0x0373, B:185:0x037f, B:187:0x038a, B:189:0x0393, B:191:0x039e, B:193:0x03ab, B:194:0x03b2, B:197:0x03be, B:266:0x05a0, B:269:0x05ac, B:271:0x05b5, B:275:0x0556, B:279:0x056c, B:282:0x0578, B:284:0x0585, B:292:0x05d6, B:295:0x05e2, B:297:0x05ed, B:299:0x05f6, B:301:0x0601, B:303:0x060f, B:309:0x0658, B:311:0x0665, B:321:0x0647, B:325:0x071d, B:328:0x0729, B:330:0x0736, B:335:0x0767, B:338:0x0771, B:340:0x077a, B:342:0x0781, B:343:0x0786, B:345:0x078f, B:347:0x074a, B:348:0x074f, B:351:0x0760, B:353:0x07a4, B:356:0x07b0, B:358:0x07bd, B:362:0x07d0, B:363:0x07d7, B:365:0x07e4, B:367:0x0807, B:369:0x0811, B:313:0x061e, B:315:0x0627, B:317:0x062f, B:166:0x031f, B:168:0x0329), top: B:2:0x0012, inners: #0, #4, #6 }] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void BmG(android.os.Bundle r302, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r303, int r304) {
            /*
                Method dump skipped, instructions count: 2122
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.browserextensions.ipc.BrowserExtensionsJSBridgeProxy.MessengerExtensionsJSBridgeCallbackHandler.BmG(android.os.Bundle, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, int):void");
        }
    }

    public BrowserExtensionsJSBridgeProxy() {
        super.A01 = "_FBExtensions";
        this.A01 = new MessengerExtensionsJSBridgeCallbackHandler();
    }

    public BrowserExtensionsJSBridgeProxy(Parcel parcel) {
        super(parcel);
        this.A01 = new MessengerExtensionsJSBridgeCallbackHandler();
    }

    public static Bundle A00(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        bundle.putString("callbackID", jSONObject.getString("callbackID"));
        return bundle;
    }

    private void A01(BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        try {
            KVf.A00(browserLiteJSBridgeCall, this.A01);
        } catch (Exception e) {
            LCd.A02("BrowserExtensionsJSBridgeProxy", "Exception when invoking %s call!", e, new Object[]{browserLiteJSBridgeCall.A05});
            throw e;
        }
    }

    private boolean A02() {
        if (A07() != null) {
            return true;
        }
        LCd.A01("BrowserExtensionsJSBridgeProxy", "Exception when invoking bridge call", AnonymousClass001.A0T(AbE.A00(258)));
        return false;
    }

    public void askPermission(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "permission", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "askPermission", A0B));
        }
    }

    public void canMakePayment(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "canMakePayment", A0B()));
        }
    }

    public void getContext(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "appID", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "getContext", A0B));
        }
    }

    public void getEnvironment(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "getEnvironment", A0B()));
        }
    }

    public void getGrantedPermissions(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "getGrantedPermissions", A0B()));
        }
    }

    public void getSupportedFeatures(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "getSupportedFeatures", A0B()));
        }
    }

    public void getUserContext(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "appID", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "getUserContext", A0B));
        }
    }

    public void getUserID(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "getUserID", A0B()));
        }
    }

    public void getVersion(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "getVersion", A0B()));
        }
    }

    public void hasCapability(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "capabilities", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "hasCapability", A0B));
        }
    }

    public void hideAutoFillBar(String str) {
        if (A07() != null) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), BusinessExtensionJSBridgeCall.A02(DKC.A1F(str)), A0A, "hideAutoFillBar", A0B()));
        }
    }

    public void init(String str) {
        String str2;
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A02 = BusinessExtensionJSBridgeCall.A02(A1F);
            try {
                str2 = A1F.getString("appId");
            } catch (JSONException e) {
                LCd.A02("InitJSBridgeCall", "Failed to get app ID", e, new Object[]{e});
                str2 = null;
            }
            A02.putParcelable("initData", new InitJSBridgeCallData(str2));
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A02, A0A, "init", A0B));
        }
    }

    public void initializeCallbackHandler(String str) {
        try {
            this.A00 = DKC.A1F(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        } catch (Exception e) {
            LCd.A01("BrowserExtensionsJSBridgeProxy", "Exception when invoking setupCallbackHandler call!", e);
            throw e;
        }
    }

    public void paymentsCheckout(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "configuration", A1F);
            JQz.A15(A00, "receiver_id", A1F.getJSONObject("configuration").getJSONObject("checkout_configuration").getJSONObject("payment_info"));
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "paymentsCheckout", A0B));
        }
    }

    public void paymentsCheckoutChargeRequestErrorReturn(String str) {
    }

    public void paymentsCheckoutChargeRequestSuccessReturn(String str) {
    }

    public void paymentsCheckoutChargeRequestUnknownReturn(String str) {
    }

    public void paymentsCheckoutShippingAddressReturn(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            A00.putBoolean("isShippingAddressUpdate", true);
            A00.putString("errorMessage", A1F.optString("errorMessage"));
            A00.putString("contentConfiguration", A1F.optString("contentConfiguration"));
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "paymentShippingChange", A0B));
        }
    }

    public void paymentsCheckoutShippingOptionReturn(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            A00.putBoolean("isShippingAddressUpdate", false);
            A00.putString("errorMessage", A1F.optString("errorMessage"));
            A00.putString("contentConfiguration", A1F.optString("contentConfiguration"));
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "paymentShippingChange", A0B));
        }
    }

    public void processPayment(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "amount", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "processPayment", A0B));
        }
    }

    public void purchaseComplete(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "amount", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "purchase_complete", A0B));
        }
    }

    public void requestAuthorizedCredentials(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "amount", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "requestAuthorizedCredentials", A0B));
        }
    }

    public void requestAutoFill(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), RequestAutofillJSBridgeCall.A00(DKC.A1F(str)), A0A, "requestAutoFill", A0B()));
        }
    }

    public void requestCloseBrowser(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "requestCloseBrowser", A0B()));
        }
    }

    public void requestCredentials(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "title", A1F);
            JQz.A15(A00, AbE.A00(178), A1F);
            JQz.A15(A00, "amount", A1F);
            if (A1F.has("requestedUserInfo") && !A1F.isNull("requestedUserInfo")) {
                try {
                    JSONArray jSONArray = A1F.getJSONArray("requestedUserInfo");
                    ArrayList A0s = AnonymousClass001.A0s();
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        A0s.add(jSONArray.get(i).toString());
                        i++;
                    }
                    A00.putSerializable("requestedUserInfo", A0s);
                } catch (Exception e) {
                    LCd.A01("requestCredentials", "Exception de-serializing requested user params!", e);
                }
            }
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "requestCredentials", A0B));
        }
    }

    public void resetCart(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), A00(DKC.A1F(str)), A0A, "resetCart", A0B()));
        }
    }

    public void saveAutofillData(String str) {
        if (A07() != null) {
            Context A07 = A07();
            String A0A = A0A();
            A01(new BusinessExtensionJSBridgeCall(A07, A08(), SaveAutofillDataJSBridgeCall.A00(DKC.A1F(str)), A0A, "saveAutofillData", A0B()));
        }
    }

    public void updateCart(String str) {
        if (A02()) {
            Context A07 = A07();
            String A0A = A0A();
            Bundle A08 = A08();
            String A0B = A0B();
            JSONObject A1F = DKC.A1F(str);
            Bundle A00 = A00(A1F);
            JQz.A15(A00, "itemCount", A1F);
            JQz.A15(A00, "cartURL", A1F);
            JQz.A15(A00, "expiry", A1F);
            A01(new BusinessExtensionJSBridgeCall(A07, A08, A00, A0A, "updateCart", A0B));
        }
    }
}
