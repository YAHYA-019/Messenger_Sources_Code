package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Hy7.class */
public final class Hy7 {
    public final FbUserSession A00;
    public final /* synthetic */ I0N A01;

    public Hy7(FbUserSession fbUserSession, I0N i0n) {
        this.A01 = i0n;
        this.A00 = fbUserSession;
    }

    public static final void A00(FbUserSession fbUserSession, Hy7 hy7, EffectItem effectItem, boolean z) {
        I0N i0n = hy7.A01;
        if (z) {
            ((Huh) 1Lm.A05(i0n.A02, fbUserSession, 115493)).A00(HAu.A02, new IW6(i0n), effectItem, "messenger_face_detection");
            return;
        }
        i0n.A0A.A00(-1);
        ((C2778Gnv) 1Lm.A05(i0n.A02, fbUserSession, 115493)).A06(null, new IW3(fbUserSession, i0n, 2), effectItem, false);
        I0N.A00(i0n).markerPoint(5505185, "START_DOWNLOAD_FACE_DETECTION_EFFECT");
    }
}
