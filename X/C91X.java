package X;

import java.util.List;

/* renamed from: X.91X, reason: invalid class name */
/* loaded from: 91X.class */
public final class C91X extends C99g {
    public final C11184vr A00;
    public final List A01;
    public final List A02;
    public final boolean A03;

    public C91X(C11184vr c11184vr, List list, List list2, boolean z) {
        1BL.A1F(list, list2);
        this.A01 = list;
        this.A02 = list2;
        this.A03 = z;
        this.A00 = c11184vr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C91X)) {
                return false;
            }
            C91X c91x = (C91X) obj;
            if (!11T.A0O(this.A01, c91x.A01) || !11T.A0O(this.A02, c91x.A02) || this.A03 != c91x.A03 || !11T.A0O(this.A00, c91x.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A02, 1BL.A03(this.A01)) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A00);
    }
}
