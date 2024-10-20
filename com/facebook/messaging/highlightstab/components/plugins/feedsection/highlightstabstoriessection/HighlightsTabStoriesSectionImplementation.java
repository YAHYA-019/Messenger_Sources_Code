package com.facebook.messaging.highlightstab.components.plugins.feedsection.highlightstabstoriessection;

import X.11T;
import X.2Qz;
import X.7zR;
import X.7zT;
import X.AZg;
import X.Aa5;
import X.C9yk;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: HighlightsTabStoriesSectionImplementation.class */
public final class HighlightsTabStoriesSectionImplementation {
    public final MutableLiveData A00;
    public final FbUserSession A01;
    public final 2Qz A02;
    public final C9yk A03;
    public final Aa5 A04;
    public final MigColorScheme A05;
    public final AZg A06;
    public final ImmutableList A07;

    public HighlightsTabStoriesSectionImplementation(MutableLiveData mutableLiveData, FbUserSession fbUserSession, 2Qz r304, C9yk c9yk, Aa5 aa5, MigColorScheme migColorScheme, AZg aZg, ImmutableList immutableList) {
        7zT.A1W(migColorScheme, c9yk, immutableList, aa5);
        11T.A0F(r304, 6);
        7zR.A1P(fbUserSession, mutableLiveData);
        this.A05 = migColorScheme;
        this.A03 = c9yk;
        this.A07 = immutableList;
        this.A04 = aa5;
        this.A06 = aZg;
        this.A02 = r304;
        this.A01 = fbUserSession;
        this.A00 = mutableLiveData;
    }
}
