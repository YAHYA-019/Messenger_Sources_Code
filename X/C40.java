package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import com.facebook.xapp.messaging.browser.model.MessengerWebViewParams;

/* loaded from: C40.class */
public final class C40 {
    public final 1Br A00;
    public final 1Br A01 = 1Bq.A00(83592);
    public final 1De A02;

    public C40(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 100011);
    }

    public final void A00(Context context) {
        FIu fIu = (FIu) 1Br.A0B(this.A00);
        InterfaceC00281am A01 = ((C00241ai) 1Br.A0B(this.A01)).A01();
        11T.A0A(A01);
        Uri A09 = AbM.A09(A01.Axy(), "settings/security_login/sessions/");
        11T.A0A(A09);
        fIu.A0A(context, A09, new MessengerInAppBrowserLaunchParam(null, null, C5id.A03, new MessengerWebViewParams(null, null, 0.0d, true, false, false, true, false, false, true), null, null, null, null, null, null, null, false, false, false));
    }
}
