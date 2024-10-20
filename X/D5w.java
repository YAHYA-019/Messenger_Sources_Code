package X;

import android.content.Context;
import com.facebook.fbservice.service.ServiceException;

/* loaded from: D5w.class */
public final class D5w implements Runnable {
    public static final String __redex_internal_original_name = "AcceptMessageRequestHandlerPluginSpec$acceptMessageRequest$1$1";
    public final /* synthetic */ 6RU A00;

    public D5w(6RU r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A00;
        6HM r0 = (6HM) 7zR.A0o(context, 50020);
        r0.A01(context, r0.A04(ServiceException.A00(AbF.A1D("Failed to accept message request."))));
    }
}
