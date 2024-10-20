package com.facebook.messaging.quickpromotion.plugins.threadlist.threadlistbanner;

import X.0fH;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.1ED;
import X.1Kd;
import X.1QB;
import X.1Qc;
import X.2S4;
import X.2Ws;
import X.2bG;
import X.2zO;
import X.3iE;
import X.AbstractC03373xu;
import X.C03363xt;
import X.C2bd;
import X.C2bf;
import X.C2bg;
import X.C2bh;
import X.C2bj;
import X.C3e4;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.quickpromotion.plugins.threadlist.threadlistbanner.ThreadListBannerImplementation;
import java.util.concurrent.Executor;

/* loaded from: ThreadListBannerImplementation.class */
public final class ThreadListBannerImplementation {
    public C03363xt A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 2S4 A03;
    public final 1Br A04;
    public final 2Ws A05;
    public final C2bj A06;
    public final Runnable A07;
    public final C2bd A08;
    public final C2bh A09;

    /* JADX WARN: Type inference failed for: r0v28, types: [X.2bi] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.2bj] */
    public ThreadListBannerImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, 2Ws r305) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r305, 3);
        11T.A0F(r304, 4);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A05 = r305;
        this.A03 = r304;
        this.A04 = 1Bq.A00(65804);
        this.A08 = new C2bd(this);
        this.A07 = new Runnable() { // from class: X.2be
            public static final String __redex_internal_original_name = "ThreadListBannerImplementation$dismissBannerRunnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                ThreadListBannerImplementation threadListBannerImplementation = ThreadListBannerImplementation.this;
                if (threadListBannerImplementation.A00 != null) {
                    threadListBannerImplementation.A00 = null;
                    threadListBannerImplementation.A05.Bks("quick_promotion");
                }
            }
        };
        final 1CO r0 = (1CO) 1Bi.A03(16385);
        this.A09 = new C2bh(new C2bg(this, r0), new C2bf(r0));
        final ?? r02 = new Object() { // from class: X.2bi
        };
        this.A06 = new Object(r02) { // from class: X.2bj
            public final C2bi A00;

            {
                this.A00 = r02;
            }
        };
    }

    public static final void A00(Context context, ThreadListBannerImplementation threadListBannerImplementation) {
        C2bh c2bh = threadListBannerImplementation.A09;
        InterstitialTrigger interstitialTrigger = 2bG.A0E;
        11T.A0B(interstitialTrigger);
        C2bd c2bd = threadListBannerImplementation.A08;
        11T.A0F(c2bd, 2);
        1CO r0 = c2bh.A00.A00;
        if (r0.AZk(36317474655907106L)) {
            0fH.A0n("QuickPromotionThreadListManager", "Fetch inbox QP banner via Critical Path Controller");
            1Qc r02 = (1Qc) 1Bi.A03(65837);
            3iE r03 = new 3iE(context, interstitialTrigger, c2bd, c2bh);
            1QB r04 = (1QB) 1Bn.A0E(context, (1BY) null, 65841);
            r04.A01 = r03;
            r04.A04("InboxBannerQPTrigger");
            r02.A03(1QB.A00(r04, "Background"), "KeepExisting");
            return;
        }
        if (!r0.AZk(36317474655841569L)) {
            AbstractC03373xu.A00(c2bd, C2bh.A00(context, interstitialTrigger, c2bh));
            return;
        }
        1ED r05 = (1ED) 1Bi.A03(16469);
        Executor executor = (Executor) 1Bi.A03(16456);
        1Kd.A0F(new C3e4(c2bd, 8), r05.D3C(new 2zO(1, context, interstitialTrigger, c2bh)), executor);
    }
}
