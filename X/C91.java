package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.Set;

/* loaded from: C91.class */
public final class C91 {
    public final ImmutableList A00;
    public final boolean A01;
    public final boolean A02;
    public final ImmutableSet A03;
    public final Set A04;

    public C91(C83 c83) {
        ImmutableList immutableList = c83.A00;
        C1pq.A08("dataSourceConfigurations", immutableList);
        this.A00 = immutableList;
        this.A03 = c83.A01;
        this.A01 = c83.A03;
        this.A02 = c83.A04;
        this.A04 = Collections.unmodifiableSet(c83.A02);
    }

    public ImmutableSet A00() {
        if (this.A04.contains("selectedUsersFbIds")) {
            return this.A03;
        }
        synchronized (this) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C91)) {
                return false;
            }
            C91 c91 = (C91) obj;
            if (!11T.A0O(this.A00, c91.A00) || !11T.A0O(A00(), c91.A00()) || this.A01 != c91.A01 || this.A02 != c91.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A04(A00(), (C1pq.A03(this.A00) * 31) - 1), this.A01), this.A02);
    }
}
