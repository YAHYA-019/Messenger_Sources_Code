package com.facebook.fbui.widget.slidingviewgroup;

import X.1BK;
import X.4YV;
import X.AnonymousClass001;
import X.C0Cn;
import X.C3284Jpf;
import X.DKC;
import X.FGQ;
import X.GOn;
import X.JQx;
import X.KMK;
import X.KTY;
import X.LE4;
import X.LKh;
import X.LqR;
import X.MFG;
import X.MFH;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import java.util.Arrays;
import java.util.Set;

/* loaded from: SlidingViewGroup.class */
public class SlidingViewGroup extends ViewGroup implements ViewGroup.OnHierarchyChangeListener {
    public int A00;
    public int A01;
    public Paint A02;
    public MFG A03;
    public KTY A04;
    public MFH A05;
    public KMK A06;
    public LE4 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public MFG[] A0F;
    public int A0G;
    public int A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final LKh A0N;
    public final Set A0O;
    public final Set A0P;
    public final Set A0Q;
    public final C0Cn A0R;

    public SlidingViewGroup(Context context) {
        this(context, null);
    }

    public SlidingViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        r301.A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        r301.A08 = r0.getBoolean(0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
    
        r0 = r0.getString(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0171, code lost:
    
        r301.A07 = (X.LE4) java.lang.Class.forName(r0).getConstructor(android.content.Context.class, android.view.ViewGroup.class, com.facebook.widget.touch.ViewDragHelper$Callback.class).newInstance(getContext(), r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
    
        r315 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0181, code lost:
    
        r305 = X.1BK.A0s("Drag helper class with required constructor not found.", r315);
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Cn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SlidingViewGroup(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.slidingviewgroup.SlidingViewGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static MFG A00(View view, SlidingViewGroup slidingViewGroup, int i, int i2) {
        MFG[] mfgArr = slidingViewGroup.A0F;
        MFG mfg = null;
        if (mfgArr != null && view != null) {
            int i3 = (-1) >>> 1;
            int length = mfgArr.length;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= length) {
                    break;
                }
                MFG mfg2 = mfgArr[i5];
                int A05 = GOn.A05(mfg2.B3v(view, i2), i);
                if (A05 < i3) {
                    mfg = mfg2;
                    i3 = A05;
                }
                i4 = i5 + 1;
            }
        }
        return mfg;
    }

    public static MFG A01(SlidingViewGroup slidingViewGroup) {
        View A0V = JQx.A0V(slidingViewGroup);
        if (A0V == null || !A0V.isLaidOut()) {
            return null;
        }
        int height = slidingViewGroup.getHeight();
        KMK kmk = slidingViewGroup.A06;
        int top = A0V.getTop();
        return A00(A0V, slidingViewGroup, kmk instanceof C3284Jpf ? height - top : top + A0V.getMeasuredHeight(), height);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if ((java.lang.Math.abs(r302) / java.lang.Math.abs(r303)) > 0.7f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.slidingviewgroup.SlidingViewGroup.A02(int, int):boolean");
    }

    public void A03() {
        if (!this.A0M) {
            this.A0M = true;
            requestLayout();
        }
    }

    public void A04(float f) {
        this.A0G = (((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24) | (this.A0G & 16777215);
        postInvalidate();
    }

    public void A05(MFG mfg) {
        A06(mfg, this.A00, false);
    }

    public void A06(MFG mfg, int i, boolean z) {
        View A0V = JQx.A0V(this);
        if (A0V != null) {
            this.A03 = mfg;
            FGQ.A00(this, new LqR(A0V, this, i, z));
        }
    }

    public void A07(MFG[] mfgArr, boolean z) {
        this.A0F = (MFG[]) Arrays.copyOf(mfgArr, mfgArr.length);
        MFG mfg = this.A03;
        if (mfg != null) {
            View A0V = JQx.A0V(this);
            int height = getHeight();
            mfg = A00(A0V, this, this.A03.B3v(A0V, height), height);
            this.A03 = mfg;
        }
        if (z) {
            if (mfg == null) {
                mfg = A01(this);
                if (mfg == null) {
                    return;
                }
            }
            A06(mfg, this.A00, false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw 1BK.A0i(AnonymousClass001.A0X(this), " only supports a single child");
        }
        if (this.A0H > 0) {
            view.setTop(getHeight() - this.A0H);
        }
        this.A0H = 0;
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.A07.A0G()) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (Color.alpha(this.A0G) > 0) {
            canvas.drawColor(this.A0G);
        }
        View A0V = JQx.A0V(this);
        if (!this.A0E && A0V != null && this.A02 != null && canvas.getHeight() - A0V.getBottom() >= 0) {
            KMK kmk = this.A06;
            KMK kmk2 = KMK.A02;
            canvas.drawRect(0.0f, kmk == kmk2 ? A0V.getBottom() - (DKC.A03(A0V) / 2.0f) : 0.0f, canvas.getWidth(), kmk == kmk2 ? canvas.getHeight() : A0V.getTop() + (DKC.A03(A0V) / 2.0f), this.A02);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0Cn c0Cn = this.A0R;
        return c0Cn.A01 | c0Cn.A00;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        if (view2 instanceof LithoView) {
            (this.A0C ? this.A0P : this.A0O).add(view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        if (view2 instanceof LithoView) {
            if (this.A0C) {
                this.A0Q.add(view2);
            } else {
                this.A0O.remove(view2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (this.A0D) {
            int actionMasked = motionEvent.getActionMasked();
            boolean z2 = this.A0I;
            if (z2 && (actionMasked == 1 || actionMasked == 3)) {
                this.A0I = false;
                if (this.A0K) {
                    return false;
                }
                this.A07.A0C();
                return false;
            }
            if (!this.A0K && !z2 && this.A08 && this.A07.A0H(motionEvent)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MFG mfg;
        View childAt = getChildAt(0);
        if (childAt != null) {
            boolean z2 = this.A0L;
            KMK kmk = this.A06;
            KMK kmk2 = KMK.A02;
            int top = !z2 ? kmk == kmk2 ? childAt.getTop() : childAt.getBottom() - childAt.getMeasuredHeight() : kmk == kmk2 ? getHeight() : -childAt.getMeasuredHeight();
            int measuredHeight = childAt.getMeasuredHeight() + top;
            if (this.A0M) {
                if (kmk == kmk2) {
                    measuredHeight = Math.max(getHeight(), measuredHeight);
                } else {
                    top = Math.min(0, top);
                }
            }
            childAt.layout(0, top, getWidth(), measuredHeight);
            boolean z3 = true;
            boolean A1W = 4YV.A1W(childAt.getMeasuredHeight(), this.A0H);
            this.A0H = childAt.getMeasuredHeight();
            if ((z || A1W) && (mfg = this.A03) != null && !this.A0L) {
                if (this.A09) {
                    z3 = false;
                }
                A06(mfg, this.A00, z3);
            }
            KTY kty = this.A04;
            if (kty != null) {
                kty.A01(childAt, getHeight(), 0);
            }
            this.A0L = false;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A0A) {
            View A0V = JQx.A0V(this);
            if (this.A0F == null || A0V == null) {
                i3 = 0;
            } else {
                int measuredHeight = getMeasuredHeight();
                i3 = 0;
                for (MFG mfg : this.A0F) {
                    i3 = Math.max(i3, mfg.B3v(A0V, measuredHeight));
                }
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, (-1) << (-1)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A08 || z) {
            return false;
        }
        LE4.A04(this, f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A08 || !A02((int) f, (int) f2)) {
            return false;
        }
        LE4.A04(this, f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A08 && A02(i, i2)) {
            LE4 le4 = this.A07;
            getChildAt(0);
            int i3 = -i;
            int i4 = -i2;
            View view2 = le4.A09;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = le4.A09.getTop() + i4;
                LE4.A06(le4, top, i3, i4);
                View view3 = le4.A09;
                if (view3 != null && iArr != null) {
                    int left2 = left - view3.getLeft();
                    int A0H = JQx.A0H(le4.A09, top);
                    iArr[0] = left2 - i3;
                    iArr[1] = A0H - i4;
                }
            }
            if (getNestedScrollAxes() != 1 || iArr[1] == 0) {
                return;
            }
            iArr[0] = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A08) {
            LE4 le4 = this.A07;
            getChildAt(0);
            int i5 = -i3;
            int i6 = -i4;
            View view2 = le4.A09;
            if (view2 != null) {
                view2.getLeft();
                LE4.A06(le4, le4.A09.getTop() + i6, i5, i6);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0R.A01 = i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0K) {
            z = true;
            this.A0K = true;
            LE4 le4 = this.A07;
            View A0V = JQx.A0V(this);
            if (le4.A08 == null) {
                le4.A08 = VelocityTracker.obtain();
            }
            le4.A0D(1);
            le4.A09 = A0V;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.A0R.A01 = 0;
        this.A0K = false;
        LE4 le4 = this.A07;
        le4.A09 = getChildAt(0);
        if (le4.A03 != 2) {
            LE4.A05(le4, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r0 > r0.getBottom()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.slidingviewgroup.SlidingViewGroup.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.A0I != z) {
            this.A0I = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw AnonymousClass001.A0q("SlidingViewGroup does not support this currently.");
    }
}
