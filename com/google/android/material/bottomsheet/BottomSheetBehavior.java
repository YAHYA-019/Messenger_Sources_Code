package com.google.android.material.bottomsheet;

import X.0K6;
import X.0Oe;
import X.0Pz;
import X.1BK;
import X.1BM;
import X.4YV;
import X.5WH;
import X.5WJ;
import X.5XU;
import X.6Ld;
import X.6Le;
import X.6Lg;
import X.AbJ;
import X.AnonymousClass001;
import X.C0Ad;
import X.C3010Jg9;
import X.DKB;
import X.DKC;
import X.JQx;
import X.JQy;
import X.KTH;
import X.L6H;
import X.LF7;
import X.LGb;
import X.LQR;
import X.LqA;
import X.Lql;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.dextricks.Constants;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: BottomSheetBehavior.class */
public class BottomSheetBehavior extends CoordinatorLayout.Behavior {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public ValueAnimator A0H;
    public VelocityTracker A0I;
    public 5XU A0J;
    public 6Le A0K;
    public WeakReference A0L;
    public WeakReference A0M;
    public Map A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public Lql A0e;
    public 6Lg A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final ArrayList A0l;
    public final 5WJ A0m;

    /* loaded from: BottomSheetBehavior$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new LGb(2);
        public int A00;
        public boolean A01;
        public boolean A02;
        public boolean A03;
        public final int A04;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A04 = parcel.readInt();
            this.A00 = parcel.readInt();
            this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
            this.A02 = 1BM.A07(parcel);
            this.A03 = AbJ.A1W(parcel);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.A04 = bottomSheetBehavior.A0G;
            this.A00 = bottomSheetBehavior.A0E;
            this.A01 = bottomSheetBehavior.A0P;
            this.A02 = bottomSheetBehavior.A0R;
            this.A03 = bottomSheetBehavior.A0W;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeInt(this.A03 ? 1 : 0);
        }
    }

    public BottomSheetBehavior() {
        this.A0F = 0;
        this.A0P = true;
        this.A0B = -1;
        this.A0e = null;
        this.A01 = 0.5f;
        this.A00 = -1.0f;
        this.A0O = true;
        this.A0G = 4;
        this.A0l = AnonymousClass001.A0s();
        this.A0Z = -1;
        this.A0m = new C3010Jg9(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        this.A0F = 0;
        this.A0P = true;
        this.A0B = -1;
        this.A0e = null;
        this.A01 = 0.5f;
        this.A00 = -1.0f;
        this.A0O = true;
        this.A0G = 4;
        this.A0l = AnonymousClass001.A0s();
        this.A0Z = -1;
        this.A0m = new C3010Jg9(this);
        this.A0c = context.getResources().getDimensionPixelSize(2132279303);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A02);
        this.A0k = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            A05(context, L6H.A00(context, obtainStyledAttributes, 2), attributeSet, hasValue);
        } else {
            A05(context, null, attributeSet, false);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0H = ofFloat;
        ofFloat.setDuration(500L);
        LF7.A00(this.A0H, this, 18);
        this.A00 = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue == null || peekValue.data != -1) {
            A0D(obtainStyledAttributes.getDimensionPixelSize(8, -1), false);
        } else {
            A0D(-1, false);
        }
        A0I(obtainStyledAttributes.getBoolean(7, false));
        this.A0Q = obtainStyledAttributes.getBoolean(11, false);
        A0H(obtainStyledAttributes.getBoolean(5, true));
        this.A0W = obtainStyledAttributes.getBoolean(10, false);
        this.A0O = obtainStyledAttributes.getBoolean(3, true);
        this.A0F = obtainStyledAttributes.getInt(9, 0);
        A09(obtainStyledAttributes.getFloat(6, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
        int dimensionPixelOffset = (peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(4, 0) : peekValue2.data;
        if (dimensionPixelOffset < 0) {
            throw AnonymousClass001.A0L(DKB.A00(481));
        }
        this.A05 = dimensionPixelOffset;
        this.A0S = obtainStyledAttributes.getBoolean(12, false);
        this.A0T = obtainStyledAttributes.getBoolean(13, false);
        this.A0U = obtainStyledAttributes.getBoolean(14, false);
        this.A0j = obtainStyledAttributes.getBoolean(15, true);
        obtainStyledAttributes.recycle();
        this.A02 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int A00() {
        int i;
        int i2;
        if (this.A0V) {
            i = Math.min(JQx.A0C(this.A0C, (this.A0D * 9) / 16, this.A0d), this.A0Y);
        } else {
            if (!this.A0Q && !this.A0S && (i2 = this.A07) > 0) {
                return JQx.A0B(i2, this.A0c, this.A0E);
            }
            i = this.A0E;
        }
        return i + this.A09;
    }

    private View A01(View view) {
        if (!view.isNestedScrollingEnabled()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View A01 = A01(viewGroup.getChildAt(i));
                    if (A01 != null) {
                        return A01;
                    }
                }
            }
            view = null;
        }
        return view;
    }

    public static BottomSheetBehavior A02(View view) {
        5WH layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof 5WH)) {
            throw AnonymousClass001.A0L("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = layoutParams.A0A;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw AnonymousClass001.A0L("The view is not associated with BottomSheetBehavior");
    }

    private void A03() {
        View A0G;
        int i;
        0Oe r313;
        int i2;
        WeakReference weakReference = this.A0M;
        if (weakReference == null || (A0G = DKC.A0G(weakReference)) == null) {
            return;
        }
        C0Ad.A09(A0G, Constants.LOAD_RESULT_WITH_VDEX_ODEX);
        C0Ad.A09(A0G, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        C0Ad.A09(A0G, 1048576);
        int i3 = this.A0Z;
        if (i3 != -1) {
            C0Ad.A09(A0G, i3);
        }
        if (!this.A0P && this.A0G != 6) {
            String string = A0G.getResources().getString(2131953488);
            LQR lqr = new LQR(this, 6);
            AbstractList abstractList = (AbstractList) A0G.getTag(2131367839);
            if (abstractList == null) {
                abstractList = AnonymousClass001.A0s();
                A0G.setTag(2131367839, abstractList);
            }
            int i4 = 0;
            while (true) {
                if (i4 >= abstractList.size()) {
                    int i5 = 0;
                    i2 = -1;
                    while (true) {
                        int[] iArr = C0Ad.A04;
                        if (i5 >= 32 || i2 != -1) {
                            break;
                        }
                        int i6 = iArr[i5];
                        boolean z = true;
                        for (int i7 = 0; i7 < abstractList.size(); i7++) {
                            z &= 4YV.A1W(((AccessibilityNodeInfo.AccessibilityAction) ((0Oe) abstractList.get(i7)).A03).getId(), i6);
                        }
                        if (z) {
                            i2 = i6;
                        }
                        i5++;
                    }
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((0Oe) abstractList.get(i4)).A03).getLabel())) {
                        i2 = ((AccessibilityNodeInfo.AccessibilityAction) ((0Oe) abstractList.get(i4)).A03).getId();
                        break;
                    }
                    i4++;
                }
            }
            if (i2 != -1) {
                C0Ad.A0D(A0G, new 0Oe(lqr, string, (Class) null, (Object) null, i2));
            }
            this.A0Z = i2;
        }
        if (this.A0R && this.A0G != 5) {
            C0Ad.A0E(A0G, 0Oe.A0D, new LQR(this, 5), null);
        }
        int i8 = this.A0G;
        if (i8 == 3) {
            i = this.A0P ? 4 : 6;
            r313 = 0Oe.A09;
        } else {
            if (i8 != 4) {
                if (i8 == 6) {
                    C0Ad.A0E(A0G, 0Oe.A09, new LQR(this, 4), null);
                    C0Ad.A0E(A0G, 0Oe.A0H, new LQR(this, 3), null);
                    return;
                }
                return;
            }
            i = this.A0P ? 3 : 6;
            r313 = 0Oe.A0H;
        }
        C0Ad.A0E(A0G, r313, new LQR(this, i), null);
    }

    private void A04(int i) {
        boolean A1Q;
        ValueAnimator valueAnimator;
        if (i == 2 || this.A0h == (A1Q = AnonymousClass001.A1Q(i, 3))) {
            return;
        }
        this.A0h = A1Q;
        if (this.A0K == null || (valueAnimator = this.A0H) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.A0H.reverse();
            return;
        }
        float f = 1.0f;
        if (A1Q) {
            f = 0.0f;
        }
        this.A0H.setFloatValues(1.0f - f, f);
        0K6.A00(this.A0H);
    }

    private void A05(Context context, ColorStateList colorStateList, AttributeSet attributeSet, boolean z) {
        if (this.A0k) {
            6Lg r0 = new 6Lg(6Lg.A01(context, attributeSet, 2130968840, 2132608538));
            this.A0f = r0;
            6Le r02 = new 6Le(r0);
            this.A0K = r02;
            r02.A0G(context);
            if (z && colorStateList != null) {
                this.A0K.A0H(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.A0K.setTint(typedValue.data);
        }
    }

    public static void A06(BottomSheetBehavior bottomSheetBehavior) {
        int A00 = bottomSheetBehavior.A00();
        boolean z = bottomSheetBehavior.A0P;
        int i = bottomSheetBehavior.A0C - A00;
        if (z) {
            bottomSheetBehavior.A04 = Math.max(i, bottomSheetBehavior.A06);
        } else {
            bottomSheetBehavior.A04 = i;
        }
    }

    public static void A07(BottomSheetBehavior bottomSheetBehavior, int i) {
        View A0G = DKC.A0G(bottomSheetBehavior.A0M);
        if (A0G != null) {
            ViewParent parent = A0G.getParent();
            if (parent != null && parent.isLayoutRequested() && A0G.isAttachedToWindow()) {
                A0G.post(new LqA(A0G, bottomSheetBehavior, i));
            } else {
                bottomSheetBehavior.A0E(A0G, i);
            }
        }
    }

    public int A08() {
        if (this.A0P) {
            return this.A06;
        }
        return Math.max(this.A05, this.A0j ? 0 : this.A0A);
    }

    public void A09(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw AnonymousClass001.A0L("ratio must be a float value between 0 and 1");
        }
        this.A01 = f;
        if (this.A0M != null) {
            this.A08 = (int) (this.A0C * (1.0f - f));
        }
    }

    public void A0A(int i) {
        float f;
        int i2;
        int A08;
        View A0G = DKC.A0G(this.A0M);
        if (A0G == null) {
            return;
        }
        ArrayList arrayList = this.A0l;
        if (arrayList.isEmpty()) {
            return;
        }
        int i3 = this.A04;
        if (i > i3 || i3 == (A08 = A08())) {
            f = i3 - i;
            i2 = this.A0C - i3;
        } else {
            f = i3 - i;
            i2 = i3 - A08;
        }
        float f2 = f / i2;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((KTH) arrayList.get(i5)).A01(A0G, f2);
            i4 = i5 + 1;
        }
    }

    public void A0B(int i) {
        if (i != this.A0G) {
            if (this.A0M != null) {
                A07(this, i);
                return;
            }
            if (i == 4 || i == 3 || i == 6 || (this.A0R && i == 5)) {
                this.A0G = i;
            }
        }
    }

    public void A0C(int i) {
        View A0G;
        WeakReference weakReference;
        if (this.A0G == i) {
            return;
        }
        this.A0G = i;
        WeakReference weakReference2 = this.A0M;
        if (weakReference2 == null || (A0G = DKC.A0G(weakReference2)) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            WeakReference weakReference3 = this.A0M;
            if (weakReference3 != null) {
                ViewParent parent = DKC.A0G(weakReference3).getParent();
                if (parent instanceof CoordinatorLayout) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int childCount = viewGroup.getChildCount();
                    if (this.A0N == null) {
                        this.A0N = new HashMap(childCount);
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt != this.A0M.get()) {
                                1BK.A1P(childAt, this.A0N, childAt.getImportantForAccessibility());
                            }
                        }
                    }
                }
            }
        } else if ((i == 6 || i == 5 || i == 4) && (weakReference = this.A0M) != null) {
            ViewParent parent2 = DKC.A0G(weakReference).getParent();
            if (parent2 instanceof CoordinatorLayout) {
                ViewGroup viewGroup2 = (ViewGroup) parent2;
                int childCount2 = viewGroup2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    viewGroup2.getChildAt(i4);
                    this.A0M.get();
                }
                this.A0N = null;
            }
        }
        A04(i);
        while (true) {
            ArrayList arrayList = this.A0l;
            if (i2 >= arrayList.size()) {
                A03();
                return;
            } else {
                ((KTH) arrayList.get(i2)).A02(A0G, i);
                i2++;
            }
        }
    }

    public final void A0D(int i, boolean z) {
        View A0G;
        boolean z2 = this.A0V;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.A0V = true;
            }
        } else {
            if (!z2 && this.A0E == i) {
                return;
            }
            this.A0V = false;
            this.A0E = Math.max(0, i);
        }
        WeakReference weakReference = this.A0M;
        if (weakReference != null) {
            A06(this);
            int i2 = this.A0G;
            if (i2 != 4 || (A0G = DKC.A0G(weakReference)) == null) {
                return;
            }
            if (z) {
                A07(this, i2);
            } else {
                A0G.requestLayout();
            }
        }
    }

    public void A0E(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.A04;
        } else if (i == 6) {
            int i3 = this.A08;
            if (this.A0P) {
                i2 = this.A06;
                if (i3 <= i2) {
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = A08();
        } else {
            if (!this.A0R || i != 5) {
                throw 0Pz.A04("Illegal state argument: ", i);
            }
            i2 = this.A0C;
        }
        A0F(view, i, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0.A0F(r0, r304) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(android.view.View r302, int r303, int r304, boolean r305) {
        /*
            r301 = this;
            r0 = r301
            X.5XU r0 = r0.A0J
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lbe
            r0 = r302
            int r0 = r0.getLeft()
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L7a
            r0 = r306
            r1 = r307
            r2 = r304
            boolean r0 = r0.A0F(r1, r2)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lbe
        L25:
            r0 = 2
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A0C(r1)
            r0 = r301
            r1 = r303
            r0.A04(r1)
            r0 = r301
            X.Lql r0 = r0.A0e
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L51
            X.Lql r0 = new X.Lql
            r309 = r0
            r0 = r309
            r1 = r302
            r2 = r301
            r3 = r303
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r309
            r0.A0e = r1
        L51:
            r0 = r309
            boolean r0 = r0.A01
            r308 = r0
            r0 = r309
            r1 = r303
            r0.A00 = r1
            r0 = r308
            if (r0 != 0) goto L79
            r0 = r302
            r1 = r309
            r0.postOnAnimation(r1)
            r0 = r301
            X.Lql r0 = r0.A0e
            r309 = r0
            r0 = 1
            r308 = r0
            r0 = r309
            r1 = r308
            r0.A01 = r1
        L79:
            return
        L7a:
            r0 = r306
            r1 = r302
            r0.A07 = r1
            r0 = r306
            r1 = -1
            r0.A02 = r1
            r0 = 0
            r310 = r0
            r0 = r306
            r1 = r307
            r2 = r304
            r3 = 0
            r4 = 0
            boolean r0 = X.5XU.A0A(r0, r1, r2, r3, r4)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L25
            r0 = r306
            int r0 = r0.A03
            r308 = r0
            r0 = r308
            if (r0 != 0) goto Lbe
            r0 = r306
            android.view.View r0 = r0.A07
            r310 = r0
            r0 = r310
            if (r0 == 0) goto Lbe
            r0 = 0
            r308 = r0
            r0 = 0
            r310 = r0
            r0 = r306
            r1 = 0
            r0.A07 = r1
        Lbe:
            r0 = r301
            r1 = r303
            r0.A0C(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0F(android.view.View, int, int, boolean):void");
    }

    public void A0G(KTH kth) {
        JQy.A1P(kth, this.A0l);
    }

    public void A0H(boolean z) {
        if (this.A0P != z) {
            this.A0P = z;
            if (this.A0M != null) {
                A06(this);
            }
            A0C((z && this.A0G == 6) ? 3 : this.A0G);
            A03();
        }
    }

    public void A0I(boolean z) {
        if (this.A0R != z) {
            this.A0R = z;
            if (!z && this.A0G == 5) {
                A0B(4);
            }
            A03();
        }
    }

    public boolean A0J(View view, float f) {
        boolean z = true;
        if (!this.A0W) {
            if (view.getTop() < this.A04) {
                return false;
            }
            if (DKC.A01(view.getTop() + (f * 0.1f), this.A04) / A00() <= 0.5f) {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(5WH r302) {
        this.A0M = null;
        this.A0J = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        this.A0M = null;
        this.A0J = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        if (r302.A0E(r303, r0, r301.A0a) != false) goto L45;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.MotionEvent r304) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r301.A0V != false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object, X.KSn] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, int r304) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.A0L;
        boolean z = false;
        if (weakReference != null && view2 == weakReference.get() && this.A0G != 3) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.View r304, int r305, int r306, int[] r307, int r308) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.A0F;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0E = savedState.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0P = savedState.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0R = savedState.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0W = savedState.A03;
            }
        }
        int i2 = savedState.A04;
        if (i2 == 1 || i2 == 2) {
            this.A0G = 4;
        } else {
            this.A0G = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(android.view.AbsSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        boolean z = false;
        this.A0b = 0;
        this.A0i = false;
        if ((i & 2) != 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0189, code lost:
    
        if (r0 > r310) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x018c, code lost:
    
        r308 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01b6, code lost:
    
        r310 = A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r0 >= X.GOn.A05(r0, r315)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        r310 = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0173, code lost:
    
        if (r306 < r307) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b3, code lost:
    
        if (r0 < X.GOn.A05(r0, r301.A04)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.View r304, int r305) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0G == 1 && actionMasked == 0) {
            return true;
        }
        5XU r0 = this.A0J;
        if (r0 != null) {
            r0.A0C(motionEvent);
        }
        if (actionMasked == 0) {
            float f = 0.0f / 0.0f;
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A0I;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0I = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0I;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0I = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A0J != null && actionMasked == 2 && !this.A0g) {
            float A01 = DKC.A01(this.A0a, motionEvent.getY());
            5XU r02 = this.A0J;
            if (A01 > r02.A06) {
                r02.A0D(view, JQx.A0F(motionEvent));
            }
        }
        return !this.A0g;
    }
}
