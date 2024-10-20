package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.impl.widgets.videoparticipantview.ViEAndroidGLES20ScaledVideoViewHolder;
import java.util.Iterator;

/* loaded from: Hnk.class */
public final class Hnk {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ViEAndroidGLES20ScaledVideoViewHolder A01;

    public Hnk(FbUserSession fbUserSession, ViEAndroidGLES20ScaledVideoViewHolder viEAndroidGLES20ScaledVideoViewHolder) {
        this.A01 = viEAndroidGLES20ScaledVideoViewHolder;
        this.A00 = fbUserSession;
    }

    public void A00(boolean z) {
        IMK imk = (IMK) GOq.A0y(this.A01, this.A00, 98492);
        imk.A0D = z;
        Iterator it = imk.A0W.iterator();
        while (it.hasNext()) {
            ((HGB) it.next()).A03();
        }
    }
}
