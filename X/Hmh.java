package X;

import com.facebook.user.model.UserKey;

/* loaded from: Hmh.class */
public final class Hmh {
    public final /* synthetic */ GrT A00;

    public Hmh(GrT grT) {
        this.A00 = grT;
    }

    public void A00() {
        GrT grT = this.A00;
        if (grT.A01 != null) {
            1Br.A0C(grT.A0G);
            UserKey userKey = grT.A01;
            if (userKey == null) {
                throw 1BK.A0h();
            }
            11T.A0A(userKey.id);
            I6E.A01("render_remote_video_stopped", null, null, C0ty.A00, null, false);
        }
        GrT.A09(grT, true);
    }
}
