package X;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Set;

/* loaded from: C9P.class */
public final class C9P {
    public static volatile Integer A04;
    public final long A00;
    public final 1Hk A01;
    public final Integer A02;
    public final Set A03;

    public C9P(1Hk r302, Integer num, Set set, long j) {
        this.A00 = j;
        this.A02 = num;
        C1pq.A08("virtualFolderName", r302);
        this.A01 = r302;
        this.A03 = Collections.unmodifiableSet(set);
        Integer A00 = A00();
        long j2 = -1;
        Preconditions.checkArgument((A00 == 0S2.A00 && this.A00 == j2) || (A00 == 0S2.A01 && this.A00 != j2));
    }

    public Integer A00() {
        if (this.A03.contains("loadType")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = 0S2.A00;
                }
            }
        }
        return A04;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9P)) {
                return false;
            }
            C9P c9p = (C9P) obj;
            if (this.A00 != c9p.A00 || A00() != c9p.A00() || this.A01 != c9p.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A01 = ((1BL.A01(this.A00) + 31) * 31) + 25;
        int A042 = (A01 * 31) + C3o5.A04(A00());
        return (A042 * 31) + this.A01.ordinal();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VirtualFolderLoaderParams{endTimeMs=");
        A0k.append(this.A00);
        A0k.append(", fetchCount=");
        A0k.append(25);
        A0k.append(", loadType=");
        Integer A00 = A00();
        A0k.append(A00 != null ? 1 - A00.intValue() != 0 ? "THREAD_LIST" : "LOAD_MORE" : "null");
        A0k.append(", virtualFolderName=");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }
}
