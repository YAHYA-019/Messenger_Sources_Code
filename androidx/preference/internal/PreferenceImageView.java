package androidx.preference.internal;

import X.KdO;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: PreferenceImageView.class */
public class PreferenceImageView extends ImageView {
    public int A00;
    public int A01;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = (-1) >>> 1;
        this.A01 = i2;
        this.A00 = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KdO.A09, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, i2));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, i2));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.A00;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.A01;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = (-1) >>> 1;
        int i4 = (-1) << (-1);
        if (mode == i4 || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int i5 = this.A01;
            if (i5 != i3 && (i5 < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(i5, i4);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == i4 || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int i6 = this.A00;
            if (i6 != i3 && (i6 < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i6, i4);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.A00 = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.A01 = i;
        super.setMaxWidth(i);
    }
}
