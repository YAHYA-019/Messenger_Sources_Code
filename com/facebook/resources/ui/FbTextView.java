package com.facebook.resources.ui;

import X.0FI;
import X.2OB;
import X.2OC;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: FbTextView.class */
public class FbTextView extends 2OB implements 2OC {
    public boolean A00;

    public FbTextView(Context context) {
        super(context);
        this.A00 = false;
    }

    public FbTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        2OB.A02(context, attributeSet, this);
        this.A00 = false;
    }

    public FbTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        2OB.A02(context, attributeSet, this);
        this.A00 = false;
    }

    public FbTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        2OB.A02(context, attributeSet, this);
        this.A00 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01(boolean z) {
        Drawable[] compoundDrawables = getCompoundDrawables();
        int length = compoundDrawables.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Drawable drawable = compoundDrawables[i2];
            if (drawable != null) {
                drawable.setVisible(z, false);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(115317600);
        super/*android.widget.TextView*/.onAttachedToWindow();
        boolean z = true;
        this.A00 = true;
        if (getVisibility() != 0) {
            z = false;
        }
        A01(z);
        0FI.A0C(-2049096741, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(696275721);
        super/*android.view.View*/.onDetachedFromWindow();
        this.A00 = false;
        A01(false);
        0FI.A0C(-400404299, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        boolean z = false;
        A01(false);
        super/*android.widget.TextView*/.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        if (this.A00 && getVisibility() == 0) {
            z = true;
        }
        A01(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        boolean z = false;
        A01(false);
        super/*android.widget.TextView*/.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        if (this.A00 && getVisibility() == 0) {
            z = true;
        }
        A01(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (getVisibility() != 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setVisibility(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super/*android.view.View*/.setVisibility(r1)
            r0 = r301
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r301
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1b
        L19:
            r0 = 0
            r303 = r0
        L1b:
            r0 = r301
            r1 = r303
            r0.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.resources.ui.FbTextView.setVisibility(int):void");
    }
}
