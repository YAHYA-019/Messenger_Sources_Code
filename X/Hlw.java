package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hlw.class */
public final class Hlw {
    public final /* synthetic */ Hii A00;

    public Hlw(Hii hii) {
        this.A00 = hii;
    }

    public void A00() {
        Hii hii = this.A00;
        GP5 A0K = GOp.A0K(hii.A02);
        FbUserSession fbUserSession = hii.A01;
        A0K.A05(fbUserSession, "video_selected");
        GOn.A0s(hii.A00, fbUserSession).Cgp();
    }
}
