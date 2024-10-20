package androidx.appcompat.widget;

import X.0Pz;
import X.4YV;
import X.53Y;
import X.53Z;
import X.AnonymousClass001;
import X.C0Ad;
import X.DKC;
import X.DKD;
import X.DKE;
import X.JQx;
import X.JYz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.facebook.acra.constants.ActionId;

/* loaded from: LinearLayoutCompat.class */
public class LinearLayoutCompat extends ViewGroup {
    public static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    public static final int INDEX_BOTTOM = 2;
    public static final int INDEX_CENTER_VERTICAL = 0;
    public static final int INDEX_FILL = 3;
    public static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GRAVITY_COUNT = 4;
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = 53Y.A0D;
        53Z A0D = DKD.A0D(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A0D.A02;
        C0Ad.A07(context, typedArray, attributeSet, this, iArr, i, 0);
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!typedArray.getBoolean(2, true)) {
            this.mBaselineAligned = false;
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(A0D.A01(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        typedArray.recycle();
    }

    private void forceUniformHeight(int i, int i2) {
        int A00 = DKD.A00(getMeasuredHeight());
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i) {
                return;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i5 = layoutParams.width;
                    layoutParams.width = childAt.getMeasuredWidth();
                    measureChildWithMargins(childAt, i2, 0, A00, 0);
                    layoutParams.width = i5;
                }
            }
            i3 = i4 + 1;
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int A00 = DKD.A00(getMeasuredWidth());
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i) {
                return;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i5 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, A00, 0, i2, 0);
                    layoutParams.height = i5;
                }
            }
            i3 = i4 + 1;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof JYz;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int childCount = getChildCount();
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i3)) {
                ViewGroup.MarginLayoutParams A0I = DKC.A0I(childAt);
                drawVerticalDivider(canvas, A1U ? childAt.getRight() + A0I.rightMargin : (childAt.getLeft() - A0I.leftMargin) - this.mDividerWidth);
            }
            i2 = i3 + 1;
        }
        if (hasDividerBeforeChildAt(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                ViewGroup.MarginLayoutParams A0I2 = DKC.A0I(childAt2);
                if (A1U) {
                    left = childAt2.getLeft();
                    i = A0I2.leftMargin;
                    right = (left - i) - this.mDividerWidth;
                } else {
                    right = childAt2.getRight() + A0I2.rightMargin;
                }
            } else if (A1U) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                drawHorizontalDivider(canvas, (childAt.getTop() - DKC.A0I(childAt).topMargin) - this.mDividerHeight);
            }
            i = i2 + 1;
        }
        if (hasDividerBeforeChildAt(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                bottom = DKE.A08(this) - this.mDividerHeight;
            } else {
                bottom = childAt2.getBottom() + DKC.A0I(childAt2).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, DKE.A09(this) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, DKE.A08(this) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public JYz generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public JYz generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public JYz generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return ((layoutParams instanceof JYz) || (layoutParams instanceof ViewGroup.MarginLayoutParams)) ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        int i2;
        if (this.mBaselineAlignedChildIndex < 0) {
            i = super.getBaseline();
        } else {
            int childCount = getChildCount();
            int i3 = this.mBaselineAlignedChildIndex;
            if (childCount <= i3) {
                throw AnonymousClass001.A0T("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            }
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            i = -1;
            if (baseline != -1) {
                int i4 = this.mBaselineChildTop;
                if (this.mOrientation == 1 && (i2 = this.mGravity & ActionId.MISSED_EVENT) != 48) {
                    if (i2 == 16) {
                        i4 += (((JQx.A0H(this, getBottom()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                    } else if (i2 == 80) {
                        i4 = (JQx.A0H(this, getBottom()) - getPaddingBottom()) - this.mTotalLength;
                    }
                }
                return i4 + DKC.A0I(childAt).topMargin + baseline;
            }
            if (this.mBaselineAlignedChildIndex != 0) {
                throw AnonymousClass001.A0T("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        }
        return i;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r305 != 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasDividerBeforeChildAt(int r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L19
            r0 = r301
            int r0 = r0.mShowDividers
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
            int r0 = r0.mShowDividers
            r1 = 4
            r0 = r0 & r1
            r305 = r0
            goto L10
        L30:
            r0 = r301
            int r0 = r0.mShowDividers
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
            r0 = r302
            if (r0 < 0) goto L17
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.hasDividerBeforeChildAt(int):boolean");
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutHorizontal(int r302, int r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutVertical(int r302, int r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0712, code lost:
    
        if (r338 > 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0715, code lost:
    
        r0.measure(android.view.View.MeasureSpec.makeMeasureSpec(r338, 1073741824), r0);
        r332 = android.view.View.combineMeasuredStates(r332, r0.getMeasuredState() & (-16777216));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x08a1, code lost:
    
        r338 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x089e, code lost:
    
        if (r338 < 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x07aa, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).height != (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x07fd, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).height != (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02b5, code lost:
    
        if (r0 != (-1)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r313 == null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 2690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x048d, code lost:
    
        if (r328 > 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0490, code lost:
    
        X.JQx.A1A(r0, r328, 1073741824, r0);
        r316 = android.view.View.combineMeasuredStates(r316, r0.getMeasuredState() & (-256));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0563, code lost:
    
        r328 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0560, code lost:
    
        if (r328 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04f8, code lost:
    
        if (r0 == (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0515, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).width != r322) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0277, code lost:
    
        if (r0 != (-1)) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw 0Pz.A06("base aligned child index out of range (0, ", ")", getChildCount());
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & ActionId.MISSED_EVENT) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & ActionId.MISSED_EVENT;
        int i3 = this.mGravity;
        if ((i3 & ActionId.MISSED_EVENT) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
