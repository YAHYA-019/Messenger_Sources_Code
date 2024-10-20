package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.JSONUtil;
import com.facebook.inject.FbInjector;
import com.facebook.presence.note.notify.MessengerNoteMentionNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: Cod.class */
public final class Cod implements 7yC {
    public final 1Br A00 = 1Bu.A00(83865);
    public final 1Br A01 = AbG.A0Y();

    public void CZO(FbUserSession fbUserSession, PushProperty pushProperty, 24X r304) {
        11T.A0H(r304, pushProperty);
        String A0H = JSONUtil.A0H(r304.A0D("title"), null);
        C00i c00i = this.A00.A00;
        String A19 = AbH.A19(c00i, r304);
        24X A0q = AbJ.A0q(c00i, r304);
        24X r312 = null;
        String A0H2 = JSONUtil.A0H(A0q != null ? A0q.A0D("n") : null, null);
        if (A0q != null) {
            r312 = A0q.A0D("a");
        }
        String A0H3 = JSONUtil.A0H(r312, null);
        if (1Br.A0B(this.A01) != C0et.A0P || A0H == null || A0H.length() == 0 || A19 == null || A19.length() == 0 || A0H2 == null || A0H2.length() == 0 || A0H3 == null || A0H3.length() == 0) {
            return;
        }
        ((AnonymousClass208) 7zN.A0k(FbInjector.A00(), 17006)).Bg4(new MessengerNoteMentionNotification(pushProperty, A0H, A19, A0H2, A0H3));
    }
}
