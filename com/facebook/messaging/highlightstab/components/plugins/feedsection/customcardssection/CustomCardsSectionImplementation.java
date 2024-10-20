package com.facebook.messaging.highlightstab.components.plugins.feedsection.customcardssection;

import X.06Z;
import X.1BL;
import X.AZg;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CustomCardsSectionImplementation.class */
public final class CustomCardsSectionImplementation {
    public final 06Z A00;
    public final FbUserSession A01;
    public final MigColorScheme A02;
    public final AZg A03;

    public CustomCardsSectionImplementation(06Z r302, FbUserSession fbUserSession, MigColorScheme migColorScheme, AZg aZg) {
        1BL.A1F(migColorScheme, fbUserSession);
        this.A02 = migColorScheme;
        this.A01 = fbUserSession;
        this.A00 = r302;
        this.A03 = aZg;
    }
}
