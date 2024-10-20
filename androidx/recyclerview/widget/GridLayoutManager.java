package androidx.recyclerview.widget;

import X.0Pz;
import X.2NB;
import X.2NP;
import X.2NQ;
import X.2Nm;
import X.2XA;
import X.2XH;
import X.2XI;
import X.2Xl;
import X.5aS;
import X.AbstractC02903wj;
import X.AnonymousClass001;
import X.C2lg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;

/* loaded from: GridLayoutManager.class */
public class GridLayoutManager extends LinearLayoutManager {
    public int A00;
    public AbstractC02903wj A01;
    public boolean A02;
    public int[] A03;
    public View[] A04;
    public final Rect A05;
    public final SparseIntArray A06;
    public final SparseIntArray A07;

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.A02 = false;
        this.A00 = -1;
        this.A07 = new SparseIntArray();
        this.A06 = new SparseIntArray();
        this.A01 = new AbstractC02903wj();
        this.A05 = new Rect();
        A1x(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = false;
        this.A00 = -1;
        this.A07 = new SparseIntArray();
        this.A06 = new SparseIntArray();
        this.A01 = new AbstractC02903wj();
        this.A05 = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 2Nm.A00, i, i2);
        obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(10, 1);
        obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1x(i3);
    }

    public GridLayoutManager(Context context, boolean z, int i, int i2) {
        super(context, i2, z);
        this.A02 = false;
        this.A00 = -1;
        this.A07 = new SparseIntArray();
        this.A06 = new SparseIntArray();
        this.A01 = new AbstractC02903wj();
        this.A05 = new Rect();
        A1x(i);
    }

    private int A00(2NB r302, 2NQ r303, int i) {
        int i2;
        int i3;
        int i4;
        int A00;
        if (r303.A08) {
            int A05 = r302.A05(i);
            if (A05 == -1) {
                Log.w("GridLayoutManager", 0Pz.A0T("Cannot find span size for pre layout position. ", i));
                i3 = 0;
                return i3;
            }
            AbstractC02903wj abstractC02903wj = this.A01;
            i2 = this.A00;
            i3 = 0;
            i4 = 0;
            A00 = abstractC02903wj.A00(A05);
            for (int i5 = 0; i5 < A05; i5++) {
                int A002 = abstractC02903wj.A00(i5);
                i4 += A002;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = A002;
                }
            }
        } else {
            AbstractC02903wj abstractC02903wj2 = this.A01;
            i2 = this.A00;
            i3 = 0;
            i4 = 0;
            A00 = abstractC02903wj2.A00(i);
            for (int i6 = 0; i6 < i; i6++) {
                int A003 = abstractC02903wj2.A00(i6);
                i4 += A003;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = A003;
                }
            }
        }
        if (i4 + A00 > i2) {
            return i3 + 1;
        }
        return i3;
    }

    private int A04(2NB r302, 2NQ r303, int i) {
        int i2;
        if (r303.A08) {
            i2 = this.A06.get(i, -1);
            if (i2 == -1) {
                int A05 = r302.A05(i);
                if (A05 != -1) {
                    return this.A01.A01(A05, this.A00);
                }
                Log.w("GridLayoutManager", 0Pz.A0T("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
                return 0;
            }
        } else {
            i2 = this.A01.A01(i, this.A00);
        }
        return i2;
    }

    private int A05(2NB r302, 2NQ r303, int i) {
        int i2;
        if (r303.A08) {
            i2 = this.A07.get(i, -1);
            if (i2 == -1) {
                int A05 = r302.A05(i);
                if (A05 != -1) {
                    return this.A01.A00(A05);
                }
                Log.w("GridLayoutManager", 0Pz.A0T("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
                return 1;
            }
        } else {
            i2 = this.A01.A00(i);
        }
        return i2;
    }

    private void A06() {
        View[] viewArr = this.A04;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A04 = new View[this.A00];
        }
    }

    private void A07() {
        int A0W;
        int A0Z;
        if (super.A01 == 1) {
            A0W = ((2XA) this).A03 - A0Y();
            A0Z = A0X();
        } else {
            A0W = ((2XA) this).A00 - A0W();
            A0Z = A0Z();
        }
        A08(A0W - A0Z);
    }

    private void A08(int i) {
        int i2;
        int length;
        int[] iArr = this.A03;
        int i3 = this.A00;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A03 = iArr;
    }

    private void A09(View view, int i, int i2, boolean z) {
        C2lg c2lg = (C2lg) view.getLayoutParams();
        if (z) {
            if (((2XA) this).A0D && 2XA.A0M(view.getMeasuredWidth(), i, ((ViewGroup.LayoutParams) c2lg).width) && 2XA.A0M(view.getMeasuredHeight(), i2, ((ViewGroup.LayoutParams) c2lg).height)) {
                return;
            }
        } else if (!A14(view, c2lg, i, i2)) {
            return;
        }
        view.measure(i, i2);
    }

    private void A0C(View view, int i, boolean z) {
        int i2;
        int A0E;
        int A0E2;
        5aS layoutParams = view.getLayoutParams();
        Rect rect = layoutParams.A02;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i5 = layoutParams.A00;
        int i6 = layoutParams.A01;
        if (super.A01 == 1 && A1w()) {
            int[] iArr = this.A03;
            int i7 = this.A00 - i5;
            i2 = iArr[i7] - iArr[i7 - i6];
        } else {
            int[] iArr2 = this.A03;
            i2 = iArr2[i6 + i5] - iArr2[i5];
        }
        if (super.A01 == 1) {
            A0E2 = 2XA.A0E(i2, i, i4, ((ViewGroup.LayoutParams) layoutParams).width, false);
            A0E = 2XA.A0E(super.A06.A07(), ((2XA) this).A01, i3, ((ViewGroup.LayoutParams) layoutParams).height, true);
        } else {
            A0E = 2XA.A0E(i2, i, i3, ((ViewGroup.LayoutParams) layoutParams).height, false);
            A0E2 = 2XA.A0E(super.A06.A07(), ((2XA) this).A04, i4, ((ViewGroup.LayoutParams) layoutParams).width, true);
        }
        A09(view, A0E2, A0E, z);
    }

    public int A0a(2NB r302, 2NQ r303) {
        if (super.A01 == 1) {
            return this.A00;
        }
        int A00 = r303.A00();
        if (A00 < 1) {
            return 0;
        }
        return A00(r302, r303, A00 - 1) + 1;
    }

    public int A0b(2NB r302, 2NQ r303) {
        if (super.A01 == 0) {
            return this.A00;
        }
        int A00 = r303.A00();
        if (A00 < 1) {
            return 0;
        }
        return A00(r302, r303, A00 - 1) + 1;
    }

    public void A0p(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2NB r304, 2NQ r305) {
        5aS layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof 5aS)) {
            super.A0o(view, accessibilityNodeInfoCompat);
            return;
        }
        5aS r0 = layoutParams;
        int A00 = A00(r304, r305, r0.A00());
        int i = super.A01;
        int i2 = r0.A00;
        int i3 = r0.A01;
        accessibilityNodeInfoCompat.A02.setCollectionItemInfo(i == 0 ? AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, A00, 1, false, false) : AccessibilityNodeInfo.CollectionItemInfo.obtain(A00, 1, i2, i3, false, false));
    }

    public void A0r(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2NB r303, 2NQ r304) {
        super.A0r(accessibilityNodeInfoCompat, r303, r304);
        accessibilityNodeInfoCompat.A07(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A15(2NB r302, 2NQ r303, int i) {
        A07();
        A06();
        return super.A15(r302, r303, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A16(2NB r302, 2NQ r303, int i) {
        A07();
        A06();
        return super.A16(r302, r303, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
    
        if (A1w() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022c, code lost:
    
        if (r0 <= r325) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x022f, code lost:
    
        r318 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0236, code lost:
    
        if (r322 != r318) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (((X.2XA) r301).A05.A04.contains(r310) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0287, code lost:
    
        if (r0 > r326) goto L64;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1E(android.view.View r302, X.2NB r303, X.2NQ r304, int r305) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1E(android.view.View, X.2NB, X.2NQ, int):android.view.View");
    }

    public C2lg A1F() {
        int i;
        C2lg c2lg;
        if (super.A01 == 0) {
            i = -1;
            c2lg = new C2lg(-2, -1);
        } else {
            i = -1;
            c2lg = new C2lg(-1, -2);
        }
        ((5aS) c2lg).A00 = i;
        ((5aS) c2lg).A01 = 0;
        return c2lg;
    }

    public C2lg A1G(Context context, AttributeSet attributeSet) {
        C2lg c2lg = new C2lg(context, attributeSet);
        ((5aS) c2lg).A00 = -1;
        ((5aS) c2lg).A01 = 0;
        return c2lg;
    }

    public C2lg A1H(ViewGroup.LayoutParams layoutParams) {
        C2lg c2lg = layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2lg((ViewGroup.MarginLayoutParams) layoutParams) : new C2lg(layoutParams);
        ((5aS) c2lg).A00 = -1;
        ((5aS) c2lg).A01 = 0;
        return c2lg;
    }

    public void A1M(Rect rect, int i, int i2) {
        int A0D;
        int A0D2;
        if (this.A03 == null) {
            super.A1M(rect, i, i2);
        }
        int A0X = A0X() + A0Y();
        int A0Z = A0Z() + A0W();
        if (super.A01 == 1) {
            A0D2 = 2XA.A0D(i2, rect.height() + A0Z, ((2XA) this).A07.getMinimumHeight());
            int[] iArr = this.A03;
            A0D = 2XA.A0D(i, iArr[iArr.length - 1] + A0X, ((2XA) this).A07.getMinimumWidth());
        } else {
            A0D = 2XA.A0D(i, rect.width() + A0X, ((2XA) this).A07.getMinimumWidth());
            int[] iArr2 = this.A03;
            A0D2 = 2XA.A0D(i2, iArr2[iArr2.length - 1] + A0Z, ((2XA) this).A07.getMinimumHeight());
        }
        ((2XA) this).A07.setMeasuredDimension(A0D, A0D2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1R(2NB r302, 2NQ r303) {
        if (r303.A08) {
            int A0U = A0U();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= A0U) {
                    break;
                }
                5aS layoutParams = A0d(i2).getLayoutParams();
                int A00 = layoutParams.A00();
                this.A07.put(A00, layoutParams.A01);
                this.A06.put(A00, layoutParams.A00);
                i = i2 + 1;
            }
        }
        super.A1R(r302, r303);
        this.A07.clear();
        this.A06.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1T(2NQ r302) {
        super.A1T(r302);
        this.A02 = false;
    }

    public void A1V(RecyclerView recyclerView) {
        this.A01.A01.clear();
        this.A01.A00.clear();
    }

    public void A1W(RecyclerView recyclerView, int i, int i2) {
        this.A01.A01.clear();
        this.A01.A00.clear();
    }

    public void A1X(RecyclerView recyclerView, int i, int i2) {
        this.A01.A01.clear();
        this.A01.A00.clear();
    }

    public void A1Y(RecyclerView recyclerView, int i, int i2, int i3) {
        this.A01.A01.clear();
        this.A01.A00.clear();
    }

    public void A1Z(RecyclerView recyclerView, Object obj, int i, int i2) {
        this.A01.A01.clear();
        this.A01.A00.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A02 != false) goto L6;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1d() {
        /*
            r301 = this;
            r0 = r301
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1d():boolean");
    }

    public boolean A1f(C2lg c2lg) {
        return c2lg instanceof 5aS;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View A1l(2NB r302, 2NQ r303, boolean z, boolean z2) {
        int i;
        int A0U = A0U();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = A0U() - 1;
            i3 = -1;
        } else {
            i2 = A0U;
            i = 0;
        }
        int A00 = r303.A00();
        A1o();
        int A06 = super.A06.A06();
        int A03 = super.A06.A03();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0d = A0d(i);
            int A0G = 2XA.A0G(A0d);
            if (A0G >= 0 && A0G < A00 && A04(r302, r303, A0G) == 0) {
                if (((C2lg) A0d.getLayoutParams()).mViewHolder.A08()) {
                    if (view2 == null) {
                        view2 = A0d;
                    }
                } else {
                    if (super.A06.A0B(A0d) < A03 && super.A06.A08(A0d) >= A06) {
                        return A0d;
                    }
                    if (view == null) {
                        view = A0d;
                    }
                }
            }
            i += i3;
        }
        return view == null ? view2 : view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1q(2XH r302, 2NB r303, 2NQ r304, int i) {
        int i2;
        int i3;
        int A04;
        A07();
        if (r304.A00() > 0 && !r304.A08) {
            boolean z = false;
            if (i == 1) {
                z = true;
            }
            int A042 = A04(r303, r304, r302.A01);
            if (z) {
                while (A042 > 0 && (i2 = r302.A01) > 0) {
                    int i4 = i2 - 1;
                    r302.A01 = i4;
                    A042 = A04(r303, r304, i4);
                }
            } else {
                int A00 = r304.A00() - 1;
                int i5 = r302.A01;
                while (i5 < A00 && (A04 = A04(r303, r304, (i3 = i5 + 1))) > A042) {
                    i5 = i3;
                    A042 = A04;
                }
                r302.A01 = i5;
            }
        }
        A06();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1r(2XI r302, 2Xl r303, 2NB r304, 2NQ r305) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int makeMeasureSpec;
        int A0E;
        int i6;
        View A01;
        int A02 = super.A06.A02();
        int i7 = 0;
        boolean z = A02 != 1073741824;
        int i8 = A0U() > 0 ? this.A03[this.A00] : 0;
        if (z) {
            A07();
        }
        boolean z2 = r303.A03 == 1;
        int i9 = this.A00;
        if (!z2) {
            i9 = A04(r304, r305, r303.A01) + A05(r304, r305, r303.A01);
        }
        int i10 = 0;
        while (true) {
            i = i10;
            if (i >= this.A00 || (i6 = r303.A01) < 0 || i6 >= r305.A00() || i9 <= 0) {
                break;
            }
            int A05 = A05(r304, r305, i6);
            int i11 = this.A00;
            if (A05 > i11) {
                throw AnonymousClass001.A0L(0Pz.A0y("Item at position ", " requires ", " spans but GridLayoutManager has only ", " spans.", i6, A05, i11));
            }
            i9 -= A05;
            if (i9 < 0 || (A01 = r303.A01(r304)) == null) {
                break;
            }
            this.A04[i] = A01;
            i10 = i + 1;
        }
        if (i == 0) {
            r302.A01 = true;
            return;
        }
        float f = 0.0f;
        int i12 = 0;
        int i13 = -1;
        int i14 = i - 1;
        int i15 = -1;
        if (z2) {
            i13 = i;
            i15 = 1;
            View view = this.A04[0];
            5aS layoutParams = view.getLayoutParams();
            int A052 = A05(r304, r305, 2XA.A0G(view));
            layoutParams.A01 = A052;
            layoutParams.A00 = 0;
            i12 = 0 + A052;
            i14 = 0 + 1;
        }
        while (i14 != i13) {
            View view2 = this.A04[i14];
            5aS layoutParams2 = view2.getLayoutParams();
            int A053 = A05(r304, r305, 2XA.A0G(view2));
            layoutParams2.A01 = A053;
            layoutParams2.A00 = i12;
            i12 += A053;
            i14 += i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i; i17++) {
            View view3 = this.A04[i17];
            if (r303.A09 == null) {
                if (z2) {
                    A0j(view3);
                } else {
                    A0l(view3, 0);
                }
            } else if (z2) {
                float f2 = 0.0f / 0.0f;
                2XA.A0L(view3, this, -1, true);
            } else {
                2XA.A0L(view3, this, 0, true);
            }
            A0n(view3, this.A05);
            A0C(view3, A02, false);
            int A09 = super.A06.A09(view3);
            if (A09 > i16) {
                i16 = A09;
            }
            float A0A = (super.A06.A0A(view3) * 1.0f) / view3.getLayoutParams().A01;
            if (A0A > f) {
                f = A0A;
            }
        }
        if (z) {
            A08(Math.max(Math.round(f * this.A00), i8));
            i16 = 0;
            for (int i18 = 0; i18 < i; i18++) {
                View view4 = this.A04[i18];
                A0C(view4, 1073741824, true);
                int A092 = super.A06.A09(view4);
                if (A092 > i16) {
                    i16 = A092;
                }
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            View view5 = this.A04[i19];
            if (super.A06.A09(view5) != i16) {
                5aS layoutParams3 = view5.getLayoutParams();
                Rect rect = layoutParams3.A02;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                int i22 = layoutParams3.A00;
                int i23 = layoutParams3.A01;
                if (super.A01 == 1 && A1w()) {
                    int[] iArr = this.A03;
                    int i24 = this.A00 - i22;
                    i5 = iArr[i24] - iArr[i24 - i23];
                } else {
                    int[] iArr2 = this.A03;
                    i5 = iArr2[i23 + i22] - iArr2[i22];
                }
                if (super.A01 == 1) {
                    makeMeasureSpec = 2XA.A0E(i5, 1073741824, i21, ((ViewGroup.LayoutParams) layoutParams3).width, false);
                    A0E = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    A0E = 2XA.A0E(i5, 1073741824, i20, ((ViewGroup.LayoutParams) layoutParams3).height, false);
                }
                A09(view5, makeMeasureSpec, A0E, true);
            }
        }
        int i25 = 0;
        r302.A00 = i16;
        int i26 = super.A01;
        int i27 = r303.A05;
        if (i26 == 1) {
            i4 = r303.A07;
            i7 = i4 - i16;
            if (i27 != -1) {
                i7 = i4;
                i4 = i16 + i4;
            }
            i2 = 0;
            i3 = 0;
        } else {
            int i28 = r303.A07;
            i2 = i16 + i28;
            i3 = i28;
            if (i27 == -1) {
                i3 = i28 - i16;
                i2 = i28;
            }
            i4 = 0;
        }
        while (true) {
            View[] viewArr = this.A04;
            if (i25 >= i) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view6 = viewArr[i25];
            5aS layoutParams4 = view6.getLayoutParams();
            if (super.A01 == 1) {
                boolean A1w = A1w();
                int A0X = A0X();
                int[] iArr3 = this.A03;
                if (A1w) {
                    i2 = A0X + iArr3[this.A00 - layoutParams4.A00];
                    i3 = i2 - super.A06.A0A(view6);
                } else {
                    int i29 = A0X + iArr3[layoutParams4.A00];
                    i3 = i29;
                    i2 = super.A06.A0A(view6) + i29;
                }
            } else {
                i7 = A0Z() + this.A03[layoutParams4.A00];
                i4 = super.A06.A0A(view6) + i7;
            }
            2XA.A0J(view6, i3, i7, i2, i4);
            if (layoutParams4.mViewHolder.A08() || layoutParams4.A01()) {
                r302.A03 = true;
            }
            r302.A02 |= view6.hasFocusable();
            i25++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1s(2Xl r302, 2NP r303, 2NQ r304) {
        int i;
        int i2 = this.A00;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.A00 || (i = r302.A01) < 0 || i >= r304.A00() || i2 <= 0) {
                return;
            }
            r303.A76(i, Math.max(0, r302.A08));
            i2 -= this.A01.A00(i);
            r302.A01 += r302.A03;
            i3 = i4 + 1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1v(boolean z) {
        if (z) {
            throw AnonymousClass001.A0q("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.A1v(false);
    }

    public void A1x(int i) {
        if (i != this.A00) {
            this.A02 = true;
            if (i < 1) {
                throw 0Pz.A04("Span count should be at least 1. Provided ", i);
            }
            this.A00 = i;
            this.A01.A01.clear();
            A0e();
        }
    }
}
