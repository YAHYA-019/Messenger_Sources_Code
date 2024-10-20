package X;

import android.app.Application;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1cx, reason: invalid class name */
/* loaded from: 1cx.class */
public abstract class C1cx {
    public static final void A00(Context context) {
        11T.A0F(context, 0);
        if ((context.getApplicationContext() instanceof Application) && FbInjector.A03 == null) {
            Context applicationContext = context.getApplicationContext();
            11T.A0I(applicationContext, "null cannot be cast to non-null type android.app.Application");
            FbInjector.setApplication((Application) applicationContext);
        }
        ((1Bt) 1Bi.A03(66185)).A02();
    }
}
