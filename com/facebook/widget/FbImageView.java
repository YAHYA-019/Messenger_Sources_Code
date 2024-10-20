package com.facebook.widget;

import X.0FI;
import X.AnonymousClass001;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: FbImageView.class */
public class FbImageView extends ImageView {
    public boolean A00;

    public FbImageView(Context context) {
        super(context);
        this.A00 = false;
    }

    public FbImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = false;
        A00(context, attributeSet);
    }

    public FbImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = false;
        A00(context, attributeSet);
    }

    public FbImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = false;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1A);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(683826328);
        super.onAttachedToWindow();
        this.A00 = true;
        0FI.A0C(872201248, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1712327359);
        super.onDetachedFromWindow();
        this.A00 = false;
        0FI.A0C(-1640492301, A06);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(AnonymousClass001.A1O(getVisibility()), false);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.A00 == false) goto L8;
     */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setImageDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.setImageDrawable(r1)
            r0 = r302
            if (r0 == 0) goto L26
            r0 = r301
            int r0 = r0.getVisibility()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = r0.A00
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L1d:
            r0 = 0
            r303 = r0
        L1f:
            r0 = r302
            r1 = r303
            r2 = 0
            boolean r0 = r0.setVisible(r1, r2)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.FbImageView.setImageDrawable(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r301.A00 == false) goto L8;
     */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setImageResource(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.setImageResource(r1)
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r301
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L24
            r0 = r301
            boolean r0 = r0.A00
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L26
        L24:
            r0 = 0
            r304 = r0
        L26:
            r0 = r303
            r1 = r304
            r2 = 0
            boolean r0 = r0.setVisible(r1, r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.FbImageView.setImageResource(int):void");
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
    }
}
