package androidx.core.widget;

import X.0Cl;
import X.0Cm;
import X.0Co;
import X.0Cp;
import X.0Cs;
import X.0FI;
import X.0Pz;
import X.0Rj;
import X.1BK;
import X.3UT;
import X.5OJ;
import X.AnonymousClass001;
import X.C0Ad;
import X.C0Cn;
import X.C2958Jel;
import X.C7xz;
import X.LGo;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.Constants;

/* loaded from: NestedScrollView.class */
public class NestedScrollView extends FrameLayout implements 0Cl, 0Cm, 0Cp {
    public static final float A0T = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final C2958Jel A0U = new 0Cs();
    public static final int[] A0V = {R.attr.fillViewport};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public OverScroller A09;
    public 0Rj A0A;
    public C7xz A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public int A0G;
    public long A0H;
    public View A0I;
    public SavedState A0J;
    public boolean A0K;
    public boolean A0L;
    public final float A0M;
    public final Rect A0N;
    public final 0Co A0O;
    public final 3UT A0P;
    public final C0Cn A0Q;
    public final int[] A0R;
    public final int[] A0S;

    /* loaded from: NestedScrollView$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(18);
        public int A00;

        public String toString() {
            return 0Pz.A0H(this.A00, "HorizontalScrollView.SavedState{", 1BK.A12(this), " scrollPosition=", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971209);
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [X.0Cn, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0N = new Rect();
        this.A0L = true;
        this.A0K = false;
        this.A0I = null;
        this.A0D = false;
        this.A0E = true;
        this.A00 = -1;
        this.A0S = new int[2];
        this.A0R = new int[2];
        3UT r0 = new 3UT(this);
        this.A0P = r0;
        Context context2 = getContext();
        this.A0A = new 0Rj(context2, r0);
        this.A08 = 5OJ.A02(context, attributeSet);
        this.A07 = 5OJ.A02(context, attributeSet);
        this.A0M = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.A09 = new OverScroller(context2);
        setFocusable(true);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A04 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A03 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0V, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.A0C) {
            this.A0C = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.A0Q = new Object();
        this.A0O = new 0Co(this);
        setNestedScrollingEnabled(true);
        C0Ad.A0B(this, A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r305 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00(int r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A00(int, int, int, boolean):int");
    }

    private int A01(Rect rect) {
        int i = 0;
        if (getChildCount() != 0) {
            int height = getHeight();
            int scrollY = getScrollY();
            int i2 = scrollY + height;
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            if (rect.top > 0) {
                scrollY += verticalFadingEdgeLength;
            }
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i3 = i2;
            if (rect.bottom < childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin) {
                i3 = i2 - verticalFadingEdgeLength;
            }
            int i4 = rect.bottom;
            if (i4 > i3 && rect.top > scrollY) {
                i = Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + marginLayoutParams.bottomMargin) - i2);
            } else if (rect.top < scrollY && i4 < i3) {
                return Math.max(-(rect.height() > height ? i3 - rect.bottom : scrollY - rect.top), -getScrollY());
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c1, code lost:
    
        if (r0 < 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(int r302) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A02(int):void");
    }

    private void A03(int i, int[] iArr, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        0Co.A02(this.A0O, (int[]) null, iArr, 0, scrollY2, 0, i - scrollY2, i2);
    }

    private void A04(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A00) {
            boolean A1O = AnonymousClass001.A1O(actionIndex);
            this.A01 = (int) motionEvent.getY(A1O ? 1 : 0);
            this.A00 = motionEvent.getPointerId(A1O ? 1 : 0);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static void A05(NestedScrollView nestedScrollView, int i, int i2, boolean z) {
        if (nestedScrollView.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - nestedScrollView.A0H > 250) {
                View childAt = nestedScrollView.getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int height2 = (nestedScrollView.getHeight() - nestedScrollView.getPaddingTop()) - nestedScrollView.getPaddingBottom();
                int scrollY = nestedScrollView.getScrollY();
                nestedScrollView.A09.startScroll(nestedScrollView.getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
                if (z) {
                    nestedScrollView.A0O.A07(2, 1);
                } else {
                    nestedScrollView.A0O.A03(1);
                }
                nestedScrollView.A02 = nestedScrollView.getScrollY();
                nestedScrollView.postInvalidateOnAnimation();
            } else {
                OverScroller overScroller = nestedScrollView.A09;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    nestedScrollView.A0O.A03(1);
                }
                nestedScrollView.scrollBy(i, i2);
            }
            nestedScrollView.A0H = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean A06(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus == null || !A0A(findNextFocus, height, getHeight())) {
            if (i == 33) {
                if (getScrollY() < height) {
                    height = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            A00(height, 0, 1, true);
        } else {
            Rect rect = this.A0N;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A00(A01(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused()) {
            if (!A0A(findFocus, 0, getHeight())) {
                int descendantFocusability = getDescendantFocusability();
                setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                requestFocus();
                setDescendantFocusability(descendantFocusability);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        if (r0 >= r304) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(int r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A07(int, int, int):boolean");
    }

    private boolean A08(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5 = i2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        boolean z3 = false;
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            z = false;
        }
        if (i6 > i4) {
            i6 = i4;
        } else {
            if (i6 >= 0) {
                z2 = false;
                onOverScrolled(i5, i6, z, z2);
                if (!z || z2) {
                    z3 = true;
                }
                return z3;
            }
            i6 = 0;
        }
        z2 = true;
        if (this.A0O.A00 == null) {
            this.A09.springBack(i5, i6, 0, 0, 0, A0E());
        }
        onOverScrolled(i5, i6, z, z2);
        if (!z) {
        }
        z3 = true;
        return z3;
    }

    private boolean A09(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A08;
        if (5OJ.A00(edgeEffect) != 0.0f) {
            5OJ.A01(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (5OJ.A00(edgeEffect2) == 0.0f) {
            return z;
        }
        5OJ.A01(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if ((r0.top - r303) > (getScrollY() + r304)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0A(android.view.View r302, int r303, int r304) {
        /*
            r301 = this;
            r0 = r301
            android.graphics.Rect r0 = r0.A0N
            r305 = r0
            r0 = r302
            r1 = r305
            r0.getDrawingRect(r1)
            r0 = r301
            r1 = r302
            r2 = r305
            r0.offsetDescendantRectToMyCoords(r1, r2)
            r0 = r305
            int r0 = r0.bottom
            r1 = r303
            int r0 = r0 + r1
            r306 = r0
            r0 = r301
            int r0 = r0.getScrollY()
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 < r1) goto L44
            r0 = r305
            int r0 = r0.top
            r1 = r303
            int r0 = r0 - r1
            r308 = r0
            r0 = r301
            int r0 = r0.getScrollY()
            r1 = r304
            int r0 = r0 + r1
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r308
            r1 = r306
            if (r0 <= r1) goto L47
        L44:
            r0 = 0
            r307 = r0
        L47:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0A(android.view.View, int, int):boolean");
    }

    public static boolean A0B(View view, View view2) {
        if (view != view2) {
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A0B((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A0C(EdgeEffect edgeEffect, int i) {
        boolean z = true;
        if (i <= 0) {
            float A00 = 5OJ.A00(edgeEffect) * getHeight();
            float abs = Math.abs(-i) * 0.35f;
            float f = this.A0M * 0.015f;
            double log = Math.log(abs / f);
            double d = A0T;
            if (((float) (f * Math.exp((d / (d - 1.0d)) * log))) >= A00) {
                z = false;
            }
        }
        return z;
    }

    public float A0D() {
        float f = this.A0F;
        if (f == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw AnonymousClass001.A0N("Expected theme to define listPreferredItemHeight.");
            }
            f = typedValue.getDimension(context.getResources().getDisplayMetrics());
            this.A0F = f;
        }
        return f;
    }

    public int A0E() {
        int i = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            i = Math.max(0, ((childAt.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return i;
    }

    public void A0F(int i) {
        if (getChildCount() > 0) {
            this.A09.fling(getScrollX(), getScrollY(), 0, i, 0, 0, (-1) << (-1), (-1) >>> 1, 0, 0);
            this.A0O.A07(2, 1);
            this.A02 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public boolean A0G(KeyEvent keyEvent) {
        Rect rect = this.A0N;
        rect.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            }
        }
        boolean z2 = false;
        int i = 130;
        if (z) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode == 122) {
                                        A02(33);
                                        return false;
                                    }
                                    if (keyCode != 123) {
                                        return false;
                                    }
                                }
                            }
                        } else if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        A02(i);
                        return false;
                    }
                    if (!keyEvent.isAltPressed()) {
                        return A06(ActionId.APP_DID_FINISH_LAUNCHING);
                    }
                    int height = getHeight();
                    rect.top = 0;
                    rect.bottom = height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        int bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                        rect.bottom = bottom;
                        rect.top = bottom - height;
                    }
                    return A07(ActionId.APP_DID_FINISH_LAUNCHING, rect.top, rect.bottom);
                }
                if (!keyEvent.isAltPressed()) {
                    return A06(33);
                }
                int height2 = getHeight();
                rect.top = 0;
                rect.bottom = height2;
                return A07(33, 0, height2);
            }
        } else if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, ActionId.APP_DID_FINISH_LAUNCHING);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(ActionId.APP_DID_FINISH_LAUNCHING)) {
                z2 = true;
            }
        }
        return z2;
    }

    public void C8h(View view, int[] iArr, int i, int i2, int i3) {
        this.A0O.A09(iArr, (int[]) null, i, i2, i3);
    }

    public void C8i(View view, int i, int i2, int i3, int i4, int i5) {
        A03(i4, null, i5);
    }

    public void C8j(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A03(i4, iArr, i5);
    }

    public void C8k(View view, View view2, int i, int i2) {
        C0Cn c0Cn = this.A0Q;
        if (i2 == 1) {
            c0Cn.A00 = i;
        } else {
            c0Cn.A01 = i;
        }
        this.A0O.A07(2, i2);
    }

    public boolean CMt(View view, View view2, int i, int i2) {
        return AnonymousClass001.A1N(i & 2);
    }

    public void CNm(View view, int i) {
        C0Cn c0Cn = this.A0Q;
        if (i == 1) {
            c0Cn.A00 = 0;
        } else {
            c0Cn.A01 = 0;
        }
        this.A0O.A03(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw AnonymousClass001.A0N("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw AnonymousClass001.A0N("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw AnonymousClass001.A0N("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw AnonymousClass001.A0N("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void computeScroll() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (A0G(r302) != false) goto L6;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.dispatchKeyEvent(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0G(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0O.A06(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0O.A05(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0O.A09(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0O.A08(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A08;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(A0E(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i2 = 0 + getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + marginLayoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0Cn c0Cn = this.A0Q;
        return c0Cn.A01 | c0Cn.A00;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return AnonymousClass001.A1T(this.A0O.A01);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.A0O.A02;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1177636964);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
        0FI.A0C(-494415307, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-435033462);
        super.onAttachedToWindow();
        this.A0K = false;
        0FI.A0C(-1278200131, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x058a, code lost:
    
        if (r305 < 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x063f, code lost:
    
        if (r305 < 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0328  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.A0D) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A00;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", 0Pz.A0d("Invalid pointerId=", " in onInterceptTouchEvent", i2));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.A01) > this.A05 && (getNestedScrollAxes() & 2) == 0) {
                                this.A0D = true;
                                this.A01 = y;
                                VelocityTracker velocityTracker = this.A06;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A06 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A0G = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A04(motionEvent);
                    }
                }
            }
            this.A0D = false;
            this.A00 = -1;
            VelocityTracker velocityTracker2 = this.A06;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A06 = null;
            }
            if (this.A09.springBack(getScrollX(), getScrollY(), 0, 0, 0, A0E())) {
                postInvalidateOnAnimation();
            }
            this.A0O.A03(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A01 = y2;
                    this.A00 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A06;
                    if (velocityTracker3 == null) {
                        this.A06 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A06.addMovement(motionEvent);
                    OverScroller overScroller = this.A09;
                    overScroller.computeScrollOffset();
                    if (!A09(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.A0D = z;
                    this.A0O.A07(2, 0);
                }
            }
            if (!A09(motionEvent) && this.A09.isFinished()) {
                z = false;
            }
            this.A0D = z;
            VelocityTracker velocityTracker4 = this.A06;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A06 = null;
            }
        }
        return this.A0D;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.A0L = false;
        View view = this.A0I;
        if (view != null && A0B(view, this)) {
            View view2 = this.A0I;
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A01 = A01(rect);
            if (A01 != 0) {
                scrollBy(0, A01);
            }
        }
        this.A0I = null;
        if (!this.A0K) {
            if (this.A0J != null) {
                scrollTo(getScrollX(), this.A0J.A00);
                this.A0J = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int i6 = scrollY;
            if (paddingTop >= i5 || scrollY < 0) {
                i6 = 0;
            } else if (paddingTop + scrollY > i5) {
                i6 = i5 - paddingTop;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0K = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0C || View.MeasureSpec.getMode(i2) == 0 || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        if (measuredHeight < measuredHeight2) {
            childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, ((ViewGroup.LayoutParams) marginLayoutParams).width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!z) {
            z2 = true;
            dispatchNestedFling(0.0f, f2, true);
            A0F((int) f2);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0O.A05(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C8h(view, iArr, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A03(i4, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C8k(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null) {
            return false;
        }
        if (!A0A(findNextFocus, 0, getHeight())) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0J = savedState;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C7xz c7xz = this.A0B;
        if (c7xz != null) {
            c7xz.CJ8(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A06 = 0FI.A06(-901040595);
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus) {
            i5 = -1691735934;
        } else {
            if (A0A(findFocus, 0, i4)) {
                Rect rect = this.A0N;
                findFocus.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(findFocus, rect);
                int A01 = A01(rect);
                if (A01 != 0) {
                    if (this.A0E) {
                        A05(this, 0, A01, false);
                    } else {
                        scrollBy(0, A01);
                    }
                }
            }
            i5 = 485153778;
        }
        0FI.A0C(i5, A06);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return AnonymousClass001.A1N(i & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        CNm(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x03c9, code lost:
    
        if (getChildCount() > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0384, code lost:
    
        if (A0C(r313, r321) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.A0L) {
            this.A0I = view2;
        } else {
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A01 = A01(rect);
            if (A01 != 0) {
                scrollBy(0, A01);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A01 = A01(rect);
        boolean z2 = false;
        if (A01 != 0) {
            z2 = true;
            if (!z) {
                A05(this, 0, A01, false);
                return true;
            }
            scrollBy(0, A01);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A06) != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.A0L = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0O.A04(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.A0O.A07(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.A0O.A03(0);
    }
}
