package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GWt.class */
public final class GWt extends 2kG {
    public int A00;

    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        2XA r0 = recyclerView.A0F;
        if (r0 instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) r0;
            int i = gridLayoutManager.A00;
            int A05 = RecyclerView.A05(view);
            if (A05 == 0 && gridLayoutManager.A01.A00(A05) > 1) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                return;
            }
            if (gridLayoutManager.A01.A00(0) > 1) {
                A05--;
            }
            int i2 = A05 % i;
            int i3 = this.A00;
            int i4 = i3 / i;
            rect.left = i4 * i2;
            rect.right = ((i - i2) - 1) * i4;
            rect.bottom = i3;
        }
    }
}
