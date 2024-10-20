package X;

import java.util.List;

/* renamed from: X.9hz, reason: invalid class name */
/* loaded from: 9hz.class */
public final class C9hz {
    public final int A00;
    public final List A01;

    public C9hz() {
        this(AnonymousClass001.A0s(), -1);
    }

    public C9hz(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9hz)) {
                return false;
            }
            C9hz c9hz = (C9hz) obj;
            if (!11T.A0O(this.A01, c9hz.A01) || this.A00 != c9hz.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EditHistoryState(history=");
        A0k.append(this.A01);
        A0k.append(", currentIndex=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
