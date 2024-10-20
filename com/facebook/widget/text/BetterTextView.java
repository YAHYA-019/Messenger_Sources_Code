package com.facebook.widget.text;

import X.0D0;
import X.0FI;
import X.0S2;
import X.2KU;
import X.5Rq;
import X.6PA;
import X.6PB;
import X.C1oo;
import X.C2rp;
import X.FXA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Spanned;
import android.text.method.SingleLineTransformationMethod;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbTextView;
import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: BetterTextView.class */
public class BetterTextView extends FbTextView {
    public Object A00;
    public boolean A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public BetterTextView(Context context) {
        this(context, null, 0);
    }

    public BetterTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BetterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0E, i, 0);
        A00(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(Context context, TypedArray typedArray) {
        this.A03 = typedArray.getBoolean(5, false);
        this.A04 = typedArray.getBoolean(6, false);
        this.A02 = typedArray.getDimensionPixelOffset(4, -1);
        this.A05 = typedArray.getBoolean(7, false);
        if (typedArray.getBoolean(8, false)) {
            C2rp.A02(this, 0S2.A01);
        }
        int i = typedArray.getInt(2, -1);
        int i2 = typedArray.getInt(3, -1);
        2KU.A02(getTypeface(), this, i == -1 ? 0S2.A01 : 6PA.A00[i], i2 == -1 ? 0S2.A0Y : 6PB.A00[i2]);
        if (typedArray.getBoolean(1, false)) {
            setTransformationMethod(new FXA(context.getResources()));
        }
    }

    @Override // com.facebook.resources.ui.FbTextView
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(161653103);
        super.onAttachedToWindow();
        0FI.A0C(-1943345237, A06);
    }

    @Override // com.facebook.resources.ui.FbTextView
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-343229399);
        super.onDetachedFromWindow();
        0FI.A0C(-1480510811, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        Object obj = this.A00;
        if (!(obj instanceof 5Rq) && (obj instanceof ArrayList)) {
            AbstractList abstractList = (AbstractList) obj;
            int size = abstractList.size();
            for (int i = 0; i < size; i++) {
                abstractList.get(i);
            }
        }
        if ((getTransformationMethod() instanceof SingleLineTransformationMethod) && getMovementMethod() != null) {
            bringPointIntoView(0);
        }
        super/*android.widget.TextView*/.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishTemporaryDetach() {
        super/*android.view.View*/.onFinishTemporaryDetach();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179 A[EDGE_INSN: B:44:0x0179->B:45:0x0179 BREAK  A[LOOP:1: B:35:0x0149->B:41:0x015d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.text.BetterTextView.onMeasure(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStartTemporaryDetach() {
        super/*android.view.View*/.onStartTemporaryDetach();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        if (charSequence instanceof Spanned) {
            for (ImageSpan imageSpan : (ImageSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length() - 1, ImageSpan.class)) {
                imageSpan.getDrawable().setCallback(this);
            }
        }
        this.A01 = 0D0.A00(this).BVU(charSequence, 0, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r305 == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = 2134529245(0x7f3a54dd, float:2.4767704E38)
            int r0 = X.0FI.A05(r0)
            r303 = r0
            r0 = r301
            java.lang.Object r0 = r0.A00
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof X.5Rq
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L3c
            r0 = r304
            X.5Rq r0 = (X.5Rq) r0
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L32
        L2b:
            r0 = r301
            r1 = r302
            boolean r0 = super/*android.widget.TextView*/.onTouchEvent(r1)
            r305 = r0
        L32:
            r0 = 358378038(0x155c6a36, float:4.4512432E-26)
            r1 = r303
            X.0FI.A0B(r0, r1)
            r0 = r305
            return r0
        L3c:
            r0 = r304
            boolean r0 = r0 instanceof java.util.ArrayList
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2b
            r0 = r304
            java.util.AbstractList r0 = (java.util.AbstractList) r0
            r304 = r0
            r0 = r304
            int r0 = r0.size()
            r307 = r0
        L52:
            r0 = r306
            r1 = r307
            if (r0 >= r1) goto L2b
            r0 = r304
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            X.5Rq r0 = (X.5Rq) r0
            r308 = r0
            r0 = r308
            r1 = r302
            boolean r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L32
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.text.BetterTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(Context context, int i) {
        super/*android.widget.TextView*/.setTextAppearance(context, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1oo.A0E);
        A00(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
