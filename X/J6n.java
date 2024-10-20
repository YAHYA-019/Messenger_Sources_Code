package X;

import com.facebook.auth.usersession.FbUserSession;
import org.webrtc.legacy.videoengine.OneShotDrawListener;

/* loaded from: J6n.class */
public final class J6n implements OneShotDrawListener {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ IZG A01;

    public J6n(FbUserSession fbUserSession, IZG izg) {
        this.A01 = izg;
        this.A00 = fbUserSession;
    }

    @Override // org.webrtc.legacy.videoengine.OneShotDrawListener
    public final void onDraw() {
        IZG izg = this.A01;
        ((HtS) 1Br.A0B(izg.A07)).A00();
        I7M.A00(izg.A08).BGd(((2QO) 4YU.A0n(this.A00, izg.A05, 99977)).A0B).AGy("remote_first_frame_rendered");
    }
}
