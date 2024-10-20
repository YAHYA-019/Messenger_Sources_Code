package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meta.foa.widgets.AnimatableView;

/* loaded from: GCG.class */
public final class GCG extends ESS {
    public Activity A00;
    public Window A01;
    public RNf A02;
    public final 1Br A03;
    public final 1Br A04;

    public GCG() {
        this.A04 = 1Bu.A00(98431);
        this.A03 = 1Bq.A00(99785);
    }

    public GCG(int i) {
    }

    public String A00() {
        RNf rNf = this.A02;
        if (rNf != null) {
            return rNf.A02;
        }
        11T.A0L("unifiedLauncherFlowConfig");
        throw 0Q8.createAndThrow();
    }

    public void A01() {
        Erj erj = (Erj) 1Br.A0B(this.A03);
        Window window = this.A01;
        if (window != null) {
            erj.A00(window);
        } else {
            11T.A0L("window");
            throw 0Q8.createAndThrow();
        }
    }

    public void A02() {
        String str;
        Erj erj = (Erj) 1Br.A0B(this.A03);
        Activity activity = this.A00;
        if (activity != null) {
            Window window = this.A01;
            if (window != null) {
                if (window.getDecorView() == null || erj.A00 != null) {
                    return;
                }
                View decorView = window.getDecorView();
                11T.A0I(decorView, 7zK.A00(0));
                ViewGroup viewGroup = (ViewGroup) decorView;
                boolean A00 = EVf.A00(activity, 2Mg.A00);
                View childAt = viewGroup.getChildAt(0);
                11T.A0A(childAt);
                float f = 0.3f;
                if (A00) {
                    f = 0.4f;
                }
                childAt.setAlpha(f);
                window.addFlags(16);
                erj.A00 = new ImageView(activity);
                int i = 2132213917;
                if (A00) {
                    i = 2132213766;
                }
                int color = activity.getColor(i);
                Interpolator interpolator = DN5.A09;
                Drawable dn5 = new DN5(activity, color, (int) FAg.A00(activity, 38.0f));
                View view = erj.A00;
                11T.A0I(view, "null cannot be cast to non-null type com.meta.foa.widgets.AnimatableView");
                ((AnimatableView) view).A02(dn5);
                View view2 = erj.A00;
                11T.A0I(view2, "null cannot be cast to non-null type com.meta.foa.widgets.AnimatableView");
                ((AnimatableView) view2).A00();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                viewGroup.addView(erj.A00, layoutParams);
                return;
            }
            str = "window";
        } else {
            str = "activity";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
