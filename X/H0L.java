package X;

import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: H0L.class */
public final class H0L extends H65 {
    public Hpv A00;
    public final Context A01;
    public final LottieAnimationView A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;

    public H0L(View view, String str) {
        super(view);
        this.A04 = 1BV.A00(492);
        this.A05 = 1BV.A00(49970);
        Context context = view.getContext();
        this.A01 = context;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C09s.A01(view, 2131367619);
        this.A02 = lottieAnimationView;
        lottieAnimationView.setOnLongClickListener(new FY3(str, this, 2));
        IKB.A00(lottieAnimationView, this, 61);
        lottieAnimationView.setOnTouchListener(new IKf(str, this, 1));
        this.A03 = AbF.A0Q(context, 84088);
    }
}
