package com.google.android.material.internal;

import X.LQD;
import X.MDu;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: NavigationMenuView.class */
public class NavigationMenuView extends RecyclerView implements MDu {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A1D(new LinearLayoutManager(context, 1, false));
    }

    @Override // X.MDu
    public void BPG(LQD lqd) {
    }
}
