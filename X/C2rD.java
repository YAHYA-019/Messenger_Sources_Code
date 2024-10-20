package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2rD, reason: invalid class name */
/* loaded from: 2rD.class */
public final class C2rD {
    public static final C2rD A02 = new C2rD(-1, false);
    public static final C2rD A03 = new C2rD(-2, false);
    public static final C2rD A04 = new C2rD(-1, true);
    public final int A00;
    public final boolean A01;

    public C2rD(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C2rD)) {
                return false;
            }
            C2rD c2rD = (C2rD) obj;
            if (this.A00 == c2rD.A00 && this.A01 == c2rD.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 0J6.A00(Integer.valueOf(this.A00), Boolean.valueOf(this.A01));
    }

    public String toString() {
        return 1BK.A15((Locale) null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A01)}, 2));
    }
}
