package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import org.webrtc.legacy.videoengine.OneShotDrawListener;

/* loaded from: J6o.class */
public final class J6o implements OneShotDrawListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ Hbb A02;

    public J6o(Context context, FbUserSession fbUserSession, Hbb hbb) {
        this.A02 = hbb;
        this.A01 = fbUserSession;
        this.A00 = context;
    }

    @Override // org.webrtc.legacy.videoengine.OneShotDrawListener
    public final void onDraw() {
        Hbb hbb = this.A02;
        hbb.A01.A00();
        I7M.A00(hbb.A00).BGd(((2QO) 1Lm.A05(this.A00, this.A01, 99977)).A0B).AGy("remote_first_frame_rendered");
    }
}
