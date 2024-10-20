package X;

import java.util.Arrays;

/* renamed from: X.67e, reason: invalid class name */
/* loaded from: 67e.class */
public final class C67e {
    public final C67b A00;
    public final C67d A01;

    public C67e(C67d c67d, C67b c67b) {
        this.A00 = c67b;
        this.A01 = c67d;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C67e) {
            C67e c67e = (C67e) obj;
            if (this.A00 == c67e.A00 && this.A01 == c67e.A01) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A00, this.A01});
    }
}
