package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.facebook.AutofillController$4;
import com.facebook.browser.lite.extensions.autofill.facebook.AutofillController$FacebookAutofillOptOutCallbackHandler;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.common.callercontext.CallerContext;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* renamed from: X.Jnf, reason: case insensitive filesystem */
/* loaded from: Jnf.class */
public final class C3243Jnf extends L5Y implements MNr, MNt, MNs {
    public int A00;
    public long A01;
    public 0D2 A02;
    public LET A03;
    public Kvg A04;
    public AutofillSharedJSBridgeProxy A05;
    public C3216Jmt A06;
    public C3217Jmu A07;
    public KuT A08;
    public KWA A09;
    public AutofillData A0A;
    public RequestAutofillJSBridgeCall A0B;
    public EzN A0C;
    public KYt A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public TreeSet A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final L2a A0a;
    public final L8t A0b;
    public final C11474wl A0c;
    public final KoZ A0d;
    public final String A0e;
    public final java.util.Map A0f;
    public final java.util.Map A0g;
    public final java.util.Map A0h;
    public final java.util.Map A0i;
    public final java.util.Map A0j;

    public C3243Jnf(Kvg kvg, C11474wl c11474wl, KWA kwa, KYt kYt, java.util.Map map) {
        KoZ koZ = new KoZ((AnonymousClass046) 1Bn.A0H(AnonymousClass046.class, (Class) null));
        this.A0j = AnonymousClass001.A0u();
        this.A0W = false;
        this.A0S = false;
        this.A0P = false;
        this.A0R = false;
        this.A0Q = true;
        this.A00 = 0;
        this.A02 = null;
        this.A0X = false;
        this.A0M = false;
        this.A0N = false;
        this.A0Y = false;
        this.A0Z = false;
        this.A0E = null;
        this.A05 = null;
        this.A0L = null;
        this.A0V = false;
        this.A0T = false;
        this.A0U = false;
        this.A0c = c11474wl;
        this.A09 = kwa;
        this.A04 = kvg;
        this.A0g = new ConcurrentHashMap(map);
        this.A0f = AnonymousClass001.A0u();
        this.A0h = AnonymousClass001.A0u();
        this.A0i = AnonymousClass001.A0u();
        this.A0a = new L2a(7zL.A14(this));
        this.A0e = 1BK.A0t();
        this.A0b = new L8t(c11474wl, 7zL.A14(this));
        this.A0D = kYt;
        this.A0d = koZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r304 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.browser.lite.extensions.autofill.model.AutofillData A00(X.LET r301, X.C3243Jnf r302) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3243Jnf.A00(X.LET, X.Jnf):com.facebook.browser.lite.extensions.autofill.model.AutofillData");
    }

    public static L5Q A01(AbstractC3252Jnp abstractC3252Jnp) {
        JvO jvO = ((SystemWebView) abstractC3252Jnp).A03;
        Context context = jvO.getContext();
        L5Q A00 = KXg.A00(jvO, "", 5000);
        A00.A05(10);
        2Me A03 = 5YG.A03(context);
        JYg jYg = ((LBS) A00.A01).A0D;
        11T.A0A(jYg);
        jYg.setPadding(0, 0, 0, 0);
        View findViewById = jYg.findViewById(2131367431);
        11T.A0I(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        Drawable drawable = context.getDrawable(2132345158);
        drawable.setColorFilter(KVC.A00(0S2.A1J, A03.A01(2MR.A1x)));
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        return A00;
    }

    public static void A02(C3243Jnf c3243Jnf, AbstractC3252Jnp abstractC3252Jnp) {
        C11474wl c11474wl = c3243Jnf.A0c;
        C11454wj c11454wj = c11474wl.A02;
        boolean z = false;
        Integer A00 = c11454wj.A00(null, 772803659, 0);
        String A01 = LDu.A01(AbstractC3252Jnp.A02(abstractC3252Jnp, 0));
        String A012 = LDu.A01(abstractC3252Jnp.A08());
        if (TextUtils.isEmpty(A01) || TextUtils.isEmpty(A012)) {
            return;
        }
        Set set = (Set) c11474wl.A00.A0N.A00;
        if (set.contains(A01) || set.contains(A012)) {
            return;
        }
        c3243Jnf.A0W = false;
        C3216Jmt c3216Jmt = c3243Jnf.A06;
        if (c3216Jmt != null) {
            ((Kh2) c3216Jmt).A00 = 0S2.A0Y;
        }
        Intent intent = ((L5Y) c3243Jnf).A01;
        if (intent != null) {
            z = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false);
        }
        java.util.Map map = c3243Jnf.A0g;
        Boolean bool = (Boolean) map.get(A012);
        if (bool != null) {
            if (z) {
                DKC.A1I(((L5Y) c3243Jnf).A00, 0Pz.A1C("Autofill Opt Out: ", bool.booleanValue()), 0);
            }
            if (!bool.booleanValue()) {
                c3243Jnf.A0H(abstractC3252Jnp);
            }
        } else {
            LDF A002 = LDF.A00();
            AutofillController$FacebookAutofillOptOutCallbackHandler autofillController$FacebookAutofillOptOutCallbackHandler = new AutofillController$FacebookAutofillOptOutCallbackHandler(((L5Y) c3243Jnf).A00, c3243Jnf, abstractC3252Jnp, map, z);
            BrowserLiteCallback browserLiteCallback = A002.A06;
            if (browserLiteCallback != null) {
                try {
                    browserLiteCallback.BkM(autofillController$FacebookAutofillOptOutCallbackHandler, A012);
                } catch (RemoteException e) {
                    0fH.A0w("BrowserLiteCallbacker", "Error in onAutofillOptOutCall", e);
                }
            }
        }
        c11454wj.A01(A00, null, 772803659);
    }

    public static void A03(C3243Jnf c3243Jnf, AbstractC3252Jnp abstractC3252Jnp, int i) {
        L5Q A01 = A01(abstractC3252Jnp);
        String string = SystemWebView.A00(abstractC3252Jnp).getString(i);
        11T.A0F(string, 0);
        ((SnackbarContentLayout) ((LBS) A01.A01).A0D.getChildAt(0)).A01.setText(string);
        LKL lkl = new LKL(c3243Jnf, A01, 7);
        if (c3243Jnf.A0K()) {
            A01.A08(new K8N(c3243Jnf, abstractC3252Jnp));
        }
        A01.A07(lkl, 2131951859);
        A01.A03(-1);
        A01.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (A05(r301, new X.8Lt(r0, X.0S2.A0C, r0)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A04(X.C11424wg r301) {
        /*
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            java.lang.Integer r0 = X.0S2.A00
            r302 = r0
            X.8Lt r0 = new X.8Lt
            r303 = r0
            r0 = r303
            r1 = r302
            r2 = r302
            r3 = r302
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r303
            boolean r0 = A05(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3f
            java.lang.Integer r0 = X.0S2.A0C
            r305 = r0
            X.8Lt r0 = new X.8Lt
            r303 = r0
            r0 = r303
            r1 = r302
            r2 = r305
            r3 = r302
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r303
            boolean r0 = A05(r0, r1)
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L41
        L3f:
            r0 = 1
            r304 = r0
        L41:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3243Jnf.A04(X.4wg):boolean");
    }

    public static final boolean A05(C11424wg c11424wg, 8Lt r302) {
        String A01;
        List A12;
        boolean z = false;
        String str = c11424wg.A08.A01;
        if (str != null && (A01 = LDu.A01(str)) != null && (A12 = JQx.A12(A01, (java.util.Map) c11424wg.A0I.A01)) != null) {
            z = A12.contains(new 8Lu(r302, 0S2.A0N));
        }
        return z;
    }

    public Bundle A06() {
        Intent intent = ((L5Y) this).A01;
        if (intent != null) {
            return intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        }
        return null;
    }

    public Krp A07(boolean z, boolean z2) {
        boolean A0I = A0I();
        C11424wg c11424wg = this.A0c.A00;
        return new Krp(A0I, 7kQ.A00(c11424wg), AnonymousClass001.A1W(c11424wg.A0O.A00, EnumC11364wa.A03), z2, z);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.Ktt] */
    public void A08() {
        this.A0X = false;
        BrowserLiteCallback browserLiteCallback = LDF.A00().A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.Cok();
            } catch (RemoteException e) {
                0fH.A0w("BrowserLiteCallbacker", "Error in setHasShownFbPayDisclosure", e);
            }
        }
        C11474wl c11474wl = this.A0c;
        String str = c11474wl.A00.A08.A05;
        11T.A0H("FBPAY_DISCLOSURE_SHOWN", str);
        ?? obj = new Object();
        obj.A0I = "FBPAY_DISCLOSURE_SHOWN";
        obj.A0B = str;
        LEA.A0B(c11474wl, this, (Ktt) obj);
    }

    public void A09(Context context, Ktt ktt, Integer num, Integer num2, String str, List list) {
        L2a l2a = this.A0a;
        if (l2a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C11474wl c11474wl = this.A0c;
                l2a.A01(context, c11474wl.A02, c11474wl, null, ktt, num, num2, str, list);
            } else {
                C11474wl c11474wl2 = this.A0c;
                KxI.A00(new LrG(context, l2a, c11474wl2.A02, c11474wl2, (JgN) null, ktt, num, num2, str, list));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall] */
    public void A0A(Bundle bundle, AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, AutofillData autofillData, Integer num) {
        ?? businessExtensionJSBridgeCall = new BusinessExtensionJSBridgeCall(((L5Y) this).A00, null, bundle, "_AutofillExtensions", "requestAutoFill", "");
        this.A0B = businessExtensionJSBridgeCall;
        KVf.A00((BrowserLiteJSBridgeCall) businessExtensionJSBridgeCall, new AutofillController$4(autofillSharedJSBridgeProxy, this, autofillData, businessExtensionJSBridgeCall, num));
    }

    public void A0B(0D2 r302, Ktt ktt, Integer num, Integer num2, String str) {
        Dialog dialog;
        LET let;
        C11474wl c11474wl = this.A0c;
        C11424wg c11424wg = c11474wl.A00;
        Integer num3 = 0S2.A00;
        if (KVy.A00(c11424wg, new 8Lt(num3, num2, num3)) && (r302 instanceof AbstractC3225Jn2)) {
            C11454wj c11454wj = c11474wl.A02;
            c11454wj.A03(num, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
            c11454wj.A01(num, null, 772805755);
            return;
        }
        if (this.A0R && this.A0S && c11424wg.A0O.A00 == EnumC11364wa.A03 && (let = this.A03) != null && let.A0S() && !(r302 instanceof AbstractC3226Jn3) && !(r302 instanceof AbstractC3230Jn7)) {
            if (!(r302 instanceof JgN)) {
                C11454wj c11454wj2 = c11474wl.A02;
                c11454wj2.A03(num, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                c11454wj2.A01(num, null, 772805755);
                return;
            }
            L2a l2a = this.A0a;
            if (l2a != null) {
                boolean A1W = AnonymousClass001.A1W(Looper.myLooper(), Looper.getMainLooper());
                JgN jgN = (JgN) r302;
                Context context = ((L5Y) this).A00;
                if (A1W) {
                    l2a.A01(context, c11474wl.A02, c11474wl, jgN, ktt, num, num2, str, null);
                    return;
                } else {
                    KxI.A00(new LrG(context, l2a, c11474wl.A02, c11474wl, jgN, ktt, num, num2, str, (List) null));
                    return;
                }
            }
            return;
        }
        if (r302 instanceof JgN) {
            ((JgN) r302).A00 = new LUH(this, num);
        }
        0D2 r0 = this.A02;
        if (r0 != null && (dialog = r0.A01) != null && dialog.isShowing()) {
            0D2 r02 = this.A02;
            if (!r02.mRemoving) {
                r02.A0o();
            }
        }
        KVx.A00(((L5Y) this).A00, ((L5Y) this).A02);
        this.A02 = r302;
        if ((r302 instanceof AbstractC3225Jn2) || (r302 instanceof AbstractC3228Jn5)) {
            Kvi.A01(c11424wg, new 8Lt(num3, num2, num3), 0S2.A01);
        }
        KuT kuT = this.A08;
        if ((this.A02 instanceof AbstractC3228Jn5) && kuT != null && kuT.A03()) {
            A0G(ktt);
            kuT.A00(ktt);
            return;
        }
        JgX jgX = ((L5Y) this).A03;
        if (jgX == null) {
            this.A0b.A05(A06(), 0S2.A1G, null);
            return;
        }
        this.A02.A0m(jgX.getParentFragmentManager(), str);
        if (ktt != null) {
            if ((this.A02 instanceof AbstractC3228Jn5) && kuT != null) {
                ktt.A02("shown_automatic_autofill_consent", String.valueOf(kuT.A04(false)));
            }
            LEA.A0B(c11474wl, this, ktt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x02ee, code lost:
    
        if (r0 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0C(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r302, java.lang.Integer r303, java.util.List r304) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3243Jnf.A0C(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy, java.lang.Integer, java.util.List):void");
    }

    public void A0D(AutofillData autofillData) {
        if (this.A05 != null) {
            this.A05.A0G(BusinessExtensionJSBridgeCall.A01(this.A0c.A00.A07.A01, autofillData.A01()));
        }
    }

    public void A0E(AutofillData autofillData) {
        AbstractC3252Jnp A0U;
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy;
        JgX jgX = ((L5Y) this).A04;
        if (jgX == null || (A0U = jgX.A0U()) == null || autofillData == null || (autofillSharedJSBridgeProxy = (AutofillSharedJSBridgeProxy) this.A0j.get(A0U)) == null) {
            return;
        }
        try {
            LEA.A0A(autofillSharedJSBridgeProxy, autofillData);
        } catch (JSONException unused) {
            throw AnonymousClass001.A0N("Illegal JSON for autofill save");
        }
    }

    public void A0F(AutofillData autofillData) {
        java.util.Map map = this.A0f;
        C11424wg c11424wg = this.A0c.A00;
        11T.A0F(c11424wg, 0);
        boolean z = true;
        map.put(LDu.A01(c11424wg.A08.A01), Boolean.valueOf(AnonymousClass001.A1T(autofillData)));
        JgX jgX = ((L5Y) this).A04;
        if (jgX != null) {
            this.A0h.put(jgX.A0j, autofillData);
        }
        if (autofillData == null) {
            z = false;
        }
        this.A0W = z;
        String str = null;
        this.A0G = autofillData != null ? AnonymousClass001.A0b(PublicKeyCredentialControllerUtility.JSON_KEY_ID, autofillData.A00) : null;
        if (autofillData != null) {
            str = AnonymousClass001.A0b("ent_id", autofillData.A00);
        }
        this.A0F = str;
    }

    public void A0G(Ktt ktt) {
        KuT kuT = this.A08;
        if (kuT != null) {
            List list = (List) kuT.A00.A00.A0B.A00;
            if (!list.isEmpty()) {
                java.util.Map A01 = Kvk.A01((8Lq) 1BK.A0r(list));
                if (!A01.isEmpty()) {
                    AutofillData autofillData = new AutofillData(A01);
                    WeakReference weakReference = kuT.A02;
                    C3243Jnf A0S = JQz.A0S(weakReference);
                    if (A0S != null) {
                        A0S.A0D(autofillData);
                    }
                    C3243Jnf A0S2 = JQz.A0S(weakReference);
                    if (A0S2 != null) {
                        A0S2.A0F(autofillData);
                    }
                }
            }
            Context context = ((L5Y) this).A00;
            if (context != null) {
                1Iw r0 = new 1Iw(context);
                FFJ ffj = new FFJ(r0);
                C2148Dfc c2148Dfc = new C2148Dfc(r0);
                c2148Dfc.A0f(2131951624);
                AbstractC2158Dfm abstractC2158Dfm = new AbstractC2158Dfm(r0);
                abstractC2158Dfm.A0i(2131951632);
                DfG A0h = abstractC2158Dfm.A0h(2131951632);
                A0h.A04 = EWA.A00(new G7P(this, 0));
                c2148Dfc.A03 = RXy.A00(A0h);
                ffj.A00 = c2148Dfc;
                ffj.A02(CallerContext.A0B(DKB.A00(ActionId.VIDEO_DISPLAYED))).A01();
                if (ktt != null) {
                    ktt.A0I = "AUTOMATIC_AUTOFILL_TOAST_SHOWN";
                    LEA.A07(A06(), this.A0c, ktt.A01());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0167, code lost:
    
        if (android.text.TextUtils.isEmpty(r309) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0H(final X.AbstractC3252Jnp r302) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3243Jnf.A0H(X.Jnp):void");
    }

    public boolean A0I() {
        return this.A0c.A00.A0O.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A0N != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0J() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0M
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.A0N
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3243Jnf.A0J():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0.A0H.A00.equals(X.0S2.A01) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0K() {
        /*
            r301 = this;
            r0 = r301
            X.LET r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L39
            r0 = r301
            X.4wl r0 = r0.A0c
            X.4wg r0 = r0.A00
            r303 = r0
            r0 = r303
            X.4wd r0 = r0.A08
            r302 = r0
            r0 = r302
            boolean r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r303
            X.82W r0 = r0.A0H
            java.lang.Object r0 = r0.A00
            r303 = r0
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L3d
        L39:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L3d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3243Jnf.A0K():boolean");
    }

    public boolean A0L(String str) {
        if (str == null) {
            return true;
        }
        java.util.Map map = this.A0g;
        11T.A0F(map, 1);
        String A01 = LDu.A01(str);
        boolean z = true;
        if (A01 == null) {
            return true;
        }
        Boolean bool = (Boolean) map.get(A01);
        if (bool != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    @Override // X.MNs
    public void AO6(AbstractC3252Jnp abstractC3252Jnp, String str, boolean z) {
        JtB jtB;
        C11424wg c11424wg;
        JtD jtD;
        java.util.Map map;
        LET let = this.A03;
        if (!this.A0R || let == null) {
            return;
        }
        if (this.A0Z && (map = (jtD = (c11424wg = this.A0c.A00).A03).A02) != null && !map.isEmpty()) {
            String str2 = this.A0e;
            11T.A0F(str2, 0);
            String str3 = null;
            String A0t = 1BK.A0t();
            if (((L5Y) this).A04 != null) {
                str3 = c11424wg.A08.A01;
            }
            String A01 = LDu.A01(abstractC3252Jnp.A06().A06);
            String A012 = L9H.A01(c11424wg);
            String str4 = c11424wg.A08.A04;
            if (!map.isEmpty()) {
                ArrayList A17 = 1BK.A17(map.values());
                if (!A17.isEmpty()) {
                    Bundle A06 = A06();
                    if (A06 == null) {
                        A06 = 1BK.A05();
                        A06.putString("autofill_iab_session_id", str2);
                        A06.putString("ad_id", str4);
                        A06.putString("current_url", str3);
                        A06.putString("origin_host", A01);
                        A06.putString("autofill_form_id", A0t);
                        A06.putString("autofill_mobile_app_id", "1234");
                        A06.putString("autofill_type", A012);
                        ArrayList<? extends Parcelable> A0s = AnonymousClass001.A0s();
                        Iterator it = A17.iterator();
                        while (it.hasNext()) {
                            A0s.add(((RRl) it.next()).A00());
                        }
                        A06.putParcelableArrayList("autofill_field_detection_bundle_data_list", A0s);
                    } else {
                        Bundle A05 = 1BK.A05();
                        A05.putString("autofill_iab_session_id", str2);
                        A05.putString("ad_id", str4);
                        A05.putString("current_url", str3);
                        A05.putString("origin_host", A01);
                        A05.putString("autofill_form_id", A0t);
                        A05.putString("autofill_mobile_app_id", "1234");
                        A05.putString("autofill_type", A012);
                        ArrayList<? extends Parcelable> A0s2 = AnonymousClass001.A0s();
                        Iterator it2 = A17.iterator();
                        while (it2.hasNext()) {
                            A0s2.add(((RRl) it2.next()).A00());
                        }
                        A05.putParcelableArrayList("autofill_field_detection_bundle_data_list", A0s2);
                        A06.putAll(A05);
                    }
                    LDF A00 = LDF.A00();
                    HashMap A0u = AnonymousClass001.A0u();
                    A0u.put("action", "BrowserLiteIntent.IAB_AUTOFILL_CROWDSOURCING_PREDICTIONS");
                    LDF.A02(new C3203Jme(A06, A00, A0u, 2), A00);
                }
            }
            jtD.A02 = null;
        }
        C11474wl c11474wl = this.A0c;
        if (c11474wl.A04.A00.AZk(36311839672766018L)) {
            let.A08 = 0S2.A0C;
            let.A0T((AutofillData) null, str, false);
        }
        C11424wg c11424wg2 = let.A0P.A00;
        Jsw jsw = c11424wg2.A00;
        if (jsw != null && (jtB = jsw.A01) != null && let.A0H) {
            LET.A0D(let, c11424wg2.A00.A01, LDI.A00(jtB), "ALL_NAVIGATION");
            let.A0H = false;
            c11424wg2.A00 = null;
        }
        ((java.util.Map) c11474wl.A00.A0I.A02).clear();
    }

    public void destroy() {
        this.A0j.clear();
        super.destroy();
    }
}
