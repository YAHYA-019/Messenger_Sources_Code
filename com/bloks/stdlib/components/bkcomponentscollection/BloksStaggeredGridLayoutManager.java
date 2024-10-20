package com.bloks.stdlib.components.bkcomponentscollection;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: BloksStaggeredGridLayoutManager.class */
public final class BloksStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public boolean A00;

    private final boolean A00(View view) {
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return true;
        }
        if (parent instanceof View) {
            return A00((View) parent);
        }
        return false;
    }

    public void A0y(RecyclerView recyclerView) {
        if (this.A00) {
            this.A00 = false;
        } else if (A00(recyclerView)) {
            recyclerView.requestLayout();
        }
    }
}
