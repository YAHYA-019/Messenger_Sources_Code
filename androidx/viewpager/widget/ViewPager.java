package androidx.viewpager.widget;

import X.0FI;
import X.0ND;
import X.0NE;
import X.0NF;
import X.0NG;
import X.0NH;
import X.0NI;
import X.0NL;
import X.0NM;
import X.0NV;
import X.0PY;
import X.0PZ;
import X.0Pz;
import X.0V3;
import X.AnonymousClass001;
import X.C0Ad;
import X.C0rs;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: ViewPager.class */
public class ViewPager extends ViewGroup {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public VelocityTracker A0A;
    public Scroller A0B;
    public 0NL A0C;
    public 0PY A0D;
    public 0PY A0E;
    public List A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public float A0M;
    public float A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public Parcelable A0X;
    public EdgeEffect A0Y;
    public EdgeEffect A0Z;
    public 0NM A0a;
    public ClassLoader A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final ArrayList A0f;
    public final Rect A0g;
    public final 0NF A0h;
    public final Runnable A0i;
    public int mGutterSize;
    public static final int[] A0j = {R.attr.layout_gravity};
    public static final Comparator A0l = new C0rs(0);
    public static final Interpolator A0k = new 0NE();

    /* loaded from: ViewPager$DecorView.class */
    public @interface DecorView {
    }

    /* loaded from: ViewPager$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new 0NV();
        public int A00;
        public Parcelable A01;
        public ClassLoader A02;

        public String toString() {
            return 0Pz.A0H(this.A00, "FragmentPager.SavedState{", Integer.toHexString(System.identityHashCode(this)), " position=", "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeParcelable(this.A01, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0NF] */
    public ViewPager(Context context) {
        super(context);
        this.A0f = AnonymousClass001.A0s();
        this.A0h = new Object();
        this.A0g = new Rect();
        this.A0U = -1;
        this.A0X = null;
        this.A0b = null;
        this.A00 = -3.4028235E38f;
        this.A03 = Float.MAX_VALUE;
        this.A0T = 1;
        this.A04 = -1;
        this.A0d = true;
        this.A0i = new 0NG(this);
        this.A0V = 0;
        A05();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.0NF] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0f = new ArrayList();
        this.A0h = new Object();
        this.A0g = new Rect();
        this.A0U = -1;
        this.A0X = null;
        this.A0b = null;
        this.A00 = -3.4028235E38f;
        this.A03 = Float.MAX_VALUE;
        this.A0T = 1;
        this.A04 = -1;
        this.A0d = true;
        this.A0i = new 0NG(this);
        this.A0V = 0;
        A05();
    }

    public static int A00(ViewPager viewPager) {
        return (viewPager.getMeasuredWidth() - viewPager.getPaddingLeft()) - viewPager.getPaddingRight();
    }

    private Rect A01(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view != null) {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            int bottom = view.getBottom();
            while (true) {
                rect.bottom = bottom;
                Object parent = view.getParent();
                if (!(parent instanceof ViewGroup) || parent == this) {
                    break;
                }
                view = (View) parent;
                rect.left += view.getLeft();
                rect.right += view.getRight();
                rect.top += view.getTop();
                bottom = rect.bottom + view.getBottom();
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        return rect;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0NF] */
    private 0NF A02(int i, int i2) {
        ?? obj = new Object();
        ((0NF) obj).A02 = i;
        ((0NF) obj).A03 = this.A0C.A0E(this, i);
        ((0NF) obj).A01 = this.A0C.A03(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0f;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, obj);
                return obj;
            }
        }
        this.A0f.add(obj);
        return obj;
    }

    private 0NF A03(View view) {
        0NF r306;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A0f;
            if (i2 >= arrayList.size()) {
                r306 = null;
                break;
            }
            r306 = (0NF) arrayList.get(i2);
            if (this.A0C.A0H(view, r306.A03)) {
                break;
            }
            i = i2 + 1;
        }
        return r306;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x010d, code lost:
    
        return r308;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.0NF A04(androidx.viewpager.widget.ViewPager r301) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A04(androidx.viewpager.widget.ViewPager):X.0NF");
    }

    private void A05() {
        setWillNotDraw(false);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setFocusable(true);
        Context context = getContext();
        this.A0B = new Scroller(context, A0k);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0W = viewConfiguration.getScaledPagingTouchSlop();
        this.A08 = (int) (400.0f * f);
        this.A07 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0Y = new EdgeEffect(context);
        this.A0Z = new EdgeEffect(context);
        this.A06 = (int) (25.0f * f);
        this.A0P = (int) (2.0f * f);
        this.A0R = (int) (f * 16.0f);
        C0Ad.A0B(this, new 0NH(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        0ND.A00(this, new 0NI(this));
    }

    private void A06(int i) {
        0PY r0 = this.A0E;
        if (r0 != null) {
            r0.CAf(i);
        }
        List list = this.A0G;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                0PY r02 = (0PY) this.A0G.get(i2);
                if (r02 != null) {
                    r02.CAf(i);
                }
            }
        }
        0PY r03 = this.A0D;
        if (r03 != null) {
            r03.CAf(i);
        }
    }

    private void A07(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.A0f.isEmpty()) {
            0NF A0I = A0I(this.A05);
            min = (int) ((A0I != null ? Math.min(A0I.A00, this.A03) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            } else {
                A0B(false);
            }
        } else if (!this.A0B.isFinished()) {
            this.A0B.setFinalX(A0G() * A00(this));
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    private void A08(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        0NF A0I = A0I(i);
        int A00 = A0I != null ? (int) (A00(this) * Math.max(this.A00, Math.min(A0I.A00, this.A03))) : 0;
        if (!z) {
            if (z2) {
                A06(i);
            }
            A0B(false);
            scrollTo(A00, 0);
            A0F(A00);
            return;
        }
        if (getChildCount() != 0) {
            Scroller scroller = this.A0B;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.A0I;
                Scroller scroller2 = this.A0B;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.A0B.abortAnimation();
                if (this.A0L) {
                    this.A0L = false;
                }
            }
            int scrollY = getScrollY();
            int i3 = A00 - scrollX;
            int i4 = -scrollY;
            if (i3 == 0 && i4 == 0) {
                A0B(false);
                A0A(this, this.A05);
                A0N(0);
            } else {
                if (!this.A0L) {
                    this.A0L = true;
                }
                A0N(2);
                int A002 = A00(this);
                int i5 = A002 / 2;
                float abs = Math.abs(i3);
                float f = abs * 1.0f;
                float f2 = A002;
                float min = Math.min(1.0f, f / f2);
                float f3 = i5;
                float sin = f3 + (((float) Math.sin((min - 0.5f) * 0.47123894f)) * f3);
                int abs2 = Math.abs(i2);
                int min2 = Math.min(abs2 > 0 ? Math.round(Math.abs(sin / abs2) * 1000.0f) * 4 : (int) (((abs / ((f2 * this.A0C.A03(this.A05)) + this.A09)) + 1.0f) * 100.0f), 600);
                this.A0I = false;
                this.A0B.startScroll(scrollX, scrollY, i3, i4, min2);
                postInvalidateOnAnimation();
            }
        } else if (this.A0L) {
            this.A0L = false;
        }
        if (z2) {
            A06(i);
        }
    }

    private void A09(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A04) {
            boolean A1O = AnonymousClass001.A1O(actionIndex);
            this.A02 = motionEvent.getX(A1O ? 1 : 0);
            this.A04 = motionEvent.getPointerId(A1O ? 1 : 0);
            VelocityTracker velocityTracker = this.A0A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (r0 == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0A(androidx.viewpager.widget.ViewPager r301, int r302) {
        /*
            Method dump skipped, instructions count: 2160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0A(androidx.viewpager.widget.ViewPager, int):void");
    }

    private void A0B(boolean z) {
        boolean z2 = false;
        if (this.A0V == 2) {
            z2 = true;
            if (this.A0L) {
                this.A0L = false;
            }
            if (!this.A0B.isFinished()) {
                this.A0B.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A0B.getCurrX();
                int currY = this.A0B.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0F(currX);
                    }
                }
            }
        }
        this.A0K = false;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A0f;
            if (i2 >= arrayList.size()) {
                break;
            }
            0NF r0 = (0NF) arrayList.get(i2);
            if (r0.A04) {
                r0.A04 = false;
                z2 = true;
            }
            i = i2 + 1;
        }
        if (z2) {
            Runnable runnable = this.A0i;
            if (z) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private boolean A0C() {
        0NL r0 = this.A0C;
        if (r0 == null || this.A05 >= r0.A0C() - 1) {
            return false;
        }
        A0Q(this.A05 + 1, true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        if (r301.A0Z.isFinished() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D() {
        /*
            r301 = this;
            r0 = r301
            r1 = -1
            r0.A04 = r1
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            r0.A0H = r1
            r0 = r301
            r1 = 0
            r0.A0J = r1
            r0 = r301
            android.view.VelocityTracker r0 = r0.A0A
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L27
            r0 = r303
            r0.recycle()
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r0.A0A = r1
        L27:
            r0 = r301
            android.widget.EdgeEffect r0 = r0.A0Y
            r0.onRelease()
            r0 = r301
            android.widget.EdgeEffect r0 = r0.A0Z
            r0.onRelease()
            r0 = r301
            android.widget.EdgeEffect r0 = r0.A0Y
            r303 = r0
            r0 = r303
            boolean r0 = r0.isFinished()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L53
            r0 = r301
            android.widget.EdgeEffect r0 = r0.A0Z
            boolean r0 = r0.isFinished()
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L55
        L53:
            r0 = 1
            r302 = r0
        L55:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0D():boolean");
    }

    private boolean A0E(float f) {
        boolean z;
        boolean z2;
        float f2 = this.A02 - f;
        this.A02 = f;
        float scrollX = getScrollX() + f2;
        float A00 = A00(this);
        float f3 = this.A00 * A00;
        float f4 = this.A03 * A00;
        ArrayList arrayList = this.A0f;
        boolean z3 = false;
        0NF r0 = (0NF) arrayList.get(0);
        0NF r02 = (0NF) arrayList.get(arrayList.size() - 1);
        if (r0.A02 != 0) {
            f3 = r0.A00 * A00;
            z = false;
        } else {
            z = true;
        }
        if (r02.A02 != this.A0C.A0C() - 1) {
            f4 = r02.A00 * A00;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.A0Y.onPull(Math.abs(f3 - scrollX) / A00);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.A0Z.onPull(Math.abs(scrollX - f4) / A00);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.A02 += scrollX - i;
        scrollTo(i, getScrollY());
        A0F(i);
        return z3;
    }

    private boolean A0F(int i) {
        if (this.A0f.size() == 0) {
            if (this.A0d) {
                return false;
            }
            this.A0c = false;
            A0O(0, 0.0f, 0);
            if (this.A0c) {
                return false;
            }
            throw AnonymousClass001.A0N("onPageScrolled did not call superclass implementation");
        }
        0NF A04 = A04(this);
        int A00 = A00(this);
        int i2 = this.A09;
        int i3 = A00 + i2;
        float f = i2;
        float f2 = A00;
        float f3 = f / f2;
        int i4 = A04.A02;
        float f4 = ((i / f2) - A04.A00) / (A04.A01 + f3);
        this.A0c = false;
        A0O(i4, f4, (int) (i3 * f4));
        if (this.A0c) {
            return true;
        }
        throw AnonymousClass001.A0N("onPageScrolled did not call superclass implementation");
    }

    public int A0G() {
        return this.A05;
    }

    public 0NL A0H() {
        return this.A0C;
    }

    public 0NF A0I(int i) {
        0NF r304;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            ArrayList arrayList = this.A0f;
            if (i3 >= arrayList.size()) {
                r304 = null;
                break;
            }
            r304 = (0NF) arrayList.get(i3);
            if (r304.A02 == i) {
                break;
            }
            i2 = i3 + 1;
        }
        return r304;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r0.size() >= r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0J():void");
    }

    public void A0K(int i) {
        this.A0K = false;
        A0P(i, 0, !this.A0d, false);
    }

    public void A0L(int i) {
        if (i < 1) {
            StringBuilder A1D = 0Pz.A1D("Requested offscreen page limit ", " too small; defaulting to ", i);
            A1D.append(1);
            Log.w("ViewPager", A1D.toString());
            i = 1;
        }
        if (i != this.A0T) {
            this.A0T = i;
            A0A(this, this.A05);
        }
    }

    public void A0M(int i) {
        int i2 = this.A09;
        this.A09 = i;
        int width = getWidth();
        A07(width, width, i, i2);
        requestLayout();
    }

    public void A0N(int i) {
        if (this.A0V != i) {
            this.A0V = i;
            0PY r0 = this.A0E;
            if (r0 != null) {
                r0.CAd(i);
            }
            List list = this.A0G;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    0PY r02 = (0PY) this.A0G.get(i2);
                    if (r02 != null) {
                        r02.CAd(i);
                    }
                }
            }
            0PY r03 = this.A0D;
            if (r03 != null) {
                r03.CAd(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0O(int r302, float r303, int r304) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0O(int, float, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (r302 < (r0 - r0)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0P(int r302, int r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0P(int, int, boolean, boolean):void");
    }

    public void A0Q(int i, boolean z) {
        this.A0K = false;
        A0P(i, 0, z, false);
    }

    public void A0R(0NL r302) {
        ArrayList arrayList;
        0NL r0 = this.A0C;
        if (r0 != null) {
            synchronized (r0) {
                r0.A00 = null;
            }
            this.A0C.A06(this);
            int i = 0;
            while (true) {
                arrayList = this.A0f;
                if (i >= arrayList.size()) {
                    break;
                }
                0NF r02 = (0NF) arrayList.get(i);
                this.A0C.A0G(this, r02.A03, r02.A02);
                i++;
            }
            this.A0C.A0B(this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!getChildAt(i2).getLayoutParams().A02) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A05 = 0;
            scrollTo(0, 0);
        }
        0NL r03 = this.A0C;
        this.A0C = r302;
        this.A0S = 0;
        if (r302 != null) {
            0NM r307 = this.A0a;
            if (r307 == null) {
                r307 = new 0NM(this);
                this.A0a = r307;
            }
            0NL r04 = this.A0C;
            synchronized (r04) {
                r04.A00 = r307;
            }
            this.A0K = false;
            boolean z = this.A0d;
            this.A0d = true;
            this.A0S = this.A0C.A0C();
            if (this.A0U >= 0) {
                this.A0C.A0A(this.A0X, this.A0b);
                A0P(this.A0U, 0, false, true);
                this.A0U = -1;
                this.A0X = null;
                this.A0b = null;
            } else if (z) {
                requestLayout();
            } else {
                A0A(this, this.A05);
            }
        }
        List list = this.A0F;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.A0F.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((0V3) this.A0F.get(i3)).Bi1(r03, r302, this);
        }
    }

    public void A0S(0PY r302) {
        List list = this.A0G;
        if (list == null) {
            list = new ArrayList();
            this.A0G = list;
        }
        list.add(r302);
    }

    public void A0T(0PY r302) {
        List list = this.A0G;
        if (list != null) {
            list.remove(r302);
        }
    }

    public void A0U(0PY r302) {
        this.A0E = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        if (r0 >= r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0158, code lost:
    
        if (r0 <= r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017f, code lost:
    
        if (r302 != 2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0V(int r302) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0V(int):boolean");
    }

    public boolean A0W(View view, int i, int i2, int i3, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                int i5 = childCount;
                if (i5 < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i5);
                int i6 = i2 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && A0W(childAt, i, i6 - childAt.getLeft(), i4 - childAt.getTop(), true)) {
                    return true;
                }
                childCount = i5 - 1;
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        0NF A03;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (A03 = A03(childAt)) != null && A03.A02 == this.A05) {
                    childAt.addFocusables(arrayList, i, i2);
                }
                i3 = i4 + 1;
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        0NF A03;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A03 = A03(childAt)) != null && A03.A02 == this.A05) {
                childAt.addTouchables(arrayList);
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new 0PZ();
        }
        0PZ r0 = (0PZ) layoutParams;
        boolean z = r0.A02;
        boolean z2 = false;
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            z2 = true;
        }
        boolean z3 = z | z2;
        r0.A02 = z3;
        if (!this.A0e) {
            super.addView(view, i, layoutParams);
        } else {
            if (z3) {
                throw AnonymousClass001.A0N("Cannot add pager decor view during layout");
            }
            r0.A03 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.A0C != null) {
            int A00 = A00(this);
            int scrollX = getScrollX();
            if (i >= 0 ? !(i <= 0 || scrollX >= ((int) (A00 * this.A03))) : scrollX > ((int) (A00 * this.A00))) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (super.checkLayoutParams(r302) == false) goto L6;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.0PZ
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L18
            r0 = r301
            r1 = r302
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            boolean r0 = super.checkLayoutParams(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1a
        L18:
            r0 = 0
            r303 = r0
        L1a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    @Override // android.view.View
    public void computeScroll() {
        this.A0I = true;
        if (this.A0B.isFinished() || !this.A0B.computeScrollOffset()) {
            A0B(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.A0B.getCurrX();
        int currY = this.A0B.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A0F(currX)) {
                this.A0B.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
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
            if (r0 != 0) goto L55
            r0 = r302
            int r0 = r0.getAction()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto La0
            r0 = r302
            int r0 = r0.getKeyCode()
            r304 = r0
            r0 = 21
            r303 = r0
            r0 = 2
            r305 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L71
            r0 = 22
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L57
            r0 = 61
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto La0
            r0 = r302
            boolean r0 = r0.hasNoModifiers()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4a
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.hasModifiers(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La0
        L4a:
            r0 = r301
            r1 = r305
            boolean r0 = r0.A0V(r1)
            r303 = r0
        L51:
            r0 = r303
            if (r0 == 0) goto La0
        L55:
            r0 = 1
            return r0
        L57:
            r0 = r302
            r1 = r305
            boolean r0 = r0.hasModifiers(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r301
            boolean r0 = r0.A0C()
            r303 = r0
            goto L51
        L6a:
            r0 = 66
            r305 = r0
            goto L4a
        L71:
            r0 = r302
            r1 = r305
            boolean r0 = r0.hasModifiers(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L99
            r0 = r301
            int r0 = r0.A05
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto La0
            r0 = 1
            r303 = r0
            r0 = r305
            r1 = r303
            int r0 = r0 - r1
            r305 = r0
            r0 = r301
            r1 = r305
            r2 = r303
            r0.A0Q(r1, r2)
            goto L55
        L99:
            r0 = 17
            r305 = r0
            goto L4a
        La0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z;
        0NF A03;
        if (accessibilityEvent.getEventType() != 4096) {
            int childCount = getChildCount();
            z = false;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0 && (A03 = A03(childAt)) != null && A03.A02 == this.A05 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
                i = i2 + 1;
            }
        } else {
            z = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        return z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        0NL r0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (r0 = this.A0C) == null || r0.A0C() <= 1)) {
            this.A0Y.finish();
            this.A0Z.finish();
            return;
        }
        if (!this.A0Y.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.A00 * width);
            this.A0Y.setSize(height, width);
            z = false | this.A0Y.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.A0Z.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.A03 + 1.0f)) * width2);
            this.A0Z.setSize(height2, width2);
            z |= this.A0Z.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new 0PZ();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        ((0PZ) layoutParams).A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0j);
        ((0PZ) layoutParams).A01 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new 0PZ();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        throw AnonymousClass001.A0Q("get");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-782663130);
        super.onAttachedToWindow();
        this.A0d = true;
        0FI.A0C(-1814596170, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1408290646);
        removeCallbacks(this.A0i);
        Scroller scroller = this.A0B;
        if (scroller != null && !scroller.isFinished()) {
            this.A0B.abortAnimation();
        }
        super.onDetachedFromWindow();
        0FI.A0C(753494652, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0D();
            return false;
        }
        if (action != 0) {
            if (this.A0H) {
                return true;
            }
            if (this.A0J) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.A01 = x;
            this.A02 = x;
            float y = motionEvent.getY();
            this.A0M = y;
            this.A0N = y;
            this.A04 = motionEvent.getPointerId(0);
            this.A0J = false;
            this.A0I = true;
            this.A0B.computeScrollOffset();
            if (this.A0V != 2 || Math.abs(this.A0B.getFinalX() - this.A0B.getCurrX()) <= this.A0P) {
                A0B(false);
                this.A0H = false;
            } else {
                this.A0B.abortAnimation();
                this.A0K = false;
                A0A(this, this.A05);
                this.A0H = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                A0N(1);
            }
        } else if (action == 2) {
            int i = this.A04;
            float f = 0.0f / 0.0f;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.A02;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.A0M);
                if (f2 != 0.0f) {
                    float f3 = this.A02;
                    if ((f3 >= this.mGutterSize || f2 <= 0.0f) && ((f3 <= getWidth() - this.mGutterSize || f2 >= 0.0f) && A0W(this, (int) f2, (int) x2, (int) y2, false))) {
                        this.A02 = x2;
                        this.A0N = y2;
                        this.A0J = true;
                        return false;
                    }
                }
                float f4 = this.A0W;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.A0H = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    A0N(1);
                    float f5 = this.A01;
                    float f6 = this.A0W;
                    this.A02 = f2 > 0.0f ? f5 + f6 : f5 - f6;
                    this.A0N = y2;
                    if (!this.A0L) {
                        this.A0L = true;
                    }
                } else if (abs2 > f4) {
                    this.A0J = true;
                }
                if (this.A0H && A0E(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            A09(motionEvent);
        }
        VelocityTracker velocityTracker = this.A0A;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A0A = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        return this.A0H;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0149  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r302, int r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0103, code lost:
    
        if (r0 == 80) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0204, code lost:
    
        if (r314 == false) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        0NF A03;
        int childCount = getChildCount();
        int i2 = -1;
        int i3 = childCount - 1;
        int i4 = -1;
        if ((i & 2) != 0) {
            i2 = childCount;
            i3 = 0;
            i4 = 1;
        }
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (A03 = A03(childAt)) != null && A03.A02 == this.A05 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        0NL r0 = this.A0C;
        if (r0 != null) {
            r0.A0A(savedState.A01, savedState.A02);
            A0P(savedState.A00, 0, false, true);
        } else {
            this.A0U = savedState.A00;
            this.A0X = savedState.A01;
            this.A0b = savedState.A02;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.viewpager.widget.ViewPager$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A05;
        0NL r0 = this.A0C;
        if (r0 != null) {
            absSavedState.A01 = r0.A07();
        }
        return absSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-2075028882);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A09;
            A07(i, i3, i5, i5);
        }
        0FI.A0C(-1549034334, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int A05 = 0FI.A05(-649692108);
        int i2 = 0;
        if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
            0NL r0 = this.A0C;
            if (r0 != null && r0.A0C() != 0) {
                VelocityTracker velocityTracker = this.A0A;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.A0A = velocityTracker;
                }
                velocityTracker.addMovement(motionEvent);
                int action = motionEvent.getAction() & 255;
                if (action != 0) {
                    if (action == 1) {
                        if (this.A0H) {
                            VelocityTracker velocityTracker2 = this.A0A;
                            velocityTracker2.computeCurrentVelocity(1000, this.A07);
                            int xVelocity = (int) velocityTracker2.getXVelocity(this.A04);
                            this.A0K = true;
                            int A00 = A00(this);
                            int scrollX = getScrollX();
                            0NF A04 = A04(this);
                            float f = A00;
                            int i3 = A04.A02;
                            float f2 = ((scrollX / f) - A04.A00) / (A04.A01 + (this.A09 / f));
                            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.A04)) - this.A01)) <= this.A06 || Math.abs(xVelocity) <= this.A08) {
                                float f3 = 0.6f;
                                if (i3 >= this.A05) {
                                    f3 = 0.4f;
                                }
                                i3 += (int) (f2 + f3);
                            } else if (xVelocity <= 0) {
                                i3++;
                            }
                            ArrayList arrayList = this.A0f;
                            if (arrayList.size() > 0) {
                                i3 = Math.max(((0NF) arrayList.get(0)).A02, Math.min(i3, ((0NF) arrayList.get(arrayList.size() - 1)).A02));
                            }
                            A0P(i3, xVelocity, true, true);
                            z = A0D();
                        }
                        0FI.A0B(-878972735, A05);
                        return true;
                    }
                    if (action != 2) {
                        if (action != 3) {
                            if (action == 5) {
                                i2 = motionEvent.getActionIndex();
                                this.A02 = motionEvent.getX(i2);
                            } else if (action == 6) {
                                A09(motionEvent);
                                this.A02 = motionEvent.getX(motionEvent.findPointerIndex(this.A04));
                            }
                        } else if (this.A0H) {
                            A08(this.A05, 0, true, false);
                            z = A0D();
                        }
                        0FI.A0B(-878972735, A05);
                        return true;
                    }
                    if (!this.A0H) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.A04);
                        float f4 = 0.0f / 0.0f;
                        if (findPointerIndex != -1) {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.A02);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.A0N);
                            if (abs > this.A0W && abs > abs2) {
                                this.A0H = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f5 = this.A01;
                                float f6 = x - f5;
                                float f7 = this.A0W;
                                this.A02 = f6 > 0.0f ? f5 + f7 : f5 - f7;
                                this.A0N = y;
                                A0N(1);
                                if (!this.A0L) {
                                    this.A0L = true;
                                }
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        z = A0D();
                    }
                    if (this.A0H) {
                        z = A0E(motionEvent.getX(motionEvent.findPointerIndex(this.A04)));
                    }
                    0FI.A0B(-878972735, A05);
                    return true;
                    if (z) {
                        postInvalidateOnAnimation();
                    }
                    0FI.A0B(-878972735, A05);
                    return true;
                }
                this.A0B.abortAnimation();
                this.A0K = false;
                A0A(this, this.A05);
                float x2 = motionEvent.getX();
                this.A01 = x2;
                this.A02 = x2;
                float y2 = motionEvent.getY();
                this.A0M = y2;
                this.A0N = y2;
                this.A04 = motionEvent.getPointerId(i2);
                0FI.A0B(-878972735, A05);
                return true;
            }
            i = -576202369;
        } else {
            i = -961796525;
        }
        0FI.A0B(i, A05);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.A0e) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L11
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            if (r0 != r1) goto L13
        L11:
            r0 = 1
            r303 = r0
        L13:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
