package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Hsu.class */
public final class Hsu {
    public final ThreadKey A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Collection A07;
    public final java.util.Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B = true;

    public Hsu(ThreadKey threadKey, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, Collection collection, java.util.Map map, boolean z, boolean z2) {
        this.A07 = collection;
        this.A08 = map;
        this.A09 = z;
        this.A02 = str;
        C1pq.A08("localCallId", str2);
        this.A03 = str2;
        this.A04 = str3;
        this.A0A = z2;
        this.A05 = str4;
        this.A00 = threadKey;
        C1pq.A08("trigger", str5);
        this.A06 = str5;
        C1pq.A08("userIdsToRing", immutableList);
        this.A01 = immutableList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hsu)) {
                return false;
            }
            Hsu hsu = (Hsu) obj;
            if (!11T.A0O(this.A07, hsu.A07) || !11T.A0O(this.A08, hsu.A08) || this.A09 != hsu.A09 || !11T.A0O(this.A02, hsu.A02) || !11T.A0O(this.A03, hsu.A03) || !11T.A0O(this.A04, hsu.A04) || this.A0A != hsu.A0A || !11T.A0O(this.A05, hsu.A05) || !11T.A0O(this.A00, hsu.A00) || !11T.A0O(this.A06, hsu.A06) || !11T.A0O(this.A01, hsu.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A06, C1pq.A04(this.A00, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A05(true))), this.A09)))), this.A0A)))));
    }
}
