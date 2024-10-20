package X;

import android.animation.AnimatorSet;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: GC2.class */
public final class GC2 extends C00q implements Function2 {
    public static final GC2 A00 = new GC2();

    public GC2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DPy dPy = (DPy) obj2;
        11T.A0F(dPy, 1);
        List A002 = DPy.A00(dPy.A06, dPy, 0);
        List A003 = DPy.A00(dPy.A07, dPy, 1);
        List A004 = DPy.A00(dPy.A05, dPy, 2);
        AnimatorSet animatorSet = dPy.A01;
        animatorSet.playTogether(0QD.A0O(A003, 0QD.A0O(A004, A002)));
        animatorSet.addListener(new DMI(dPy, 8));
        dPy.A00 = true;
        0K6.A00(animatorSet);
        return new C2md(new G9D(dPy, 48));
    }
}
