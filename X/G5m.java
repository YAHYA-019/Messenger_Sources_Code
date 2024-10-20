package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: G5m.class */
public final class G5m implements Runnable {
    public static final String __redex_internal_original_name = "AddFriendInSmallGroupRequestIntentHandler$sendFriendRequest$1$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ C4T9 A03;
    public final /* synthetic */ boolean A04;

    public G5m(Context context, FbUserSession fbUserSession, C4T9 c4t9, long j, boolean z) {
        this.A03 = c4t9;
        this.A02 = fbUserSession;
        this.A01 = context;
        this.A00 = j;
        this.A04 = z;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.0CL] */
    @Override // java.lang.Runnable
    public final void run() {
        C4T9 c4t9 = this.A03;
        FbUserSession fbUserSession = this.A02;
        Context context = this.A01;
        long j = this.A00;
        boolean z = this.A04;
        1Iw A0W = 7zL.A0W(context);
        ?? obj = new Object();
        int i = 2131957032;
        if (z) {
            i = 2131957033;
        }
        String A0D = A0W.A0D(i);
        11T.A0D(A0D);
        C2148Dfc c2148Dfc = new C2148Dfc(A0W);
        c2148Dfc.A0g(A0D);
        FFJ A00 = FFJ.A00(A0W, A0W.A0D(2131967373));
        String A002 = AbstractC00603o4.A00(337);
        EzN A02 = A00.A02(CallerContext.A0B(A002));
        if (z) {
            AbstractC2158Dfm abstractC2158Dfm = new AbstractC2158Dfm(A0W);
            abstractC2158Dfm.A0g(A0W.A0D(2131953816));
            abstractC2158Dfm.A0f(A0W.A0D(2131953816));
            abstractC2158Dfm.A04 = 7zO.A0U(new GAo(context, fbUserSession, A02, c4t9, obj, j));
            c2148Dfc.A03 = RXy.A00(abstractC2158Dfm);
        }
        FFJ ffj = new FFJ(A0W);
        ffj.A00 = c2148Dfc;
        EzN A022 = ffj.A02(CallerContext.A0B(A002));
        ((0CL) obj).element = A022;
        A022.A01();
    }
}
