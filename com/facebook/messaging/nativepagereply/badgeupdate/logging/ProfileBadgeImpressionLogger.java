package com.facebook.messaging.nativepagereply.badgeupdate.logging;

import X.04J;
import X.1BQ;
import X.1Hv;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.5Uk;
import X.5dJ;
import X.C00i;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: ProfileBadgeImpressionLogger.class */
public final class ProfileBadgeImpressionLogger {
    public final C00i A01 = new 1BQ(16634);
    public final C00i A00 = new 1BQ(17077);
    public final C00i A02 = new 1BQ(49753);

    public void A00(FbUserSession fbUserSession, int i) {
        1UG A00 = 1UD.A00((04J) this.A01.get(), 1ZG.A01, "page_badge_impression");
        if (A00.isSampled()) {
            A00.A6H("overall_badge_count", Long.valueOf(((5dJ) 1Hv.A02(FbInjector.A00(), 131306)).A00()));
            A00.A6H("page_badge_count", Long.valueOf(((5Uk) this.A02.get()).A02(fbUserSession)));
            A00.A5q("event_trigger", Integer.valueOf(i));
            A00.BZL();
        }
    }
}
