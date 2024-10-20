package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mrlimit.composerblock;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MrLimitComposerBlockBannerImplementation.class */
public final class MrLimitComposerBlockBannerImplementation {
    public static String A06;
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final String A05;

    public MrLimitComposerBlockBannerImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, String str) {
        1BL.A1F(context, fbUserSession);
        11T.A0F(str, 4);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = threadSummary;
        this.A05 = str;
        this.A02 = 1Bq.A00(67196);
        this.A03 = 1Bu.A00(99674);
    }
}
