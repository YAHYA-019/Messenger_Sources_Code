package X;

import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9g2, reason: invalid class name */
/* loaded from: 9g2.class */
public final class C9g2 {
    public RelativeLayout A00;
    public boolean A01;
    public final 8Nu A02;
    public final java.util.Map A03 = 1BK.A1C();
    public final ScaleAnimation A04;
    public final ScaleAnimation A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.view.animation.Interpolator, java.lang.Object] */
    public C9g2(8Nu r302) {
        this.A02 = r302;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 1.0f);
        this.A05 = scaleAnimation;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 1.0f);
        this.A04 = scaleAnimation2;
        A00(this, true);
        scaleAnimation.setDuration(450L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new Object());
        scaleAnimation2.setDuration(450L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation2.setInterpolator(new Object());
    }

    public static final void A00(C9g2 c9g2, boolean z) {
        ImageView imageView;
        ScaleAnimation scaleAnimation;
        C96e c96e = c9g2.A01 ? C96e.A05 : C96e.A03;
        Iterator A0y = AnonymousClass001.A0y(c9g2.A03);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (A0z.getKey() == c96e || A0z.getKey() == C96e.A02) {
                ((9Q2) A0z.getValue()).A01.setAlpha(1.0f);
                JVb jVb = ((9Q2) A0z.getValue()).A00;
                if (z) {
                    if (jVb != null) {
                        jVb.stop();
                    }
                    imageView = ((9Q2) A0z.getValue()).A01;
                    scaleAnimation = c9g2.A04;
                } else {
                    if (jVb != null) {
                        jVb.start();
                    }
                    imageView = ((9Q2) A0z.getValue()).A01;
                    scaleAnimation = c9g2.A05;
                }
                imageView.startAnimation(scaleAnimation);
            } else {
                ((9Q2) A0z.getValue()).A01.setAlpha(0.0f);
                JVb jVb2 = ((9Q2) A0z.getValue()).A00;
                if (jVb2 != null) {
                    jVb2.stop();
                }
            }
        }
    }
}
