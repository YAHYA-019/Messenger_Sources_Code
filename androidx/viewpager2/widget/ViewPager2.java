package androidx.viewpager2.widget;

import X.0Pz;
import X.1BK;
import X.2N9;
import X.2NI;
import X.2XA;
import X.2Xd;
import X.4YV;
import X.7zR;
import X.AnonymousClass001;
import X.C00p;
import X.C0Ad;
import X.C9qg;
import X.DKC;
import X.GOn;
import X.GWA;
import X.GWF;
import X.GWk;
import X.GXD;
import X.GXw;
import X.GYE;
import X.GYF;
import X.GYG;
import X.GYJ;
import X.GYK;
import X.HFy;
import X.HMD;
import X.Hcx;
import X.Hcy;
import X.HpF;
import X.IHc;
import X.ILY;
import X.IoK;
import X.Iv9;
import X.JCa;
import X.JDr;
import X.JQw;
import X.JiG;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: ViewPager2.class */
public final class ViewPager2 extends ViewGroup {
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public 2N9 A03;
    public RecyclerView A04;
    public GYG A05;
    public Hcx A06;
    public GYK A07;
    public GXD A08;
    public HpF A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public Parcelable A0D;
    public JiG A0E;
    public 2NI A0F;
    public GYG A0G;
    public boolean A0H;
    public final Rect A0I;
    public final Rect A0J;

    /* loaded from: ViewPager2$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new IHc(0);
        public int A00;
        public int A01;
        public Parcelable A02;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeParcelable(this.A02, i);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.A0J = DKC.A0C();
        this.A0I = DKC.A0C();
        this.A05 = new GYG();
        this.A0A = false;
        this.A03 = new GYE(this);
        this.A0C = -1;
        this.A0F = null;
        this.A0H = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0J = DKC.A0C();
        this.A0I = DKC.A0C();
        this.A05 = new GYG();
        this.A0A = false;
        this.A03 = new GYE(this);
        this.A0C = -1;
        this.A0F = null;
        this.A0H = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0J = DKC.A0C();
        this.A0I = DKC.A0C();
        this.A05 = new GYG();
        this.A0A = false;
        this.A03 = new GYE(this);
        this.A0C = -1;
        this.A0F = null;
        this.A0H = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0J = DKC.A0C();
        this.A0I = DKC.A0C();
        this.A05 = new GYG();
        this.A0A = false;
        this.A03 = new GYE(this);
        this.A0C = -1;
        this.A0F = null;
        this.A0H = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, attributeSet);
    }

    private void A00() {
        GWk gWk;
        if (this.A0C == -1 || (gWk = this.A04.A0C) == null) {
            return;
        }
        Parcelable parcelable = this.A0D;
        if (parcelable != null) {
            if (gWk instanceof JCa) {
                GWk gWk2 = (JCa) gWk;
                C00p c00p = gWk2.A06;
                if (c00p.A00() == 0) {
                    C00p c00p2 = gWk2.A04;
                    if (c00p2.A00() == 0) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(4YV.A0e(gWk2));
                        }
                        Iterator<String> it = bundle.keySet().iterator();
                        while (it.hasNext()) {
                            String A0i = AnonymousClass001.A0i(it);
                            if (A0i.startsWith("f#")) {
                                int length = A0i.length();
                                int length2 = "f#".length();
                                if (length > length2) {
                                    c00p2.A0C(Long.parseLong(A0i.substring(length2)), gWk2.A07.A0Z(bundle, A0i));
                                }
                            }
                            if (A0i.startsWith("s#")) {
                                int length3 = A0i.length();
                                int length4 = "s#".length();
                                if (length3 > length4) {
                                    long parseLong = Long.parseLong(A0i.substring(length4));
                                    Parcelable parcelable2 = bundle.getParcelable(A0i);
                                    if (parseLong >= 0) {
                                        gWk2.getItemCount();
                                        if (parseLong < 2) {
                                            c00p.A0C(parseLong, parcelable2);
                                        }
                                    }
                                }
                            }
                            throw 0Pz.A05("Unexpected key in savedState: ", A0i);
                        }
                        if (c00p2.A00() != 0) {
                            gWk2.A01 = true;
                            gWk2.A02 = true;
                            gWk2.A0H();
                            Handler A07 = AnonymousClass001.A07();
                            IoK ioK = new IoK(gWk2);
                            gWk2.A08.addObserver(new C9qg(0, A07, gWk2, ioK));
                            A07.postDelayed(ioK, 10000L);
                        }
                    }
                }
                throw AnonymousClass001.A0N("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.A0D = null;
        }
        int max = Math.max(0, Math.min(this.A0C, ((2Xd) gWk).getItemCount() - 1));
        this.A00 = max;
        this.A0C = -1;
        this.A04.A0u(max);
        this.A09.A00();
    }

    private void A01(Context context, AttributeSet attributeSet) {
        this.A09 = new HpF(this);
        GXw gXw = new GXw(context, this);
        this.A04 = gXw;
        gXw.setId(View.generateViewId());
        this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        GWA gwa = new GWA(context, this);
        this.A02 = gwa;
        this.A04.A1D(gwa);
        RecyclerView recyclerView = this.A04;
        recyclerView.A03 = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        int[] iArr = HMD.A00;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0Ad.A07(context, obtainStyledAttributes, attributeSet, this, iArr, 0, 0);
        try {
            this.A02.A1p(obtainStyledAttributes.getInt(0, 0));
            this.A09.A00();
            obtainStyledAttributes.recycle();
            7zR.A11(this.A04);
            RecyclerView recyclerView2 = this.A04;
            ILY ily = new ILY(this);
            List list = recyclerView2.A0M;
            if (list == null) {
                list = AnonymousClass001.A0s();
                recyclerView2.A0M = list;
            }
            list.add(ily);
            GXD gxd = new GXD(this);
            this.A08 = gxd;
            RecyclerView recyclerView3 = this.A04;
            this.A06 = new Hcx(recyclerView3, gxd, this);
            GWF gwf = new GWF(this);
            this.A0E = gwf;
            gwf.A05(recyclerView3);
            this.A04.A1F(this.A08);
            GYG gyg = new GYG();
            this.A0G = gyg;
            this.A08.A05 = gyg;
            GYJ gyj = new GYJ(this, 1);
            GYJ gyj2 = new GYJ(this, 2);
            gyg.A00.add(gyj);
            this.A0G.A00.add(gyj2);
            HpF hpF = this.A09;
            this.A04.setImportantForAccessibility(2);
            hpF.A00 = new GYF(hpF);
            ViewPager2 viewPager2 = hpF.A04;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            GYG gyg2 = this.A0G;
            gyg2.A00.add(this.A05);
            GYK gyk = new GYK(this.A02);
            this.A07 = gyk;
            this.A0G.A00.add(gyk);
            RecyclerView recyclerView4 = this.A04;
            attachViewToParent(recyclerView4, 0, recyclerView4.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int A02() {
        int width;
        int paddingRight;
        RecyclerView recyclerView = this.A04;
        if (this.A02.A01 == 1) {
            width = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingRight = recyclerView.getPaddingBottom();
        } else {
            width = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingRight = recyclerView.getPaddingRight();
        }
        return width - paddingRight;
    }

    public void A03() {
        JiG jiG = this.A0E;
        if (jiG == null) {
            throw AnonymousClass001.A0N("Design assumption violated.");
        }
        View A08 = jiG.A08(this.A02);
        if (A08 != null) {
            int A0G = 2XA.A0G(A08);
            if (A0G != this.A00 && this.A08.A02 == 0) {
                this.A0G.A01(A0G);
            }
            this.A0A = false;
        }
    }

    public void A04(int i) {
        A05(i, true);
    }

    public void A05(int i, boolean z) {
        HFy hFy;
        2Xd r0 = this.A04.A0C;
        if (r0 == null) {
            float f = 0.0f / 0.0f;
            if (this.A0C != -1) {
                this.A0C = Math.max(i, 0);
                return;
            }
            return;
        }
        if (r0.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), r0.getItemCount() - 1);
            int i2 = this.A00;
            if (min == i2 && this.A08.A02 == 0) {
                return;
            }
            if (min == i2 && z) {
                return;
            }
            double d = i2;
            this.A00 = min;
            this.A09.A00();
            GXD gxd = this.A08;
            if (gxd.A02 != 0) {
                GXD.A01(gxd);
                Hcy hcy = gxd.A04;
                d = hcy.A02 + hcy.A00;
            }
            GXD gxd2 = this.A08;
            int i3 = 3;
            if (z) {
                i3 = 2;
            }
            gxd2.A00 = i3;
            boolean z2 = false;
            if (gxd2.A03 != min) {
                z2 = true;
            }
            gxd2.A03 = min;
            GXD.A02(gxd2, 2);
            if (z2 && (hFy = gxd2.A05) != null) {
                hFy.A01(min);
            }
            if (!z) {
                this.A04.A0u(min);
                return;
            }
            double d2 = min;
            double abs = Math.abs(d2 - d);
            RecyclerView recyclerView = this.A04;
            if (abs <= 3.0d) {
                recyclerView.A0w(min);
                return;
            }
            int i4 = min + 3;
            if (d2 > d) {
                i4 = min - 3;
            }
            recyclerView.A0u(i4);
            RecyclerView recyclerView2 = this.A04;
            recyclerView2.post(new Iv9(recyclerView2, min));
        }
    }

    public void A06(2Xd r302) {
        2Xd r0 = this.A04.A0C;
        HpF hpF = this.A09;
        if (r0 != null) {
            r0.D5v(hpF.A00);
            r0.D5v(this.A03);
        }
        this.A04.A16(r302);
        this.A00 = 0;
        A00();
        HpF hpF2 = this.A09;
        hpF2.A00();
        r302.CcA(hpF2.A00);
        r302.CcA(this.A03);
    }

    public void A07(HFy hFy) {
        this.A05.A00.add(hFy);
    }

    public void A08(JDr jDr) {
        if (!this.A0H) {
            this.A0F = this.A04.A0E;
            this.A0H = true;
        }
        this.A04.A1A(null);
        GYK gyk = this.A07;
        if (jDr != gyk.A00) {
            gyk.A00 = jDr;
            GXD gxd = this.A08;
            GXD.A01(gxd);
            Hcy hcy = gxd.A04;
            double d = hcy.A02 + hcy.A00;
            int i = (int) d;
            float f = (float) (d - i);
            this.A07.A02(i, f, GOn.A03(A02(), f));
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.A04.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.A04.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).A01;
            sparseArray.put(this.A04.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        A00();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return JQw.A00(62);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.A09.A04;
        2Xd r0 = viewPager2.A04.A0C;
        int i2 = 1;
        if (r0 != null) {
            boolean A1V = 4YV.A1V(viewPager2.A02.A01, 1);
            i = r0.getItemCount();
            if (A1V) {
                i2 = i;
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false, 0));
        2Xd r02 = viewPager2.A04.A0C;
        if (r02 == null || (itemCount = r02.getItemCount()) == 0 || !viewPager2.A0B) {
            return;
        }
        if (viewPager2.A00 > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.A00 < itemCount - 1) {
            accessibilityNodeInfo.addAction(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        Rect rect = this.A0J;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.A0I;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.A04.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.A0A) {
            A03();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.A04, i, i2);
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        int measuredState = this.A04.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0C = savedState.A00;
        this.A0D = savedState.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.viewpager2.widget.ViewPager2$SavedState] */
    /* JADX WARN: Type inference failed for: r306v0 */
    /* JADX WARN: Type inference failed for: r306v1 */
    /* JADX WARN: Type inference failed for: r306v2, types: [android.os.Bundle] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A01 = this.A04.getId();
        int i = this.A0C;
        if (i == -1) {
            i = this.A00;
        }
        baseSavedState.A00 = i;
        Parcelable parcelable = this.A0D;
        if (parcelable == 0) {
            GWk gWk = this.A04.A0C;
            if (gWk instanceof JCa) {
                GWk gWk2 = (JCa) gWk;
                C00p c00p = gWk2.A04;
                int A00 = c00p.A00();
                C00p c00p2 = gWk2.A06;
                parcelable = new Bundle(A00 + c00p2.A00());
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= c00p.A00()) {
                        break;
                    }
                    long A02 = c00p.A02(i3);
                    Fragment fragment = (Fragment) c00p.A05(A02);
                    if (fragment != null && fragment.isAdded()) {
                        gWk2.A07.A11((Bundle) parcelable, fragment, AnonymousClass001.A0h(AnonymousClass001.A0n("f#"), A02));
                    }
                    i2 = i3 + 1;
                }
                for (int i4 = 0; i4 < c00p2.A00(); i4++) {
                    long A022 = c00p2.A02(i4);
                    if (A022 >= 0) {
                        gWk2.getItemCount();
                        if (A022 < 2) {
                            parcelable.putParcelable(AnonymousClass001.A0h(AnonymousClass001.A0n("s#"), A022), (Parcelable) c00p2.A05(A022));
                        }
                    }
                }
            }
            return baseSavedState;
        }
        baseSavedState.A02 = parcelable;
        return baseSavedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw 1BK.A0i(AnonymousClass001.A0X(this), " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        HpF hpF = this.A09;
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ViewPager2 viewPager2 = hpF.A04;
        int i2 = viewPager2.A00;
        int i3 = i2 + 1;
        if (i == 8192) {
            i3 = i2 - 1;
        }
        if (!viewPager2.A0B) {
            return true;
        }
        viewPager2.A05(i3, true);
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.A09.A00();
    }
}
