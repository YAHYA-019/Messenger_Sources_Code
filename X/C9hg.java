package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Preconditions;

/* renamed from: X.9hg, reason: invalid class name */
/* loaded from: 9hg.class */
public final class C9hg {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02 = 7zM.A0P();

    public C9hg(1De r302) {
        this.A00 = r302;
        this.A01 = 7zM.A0h(r302, 83719);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList A00(com.facebook.auth.usersession.FbUserSession r301, X.C9hg r302, java.util.List r303, long r304) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9hg.A00(com.facebook.auth.usersession.FbUserSession, X.9hg, java.util.List, long):java.util.ArrayList");
    }

    public final void A01(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, Integer num, Long l, String str, String str2, boolean z, boolean z2) {
        11T.A0F(fbUserSession, 0);
        if (z) {
            4fF r0 = (4fF) 1Lo.A04(context, fbUserSession, (1BY) null, 68127);
            String A00 = 4YT.A00(825);
            String A0w = 1BK.A0w(threadKey);
            if (!r0.A0L(0Pz.A0W(A00, A0w))) {
                8HI r02 = new 8HI(context, r303, fbUserSession, this, threadKey, num, l, str, str2);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                A0M.A05("thread_key", A0w);
                Preconditions.checkArgument(AnonymousClass001.A1T(A0w));
                r0.A0I(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "CommunityThreadAdminOnboardingTasks", (String) null, "fbandroid", 407764979, 0, 1035275789L, 1035275789L, false, true)), r02, A00, 4YV.A11(this.A02));
                return;
            }
        }
        1Vd A09 = 7zT.A09(this.A01);
        GraphQlQueryParamSet A0M2 = 7zL.A0M();
        String A0w2 = 1BK.A0w(threadKey);
        A0M2.A05("thread_key", A0w2);
        Preconditions.checkArgument(AnonymousClass001.A1T(A0w2));
        1FV A092 = A09.A09(7zM.A0L(A0M2, new 2Jf(2JX.class, (Class) null, "CommunityThreadAdminOnboardingTasks", (String) null, "fbandroid", 407764979, 0, 1035275789L, 1035275789L, false, true)));
        11T.A0D(A092);
        1Kd.A0F(new AC4(context, r303, fbUserSession, this, threadKey, num, l, str, str2, z2, z), A092, 4YV.A11(this.A02));
    }

    public final void A02(FbUserSession fbUserSession, C00m c00m, long j, boolean z) {
        11T.A0F(fbUserSession, 0);
        A1d.A01(((8yV) 4YU.A0o(fbUserSession, this.A00, 68149)).A00(j, z), c00m, 40);
    }
}
