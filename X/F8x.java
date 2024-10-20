package X;

import java.util.Collections;
import java.util.Set;

/* loaded from: F8x.class */
public final class F8x {
    public static volatile 2KG A03;
    public final int A00;
    public final 2KG A01;
    public final Set A02;

    public F8x(2KG r302, Set set, int i) {
        this.A00 = i;
        this.A01 = r302;
        this.A02 = Collections.unmodifiableSet(set);
    }

    private 2KG A00() {
        if (this.A02.contains("textAlignment")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = 2KG.A03;
                }
            }
        }
        return A03;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F8x)) {
                return false;
            }
            F8x f8x = (F8x) obj;
            if (this.A00 != f8x.A00 || A00() != f8x.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 923521 + this.A00;
        return (i * 31) + C3o5.A03(A00());
    }
}
