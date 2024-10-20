package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.user.model.User;
import java.util.Queue;

/* loaded from: F6e.class */
public final class F6e {
    public Context A00;
    public View A01;
    public Queue A02;
    public final Context A03;
    public final FHN A04;
    public final EsR A05;
    public final User A06;
    public final Runnable A07;
    public final FHq A08;

    public F6e(Context context) {
        11T.A0F(context, 1);
        this.A03 = context;
        this.A08 = (FHq) 1Bn.A0E(context, (1BY) null, 98328);
        this.A04 = (FHN) 1Bi.A03(85203);
        this.A06 = 7zQ.A0v();
        this.A07 = new G0n(this);
        this.A05 = new EsR(this);
    }

    public static final void A00(RH5 rh5, F6e f6e) {
        View view = f6e.A01;
        if (view != null) {
            View view2 = rh5.A00;
            if (view2.getParent() != null) {
                ViewParent parent = view2.getParent();
                11T.A0I(parent, 7zK.A00(0));
                ((ViewGroup) parent).removeView(view2);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(view2);
            f6e.A08.A04(view2, new FpO(view, f6e, 0), viewGroup.getResources().getDimensionPixelOffset(2132279303));
        }
    }
}
