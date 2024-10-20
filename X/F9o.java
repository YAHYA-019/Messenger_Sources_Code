package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: F9o.class */
public final class F9o {
    public static final AtomicInteger A02 = new AtomicInteger();
    public final Context A00;
    public final C00i A01;

    public F9o(Context context) {
        this.A00 = context;
        this.A01 = 7zL.A0R(context, 16428);
    }

    public EvS A00(FbUserSession fbUserSession, 50F r303, String str) {
        int andIncrement = A02.getAndIncrement();
        r303.AR8(ActionId.RTMP_CONNECTION_RELEASE, andIncrement);
        r303.AR1(ActionId.RTMP_CONNECTION_RELEASE, andIncrement, "instance", andIncrement);
        Context context = this.A00;
        return new EvS(context, fbUserSession, ((EeV) 1Lo.A06(fbUserSession, 98811)).A00, (FwX) 1Bn.A0E(context, (1BY) null, 99552), r303, str, andIncrement);
    }

    public EvS A01(String str) {
        50F r0 = (50F) 1Bn.A0A(49434);
        r0.A00 = str;
        ThreadLocal threadLocal = ViewerContext.A02;
        Object obj = threadLocal.get();
        threadLocal.set(Boolean.FALSE);
        FbUserSession A04 = 1Fw.A04((1EZ) this.A01.get());
        threadLocal.set(obj);
        return A00(A04, r0, str);
    }

    public FyG A02(String str) {
        return A01(str).A00(this.A00);
    }
}
