package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.7sd, reason: invalid class name */
/* loaded from: 7sd.class */
public final class C7sd {
    public final int A00;
    public final ThreadKey A01;

    public C7sd(ThreadKey threadKey, int i) {
        C1pq.A08("threadKey", threadKey);
        this.A01 = threadKey;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7sd)) {
                return false;
            }
            C7sd c7sd = (C7sd) obj;
            if (!11T.A0O(this.A01, c7sd.A01) || this.A00 != c7sd.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A03(this.A01) * 31) + this.A00;
    }
}
