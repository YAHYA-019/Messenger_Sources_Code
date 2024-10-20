package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Fjh.class */
public final class Fjh implements 7yA {
    public boolean A00;
    public final 1Br A01;
    public final WeakReference A02;
    public final Function1 A03;
    public final Function2 A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05;

    public Fjh(View view, Function1 function1, Function2 function2) {
        this.A03 = function1;
        this.A04 = function2;
        this.A02 = 7zL.A14(view);
        this.A01 = 1HG.A00(4YU.A08(view), 68747);
        Rk7 rk7 = new Rk7(this);
        this.A05 = rk7;
        view.getViewTreeObserver().addOnGlobalLayoutListener(rk7);
    }

    public void destroy() {
        View A0G = DKC.A0G(this.A02);
        if (A0G != null) {
            A0G.getViewTreeObserver().removeOnGlobalLayoutListener(this.A05);
        }
    }
}
