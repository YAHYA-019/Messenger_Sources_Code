package com.facebook.fbui.widget.text;

import X.5Wo;
import X.C1oo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: GlyphWithTextView.class */
public class GlyphWithTextView extends ImageWithTextView {
    public ColorStateList A00;

    public GlyphWithTextView(Context context) {
        this(context, null);
    }

    public GlyphWithTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GlyphWithTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList A00;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1b, i, 0);
        if (obtainStyledAttributes.hasValue(0) && this.A00 != (A00 = 5Wo.A00(context, obtainStyledAttributes, 0))) {
            this.A00 = A00;
            refreshDrawableState();
            invalidate();
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(Drawable drawable) {
        if (!(drawable instanceof LayerDrawable)) {
            ColorStateList colorStateList = this.A00;
            drawable.mutate().setColorFilter(colorStateList == null ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getDrawableState(), 0), PorterDuff.Mode.SRC_IN));
            return;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            A00(layerDrawable.getDrawable(i));
        }
    }

    @Override // com.facebook.fbui.widget.text.ImageWithTextView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = ((ImageWithTextView) this).A05;
        if (drawable != null) {
            A00(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
