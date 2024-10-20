package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Fji.class */
public final class Fji implements 7yA {
    public int A00;
    public boolean A01;
    public final WeakReference A02;
    public final Function1 A03;
    public final Function1 A04;
    public final Function2 A05;

    public Fji(View view, Function1 function1, Function1 function12, Function2 function2) {
        this.A04 = function1;
        this.A03 = function12;
        this.A05 = function2;
        this.A02 = 7zL.A14(view);
        0fH.A0j("KeyboardVisibilityChangeDetectorR", "Keyboard Window Insets Listener init");
        0Sw.A01(view, new DRd(this));
        0ND.A00(view, new FYo(this));
    }

    public void destroy() {
        0fH.A0j("KeyboardVisibilityChangeDetectorR", "Keyboard Window Insets Listener destroyed");
        View A0G = DKC.A0G(this.A02);
        if (A0G != null) {
            0Sw.A01(A0G, (0Sq) null);
            0ND.A00(A0G, (0NJ) null);
        }
    }
}
