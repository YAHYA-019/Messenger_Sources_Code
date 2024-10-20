package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GWu.class */
public final class GWu extends 2kG {
    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        7zT.A1S(rect, view, recyclerView);
        2XA r0 = recyclerView.A0F;
        if (!(r0 instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) r0) == null) {
            return;
        }
        int i = gridLayoutManager.A00;
        int A05 = RecyclerView.A05(view) % i;
        if (i > 4) {
            int i2 = 4;
            if (A05 == 0) {
                i2 = 0;
            }
            rect.left = i2;
        } else {
            int i3 = 4 / i;
            rect.left = A05 * i3;
            rect.right = ((i - A05) - 1) * i3;
        }
        rect.bottom = 4;
    }
}
