package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.secure.securewebview.SecureWebView;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: E9Z.class */
public abstract class E9Z extends SecureWebView {
    public E1r A00;
    public GGL A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;

    public E9Z(Context context) {
        super(context, null);
        this.A01 = FqM.A00;
        this.A03 = AnonymousClass001.A0s();
        this.A07 = new Handler();
        A00();
    }

    public E9Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A01 = FqM.A00;
        this.A03 = AnonymousClass001.A0s();
        this.A07 = new Handler();
        A00();
    }

    public E9Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = FqM.A00;
        this.A03 = AnonymousClass001.A0s();
        this.A07 = new Handler();
        A00();
    }

    private final void A00() {
        C0fs c0fs = new C0fs();
        c0fs.A02();
        super.A01 = c0fs.A01();
        setFocusable(true);
        setFocusableInTouchMode(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        getSettings().setSupportZoom(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        A06(new E9b(this, 2));
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(-1);
    }

    public final void A08(EOz eOz, Object obj) {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, eOz.toString());
            A12.put("content", obj);
            A12.put(Property.SYMBOL_Z_ORDER_SOURCE, "android");
            this.A07.post(new G2w(this, A12));
        } catch (JSONException unused) {
            String A0Z = AnonymousClass001.A0Z(eOz, "Unexpected exception while constructing JSONObject to be dispatched to Javascript: ", AnonymousClass001.A0k());
            11T.A0F(A0Z, 1);
            Exception exc = new Exception();
            ((ERc) exc).logMessage = A0Z;
            throw exc;
        }
    }

    public final void A09(String str, String str2, String str3) {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("code", str3);
            A122.put("message", str2);
            A12.put("promiseID", str);
            A12.put("data", A122);
            A08(EOz.A0H, A12);
        } catch (JSONException unused) {
            Exception exc = new Exception();
            ((ERc) exc).logMessage = "Unexpected exception while constructing JSONObject to be dispatched to Javascript: rejectPromise";
            throw exc;
        }
    }

    public final void A0A(String str, List list) {
        this.A04 = false;
        this.A06 = false;
        this.A01.BaC("game_url_load_started");
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("Referer", str);
        0fH.A0n("QuicksilverWebViewActivity", "Before load");
        if (list == null) {
            loadUrl(str, A0u);
        } else {
            SecureWebView.A04(this, 16E.A00, str, list, A0u);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1385922162);
        11T.A0F(motionEvent, 0);
        if (!this.A06 && this.A04) {
            this.A06 = true;
            this.A01.BaC("webview_first_user_interaction");
        }
        if (this.A05) {
            ViewParent parent = getParent();
            11T.A0I(parent, 7zK.A00(0));
            ViewGroup viewGroup = (ViewGroup) parent;
            int action = motionEvent.getAction();
            if (action == 0) {
                viewGroup.requestDisallowInterceptTouchEvent(true);
            } else if (action == 1 || action == 3) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-1175665964, A05);
        return onTouchEvent;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        int A06 = 0FI.A06(1483105426);
        if (i != 8) {
            super.onWindowVisibilityChanged(0);
        }
        0FI.A0C(-767418557, A06);
    }
}
