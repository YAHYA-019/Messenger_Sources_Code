package X;

import android.content.Context;
import android.os.RemoteException;
import com.facebook.browser.lite.extensions.promoautofill.facebook.PromoAutofillController;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.Jni, reason: case insensitive filesystem */
/* loaded from: Jni.class */
public final class C3246Jni extends L5Y implements MNr, MNt, MNs, C2iz {
    public AbstractC3252Jnp A00;
    public final 1Br A01;
    public final 1Br A02;
    public final HashMap A03;
    public final String A04;

    public C3246Jni() {
        this(0);
    }

    public C3246Jni(int i) {
        this.A04 = AbstractC11504wo.A01();
        this.A02 = 1BK.A0C();
        this.A03 = AnonymousClass001.A0u();
        1Br A00 = 1Bq.A00(17085);
        this.A01 = A00;
        ((C2j0) 1Br.A0B(A00)).A02(this);
    }

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        11T.A0F(c2j1, 0);
        c2j1.A00(7);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
        11T.A0F(c2mq, 0);
        if (c2mq.AU8() == 7) {
            throw AnonymousClass001.A0Q("getType");
        }
    }

    @Override // X.MNs
    public void CAY(AbstractC3252Jnp abstractC3252Jnp, String str) {
        InputStreamReader A0g;
        String A00;
        boolean A1W = 1BL.A1W(abstractC3252Jnp, str);
        C00i c00i = this.A02.A00;
        if (!1BK.A0M(c00i).AZk(36310619900477893L)) {
            return;
        }
        if (!1BK.A0M(c00i).AZk(36310619905655285L)) {
            LDF A002 = LDF.A00();
            AutofillScriptCallback autofillScriptCallback = new PromoAutofillController.injectPromoJS.1(abstractC3252Jnp);
            BrowserLiteCallback browserLiteCallback = A002.A06;
            if (browserLiteCallback != null) {
                try {
                    browserLiteCallback.AS3(autofillScriptCallback);
                    return;
                } catch (RemoteException e) {
                    0fH.A0w("BrowserLiteCallbacker", "Error in fetchAutofillScript", e);
                    return;
                }
            }
            return;
        }
        Context A003 = SystemWebView.A00(abstractC3252Jnp);
        11T.A0F(A003, A1W ? 1 : 0);
        WeakReference weakReference = KS7.A00;
        try {
            if (weakReference != null) {
                A00 = (String) weakReference.get();
                if (A00 == null) {
                    KS7.A00 = null;
                }
                abstractC3252Jnp.A0I(A00);
                return;
            }
            A00 = C03t.A00(A0g);
            A0g.close();
            if (A00.length() < 2048) {
                KS7.A00 = 7zL.A14(A00);
            }
            abstractC3252Jnp.A0I(A00);
            return;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass127.A00(A0g, th);
                throw th2;
            }
        }
        A0g = JQy.A0g(A003.getResources(), 2131886131);
    }

    public void destroy() {
        this.A03.clear();
        super.destroy();
    }
}
