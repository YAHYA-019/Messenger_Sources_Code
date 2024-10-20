package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: AutoMeasureLinearLayoutManager.class */
public class AutoMeasureLinearLayoutManager extends LinearLayoutManager {
    public boolean A00;

    public AutoMeasureLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public boolean A1c() {
        return this.A00;
    }
}
