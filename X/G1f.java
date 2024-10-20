package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import com.meta.foa.widgets.AnimatableView;

/* loaded from: G1f.class */
public final class G1f implements Runnable {
    public static final String __redex_internal_original_name = "CdsScreenLoadingViewHandler$showLoadingView$1";
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ EpF A01;

    public G1f(FrameLayout frameLayout, EpF epF) {
        this.A01 = epF;
        this.A00 = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EpF epF = this.A01;
        FrameLayout frameLayout = this.A00;
        boolean BRZ = epF.A04.BRZ();
        Interpolator interpolator = DN5.A09;
        Context context = epF.A01;
        int A01 = AbstractC01883tB.A01(MfW.A1w, BRZ);
        Integer num = 0S2.A0R;
        ELy BF0 = AbstractC01883tB.A00.BF0();
        11T.A0F(BF0, 0);
        Drawable dn5 = new DN5(context, A01, (int) FAg.A00(context, F0X.A01(BF0).D0h(num)));
        AnimatableView animatableView = new AnimatableView(context);
        animatableView.A02(dn5);
        FrameLayout frameLayout2 = epF.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            epF.A00 = frameLayout2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!epF.A05) {
            Integer num2 = 0S2.A0C;
            ELy BF02 = AbstractC01883tB.A00.BF0();
            11T.A0F(BF02, 0);
            DqH ACV = F0X.A01(BF02).ACV(num2);
            MfW mfW = (MfW) ACV.A02;
            float f = ACV.A00;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(FAg.A00(context, F0X.A00().AIL(0S2.A0Y)));
            gradientDrawable.setStroke((int) f, AbstractC01883tB.A01(mfW, BRZ));
            gradientDrawable.setColor(AbstractC01883tB.A01(MfW.A1y, BRZ));
            2KP A02 = AbstractC01883tB.A02(0S2.A15);
            Button button = new Button(context);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(2131955696);
            float f2 = A02.A00;
            button.setTextSize(f2);
            FAg.A02(context, button, MfW.A25, num2, BRZ);
            button.setLineSpacing(0.0f, AbstractC01883tB.A00(A02.A02));
            FGp.A00();
            String name = ((ER9) A02.A04).name();
            1BK.A1M(context, name);
            button.setTypeface(F2e.A00(name));
            DKF.A13(context, button, A02, f2);
            FXr.A03(button, epF, 4);
            frameLayout2.addView(FAg.A01(context, button));
        }
        frameLayout2.addView(animatableView, layoutParams);
        frameLayout.addView(frameLayout2);
        animatableView.A00();
    }
}
