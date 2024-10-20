package X;

import android.content.Context;
import android.view.View;
import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;

/* loaded from: Lxa.class */
public final class Lxa extends Thread {
    public static final String __redex_internal_original_name = "AutofillController$2";
    public final /* synthetic */ C3243Jnf A00;
    public final /* synthetic */ AbstractC3252Jnp A01;

    public Lxa(C3243Jnf c3243Jnf, AbstractC3252Jnp abstractC3252Jnp) {
        this.A00 = c3243Jnf;
        this.A01 = abstractC3252Jnp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C3243Jnf c3243Jnf = this.A00;
        Context A00 = SystemWebView.A00(this.A01);
        if (((L5Y) c3243Jnf).A02 != null) {
            50L r0 = (50L) 1Bn.A0F(A00, 50L.class, (Class) null);
            50K r02 = (50K) 1Bn.A0F(A00, 50K.class, (Class) null);
            WeakReference A14 = 7zL.A14(c3243Jnf);
            View view = ((L5Y) c3243Jnf).A02;
            C11474wl c11474wl = c3243Jnf.A0c;
            C11384wc c11384wc = c11474wl.A04;
            c3243Jnf.A06 = new C3216Jmt(view, c3243Jnf.A0b, c11474wl.A00, c11384wc, r0, r02, A14);
        }
    }
}
