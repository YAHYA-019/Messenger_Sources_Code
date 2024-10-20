package X;

import java.util.function.Predicate;

/* loaded from: Lu9.class */
public final class Lu9 implements Predicate {
    public final int A00;

    public Lu9(int i) {
        this.A00 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.A00) {
            case 0:
                KNG kng = LEJ.A0A;
                return L9d.A00(((Jt1) obj).A09) != null;
            case 1:
            case 2:
                return obj == KPt.A01;
            default:
                return false;
        }
    }
}
