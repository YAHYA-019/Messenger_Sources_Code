package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.user.model.UserKey;

/* renamed from: X.4Nu, reason: invalid class name */
/* loaded from: 4Nu.class */
public final class C4Nu implements CallerContextable {
    public static final String __redex_internal_original_name = "MontageHiddenUserHelper";
    public 1BY A00;
    public final C4Nv A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A01 = new 1BQ(16457);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A02 = new 1BQ(17085);

    public C4Nu(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A05 = new 1MV(fbUserSession, (1BY) null, 17064);
        this.A06 = new 1MV(fbUserSession, (1BY) null, 82576);
        this.A04 = (C4Nv) 1Lo.A09(fbUserSession, (1BY) null, 82575);
    }

    public void A00(UserKey userKey) {
        this.A04.A02(userKey.id);
        1BK.A1E(this.A01).execute(new IwH(this, userKey));
    }
}
