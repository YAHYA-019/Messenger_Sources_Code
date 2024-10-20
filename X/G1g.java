package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meta.foa.widgets.AnimatableView;

/* loaded from: G1g.class */
public final class G1g implements Runnable {
    public static final String __redex_internal_original_name = "CdsScreenNativeLoadingViewHandler$showLoadingView$1";
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ En3 A01;

    public G1g(FrameLayout frameLayout, En3 en3) {
        this.A01 = en3;
        this.A00 = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        En3 en3 = this.A01;
        FrameLayout frameLayout = this.A00;
        Context context = en3.A01;
        boolean A00 = 6tN.A00(context);
        Interpolator interpolator = DN5.A09;
        int A01 = AbstractC01883tB.A01(MfW.A1w, A00);
        Integer num = 0S2.A0R;
        ELy BF0 = AbstractC01883tB.A00.BF0();
        11T.A0F(BF0, 0);
        Drawable dn5 = new DN5(context, A01, (int) FAg.A00(context, F0X.A01(BF0).D0h(num)));
        AnimatableView animatableView = new AnimatableView(context);
        animatableView.A02(dn5);
        FrameLayout frameLayout2 = en3.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            en3.A00 = frameLayout2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Integer num2 = 0S2.A0C;
        ELy BF02 = AbstractC01883tB.A00.BF0();
        11T.A0F(BF02, 0);
        DqH ACV = F0X.A01(BF02).ACV(num2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(FAg.A00(context, F0X.A00().AIL(0S2.A0Y)));
        gradientDrawable.setStroke((int) ACV.A00, AbstractC01883tB.A01((MfW) ACV.A02, A00));
        gradientDrawable.setColor(AbstractC01883tB.A01(MfW.A1y, A00));
        2KP A02 = AbstractC01883tB.A02(0S2.A15);
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(2131955696);
        float f = A02.A00;
        button.setTextSize(f);
        FAg.A02(context, button, MfW.A25, num2, A00);
        button.setLineSpacing(0.0f, AbstractC01883tB.A00(A02.A02));
        DKF.A13(context, button, A02, f);
        FXr.A03(button, en3, 5);
        LinearLayout A012 = FAg.A01(context, button);
        frameLayout2.addView(animatableView, layoutParams);
        frameLayout2.addView(A012);
        ViewGroup viewGroup = (ViewGroup) frameLayout2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout2);
        }
        frameLayout.addView(frameLayout2);
        animatableView.A00();
    }
}
