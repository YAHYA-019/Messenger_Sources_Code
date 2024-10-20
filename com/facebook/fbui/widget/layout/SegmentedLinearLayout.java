package com.facebook.fbui.widget.layout;

import X.0FI;
import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1oo;
import X.DKC;
import X.DKE;
import X.DKG;
import X.GOm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.widget.CustomLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SegmentedLinearLayout.class */
public class SegmentedLinearLayout extends CustomLinearLayout {
    public int A00;
    public int A01;
    public Drawable A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final Rect A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedLinearLayout(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A07 = DKC.A0C();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2P);
        11T.A0A(obtainStyledAttributes);
        A0H(obtainStyledAttributes.getDrawable(0));
        this.A06 = obtainStyledAttributes.getInt(5, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A01 = obtainStyledAttributes.hasValue(3) ? obtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        this.A00 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimensionPixelSize(2, 0) : dimensionPixelSize;
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ SegmentedLinearLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i));
    }

    private final void A00(Canvas canvas, int i) {
        Rect rect;
        int i2;
        int A09;
        int i3;
        if (this.A05 > 0) {
            rect = this.A07;
            i2 = getPaddingLeft() + ((((getWidth() - getPaddingStart()) - getPaddingEnd()) - this.A05) / 2);
            A09 = getWidth();
            i3 = (((getWidth() - getPaddingStart()) - getPaddingEnd()) - this.A05) / 2;
        } else {
            boolean A1O = AnonymousClass001.A1O(getLayoutDirection());
            rect = this.A07;
            int paddingLeft = getPaddingLeft();
            if (A1O) {
                i2 = paddingLeft + this.A01;
                A09 = DKE.A09(this);
                i3 = this.A00;
            } else {
                i2 = paddingLeft + this.A00;
                A09 = DKE.A09(this);
                i3 = this.A01;
            }
        }
        rect.set(i2, i, A09 - i3, A0E() + i);
        Drawable drawable = this.A02;
        if (drawable != null) {
            if (!(drawable instanceof ColorDrawable)) {
                drawable.setBounds(rect);
                drawable.draw(canvas);
            } else {
                canvas.save();
                canvas.clipRect(rect);
                drawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    private final void A01(Canvas canvas, int i) {
        int i2;
        int A0E;
        int A08;
        int i3;
        int i4 = this.A03;
        Rect rect = this.A07;
        int paddingTop = getPaddingTop();
        if (i4 > 0) {
            i2 = paddingTop + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.A03) / 2);
            A0E = A0E() + i;
            A08 = DKE.A08(this);
            i3 = (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.A03) / 2;
        } else {
            i2 = paddingTop + this.A01;
            A0E = A0E() + i;
            A08 = DKE.A08(this);
            i3 = this.A00;
        }
        rect.set(i, i2, A0E, A08 - i3);
        Drawable drawable = this.A02;
        if (drawable != null) {
            if (!(drawable instanceof ColorDrawable)) {
                drawable.setBounds(rect);
                drawable.draw(canvas);
            } else {
                canvas.save();
                canvas.clipRect(rect);
                drawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int A0E() {
        int orientation = getOrientation();
        int i = this.A04;
        if (orientation == 1) {
            if (i <= 0) {
                i = this.A03;
            }
        } else if (i <= 0) {
            return this.A05;
        }
        return i;
    }

    public final void A0F(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            requestLayout();
            invalidate();
        }
    }

    public final void A0G(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            requestLayout();
            invalidate();
        }
    }

    public final void A0H(Drawable drawable) {
        if (this.A02 != drawable) {
            this.A02 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A05 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A03 = 0;
                this.A05 = 0;
            }
            if (this.A02 == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r305 != 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0I(int r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L19
            r0 = r301
            int r0 = r0.A06
            r1 = 1
            r0 = r0 & r1
            r305 = r0
        L10:
            r0 = r305
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            r303 = r0
        L17:
            r0 = r303
            return r0
        L19:
            r0 = r301
            int r0 = r0.getChildCount()
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L30
            r0 = r301
            int r0 = r0.A06
            r1 = 4
            r0 = r0 & r1
            r305 = r0
            goto L10
        L30:
            r0 = r301
            int r0 = r0.A06
            r1 = 2
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L17
            r0 = r302
            r1 = r304
            int r0 = r0 - r1
            r302 = r0
        L41:
            r0 = -1
            r305 = r0
            r0 = r305
            r1 = r302
            if (r0 >= r1) goto L17
            r0 = r301
            r1 = r302
            android.view.View r0 = r0.getChildAt(r1)
            r306 = r0
            r0 = r306
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 8
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L15
            r0 = r302
            r1 = -1
            int r0 = r0 + r1
            r302 = r0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.layout.SegmentedLinearLayout.A0I(int):boolean");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        4YV.A1N(view, layoutParams);
        if ((layoutParams instanceof LinearLayout.LayoutParams) && ((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
            if (getOrientation() == 0 && layoutParams.width == 0) {
                layoutParams.width = 1;
            } else if (getOrientation() == 1 && layoutParams.height == 0) {
                layoutParams.height = 1;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1792174890);
        11T.A0F(view, 0);
        if (this.A02 != null) {
            int indexOfChild = indexOfChild(view);
            int childCount = getChildCount();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            11T.A0I(layoutParams, GOm.A00(2));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int A0E = A0E();
            if (getOrientation() == 1) {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
                if (A0I(indexOfChild)) {
                    marginLayoutParams.topMargin = A0E;
                }
                if (indexOfChild == childCount - 1 && A0I(childCount)) {
                    marginLayoutParams.bottomMargin = A0E;
                }
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
                boolean A1O = AnonymousClass001.A1O(getLayoutDirection());
                boolean A0I = A0I(indexOfChild);
                if (A1O) {
                    if (A0I) {
                        marginLayoutParams.leftMargin = A0E;
                    }
                    if (indexOfChild == childCount - 1 && A0I(childCount)) {
                        marginLayoutParams.rightMargin = A0E;
                    }
                } else {
                    if (A0I) {
                        marginLayoutParams.rightMargin = A0E;
                    }
                    if (indexOfChild == childCount - 1 && A0I(childCount)) {
                        marginLayoutParams.leftMargin = A0E;
                    }
                }
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
        0FI.A0C(1233859154, A06);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        if (this.A02 != null) {
            if (getOrientation() == 1) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && A0I(i2)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        11T.A0I(layoutParams, GOm.A00(2));
                        A00(canvas, childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                    }
                    i = i2 + 1;
                }
                if (A0I(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    A00(canvas, childAt2 != null ? childAt2.getBottom() : DKE.A08(this) - A0E());
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean A1O = AnonymousClass001.A1O(getLayoutDirection());
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= childCount2) {
                    break;
                }
                View childAt3 = getChildAt(i4);
                if (childAt3 != null && childAt3.getVisibility() != 8 && A0I(i4)) {
                    ViewGroup.LayoutParams layoutParams2 = childAt3.getLayoutParams();
                    11T.A0I(layoutParams2, GOm.A00(2));
                    A01(canvas, A1O ? childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin : childAt3.getRight());
                }
                i3 = i4 + 1;
            }
            if (A0I(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                A01(canvas, A1O ? childAt4 != null ? childAt4.getRight() : DKE.A09(this) - A0E() : childAt4 != null ? childAt4.getLeft() : getPaddingLeft());
            }
        }
    }
}
