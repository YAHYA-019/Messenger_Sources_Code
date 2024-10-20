package X;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9lk, reason: invalid class name */
/* loaded from: 9lk.class */
public abstract class C9lk {
    public static final ImmutableList A00;
    public static final ImmutableList A01;
    public static final ImmutableList A02;
    public static final ImmutableList A03;
    public static final TimeInterpolator A04;
    public static final TimeInterpolator A05;

    static {
        PathInterpolator pathInterpolator = new PathInterpolator(0.85f, 0.0f, 0.85f, 0.9f);
        A04 = pathInterpolator;
        PathInterpolator pathInterpolator2 = new PathInterpolator(0.1f, 0.0f, 0.0f, 1.0f);
        A05 = pathInterpolator2;
        ImmutableList of = ImmutableList.of((Object) new 8Jf(pathInterpolator2, -2.0f, 0KF.A02(375.0d)), (Object) A02(new LinearInterpolator(), 100.0d, -2.0f), (Object) new 8Jf(pathInterpolator, 0.2f, 0KF.A02(310.0d)), (Object) A02(new AccelerateDecelerateInterpolator(), 215.0d, 0.0f));
        11T.A0A(of);
        A01 = of;
        ImmutableList of2 = ImmutableList.of((Object) new 8Jf(pathInterpolator2, 2.0f, 0KF.A02(375.0d)), (Object) new 8Jf(new AccelerateDecelerateInterpolator(), 2.4f, 0KF.A02(100.0d)), (Object) new 8Jf(new AccelerateDecelerateInterpolator(), 0.85f, 0KF.A02(310.0d)), (Object) A02(new AccelerateDecelerateInterpolator(), 215.0d, 1.0f));
        11T.A0A(of2);
        A00 = of2;
        ImmutableList of3 = ImmutableList.of((Object) A02(pathInterpolator2, 375.0d, 1.0f), (Object) A02(new LinearInterpolator(), 100.0d, 1.0f), (Object) A02(pathInterpolator, 310.0d, 0.0f));
        11T.A0A(of3);
        A02 = of3;
        ImmutableList of4 = ImmutableList.of((Object) A02(pathInterpolator2, 375.0d, 1.0f), (Object) A02(new LinearInterpolator(), 100.0d, 1.0f), (Object) A02(pathInterpolator, 310.0d, 0.0f));
        11T.A0A(of4);
        A03 = of4;
    }

    public static final AnimatorSet A00(List list, Function1 function1) {
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(A0z);
                return animatorSet;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            8Jf r0 = (8Jf) next;
            A0z.add(A01(r0.A02, function1, i2 == 0 ? 0.0f : ((8Jf) list.get(i2 - 1)).A00, r0.A00, r0.A01));
            i = i3;
        }
    }

    public static final ValueAnimator A01(TimeInterpolator timeInterpolator, Function1 function1, float f, float f2, long j) {
        AR3 ar3 = new AR3(function1, f2, f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(timeInterpolator);
        C9ne.A00(ofFloat, ar3, 16);
        return ofFloat;
    }

    public static 8Jf A02(TimeInterpolator timeInterpolator, double d, float f) {
        return new 8Jf(timeInterpolator, f, 0KF.A02(d));
    }
}
