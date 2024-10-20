package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.1os, reason: invalid class name */
/* loaded from: 1os.class */
public final class C1os {
    public final 1Br A00;
    public final FbUserSession A01;
    public final 1BP A02;

    public C1os(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A02 = FbInjector.A00;
        this.A00 = 1Lm.A01(fbUserSession, 66149);
    }

    public final boolean A00() {
        Integer A00 = C1ot.A00((C1ot) this.A00.A00.get(), true);
        Context context = FbInjector.A03;
        11T.A0A(context);
        Resources resources = context.getResources();
        11T.A0A(resources);
        boolean A002 = C1oy.A00(resources);
        if (A00 != 0S2.A01) {
            return A00 == 0S2.A0C && A002;
        }
        return true;
    }
}
