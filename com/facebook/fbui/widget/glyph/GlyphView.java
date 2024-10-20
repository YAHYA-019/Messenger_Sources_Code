package com.facebook.fbui.widget.glyph;

import X.0FI;
import X.5Wo;
import X.AnonymousClass001;
import X.C1oo;
import X.C1uu;
import X.C1uv;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.widget.FbImageView;

/* loaded from: GlyphView.class */
public class GlyphView extends FbImageView {
    public ColorStateList A00;

    public GlyphView(Context context) {
        this(context, null);
    }

    public GlyphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlyphView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1b, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId > 0) {
            if (getDrawable() != null) {
                throw AnonymousClass001.A0T("XML should not specify both android:src and fb:source. Please only use fb:source");
            }
            setImageDrawable(context.getDrawable(resourceId));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = 5Wo.A00(context, obtainStyledAttributes, 0);
            refreshDrawableState();
            invalidate();
        }
        obtainStyledAttributes.recycle();
    }

    public void A00(int i) {
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

    @Override // com.facebook.widget.FbImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1823592136);
        super.onAttachedToWindow();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
        0FI.A0C(1079797529, A06);
    }

    @Override // com.facebook.widget.FbImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1892025191);
        super.onDetachedFromWindow();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        0FI.A0C(-1746210879, A06);
    }

    @Override // com.facebook.widget.FbImageView, android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    @Override // com.facebook.widget.FbImageView, android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
    }
}
