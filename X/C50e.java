package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.dcp.xapp.cache.InAppPurchaseQuoteCache;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;

/* renamed from: X.50e, reason: invalid class name */
/* loaded from: 50e.class */
public final class C50e {
    public final C50x A00;

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, X.50s] */
    public C50e(Context context) {
        11T.A0F(context, 1);
        C50f c50f = (C50f) 1Bn.A0A(49447);
        1Bn.A0A(67106);
        C50k c50k = (C50k) 1Bn.A0E(context, (1BY) null, 67340);
        ComponentCallbacks2 componentCallbacks2 = (Activity) AnonymousClass016.A00(context, Activity.class);
        2aH A01 = (((2yD) c50f.A00.get()).AZk(36314755942916263L) || !(componentCallbacks2 instanceof LifecycleOwner)) ? 2Zy.A01(2Zo.A02(0S2.A00)) : 2Zy.A00((LifecycleOwner) componentCallbacks2, 2Zo.A01());
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428));
        C50m c50m = new C50m(c50k);
        this.A00 = new C50x(context, new InAppPurchaseControllerCoro(new C50n(A04, context), new C7Zk(), new C50o(context), c50f, c50m, new C50r(), (InAppPurchaseQuoteCache) 1Lm.A06(A04, 67551), new C50q(), new Object(), A01));
    }
}
