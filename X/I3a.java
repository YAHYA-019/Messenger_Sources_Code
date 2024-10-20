package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.links.api.VideoChatLink;

/* loaded from: I3a.class */
public final class I3a {
    public static SparseArray A04;
    public static final HIU A05 = new Object();
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;

    public I3a(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 115474);
        this.A02 = 1BK.A0C();
        this.A01 = 1Bu.A03(r0, 68298);
    }

    public final boolean A00(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A00.A00;
        VideoChatLink videoChatLink = ((2Qb) 1Lo.A04((Context) null, fbUserSession, r0, 17016)).A06;
        return videoChatLink != null ? videoChatLink.A0a : ((2QO) 1Lo.A04((Context) null, fbUserSession, r0, 99977)).A0S;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f1, code lost:
    
        if (r305.AZk(r312) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01(com.facebook.auth.usersession.FbUserSession r302, java.lang.Integer r303) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3a.A01(com.facebook.auth.usersession.FbUserSession, java.lang.Integer):boolean");
    }
}
