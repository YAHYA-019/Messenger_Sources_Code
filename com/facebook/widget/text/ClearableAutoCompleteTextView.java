package com.facebook.widget.text;

import X.0FI;
import X.1JF;
import X.2Me;
import X.C1oo;
import X.C2rY;
import X.DKC;
import X.DKG;
import X.GKl;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.resources.ui.FbAutoCompleteTextView;

/* loaded from: ClearableAutoCompleteTextView.class */
public class ClearableAutoCompleteTextView extends FbAutoCompleteTextView {
    public Drawable A00;
    public GKl A01;

    public ClearableAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public ClearableAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public ClearableAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = GKl.A00;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0B, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        Integer num = null;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= indexCount) {
                break;
            }
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 2) {
                this.A00 = obtainStyledAttributes.getDrawable(index);
            } else if (index == 3) {
                num = DKG.A12(obtainStyledAttributes, index, 0);
            }
            i2 = i3 + 1;
        }
        if (this.A00 == null) {
            Drawable drawable = context.getDrawable(2132410717);
            this.A00 = drawable;
            DKC.A1N(drawable, 2Me.A02.A02(context));
            if (num != null) {
                int intValue = num.intValue();
                Drawable drawable2 = this.A00;
                if (drawable2 != null) {
                    drawable2.setTint(intValue);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        return super/*android.widget.TextView*/.onPrivateIMECommand(str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Drawable drawable;
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            Drawable drawable3 = null;
            if (!1JF.A0B(charSequence)) {
                drawable3 = drawable2;
            }
            boolean A00 = C2rY.A00(getContext());
            Drawable[] compoundDrawables = getCompoundDrawables();
            if (A00) {
                drawable = drawable3;
                drawable3 = compoundDrawables[2];
            } else {
                drawable = compoundDrawables[0];
            }
            setCompoundDrawablesWithIntrinsicBounds(drawable, compoundDrawables[1], drawable3, compoundDrawables[3]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1210508626);
        if (motionEvent.getAction() == 1) {
            Context context = getContext();
            boolean A00 = C2rY.A00(context);
            float x = motionEvent.getX();
            if (A00 ? x < getCompoundPaddingLeft() : x > getWidth() - getCompoundPaddingRight()) {
                boolean A002 = C2rY.A00(context);
                byte b = false;
                Drawable[] compoundDrawables = getCompoundDrawables();
                if (!A002) {
                    b = 2;
                }
                Drawable drawable = compoundDrawables[b == true ? 1 : 0];
                Drawable drawable2 = this.A00;
                if (drawable2 != null && drawable2 == drawable) {
                    DKC.A1Q(this);
                }
            }
        }
        boolean onTouchEvent = super/*android.widget.TextView*/.onTouchEvent(motionEvent);
        0FI.A0B(242983379, A05);
        return onTouchEvent;
    }
}
