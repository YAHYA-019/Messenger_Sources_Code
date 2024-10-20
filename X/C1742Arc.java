package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;

/* renamed from: X.Arc, reason: case insensitive filesystem */
/* loaded from: Arc.class */
public final class C1742Arc extends C1F6 {
    public C1742Arc(1BO r302) {
        super(r302);
    }

    public C6F A00(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext) {
        Context A01 = FbInjector.A01();
        AbL.A0y(this);
        try {
            C6F c6f = new C6F(context, r303, fbUserSession, callerContext, 7zQ.A0S(this));
            1Bn.A0K();
            FbInjector.A04(A01);
            return c6f;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
