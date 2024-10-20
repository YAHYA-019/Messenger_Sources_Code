package com.facebook.messaging.quickpromotion.plugins.threadview.banner;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.7Nv;
import X.7OX;
import X.C7Nz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.quickpromotion.plugins.threadview.banner.ThreadViewServerQpBanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: ThreadViewServerQpBanner.class */
public final class ThreadViewServerQpBanner {
    public InterstitialTriggerContext A00;
    public ThreadSummary A01;
    public 7OX A02;
    public Future A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final ThreadKey A0B;
    public final 7Nv A0C;
    public final C7Nz A0D;
    public final 2S4 A0E;

    public ThreadViewServerQpBanner(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        11T.A0F(r304, 3);
        11T.A0F(fbUserSession, 4);
        this.A04 = context;
        this.A0B = threadKey;
        this.A0E = r304;
        this.A05 = fbUserSession;
        this.A0A = 1Bu.A01(context, 65935);
        this.A09 = 1Bu.A00(66649);
        this.A07 = 1Bu.A01(context, 66041);
        this.A08 = 1Bq.A00(16457);
        this.A06 = 1Bq.A00(16458);
        this.A0C = 7Nv.A00(context, fbUserSession, r304, threadKey);
        this.A0D = new C7Nz() { // from class: X.7O2
            @Override // X.C7Nz
            public final void D59(InterstitialTrigger interstitialTrigger, Integer num, java.util.Map map) {
                11T.A0F(interstitialTrigger, 1);
                11T.A0F(num, 2);
                ThreadViewServerQpBanner threadViewServerQpBanner = ThreadViewServerQpBanner.this;
                Future future = threadViewServerQpBanner.A03;
                if (future == null || future.isDone()) {
                    threadViewServerQpBanner.A03 = ((ExecutorService) threadViewServerQpBanner.A08.A00.get()).submit((Runnable) new 7Pv(interstitialTrigger, threadViewServerQpBanner, num, map));
                }
            }
        };
    }
}
