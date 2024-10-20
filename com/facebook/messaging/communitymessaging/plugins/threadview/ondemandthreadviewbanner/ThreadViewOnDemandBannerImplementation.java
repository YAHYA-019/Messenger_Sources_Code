package com.facebook.messaging.communitymessaging.plugins.threadview.ondemandthreadviewbanner;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.6EX;
import X.7Nv;
import X.7OX;
import X.7zM;
import X.C7Nz;
import X.DLx;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.concurrent.Future;

/* loaded from: ThreadViewOnDemandBannerImplementation.class */
public final class ThreadViewOnDemandBannerImplementation {
    public static InterstitialTrigger A0B;
    public static InterstitialTriggerContext A0C;
    public static ThreadSummary A0D;
    public static 7OX A0E;
    public static QuickPromotionDefinition A0F;
    public Future A00;
    public boolean A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 7Nv A07;
    public final C7Nz A08;
    public final 2S4 A09;
    public final ThreadKey A0A;

    public ThreadViewOnDemandBannerImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey) {
        1BL.A11(1, context, r304, fbUserSession);
        this.A02 = context;
        this.A0A = threadKey;
        this.A09 = r304;
        this.A03 = fbUserSession;
        this.A07 = 7Nv.A00(context, fbUserSession, r304, threadKey);
        this.A08 = new DLx(this);
        this.A06 = 1Bu.A01(context, 50062);
        this.A05 = 1Bq.A00(16457);
        this.A04 = 7zM.A0Q();
    }

    public static final String A00(ThreadSummary threadSummary) {
        String valueOf = String.valueOf(threadSummary != null ? Long.valueOf(threadSummary.A06) : null);
        if (6EX.A03(valueOf)) {
            return null;
        }
        return valueOf;
    }
}
