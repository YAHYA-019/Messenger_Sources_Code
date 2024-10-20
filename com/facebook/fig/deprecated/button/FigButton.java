package com.facebook.fig.deprecated.button;

import X.0FI;
import X.1BK;
import X.1BV;
import X.5Wo;
import X.7zQ;
import X.AbstractC00793on;
import X.AnonymousClass001;
import X.C00i;
import X.C1oo;
import X.C2rY;
import X.DKC;
import X.DKD;
import X.FE7;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.resources.ui.FbButton;

/* loaded from: FigButton.class */
public class FigButton extends FbButton {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public Rect A07;
    public Drawable A08;
    public CharSequence A09;
    public boolean A0A;
    public C00i A0B;
    public boolean A0C;

    public FigButton(Context context) {
        super(context);
        this.A07 = DKC.A0C();
        A00();
    }

    public FigButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FigButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.A07 = DKC.A0C();
        A00();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1O);
            A01(obtainStyledAttributes.getInt(0, 32772));
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != this.A08) {
                this.A08 = null;
                int i2 = this.A05;
                if ((15616 & i2) > 0 || (i2 & 4) <= 0) {
                    this.A0A = false;
                    if (drawable != null) {
                        this.A08 = drawable.mutate();
                        setCompoundDrawablePadding(this.A01);
                        Drawable drawable2 = this.A08;
                        if (drawable2 != null) {
                            drawable2.setTintList(this.A06);
                            DKC.A1O(this.A08, this);
                        }
                    }
                    this.A0A = true;
                }
                requestLayout();
                invalidate();
            }
            this.A09 = AbstractC00793on.A01(context, obtainStyledAttributes, 2);
            obtainStyledAttributes.recycle();
        }
    }

    private void A00() {
        this.A0B = 1BV.A00(67646);
        this.A0C = !C2rY.A00(getContext());
        setGravity(17);
        setLines(1);
        super.setEllipsize(TextUtils.TruncateAt.END);
        super.setTransformationMethod((TransformationMethod) this.A0B.get());
        setPadding(0, 0, 0, 0);
        setIncludeFontPadding(false);
        this.A0A = true;
    }

    public void A01(int i) {
        switch (i) {
            case 257:
            case 258:
            case 260:
            case 513:
            case 514:
            case 516:
            case 1028:
            case 1032:
            case 2052:
            case 2056:
            case 4097:
            case 4098:
            case 4100:
            case 8193:
            case 8194:
            case 8196:
            case 16385:
            case 16386:
            case 16388:
            case 32769:
            case 32770:
            case 32772:
                this.A05 = i;
                Context context = getContext();
                int i2 = 0;
                ColorStateList colorStateList = null;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int[] A01 = FE7.A01(FE7.A00, i);
                int i9 = 0;
                do {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A01[i9], C1oo.A1P);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 < indexCount) {
                            int index = obtainStyledAttributes.getIndex(i11);
                            if (index == 7) {
                                i7 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == 5) {
                                i6 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == 9) {
                                i8 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == 2) {
                                i4 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == 3) {
                                i5 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == 0) {
                                i2 = obtainStyledAttributes.getResourceId(index, 0);
                            } else if (index == 8) {
                                colorStateList = 5Wo.A00(context, obtainStyledAttributes, index);
                            } else if (index == 1) {
                                i3 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            }
                            i10 = i11 + 1;
                        } else {
                            obtainStyledAttributes.recycle();
                            i9++;
                        }
                    }
                } while (i9 < 2);
                this.A0A = false;
                setTypeface(Typeface.create("sans-serif-medium", 0));
                this.A04 = i7;
                this.A03 = i6;
                setTextSize(0, i8);
                this.A01 = i4;
                this.A02 = i5;
                if (i2 != 0) {
                    setBackground(context.getDrawable(i2));
                }
                this.A06 = colorStateList;
                if (colorStateList != null) {
                    setTextColor(colorStateList);
                }
                this.A00 = i3;
                Drawable drawable = this.A08;
                if (drawable != null) {
                    drawable.setTintList(this.A06);
                    DKC.A1O(drawable, this);
                }
                this.A0A = true;
                requestLayout();
                invalidate();
                return;
            default:
                throw 1BK.A0i("Unsupported button type: 0x", Integer.toHexString(i));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A08;
        if (drawable != null) {
            DKC.A1O(drawable, this);
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingEnd() {
        return this.A03;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!this.A0C) {
            return this.A03;
        }
        boolean A1T = AnonymousClass001.A1T(this.A08);
        int i = this.A04;
        if (A1T) {
            i = i + this.A00 + this.A01;
        }
        return i;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        int i;
        if (this.A0C) {
            i = this.A03;
        } else {
            boolean A1T = AnonymousClass001.A1T(this.A08);
            i = this.A04;
            if (A1T) {
                return i + this.A00 + this.A01;
            }
        }
        return i;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingStart() {
        boolean A1T = AnonymousClass001.A1T(this.A08);
        int i = this.A04;
        if (A1T) {
            i = i + this.A00 + this.A01;
        }
        return i;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = this.A08;
        if (drawable != null) {
            Layout layout = getLayout();
            String charSequence = layout.getText().toString();
            Rect A0C = DKC.A0C();
            layout.getPaint().getTextBounds(charSequence, 0, 7zQ.A05(charSequence), A0C);
            int width = this.A00 + this.A01 + A0C.width();
            A0C.set(0, 0, getWidth(), getHeight());
            Rect rect = this.A07;
            Gravity.apply(17, width, 0, A0C, 0, 0, rect);
            int height = getHeight();
            int i5 = this.A00;
            int i6 = (height - i5) >> 1;
            int i7 = this.A0C ? rect.left : rect.right - i5;
            drawable.setBounds(i7, i6, i7 + i5, i5 + i6);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int lineCount;
        int A06 = 0FI.A06(1366988047);
        int A00 = DKD.A00(this.A02);
        super.onMeasure(i, A00);
        if (TextUtils.isEmpty(this.A09) || this.A09.equals(getText())) {
            i3 = -1822317469;
        } else {
            Layout layout = getLayout();
            if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                setText(this.A09);
                measure(i, A00);
            }
            i3 = -1658154995;
        }
        0FI.A0C(i3, A06);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setAllCaps");
        }
        super.setAllCaps(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setBackgroundDrawable");
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setBackgroundTintList");
        }
        super.setBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setBackgroundTintMode");
        }
        super.setBackgroundTintMode(mode);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setCompoundDrawablePadding");
        }
        super.setCompoundDrawablePadding(i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawableTintMode(PorterDuff.Mode mode) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setCompoundDrawableTintMode");
        }
        super.setCompoundDrawableTintMode(mode);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setCompoundDrawables");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setCompoundDrawablesRelative");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setCursorVisible");
        }
        super.setCursorVisible(z);
    }

    @Override // android.widget.TextView
    public void setEms(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setEms");
        }
        super.setEms(i);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setGravity");
        }
        super.setGravity(i);
    }

    @Override // android.widget.TextView
    public void setHeight(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setHeight");
        }
        super.setHeight(i);
    }

    @Override // android.widget.TextView
    public void setHighlightColor(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setHighlightColor");
        }
        super.setHighlightColor(i);
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setIncludeFontPadding");
        }
        super.setIncludeFontPadding(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null && (3072 & this.A05) > 0) {
            layoutParams.width = -2;
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setLines");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setMaxHeight");
        }
        super.setMaxHeight(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setMaxLines");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setMaxWidth");
        }
        super.setMaxWidth(i);
    }

    @Override // android.widget.TextView
    public void setMinHeight(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setMinHeight");
        }
        super.setMinHeight(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setMinLines");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setMinWidth(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setMinWidth");
        }
        super.setMinWidth(i);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (this.A0A) {
            return;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.A09 = null;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setTextAppearance");
        }
        super.setTextAppearance(i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setTextAppearance");
        }
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setTextColor");
        }
        super.setTextColor(i);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setTextColor");
        }
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.TextView
    public void setTextScaleX(float f) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setTextScaleX");
        }
        super.setTextScaleX(f);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setTextSize");
        }
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (this.A0A) {
            return;
        }
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.A0A) {
            return;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        if (this.A0A) {
            throw AnonymousClass001.A0q("setWidth");
        }
        super.setWidth(i);
    }
}
