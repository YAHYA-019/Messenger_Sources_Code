package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewStub;
import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;

/* loaded from: Il8.class */
public final class Il8 implements AaG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ViewStub A01;
    public final /* synthetic */ SUPVideoCallingImpl A02;
    public final /* synthetic */ HG8 A03;
    public final /* synthetic */ 0CL A04;

    public Il8(Context context, ViewStub viewStub, SUPVideoCallingImpl sUPVideoCallingImpl, HG8 hg8, 0CL r306) {
        this.A04 = r306;
        this.A03 = hg8;
        this.A00 = context;
        this.A01 = viewStub;
        this.A02 = sUPVideoCallingImpl;
    }

    public void C7H() {
        JNL jnl = SUPVideoCallingImpl.A06;
        if (jnl != null) {
            jnl.C7H();
        }
    }

    public void CNE(T5o t5o) {
        String AtZ;
        6Ki r303;
        Context context;
        String packageName;
        if (t5o.equals(T27.A00)) {
            0LS.A09(this.A00, new Intent("android.intent.action.VIEW", Uri.parse("stella://")));
            return;
        }
        if (t5o.equals(T28.A00)) {
            r303 = (6Ki) 1Br.A0B(this.A02.A00);
            context = this.A00;
            packageName = "com.facebook.stella";
        } else {
            if (!t5o.equals(T26.A00)) {
                Context context2 = this.A00;
                FIu fIu = (FIu) 1Bu.A06(context2, 100011);
                JNL jnl = SUPVideoCallingImpl.A06;
                if (jnl == null || (AtZ = jnl.AtZ(t5o)) == null) {
                    return;
                }
                try {
                    Uri A03 = C0A2.A03(AtZ);
                    if (A03 != null) {
                        fIu.A0A(context2, A03, new MessengerInAppBrowserLaunchParam(null, null, C5id.A0x, null, null, null, null, null, null, null, null, false, false, false));
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            }
            r303 = (6Ki) 1Br.A0B(this.A02.A00);
            context = this.A00;
            packageName = context.getPackageName();
        }
        r303.A04(context, packageName);
    }

    public void CP6() {
        JNL jnl = SUPVideoCallingImpl.A06;
        if (jnl != null) {
            0CL r0 = this.A04;
            HG8 hg8 = this.A03;
            Context context = this.A00;
            ViewStub viewStub = this.A01;
            if (((HrL) ((4gB) 1Br.A0B(SUPVideoCallingImpl.A09)).A07.getValue()).A01()) {
                jnl.CIY(viewStub.getContext());
                return;
            }
            T04 t04 = new T04(true);
            r0.element = t04;
            hg8.A01(context, jnl.BDa(), t04, new J9q(context, jnl, r0));
            Hnm BHm = jnl.BHm();
            if (BHm != null) {
                BHm.A00();
            }
        }
    }
}
