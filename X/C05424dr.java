package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.4dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dr.class */
public final class C05424dr extends AbstractC05414dq {
    public 1BY A00;
    public final C00i A01;
    public final FbUserSession A02;

    public C05424dr(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A02 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A01 = new 1MV(fbUserSession, (1BY) null, 68050);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A01(C05424dr c05424dr, C3sb c3sb) {
        ViewerContext BKF = c3sb instanceof InterfaceC01633sc ? ((InterfaceC01633sc) c3sb).BKF() : null;
        if (BKF == null) {
            return false;
        }
        c3sb.A07("customVC=true");
        String str = BKF.mUserId;
        1G1 r0 = c05424dr.A02;
        1G1 r02 = r0;
        String str2 = r02.A05;
        if (str.equals(str2)) {
            c3sb.A07(BKF.mAuthToken.equals(r0.BKF().mAuthToken) ? "customVC_equals_session" : "customVC_equals_sessionId_not_token");
            return false;
        }
        c3sb.A07("customVC_not_equals_session");
        if (!str.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            str = String.valueOf(str.hashCode());
        }
        c3sb.A07(0Pz.A0W("customUserIdHash=", str));
        if (!str2.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            str2 = String.valueOf(str2.hashCode());
        }
        c3sb.A07(0Pz.A0W("sessionUserIdHash=", str2));
        String str3 = r02.A02;
        if (!str3.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            str3 = String.valueOf(str3.hashCode());
        }
        c3sb.A07(0Pz.A0W("sessionLoggedInUserIdHash=", str3));
        String str4 = r02.A04;
        if (!str4.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            str4 = String.valueOf(str4.hashCode());
        }
        c3sb.A07(0Pz.A0W("sessionUnderlyingAccountUserIdHash=", str4));
        return true;
    }

    @Override // X.AbstractC05414dq
    public ListenableFuture A06(5Dh r302) {
        return A01(this, r302) ? AbstractC05414dq.A00(this, r302).A06(r302) : super.A06(r302);
    }
}
