package X;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.secure.securewebview.SecureWebView;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: E9a.class */
public final class E9a extends SecureWebView implements GKb {
    public int A00;
    public long A01;
    public long A02;
    public Context A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public FAX A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;

    public E9a(Context context, Context context2) {
        super(context, null, 0);
        Er6 er6;
        this.A0H = false;
        this.A01 = 0L;
        this.A02 = 0L;
        this.A00 = 0;
        this.A0I = false;
        this.A0G = false;
        this.A0L = DKG.A0Q();
        this.A0J = 1BQ.A01();
        this.A0K = 1BQ.A02(98331);
        C0fs c0fs = new C0fs();
        c0fs.A02();
        super.A01 = c0fs.A01();
        this.A0B = 1BQ.A02(84488);
        this.A03 = context2;
        this.A04 = AbH.A0K();
        this.A0E = 1BV.A00(148171);
        this.A06 = 1BQ.A02(83601);
        this.A08 = 1BV.A00(98405);
        this.A05 = 1BQ.A02(83426);
        this.A0D = 1BV.A00(100159);
        this.A0C = DKG.A0R(context2);
        1HH A0Q = AbF.A0Q(context2, 82751);
        this.A09 = A0Q;
        this.A0A = AbF.A0Q(context2, 98342);
        this.A07 = AbF.A0Q(context2, 98406);
        this.A0F = ((F6C) A0Q.get()).A00;
        if ((getContext().getApplicationInfo().flags & 2) != 0 || ((er6 = this.A0F.A03) != null && er6.A0x)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void A00(String str, Object obj) {
        if (this.A0H) {
            return;
        }
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A12.put("content", obj);
            A12.put(Property.SYMBOL_Z_ORDER_SOURCE, "android");
        } catch (JSONException e) {
            ((FIT) 4YU.A0p(this.A0C)).A0I("send_message_error", "Unexpected exception while constructing JSONObject to be dispatched to Javascript.", e);
        }
        ((1GU) 4YU.A0p(this.A04)).Ciz(new G2u(this, A12));
    }

    @Override // X.GKb
    public boolean BUH() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a7, code lost:
    
        if (r0.A00().A01(X.C0A2.A03(r306)) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v161, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.E9a, java.lang.Object, android.webkit.WebView] */
    @Override // X.GKb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BYe(java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9a.BYe(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.GKb
    public void Ccf(String str, String str2, String str3) {
        if (this.A0H) {
            return;
        }
        JSONObject A12 = AnonymousClass001.A12();
        try {
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("code", str3);
            A122.put("message", str2);
            A12.put("promiseID", str);
            A12.put("data", A122);
            Ckm(EOz.A0H, A12);
        } catch (JSONException e) {
            ((FIT) 4YU.A0p(this.A0C)).A0I("send_message_error", "Unexpected exception while constructing JSONObject to be dispatched to Javascript.", e);
        }
    }

    @Override // X.GKb
    public void Ci7(String str, Object obj) {
        if (this.A0H) {
            return;
        }
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("promiseID", str);
            A12.put("data", obj);
            Ckm(EOz.A0K, A12);
        } catch (JSONException e) {
            ((FIT) 4YU.A0p(this.A0C)).A0I("send_message_error", "Unexpected exception while constructing JSONObject to be dispatched to Javascript.", e);
            Ccf(str, "Internal error while trying to resolve the promise.", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        }
    }

    @Override // X.GKb
    public void Ckl(EOz eOz) {
        if (this.A0H) {
            return;
        }
        Ckm(eOz, "");
    }

    @Override // X.GKb
    public void Ckm(EOz eOz, Object obj) {
        A00(eOz.toString(), obj);
    }

    @Override // X.GKb
    public void Cqq(boolean z) {
    }

    @Override // X.GKb
    public void D0L(boolean z) {
        A00("OPEN_SOFT_KEYBOARD", "");
    }

    @Override // android.webkit.WebView, X.GKb
    public void destroy() {
        if (this.A0H) {
            return;
        }
        this.A0H = true;
        0fH.A0j("instant_games_onDestroy", String.valueOf(Thread.currentThread().equals(DKD.A10())));
        removeJavascriptInterface("QuicksilverAndroid");
        super.destroy();
    }

    @Override // android.webkit.WebView, X.GKb
    public void onPause() {
        if (this.A0H) {
            return;
        }
        super.onPause();
        Ckl(EOz.A0B);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-590966509);
        if (!this.A0G && this.A01 != 0) {
            this.A0G = true;
            ((FIT) 4YU.A0p(this.A0C)).A0C("webview_first_user_interaction");
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-905827712, A05);
        return onTouchEvent;
    }
}
