package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.7Q1, reason: invalid class name */
/* loaded from: 7Q1.class */
public final class C7Q1 {
    public final C5yq A00;
    public final ThreadSummary A01;
    public final C5yl A02;

    public C7Q1(C5yq c5yq, ThreadSummary threadSummary, C5yl c5yl) {
        this.A02 = c5yl;
        C1pq.A08("fRXLaunchLocation", c5yq);
        this.A00 = c5yq;
        C1pq.A08("threadSummary", threadSummary);
        this.A01 = threadSummary;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7Q1)) {
                return false;
            }
            C7Q1 c7q1 = (C7Q1) obj;
            if (this.A02 != c7q1.A02 || this.A00 != c7q1.A00 || !11T.A0O(this.A01, c7q1.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A03 = C3o5.A03(this.A02) + 31;
        C5yq c5yq = this.A00;
        if (c5yq != null) {
            i = c5yq.ordinal();
        }
        return C1pq.A04(this.A01, (A03 * 31) + i);
    }
}
