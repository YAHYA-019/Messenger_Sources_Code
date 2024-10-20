package X;

import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Izt.class */
public final class Izt implements Runnable {
    public static final String __redex_internal_original_name = "ScreenSharingViewCoordinatorImpl$init$2";
    public final /* synthetic */ MediaProjectionManager A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ IRn A02;

    public Izt(MediaProjectionManager mediaProjectionManager, FbUserSession fbUserSession, IRn iRn) {
        this.A02 = iRn;
        this.A00 = mediaProjectionManager;
        this.A01 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IRn iRn = this.A02;
        iRn.A01++;
        MediaProjection A01 = IRn.A01(iRn.A04, this.A00, iRn, iRn.A00);
        iRn.A07 = A01;
        if (A01 == null) {
            IRn.A07(iRn);
        } else {
            IRn.A06(this.A01, iRn);
        }
    }
}
