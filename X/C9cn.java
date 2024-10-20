package X;

import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.9cn, reason: invalid class name */
/* loaded from: 9cn.class */
public final class C9cn {
    public static volatile 8LH A03;
    public static volatile HighlightsTabFeedLoaderState A04;
    public final 8LH A00;
    public final HighlightsTabFeedLoaderState A01;
    public final Set A02;

    public C9cn(8LH r302, HighlightsTabFeedLoaderState highlightsTabFeedLoaderState, Set set) {
        this.A01 = highlightsTabFeedLoaderState;
        this.A00 = r302;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public 8LH A00() {
        if (this.A02.contains("highlightsTabFeedResult")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = 8LH.A02;
                }
            }
        }
        return A03;
    }

    public HighlightsTabFeedLoaderState A01() {
        if (this.A02.contains("highlightsTabFeedLoaderState")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = new HighlightsTabFeedLoaderState(1BK.A0d(), 0S2.A00);
                }
            }
        }
        return A04;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cn)) {
                return false;
            }
            C9cn c9cn = (C9cn) obj;
            if (!11T.A0O(A01(), c9cn.A01()) || !11T.A0O(A00(), c9cn.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A03(A01()));
    }
}
