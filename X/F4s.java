package X;

import android.animation.Animator;

/* loaded from: F4s.class */
public final class F4s {
    public 5Gk A00;
    public final Dq5 A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Dq5] */
    public F4s() {
        ?? obj = new Object();
        obj.A03 = "";
        obj.A04 = true;
        obj.A01 = 1;
        obj.A02 = null;
        obj.A00 = 0.0f;
        this.A01 = obj;
    }

    public static final void A00(F4s f4s) {
        5Gk r0 = f4s.A00;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        Dq5 dq5 = f4s.A01;
        if (dq5.A04) {
            r0.CXT();
        }
        int i = dq5.A01;
        if (i == 0) {
            r0.Cfo();
        } else {
            r0.Cfn(i);
        }
        Animator.AnimatorListener animatorListener = dq5.A02;
        if (animatorListener != null) {
            r0.A5u(animatorListener);
        }
        r0.CkF(dq5.A00);
    }
}
