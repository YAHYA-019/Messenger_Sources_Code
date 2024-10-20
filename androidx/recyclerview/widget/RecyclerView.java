package androidx.recyclerview.widget;

import X.0Cm;
import X.0Co;
import X.0Cp;
import X.0FI;
import X.0Mo;
import X.0QO;
import X.0T9;
import X.11T;
import X.1BK;
import X.1BL;
import X.2N0;
import X.2N2;
import X.2N3;
import X.2N7;
import X.2NB;
import X.2ND;
import X.2NI;
import X.2NK;
import X.2NO;
import X.2NQ;
import X.2NS;
import X.2NV;
import X.2NY;
import X.2Nd;
import X.2Ni;
import X.2Nv;
import X.2O4;
import X.2Wn;
import X.2XA;
import X.2Xd;
import X.2Z2;
import X.2iL;
import X.2kG;
import X.2lJ;
import X.2mW;
import X.3vZ;
import X.3wY;
import X.5Nm;
import X.5OJ;
import X.AbstractC02843wc;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00p;
import X.C05394do;
import X.C2lb;
import X.C2lg;
import X.C2lj;
import X.C3lp;
import X.MBr;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: RecyclerView.class */
public class RecyclerView extends ViewGroup implements 0Cm, 0Cp {
    public static final Interpolator A1D;
    public static final 2N2 A1E;
    public static final Class[] A1F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public EdgeEffect A07;
    public 2NY A08;
    public 2Nd A09;
    public 2NO A0A;
    public 2Wn A0B;
    public 2Xd A0C;
    public 2N3 A0D;
    public 2NI A0E;
    public 2XA A0F;
    public 3wY A0G;
    public 2Nv A0H;
    public 2O4 A0I;
    public SavedState A0J;
    public 2Ni A0K;
    public Runnable A0L;
    public List A0M;
    public List A0N;
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
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public float A0b;
    public float A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public VelocityTracker A0m;
    public 0Co A0n;
    public 2mW A0o;
    public 2NS A0p;
    public boolean A0q;
    public boolean A0r;
    public final float A0s;
    public final int A0t;
    public final Rect A0u;
    public final Rect A0v;
    public final RectF A0w;
    public final AccessibilityManager A0x;
    public final 2NB A0y;
    public final 2N7 A0z;
    public final 2NV A10;
    public final 2ND A11;
    public final Runnable A12;
    public final ArrayList A13;
    public final ArrayList A14;
    public final List A15;
    public final List A16;
    public final int[] A17;
    public final int[] A18;
    public final int A19;
    public final int[] A1A;
    public final int[] A1B;
    public final 2NQ mState;
    public final 2NK mViewFlinger;
    public static final int[] A1G = {R.attr.nestedScrollingEnabled};
    public static final float A1C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* loaded from: RecyclerView$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new 3vZ();
        public Parcelable A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.2N2] */
    static {
        Class cls = Integer.TYPE;
        A1F = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1D = new 2N0();
        A1E = new Object();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971475);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:31|(1:33)(24:94|(1:96)|35|36|37|(2:39|40)(1:78)|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58)|34|35|36|37|(0)(0)|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x053c, code lost:
    
        r314 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0546, code lost:
    
        r327 = r0.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x056e, code lost:
    
        r330 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0572, code lost:
    
        r330.initCause(r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x05a1, code lost:
    
        throw new java.lang.IllegalStateException(X.0Pz.A0j(r303.getPositionDescription(), ": Error creating LayoutManager ", r318), r330);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04cc A[Catch: ClassCastException -> 0x05a2, IllegalAccessException -> 0x05c6, InstantiationException -> 0x05ea, InvocationTargetException -> 0x060d, ClassNotFoundException -> 0x0630, TRY_ENTER, TRY_LEAVE, TryCatch #4 {ClassCastException -> 0x05a2, ClassNotFoundException -> 0x0630, IllegalAccessException -> 0x05c6, InstantiationException -> 0x05ea, InvocationTargetException -> 0x060d, blocks: (B:36:0x04c0, B:39:0x04cc, B:40:0x04d3, B:42:0x04dd, B:44:0x04eb, B:47:0x0505, B:49:0x050c, B:50:0x0513, B:51:0x051a, B:52:0x0520, B:54:0x054f, B:55:0x0556, B:56:0x055d, B:58:0x0566, B:62:0x053e, B:64:0x0546, B:68:0x0572, B:70:0x057a, B:72:0x058a, B:73:0x0591, B:75:0x059a, B:77:0x05a1, B:78:0x04f5), top: B:35:0x04c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04f5 A[Catch: ClassCastException -> 0x05a2, IllegalAccessException -> 0x05c6, InstantiationException -> 0x05ea, InvocationTargetException -> 0x060d, ClassNotFoundException -> 0x0630, TRY_ENTER, TRY_LEAVE, TryCatch #4 {ClassCastException -> 0x05a2, ClassNotFoundException -> 0x0630, IllegalAccessException -> 0x05c6, InstantiationException -> 0x05ea, InvocationTargetException -> 0x060d, blocks: (B:36:0x04c0, B:39:0x04cc, B:40:0x04d3, B:42:0x04dd, B:44:0x04eb, B:47:0x0505, B:49:0x050c, B:50:0x0513, B:51:0x051a, B:52:0x0520, B:54:0x054f, B:55:0x0556, B:56:0x055d, B:58:0x0566, B:62:0x053e, B:64:0x0546, B:68:0x0572, B:70:0x057a, B:72:0x058a, B:73:0x0591, B:75:0x059a, B:77:0x05a1, B:78:0x04f5), top: B:35:0x04c0 }] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.2NO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int A03(int i, float f) {
        float A01;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect3 = this.A05;
        float f2 = 0.0f;
        if (edgeEffect3 == null || 5OJ.A00(edgeEffect3) == 0.0f) {
            EdgeEffect edgeEffect4 = this.A06;
            if (edgeEffect4 != null && 5OJ.A00(edgeEffect4) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    edgeEffect2 = this.A06;
                    edgeEffect2.onRelease();
                } else {
                    A01 = 5OJ.A01(this.A06, width, height);
                    if (5OJ.A00(this.A06) == 0.0f) {
                        edgeEffect = this.A06;
                        edgeEffect.onRelease();
                    }
                    f2 = A01;
                }
            }
            return Math.round(f2 * getWidth());
        }
        float f3 = 0.0f / 0.0f;
        if (canScrollHorizontally(-1)) {
            edgeEffect2 = this.A05;
            edgeEffect2.onRelease();
        } else {
            A01 = -5OJ.A01(this.A05, -width, 1.0f - height);
            if (5OJ.A00(this.A05) == 0.0f) {
                edgeEffect = this.A05;
                edgeEffect.onRelease();
            }
            f2 = A01;
        }
        invalidate();
        return Math.round(f2 * getWidth());
    }

    private int A04(int i, float f) {
        float A01;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect3 = this.A07;
        float f2 = 0.0f;
        if (edgeEffect3 == null || 5OJ.A00(edgeEffect3) == 0.0f) {
            EdgeEffect edgeEffect4 = this.A04;
            if (edgeEffect4 != null && 5OJ.A00(edgeEffect4) != 0.0f) {
                if (canScrollVertically(1)) {
                    edgeEffect2 = this.A04;
                    edgeEffect2.onRelease();
                } else {
                    A01 = 5OJ.A01(this.A04, height, 1.0f - width);
                    if (5OJ.A00(this.A04) == 0.0f) {
                        edgeEffect = this.A04;
                        edgeEffect.onRelease();
                    }
                    f2 = A01;
                }
            }
            return Math.round(f2 * getHeight());
        }
        float f3 = 0.0f / 0.0f;
        if (canScrollVertically(-1)) {
            edgeEffect2 = this.A07;
            edgeEffect2.onRelease();
        } else {
            A01 = -5OJ.A01(this.A07, -height, width);
            if (5OJ.A00(this.A07) == 0.0f) {
                edgeEffect = this.A07;
                edgeEffect.onRelease();
            }
            f2 = A01;
        }
        invalidate();
        return Math.round(f2 * getHeight());
    }

    public static int A05(View view) {
        C2lb A09 = A09(view);
        if (A09 != null) {
            return A09.A02();
        }
        return -1;
    }

    public static int A06(View view) {
        C2lb A09 = A09(view);
        if (A09 == null) {
            return -1;
        }
        int i = A09.A05;
        if (i == -1) {
            i = A09.A04;
        }
        return i;
    }

    public static int A07(EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i, int i2) {
        int round;
        if (i > 0) {
            if (edgeEffect != null && 5OJ.A00(edgeEffect) != 0.0f) {
                round = Math.round(((-i2) / 4.0f) * 5OJ.A01(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
                if (round != i) {
                    edgeEffect.finish();
                }
                i -= round;
            }
        } else if (i < 0 && edgeEffect2 != null && 5OJ.A00(edgeEffect2) != 0.0f) {
            float f = i2;
            round = Math.round((f / 4.0f) * 5OJ.A01(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (round != i) {
                edgeEffect2.finish();
            }
            i -= round;
        }
        return i;
    }

    public static 0Co A08(RecyclerView recyclerView) {
        0Co r302 = recyclerView.A0n;
        if (r302 == null) {
            r302 = new 0Co(recyclerView);
            recyclerView.A0n = r302;
        }
        return r302;
    }

    public static C2lb A09(View view) {
        if (view == null) {
            return null;
        }
        return ((C2lg) view.getLayoutParams()).mViewHolder;
    }

    public static RecyclerView A0A(View view) {
        RecyclerView recyclerView = null;
        if (view instanceof ViewGroup) {
            if (!(view instanceof RecyclerView)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= childCount) {
                        break;
                    }
                    RecyclerView A0A = A0A(viewGroup.getChildAt(i2));
                    if (A0A != null) {
                        return A0A;
                    }
                    i = i2 + 1;
                }
            } else {
                recyclerView = (RecyclerView) view;
            }
        }
        return recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x08a2, code lost:
    
        if (r301.A09.A04.contains(getFocusedChild()) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0909, code lost:
    
        if (r305.hasFocusable() != false) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05f8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03bc  */
    /* JADX WARN: Type inference failed for: r0v415, types: [X.4do, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0B() {
        /*
            Method dump skipped, instructions count: 2533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0B():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v191, types: [X.4do, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v269, types: [X.4do, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r314v12 */
    /* JADX WARN: Type inference failed for: r314v13 */
    /* JADX WARN: Type inference failed for: r314v9 */
    private void A0C() {
        2NQ r310;
        int i;
        C2lj c2lj;
        View focusedChild;
        View A0h;
        C2lb A0l;
        this.mState.A01(1);
        if (A0d() == 2) {
            OverScroller overScroller = this.mViewFlinger.A01;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        this.mState.A09 = false;
        A0U(this);
        2ND r0 = this.A11;
        0QO r02 = r0.A01;
        r02.clear();
        C00p c00p = r0.A00;
        c00p.A07();
        this.A01++;
        A0F();
        if (this.A0a && hasFocus() && this.A0C != null && (focusedChild = getFocusedChild()) != null && (A0h = A0h(focusedChild)) != null && (A0l = A0l(A0h)) != null) {
            r310 = this.mState;
            r310.A07 = this.A0C.A00 ? A0l.A07 : -1;
            r310.A01 = this.A0Q ? -1 : A0l.A08() ? A0l.A02 : A0l.A02();
            View view = A0l.A0I;
            loop0: while (true) {
                i = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
        } else {
            r310 = this.mState;
            r310.A07 = -1;
            i = -1;
            r310.A01 = -1;
        }
        r310.A02 = i;
        2NQ r03 = this.mState;
        r03.A0D = r03.A0B && this.A0W;
        this.A0W = false;
        this.A0V = false;
        r03.A08 = r03.A0A;
        r03.A03 = this.A0C.getItemCount();
        A0Y(this.A17);
        if (this.mState.A0B) {
            2Nd r04 = this.A09;
            int A03 = r04.A03();
            for (int i2 = 0; i2 < A03; i2++) {
                C2lb A09 = A09(r04.A06(i2));
                if (!A09.A09() && ((A09.A00 & 4) == 0 || this.A0C.A00)) {
                    int i3 = A09.A00;
                    int i4 = i3 & 14;
                    if ((i3 & 4) == 0 && (i4 & 4) == 0) {
                        A09.A02();
                    }
                    A09.A04();
                    ?? obj = new Object();
                    obj.A00(A09);
                    r0.A01((C05394do) obj, A09);
                    if (this.mState.A0D && (A09.A00 & 2) != 0 && !A09.A08() && !A09.A09() && (A09.A00 & 4) == 0) {
                        c00p.A0C(this.A0C.A00 ? A09.A07 : A09.A04, A09);
                    }
                }
            }
        }
        if (this.mState.A0A) {
            2Nd r05 = this.A09;
            int A04 = r05.A04();
            for (int i5 = 0; i5 < A04; i5++) {
                C2lb A092 = A09(r05.A07(i5));
                if (!A092.A09() && A092.A02 == -1) {
                    A092.A02 = A092.A04;
                }
            }
            2NQ r06 = this.mState;
            boolean z = r06.A0C;
            r06.A0C = false;
            this.A0F.A1R(this.A0y, r06);
            this.mState.A0C = z;
            for (int i6 = 0; i6 < r05.A03(); i6++) {
                C2lb A093 = A09(r05.A06(i6));
                if (!A093.A09() && ((c2lj = (C2lj) r02.get(A093)) == null || (c2lj.A00 & 4) == 0)) {
                    int i7 = A093.A00;
                    int i8 = i7 & 14;
                    if ((i7 & 4) == 0 && (i8 & 4) == 0) {
                        A093.A02();
                    }
                    boolean z2 = (8192 & A093.A00) != 0;
                    A093.A04();
                    ?? obj2 = new Object();
                    obj2.A00(A093);
                    if (z2) {
                        A19(obj2, A093);
                    } else {
                        C2lj c2lj2 = (C2lj) r02.get(A093);
                        C2lj c2lj3 = c2lj2;
                        if (c2lj2 == null) {
                            C2lj c2lj4 = (C2lj) C2lj.A03.A3p();
                            ?? r314 = c2lj4;
                            if (c2lj4 == null) {
                                r314 = new Object();
                            }
                            r02.put(A093, r314 == true ? 1 : 0);
                            c2lj3 = r314;
                        }
                        c2lj3.A00 |= 2;
                        c2lj3.A02 = obj2;
                    }
                }
            }
        }
        2Nd r07 = this.A09;
        int A042 = r07.A04();
        for (int i9 = 0; i9 < A042; i9++) {
            C2lb A094 = A09(r07.A07(i9));
            if (!A094.A09()) {
                A094.A02 = -1;
                A094.A05 = -1;
            }
        }
        2NB r08 = this.A0y;
        ArrayList arrayList = r08.A05;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2lb c2lb = (C2lb) arrayList.get(i10);
            c2lb.A02 = -1;
            c2lb.A05 = -1;
        }
        ArrayList arrayList2 = r08.A04;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2lb c2lb2 = (C2lb) arrayList2.get(i11);
            c2lb2.A02 = -1;
            c2lb2.A05 = -1;
        }
        ArrayList arrayList3 = r08.A03;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                C2lb c2lb3 = (C2lb) arrayList3.get(i12);
                c2lb3.A02 = -1;
                c2lb3.A05 = -1;
            }
        }
        A1J(true);
        A0X(this, false);
        this.mState.A04 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009a, code lost:
    
        if (r301.A0E == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0D() {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0D():void");
    }

    private void A0E() {
        2Nd r0 = this.A09;
        int A04 = r0.A04();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A04) {
                break;
            }
            ((C2lg) r0.A07(i2).getLayoutParams()).A00 = true;
            i = i2 + 1;
        }
        ArrayList arrayList = this.A0y.A05;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size) {
                return;
            }
            C2lg c2lg = (C2lg) ((C2lb) arrayList.get(i4)).A0I.getLayoutParams();
            if (c2lg != null) {
                c2lg.A00 = true;
            }
            i3 = i4 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r301.A0W != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r302 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r301.A0F.A1d() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0F() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0F():void");
    }

    private void A0G() {
        VelocityTracker velocityTracker = this.A0m;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        A08(this).A03(0);
        EdgeEffect edgeEffect = this.A05;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A05.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A07.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A06;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A04;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A04.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private void A0H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0l) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0l = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A0j = x;
            this.A0e = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A0k = y;
            this.A0f = y;
        }
    }

    public static void A0I(MotionEvent motionEvent, RecyclerView recyclerView, int i, int i2) {
        float y;
        float x;
        2XA r0 = recyclerView.A0F;
        if (r0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (recyclerView.A0X) {
            return;
        }
        int[] iArr = recyclerView.A18;
        int i3 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean A1b = r0.A1b();
        boolean A1e = recyclerView.A0F.A1e();
        int i4 = A1b ? 1 : 0;
        if (A1e) {
            i4 = (A1b ? 1 : 0) | 2;
        }
        if (motionEvent == null) {
            y = recyclerView.getHeight() / 2.0f;
            x = recyclerView.getWidth() / 2.0f;
        } else {
            y = motionEvent.getY();
            x = motionEvent.getX();
        }
        int A03 = i - recyclerView.A03(i, y);
        int A04 = i2 - recyclerView.A04(i2, x);
        A08(recyclerView).A07(i4, 1);
        int i5 = 0;
        if (A1b) {
            i5 = A03;
        }
        int i6 = 0;
        if (A1e) {
            i6 = A04;
        }
        if (A08(recyclerView).A09(iArr, recyclerView.A1B, i5, i6, 1)) {
            A03 -= iArr[0];
            A04 -= iArr[1];
        }
        int i7 = 0;
        if (A1b) {
            i7 = A03;
        }
        if (A1e) {
            i3 = A04;
        }
        recyclerView.A0a(motionEvent, i7, i3, 1);
        2Wn r02 = recyclerView.A0B;
        if (r02 != null && (A03 != 0 || A04 != 0)) {
            r02.A01(recyclerView, A03, A04);
        }
        A08(recyclerView).A03(1);
    }

    public static void A0J(View view, Rect rect) {
        C2lg c2lg = (C2lg) view.getLayoutParams();
        Rect rect2 = c2lg.A02;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2lg).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2lg).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2lg).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2lg).bottomMargin);
    }

    private void A0K(View view, View view2) {
        View view3 = view;
        if (view2 != null) {
            view3 = view2;
        }
        Rect rect = this.A0u;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2lg) {
            C2lg c2lg = (C2lg) layoutParams;
            if (!c2lg.A00) {
                Rect rect2 = c2lg.A02;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        2XA r0 = this.A0F;
        boolean z = !this.A0S;
        boolean z2 = false;
        if (view2 == null) {
            z2 = true;
        }
        r0.A12(rect, view, this, z, z2);
    }

    public static void A0O(C2lb c2lb) {
        WeakReference weakReference = c2lb.A0D;
        if (weakReference == null) {
            return;
        }
        Object obj = weakReference.get();
        while (true) {
            View view = (View) obj;
            while (true) {
                View view2 = view;
                if (view2 == null) {
                    c2lb.A0D = null;
                    return;
                } else {
                    if (view2 == c2lb.A0I) {
                        return;
                    }
                    obj = view2.getParent();
                    if (!(obj instanceof View)) {
                        view = null;
                    }
                }
            }
        }
    }

    public static void A0P(C2lb c2lb, RecyclerView recyclerView) {
        View view = c2lb.A0I;
        boolean z = false;
        if (view.getParent() == recyclerView) {
            z = true;
        }
        recyclerView.A0y.A0C(recyclerView.A0l(view));
        boolean z2 = false;
        if ((c2lb.A00 & 256) != 0) {
            z2 = true;
        }
        2Nd r0 = recyclerView.A09;
        if (z2) {
            r0.A0A(view, view.getLayoutParams(), -1, true);
            return;
        }
        if (!z) {
            r0.A09(view, -1, true);
            return;
        }
        int indexOfChild = r0.A03.A00.indexOfChild(view);
        if (indexOfChild < 0) {
            throw AnonymousClass002.A0C(view, "view is not a child, cannot hide ", AnonymousClass001.A0k());
        }
        r0.A02.A04(indexOfChild);
        2Nd.A01(view, r0);
    }

    public static void A0Q(RecyclerView recyclerView) {
        int measuredHeight;
        if (recyclerView.A04 == null) {
            EdgeEffect A00 = recyclerView.A0D.A00(recyclerView, 3);
            recyclerView.A04 = A00;
            boolean z = recyclerView.A0P;
            int measuredWidth = recyclerView.getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
                measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
            } else {
                measuredHeight = recyclerView.getMeasuredHeight();
            }
            A00.setSize(measuredWidth, measuredHeight);
        }
    }

    public static void A0R(RecyclerView recyclerView) {
        int measuredWidth;
        if (recyclerView.A05 == null) {
            EdgeEffect A00 = recyclerView.A0D.A00(recyclerView, 0);
            recyclerView.A05 = A00;
            boolean z = recyclerView.A0P;
            int measuredHeight = recyclerView.getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
                measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
            } else {
                measuredWidth = recyclerView.getMeasuredWidth();
            }
            A00.setSize(measuredHeight, measuredWidth);
        }
    }

    public static void A0S(RecyclerView recyclerView) {
        int measuredWidth;
        if (recyclerView.A06 == null) {
            EdgeEffect A00 = recyclerView.A0D.A00(recyclerView, 2);
            recyclerView.A06 = A00;
            boolean z = recyclerView.A0P;
            int measuredHeight = recyclerView.getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
                measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
            } else {
                measuredWidth = recyclerView.getMeasuredWidth();
            }
            A00.setSize(measuredHeight, measuredWidth);
        }
    }

    public static void A0T(RecyclerView recyclerView) {
        int measuredHeight;
        if (recyclerView.A07 == null) {
            EdgeEffect A00 = recyclerView.A0D.A00(recyclerView, 1);
            recyclerView.A07 = A00;
            boolean z = recyclerView.A0P;
            int measuredWidth = recyclerView.getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
                measuredHeight = (recyclerView.getMeasuredHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
            } else {
                measuredHeight = recyclerView.getMeasuredHeight();
            }
            A00.setSize(measuredWidth, measuredHeight);
        }
    }

    public static void A0U(RecyclerView recyclerView) {
        int i = recyclerView.A0g + 1;
        recyclerView.A0g = i;
        if (i != 1 || recyclerView.A0X) {
            return;
        }
        recyclerView.A0Y = false;
    }

    public static void A0X(RecyclerView recyclerView, boolean z) {
        int i = recyclerView.A0g;
        if (i < 1) {
            recyclerView.A0g = 1;
            i = 1;
        }
        if (!z && !recyclerView.A0X) {
            recyclerView.A0Y = false;
        }
        if (i == 1) {
            if (z && recyclerView.A0Y && !recyclerView.A0X && recyclerView.A0F != null && recyclerView.A0C != null) {
                recyclerView.A0B();
            }
            if (!recyclerView.A0X) {
                recyclerView.A0Y = false;
            }
        }
        recyclerView.A0g--;
    }

    private void A0Y(int[] iArr) {
        int i;
        2Nd r0 = this.A09;
        int A03 = r0.A03();
        if (A03 == 0) {
            i = -1;
            iArr[0] = -1;
        } else {
            int i2 = (-1) >>> 1;
            i = (-1) << (-1);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= A03) {
                    break;
                }
                C2lb A09 = A09(r0.A06(i4));
                if (!A09.A09()) {
                    int i5 = A09.A05;
                    if (i5 == -1) {
                        i5 = A09.A04;
                    }
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i) {
                        i = i5;
                    }
                }
                i3 = i4 + 1;
            }
            iArr[0] = i2;
        }
        iArr[1] = i;
    }

    private boolean A0Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return false;
            }
            2Nv r0 = (2Nv) arrayList.get(i2);
            if (r0.C2A(motionEvent, this) && action != 3) {
                this.A0H = r0;
                return true;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if (r0 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02b4, code lost:
    
        if (r0 == 0.0f) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0a(android.view.MotionEvent r302, int r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0a(android.view.MotionEvent, int, int, int):boolean");
    }

    private boolean A0b(EdgeEffect edgeEffect, int i, int i2) {
        boolean z = true;
        if (i <= 0) {
            float A00 = 5OJ.A00(edgeEffect) * i2;
            float abs = Math.abs(-i) * 0.35f;
            float f = this.A0s * 0.015f;
            double log = Math.log(abs / f);
            double d = A1C;
            if (((float) (f * Math.exp((d / (d - 1.0d)) * log))) >= A00) {
                z = false;
            }
        }
        return z;
    }

    public int A0d() {
        return this.A02;
    }

    public int A0e(C2lb c2lb) {
        int i;
        int i2 = c2lb.A00;
        if ((524 & i2) == 0 && (i2 & 1) != 0) {
            2NY r0 = this.A08;
            i = c2lb.A04;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= size) {
                    break;
                }
                2iL r02 = (2iL) arrayList.get(i4);
                int i5 = r02.A00;
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (r02.A02 <= i) {
                            if (r02.A02 + r02.A01 > i) {
                                break;
                            }
                            i -= r02.A01;
                        } else {
                            continue;
                        }
                    } else if (i5 == 8) {
                        if (r02.A02 == i) {
                            i = r02.A01;
                        } else {
                            if (r02.A02 < i) {
                                i--;
                            }
                            if (r02.A01 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (r02.A02 <= i) {
                    i += r02.A01;
                }
                i3 = i4 + 1;
            }
            return i;
        }
        i = -1;
        return i;
    }

    public Rect A0f(View view) {
        C2lg c2lg = (C2lg) view.getLayoutParams();
        if (!c2lg.A00 || (this.mState.A08 && (c2lg.A01() || (c2lg.mViewHolder.A00 & 4) != 0))) {
            return c2lg.A02;
        }
        Rect rect = c2lg.A02;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.A13;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                c2lg.A00 = false;
                return rect;
            }
            Rect rect2 = this.A0u;
            rect2.set(0, 0, 0, 0);
            ((2kG) arrayList.get(i2)).A05(rect2, view, this.mState, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
            i = i2 + 1;
        }
    }

    public View A0g(float f, float f2) {
        2Nd r0 = this.A09;
        int A03 = r0.A03();
        while (true) {
            A03--;
            if (A03 < 0) {
                return null;
            }
            View A06 = r0.A06(A03);
            float translationX = A06.getTranslationX();
            float translationY = A06.getTranslationY();
            if (f >= A06.getLeft() + translationX && f <= A06.getRight() + translationX && f2 >= A06.getTop() + translationY && f2 <= A06.getBottom() + translationY) {
                return A06;
            }
        }
    }

    public View A0h(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent != this) {
            view = null;
        }
        return view;
    }

    public C2lb A0i(int i) {
        C2lb c2lb = null;
        if (!this.A0Q) {
            2Nd r0 = this.A09;
            int A04 = r0.A04();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= A04) {
                    break;
                }
                C2lb A09 = A09(r0.A07(i3));
                if (A09 != null && !A09.A08() && A0e(A09) == i) {
                    if (!r0.A04.contains(A09.A0I)) {
                        return A09;
                    }
                    c2lb = A09;
                }
                i2 = i3 + 1;
            }
        }
        return c2lb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r311 == (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C2lb A0j(int r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            X.2Nd r0 = r0.A09
            r304 = r0
            r0 = r304
            int r0 = r0.A04()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
        L11:
            r0 = r307
            r1 = r305
            if (r0 >= r1) goto L87
            r0 = r304
            r1 = r307
            android.view.View r0 = r0.A07(r1)
            r308 = r0
            r0 = r308
            X.2lb r0 = A09(r0)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L7b
            r0 = r309
            boolean r0 = r0.A08()
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L7b
            r0 = r303
            if (r0 != 0) goto L4d
            r0 = r309
            int r0 = r0.A05
            r311 = r0
            r0 = -1
            r310 = r0
            r0 = r311
            r1 = r310
            if (r0 != r1) goto L54
        L4d:
            r0 = r309
            int r0 = r0.A04
            r311 = r0
        L54:
            r0 = r311
            r1 = r302
            if (r0 != r1) goto L7b
            r0 = r309
            android.view.View r0 = r0.A0I
            r312 = r0
            r0 = r304
            java.util.List r0 = r0.A04
            r308 = r0
            r0 = r308
            r1 = r312
            boolean r0 = r0.contains(r1)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L84
            r0 = r309
            r306 = r0
        L7b:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L11
        L84:
            r0 = r309
            return r0
        L87:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0j(int, boolean):X.2lb");
    }

    public C2lb A0k(long j) {
        2Xd r0 = this.A0C;
        C2lb c2lb = null;
        if (r0 != null && r0.A00) {
            2Nd r02 = this.A09;
            int A04 = r02.A04();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= A04) {
                    break;
                }
                C2lb A09 = A09(r02.A07(i2));
                if (A09 != null && !A09.A08() && A09.A07 == j) {
                    if (!r02.A04.contains(A09.A0I)) {
                        return A09;
                    }
                    c2lb = A09;
                }
                i = i2 + 1;
            }
        }
        return c2lb;
    }

    public C2lb A0l(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A09(view);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("View ");
        A0k.append(view);
        throw AnonymousClass002.A0C(this, " is not a direct child of ", A0k);
    }

    public String A0m() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(" ");
        A0k.append(super.toString());
        A0k.append(", adapter:");
        A0k.append(this.A0C);
        A0k.append(", layout:");
        A0k.append(this.A0F);
        A0k.append(", context:");
        return AnonymousClass001.A0a(getContext(), A0k);
    }

    public void A0n() {
        int i;
        int i2;
        int A06 = 0FI.A06(-512195364);
        if (!this.A0S || this.A0Q) {
            0T9.A02("RV FullInvalidate", -991309226);
            A0B();
            0T9.A00(-2032452842);
            i = -1208408121;
        } else {
            2NY r0 = this.A08;
            ArrayList arrayList = r0.A04;
            if (arrayList.size() > 0) {
                int i3 = r0.A00;
                if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                    if (arrayList.size() > 0) {
                        0T9.A02("RV FullInvalidate", 1140900645);
                        A0B();
                        i2 = 1445096224;
                    }
                    i = -2039312869;
                } else {
                    0T9.A02("RV PartialInvalidate", -1668064105);
                    A0U(this);
                    this.A01++;
                    r0.A09();
                    if (!this.A0Y) {
                        2Nd r02 = this.A09;
                        int A03 = r02.A03();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= A03) {
                                r0.A07();
                                break;
                            }
                            C2lb A09 = A09(r02.A06(i4));
                            if (A09 != null && !A09.A09() && (A09.A00 & 2) != 0) {
                                A0B();
                                break;
                            }
                            i4++;
                        }
                    }
                    A0X(this, true);
                    A1J(true);
                    i2 = -964509631;
                }
                0T9.A00(i2);
                i = -2039312869;
            } else {
                i = -835686034;
            }
        }
        0FI.A0C(i, A06);
    }

    public void A0o() {
        if (this.A13.size() != 0) {
            2XA r0 = this.A0F;
            if (r0 != null) {
                r0.A1a("Cannot invalidate item decorations during a scroll or layout");
            }
            A0E();
            requestLayout();
        }
    }

    public void A0p() {
        2NI r0 = this.A0E;
        if (r0 != null) {
            r0.A08();
        }
        2XA r02 = this.A0F;
        if (r02 != null) {
            2NB r03 = this.A0y;
            r02.A0t(r03);
            this.A0F.A0u(r03);
        }
        2NB r04 = this.A0y;
        r04.A04.clear();
        2NB.A02(r04);
    }

    public void A0q() {
        AbstractC02843wc abstractC02843wc;
        A0v(0);
        Runnable runnable = this.mViewFlinger;
        ((2NK) runnable).A06.removeCallbacks(runnable);
        ((2NK) runnable).A01.abortAnimation();
        2XA r0 = this.A0F;
        if (r0 == null || (abstractC02843wc = r0.A06) == null) {
            return;
        }
        abstractC02843wc.A03();
    }

    public void A0r(int i) {
        if (this.A0F != null) {
            A0v(2);
            this.A0F.A1L(i);
            awakenScrollBars();
        }
    }

    public void A0s(int i) {
        2Nd r0 = this.A09;
        int A03 = r0.A03();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= A03) {
                return;
            }
            r0.A06(i3).offsetTopAndBottom(i);
            i2 = i3 + 1;
        }
    }

    public void A0t(int i) {
    }

    public void A0u(int i) {
        if (this.A0X) {
            return;
        }
        A0q();
        2XA r0 = this.A0F;
        if (r0 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            r0.A1L(i);
            awakenScrollBars();
        }
    }

    public void A0v(int i) {
        AbstractC02843wc abstractC02843wc;
        if (i == this.A02) {
            return;
        }
        this.A02 = i;
        if (i != 2) {
            Runnable runnable = this.mViewFlinger;
            ((2NK) runnable).A06.removeCallbacks(runnable);
            ((2NK) runnable).A01.abortAnimation();
            2XA r0 = this.A0F;
            if (r0 != null && (abstractC02843wc = r0.A06) != null) {
                abstractC02843wc.A03();
            }
        }
        2XA r02 = this.A0F;
        if (r02 != null) {
            r02.A1K(i);
        }
        A0t(i);
        2O4 r03 = this.A0I;
        if (r03 != null) {
            r03.A06(this, i);
        }
        List list = this.A0N;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((2O4) this.A0N.get(size)).A06(this, i);
            }
        }
    }

    public void A0w(int i) {
        if (this.A0X) {
            return;
        }
        2XA r0 = this.A0F;
        if (r0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            r0.A1U(this.mState, this, i);
        }
    }

    public void A0x(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A05;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.A05.onRelease();
            z = this.A05.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A06;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A06.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A07;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A07.onRelease();
            z |= this.A07.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A04;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A04.onRelease();
            z |= this.A04.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void A0y(int i, int i2) {
        setMeasuredDimension(2XA.A0D(i, getPaddingLeft() + getPaddingRight(), getMinimumWidth()), 2XA.A0D(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public void A0z(int i, int i2) {
        this.A0d++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        A10(i, i2);
        2O4 r0 = this.A0I;
        if (r0 != null) {
            r0.A07(this, i, i2);
        }
        List list = this.A0N;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((2O4) this.A0N.get(size)).A07(this, i, i2);
                }
            }
        }
        this.A0d--;
    }

    public void A10(int i, int i2) {
    }

    public void A11(int i, int i2) {
        A12(i, i2, (-1) << (-1), false);
    }

    public void A12(int i, int i2, int i3, boolean z) {
        2XA r0 = this.A0F;
        if (r0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A0X) {
            return;
        }
        int i4 = 0;
        if (!r0.A1b()) {
            i = 0;
        }
        if (!this.A0F.A1e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != ((-1) << (-1)) && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            if (i != 0) {
                i4 = 1;
            }
            if (i2 != 0) {
                i4 |= 2;
            }
            A08(this).A07(i4, 1);
        }
        this.mViewFlinger.A02((Interpolator) null, i, i2, i3);
    }

    public void A13(int i, int i2, boolean z) {
        int i3 = i + i2;
        2Nd r0 = this.A09;
        int A04 = r0.A04();
        for (int i4 = 0; i4 < A04; i4++) {
            C2lb A09 = A09(r0.A07(i4));
            if (A09 != null && !A09.A09()) {
                int i5 = A09.A04;
                if (i5 >= i3) {
                    A09.A06(-i2, z);
                } else if (i5 >= i) {
                    A09.A00 |= 8;
                    A09.A06(-i2, z);
                    A09.A04 = i - 1;
                }
                this.mState.A0C = true;
            }
        }
        2NB r02 = this.A0y;
        ArrayList arrayList = r02.A05;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            C2lb c2lb = (C2lb) arrayList.get(size);
            if (c2lb != null) {
                if (c2lb.A04 >= i3) {
                    c2lb.A06(-i2, z);
                } else if (c2lb.A04 >= i) {
                    c2lb.A00 |= 8;
                    2NB.A03(r02, size);
                }
            }
        }
    }

    public void A14(int i, int[] iArr, int i2) {
        C2lb c2lb;
        A0U(this);
        this.A01++;
        0T9.A02("RV Scroll", 1725658874);
        if (A0d() == 2) {
            OverScroller overScroller = this.mViewFlinger.A01;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        int A15 = i != 0 ? this.A0F.A15(this.A0y, this.mState, i) : 0;
        int A16 = i2 != 0 ? this.A0F.A16(this.A0y, this.mState, i2) : 0;
        0T9.A00(227204715);
        2Nd r0 = this.A09;
        int A03 = r0.A03();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= A03) {
                break;
            }
            View A06 = r0.A06(i4);
            C2lb A0l = A0l(A06);
            if (A0l != null && (c2lb = A0l.A0B) != null) {
                View view = c2lb.A0I;
                int left = A06.getLeft();
                int top = A06.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
            i3 = i4 + 1;
        }
        A1J(true);
        A0X(this, false);
        if (iArr != null) {
            iArr[0] = A15;
            iArr[1] = A16;
        }
    }

    public void A15(View view) {
        C2lb A09 = A09(view);
        2Xd r0 = this.A0C;
        if (r0 != null && A09 != null) {
            r0.A0F(A09);
        }
        List list = this.A0M;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((C3lp) this.A0M.get(size)).Bnz(view);
            }
        }
    }

    public void A16(2Xd r302) {
        suppressLayout(false);
        2Xd r0 = this.A0C;
        if (r0 != null) {
            r0.D5v(this.A0z);
            this.A0C.BtQ(this);
        }
        A0p();
        2NY r02 = this.A08;
        2NY.A05(r02, r02.A04);
        2NY.A05(r02, r02.A05);
        r02.A00 = 0;
        2Xd r03 = this.A0C;
        this.A0C = r302;
        if (r302 != null) {
            r302.CcA(this.A0z);
            r302.Bje(this);
        }
        2XA r04 = this.A0F;
        if (r04 != null) {
            r04.A1P(r03, this.A0C);
        }
        2NB r05 = this.A0y;
        2Xd r06 = this.A0C;
        r05.A04.clear();
        2NB.A02(r05);
        2Z2 r07 = r05.A02;
        if (r07 != null) {
            Set set = r07.A02;
            set.remove(r03);
            set.size();
        }
        2Z2 A06 = r05.A06();
        if (r03 != null) {
            A06.A00--;
        }
        if (A06.A00 == 0) {
            A06.A01();
        }
        if (r06 != null) {
            A06.A00++;
        }
        2NB.A01(r05);
        this.mState.A0C = true;
        A1K(false);
        requestLayout();
    }

    public void A17(2mW r302) {
        if (r302 != this.A0o) {
            this.A0o = r302;
            setChildrenDrawingOrderEnabled(true);
        }
    }

    public void A18(2N3 r302) {
        r302.getClass();
        this.A0D = r302;
        this.A04 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
    }

    public void A19(C05394do c05394do, C2lb c2lb) {
        int i = c2lb.A00 & (-8193);
        c2lb.A00 = i;
        if (this.mState.A0D && (i & 2) != 0 && !c2lb.A08() && !c2lb.A09()) {
            this.A11.A00.A0C(this.A0C.A00 ? c2lb.A07 : c2lb.A04, c2lb);
        }
        this.A11.A01(c05394do, c2lb);
    }

    public void A1A(2NI r302) {
        2NI r0 = this.A0E;
        if (r0 != null) {
            r0.A08();
            this.A0E.A04 = null;
        }
        this.A0E = r302;
        if (r302 != null) {
            r302.A04 = this.A0p;
        }
    }

    public void A1B(2kG r302) {
        2XA r0 = this.A0F;
        if (r0 != null) {
            r0.A1a("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A13;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r302);
        A0E();
        requestLayout();
    }

    public void A1C(2kG r302) {
        2XA r0 = this.A0F;
        if (r0 != null) {
            r0.A1a("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A13;
        arrayList.remove(r302);
        if (arrayList.isEmpty()) {
            boolean z = false;
            if (getOverScrollMode() == 2) {
                z = true;
            }
            setWillNotDraw(z);
        }
        A0E();
        requestLayout();
    }

    public void A1D(2XA r302) {
        2NB r304;
        if (r302 != this.A0F) {
            A0q();
            if (this.A0F != null) {
                2NI r0 = this.A0E;
                if (r0 != null) {
                    r0.A08();
                }
                2XA r02 = this.A0F;
                r304 = this.A0y;
                r02.A0t(r304);
                this.A0F.A0u(r304);
                r304.A04.clear();
                2NB.A02(r304);
                if (this.A0U) {
                    2XA r03 = this.A0F;
                    r03.A0B = false;
                    r03.A1S(r304, this);
                }
                2XA r04 = this.A0F;
                r04.A07 = null;
                r04.A05 = null;
                r04.A03 = 0;
                r04.A00 = 0;
                r04.A04 = 1073741824;
                r04.A01 = 1073741824;
                this.A0F = null;
            } else {
                r304 = this.A0y;
                r304.A04.clear();
                2NB.A02(r304);
            }
            2Nd r05 = this.A09;
            r05.A02.A02();
            List list = r05.A04;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r05.A03.C3X((View) list.get(size));
                list.remove(size);
            }
            RecyclerView recyclerView = r05.A03.A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A15(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0F = r302;
            if (r302 != null) {
                if (r302.A07 != null) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("LayoutManager ");
                    A0k.append(r302);
                    A0k.append(" is already attached to a RecyclerView:");
                    throw AnonymousClass002.A0D(r302.A07.A0m(), A0k);
                }
                r302.A07 = this;
                r302.A05 = r05;
                r302.A03 = getWidth();
                r302.A00 = getHeight();
                r302.A04 = 1073741824;
                r302.A01 = 1073741824;
                if (this.A0U) {
                    2XA r06 = this.A0F;
                    r06.A0B = true;
                    r06.A0y(this);
                }
            }
            r304.A08();
            requestLayout();
        }
    }

    public void A1E(2Nv r302) {
        this.A14.remove(r302);
        if (this.A0H == r302) {
            this.A0H = null;
        }
    }

    public void A1F(2O4 r302) {
        List list = this.A0N;
        if (list == null) {
            list = new ArrayList();
            this.A0N = list;
        }
        list.add(r302);
    }

    public void A1G(2O4 r302) {
        List list = this.A0N;
        if (list != null) {
            list.remove(r302);
        }
    }

    public void A1H(2O4 r302) {
        this.A0I = r302;
    }

    public void A1I(String str) {
        if (this.A01 > 0) {
            if (str != null) {
                throw AnonymousClass001.A0N(str);
            }
            throw 1BK.A0i("Cannot call this method while RecyclerView is computing a layout or scrolling", A0m());
        }
        if (this.A0d > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", 1BK.A0i("", A0m()));
        }
    }

    public void A1J(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A01 - 1;
        this.A01 = i2;
        if (i2 >= 1) {
            return;
        }
        this.A01 = 0;
        if (!z) {
            return;
        }
        int i3 = this.A00;
        this.A00 = 0;
        if (i3 != 0 && (accessibilityManager = this.A0x) != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            obtain.setContentChangeTypes(i3);
            sendAccessibilityEventUnchecked(obtain);
        }
        List list = this.A15;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.clear();
                return;
            }
            C2lb c2lb = (C2lb) list.get(size);
            if (c2lb.A0I.getParent() == this && !c2lb.A09() && (i = c2lb.A03) != -1) {
                c2lb.A0I.setImportantForAccessibility(i);
                c2lb.A03 = -1;
            }
        }
    }

    public void A1K(boolean z) {
        this.A0R = z | this.A0R;
        this.A0Q = true;
        2Nd r0 = this.A09;
        int A04 = r0.A04();
        for (int i = 0; i < A04; i++) {
            C2lb A09 = A09(r0.A07(i));
            if (A09 != null && !A09.A09()) {
                A09.A00 |= 6;
            }
        }
        A0E();
        2NB r02 = this.A0y;
        ArrayList arrayList = r02.A05;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                break;
            }
            C2lb c2lb = (C2lb) arrayList.get(i3);
            if (c2lb != null) {
                int i4 = c2lb.A00 | 6;
                c2lb.A00 = i4;
                c2lb.A00 = 1024 | i4;
            }
            i2 = i3 + 1;
        }
        2Xd r03 = r02.A07.A0C;
        if (r03 == null || !r03.A00) {
            2NB.A02(r02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r301.A08.A04.size() > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1L() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0S
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L23
            r0 = r301
            boolean r0 = r0.A0Q
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L23
            r0 = r301
            X.2NY r0 = r0.A08
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 <= 0) goto L25
        L23:
            r0 = 1
            r302 = r0
        L25:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A1L():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x024b, code lost:
    
        if (r0 != false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r307v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1M(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A1M(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r301.A0F.A1f((X.C2lg) r302) == false) goto L6;
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
            boolean r0 = r0 instanceof X.C2lg
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L21
            r0 = r301
            X.2XA r0 = r0.A0F
            r304 = r0
            r0 = r302
            X.2lg r0 = (X.C2lg) r0
            r302 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.A1f(r1)
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L25
        L21:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L25:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        2XA r0 = this.A0F;
        int i = 0;
        if (r0 != null && r0.A1b()) {
            i = this.A0F.A17(this.mState);
        }
        return i;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        2XA r0 = this.A0F;
        int i = 0;
        if (r0 != null && r0.A1b()) {
            i = this.A0F.A18(this.mState);
        }
        return i;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        2XA r0 = this.A0F;
        int i = 0;
        if (r0 != null && r0.A1b()) {
            i = this.A0F.A19(this.mState);
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        2XA r0 = this.A0F;
        int i = 0;
        if (r0 != null && r0.A1e()) {
            i = this.A0F.A1A(this.mState);
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        2XA r0 = this.A0F;
        int i = 0;
        if (r0 != null && r0.A1e()) {
            i = this.A0F.A1B(this.mState);
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        2XA r0 = this.A0F;
        int i = 0;
        if (r0 != null && r0.A1e()) {
            i = this.A0F.A1C(this.mState);
        }
        return i;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return A08(this).A06(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return A08(this).A05(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return A08(this).A09(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return A08(this).A08(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        if (r0.draw(r302) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
    
        if (r0.draw(r302) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0196, code lost:
    
        if (r0.draw(r302) == false) goto L43;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0339, code lost:
    
        if (r0 <= r0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0358, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0128, code lost:
    
        if (r0.findNextFocus(r301, r302, r307) == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r0.findNextFocus(r301, r302, r307) == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        A0n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (A0h(r302) == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        A0U(r301);
        r301.A0F.A1E(r302, r301.A0y, r301.mState, r303);
        A0X(r301, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r310 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0230, code lost:
    
        if (r308 <= r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x026b, code lost:
    
        if (r308 <= r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c0, code lost:
    
        if (r316 > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r301.A0X != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f5  */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v99 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r302, int r303) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        2XA r0 = this.A0F;
        if (r0 != null) {
            return r0.A1F();
        }
        throw 1BK.A0i("RecyclerView has no LayoutManager", A0m());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        2XA r0 = this.A0F;
        if (r0 != null) {
            return r0.A1G(getContext(), attributeSet);
        }
        throw 1BK.A0i("RecyclerView has no LayoutManager", A0m());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        2XA r0 = this.A0F;
        if (r0 != null) {
            return r0.A1H(layoutParams);
        }
        throw 1BK.A0i("RecyclerView has no LayoutManager", A0m());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A0F != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return this.A0o == null ? super.getChildDrawingOrder(i, i2) : (i - 1) - i2;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0P;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        boolean z = false;
        if (A08(this).A01 != null) {
            z = true;
        }
        return z;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.A0U;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.A0X;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return A08(this).A02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1664135630);
        super.onAttachedToWindow();
        this.A01 = 0;
        boolean z = true;
        this.A0U = true;
        if (!this.A0S || isLayoutRequested()) {
            z = false;
        }
        this.A0S = z;
        2NB.A01(this.A0y);
        2XA r0 = this.A0F;
        if (r0 != null) {
            r0.A0B = true;
            r0.A0y(this);
        }
        this.A0Z = false;
        ThreadLocal threadLocal = 2Wn.A05;
        2Wn r02 = (2Wn) threadLocal.get();
        this.A0B = r02;
        if (r02 == null) {
            this.A0B = new 2Wn();
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            2Wn r03 = this.A0B;
            r03.A00 = 1.0E9f / f;
            threadLocal.set(r03);
        }
        this.A0B.A02.add(this);
        0FI.A0C(1527479032, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-345242235);
        super.onDetachedFromWindow();
        2NI r0 = this.A0E;
        if (r0 != null) {
            r0.A08();
        }
        A0q();
        this.A0U = false;
        2XA r02 = this.A0F;
        if (r02 != null) {
            2NB r03 = this.A0y;
            r02.A0B = false;
            r02.A1S(r03, this);
        }
        this.A15.clear();
        removeCallbacks(this.A0L);
        do {
        } while (C2lj.A03.A3p() != null);
        2NB r04 = this.A0y;
        int i = 0;
        while (true) {
            ArrayList arrayList = r04.A05;
            if (i >= arrayList.size()) {
                break;
            }
            5Nm.A01(((C2lb) arrayList.get(i)).A0I);
            i++;
        }
        2Xd r05 = r04.A07.A0C;
        2Z2 r06 = r04.A02;
        if (r06 != null) {
            Set set = r06.A02;
            set.remove(r05);
            if (set.size() == 0) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = r06.A01;
                    if (i2 >= sparseArray.size()) {
                        break;
                    }
                    ArrayList arrayList2 = ((2lJ) sparseArray.get(sparseArray.keyAt(i2))).A02;
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        5Nm.A01(((C2lb) arrayList2.get(i3)).A0I);
                    }
                    i2++;
                }
            }
        }
        0Mo r07 = new 0Mo(this);
        while (r07.hasNext()) {
            ArrayList arrayList3 = 5Nm.A00((View) r07.next()).A00;
            11T.A0F(arrayList3, 0);
            int size = arrayList3.size();
            while (true) {
                int i4 = size - 1;
                if (-1 < i4) {
                    ((MBr) arrayList3.get(i4)).A00.A02();
                    size = i4;
                }
            }
        }
        2Wn r08 = this.A0B;
        if (r08 != null) {
            r08.A02.remove(this);
            this.A0B = null;
        }
        0FI.A0C(1100369750, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A13;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((2kG) arrayList.get(i2)).A03(canvas, this.mState, this);
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r307 != 0.0f) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01bf, code lost:
    
        if (r311 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03ce, code lost:
    
        if (r301.A02 != 2) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        0T9.A02("RV OnLayout", 917921195);
        A0B();
        0T9.A00(-1137219050);
        this.A0S = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        2XA r0 = this.A0F;
        if (r0 == null) {
            A0y(i, i2);
            return;
        }
        boolean z = false;
        if (!r0.A1c()) {
            if (this.A0T) {
                r0.A0w(this.A0y, this.mState, i, i2);
                return;
            }
            if (this.A0O) {
                A0U(this);
                this.A01++;
                A0F();
                A1J(true);
                2NQ r02 = this.mState;
                if (r02.A0A) {
                    r02.A08 = true;
                } else {
                    this.A08.A08();
                    this.mState.A08 = false;
                }
                this.A0O = false;
                A0X(this, false);
            } else if (this.mState.A0A) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            2Xd r03 = this.A0C;
            if (r03 != null) {
                this.mState.A03 = r03.getItemCount();
            } else {
                this.mState.A03 = 0;
            }
            A0U(this);
            this.A0F.A0w(this.A0y, this.mState, i, i2);
            A0X(this, false);
            this.mState.A08 = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A0F.A0w(this.A0y, this.mState, i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.A0r = z;
        if (z || this.A0C == null) {
            return;
        }
        if (this.mState.A04 == 1) {
            A0C();
        }
        this.A0F.A0g(i, i2);
        this.mState.A09 = true;
        A0D();
        this.A0F.A0h(i, i2);
        2XA r04 = this.A0F;
        if ((r04 instanceof LinearLayoutManager) && r04.A01 != 1073741824 && r04.A04 != 1073741824) {
            int A0U = r04.A0U();
            int i3 = 0;
            while (true) {
                if (i3 >= A0U) {
                    break;
                }
                ViewGroup.LayoutParams layoutParams = r04.A0d(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    this.A0F.A0g(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.A09 = true;
                    A0D();
                    this.A0F.A0h(i, i2);
                    break;
                }
                i3++;
            }
        }
        this.A0i = getMeasuredWidth();
        this.A0h = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A01 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.A0J = savedState;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable, androidx.recyclerview.widget.RecyclerView$SavedState, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable A1D2;
        Parcelable.Creator creator = SavedState.CREATOR;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        SavedState savedState = this.A0J;
        if (savedState != null) {
            A1D2 = savedState.A00;
        } else {
            2XA r0 = this.A0F;
            A1D2 = r0 != null ? r0.A1D() : null;
        }
        absSavedState.A00 = A1D2;
        return absSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(2130805072);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A04 = null;
            this.A07 = null;
            this.A06 = null;
            this.A05 = null;
        }
        0FI.A0C(-1566694734, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x02c7, code lost:
    
        if (r316 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02f2, code lost:
    
        if (r309 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02f5, code lost:
    
        A0v(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0489, code lost:
    
        if (r313 != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v262 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r313v12 */
    /* JADX WARN: Type inference failed for: r313v13 */
    /* JADX WARN: Type inference failed for: r313v14 */
    /* JADX WARN: Type inference failed for: r314v3 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        C2lb A09 = A09(view);
        if (A09 != null) {
            int i = A09.A00;
            if ((i & 256) != 0) {
                A09.A00 = i & (-257);
            } else if (!A09.A09()) {
                StringBuilder A0k = AnonymousClass001.A0k();
                throw AnonymousClass002.A0D(1BL.A0m(this, A09, "Called removeDetachedView with a view which is not flagged as tmp detached.", A0k), A0k);
            }
        }
        view.clearAnimation();
        A15(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        AbstractC02843wc abstractC02843wc = this.A0F.A06;
        if ((abstractC02843wc == null || !abstractC02843wc.A05) && this.A01 <= 0 && view2 != null) {
            A0K(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0F.A11(rect, view, this, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                super.requestDisallowInterceptTouchEvent(z);
                return;
            } else {
                ((2Nv) arrayList.get(i2)).CGu(z);
                i = i2 + 1;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A0g != 0 || this.A0X) {
            this.A0Y = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        2XA r0 = this.A0F;
        if (r0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A0X) {
            return;
        }
        boolean A1b = r0.A1b();
        boolean A1e = this.A0F.A1e();
        if (A1b || A1e) {
            if (!A1b) {
                i = 0;
            }
            if (!A1e) {
                i2 = 0;
            }
            A0a(null, i, i2, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A01 <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
            return;
        }
        int i = 0;
        if (accessibilityEvent != null && (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) != 0) {
            i = contentChangeTypes;
        }
        this.A00 |= i;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0P) {
            this.A04 = null;
            this.A07 = null;
            this.A06 = null;
            this.A05 = null;
        }
        this.A0P = z;
        super.setClipToPadding(z);
        if (this.A0S) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw AnonymousClass001.A0L("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        A08(this).A04(z);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return A08(this).A07(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        A08(this).A03(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.A0X) {
            A1I("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.A0X = true;
                this.A0q = true;
                A0q();
                return;
            }
            this.A0X = false;
            if (this.A0Y && this.A0F != null && this.A0C != null) {
                requestLayout();
            }
            this.A0Y = false;
        }
    }
}
