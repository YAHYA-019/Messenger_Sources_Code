package X;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import kotlin.jvm.functions.Function1;

/* loaded from: L9x.class */
public final class L9x {
    public static final L9x A00 = new Object();

    public static final LWE A00(C1rn c1rn, MFM mfm, 4NL r303, Function1 function1, float f) {
        4YV.A1N(c1rn, r303);
        LQZ lqz = new LQZ(new JgF(c1rn));
        L8i l8i = new L8i();
        l8i.A02 = f;
        l8i.A03(r303.A01);
        l8i.A02(r303.A00);
        lqz.A07 = l8i;
        if (function1 != null) {
            lqz.A04(new LQd(function1));
        }
        LWE lwe = new LWE(lqz);
        if (mfm != null) {
            lwe.A5w(mfm);
        }
        return lwe;
    }

    public static final LWF A01(Interpolator interpolator, C1rn c1rn, MFM mfm, float f, long j) {
        11T.A0F(c1rn, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(7zM.A00(c1rn.A00), f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(interpolator);
        LF7.A00(ofFloat, c1rn, 6);
        LWF lwf = new LWF(ofFloat);
        if (mfm != null) {
            lwf.A5w(mfm);
        }
        return lwf;
    }

    public final LWI A02(4NX r302, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setStartDelay(j);
        return new LWI(new 4NX[]{new LWF(ofFloat), r302});
    }
}
