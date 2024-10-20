package com.facebook.messaging.highlightstab.classicfeatures.plugins.feeditems.storytray;

import X.11T;
import X.2Qz;
import X.7zT;
import X.AZg;
import X.C9yk;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: StoryTrayImplementation.class */
public final class StoryTrayImplementation {
    public final LiveData A00;
    public final FbUserSession A01;
    public final 2Qz A02;
    public final C9yk A03;
    public final MigColorScheme A04;
    public final AZg A05;

    public StoryTrayImplementation(LiveData liveData, FbUserSession fbUserSession, 2Qz r304, C9yk c9yk, MigColorScheme migColorScheme, AZg aZg) {
        11T.A0F(fbUserSession, 1);
        7zT.A11(2, migColorScheme, r304, liveData, c9yk);
        this.A01 = fbUserSession;
        this.A04 = migColorScheme;
        this.A05 = aZg;
        this.A02 = r304;
        this.A00 = liveData;
        this.A03 = c9yk;
    }
}
