package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.77v, reason: invalid class name */
/* loaded from: 77v.class */
public final class C77v implements C6xq {
    public static volatile CharSequence A06;
    public final C79q A00;
    public final CharSequence A01;
    public final Set A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C77v(C79s c79s) {
        this.A03 = c79s.A03;
        this.A01 = c79s.A01;
        this.A04 = c79s.A04;
        this.A05 = c79s.A05;
        this.A00 = c79s.A00;
        this.A02 = Collections.unmodifiableSet(c79s.A02);
    }

    public C77v(CharSequence charSequence, Set set, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = charSequence;
        this.A04 = true;
        this.A05 = z2;
        this.A00 = null;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public CharSequence A00() {
        if (this.A02.contains("initialText")) {
            return this.A01;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = "";
                }
            }
        }
        return A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C77v)) {
                return false;
            }
            C77v c77v = (C77v) obj;
            if (this.A03 != c77v.A03 || !11T.A0O(A00(), c77v.A00()) || this.A04 != c77v.A04 || this.A05 != c77v.A05 || !11T.A0O(this.A00, c77v.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A04(A00(), C1pq.A05(this.A03)), this.A04), this.A05));
    }
}
