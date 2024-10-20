package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GX3.class */
public final class GX3 extends 2kG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public GX3(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }

    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        if (this.A00 != 0) {
            rect.set(RecyclerView.A05(view) != 0 ? this.A01 : this.A02, 0, 0, 0);
        } else {
            int A05 = RecyclerView.A05(view);
            rect.set(A05 == 0 ? this.A02 : this.A01, 0, A05 == r304.A00() + (-1) ? this.A02 : this.A01, 0);
        }
    }
}
