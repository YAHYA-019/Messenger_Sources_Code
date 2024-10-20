package com.facebook.messaging.composer;

import X.C1uu;
import X.C1uv;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.FbImageView;

/* loaded from: ComposerActionButton.class */
public class ComposerActionButton extends FbImageView {
    public int A00;
    public int A01;
    public boolean A02;

    public ComposerActionButton(Context context) {
        super(context);
        this.A02 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public ComposerActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public ComposerActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public void A00(int i, int i2) {
        if (this.A01 == i && this.A00 == i2) {
            return;
        }
        this.A01 = i;
        this.A00 = i2;
        drawableStateChanged();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        if (this.A02) {
            i = this.A00;
            if (i == 0) {
                return;
            }
        } else {
            i = this.A01;
            if (i == 0) {
                clearColorFilter();
                return;
            }
        }
        C1uv c1uv = C1uu.A03;
        setColorFilter(C1uv.A00(i));
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (this.A02 != z) {
            this.A02 = z;
            drawableStateChanged();
        }
    }
}
