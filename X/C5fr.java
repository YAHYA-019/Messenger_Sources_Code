package X;

import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.5fr, reason: invalid class name */
/* loaded from: 5fr.class */
public final class C5fr {
    public static volatile C1z1 A0G;
    public static volatile 1M1 A0H;
    public static volatile HeterogeneousMap A0I;
    public static volatile 1Ks A0J;
    public final long A00;
    public final long A01;
    public final long A02;
    public final UserKey A03;
    public final Capabilities A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final C1z1 A0B;
    public final 1M1 A0C;
    public final HeterogeneousMap A0D;
    public final String A0E;
    public final Set A0F;

    public C5fr(C1z1 c1z1, 1M1 r303, UserKey userKey, Capabilities capabilities, HeterogeneousMap heterogeneousMap, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Set set, long j, long j2, long j3) {
        this.A0E = str;
        C1pq.A08("authorId", str2);
        this.A06 = str2;
        C1pq.A08("authorName", str3);
        this.A07 = str3;
        this.A08 = str4;
        C1pq.A08("authorProfPicUrl", str5);
        this.A09 = str5;
        this.A0A = str6;
        this.A03 = userKey;
        this.A0B = c1z1;
        this.A04 = capabilities;
        this.A05 = num;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A0D = heterogeneousMap;
        this.A0C = r303;
        this.A0F = Collections.unmodifiableSet(set);
    }

    public C1z1 A00() {
        if (this.A0F.contains("blockedByViewerStatus")) {
            return this.A0B;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = C1z1.NOT_BLOCKED;
                }
            }
        }
        return A0G;
    }

    public 1M1 A01() {
        if (this.A0F.contains("reachabilityStatusType")) {
            return this.A0C;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = 1M1.A0D;
                }
            }
        }
        return A0H;
    }

    public HeterogeneousMap A02() {
        if (this.A0F.contains("metadata")) {
            return this.A0D;
        }
        if (A0I == null) {
            synchronized (this) {
                if (A0I == null) {
                    Parcelable.Creator creator = HeterogeneousMap.CREATOR;
                    A0I = C1zz.A02();
                }
            }
        }
        return A0I;
    }

    public 1Ks A03() {
        if (this.A0F.contains("restrictionType")) {
            return null;
        }
        if (A0J == null) {
            synchronized (this) {
                if (A0J == null) {
                    A0J = 1Ks.A05;
                }
            }
        }
        return A0J;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5fr)) {
                return false;
            }
            C5fr c5fr = (C5fr) obj;
            if (!11T.A0O(this.A0E, c5fr.A0E) || !11T.A0O(this.A06, c5fr.A06) || !11T.A0O(this.A07, c5fr.A07) || !11T.A0O(this.A08, c5fr.A08) || !11T.A0O(this.A09, c5fr.A09) || !11T.A0O(this.A0A, c5fr.A0A) || !11T.A0O(this.A03, c5fr.A03) || A00() != c5fr.A00() || !11T.A0O(this.A04, c5fr.A04) || this.A05 != c5fr.A05 || this.A00 != c5fr.A00 || this.A01 != c5fr.A01 || this.A02 != c5fr.A02 || !11T.A0O(A02(), c5fr.A02()) || A01() != c5fr.A01() || A03() != c5fr.A03()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A0E, 1)))))));
        C1z1 A00 = A00();
        int i = -1;
        int A042 = C1pq.A04(this.A04, (A04 * 31) + (A00 == null ? -1 : A00.ordinal()));
        Integer num = this.A05;
        int A043 = C1pq.A04(A02(), C1pq.A01(C1pq.A01(C1pq.A01((((A042 * 31) + (num == null ? -1 : num.intValue())) * 31) + 1237, this.A00), this.A01), this.A02));
        1M1 A01 = A01();
        int ordinal = (A043 * 31) + (A01 == null ? -1 : A01.ordinal());
        1Ks A03 = A03();
        if (A03 != null) {
            i = A03.ordinal();
        }
        return (ordinal * 31) + i;
    }
}
