package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: C7n.class */
public final class C7n {
    public final ThreadKey A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public C7n(ThreadKey threadKey, ImmutableList immutableList, String str, String str2) {
        this.A01 = immutableList;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = threadKey;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7n)) {
                return false;
            }
            C7n c7n = (C7n) obj;
            if (!11T.A0O(this.A01, c7n.A01) || !11T.A0O(this.A02, c7n.A02) || !11T.A0O(this.A03, c7n.A03) || !11T.A0O(this.A00, c7n.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }
}
