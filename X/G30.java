package X;

import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: G30.class */
public final class G30 implements Runnable {
    public static final String __redex_internal_original_name = "ConfirmationView$3";
    public final /* synthetic */ View A00;
    public final /* synthetic */ DQV A01;

    public G30(View view, DQV dqv) {
        this.A01 = dqv;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        DQV dqv = this.A01;
        NestedScrollView nestedScrollView = dqv.A04;
        View view = this.A00;
        Rect A0C = DKC.A0C();
        dqv.A04.getDrawingRect(A0C);
        float f = A0C.bottom;
        float bottom = view.getBottom();
        NestedScrollView.A05(nestedScrollView, 0, f > bottom ? 0 : (int) (bottom - f), false);
    }
}
