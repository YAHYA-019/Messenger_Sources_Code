package X;

import com.google.common.base.Objects;

/* loaded from: I4e.class */
public final class I4e {
    public final double A00;
    public final double A01;
    public final int A02;
    public static final I4e A04 = new I4e(0, 0.5d, 0.5d);
    public static final I4e A03 = new I4e(1, 0.5d, 0.5d);

    public I4e(int i, double d, double d2) {
        this.A02 = i;
        this.A00 = d;
        this.A01 = d2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof I4e)) {
                return false;
            }
            if (DKG.A1Z(((I4e) obj).A02, Integer.valueOf(this.A02))) {
                Double valueOf = Double.valueOf(0.0d);
                if (Objects.equal(valueOf, valueOf)) {
                    return true;
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(Integer.valueOf(this.A02), Double.valueOf(0.0d));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A02);
        A0k.append(' ');
        A0k.append(0.0d);
        return A0k.toString();
    }
}
