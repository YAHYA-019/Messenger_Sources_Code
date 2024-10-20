package com.facebook.messaging.business.bmcconsiderationgrowth.conversationfeedback.plugins.threadview.ondemandthreadviewbanner;

import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;

/* loaded from: ThreadViewOnDemandBannerImplementation.class */
public final class ThreadViewOnDemandBannerImplementation {
    public static int A05 = 255;
    public static String A06 = "";
    public static InterstitialTrigger A07;
    public static InterstitialTriggerContext A08;
    public static boolean A09;
    public int A00;
    public boolean A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;

    public ThreadViewOnDemandBannerImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A04 = 1Bu.A01(context, 50062);
    }
}
