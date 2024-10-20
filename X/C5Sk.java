package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.5Sk, reason: invalid class name */
/* loaded from: 5Sk.class */
public final class C5Sk implements 5Si {
    public static volatile HeterogeneousMap A06;
    public final int A00;
    public final AnonymousClass690 A01;
    public final HeterogeneousMap A02;
    public final AnonymousClass692 A03;
    public final ImmutableList A04;
    public final Set A05;

    public C5Sk(AnonymousClass690 anonymousClass690, HeterogeneousMap heterogeneousMap, AnonymousClass692 anonymousClass692, ImmutableList immutableList, Set set, int i) {
        this.A01 = anonymousClass690;
        this.A00 = i;
        this.A03 = anonymousClass692;
        this.A02 = heterogeneousMap;
        C1pq.A08("participants", immutableList);
        this.A04 = immutableList;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public HeterogeneousMap A00() {
        if (this.A05.contains("metadata")) {
            return this.A02;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    Parcelable.Creator creator = HeterogeneousMap.CREATOR;
                    A06 = C1zz.A02();
                }
            }
        }
        return A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5Sk)) {
                return false;
            }
            C5Sk c5Sk = (C5Sk) obj;
            if (!11T.A0O(this.A01, c5Sk.A01) || this.A00 != c5Sk.A00 || !11T.A0O(this.A03, c5Sk.A03) || !11T.A0O(A00(), c5Sk.A00()) || !11T.A0O(this.A04, c5Sk.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(this.A03, (C1pq.A03(this.A01) * 31) + this.A00)));
    }
}
