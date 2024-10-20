package com.facebook.widget;

import X.0FI;
import X.0NL;
import X.0S2;
import X.0fH;
import X.C00j;
import X.C1oo;
import X.DKD;
import X.DTT;
import X.EBw;
import X.FAj;
import X.GEY;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* loaded from: CustomViewPager.class */
public class CustomViewPager extends DTT implements GEY {
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public CustomViewPager(Context context) {
        super(context);
        this.A02 = true;
        this.A00 = true;
        this.A01 = false;
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = true;
        this.A00 = true;
        this.A01 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0c);
            this.A02 = obtainStyledAttributes.getBoolean(2, true);
            this.A00 = obtainStyledAttributes.getBoolean(0, true);
            this.A01 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x026e, code lost:
    
        if (r307 != r318) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0271, code lost:
    
        r304 = r307.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0278, code lost:
    
        if (r304 == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027b, code lost:
    
        playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(r302));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0286, code lost:
    
        return r304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x028e, code lost:
    
        if (r307.hasFocus() == false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0V(int r302) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.CustomViewPager.A0V(int):boolean");
    }

    public boolean A0W(View view, int i, int i2, int i3, boolean z) {
        return FAj.A02(view, i > 0 ? 0S2.A0N : 0S2.A0C, i2, i3, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0X(View view) {
        super/*android.view.ViewGroup*/.detachViewFromParent(view);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Y(View view) {
        super/*android.view.ViewGroup*/.removeDetachedView(view, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.viewpager.widget.ViewPager, com.facebook.widget.ListViewFriendlyViewPager] */
    public boolean ADj(Integer num, int i, int i2) {
        boolean z;
        if (this instanceof ListViewFriendlyViewPager) {
            ?? r0 = (ListViewFriendlyViewPager) this;
            0NL A0H = r0.A0H();
            z = false;
            if (A0H != null) {
                if (SystemClock.uptimeMillis() - r0.A02 > 1000) {
                    int A0G = r0.A0G();
                    int intValue = num.intValue();
                    if (intValue == 3) {
                    }
                }
                z = true;
            }
        } else {
            z = true;
            if (!this.A02 || A0H() == null) {
                return false;
            }
            if (num != 0S2.A0N || A0G() <= 0) {
                return num == 0S2.A0C && A0G() < A0H().A0C() - 1;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1771698438);
        super/*androidx.viewpager.widget.ViewPager*/.onAttachedToWindow();
        0FI.A0C(1813742764, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-72608478);
        super/*androidx.viewpager.widget.ViewPager*/.onDetachedFromWindow();
        0FI.A0C(1937009758, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A02) {
            return false;
        }
        if (A0G() == 0 && getChildCount() == 0) {
            return false;
        }
        try {
            return super/*androidx.viewpager.widget.ViewPager*/.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            0fH.A0H(CustomViewPager.class, "ViewPager threw an IllegalArgumentException. ", e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        C00j.A05("CustomViewPager.onMeasure", 1935601534);
        try {
            super.onMeasure(i, i2);
            if (!this.A01 || getVisibility() == 8 || getChildCount() == 0) {
                i3 = -940022743;
            } else {
                int measuredHeight2 = getChildAt(0).getMeasuredHeight();
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (measuredHeight2 <= 0 || measuredHeight2 >= ((char) (-1))) {
                    if (this instanceof EBw) {
                        if (((ViewGroup) this).getChildCount() > 0) {
                            ((ViewPager) this).A0H().getClass();
                            ((ViewPager) this).A0L(r0.A0C() - 1);
                        }
                        measuredHeight = 0;
                        for (int i4 = 0; i4 < ((ViewGroup) this).getChildCount(); i4++) {
                            View childAt = ((ViewGroup) this).getChildAt(i4);
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(((View) this).getMeasuredWidth(), (-1) << (-1)), View.MeasureSpec.makeMeasureSpec(0, 0));
                            measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight());
                        }
                    } else {
                        View childAt2 = getChildAt(0);
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = childAt2.getMeasuredHeight();
                        if (measuredHeight <= 0 || measuredHeight >= ((char) (-1))) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - getPaddingLeft()) - getPaddingRight(), (-1) << (-1)), 0);
                            measuredHeight = childAt2.getMeasuredHeight();
                        }
                    }
                    super.onMeasure(i, DKD.A00(measuredHeight + paddingTop));
                    i3 = -1264335834;
                } else {
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight2 + paddingTop);
                    i3 = 1186854203;
                }
            }
            C00j.A01(i3);
        } catch (Throwable th) {
            C00j.A01(-524895099);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = 0FI.A05(228490916);
        if (this.A02) {
            try {
            } catch (IllegalArgumentException e) {
                0fH.A0H(CustomViewPager.class, "ViewPager threw an IllegalArgumentException. ", e);
            }
            if (A0G() == 0 && getChildCount() == 0) {
                i = 1419761789;
                0FI.A0B(i, A05);
                return false;
            }
            boolean onTouchEvent = super/*androidx.viewpager.widget.ViewPager*/.onTouchEvent(motionEvent);
            0FI.A0B(1759950141, A05);
            return onTouchEvent;
        }
        i = 1163837195;
        0FI.A0B(i, A05);
        return false;
    }
}
