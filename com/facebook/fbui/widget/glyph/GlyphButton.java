package com.facebook.fbui.widget.glyph;

import X.5Wo;
import X.C1oo;
import X.C1uu;
import X.C1uv;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbImageButton;

/* loaded from: GlyphButton.class */
public class GlyphButton extends FbImageButton {
    public ColorStateList A00;

    public GlyphButton(Context context) {
        this(context, null);
    }

    public GlyphButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlyphButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1b, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = 5Wo.A00(context, obtainStyledAttributes, 0);
            refreshDrawableState();
            invalidate();
        }
        obtainStyledAttributes.recycle();
    }

    public void A02(int i) {
        this.A00 = ColorStateList.valueOf(i);
        refreshDrawableState();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        ColorFilter colorFilter;
        super.drawableStateChanged();
        ColorStateList colorStateList = this.A00;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            C1uv c1uv = C1uu.A03;
            colorFilter = C1uv.A00(colorForState);
        } else {
            colorFilter = null;
        }
        setColorFilter(colorFilter);
    }
}
