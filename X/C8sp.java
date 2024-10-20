package X;

import java.util.Set;

/* renamed from: X.8sp, reason: invalid class name */
/* loaded from: 8sp.class */
public final class C8sp extends 99P {
    public final Set A00;
    public final boolean A01;

    public C8sp(Set set, boolean z) {
        11T.A0F(set, 1);
        this.A00 = set;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8sp)) {
                return false;
            }
            C8sp c8sp = (C8sp) obj;
            if (!11T.A0O(this.A00, c8sp.A00) || this.A01 != c8sp.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
