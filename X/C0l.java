package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: C0l.class */
public final class C0l {
    public final C00i A00 = 1BV.A00(81995);

    public void A00(Context context, FbUserSession fbUserSession, 1F9 r304, MigColorScheme migColorScheme, String str, String str2, String str3, String str4) {
        AbI.A0L().get();
        DR6 A01 = C5ic.A01(context, migColorScheme);
        A01.A00(2131964398);
        A01.A06(2131964397);
        A01.A0K(true);
        A01.A0D(new CRR(context, fbUserSession, this, r304, str, str3, str4, str2), 2131964396);
        CSG.A03(A01, this, 77);
        A01.A05();
    }
}
