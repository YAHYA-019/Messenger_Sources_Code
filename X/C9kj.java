package X;

import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.9kj, reason: invalid class name */
/* loaded from: 9kj.class */
public final class C9kj {
    public 8Kf A00;
    public 8Kg A01;
    public 95Z A02;
    public C95a A03;
    public 8LH A04;
    public HighlightsTabFeedLoaderState A05;
    public C9fj A06;
    public 6BY A07;
    public 8Kh A08;
    public C95p A09;
    public 8Kl A0A;
    public ImmutableList A0B;
    public List A0C;
    public Set A0D;

    public C9kj() {
        this.A0D = AnonymousClass001.A0v();
    }

    public C9kj(Aar aar) {
        this.A0D = AnonymousClass001.A0v();
        aar.getClass();
        if (aar instanceof C9u3) {
            C9u3 c9u3 = (C9u3) aar;
            this.A02 = c9u3.A02;
            this.A06 = c9u3.A06;
            this.A0B = c9u3.A0B;
            this.A05 = c9u3.A05;
            this.A04 = c9u3.A04;
            this.A09 = c9u3.A09;
            this.A0A = c9u3.A0A;
            this.A07 = c9u3.A07;
            this.A03 = c9u3.A03;
            this.A08 = c9u3.A08;
            this.A0C = c9u3.A0C;
            this.A00 = c9u3.A00;
            this.A01 = c9u3.A01;
            this.A0D = new HashSet(c9u3.A0D);
            return;
        }
        this.A02 = aar.AVU();
        A00(this, "activeNowLoaderState");
        this.A06 = aar.AgB();
        A00(this, "currentlyAndRecentlyActiveEntities");
        ImmutableList ApI = aar.ApI();
        this.A0B = ApI;
        C1pq.A08("highlightsPymkResult", ApI);
        A00(this, "highlightsPymkResult");
        HighlightsTabFeedLoaderState ApJ = aar.ApJ();
        this.A05 = ApJ;
        C1pq.A08("highlightsTabFeedLoaderState", ApJ);
        A00(this, "highlightsTabFeedLoaderState");
        8LH ApK = aar.ApK();
        this.A04 = ApK;
        C1pq.A08("highlightsTabFeedResult", ApK);
        A00(this, "highlightsTabFeedResult");
        this.A09 = aar.Ath();
        A00(this, "lifeEventsLoaderState");
        8Kl Ati = aar.Ati();
        this.A0A = Ati;
        C1pq.A08("lifeEventsResult", Ati);
        A00(this, "lifeEventsResult");
        this.A07 = aar.AyI();
        A00(this, "montageListResult");
        this.A03 = aar.AyJ();
        A00(this, "montageLoaderState");
        8Kh B6O = aar.B6O();
        this.A08 = B6O;
        C1pq.A08("recommendedPublicChannelsResult", B6O);
        A00(this, "recommendedPublicChannelsResult");
        this.A0C = aar.B81();
        A00(this, "richStatuses");
        8Kf BH4 = aar.BH4();
        this.A00 = BH4;
        C1pq.A08("trendingChannelsResult", BH4);
        A00(this, "trendingChannelsResult");
        8Kg BH5 = aar.BH5();
        this.A01 = BH5;
        C1pq.A08("trendingCommunitiesResult", BH5);
        A00(this, "trendingCommunitiesResult");
    }

    public static void A00(C9kj c9kj, String str) {
        if (c9kj.A0D.contains(str)) {
            return;
        }
        HashSet hashSet = new HashSet(c9kj.A0D);
        c9kj.A0D = hashSet;
        hashSet.add(str);
    }
}
