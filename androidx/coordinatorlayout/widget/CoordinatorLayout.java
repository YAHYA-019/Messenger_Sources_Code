package androidx.coordinatorlayout.widget;

import X.08D;
import X.0Ck;
import X.0Cl;
import X.0FI;
import X.0ND;
import X.0NJ;
import X.0Pz;
import X.0QO;
import X.5WE;
import X.5WF;
import X.5WG;
import X.5WH;
import X.6BO;
import X.6LR;
import X.AnonymousClass001;
import X.C03v;
import X.C03y;
import X.C0Ad;
import X.C0Cn;
import X.C80t;
import X.JR8;
import X.LQL;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.google.android.material.appbar.AppBarLayout;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: CoordinatorLayout.class */
public class CoordinatorLayout extends ViewGroup implements 0Ck, 0Cl {
    public static final String A0I;
    public static final ThreadLocal A0J;
    public static final Comparator A0K;
    public static final Class[] A0L;
    public static final C03y A0M;
    public ViewGroup.OnHierarchyChangeListener A00;
    public C80t A01;
    public 08D A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public View A07;
    public View A08;
    public 0NJ A09;
    public boolean A0A;
    public int[] A0B;
    public final 5WE A0C;
    public final List A0D;
    public final C0Cn A0E;
    public final List A0F;
    public final int[] A0G;
    public final int[] A0H;

    /* loaded from: CoordinatorLayout$Behavior.class */
    public abstract class Behavior {
        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            return false;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public 08D onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, 08D r304) {
            return r304;
        }

        public void onAttachedToLayoutParams(5WH r302) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public abstract boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i);

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return AbsSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            return false;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: CoordinatorLayout$DefaultBehavior.class */
    public @interface DefaultBehavior {
        Class value();
    }

    /* loaded from: CoordinatorLayout$SavedState.class */
    public final class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator CREATOR = new JR8(0);
        public SparseArray A00;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            SparseArray sparseArray = new SparseArray(readInt);
            this.A00 = sparseArray;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    return;
                }
                sparseArray.append(iArr[i2], readParcelableArray[i2]);
                i = i2 + 1;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.A00;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.A00.keyAt(i2);
                parcelableArr[i2] = this.A00.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Comparator] */
    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        String str = null;
        if (r0 != null) {
            str = r0.getName();
        }
        A0I = str;
        A0K = new Object();
        A0L = new Class[]{Context.class, AttributeSet.class};
        A0J = new ThreadLocal();
        A0M = new C03v(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969273);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0Cn, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.A0D = new ArrayList();
        this.A0C = new 5WE();
        this.A0F = new ArrayList();
        this.A0G = new int[2];
        this.A0H = new int[2];
        this.A0E = new Object();
        int[] iArr = 5WF.A00;
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2132608800);
            C0Ad.A07(context, obtainStyledAttributes, attributeSet, this, iArr, 0, 2132608800);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
            C0Ad.A07(context, obtainStyledAttributes, attributeSet, this, iArr, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A0B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int[] iArr2 = this.A0B;
            int length = iArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.A06 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        A04();
        super.setOnHierarchyChangeListener(new 5WG(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private int A00(int i) {
        StringBuilder A0k;
        int[] iArr = this.A0B;
        if (iArr == null) {
            A0k = AnonymousClass001.A0k();
            A0k.append("No keylines defined for ");
            A0k.append(this);
            A0k.append(" - attempted index lookup ");
            A0k.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("Keyline index ");
            A0k.append(i);
            A0k.append(" out of range for ");
            A0k.append(this);
        }
        Log.e("CoordinatorLayout", A0k.toString());
        return 0;
    }

    public static Rect A01() {
        Rect rect = (Rect) A0M.A3p();
        if (rect == null) {
            rect = new Rect();
        }
        return rect;
    }

    public static 5WH A02(View view) {
        5WH layoutParams = view.getLayoutParams();
        if (!layoutParams.A0B) {
            if (view instanceof 6LR) {
                layoutParams.A01(new AppBarLayout.BaseBehavior());
            } else {
                Class<?> cls = view.getClass();
                while (true) {
                    Class<?> cls2 = cls;
                    if (cls2 == null) {
                        break;
                    }
                    DefaultBehavior defaultBehavior = (DefaultBehavior) cls2.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior == null) {
                        cls = cls2.getSuperclass();
                    } else {
                        try {
                            layoutParams.A01((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception e) {
                            Log.e("CoordinatorLayout", 0Pz.A0j("Default behavior class ", defaultBehavior.value().getName(), " could not be instantiated. Did you forget a default constructor?"), e);
                        }
                    }
                }
            }
            layoutParams.A0B = true;
        }
        return layoutParams;
    }

    private void A03() {
        View view = this.A07;
        if (view != null) {
            Behavior behavior = view.getLayoutParams().A0A;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.onTouchEvent(this, this.A07, obtain);
                obtain.recycle();
            }
            this.A07 = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
        this.A0A = false;
    }

    private void A04() {
        if (!getFitsSystemWindows()) {
            0ND.A00(this, (0NJ) null);
            return;
        }
        LQL lql = this.A09;
        if (lql == null) {
            lql = new LQL(this, 1);
            this.A09 = lql;
        }
        0ND.A00(this, lql);
        setSystemUiVisibility(1280);
    }

    public static void A05(Rect rect) {
        rect.setEmpty();
        A0M.Ccj(rect);
    }

    public static void A06(Rect rect, Rect rect2, 5WH r303, int i, int i2, int i3) {
        int i4 = r303.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = r303.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & ActionId.MISSED_EVENT) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & ActionId.MISSED_EVENT;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & ActionId.MISSED_EVENT;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private void A07(Rect rect, 5WH r303, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r303).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) r303).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r303).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) r303).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public static void A08(View view, int i) {
        5WH layoutParams = view.getLayoutParams();
        int i2 = layoutParams.A07;
        if (i2 != i) {
            view.offsetTopAndBottom(i - i2);
            layoutParams.A07 = i;
        }
    }

    private boolean A09(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.A0F;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i2 = childCount;
        while (true) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                break;
            }
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
            i2 = i3;
        }
        Collections.sort(list, A0K);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            Behavior behavior = view.getLayoutParams().A0A;
            if (z) {
                if (actionMasked != 0 && behavior != null) {
                    if (motionEvent2 == null) {
                        motionEvent2 = MotionEvent.obtain(motionEvent);
                        motionEvent2.setAction(3);
                    }
                    if (i != 0) {
                        behavior.onTouchEvent(this, view, motionEvent2);
                    } else {
                        behavior.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else if (behavior != null) {
                z = i != 0 ? behavior.onTouchEvent(this, view, motionEvent) : behavior.onInterceptTouchEvent(this, view, motionEvent);
                if (z) {
                    this.A07 = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            Behavior behavior2 = view2.getLayoutParams().A0A;
                            if (behavior2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = MotionEvent.obtain(motionEvent);
                                    motionEvent2.setAction(3);
                                }
                                if (i != 0) {
                                    behavior2.onTouchEvent(this, view2, motionEvent2);
                                } else {
                                    behavior2.onInterceptTouchEvent(this, view2, motionEvent2);
                                }
                            }
                        }
                    }
                }
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    public List A0A(View view) {
        0QO r0 = this.A0C.A00;
        int size = r0.size();
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            AbstractCollection abstractCollection = (AbstractCollection) r0.A06(i2);
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r0.A04(i2));
            }
            i = i2 + 1;
        }
        if (arrayList == null) {
            arrayList = Collections.emptyList();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x061d, code lost:
    
        if (r330 == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0B(int r302) {
        /*
            Method dump skipped, instructions count: 1693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A0B(int):void");
    }

    public void A0C(View view, int i) {
        Rect A01;
        Rect A012;
        5WH layoutParams = view.getLayoutParams();
        View view2 = layoutParams.A09;
        if (view2 != null) {
            A01 = A01();
            A012 = A01();
            try {
                6BO.A01(A01, view2, this);
                5WH r0 = (5WH) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A06(A01, A012, r0, i, measuredWidth, measuredHeight);
                A07(A012, r0, measuredWidth, measuredHeight);
                view.layout(A012.left, A012.top, A012.right, A012.bottom);
                return;
            } finally {
                A05(A01);
                A05(A012);
            }
        }
        if (layoutParams.A05 != -1) {
            throw AnonymousClass001.A0N("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        int i2 = layoutParams.A04;
        if (i2 < 0) {
            5WH layoutParams2 = view.getLayoutParams();
            A01 = A01();
            A01.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            if (this.A02 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                A01.left += this.A02.A00.A0B().A01;
                A01.top += this.A02.A03();
                A01.right -= this.A02.A00.A0B().A02;
                A01.bottom -= this.A02.A02();
            }
            A012 = A01();
            int i3 = layoutParams2.A02;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & ActionId.MISSED_EVENT) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), A01, A012, i);
            view.layout(A012.left, A012.top, A012.right, A012.bottom);
            return;
        }
        5WH layoutParams3 = view.getLayoutParams();
        int i4 = layoutParams3.A02;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & ActionId.MISSED_EVENT;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int A00 = A00(i2) - measuredWidth2;
        int i7 = 0;
        if (i5 == 1) {
            A00 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            A00 += measuredWidth2;
        }
        if (i6 == 16) {
            i7 = 0 + (measuredHeight2 / 2);
        } else if (i6 == 80) {
            i7 = measuredHeight2;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, Math.min(A00, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public void A0D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public boolean A0E(View view, int i, int i2) {
        Rect A01 = A01();
        6BO.A01(A01, view, this);
        try {
            return A01.contains(i, i2);
        } finally {
            A05(A01);
        }
    }

    public void C8h(View view, int[] iArr, int i, int i2, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                5WH layoutParams = childAt.getLayoutParams();
                if ((i3 != 0 ? layoutParams.A0C : layoutParams.A0D) && (behavior = layoutParams.A0A) != null) {
                    int[] iArr2 = this.A0G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int i7 = iArr2[0];
                    i4 = i > 0 ? Math.max(i4, i7) : Math.min(i4, i7);
                    int i8 = iArr2[1];
                    i5 = i2 > 0 ? Math.max(i5, i8) : Math.min(i5, i8);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            A0B(1);
        }
    }

    public void C8i(View view, int i, int i2, int i3, int i4, int i5) {
        C8j(view, this.A0H, i, i2, i3, i4, 0);
    }

    public void C8j(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                5WH layoutParams = childAt.getLayoutParams();
                if ((i5 != 0 ? layoutParams.A0C : layoutParams.A0D) && (behavior = layoutParams.A0A) != null) {
                    int[] iArr2 = this.A0G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int i9 = iArr2[0];
                    i6 = i3 > 0 ? Math.max(i6, i9) : Math.min(i6, i9);
                    int i10 = iArr2[1];
                    i7 = i4 > 0 ? Math.max(i7, i10) : Math.min(i7, i10);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            A0B(1);
        }
    }

    public void C8k(View view, View view2, int i, int i2) {
        Behavior behavior;
        C0Cn c0Cn = this.A0E;
        if (i2 == 1) {
            c0Cn.A00 = i;
        } else {
            c0Cn.A01 = i;
        }
        this.A08 = view2;
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= childCount) {
                return;
            }
            View childAt = getChildAt(i4);
            5WH layoutParams = childAt.getLayoutParams();
            if ((i2 != 0 ? layoutParams.A0C : layoutParams.A0D) && (behavior = layoutParams.A0A) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
            i3 = i4 + 1;
        }
    }

    public boolean CMt(View view, View view2, int i, int i2) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                5WH layoutParams = childAt.getLayoutParams();
                Behavior behavior = layoutParams.A0A;
                if (behavior != null) {
                    z = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z2 |= z;
                } else {
                    z = false;
                }
                if (i2 != 0) {
                    layoutParams.A0C = z;
                } else {
                    layoutParams.A0D = z;
                }
            }
        }
        return z2;
    }

    public void CNm(View view, int i) {
        C0Cn c0Cn = this.A0E;
        if (i == 1) {
            c0Cn.A00 = 0;
        } else {
            c0Cn.A01 = 0;
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= childCount) {
                this.A08 = null;
                return;
            }
            View childAt = getChildAt(i3);
            5WH layoutParams = childAt.getLayoutParams();
            if (i != 0 ? layoutParams.A0C : layoutParams.A0D) {
                Behavior behavior = layoutParams.A0A;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i != 0) {
                    layoutParams.A0C = false;
                } else {
                    layoutParams.A0D = false;
                }
                layoutParams.A0E = false;
            }
            i2 = i3 + 1;
        }
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
            boolean r0 = r0 instanceof X.5WH
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new 5WH(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new 5WH(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof 5WH ? new 5WH((5WH) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new 5WH((ViewGroup.MarginLayoutParams) layoutParams) : new 5WH(layoutParams);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0Cn c0Cn = this.A0E;
        return c0Cn.A01 | c0Cn.A00;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1150113293);
        super.onAttachedToWindow();
        A03();
        if (this.A05) {
            if (this.A01 == null) {
                this.A01 = new C80t(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A01);
        }
        if (this.A02 == null && getFitsSystemWindows()) {
            requestApplyInsets();
        }
        this.A04 = true;
        0FI.A0C(-1230308864, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-2145637674);
        super.onDetachedFromWindow();
        A03();
        if (this.A05 && this.A01 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A01);
        }
        View view = this.A08;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A04 = false;
        0FI.A0C(-1487264345, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        08D r0;
        int A03;
        super.onDraw(canvas);
        if (!this.A03 || (drawable = this.A06) == null || (r0 = this.A02) == null || (A03 = r0.A03()) <= 0) {
            return;
        }
        drawable.setBounds(0, 0, getWidth(), A03);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A03();
        }
        boolean A09 = A09(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A03();
        }
        return A09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int layoutDirection = getLayoutDirection();
        List list = this.A0D;
        int size = list.size();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= size) {
                return;
            }
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((behavior = view.getLayoutParams().A0A) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                A0C(view, layoutDirection);
            }
            i5 = i6 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x04b9, code lost:
    
        if (getFitsSystemWindows() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x054e, code lost:
    
        if (r327 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0551, code lost:
    
        r335 = r0 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x069d, code lost:
    
        r335 = (r0 - r0) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x069a, code lost:
    
        if (r327 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0338, code lost:
    
        throw X.AnonymousClass001.A0L("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v283, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v337, types: [android.view.View] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return false;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                5WH layoutParams = childAt.getLayoutParams();
                if (layoutParams.A0D && (behavior = layoutParams.A0A) != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C8h(view, iArr, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C8i(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C8k(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).A00);
        SparseArray sparseArray = savedState.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = A02(childAt).A0A;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        Parcelable.Creator creator = SavedState.CREATOR;
        ?? absSavedState = new androidx.customview.view.AbsSavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                absSavedState.A00 = sparseArray;
                return absSavedState;
            }
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behavior = childAt.getLayoutParams().A0A;
            if (id != -1 && behavior != null && (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return CMt(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        CNm(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean A09;
        int A05 = 0FI.A05(1710293130);
        int actionMasked = motionEvent.getActionMasked();
        View view = this.A07;
        boolean z = false;
        if (view != null) {
            Behavior behavior = view.getLayoutParams().A0A;
            A09 = behavior != null ? behavior.onTouchEvent(this, this.A07, motionEvent) : false;
        } else {
            A09 = A09(motionEvent, 1);
            if (actionMasked != 0 && A09) {
                z = true;
            }
        }
        if (this.A07 == null || actionMasked == 3) {
            A09 |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A03();
        }
        0FI.A0B(-1448077126, A05);
        return A09;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = view.getLayoutParams().A0A;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.A0A) {
            return;
        }
        if (this.A07 == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                Behavior behavior = childAt.getLayoutParams().A0A;
                if (behavior != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    behavior.onInterceptTouchEvent(this, childAt, motionEvent);
                }
                i = i2 + 1;
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        A03();
        this.A0A = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A04();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A00 = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        drawable.setVisible(z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r302 == r301.A06) goto L6;
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
            if (r0 != 0) goto L16
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A06
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
