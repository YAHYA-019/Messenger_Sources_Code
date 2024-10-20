package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.3s9, reason: invalid class name */
/* loaded from: 3s9.class */
public abstract class C3s9 {
    public static final Interpolator A00;
    public static final 5Rm A01;
    public static final 5Rm A02;
    public static final 5Rm A03;
    public static final 5Rn A04;

    static {
        5Rl r0 = new 5Rl(5Rk.A02);
        A03 = r0;
        A02 = new 5Rl(5Rk.A03);
        A04 = 5Rn.A02;
        A01 = r0;
        A00 = new AccelerateDecelerateInterpolator();
    }

    public static 5X3 A00(5Rn r301, String str) {
        Integer num;
        if (r301 == 5Rn.A01) {
            num = 0S2.A0N;
        } else {
            if (r301 != 5Rn.A02) {
                throw AnonymousClass001.A0T(AnonymousClass001.A0Z(r301, "Unhandled TransitionKeyType ", AnonymousClass001.A0k()));
            }
            num = 0S2.A01;
        }
        5X4 r0 = new 5X4();
        r0.A00 = new 5X5(num, str);
        return r0;
    }

    public static 5X3 A01(5Rn r301, String... strArr) {
        Integer num;
        if (r301 == 5Rn.A01) {
            num = 0S2.A0Y;
        } else {
            if (r301 != 5Rn.A02) {
                throw AnonymousClass001.A0T(AnonymousClass001.A0Z(r301, "Unhandled TransitionKeyType ", AnonymousClass001.A0k()));
            }
            num = 0S2.A0C;
        }
        5X4 r0 = new 5X4();
        r0.A00 = new 5X5(num, strArr);
        return r0;
    }

    public static 5X3 A02(String str) {
        return A00(5Rn.A01, str);
    }
}
