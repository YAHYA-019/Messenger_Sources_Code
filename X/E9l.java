package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: E9l.class */
public final class E9l extends C66m {
    public final /* synthetic */ F5e A00;

    public E9l(F5e f5e) {
        this.A00 = f5e;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        11T.A0F(c66i, 0);
        if (c66i.A01 != 0.0d) {
            this.A00.A00.setVisibility(0);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        11T.A0F(c66i, 0);
        double d = c66i.A01;
        F5e f5e = this.A00;
        if (d == 0.0d) {
            f5e.A00.setVisibility(8);
            return;
        }
        View view = f5e.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        11T.A0I(layoutParams, GOm.A00(2));
        layoutParams.height = -2;
        view.requestLayout();
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        11T.A0F(c66i, 0);
        int round = Math.round((float) c66i.A09.A00);
        int round2 = Math.round((float) c66i.A01);
        if (round == 0) {
            if (round2 == 0) {
                View view = this.A00.A00;
                if (view.getVisibility() == 0) {
                    view.setVisibility(8);
                    return;
                }
            }
        } else if (round > 0) {
            View view2 = this.A00.A00;
            if (view2.getVisibility() != 0) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.A00.A00;
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        11T.A0I(layoutParams, GOm.A00(2));
        layoutParams.height = round;
        view3.requestLayout();
    }
}
