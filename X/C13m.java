package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.13m, reason: invalid class name */
/* loaded from: 13m.class */
public abstract class C13m {
    public static final List A1A(Iterable iterable) {
        11T.A0F(iterable, 0);
        List A0W = 0QD.A0W(iterable);
        Collections.shuffle(A0W);
        return A0W;
    }

    public static final 0OI A1B() {
        return new 0OI(10);
    }

    public static final 0OI A1C(List list) {
        0OI r301 = (0OI) list;
        0OI.A06(r301);
        r301.isReadOnly = true;
        if (r301.length <= 0) {
            r301 = 0OI.A00;
        }
        return r301;
    }
}
