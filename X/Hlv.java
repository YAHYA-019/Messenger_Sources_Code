package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.activity.InCallActivity;

/* loaded from: Hlv.class */
public final class Hlv {
    public final 1De A00;

    public Hlv(1De r302) {
        this.A00 = r302;
    }

    public final String A00(FbUserSession fbUserSession) {
        1pK r0;
        Context context;
        Resources resources;
        Configuration configuration;
        1BY r02 = this.A00.A00;
        2Qa r03 = (2Qa) 1Lo.A04((Context) null, fbUserSession, r02, 33089);
        EtU etU = (EtU) 1Lo.A04((Context) null, fbUserSession, r02, 98493);
        2QN r04 = (2QO) 1Lo.A04((Context) null, fbUserSession, r02, 99977);
        IRF irf = (IRF) 1Lo.A04((Context) null, fbUserSession, r02, 99979);
        if (r03.A05()) {
            return "vch";
        }
        if (!irf.A0z()) {
            return r04.A0O ? "status_bar" : "background";
        }
        JGP jgp = etU.A00;
        if (jgp == null || (r0 = ((InCallActivity) jgp).A07) == null || (context = r0.getContext()) == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "full_screen_unknown_orientation";
        }
        int i = configuration.orientation;
        return Integer.valueOf(i) != null ? i == 2 ? "full_screen_landscape" : i == 1 ? "full_screen_portrait" : "full_screen_unknown_orientation" : "full_screen_unknown_orientation";
    }
}
