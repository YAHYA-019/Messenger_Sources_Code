package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GXv.class */
public final class GXv extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(476121434);
        super.onSizeChanged(i, i2, i3, i4);
        Hh5 A00 = 7kT.A00(getResources(), new C6po(4.0f, 6, 8, 48, 8, 10, 8, 10, 0), getWidth(), getHeight());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), A00.A02);
        A1D(gridLayoutManager);
        GWO gwo = this.A0C;
        if (gwo instanceof GWO) {
            GWO gwo2 = gwo;
            if (gwo2 != null) {
                gwo2.A00 = A00;
            }
            gridLayoutManager.A01 = new GW5(A00, this, 0);
        }
        0FI.A0C(119968598, A06);
    }
}
