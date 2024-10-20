package com.facebook.messaging.montage.widget.reboundhorizontalscrollview;

import X.0FI;
import X.0S2;
import X.4YU;
import X.AnonymousClass001;
import X.C62j;
import X.C66h;
import X.C66i;
import X.C66n;
import X.CST;
import X.DKC;
import X.DKD;
import X.GOn;
import X.GOp;
import X.HLD;
import X.IKC;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: ReboundHorizontalScrollView.class */
public class ReboundHorizontalScrollView extends LinearLayout implements C66n, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C66h A04;
    public C66h A05;
    public C66h A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public C62j A0D;
    public Integer A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final C66i A0J;
    public final List A0K;
    public final int A0L;
    public final int A0M;
    public final GestureDetector A0N;
    public static final C66h A0P = C66h.A03(50.0d, 10.2d);
    public static final C66h A0O = C66h.A03(0.0d, 5.0d);
    public static final C66h A0Q = C66h.A03(20.0d, 10.0d);

    /* loaded from: ReboundHorizontalScrollView$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = CST.A00(34);
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public ReboundHorizontalScrollView(Context context) {
        this(context, null);
    }

    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = false;
        this.A02 = -1;
        this.A0D = GOp.A0x();
        setClipChildren(false);
        setSaveEnabled(false);
        this.A04 = A0P;
        this.A06 = A0Q;
        this.A05 = A0O;
        Context context2 = getContext();
        boolean z = false;
        if ((context2.getApplicationInfo().flags & 4194304) != 0 && 4YU.A0B(context2).getLayoutDirection() == 1) {
            z = true;
        }
        this.A0G = z;
        C66i c66i = new C66i(this.A0D);
        c66i.A09(this.A05);
        c66i.A00 = 0.001d;
        c66i.A02 = 1.0d;
        this.A0J = c66i;
        this.A0N = new GestureDetector(context, this);
        this.A0K = new CopyOnWriteArrayList();
        this.A0B = TypedValue.applyDimension(1, 8.0f, DKD.A09(this));
        this.A0M = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A00 = r0 * 3;
        this.A0L = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int A00(int i) {
        int childCount = getChildCount();
        int i2 = 0;
        if (childCount <= 1) {
            return 0;
        }
        int i3 = (-1) >>> 1;
        int i4 = 0;
        do {
            getChildAt(i2);
            int A05 = GOn.A05(i, A01(this, i2));
            if (i2 == 0 || A05 < i3) {
                i4 = i2;
                i3 = A05;
            }
            i2++;
        } while (i2 < childCount);
        return i4;
    }

    public static int A01(ReboundHorizontalScrollView reboundHorizontalScrollView, int i) {
        int round;
        if (i > reboundHorizontalScrollView.getChildCount() - 1) {
            return 0;
        }
        if (i > reboundHorizontalScrollView.getChildCount() - 1) {
            round = 0;
        } else {
            View childAt = reboundHorizontalScrollView.getChildAt(i);
            round = Math.round(childAt.getRight() - (childAt.getMeasuredWidth() / 2.0f));
        }
        return Math.round(round - GOn.A04(DKC.A02(reboundHorizontalScrollView), 2.0f));
    }

    private void A02() {
        if (this.A0I) {
            return;
        }
        this.A0I = true;
        GOn.A1O(this, true);
        this.A03 = -1;
        int i = 0;
        while (true) {
            int i2 = i;
            List list = this.A0K;
            if (i2 >= list.size()) {
                A06(0S2.A0C);
                this.A08 = false;
                this.A01 = 0.0f;
                this.A0J.A02();
                return;
            }
            list.get(i2);
            i = i2 + 1;
        }
    }

    private void A03(float f) {
        if (this.A03 == -1) {
            C66i c66i = this.A0J;
            c66i.A09(this.A06);
            c66i.A07(A01(this, A00(getScrollX())));
            c66i.A08(f);
        }
    }

    private void A04(float f) {
        int i = 0;
        this.A0I = false;
        if (Math.abs(f) < this.A0M) {
            this.A0J.A09(this.A06);
            float f2 = 0.0f / 0.0f;
            if (this.A03 == -1) {
                A03(0.0f);
            }
        } else if (!this.A07) {
            C66i c66i = this.A0J;
            c66i.A02();
            c66i.A06(getScrollX());
            c66i.A09(this.A05);
            c66i.A08(-f);
            A00(getScrollX());
            while (true) {
                List list = this.A0K;
                if (i >= list.size()) {
                    break;
                }
                list.get(i);
                i++;
            }
        }
        A06(0S2.A01);
    }

    private void A05(MotionEvent motionEvent) {
        if (this.A0F) {
            return;
        }
        float rawX = this.A09 - motionEvent.getRawX();
        float rawY = this.A0A - motionEvent.getRawY();
        boolean A1P = AnonymousClass001.A1P((Math.sqrt((rawX * rawX) + (rawY * rawY)) > this.A0B ? 1 : (Math.sqrt((rawX * rawX) + (rawY * rawY)) == this.A0B ? 0 : -1)));
        double degrees = Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
        if (!A1P || degrees >= 45.0d) {
            return;
        }
        this.A0F = true;
    }

    private void A06(Integer num) {
        if (this.A0E != num) {
            this.A0E = num;
            Iterator it = this.A0K.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private boolean A07() {
        if (getChildCount() == 0) {
            return false;
        }
        boolean z = this.A0G;
        int A01 = getChildCount() == 0 ? 0 : A01(this, getChildCount() - 1);
        int scrollX = getScrollX();
        return z ? A01 > scrollX : A01 < scrollX;
    }

    private boolean A08() {
        if (getChildCount() == 0) {
            return false;
        }
        boolean z = this.A0G;
        int scrollX = getScrollX();
        int i = 0;
        if (getChildCount() != 0) {
            i = A01(this, 0);
        }
        return z ? scrollX > i : scrollX < i;
    }

    private float getProgress() {
        int i;
        int A00 = A00(getScrollX());
        int A01 = A01(this, A00);
        int scrollX = getScrollX();
        if (!this.A0G ? A01 < scrollX : A01 > scrollX) {
            i = A00;
            A00 = Math.max(A00 - 1, 0);
        } else {
            i = Math.min(A00 + 1, getChildCount() - 1);
        }
        return A00 == i ? A00 : ((float) HLD.A00(scrollX, A01(this, A00), A01(this, i), 0.0d, 1.0d)) + A00;
    }

    public void A09(int i) {
        this.A03 = i;
        C66i c66i = this.A0J;
        c66i.A09(this.A04);
        c66i.A07(A01(this, i));
        c66i.A08(0.0d);
        A06(0S2.A01);
    }

    @Override // X.C66n
    public void CMP(C66i c66i) {
    }

    @Override // X.C66n
    public void CMR(C66i c66i) {
        if (this.A0E == 0S2.A01) {
            c66i.A06(c66i.A01);
            setScrollX((int) Math.round(this.A0J.A09.A00));
            A06(0S2.A0C);
        }
    }

    @Override // X.C66n
    public void CMS(C66i c66i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01fa, code lost:
    
        if (getChildCount() == 0) goto L25;
     */
    @Override // X.C66n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CMV(X.C66i r302) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.CMV(X.66i):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setClickable(true);
        view.setOnClickListener(new IKC(this, view, 28));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return isEnabled();
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(179515015);
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        view.measure(View.MeasureSpec.makeMeasureSpec(A0I.leftMargin + A0I.rightMargin, 0), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + A0I.topMargin + A0I.bottomMargin + i4, ((ViewGroup.LayoutParams) A0I).height));
        0FI.A0C(1986615951, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1942556816);
        super.onAttachedToWindow();
        this.A0J.A0A(this);
        A06(0S2.A0C);
        0FI.A0C(1989121438, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1907948285);
        super.onDetachedFromWindow();
        this.A0J.A0B(this);
        0FI.A0C(-1175548031, A06);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0C = Math.min(Math.max(f, -r0), this.A0L);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0 != 3) goto L12;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isEnabled()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r302
            int r0 = r0.getActionMasked()
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L62
            r0 = r305
            r1 = r304
            if (r0 == r1) goto L53
            r0 = 2
            r303 = r0
            r0 = 2
            r306 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L3f
            r0 = 3
            r303 = r0
            r0 = 3
            r306 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L53
        L3b:
            r0 = 0
            r304 = r0
        L3d:
            r0 = r304
            return r0
        L3f:
            r0 = r301
            r1 = r302
            r0.A05(r1)
            r0 = r301
            boolean r0 = r0.A0F
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3b
            r0 = r301
            r0.A02()
            r0 = r304
            return r0
        L53:
            r0 = r301
            float r0 = r0.A0C
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A04(r1)
            goto L3b
        L62:
            r0 = r301
            r1 = 0
            r0.A0F = r1
            r0 = r301
            r1 = 0
            r0.A0H = r1
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r0.A0C = r1
            r0 = r302
            float r0 = r0.getRawX()
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A09 = r1
            r0 = r302
            float r0 = r0.getRawY()
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A0A = r1
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A02 != -1) {
            this.A0J.A06(A01(this, A00(r0)));
            this.A02 = -1;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A02 = savedState.A00;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = getScrollX();
        return baseSavedState;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A0H) {
            this.A0H = true;
            return true;
        }
        A02();
        A06(0S2.A00);
        if (A08() && f < 0.0f) {
            f *= 0.25f;
        }
        if (A07() && f > 0.0f) {
            f *= 0.25f;
        }
        C66i c66i = this.A0J;
        c66i.A06(c66i.A09.A00 + f);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r0 != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r301.A0F != false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = -1747043161(0xffffffff97de3ca7, float:-1.4361725E-24)
            r303 = r0
            r0 = -1747043161(0xffffffff97de3ca7, float:-1.4361725E-24)
            int r0 = X.0FI.A05(r0)
            r304 = r0
            r0 = r301
            boolean r0 = r0.isEnabled()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L22
            r0 = 89889319(0x55b9a27, float:1.0325644E-35)
            r1 = r304
            X.0FI.A0B(r0, r1)
            r0 = 0
            return r0
        L22:
            r0 = r301
            r1 = r302
            boolean r0 = super.onTouchEvent(r1)
            r305 = r0
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 != 0) goto L44
            r0 = r301
            android.view.GestureDetector r0 = r0.A0N
            r308 = r0
            r0 = r308
            r1 = r302
            boolean r0 = r0.onTouchEvent(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L47
        L44:
            r0 = 1
            r306 = r0
        L47:
            r0 = r302
            int r0 = r0.getActionMasked()
            r309 = r0
            r0 = r309
            if (r0 == 0) goto La3
            r0 = r309
            r1 = r307
            if (r0 == r1) goto L96
            r0 = 2
            r305 = r0
            r0 = 2
            r303 = r0
            r0 = r309
            r1 = r305
            if (r0 == r1) goto L83
            r0 = 3
            r305 = r0
            r0 = 3
            r303 = r0
            r0 = r309
            r1 = r305
            if (r0 == r1) goto L96
        L75:
            r0 = r306
            r307 = r0
        L79:
            r0 = 1657645068(0x62cda80c, float:1.8968458E21)
            r1 = r304
            X.0FI.A0B(r0, r1)
            r0 = r307
            return r0
        L83:
            r0 = r301
            r1 = r302
            r0.A05(r1)
            r0 = r301
            boolean r0 = r0.A0F
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L75
            goto L79
        L96:
            r0 = r301
            float r0 = r0.A0C
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A04(r1)
            goto L75
        La3:
            r0 = r301
            r0.A02()
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
