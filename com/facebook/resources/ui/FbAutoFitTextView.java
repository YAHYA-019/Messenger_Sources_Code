package com.facebook.resources.ui;

import X.0FI;
import X.2OB;
import X.4YW;
import X.C0A8;
import X.DKC;
import X.FrZ;
import X.Fra;
import X.GGP;
import X.KXH;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: FbAutoFitTextView.class */
public class FbAutoFitTextView extends 2OB {
    public int A00;
    public GGP A01;
    public int A02;
    public Rect A03;
    public TextPaint A04;
    public final GGP A05;

    public FbAutoFitTextView(Context context) {
        super(context);
        this.A05 = new FrZ(this);
        this.A01 = new Fra(this);
        A01();
    }

    public FbAutoFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        2OB.A02(context, attributeSet, this);
        this.A05 = new FrZ(this);
        this.A01 = new Fra(this);
        A01();
    }

    public FbAutoFitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        2OB.A02(context, attributeSet, this);
        this.A05 = new FrZ(this);
        this.A01 = new Fra(this);
        A01();
    }

    public FbAutoFitTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        2OB.A02(context, attributeSet, this);
        this.A05 = new FrZ(this);
        this.A01 = new Fra(this);
        A01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        Rect rect = this.A03;
        if (rect != null) {
            KXH.A00(rect, this.A04, this, this.A05, this.A02, this.A00, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01() {
        this.A03 = DKC.A0C();
        this.A04 = new TextPaint();
        this.A00 = C0A8.A02(getContext(), 8.0f);
        this.A02 = (int) getTextSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-388708414);
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A00();
        }
        0FI.A0C(364400852, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
        A00();
    }

    public void setTextSize(float f) {
        this.A02 = (int) f;
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextSize(int i, float f) {
        this.A02 = (int) 4YW.A00(getContext(), f, i);
        A00();
    }
}
