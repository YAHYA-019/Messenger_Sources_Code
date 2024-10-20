package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GWw.class */
public final class GWw extends 2kG {
    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        2XA r0 = recyclerView.A0F;
        if (r0 instanceof GridLayoutManager) {
            int i = ((GridLayoutManager) r0).A00;
            int A05 = RecyclerView.A05(view) % i;
            int dimensionPixelOffset = GOo.A0A(recyclerView).getDimensionPixelOffset(2132279320);
            int i2 = dimensionPixelOffset / i;
            rect.left = A05 * i2;
            rect.right = ((i - A05) - 1) * i2;
            rect.bottom = dimensionPixelOffset;
        }
    }
}
