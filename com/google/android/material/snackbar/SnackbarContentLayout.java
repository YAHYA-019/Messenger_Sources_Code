package com.google.android.material.snackbar;

import X.0FI;
import X.6Ld;
import X.AbF;
import X.MDI;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: SnackbarContentLayout.class */
public class SnackbarContentLayout extends LinearLayout implements MDI {
    public Button A00;
    public TextView A01;
    public int A02;
    public int A03;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A0P);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A01.getPaddingTop() == i2 && this.A01.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A01;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(146968401);
        super.onFinishInflate();
        this.A01 = AbF.A06(this, 2131367431);
        this.A00 = (Button) findViewById(2131367430);
        0FI.A0C(-674656186, A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
            r0 = r301
            int r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 <= 0) goto L26
            r0 = r301
            int r0 = r0.getMeasuredWidth()
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 <= r1) goto L26
            r0 = r304
            int r0 = X.DKD.A00(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
        L26:
            r0 = r301
            android.content.res.Resources r0 = r0.getResources()
            r306 = r0
            r0 = r306
            r1 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r307 = r0
            r0 = r306
            r1 = 2132279348(0x7f180034, float:2.020437E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r308 = r0
            r0 = r301
            android.widget.TextView r0 = r0.A01
            android.text.Layout r0 = r0.getLayout()
            r309 = r0
            r0 = r309
            int r0 = r0.getLineCount()
            r305 = r0
            r0 = 1
            r310 = r0
            r0 = r305
            r1 = r310
            if (r0 <= r1) goto L93
            r0 = r301
            int r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 <= 0) goto L97
            r0 = r301
            android.widget.Button r0 = r0.A00
            r309 = r0
            r0 = r309
            int r0 = r0.getMeasuredWidth()
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 <= r1) goto L97
            r0 = r307
            r1 = r308
            int r0 = r0 - r1
            r305 = r0
            r0 = r301
            r1 = r310
            r2 = r307
            r3 = r305
            boolean r0 = r0.A00(r1, r2, r3)
            r305 = r0
        L87:
            r0 = r305
            if (r0 == 0) goto L92
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
        L92:
            return
        L93:
            r0 = r308
            r307 = r0
        L97:
            r0 = r301
            r1 = 0
            r2 = r307
            r3 = r307
            boolean r0 = r0.A00(r1, r2, r3)
            r305 = r0
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
