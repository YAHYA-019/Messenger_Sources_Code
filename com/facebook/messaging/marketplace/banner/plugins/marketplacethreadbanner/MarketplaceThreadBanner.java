package com.facebook.messaging.marketplace.banner.plugins.marketplacethreadbanner;

import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1LI;
import X.2JX;
import X.5Sc;
import X.6Il;
import X.6JD;
import X.6Ky;
import X.7OX;
import X.9DU;
import X.9pW;
import X.C00i;
import X.C9g0;
import X.C9pa;
import X.CQi;
import X.Kmd;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLMarketplaceThreadBannerFaviconType;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: MarketplaceThreadBanner.class */
public final class MarketplaceThreadBanner {
    public 2JX A00;
    public boolean A01;
    public 1BY A02;
    public final C00i A04 = new 1BV((1BY) null, 68126);
    public final C00i A05 = new 1BQ(16456);
    public final C00i A03 = new 1BV((1BY) null, 131356);

    public MarketplaceThreadBanner(1BO r302) {
        this.A02 = new 1BY(r302);
    }

    public static void A00(Context context, FbUserSession fbUserSession, MarketplaceThreadBanner marketplaceThreadBanner, 7OX r304, 5Sc r305) {
        MarketplaceThreadData marketplaceThreadData;
        6Il r0;
        6Il r02;
        ThreadSummary threadSummary = r305.A02;
        if (threadSummary == null || (marketplaceThreadData = threadSummary.A0r) == null || marketplaceThreadData.A05 == null) {
            r304.BNt();
            return;
        }
        String A03 = CQi.A03(marketplaceThreadBanner.A00);
        String A02 = CQi.A02(marketplaceThreadBanner.A00);
        String str = CQi.A00(marketplaceThreadBanner.A00) == GraphQLMarketplaceThreadBannerFaviconType.BSG ? "ls://circleicon?icon=friends_generic&iconColor=staticwhite&circleColor=blue" : "ls://circleicon?icon=marketplace&iconColor=staticwhite&circleColor=blue";
        C00i c00i = marketplaceThreadBanner.A03;
        Kmd kmd = (Kmd) c00i.get();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((6JD) kmd.A0I.get()).A06);
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            6Il r03 = (6Il) it.next();
            builder.m11011add((Object) 9DU.A00(new C9pa(3, context, fbUserSession, r03, kmd), r03.BG7(context)));
        }
        ImmutableList build = builder.build();
        if (A03 == null) {
            A03 = "";
        }
        if (A02 == null) {
            A02 = "";
        }
        9pW r04 = new 9pW(3, context, fbUserSession, marketplaceThreadBanner);
        Kmd kmd2 = (Kmd) c00i.get();
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) ((6JD) kmd2.A0I.get()).A05);
        C9g0 c9g0 = null;
        if (copyOf2.size() >= 1 && (r02 = (6Il) 1BK.A0r(copyOf2)) != null) {
            c9g0 = 9DU.A00(new C9pa(1, context, fbUserSession, r02, kmd2), r02.BG7(context));
        }
        Kmd kmd3 = (Kmd) c00i.get();
        ImmutableList copyOf3 = ImmutableList.copyOf((Collection) ((6JD) kmd3.A0I.get()).A05);
        C9g0 c9g02 = null;
        if (copyOf3.size() >= 2 && (r0 = (6Il) copyOf3.get(1)) != null) {
            c9g02 = 9DU.A00(new C9pa(2, context, fbUserSession, r0, kmd3), r0.BG7(context));
        }
        r304.CXr(new 6Ky(r04, (View.OnClickListener) null, (1LI) null, (C9g0) null, c9g0, c9g02, build, str, A02, A03, (Class) null, (Integer) null, 0, false));
    }
}
