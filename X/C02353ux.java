package X;

import java.util.Arrays;

/* renamed from: X.3ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ux.class */
public final class C02353ux {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C02353ux(int i, int i2) {
        this(i, i2, 2048.0f, 0.6666667f);
    }

    public C02353ux(int i, int i2, float f, float f2) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = f;
        this.A01 = f2;
        if (!(i > 0)) {
            throw AnonymousClass001.A0N("Check failed.");
        }
        if (i2 <= 0) {
            throw AnonymousClass001.A0N("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C02353ux)) {
                return false;
            }
            C02353ux c02353ux = (C02353ux) obj;
            if (this.A03 != c02353ux.A03 || this.A02 != c02353ux.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A03 + 31) * 31) + this.A02;
    }

    public String toString() {
        String format = String.format(null, "%dx%d", Arrays.copyOf(AnonymousClass001.A1b(Integer.valueOf(this.A03), this.A02), 2));
        11T.A0A(format);
        return format;
    }
}
