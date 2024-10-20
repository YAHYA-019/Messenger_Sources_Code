package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* loaded from: C98.class */
public final class C98 {
    public static volatile Integer A07;
    public final 9ZS A00;
    public final ThreadSummary A01;
    public final ImmutableList A02;
    public final Integer A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;

    public C98(Bwk bwk) {
        this.A03 = bwk.A03;
        this.A05 = bwk.A05;
        this.A06 = bwk.A06;
        9ZS r0 = bwk.A00;
        C1pq.A08("rowItemCollection", r0);
        this.A00 = r0;
        ImmutableList immutableList = bwk.A02;
        C1pq.A08("selectedMessages", immutableList);
        this.A02 = immutableList;
        this.A01 = bwk.A01;
        this.A04 = Collections.unmodifiableSet(bwk.A04);
    }

    public int A00() {
        Integer num;
        if (this.A04.contains("bottomButtonResId")) {
            num = this.A03;
        } else {
            if (A07 == null) {
                synchronized (this) {
                    if (A07 == null) {
                        A07 = 2131965647;
                    }
                }
            }
            num = A07;
        }
        return num.intValue();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C98)) {
                return false;
            }
            C98 c98 = (C98) obj;
            if (A00() != c98.A00() || this.A05 != c98.A05 || this.A06 != c98.A06 || !11T.A0O(this.A00, c98.A00) || !11T.A0O(this.A02, c98.A02) || !11T.A0O(this.A01, c98.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A02(C1pq.A02(A00() + 31, this.A05), this.A06))));
    }
}
