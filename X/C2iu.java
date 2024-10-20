package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;

/* renamed from: X.2iu, reason: invalid class name */
/* loaded from: 2iu.class */
public final class C2iu {
    public 2eS A00;
    public 1BY A01;
    public final C00i A04;
    public final C00i A03 = new 1BV((1BY) null, 33031);
    public final C00i A02 = new 1BQ(49207);

    public C2iu(1BO r302, FbUserSession fbUserSession) {
        this.A01 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A04 = new 1MV(fbUserSession, (1BY) null, 49993);
    }

    public static void A00(Bundle bundle, final C2iu c2iu) {
        if (c2iu.A00 == null) {
            0fH.A0j("ThreadListSyncHelper", "startEnsureSync");
            1IC A01 = ((6E0) c2iu.A04.get()).A01(((BlueServiceOperationFactory) c2iu.A03.get()).newInstance_DEPRECATED("ensure_sync", bundle, CallerContext.A0B("ThreadListSyncHelper")));
            1RM r0 = new 1RM() { // from class: X.6E3
                public /* bridge */ /* synthetic */ void A02(Object obj) {
                    C2iu.this.A00 = null;
                }

                public void A03(Throwable th) {
                    C2iu.this.A00 = null;
                    0fH.A0p(1BJ.A00(880), "Failed to refresh sync connection", th);
                }
            };
            c2iu.A00 = new 2eS(r0, A01);
            1Kd.A0F(r0, A01, 1JU.A01);
        }
    }
}
