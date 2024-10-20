package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3Ob, reason: invalid class name */
/* loaded from: 3Ob.class */
public final class C3Ob {
    public static volatile 1F9 A08;
    public final 1F9 A00;
    public final ThreadKey A01;
    public final ParcelableSecondaryData A02;
    public final Long A03;
    public final String A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;

    public C3Ob(3OE r302) {
        this.A06 = r302.A06;
        this.A03 = r302.A03;
        this.A02 = r302.A02;
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A07 = r302.A07;
        this.A04 = r302.A04;
        this.A05 = Collections.unmodifiableSet(r302.A05);
    }

    public 1F9 A00() {
        if (this.A05.contains("folderName")) {
            return this.A00;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = 1F9.A0I;
                }
            }
        }
        return A08;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3Ob)) {
                return false;
            }
            C3Ob c3Ob = (C3Ob) obj;
            if (this.A06 != c3Ob.A06 || !11T.A0O(this.A03, c3Ob.A03) || !11T.A0O(this.A02, c3Ob.A02) || A00() != c3Ob.A00() || !11T.A0O(this.A01, c3Ob.A01) || this.A07 != c3Ob.A07 || !11T.A0O(this.A04, c3Ob.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(this.A03, C1pq.A05(this.A06)));
        1F9 A00 = A00();
        return C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A01, (A04 * 31) + (A00 == null ? -1 : A00.ordinal())), this.A07));
    }
}
