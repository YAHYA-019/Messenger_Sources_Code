package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;

/* loaded from: Lqv.class */
public final class Lqv implements Runnable {
    public static final String __redex_internal_original_name = "NotesStandardAnimatedEmojiComponent$render$startAnimatorRunnable$1$1";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ 4NU A01;
    public final /* synthetic */ 4NU A02;
    public final /* synthetic */ C2lh A03;
    public final /* synthetic */ 8YG A04;

    public Lqv(Handler handler, 4NU r303, 4NU r304, C2lh c2lh, 8YG r306) {
        this.A04 = r306;
        this.A00 = handler;
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = c2lh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        8YG r0 = this.A04;
        Handler handler = this.A00;
        4NU r02 = this.A01;
        4NU r03 = this.A02;
        C2lh c2lh = this.A03;
        1sP.A00();
        Animator animator = (Animator) r02.A00;
        if (animator != null) {
            animator.cancel();
        }
        1sP.A00();
        LQZ lqz = (LQZ) r03.A00;
        if (lqz != null) {
            lqz.A02();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        ofFloat.setDuration(200L);
        LF7.A00(ofFloat, c2lh, 11);
        ofFloat.addListener(new 9nX(r0, r03, 5));
        1sP.A00();
        r02.A00 = ofFloat;
        LQZ lqz2 = new LQZ(new Kdz());
        L8i l8i = new L8i();
        l8i.A02 = 1.0d;
        l8i.A03(400.0f);
        l8i.A02(0.2f);
        lqz2.A07 = l8i;
        lqz2.A04 = 0.002f;
        lqz2.A04(new LQe(c2lh));
        JQy.A1P(new LQc(handler, r02, r0), lqz2.A0C);
        1sP.A00();
        r03.A00 = lqz2;
        1sP.A00();
        Animator animator2 = (Animator) r02.A00;
        if (animator2 != null) {
            0K6.A00(animator2);
        }
    }
}
