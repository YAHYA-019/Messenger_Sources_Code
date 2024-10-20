package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;

/* renamed from: X.4Nz, reason: invalid class name */
/* loaded from: 4Nz.class */
public final class C4Nz extends C1F6 {
    public C4Nz(1BO r302, int i) {
        super(r302);
    }

    public JU4 A00(Context context, FbUserSession fbUserSession) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(B92().Aqm());
        1Bn.A0M(this);
        try {
            JU4 ju4 = new JU4(context, fbUserSession, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            return ju4;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public C49A A01(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, String str) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(B92().Aqm());
        1Bn.A0M(this);
        try {
            C49A c49a = new C49A(context, r303, fbUserSession, callerContext, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c49a;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 5Zm A02(int i) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(B92().Aqm());
        1Bn.A0M(this);
        try {
            5Zm r0 = new 5Zm(i);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 4GK A03(String str) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(B92().Aqm());
        1Bn.A0M(this);
        try {
            4GK r0 = new 4GK(new 1De(this, new int[0]), str);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
