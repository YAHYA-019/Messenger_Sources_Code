package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GX1.class */
public final class GX1 extends 2kG {
    public final int A00;
    public final int A01;
    public final int A02;

    public GX1(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        7zT.A1S(rect, view, recyclerView);
        int A05 = RecyclerView.A05(view);
        int i = this.A01;
        int i2 = A05 % i;
        int i3 = this.A00;
        rect.left = (i3 * i2) / i;
        rect.right = (i3 * ((i - 1) - i2)) / i;
        if (A05 >= i) {
            rect.top = this.A02;
        }
    }
}
