package com.facebook.messaging.quickpromotion.plugins.threadviewmsys.banner;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.7Nv;
import X.7Ny;
import X.7OX;
import X.C7Nz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadViewMsysQpBanner.class */
public final class ThreadViewMsysQpBanner {
    public InterstitialTriggerContext A00;
    public ThreadSummary A01;
    public 7OX A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final ThreadKey A0A;
    public final 7Nv A0B;
    public final C7Nz A0C;
    public final 2S4 A0D;

    public ThreadViewMsysQpBanner(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(r304, 3);
        11T.A0F(fbUserSession, 4);
        this.A03 = context;
        this.A0A = threadKey;
        this.A0D = r304;
        this.A04 = fbUserSession;
        this.A05 = 1Bu.A01(context, 67256);
        this.A08 = 1Bu.A01(context, 65935);
        this.A06 = 1Bu.A01(context, 82032);
        this.A07 = 1Bq.A00(16469);
        this.A09 = 1Bq.A00(16456);
        this.A0B = 7Nv.A00(context, fbUserSession, r304, threadKey);
        this.A0C = new 7Ny(this);
    }
}
