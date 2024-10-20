package X;

import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.9u3, reason: invalid class name */
/* loaded from: 9u3.class */
public final class C9u3 implements Aar {
    public static volatile 8Kf A0E;
    public static volatile 8Kg A0F;
    public static volatile 95Z A0G;
    public static volatile C95a A0H;
    public static volatile 8LH A0I;
    public static volatile HighlightsTabFeedLoaderState A0J;
    public static volatile C9fj A0K;
    public static volatile 6BY A0L;
    public static volatile 8Kh A0M;
    public static volatile C95p A0N;
    public static volatile 8Kl A0O;
    public static volatile ImmutableList A0P;
    public static volatile List A0Q;
    public final 8Kf A00;
    public final 8Kg A01;
    public final 95Z A02;
    public final C95a A03;
    public final 8LH A04;
    public final HighlightsTabFeedLoaderState A05;
    public final C9fj A06;
    public final 6BY A07;
    public final 8Kh A08;
    public final C95p A09;
    public final 8Kl A0A;
    public final ImmutableList A0B;
    public final List A0C;
    public final Set A0D;

    public C9u3(C9kj c9kj) {
        this.A02 = c9kj.A02;
        this.A06 = c9kj.A06;
        this.A0B = c9kj.A0B;
        this.A05 = c9kj.A05;
        this.A04 = c9kj.A04;
        this.A09 = c9kj.A09;
        this.A0A = c9kj.A0A;
        this.A07 = c9kj.A07;
        this.A03 = c9kj.A03;
        this.A08 = c9kj.A08;
        this.A0C = c9kj.A0C;
        this.A00 = c9kj.A00;
        this.A01 = c9kj.A01;
        this.A0D = Collections.unmodifiableSet(c9kj.A0D);
    }

    public static C9u3 A00(C9kj c9kj, C95a c95a) {
        c9kj.A03 = c95a;
        C9kj.A00(c9kj, "montageLoaderState");
        return new C9u3(c9kj);
    }

    public static void A01(C9u2 c9u2, C9kj c9kj, String str) {
        C9kj.A00(c9kj, str);
        C9u2.A01(c9u2, new C9u3(c9kj));
    }

    @Override // X.Aar
    public 95Z AVU() {
        if (this.A0D.contains("activeNowLoaderState")) {
            return this.A02;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = 95Z.A03;
                }
            }
        }
        return A0G;
    }

    @Override // X.Aar
    public C9fj AgB() {
        if (this.A0D.contains("currentlyAndRecentlyActiveEntities")) {
            return this.A06;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    C9fj c9fj = C9fj.A03;
                    11T.A0B(c9fj);
                    A0K = c9fj;
                }
            }
        }
        return A0K;
    }

    @Override // X.Aar
    public ImmutableList ApI() {
        if (this.A0D.contains("highlightsPymkResult")) {
            return this.A0B;
        }
        if (A0P == null) {
            synchronized (this) {
                if (A0P == null) {
                    A0P = 1BK.A0b();
                }
            }
        }
        return A0P;
    }

    @Override // X.Aar
    public HighlightsTabFeedLoaderState ApJ() {
        if (this.A0D.contains("highlightsTabFeedLoaderState")) {
            return this.A05;
        }
        if (A0J == null) {
            synchronized (this) {
                if (A0J == null) {
                    A0J = new HighlightsTabFeedLoaderState(1BK.A0d(), 0S2.A00);
                }
            }
        }
        return A0J;
    }

    @Override // X.Aar
    public 8LH ApK() {
        if (this.A0D.contains("highlightsTabFeedResult")) {
            return this.A04;
        }
        if (A0I == null) {
            synchronized (this) {
                if (A0I == null) {
                    A0I = 8LH.A02;
                }
            }
        }
        return A0I;
    }

    @Override // X.Aar
    public C95p Ath() {
        if (this.A0D.contains("lifeEventsLoaderState")) {
            return this.A09;
        }
        if (A0N == null) {
            synchronized (this) {
                if (A0N == null) {
                    A0N = C95p.A04;
                }
            }
        }
        return A0N;
    }

    @Override // X.Aar
    public 8Kl Ati() {
        if (this.A0D.contains("lifeEventsResult")) {
            return this.A0A;
        }
        if (A0O == null) {
            synchronized (this) {
                if (A0O == null) {
                    A0O = 8Kl.A02;
                }
            }
        }
        return A0O;
    }

    @Override // X.Aar
    public 6BY AyI() {
        if (this.A0D.contains("montageListResult")) {
            return this.A07;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    A0L = 6BY.A02;
                }
            }
        }
        return A0L;
    }

    @Override // X.Aar
    public C95a AyJ() {
        if (this.A0D.contains("montageLoaderState")) {
            return this.A03;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = C95a.A04;
                }
            }
        }
        return A0H;
    }

    @Override // X.Aar
    public 8Kh B6O() {
        if (this.A0D.contains("recommendedPublicChannelsResult")) {
            return this.A08;
        }
        if (A0M == null) {
            synchronized (this) {
                if (A0M == null) {
                    A0M = 8Kh.A01;
                }
            }
        }
        return A0M;
    }

    @Override // X.Aar
    public List B81() {
        if (this.A0D.contains("richStatuses")) {
            return this.A0C;
        }
        if (A0Q == null) {
            synchronized (this) {
                if (A0Q == null) {
                    A0Q = C0ty.A00;
                }
            }
        }
        return A0Q;
    }

    @Override // X.Aar
    public 8Kf BH4() {
        if (this.A0D.contains("trendingChannelsResult")) {
            return this.A00;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = 8Kf.A01;
                }
            }
        }
        return A0E;
    }

    @Override // X.Aar
    public 8Kg BH5() {
        if (this.A0D.contains("trendingCommunitiesResult")) {
            return this.A01;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = 8Kg.A01;
                }
            }
        }
        return A0F;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9u3)) {
                return false;
            }
            C9u3 c9u3 = (C9u3) obj;
            if (AVU() != c9u3.AVU() || !11T.A0O(AgB(), c9u3.AgB()) || !11T.A0O(ApI(), c9u3.ApI()) || !11T.A0O(ApJ(), c9u3.ApJ()) || !11T.A0O(ApK(), c9u3.ApK()) || Ath() != c9u3.Ath() || !11T.A0O(Ati(), c9u3.Ati()) || !11T.A0O(AyI(), c9u3.AyI()) || AyJ() != c9u3.AyJ() || !11T.A0O(B6O(), c9u3.B6O()) || !11T.A0O(B81(), c9u3.B81()) || !11T.A0O(BH4(), c9u3.BH4()) || !11T.A0O(BH5(), c9u3.BH5())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(AyI(), C1pq.A04(Ati(), (C1pq.A04(ApK(), C1pq.A04(ApJ(), C1pq.A04(ApI(), C1pq.A04(AgB(), C3o5.A03(AVU()) + 31)))) * 31) + C3o5.A03(Ath())));
        C95a AyJ = AyJ();
        if (AyJ != null) {
            i = AyJ.ordinal();
        }
        return C1pq.A04(BH5(), C1pq.A04(BH4(), C1pq.A04(B81(), C1pq.A04(B6O(), (A04 * 31) + i))));
    }
}
