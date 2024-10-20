package X;

import com.facebook.widget.FacebookProgressCircleView;
import com.facebook.widget.FacebookProgressCircleViewAnimated;

/* loaded from: Iuk.class */
public final class Iuk implements Runnable {
    public static final String __redex_internal_original_name = "FacebookProgressCircleViewAnimated$1";
    public final /* synthetic */ FacebookProgressCircleViewAnimated A00;

    public Iuk(FacebookProgressCircleViewAnimated facebookProgressCircleViewAnimated) {
        this.A00 = facebookProgressCircleViewAnimated;
    }

    @Override // java.lang.Runnable
    public void run() {
        FacebookProgressCircleViewAnimated facebookProgressCircleViewAnimated = this.A00;
        double d = ((FacebookProgressCircleView) facebookProgressCircleViewAnimated).A00;
        double d2 = facebookProgressCircleViewAnimated.A01;
        if (d >= d2) {
            facebookProgressCircleViewAnimated.A00 = 0.0f;
            facebookProgressCircleViewAnimated.A03 = false;
            ((FacebookProgressCircleView) facebookProgressCircleViewAnimated).A00 = d2;
        } else {
            facebookProgressCircleViewAnimated.A03 = true;
            float f = facebookProgressCircleViewAnimated.A00;
            ((FacebookProgressCircleView) facebookProgressCircleViewAnimated).A00 = d + Math.min(((int) Math.min(f, 8.0f)) + 1, 99);
            facebookProgressCircleViewAnimated.A00 = f + 0.0f;
            facebookProgressCircleViewAnimated.invalidate();
            facebookProgressCircleViewAnimated.A04.postDelayed(this, 20);
        }
    }
}
