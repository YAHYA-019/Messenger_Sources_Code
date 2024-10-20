package com.google.android.material.textview;

import X.6LS;
import X.6Ld;
import X.DQw;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: MaterialTextView.class */
public class MaterialTextView extends DQw {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(6LS.A00(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (A03(context2)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = 6Ld.A0K;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int A00 = A00(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (A00 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, 6Ld.A0J);
                    int A002 = A00(context2, obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (A002 >= 0) {
                        setLineHeight(A002);
                    }
                }
            }
        }
    }

    public static int A00(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize;
        int i = 0;
        do {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
            i++;
            if (i >= 2) {
                break;
            }
        } while (dimensionPixelSize < 0);
        return dimensionPixelSize;
    }

    public static boolean A03(Context context) {
        boolean z = true;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130971962, typedValue, true) && typedValue.type == 18 && typedValue.data == 0) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (A03(context)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, 6Ld.A0J);
            int A00 = A00(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (A00 >= 0) {
                setLineHeight(A00);
            }
        }
    }
}
