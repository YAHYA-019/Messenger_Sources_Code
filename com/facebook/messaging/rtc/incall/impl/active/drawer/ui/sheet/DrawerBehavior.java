package com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet;

import X.0Pz;
import X.1Br;
import X.1Lm;
import X.2Z6;
import X.4YU;
import X.5WH;
import X.5WJ;
import X.5XU;
import X.7zL;
import X.AbJ;
import X.AnonymousClass001;
import X.C01i;
import X.C01s;
import X.DKC;
import X.GOo;
import X.GUz;
import X.GVl;
import X.GqD;
import X.GrQ;
import X.Hsi;
import X.IG6;
import X.IHc;
import X.IYH;
import X.Iwq;
import X.JD7;
import X.JD8;
import X.JOL;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.ActiveDrawerContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: DrawerBehavior.class */
public class DrawerBehavior extends CoordinatorLayout.Behavior {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A05;
    public ValueAnimator A07;
    public 5XU A08;
    public WeakReference A09;
    public WeakReference A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public boolean A0H;
    public final C01s A0J;
    public int A04 = 3;
    public int A06 = 3;
    public final ArrayList A0N = AnonymousClass001.A0s();
    public final Hsi A0L = new Hsi(this, true);
    public final Hsi A0M = new Hsi(this, false);
    public final GqD A0K = new GqD(this);
    public final 5WJ A0I = new GVl(this);

    /* loaded from: DrawerBehavior$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new IHc(1);
        public int A00;
        public boolean A01;
        public boolean A02;
        public final int A03;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A03 = parcel.readInt();
            this.A00 = parcel.readInt();
            this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
            this.A02 = AbJ.A1W(parcel);
        }

        public SavedState(Parcelable parcelable, DrawerBehavior drawerBehavior) {
            super(parcelable);
            this.A03 = drawerBehavior.A04;
            this.A00 = 0;
            this.A01 = drawerBehavior.A0D;
            this.A02 = drawerBehavior.A0F;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A02 ? 1 : 0);
        }
    }

    public DrawerBehavior(Context context, C01s c01s) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A07 = ofFloat;
        ofFloat.setDuration(500L);
        IG6.A00(this.A07, this, 10);
        this.A00 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.A0J = c01s;
    }

    private View A00(View view) {
        View view2;
        GUz gUz;
        JOL jol;
        GUz gUz2;
        if (view.isNestedScrollingEnabled() && !view.canScrollHorizontally(-1) && !view.canScrollHorizontally(1)) {
            if (view instanceof 2Z6) {
                view = ((2Z6) view).A04;
            }
            return view;
        }
        if (view instanceof ViewGroup) {
            GUz gUz3 = (ViewGroup) view;
            if ((gUz3 instanceof JD7) && (jol = (gUz = (JD7) gUz3).A02) != null && (gUz2 = (ViewGroup) gUz.A04.findViewWithTag(Integer.valueOf(jol.getType()))) != null) {
                gUz3 = gUz2;
            }
            int childCount = ((ViewGroup) gUz3).getChildCount();
            for (int i = 0; i < childCount; i++) {
                view2 = A00(((ViewGroup) gUz3).getChildAt(i));
                if (view2 != null) {
                    break;
                }
            }
        }
        view2 = null;
        return view2;
    }

    public static void A01(View view, DrawerBehavior drawerBehavior) {
        int i;
        int i2 = drawerBehavior.A06;
        if (i2 == 3) {
            i = drawerBehavior.A01;
        } else if (i2 == 4) {
            i = drawerBehavior.A02;
        } else if (drawerBehavior.A0D && i2 == 0) {
            i = drawerBehavior.A03;
        } else {
            drawerBehavior.A0J.D0v("DrawerBehavior", 0Pz.A0T("Illegal mState argument ", i2));
            i = drawerBehavior.A03;
        }
        A02(view, drawerBehavior, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0.A0F(r0, r303) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(android.view.View r301, com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior r302, int r303, boolean r304) {
        /*
            r0 = r302
            X.5XU r0 = r0.A08
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lae
            r0 = r301
            int r0 = r0.getLeft()
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L6a
            r0 = r305
            r1 = r306
            r2 = r303
            boolean r0 = r0.A0F(r1, r2)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lae
        L24:
            r0 = 2
            r307 = r0
            r0 = r302
            r1 = r307
            r2 = r304
            r0.A06(r1, r2)
            r0 = r302
            int r0 = r0.A06
            r306 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L56
            r0 = r306
            r1 = 4
            boolean r0 = X.AnonymousClass001.A1Q(r0, r1)
            r306 = r0
            r0 = r302
            boolean r0 = r0.A0E
            r307 = r0
            r0 = r307
            r1 = r306
            if (r0 == r1) goto L56
            r0 = r302
            r1 = r306
            r0.A0E = r1
        L56:
            X.J0h r0 = new X.J0h
            r308 = r0
            r0 = r308
            r1 = r301
            r2 = r302
            r3 = r304
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r308
            r0.postOnAnimation(r1)
            return
        L6a:
            r0 = r305
            r1 = r301
            r0.A07 = r1
            r0 = r305
            r1 = -1
            r0.A02 = r1
            r0 = 0
            r308 = r0
            r0 = r305
            r1 = r306
            r2 = r303
            r3 = 0
            r4 = 0
            boolean r0 = X.5XU.A0A(r0, r1, r2, r3, r4)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L24
            r0 = r305
            int r0 = r0.A03
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lae
            r0 = r305
            android.view.View r0 = r0.A07
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lae
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r305
            r1 = 0
            r0.A07 = r1
        Lae:
            r0 = r302
            int r0 = r0.A06
            r307 = r0
            r0 = r302
            r1 = r307
            r2 = r304
            r0.A06(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior.A02(android.view.View, com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior, int, boolean):void");
    }

    public static boolean A03(View view, DrawerBehavior drawerBehavior, float f) {
        boolean z = true;
        if (!drawerBehavior.A0F) {
            if (view.getTop() < drawerBehavior.A01) {
                return false;
            }
            if (DKC.A01(view.getTop() + (f * 0.1f), drawerBehavior.A01) / 0.0f <= 0.5f) {
                z = false;
            }
        }
        return z;
    }

    public void A04(int i) {
        View A0G;
        float f;
        int i2;
        int i3;
        WeakReference weakReference = this.A0A;
        if (weakReference == null || (A0G = DKC.A0G(weakReference)) == null) {
            return;
        }
        ArrayList arrayList = this.A0N;
        if (arrayList.isEmpty()) {
            return;
        }
        int i4 = this.A01;
        if (i > i4 || i4 == (i3 = this.A02)) {
            f = i4 - i;
            i2 = this.A03 - i4;
        } else {
            f = i4 - i;
            i2 = i4 - i3;
        }
        float f2 = f / i2;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= arrayList.size()) {
                return;
            }
            IYH iyh = (JD8) arrayList.get(i6);
            switch (iyh.A00) {
                case 0:
                    break;
                case 4:
                    ActiveDrawerContainer activeDrawerContainer = (ActiveDrawerContainer) iyh.A01;
                    Class[] clsArr = CoordinatorLayout.A0L;
                    C01i c01i = activeDrawerContainer.A0Q;
                    ((GrQ) c01i.getValue()).A0f(f2);
                    1Lm.A05(4YU.A08(activeDrawerContainer), activeDrawerContainer.A0E, 99475);
                    GrQ grQ = (GrQ) c01i.getValue();
                    A0G.getHeight();
                    1Br.A0B(grQ.A03);
                    break;
                default:
                    ActiveDrawerContainer activeDrawerContainer2 = (ActiveDrawerContainer) iyh.A01;
                    Class[] clsArr2 = CoordinatorLayout.A0L;
                    GOo.A0S(activeDrawerContainer2).A0f(f2);
                    break;
            }
            i5 = i6 + 1;
        }
    }

    public void A05(int i) {
        if (i != this.A04) {
            WeakReference weakReference = this.A0A;
            if (weakReference == null) {
                if (i == 3 || i == 4 || (this.A0D && i == 0)) {
                    this.A04 = i;
                    return;
                }
                return;
            }
            this.A06 = i;
            View A0G = DKC.A0G(weakReference);
            if (A0G != null) {
                ViewParent parent = A0G.getParent();
                if (parent != null && parent.isLayoutRequested() && A0G.isAttachedToWindow()) {
                    A0G.post(new Iwq(A0G, this));
                } else {
                    A01(A0G, this);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0500, code lost:
    
        if (r302 != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0313, code lost:
    
        if (r316 != null) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00e1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0191 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(int r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior.A06(int, boolean):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(5WH r302) {
        this.A0A = null;
        this.A08 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        this.A0A = null;
        this.A08 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.A0L.A01(coordinatorLayout, view, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.A0A == null) {
            this.A0A = 7zL.A14(view);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.A08 == null) {
            this.A08 = new 5XU(coordinatorLayout.getContext(), coordinatorLayout, this.A0I);
        }
        int top = view.getTop();
        coordinatorLayout.A0C(view, i);
        int height = coordinatorLayout.getHeight();
        this.A03 = height;
        int max = Math.max(0, height - view.getHeight());
        this.A02 = max;
        int i2 = this.A03;
        int max2 = Math.max(i2, max);
        this.A01 = max2;
        int i3 = this.A04;
        if (i3 != 4) {
            if (this.A0D && i3 == 0) {
                max = i2;
            } else {
                if (i3 != 3) {
                    if (i3 == 1 || i3 == 2) {
                        max = top - view.getTop();
                    }
                    this.A09 = 7zL.A14(A00(view));
                    return true;
                }
                max = max2;
            }
        }
        view.offsetTopAndBottom(max);
        this.A09 = 7zL.A14(A00(view));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.A09;
        boolean z = false;
        if (weakReference != null && view2 == weakReference.get() && this.A04 != 4) {
            z = true;
        }
        return z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference weakReference = this.A09;
            if (view2 == (weakReference != null ? weakReference.get() : null)) {
                int top = view.getTop();
                int i5 = top - i2;
                if (i2 > 0) {
                    int i6 = this.A02;
                    if (i5 < i6) {
                        int i7 = top - i6;
                        iArr[1] = i7;
                        view.offsetTopAndBottom(-i7);
                        i4 = 4;
                        A06(i4, false);
                    }
                    iArr[1] = i2;
                    view.offsetTopAndBottom(-i2);
                    A06(1, false);
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    int i8 = this.A01;
                    if (i5 > i8 && !this.A0D) {
                        int i9 = top - i8;
                        iArr[1] = i9;
                        view.offsetTopAndBottom(-i9);
                        i4 = 3;
                        A06(i4, false);
                    }
                    iArr[1] = i2;
                    view.offsetTopAndBottom(-i2);
                    A06(1, false);
                }
                A04(view.getTop());
                this.A0G = i2;
                this.A0H = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        ((AbsSavedState) savedState).A00.getClass();
        int i = savedState.A03;
        if (i == 1 || i == 2) {
            this.A04 = 3;
        } else {
            this.A04 = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (absSavedState != null) {
            return new SavedState(absSavedState, this);
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        boolean z = false;
        this.A0G = 0;
        this.A0H = false;
        if ((i & 2) != 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
    
        if (r0 < X.GOn.A05(r0, r313)) goto L29;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.View r304, int r305) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.A0L.A00(view, motionEvent);
    }
}
