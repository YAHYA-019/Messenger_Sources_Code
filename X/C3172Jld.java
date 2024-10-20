package X;

import java.util.Arrays;

/* renamed from: X.Jld, reason: case insensitive filesystem */
/* loaded from: Jld.class */
public final class C3172Jld extends AbstractC3179Jlk {
    public static final Integer A01 = 0S2.A0u;
    public KNg A00;

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C3172Jld) && this.A00 == ((C3172Jld) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A00});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FloatingPoint(");
        return JQy.A0r(this.A00, A0k);
    }
}
