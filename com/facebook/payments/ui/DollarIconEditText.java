package com.facebook.payments.ui;

import X.0FI;
import X.1GS;
import X.AbM;
import X.AnonymousClass001;
import X.DKC;
import X.DKG;
import X.DKI;
import X.N1y;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.resources.ui.FbEditText;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;

/* loaded from: DollarIconEditText.class */
public class DollarIconEditText extends FbEditText {
    public float A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public int A04;
    public 1GS A05;
    public final Paint A06;

    public DollarIconEditText(Context context) {
        super(context);
        this.A06 = DKI.A05(this);
        A00();
    }

    public DollarIconEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = DKI.A05(this);
        A00();
    }

    public DollarIconEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = DKI.A05(this);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A05 = DKG.A0J();
        setIncludeFontPadding(false);
        setGravity(getGravity() | 48);
        setWillNotDraw(false);
        setCompoundDrawablePadding((int) getResources().getDimension(2132279298));
        Paint paint = this.A06;
        DKC.A1M(paint);
        paint.setTypeface(getTypeface());
        A01(this);
        setColor(getContext().getColor(2132213978));
    }

    public static void A01(DollarIconEditText dollarIconEditText) {
        dollarIconEditText.A01 = null;
        dollarIconEditText.A06.setTextAlign(dollarIconEditText.A02() ? Paint.Align.LEFT : Paint.Align.RIGHT);
    }

    private boolean A02() {
        Boolean bool = this.A01;
        if (bool == null) {
            1GS r0 = this.A05;
            r0.getClass();
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(r0.A05());
            currencyInstance.setCurrency(Currency.getInstance(this.A02));
            boolean z = false;
            if (currencyInstance instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                if (decimalFormat.format(1.23d).indexOf(decimalFormat.getDecimalFormatSymbols().getCurrencySymbol()) != 0) {
                    z = true;
                }
            }
            bool = Boolean.valueOf(z);
            this.A01 = bool;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A03(String str) {
        setText(str.replaceFirst("^\\s*(.*?)\\s*$", "$1"));
        invalidate();
    }

    public void A04(String str) {
        this.A02 = str;
        this.A03 = N1y.A00(str);
        A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingLeft() {
        return getCompoundDrawablePadding() + ((int) this.A06.measureText(this.A03));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingRight() {
        return getCompoundPaddingLeft();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.widget.TextView*/.onDraw(canvas);
        float textSize = getTextSize();
        float f = 0.07f * textSize;
        float f2 = textSize * this.A00;
        Paint paint = this.A06;
        paint.setTextSize(f2);
        canvas.drawText(this.A03, A02() ? (getWidth() - getCompoundPaddingLeft()) + f : getCompoundPaddingLeft() - f, this.A04 + f2, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A03);
        accessibilityNodeInfo.setText(AnonymousClass001.A0a(getText(), A0k));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int A06 = 0FI.A06(-583697950);
        this.A06.setTextSize(getTextSize() * this.A00);
        super/*android.widget.TextView*/.onMeasure(i, i2);
        0FI.A0C(-1858838094, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        setSelection(AbM.A0u(this).equals(ConstantsKt.CAMERA_ID_FRONT) ? 0 : getText().length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(894761649);
        this.A04 = i2 - ((int) getTextSize());
        0FI.A0C(-339760705, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1808876007);
        boolean onTouchEvent = isFocusable() ? super/*android.widget.TextView*/.onTouchEvent(motionEvent) : false;
        0FI.A0B(-859025028, A05);
        return onTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setColor(int i) {
        this.A06.setColor(i);
        setTextColor(i);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        super/*android.widget.TextView*/.setTextColor(i);
        this.A06.setColor(i);
    }
}
