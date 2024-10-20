package X;

import java.util.List;

/* renamed from: X.9cO, reason: invalid class name */
/* loaded from: 9cO.class */
public final class C9cO {
    public final List A00;
    public final boolean A01;

    public C9cO(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cO)) {
                return false;
            }
            C9cO c9cO = (C9cO) obj;
            if (!11T.A0O(this.A00, c9cO.A00) || this.A01 != c9cO.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NuxBody(sections=");
        A0k.append(this.A00);
        A0k.append(", notNowButtonEnabled=");
        A0k.append(this.A01);
        return 4YV.A0x(A0k);
    }
}
