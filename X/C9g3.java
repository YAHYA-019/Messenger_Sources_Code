package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.9g3, reason: invalid class name */
/* loaded from: 9g3.class */
public final class C9g3 {
    public static final long A06 = C0za.A01(0zY.A08, 10);
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 2fC A03;
    public final C01i A04;
    public final C01i A05;

    public C9g3(FbUserSession fbUserSession, Context context) {
        11T.A0G(fbUserSession, 1, context);
        this.A01 = fbUserSession;
        this.A00 = context;
        C03i c03i = C03i.A02;
        this.A05 = C01g.A00(c03i, new AKH(this));
        1Hb r0 = 1Hb.A02;
        this.A03 = 2fC.A00(CallerContext.A0B("CastToFriendsRepository"), r0, true, false, false);
        this.A04 = C01g.A00(c03i, DCu.A00);
        this.A02 = 1Bu.A01(context, 67581);
        ((2Ur) 7zM.A1B(this.A05)).A09(1F9.A0I);
        2Ur r02 = (2Ur) 7zM.A1B(this.A05);
        if (r02.A05 != r0) {
            r02.A05 = r0;
            2Ur.A08(r02, false);
        }
    }
}
