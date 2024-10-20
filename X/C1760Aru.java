package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Aru, reason: case insensitive filesystem */
/* loaded from: Aru.class */
public final class C1760Aru extends C04v {
    public final int A00;
    public final ImmutableList A01;
    public final boolean A02;

    public C1760Aru(ImmutableList immutableList, int i, boolean z) {
        this.A00 = i;
        this.A01 = immutableList;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1760Aru)) {
                return false;
            }
            C1760Aru c1760Aru = (C1760Aru) obj;
            if (this.A00 != c1760Aru.A00 || !11T.A0O(this.A01, c1760Aru.A01) || this.A02 != c1760Aru.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, this.A00 * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}
