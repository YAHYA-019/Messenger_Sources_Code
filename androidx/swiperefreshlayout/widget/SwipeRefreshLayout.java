package androidx.swiperefreshlayout.widget;

import X.0Ck;
import X.0Cl;
import X.0Cm;
import X.0Co;
import X.0FI;
import X.2MH;
import X.2MI;
import X.2MJ;
import X.2MK;
import X.2MN;
import X.2Xx;
import X.6CO;
import X.6CP;
import X.7W7;
import X.AnonymousClass001;
import X.AnonymousClass333;
import X.C0Cn;
import X.C4Ny;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;

/* loaded from: SwipeRefreshLayout.class */
public class SwipeRefreshLayout extends ViewGroup implements 0Ck, 0Cl, 0Cm {
    public static final int[] A0Y = {R.attr.enabled};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public Animation A07;
    public Animation A08;
    public Animation A09;
    public 2MI A0A;
    public 2MK A0B;
    public 2Xx A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public Animation.AnimationListener A0M;
    public Animation A0N;
    public boolean A0O;
    public boolean A0P;
    public final Animation A0Q;
    public final Animation A0R;
    public final DecelerateInterpolator A0S;
    public final 0Co A0T;
    public final C0Cn A0U;
    public final int[] A0V;
    public final int[] A0W;
    public final int[] A0X;

    /* loaded from: SwipeRefreshLayout$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4Ny(0);
        public final boolean A00;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.A00 = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [X.0Cn, java.lang.Object] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = false;
        this.A0H = -1.0f;
        this.A0X = new int[2];
        this.A0W = new int[2];
        this.A0V = new int[2];
        this.A00 = -1;
        this.A0K = -1;
        this.A0M = new 2MH(this);
        this.A0Q = new AnonymousClass333(this, 1);
        this.A0R = new AnonymousClass333(this, 2);
        this.A0L = ViewConfiguration.get(context).getScaledTouchSlop();
        Resources resources = getResources();
        this.A03 = resources.getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.A0S = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.A0J = (int) (displayMetrics.density * 40.0f);
        Context context2 = getContext();
        ImageView imageView = new ImageView(context2);
        Context context3 = imageView.getContext();
        float f = context3.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(2MJ.A00);
        ((2MI) imageView).A00 = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        imageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(((2MI) imageView).A00);
        imageView.setBackground(shapeDrawable);
        this.A0A = imageView;
        2MK r0 = new 2MK(context2);
        this.A0B = r0;
        r0.A00(1);
        this.A0A.setImageDrawable(this.A0B);
        this.A0A.setVisibility(8);
        addView(this.A0A);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.A05 = i;
        this.A0H = i;
        this.A0U = new Object();
        this.A0T = new 0Co(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.A0J;
        this.A01 = i2;
        this.A04 = i2;
        A06((this.A02 + ((int) ((i2 - r0) * 1.0f))) - this.A0A.getTop());
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, A0Y);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void A00() {
        if (this.A06 != null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return;
            }
            View childAt = getChildAt(i2);
            if (!childAt.equals(this.A0A)) {
                this.A06 = childAt;
                return;
            }
            i = i2 + 1;
        }
    }

    private void A01(float f) {
        if (f > this.A0H) {
            A04(this, true, true);
            return;
        }
        this.A0E = false;
        2MK r0 = this.A0B;
        2MN r02 = r0.A05;
        r02.A04 = 0.0f;
        r02.A01 = 0.0f;
        r0.invalidateSelf();
        7W7 r03 = new 7W7(this);
        this.A02 = this.A01;
        Animation animation = this.A0R;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.A0S);
        2MI r04 = this.A0A;
        r04.A01 = r03;
        r04.clearAnimation();
        r04.startAnimation(animation);
        if (r02.A0F) {
            r02.A0F = false;
        }
        r0.invalidateSelf();
    }

    private void A02(float f) {
        Animation animation;
        Animation animation2;
        2MK r0 = this.A0B;
        2MN r02 = r0.A05;
        if (!r02.A0F) {
            r02.A0F = true;
        }
        r0.invalidateSelf();
        float f2 = this.A0H;
        float min = Math.min(1.0f, Math.abs(f / f2));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - f2;
        float f3 = this.A05;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i = this.A04 + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        2MI r03 = this.A0A;
        if (r03.getVisibility() != 0) {
            r03.setVisibility(0);
        }
        r03.setScaleX(1.0f);
        r03.setScaleY(1.0f);
        int i2 = r02.A09;
        if (f < f2) {
            if (i2 > 76 && ((animation2 = this.A08) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                6CO r04 = new 6CO(this, r02.A09, 76);
                r04.setDuration(300L);
                r03.A01 = null;
                r03.clearAnimation();
                r03.startAnimation(r04);
                this.A08 = r04;
            }
        } else if (i2 < 255 && ((animation = this.A07) == null || !animation.hasStarted() || animation.hasEnded())) {
            6CO r05 = new 6CO(this, r02.A09, 255);
            r05.setDuration(300L);
            r03.A01 = null;
            r03.clearAnimation();
            r03.startAnimation(r05);
            this.A07 = r05;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        r02.A04 = 0.0f;
        r02.A01 = min2;
        r0.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        if (min3 != r02.A00) {
            r02.A00 = min3;
        }
        r0.invalidateSelf();
        r02.A03 = (((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f;
        r0.invalidateSelf();
        A06(i - this.A01);
    }

    private void A03(float f) {
        float f2 = this.A0F;
        float f3 = f - f2;
        float f4 = this.A0L;
        if (f3 <= f4 || this.A0O) {
            return;
        }
        this.A0G = f2 + f4;
        this.A0O = true;
        this.A0B.setAlpha(76);
    }

    public static void A04(SwipeRefreshLayout swipeRefreshLayout, boolean z, boolean z2) {
        if (swipeRefreshLayout.A0E != z) {
            swipeRefreshLayout.A0D = z2;
            swipeRefreshLayout.A00();
            swipeRefreshLayout.A0E = z;
            if (!z) {
                swipeRefreshLayout.A07(swipeRefreshLayout.A0M);
                return;
            }
            int i = swipeRefreshLayout.A01;
            Animation.AnimationListener animationListener = swipeRefreshLayout.A0M;
            swipeRefreshLayout.A02 = i;
            Animation animation = swipeRefreshLayout.A0Q;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(swipeRefreshLayout.A0S);
            if (animationListener != null) {
                swipeRefreshLayout.A0A.A01 = animationListener;
            }
            2MI r0 = swipeRefreshLayout.A0A;
            r0.clearAnimation();
            r0.startAnimation(animation);
        }
    }

    public void A05() {
        2MI r0 = this.A0A;
        r0.clearAnimation();
        2MK r02 = this.A0B;
        r02.stop();
        r0.setVisibility(8);
        r0.getBackground().setAlpha(255);
        r02.setAlpha(255);
        A06(this.A04 - this.A01);
        this.A01 = r0.getTop();
    }

    public void A06(int i) {
        2MI r0 = this.A0A;
        r0.bringToFront();
        r0.offsetTopAndBottom(i);
        this.A01 = r0.getTop();
    }

    public void A07(Animation.AnimationListener animationListener) {
        6CP r0 = new 6CP(this);
        this.A0N = r0;
        r0.setDuration(150L);
        2MI r02 = this.A0A;
        r02.A01 = animationListener;
        r02.clearAnimation();
        r02.startAnimation(this.A0N);
    }

    public void A08(boolean z) {
        if (!z || this.A0E == z) {
            A04(this, z, false);
            return;
        }
        this.A0E = z;
        A06((this.A05 + this.A04) - this.A01);
        this.A0D = false;
        Animation.AnimationListener animationListener = this.A0M;
        2MI r0 = this.A0A;
        r0.setVisibility(0);
        this.A0B.setAlpha(255);
        AnonymousClass333 anonymousClass333 = new AnonymousClass333(this, 0);
        this.A09 = anonymousClass333;
        anonymousClass333.setDuration(this.A03);
        if (animationListener != null) {
            r0.A01 = animationListener;
        }
        r0.clearAnimation();
        r0.startAnimation(this.A09);
    }

    public void A09(int... iArr) {
        A00();
        2MK r0 = this.A0B;
        2MN r02 = r0.A05;
        r02.A0G = iArr;
        r02.A0C = 0;
        int i = iArr[0];
        r02.A0D = i;
        r02.A0C = 0;
        r02.A0D = i;
        r0.invalidateSelf();
    }

    public void C8h(View view, int[] iArr, int i, int i2, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void C8i(View view, int i, int i2, int i3, int i4, int i5) {
        C8j(view, this.A0V, i, i2, i3, i4, i5);
    }

    public void C8j(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            int i6 = iArr[1];
            int[] iArr2 = this.A0W;
            0Co.A02(this.A0T, iArr2, iArr, i, i2, i3, i4, 0);
            int i7 = i4 - (iArr[1] - i6);
            if ((i7 == 0 ? i4 + iArr2[1] : i7) < 0) {
                View view2 = this.A06;
                boolean z = view2 instanceof ListView;
                float f = 0.0f / 0.0f;
                if (z ? ((AbsListView) view2).canScrollList(-1) : view2.canScrollVertically(-1)) {
                    return;
                }
                float abs = this.A0I + Math.abs(r309);
                this.A0I = abs;
                A02(abs);
                iArr[1] = iArr[1] + i7;
            }
        }
    }

    public void C8k(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean CMt(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void CNm(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0T.A06(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0T.A05(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0T.A09(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0T.A08(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.A0K;
        if (i3 >= 0) {
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                i2++;
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0Cn c0Cn = this.A0U;
        return c0Cn.A01 | c0Cn.A00;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return AnonymousClass001.A1T(this.A0T.A01);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.A0T.A02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1403626149);
        super.onDetachedFromWindow();
        A05();
        0FI.A0C(-928074462, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        A00();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled()) {
            return false;
        }
        View view = this.A06;
        int i = -1;
        if ((view instanceof ListView ? ((AbsListView) view).canScrollList(-1) : view.canScrollVertically(-1)) || this.A0E || this.A0P) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.A00;
                    if (i2 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    A03(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.A00) {
                            i = motionEvent.getPointerId(AnonymousClass001.A1O(actionIndex) ? 1 : 0);
                            this.A00 = i;
                        }
                    }
                }
            }
            this.A0O = false;
            this.A00 = i;
        } else {
            A06(this.A04 - this.A0A.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.A00 = pointerId;
            this.A0O = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.A0F = motionEvent.getY(findPointerIndex2);
        }
        return this.A0O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.A06 == null) {
                A00();
            }
            View view = this.A06;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                2MI r0 = this.A0A;
                int measuredWidth2 = r0.getMeasuredWidth();
                int measuredHeight2 = r0.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = i5 - i6;
                int i8 = this.A01;
                r0.layout(i7, i8, i5 + i6, measuredHeight2 + i8);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A06 == null) {
            A00();
        }
        View view = this.A06;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        View view2 = this.A0A;
        view2.measure(View.MeasureSpec.makeMeasureSpec(this.A0J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A0J, 1073741824));
        this.A0K = -1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= getChildCount()) {
                return;
            }
            if (getChildAt(i4) == view2) {
                this.A0K = i4;
                return;
            }
            i3 = i4 + 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0T.A05(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.A0I;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.A0I = 0.0f;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.A0I = f;
                    iArr[1] = i2;
                }
                A02(f);
            }
        }
        int[] iArr2 = this.A0X;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C8j(view, this.A0V, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0U.A01 = i;
        startNestedScroll(i & 2);
        this.A0I = 0.0f;
        this.A0P = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        A08(savedState.A00);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.A0E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if ((r304 & 2) == 0) goto L8;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStartNestedScroll(android.view.View r302, android.view.View r303, int r304) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isEnabled()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L23
            r0 = r301
            boolean r0 = r0.A0E
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L23
            r0 = r304
            r1 = 2
            r0 = r0 & r1
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L26
        L23:
            r0 = 0
            r305 = r0
        L26:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onStartNestedScroll(android.view.View, android.view.View, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.A0U.A01 = 0;
        this.A0P = false;
        float f = this.A0I;
        if (f > 0.0f) {
            A01(f);
            this.A0I = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int actionIndex;
        int A05 = 0FI.A05(-1478828141);
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            View view = this.A06;
            if (!(view instanceof ListView ? ((AbsListView) view).canScrollList(-1) : view.canScrollVertically(-1)) && !this.A0E && !this.A0P) {
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.A00);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                            i = 1834935125;
                        } else {
                            if (this.A0O) {
                                float y = (motionEvent.getY(findPointerIndex) - this.A0G) * 0.5f;
                                this.A0O = false;
                                A01(y);
                            }
                            this.A00 = -1;
                            i = 586354475;
                        }
                    } else if (actionMasked == 2) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.A00);
                        if (findPointerIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            i = 461041156;
                        } else {
                            float y2 = motionEvent.getY(findPointerIndex2);
                            A03(y2);
                            if (this.A0O) {
                                float f = (y2 - this.A0G) * 0.5f;
                                if (f > 0.0f) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                    A02(f);
                                } else {
                                    i = -1901394204;
                                }
                            }
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                i = -1429100633;
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex2) == this.A00) {
                                actionIndex = AnonymousClass001.A1O(actionIndex2) ? 1 : 0;
                            }
                        }
                        this.A00 = motionEvent.getPointerId(actionIndex);
                    } else {
                        i = 1282040054;
                    }
                    0FI.A0B(i, A05);
                    return false;
                }
                this.A00 = motionEvent.getPointerId(0);
                this.A0O = false;
                0FI.A0B(1011597257, A05);
                return true;
            }
        }
        i = -1211853393;
        0FI.A0B(i, A05);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.A06;
        if (view == null || view.isNestedScrollingEnabled()) {
            super.requestDisallowInterceptTouchEvent(z);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        2MI r0 = this.A0A;
        r0.setScaleX(f);
        r0.setScaleY(f);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        A05();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0T.A04(z);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            float f = 40.0f;
            if (i == 0) {
                f = 56.0f;
            }
            this.A0J = (int) (displayMetrics.density * f);
            2MI r0 = this.A0A;
            r0.setImageDrawable(null);
            2MK r02 = this.A0B;
            r02.A00(i);
            r0.setImageDrawable(r02);
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.A0T.A07(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.A0T.A03(0);
    }
}
