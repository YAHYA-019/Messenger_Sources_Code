package X;

import android.animation.ValueAnimator;

/* renamed from: X.9nc, reason: invalid class name */
/* loaded from: 9nc.class */
public final class C9nc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ 8CD A03;

    public C9nc(8CD r302, float f, float f2, float f3) {
        this.A03 = r302;
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        11T.A0F(valueAnimator, 0);
        8CD r0 = this.A03;
        r0.A00 = 7zV.A01(valueAnimator);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        r0.A06 = (int) (animatedFraction < 0.5f ? 255.0f * animatedFraction : (1.0f - animatedFraction) * 255.0f);
        int i = r0.A07;
        if (i > 0 && r0.A08 == i && valueAnimator.getAnimatedFraction() > 0.5f) {
            r0.A06 = Math.max(r0.A06, 32);
            r0.A00 = Math.min(r0.A00, this.A01);
        }
        float f = r0.A00;
        float f2 = this.A00;
        float f3 = f2 - this.A02;
        float f4 = f - (f3 * 0.5f);
        r0.A04 = f4;
        if (f4 <= f3) {
            float f5 = f4 + f3;
            r0.A04 = f5;
            if (f5 > f2) {
                r0.A04 = f5 - f3;
            }
        }
        float animatedFraction2 = valueAnimator.getAnimatedFraction() - 0.5f;
        if (animatedFraction2 <= 0.0f) {
            animatedFraction2 += 1.0f;
        }
        r0.A09 = (int) (animatedFraction2 < 0.5f ? 255.0f * animatedFraction2 : 255.0f * (1.0f - animatedFraction2));
        r0.invalidate();
    }
}
