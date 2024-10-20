package com.facebook.messaging.communitymessaging.plugins.communitypreview.stickyfooter;

import X.06Z;
import X.0S2;
import X.11T;
import X.1BL;
import X.2MX;
import X.C3Nf;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: FoldersStickyFooterImplementation.class */
public final class FoldersStickyFooterImplementation {
    public String A00;
    public String A01;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final LithoView A05;
    public final C3Nf A06;
    public final ThreadKey A07;
    public final 2MX A08;
    public volatile Integer A09;

    public FoldersStickyFooterImplementation(Context context, 06Z r303, FbUserSession fbUserSession, LithoView lithoView, C3Nf c3Nf, ThreadKey threadKey, 2MX r308) {
        1BL.A1H(context, c3Nf, r303);
        11T.A0F(fbUserSession, 4);
        11T.A0F(lithoView, 6);
        this.A02 = context;
        this.A06 = c3Nf;
        this.A03 = r303;
        this.A04 = fbUserSession;
        this.A07 = threadKey;
        this.A05 = lithoView;
        this.A08 = r308;
        this.A09 = 0S2.A00;
    }
}
