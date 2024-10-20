package X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* loaded from: AKz.class */
public final class AKz extends C00q implements C00m {
    public final /* synthetic */ C1rn $currentAlpha;
    public final /* synthetic */ C1rn $currentTranslationY;
    public final /* synthetic */ 4NU $fadeInAnimator;
    public final /* synthetic */ 4NU $fadeOutAnimator;
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ int $hintHeightTranslation;
    public final /* synthetic */ C1rn $nextAlpha;
    public final /* synthetic */ C2lh $nextHintIndex;
    public final /* synthetic */ C1rn $nextTranslationY;
    public final /* synthetic */ AnimatorListenerAdapter $translationOnAnimationEndListener;
    public final /* synthetic */ 4NU $translationYAnimator;
    public final /* synthetic */ C8fb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKz(AnimatorListenerAdapter animatorListenerAdapter, Handler handler, C1rn c1rn, C1rn c1rn2, C1rn c1rn3, C1rn c1rn4, 4NU r308, 4NU r309, 4NU r310, C2lh c2lh, C8fb c8fb, int i) {
        super(0);
        this.$currentAlpha = c1rn;
        this.$nextAlpha = c1rn2;
        this.$nextHintIndex = c2lh;
        this.$handler = handler;
        this.this$0 = c8fb;
        this.$translationYAnimator = r308;
        this.$nextTranslationY = c1rn3;
        this.$currentTranslationY = c1rn4;
        this.$hintHeightTranslation = i;
        this.$translationOnAnimationEndListener = animatorListenerAdapter;
        this.$fadeInAnimator = r309;
        this.$fadeOutAnimator = r310;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        7zN.A1G(this.$currentAlpha, 1.0f);
        7zN.A1G(this.$nextAlpha, 0.0f);
        this.$nextHintIndex.A04(AV0.A00(this.this$0, 1));
        Handler handler = this.$handler;
        C8fb c8fb = this.this$0;
        4NU r0 = this.$translationYAnimator;
        C1rn c1rn = this.$nextTranslationY;
        C1rn c1rn2 = this.$currentTranslationY;
        int i = this.$hintHeightTranslation;
        AnimatorListenerAdapter animatorListenerAdapter = this.$translationOnAnimationEndListener;
        4NU r02 = this.$fadeInAnimator;
        handler.postDelayed(new AHN(animatorListenerAdapter, c1rn, c1rn2, this.$nextAlpha, this.$currentAlpha, r0, r02, this.$fadeOutAnimator, c8fb, i), 3000L);
        return 7zL.A0T(new AKN(this.$handler, 11));
    }
}
