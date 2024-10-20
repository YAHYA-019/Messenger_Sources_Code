package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.0Ss, reason: invalid class name */
/* loaded from: 0Ss.class */
public final class C0Ss implements Runnable {
    public static final String __redex_internal_original_name = "WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3";
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 0Sp A02;
    public final /* synthetic */ 0St A03;
    public final /* synthetic */ 0Sw A04;

    public C0Ss(ValueAnimator valueAnimator, View view, 0Sp r304, 0St r305, 0Sw r306) {
        this.A03 = r305;
        this.A01 = view;
        this.A04 = r306;
        this.A02 = r304;
        this.A00 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        0xV.A02(this.A01, this.A02, this.A04);
        0K6.A00(this.A00);
    }
}
