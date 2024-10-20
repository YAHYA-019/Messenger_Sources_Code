package com.facebook.messaging.highlightstab.classicfeatures.plugins.feeditems.standard;

import X.06Z;
import X.2Qz;
import X.7zS;
import X.7zT;
import X.8Kh;
import X.9cG;
import X.AZg;
import X.Aaj;
import X.C9yk;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: StandardFeedItemsImplementation.class */
public final class StandardFeedItemsImplementation {
    public final 06Z A00;
    public final FbUserSession A01;
    public final 9cG A02;
    public final Aaj A03;
    public final 2Qz A04;
    public final HighlightsFeedContent A05;
    public final C9yk A06;
    public final 8Kh A07;
    public final MigColorScheme A08;
    public final AZg A09;

    public StandardFeedItemsImplementation(06Z r302, FbUserSession fbUserSession, 9cG r304, Aaj aaj, 2Qz r306, HighlightsFeedContent highlightsFeedContent, C9yk c9yk, 8Kh r309, MigColorScheme migColorScheme, AZg aZg) {
        7zT.A1W(highlightsFeedContent, r309, migColorScheme, aaj);
        7zS.A18(7, r306, fbUserSession, c9yk);
        this.A05 = highlightsFeedContent;
        this.A07 = r309;
        this.A08 = migColorScheme;
        this.A03 = aaj;
        this.A09 = aZg;
        this.A02 = r304;
        this.A04 = r306;
        this.A01 = fbUserSession;
        this.A06 = c9yk;
        this.A00 = r302;
    }
}
