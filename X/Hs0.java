package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Hs0.class */
public final class Hs0 {
    public final 1De A00;
    public final 1Br A01 = 1Bq.A00(49736);
    public final 1Br A02;

    public Hs0(1De r302) {
        this.A00 = r302;
        this.A02 = 7zM.A0h(r302, 85086);
    }

    public final void A00(Context context, FbUserSession fbUserSession, 6In r304, MigColorScheme migColorScheme) {
        1BL.A1H(fbUserSession, migColorScheme, r304);
        2Qb r0 = (2Qb) 4YU.A0o(fbUserSession, this.A00, 17016);
        I8C i8c = (I8C) 1Br.A0B(this.A02);
        VideoChatLink videoChatLink = r0.A06;
        i8c.A02(context, fbUserSession, r304, migColorScheme, r0.A08(), C5yl.A0A, videoChatLink != null ? videoChatLink.A0J : null);
    }

    public final void A01(Context context, FbUserSession fbUserSession, 6In r304, MigColorScheme migColorScheme) {
        1BL.A1H(fbUserSession, migColorScheme, r304);
        2Qb r0 = (2Qb) 4YU.A0o(fbUserSession, this.A00, 17016);
        I8C i8c = (I8C) 1Br.A0B(this.A02);
        VideoChatLink videoChatLink = r0.A06;
        i8c.A02(context, fbUserSession, r304, migColorScheme, r0.A08(), C5yl.A0L, videoChatLink != null ? videoChatLink.A0L : null);
    }
}
