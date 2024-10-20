package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.333, reason: invalid class name */
/* loaded from: 333.class */
public final class AnonymousClass333 extends Animation {
    public final int A00;
    public final Object A01;

    public AnonymousClass333(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.A00 = i;
        this.A01 = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.A01;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                return;
            case 1:
                int abs = swipeRefreshLayout.A05 - Math.abs(swipeRefreshLayout.A04);
                swipeRefreshLayout.A06((swipeRefreshLayout.A02 + ((int) ((abs - r0) * f))) - swipeRefreshLayout.A0A.getTop());
                2MK r0 = swipeRefreshLayout.A0B;
                float f2 = 1.0f - f;
                2MN r02 = r0.A05;
                if (f2 != r02.A00) {
                    r02.A00 = f2;
                }
                r0.invalidateSelf();
                return;
            default:
                swipeRefreshLayout.A06((swipeRefreshLayout.A02 + ((int) ((swipeRefreshLayout.A04 - r0) * f))) - swipeRefreshLayout.A0A.getTop());
                return;
        }
    }
}
