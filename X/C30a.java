package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.30a, reason: invalid class name */
/* loaded from: 30a.class */
public final class C30a {
    public static final C30a A00 = new Object();

    public static final int A00(2PI r301) {
        3Gl r0 = 3Gl.$redex_init_class;
        switch (r301.ordinal()) {
            case 0:
                return 0;
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            default:
                return 7;
            case 2:
            case 3:
                return 6;
            case 4:
                return 4;
            case 6:
                return 2;
            case 9:
                return 5;
            case 11:
                return 1;
            case 12:
                return 3;
        }
    }

    public static final int A01(2PI r301) {
        3Gl r0 = 3Gl.$redex_init_class;
        switch (r301.ordinal()) {
            case 0:
                return 0;
            case 2:
            case 3:
                return 4;
            case 4:
                return 3;
            case 6:
                return 5;
            case 11:
                return 1;
            case 12:
                return 2;
            default:
                return 6;
        }
    }

    public final List A02(2PI r302, Iterable iterable) {
        2PI[] r308;
        if (0QD.A00(iterable) <= 2) {
            return 0QD.A0V(iterable);
        }
        HashSet A0Q = 0QD.A0Q(iterable);
        2PI r0 = 2PI.A09;
        A0Q.remove(r0);
        A0Q.remove(2PI.A02);
        A0Q.remove(2PI.A06);
        if (A0Q.size() < 1) {
            throw AnonymousClass001.A0T("Enable at least one TabType Beside INBOX and AI");
        }
        if (0QD.A00(iterable) < 5) {
            List A0W = 0QD.A0W(A0Q);
            if (A0W.size() > 1) {
                0RC.A0y(A0W, new Ls8(7));
            }
            r308 = new 2PI[]{r0, r302, (2PI) 1BK.A0r(A0W)};
        } else {
            List A0W2 = 0QD.A0W(A0Q);
            if (A0W2.size() > 1) {
                0RC.A0y(A0W2, new Ls8(8));
            }
            r308 = new 2PI[]{r0, (2PI) 1BK.A0r(A0W2), r302, (2PI) A0W2.get(1), (2PI) A0W2.get(2)};
        }
        return C0s8.A14(r308);
    }
}
