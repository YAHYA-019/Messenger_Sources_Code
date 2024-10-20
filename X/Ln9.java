package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: Ln9.class */
public final class Ln9 implements Runnable {
    public static final String __redex_internal_original_name = "BottomToolbarController$1$1";
    public final /* synthetic */ LTj A00;
    public final /* synthetic */ boolean A01;

    public Ln9(LTj lTj, boolean z) {
        this.A00 = lTj;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view;
        C3237JnY c3237JnY = this.A00.A00;
        boolean z = this.A01;
        if (c3237JnY.A07 == z || (view = c3237JnY.A00) == null) {
            return;
        }
        c3237JnY.A07 = z;
        float dimension = view.getResources().getDimension(2132279387);
        float measuredWidth = view.getMeasuredWidth() / dimension;
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        float[] fArr = new float[2];
        JR0.A1L(fArr, measuredWidth, f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new LF2(c3237JnY, dimension));
        0K6.A00(ofFloat);
    }
}
