package com.facebook.rtc.views.omnigrid;

import X.03Y;
import X.07C;
import X.07E;
import X.07I;
import X.0Pz;
import X.0Q8;
import X.0QD;
import X.0RC;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Fj;
import X.2NB;
import X.2NQ;
import X.2Qa;
import X.2XA;
import X.4YU;
import X.5Vt;
import X.7zO;
import X.8KZ;
import X.8Lu;
import X.9eW;
import X.AbJ;
import X.AnonymousClass001;
import X.C00j;
import X.C01i;
import X.C0ty;
import X.C13h;
import X.C2621GjB;
import X.C2626GjK;
import X.C2628GjQ;
import X.C2631Gjg;
import X.C2632Gji;
import X.C2lg;
import X.C9lt;
import X.DKE;
import X.DqJ;
import X.GOn;
import X.GOo;
import X.GV0;
import X.GXp;
import X.Gj9;
import X.GjT;
import X.Gz6;
import X.Gz7;
import X.Gz8;
import X.GzB;
import X.GzD;
import X.H5G;
import X.HFe;
import X.Hwo;
import X.I6F;
import X.J4j;
import X.J8g;
import X.JIi;
import X.JKR;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.messaging.rtc.views.rtcomnigridview.RtcOmniGridView;
import com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: OmniGridLayoutManager.class */
public final class OmniGridLayoutManager extends 2XA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MotionEvent A04;
    public 8KZ A05;
    public 8Lu A06;
    public C2632Gji A07;
    public C2632Gji A08;
    public ImmutableList A09;
    public Map A0A;
    public Map A0B;
    public 03Y A0C;
    public boolean A0D;
    public final Context A0E;
    public final Set A0F;
    public final Function1 A0G;

    public OmniGridLayoutManager(Context context, Function1 function1) {
        this.A0E = context;
        this.A0G = function1;
        A10(false);
        GzB A10 = GOn.A10(20);
        GzB A102 = GOn.A10(20);
        GzB A103 = GOn.A10(20);
        GzB A104 = GOn.A10(20);
        GzB A105 = GOn.A10(10);
        GzB A106 = GOn.A10(10);
        GzB A107 = GOn.A10(0);
        GzB A108 = GOn.A10(0);
        GridSelfViewLocation gridSelfViewLocation = GridSelfViewLocation.TOP_RIGHT;
        this.A06 = new 8Lu(new C2631Gjg(gridSelfViewLocation, A10, A102, A103, A104, A105, A106, A107, A108, null, false, false, false, false), J8g.A00);
        this.A0F = GOn.A1J();
        C0ty c0ty = C0ty.A00;
        Integer num = 0S2.A00;
        this.A07 = new C2632Gji(null, gridSelfViewLocation, num, num, null, c0ty, null, 0, 0, 0, false);
        this.A08 = new C2632Gji(null, gridSelfViewLocation, num, num, null, c0ty, null, 0, 0, 0, false);
        this.A0A = 1BK.A1C();
        this.A0B = 1BK.A1C();
        this.A00 = -1;
        this.A01 = -1;
        this.A09 = 1BK.A0b();
    }

    private final void A00(int i) {
        int i2 = this.A00;
        if (i != i2) {
            0fH.A0m("OmniGridLayoutManager", 0Pz.A0C(i2, i, "Updating contentOffsetX from ", " to "));
            this.A00 = i;
        }
    }

    private final void A01(int i) {
        int i2 = this.A01;
        if (i != i2) {
            0fH.A0m("OmniGridLayoutManager", 0Pz.A0C(i2, i, "Updating contentOffsetY from ", " to "));
            this.A01 = i;
        }
    }

    private final void A02(2NB r302) {
        int i;
        C00j.A05("OmniGridLayoutManager.updateVisibleItems", 1857655630);
        try {
            C2626GjK A1g = A1g();
            0fH.A0m("OmniGridLayoutManager", AnonymousClass001.A0Z(A1g, "Updating visible items, visibleRect: ", AnonymousClass001.A0k()));
            ImmutableList.Builder A0h = 4YU.A0h();
            ArrayList A0s = AnonymousClass001.A0s();
            LinkedHashMap A1C = 1BK.A1C();
            int A0U = A0U();
            for (int i2 = 0; i2 < A0U; i2++) {
                View A0d = A0d(i2);
                if (A0d != null) {
                    1BK.A1O(Integer.valueOf(i2), A1C, 2XA.A0G(A0d));
                }
            }
            int i3 = 0;
            for (C2628GjQ c2628GjQ : this.A07.A09) {
                int i4 = i3 + 1;
                Integer num = (Integer) GOo.A0s(A1C, i3);
                if (c2628GjQ.A02.A00(A1g) > 0.0f || c2628GjQ.A05) {
                    if (num == null) {
                        AnonymousClass001.A1J(A0s, i3);
                    }
                    A0h.m11011add((Object) Integer.valueOf(i3));
                } else if (num != null) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Removing view at position: ");
                    A0k.append(i3);
                    1BL.A1I(num, ", index: ", "OmniGridLayoutManager", A0k);
                    View A0d2 = A0d(num.intValue());
                    A0k(A0d2);
                    if (A0d2 != null) {
                        r302.A09(A0d2);
                    }
                }
                i3 = i4;
            }
            07E A07 = 07C.A07(0, A0U());
            ArrayList A0s2 = AnonymousClass001.A0s();
            07I it = A07.iterator();
            while (it.hasNext()) {
                View A0d3 = A0d(it.A00());
                if (A0d3 != null) {
                    A0s2.add(A0d3);
                }
            }
            ArrayList A10 = 7zO.A10(A0s2, 0);
            int size = A10.size() - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                C2628GjQ c2628GjQ2 = (C2628GjQ) this.A07.A09.get(2XA.A0G((View) A10.get(i5)));
                i5++;
                if (c2628GjQ2.A00 > ((C2628GjQ) this.A07.A09.get(2XA.A0G((View) A10.get(i5)))).A00) {
                    Iterator it2 = A10.iterator();
                    while (it2.hasNext()) {
                        int A05 = ((2XA) this).A05.A05((View) it2.next());
                        if (A05 >= 0) {
                            ((2XA) this).A05.A08(A05);
                        }
                    }
                    if (A10.size() > 1) {
                        0RC.A0y(A10, new J4j(this, 12));
                    }
                    Iterator it3 = A10.iterator();
                    while (it3.hasNext()) {
                        2XA.A0K((View) it3.next(), this, -1);
                    }
                }
            }
            Iterator it4 = A0s.iterator();
            while (it4.hasNext()) {
                int A0F = DKE.A0F(it4);
                0fH.A0m("OmniGridLayoutManager", 0Pz.A0T("Adding view at ", A0F));
                View A00 = 2NB.A00(r302, A0F);
                11T.A0A(A00);
                int i6 = C2632Gji.A02(this.A07, A0F).A00;
                int A0U2 = A0U();
                int i7 = 0;
                while (true) {
                    if (i7 >= A0U2) {
                        i7 = A0U();
                        break;
                    }
                    View A0d4 = A0d(i7);
                    if (A0d4 != null) {
                        if (C2632Gji.A02(this.A07, 2XA.A0G(A0d4)).A00 >= i6) {
                            break;
                        }
                    }
                    i7++;
                }
                A0l(A00, i7);
            }
            int A0U3 = A0U();
            for (int i8 = 0; i8 < A0U3; i8++) {
                View A0d5 = A0d(i8);
                if (A0d5 != null) {
                    int A0G = 2XA.A0G(A0d5);
                    int A0G2 = 2XA.A0G(A0d5);
                    boolean z = C2632Gji.A02(this.A07, A0G).A05;
                    C00j.A05("OmniGridLayoutManager.layoutView", -623856188);
                    try {
                        C2626GjK c2626GjK = C2632Gji.A02(this.A07, A0G2).A02;
                        int i9 = 0;
                        if (z) {
                            i = 0;
                        } else {
                            i = -A1g.A01;
                            i9 = -A1g.A03;
                        }
                        int i10 = c2626GjK.A01;
                        int i11 = i10 + i;
                        int i12 = c2626GjK.A03;
                        int i13 = i12 + i9;
                        if (!A0d5.isLayoutRequested() && c2626GjK.A02 - i10 == A0d5.getWidth() && c2626GjK.A00 - i12 == A0d5.getHeight()) {
                            if (A0d5.getLeft() != i11) {
                                Iterator it5 = this.A0F.iterator();
                                while (it5.hasNext()) {
                                    ((HFe) it5.next()).A00(A0G2);
                                }
                                A0d5.offsetLeftAndRight(i11 - A0d5.getLeft());
                            }
                            if (A0d5.getTop() != i13) {
                                Iterator it6 = this.A0F.iterator();
                                while (it6.hasNext()) {
                                    ((HFe) it6.next()).A00(A0G2);
                                }
                                A0d5.offsetTopAndBottom(i13 - A0d5.getTop());
                            }
                        } else {
                            Set set = this.A0F;
                            Iterator it7 = set.iterator();
                            while (it7.hasNext()) {
                                it7.next();
                            }
                            int i14 = c2626GjK.A02;
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i10, 1073741824);
                            int i15 = c2626GjK.A00;
                            A0d5.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15 - i12, 1073741824));
                            Iterator it8 = set.iterator();
                            while (it8.hasNext()) {
                                ((HFe) it8.next()).A00(A0G2);
                            }
                            2XA.A0I(A0d5, i11, i13, i14 + i, i15 + i9);
                        }
                        C00j.A01(-1162334964);
                    } catch (Throwable th) {
                        C00j.A01(-2004132400);
                        throw th;
                    }
                }
            }
            this.A09 = 1Fj.A01(A0h);
            Iterator it9 = this.A0F.iterator();
            while (it9.hasNext()) {
                it9.next();
            }
            C00j.A01(-1285855510);
        } catch (Throwable th2) {
            C00j.A01(-414916334);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0.contains((int) r0.getX(), (int) r0.getY()) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A03() {
        /*
            r301 = this;
            r0 = r301
            android.view.MotionEvent r0 = r0.A04
            r302 = r0
            r0 = r301
            X.Gji r0 = r0.A07
            r303 = r0
            r0 = r303
            android.graphics.Rect r0 = r0.A00
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L39
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r302
            float r0 = r0.getX()
            int r0 = (int) r0
            r305 = r0
            r0 = r302
            float r0 = r0.getY()
            int r0 = (int) r0
            r306 = r0
            r0 = r304
            r1 = r305
            r2 = r306
            boolean r0 = r0.contains(r1, r2)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L3c
        L39:
            r0 = 1
            r306 = r0
        L3c:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigrid.OmniGridLayoutManager.A03():boolean");
    }

    private final boolean A04(int i, int i2, int i3) {
        if (i >= this.A07.A09.size()) {
            0fH.A0n("OmniGridLayoutManager", 0Pz.A0T("Cannot scroll to ", i));
            return false;
        }
        C2626GjK c2626GjK = C2632Gji.A02(this.A07, i).A02;
        int i4 = c2626GjK.A01 - i2;
        int i5 = -A0X();
        int A00 = C2632Gji.A00(this);
        if (i4 < i5) {
            i4 = i5;
        } else if (i4 > A00) {
            i4 = A00;
        }
        A00(i4);
        int i6 = c2626GjK.A03 - i3;
        int i7 = -A0Z();
        int A01 = C2632Gji.A01(this);
        if (i6 < i7) {
            i6 = i7;
        } else if (i6 > A01) {
            i6 = A01;
        }
        A01(i6);
        return true;
    }

    public void A0y(RecyclerView recyclerView) {
        for (HFe hFe : this.A0F) {
            if (hFe instanceof Gz7) {
                GV0 gv0 = ((Gz7) hFe).A00;
                gv0.A0C = true;
                C2621GjB A00 = Hwo.A00(gv0.A02);
                if (A00 == null) {
                    continue;
                } else {
                    GzD gzD = gv0.A06;
                    if (gzD == null) {
                        11T.A0L("gridSelfItemDefinition");
                        throw 0Q8.createAndThrow();
                    }
                    gzD.A01(gv0, A00, gv0);
                }
            }
        }
    }

    public int A15(2NB r302, 2NQ r303, int i) {
        int i2;
        int i3;
        11T.A0F(r302, 1);
        C00j.A05("OmniGridLayoutManager.scrollHorizontallyBy", 1591770204);
        try {
            if (A03()) {
                int i4 = this.A00 + i;
                int i5 = -A0X();
                int A00 = C2632Gji.A00(this);
                if (i4 < i5) {
                    i4 = i5;
                } else if (i4 > A00) {
                    i4 = A00;
                }
                i2 = i4 - this.A00;
                if (i2 != 0) {
                    A00(i4);
                    A02(r302);
                    0fH.A0m("OmniGridLayoutManager", 0Pz.A0q("scrollHorizontallyBy: dx: ", ", result: ", ", contentOffsetX: ", i, i2, this.A00));
                    i3 = 437231449;
                    C00j.A01(i3);
                    return i2;
                }
            }
            i2 = 0;
            i3 = 200977065;
            C00j.A01(i3);
            return i2;
        } catch (Throwable th) {
            C00j.A01(-2095536464);
            throw th;
        }
    }

    public int A16(2NB r302, 2NQ r303, int i) {
        int i2;
        int i3;
        11T.A0F(r302, 1);
        C00j.A05("OmniGridLayoutManager.scrollVerticallyBy", 184863535);
        try {
            if (A03()) {
                int i4 = this.A01 + i;
                int i5 = -A0Z();
                int A01 = C2632Gji.A01(this);
                if (i4 < i5) {
                    i4 = i5;
                } else if (i4 > A01) {
                    i4 = A01;
                }
                i2 = i4 - this.A01;
                if (i2 != 0) {
                    A01(i4);
                    A02(r302);
                    0fH.A0m("OmniGridLayoutManager", 0Pz.A0q("scrollVerticallyBy: dy: ", ", result: ", ", contentOffsetY: ", i, i2, this.A01));
                    i3 = -130360530;
                    C00j.A01(i3);
                    return i2;
                }
            }
            i2 = 0;
            i3 = 1718081848;
            C00j.A01(i3);
            return i2;
        } catch (Throwable th) {
            C00j.A01(-348967628);
            throw th;
        }
    }

    public C2lg A1F() {
        return new C2lg(-2, -2);
    }

    public void A1L(int i) {
        if (A04(i, 0, 0)) {
            A0e();
        }
    }

    public void A1O(AccessibilityEvent accessibilityEvent) {
        11T.A0F(accessibilityEvent, 0);
        super.A1O(accessibilityEvent);
        if (this.A09.size() > 0) {
            Object A0D = 0QD.A0D(this.A09);
            11T.A0A(A0D);
            accessibilityEvent.setFromIndex(AnonymousClass001.A03(A0D));
            Object A0F = 0QD.A0F(this.A09);
            11T.A0A(A0F);
            accessibilityEvent.setToIndex(AnonymousClass001.A03(A0F));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1R(2NB r302, 2NQ r303) {
        Function1 function1;
        C2626GjK c2626GjK;
        Integer num;
        Object obj;
        long j;
        C2626GjK c2626GjK2;
        boolean A1X = 1BL.A1X(r302, r303);
        C00j.A05("OmniGridLayoutManager.onLayoutChildren", 1226678599);
        try {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("onLayoutChildren state: ");
            A0k.append(r303);
            A0k.append(", width: ");
            A0k.append(((2XA) this).A03);
            A0k.append(", height: ");
            0fH.A0j("OmniGridLayoutManager", GOn.A1B(A0k, ((2XA) this).A00));
            this.A0D = A1X;
            C00j.A05("OmniGridLayoutManager.recomputeLayout", -779338742);
            try {
                07E A07 = 07C.A07(0, r303.A00());
                Function1 function12 = this.A0G;
                ArrayList A0z = 1BL.A0z(A07);
                Iterator it = A07.iterator();
                while (it.hasNext()) {
                    A0z.add(function12.invoke(it.next()));
                }
                GridLayoutInput gridLayoutInput = new GridLayoutInput(A0z, ((C2631Gjg) this.A06.A00).A01(this.A0E), ((2XA) this).A03, ((2XA) this).A00);
                this.A08 = this.A07;
                this.A0B = this.A0A;
                this.A0A = 1BK.A1C();
                03Y A1G = 1BK.A1G(this.A06, gridLayoutInput);
                if (!A1G.equals(this.A0C)) {
                    1BL.A1I(gridLayoutInput, "Recomputing Recyclerlayout with ", "OmniGridLayoutManager", AnonymousClass001.A0k());
                    this.A0C = A1G;
                    List list = gridLayoutInput.items;
                    int i = gridLayoutInput.width;
                    int i2 = gridLayoutInput.height;
                    if (!gridLayoutInput.config.skipsDefaultGridLayout) {
                        if (list.isEmpty()) {
                            C0ty c0ty = C0ty.A00;
                            Integer num2 = 0S2.A00;
                            new C2632Gji(null, GridSelfViewLocation.TOP_RIGHT, num2, num2, null, c0ty, null, i, i2, 0, false);
                        } else {
                            GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput = gridLayoutInput.config;
                            boolean z = gridLayoutConfigForLayoutInput.appliesPaddingToFullscreenLayout;
                            Integer num3 = (!z || (gridLayoutConfigForLayoutInput.verticalSpacing == 0 && gridLayoutConfigForLayoutInput.horizontalSpacing == 0)) ? 0 : null;
                            if (z) {
                                new C2626GjK(gridLayoutConfigForLayoutInput.leftPadding, gridLayoutConfigForLayoutInput.topPadding, gridLayoutInput.width - gridLayoutConfigForLayoutInput.rightPadding, gridLayoutInput.height - gridLayoutConfigForLayoutInput.bottomPadding);
                            } else {
                                new C2626GjK(0, 0, gridLayoutInput.width, gridLayoutInput.height);
                            }
                            if (list.size() == A1X) {
                                GridLayoutInputItem gridLayoutInputItem = (GridLayoutInputItem) 0QD.A0D(list);
                                if (gridLayoutInput.config.aspectFillFullscreenSingleItem) {
                                    11T.A0F(gridLayoutInputItem, 0);
                                    boolean A1U = AbJ.A1U(i2, i);
                                    GridItemSize gridItemSize = gridLayoutInputItem.videoSize;
                                    int i3 = gridItemSize.height;
                                    int i4 = gridItemSize.width;
                                    if (!((i3 >= i4) ^ A1U) || gridLayoutInputItem.isVideoOff) {
                                        j = gridLayoutInputItem.id;
                                        new C2626GjK(0, 0, i, i2);
                                    } else if (A1U) {
                                        float f = i3 * ((i * 1.0f) / i4);
                                        float f2 = (i2 / 2) - (f / 2.0f);
                                        float f3 = f + f2;
                                        j = gridLayoutInputItem.id;
                                        new C2626GjK(0, (int) f2, i, (int) f3);
                                    } else {
                                        float f4 = i4 * ((i2 * 1.0f) / i3);
                                        float f5 = (i / 2) - (f4 / 2.0f);
                                        float f6 = f4 + f5;
                                        j = gridLayoutInputItem.id;
                                        new C2626GjK((int) f5, 0, (int) f6, i2);
                                    }
                                    Integer num4 = 0S2.A0u;
                                    num = 0S2.A00;
                                    new C2628GjQ(c2626GjK2, num4, num, 0, j, false);
                                } else {
                                    long j2 = gridLayoutInputItem.id;
                                    Integer num5 = 0S2.A0u;
                                    num = 0S2.A00;
                                    new C2628GjQ(c2626GjK, num5, num, 0, j2, false);
                                }
                                new C2632Gji(null, GridSelfViewLocation.TOP_RIGHT, num, num, num3, 11T.A03(obj), null, i, i2, 0, false);
                            } else if (list.size() == 2 && gridLayoutInput.config.forcesHorizontalLayoutForTwoPersonLayout) {
                                ArrayList A0s = AnonymousClass001.A0s();
                                boolean z2 = ((GridLayoutInputItem) 0QD.A0D(list)).isSelf;
                                GridLayoutInputItem gridLayoutInputItem2 = (GridLayoutInputItem) (z2 ? 0QD.A0D(list) : 0QD.A0F(list));
                                GridLayoutInputItem gridLayoutInputItem3 = (GridLayoutInputItem) (z2 ? 0QD.A0F(list) : 0QD.A0D(list));
                                long j3 = gridLayoutInputItem2.id;
                                int i5 = i / 2;
                                C2626GjK c2626GjK3 = new C2626GjK(0, 0, i5, i2);
                                Integer num6 = 0S2.A0u;
                                Integer num7 = 0S2.A00;
                                A0s.add(new C2628GjQ(c2626GjK3, num6, num7, 0, j3, false));
                                A0s.add(new C2628GjQ(new C2626GjK(i5, 0, i, i2), num6, num7, 0, gridLayoutInputItem3.id, false));
                                new C2632Gji(null, GridSelfViewLocation.TOP_RIGHT, num7, num7, num3, A0s, null, i, i2, 0, false);
                            } else if (list.size() == 2 && !gridLayoutInput.config.disablesFloatingSelfView) {
                                ArrayList A0s2 = AnonymousClass001.A0s();
                                boolean z3 = ((GridLayoutInputItem) 0QD.A0D(list)).isSelf;
                                GridLayoutInputItem gridLayoutInputItem4 = (GridLayoutInputItem) (z3 ? 0QD.A0D(list) : 0QD.A0F(list));
                                long j4 = ((GridLayoutInputItem) (z3 ? 0QD.A0F(list) : 0QD.A0D(list))).id;
                                Integer num8 = 0S2.A0u;
                                Integer num9 = 0S2.A00;
                                A0s2.add(new C2628GjQ(c2626GjK, num8, num9, 0, j4, false));
                                A0s2.add(!z3 ? 1 : 0, new C2628GjQ(new C2626GjK(i, 0, i, 0), num8, num9, 0, gridLayoutInputItem4.id, false));
                                new C2632Gji(null, gridLayoutConfigForLayoutInput.selfViewLocation, 0S2.A0C, num9, num3, A0s2, null, i, i2, 0, false);
                            }
                        }
                        this.A07 = r318;
                        1BL.A1I(r318, "Computed layout output: ", "OmniGridLayoutManager", AnonymousClass001.A0k());
                    }
                    C2632Gji c2632Gji = (C2632Gji) ((Function1) this.A06.A01).invoke(gridLayoutInput);
                    this.A07 = c2632Gji;
                    1BL.A1I(c2632Gji, "Computed layout output: ", "OmniGridLayoutManager", AnonymousClass001.A0k());
                }
                C00j.A01(2046265774);
                int i6 = this.A00;
                this.A02 = i6;
                this.A03 = this.A01;
                8KZ r0 = this.A05;
                this.A05 = null;
                if (r0 != null) {
                    A04(r0.A01, r0.A02, r0.A03);
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("Restored scroll position with ");
                    A0k2.append(r0);
                    A0k2.append(", contentOffsetX: ");
                    A0k2.append(this.A00);
                    A0k2.append(", contentOffsetY: ");
                    0fH.A0j("OmniGridLayoutManager", GOn.A1B(A0k2, this.A01));
                } else {
                    if (i6 == -1) {
                        i6 = -A0X();
                    } else {
                        int i7 = -A0X();
                        int A00 = C2632Gji.A00(this);
                        if (i6 < i7) {
                            i6 = i7;
                        } else if (i6 > A00) {
                            i6 = A00;
                        }
                    }
                    A00(i6);
                    int i8 = this.A01;
                    if (i8 == -1) {
                        i8 = -A0Z();
                    } else {
                        int i9 = -A0Z();
                        int A01 = C2632Gji.A01(this);
                        if (i8 < i9) {
                            i8 = i9;
                        } else if (i8 > A01) {
                            i8 = A01;
                        }
                    }
                    A01(i8);
                }
                Set<HFe> set = this.A0F;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                A0s(r302);
                A02(r302);
            } catch (Throwable th) {
                th = th;
                C00j.A01(576743863);
            }
            for (HFe hFe : set) {
                if (hFe instanceof Gz7) {
                    GV0 gv0 = ((Gz7) hFe).A00;
                    GV0.A04(gv0, r303.A0B);
                    if (gv0 instanceof RtcOmniGridView) {
                        RtcOmniGridView rtcOmniGridView = (RtcOmniGridView) gv0;
                        JKR jkr = rtcOmniGridView.A00;
                        if (jkr != null) {
                            jkr.CFy();
                        }
                        JKR jkr2 = rtcOmniGridView.A00;
                        if (jkr2 != null) {
                            jkr2.CAs();
                        }
                        C01i c01i = rtcOmniGridView.A02;
                        if (((2Qa) c01i.getValue()).A05()) {
                            ((2Qa) c01i.getValue()).A01();
                        }
                        String A002 = I6F.A00(rtcOmniGridView);
                        if (A002 != null) {
                            5Vt A003 = C9lt.A00(A002);
                            OmniGridLayoutManager omniGridLayoutManager = rtcOmniGridView.A0H;
                            if (omniGridLayoutManager.A0U() == 1) {
                                View A0d = omniGridLayoutManager.A0d(0);
                                if (A0d instanceof JIi) {
                                    JIi jIi = (JIi) A0d;
                                    if (jIi != null) {
                                        H5G h5g = (H5G) jIi;
                                        FbRelativeLayout fbRelativeLayout = h5g.A06;
                                        if (fbRelativeLayout == null) {
                                            th = 1BK.A0h();
                                            throw th;
                                        }
                                        int height = fbRelativeLayout.getHeight() + h5g.getResources().getDimensionPixelSize(2132279309);
                                        11T.A0F(A003, 0);
                                        Gj9 gj9 = (Gj9) GOn.A0v(A003).A00(Gj9.class);
                                        if (gj9 == null || gj9.A00 != height) {
                                            function1 = A003.A00;
                                            new GjT(height, 1);
                                            function1.invoke(r308);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                11T.A0F(A003, 0);
                                if (GOn.A0v(A003).A00(Gj9.class) != null) {
                                    function1 = A003.A00;
                                    9eW r308 = 9eW.A00;
                                    function1.invoke(r308);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.A0D = false;
            C00j.A01(-671974183);
        } catch (Throwable th2) {
            C00j.A01(786969270);
            throw th2;
        }
    }

    public void A1S(2NB r302, RecyclerView recyclerView) {
        11T.A0F(r302, 1);
        A0z(recyclerView);
        for (HFe hFe : this.A0F) {
            if (hFe instanceof Gz7) {
                GV0 gv0 = ((Gz7) hFe).A00;
                gv0.A0C = false;
                if (Hwo.A00(gv0.A02) == null) {
                    continue;
                } else {
                    if (gv0.A06 == null) {
                        11T.A0L("gridSelfItemDefinition");
                        throw 0Q8.createAndThrow();
                    }
                    GXp gXp = gv0.A04;
                    if (gXp != null) {
                        Gz6 gz6 = (Gz6) gXp;
                        11T.A0F(gz6, 0);
                        if (gz6.A00 != null) {
                            gz6.A00 = null;
                        }
                    }
                }
            }
        }
        A0t(r302);
        r302.A04.clear();
        2NB.A02(r302);
    }

    public void A1T(2NQ r302) {
        11T.A0F(r302, 0);
        C00j.A05("OmniGridLayoutManager.onLayoutCompleted", -442689273);
        try {
            1BL.A1I(r302, "onLayoutCompleted state: ", "OmniGridLayoutManager", AnonymousClass001.A0k());
            for (HFe hFe : this.A0F) {
                if (hFe instanceof Gz8) {
                    RtcScrollableGridView rtcScrollableGridView = ((Gz8) hFe).A00;
                    if (!rtcScrollableGridView.isInLayout()) {
                        DqJ dqJ = RtcScrollableGridView.A0X;
                        rtcScrollableGridView.post(rtcScrollableGridView.A0N);
                    }
                }
            }
            C00j.A01(1775906727);
        } catch (Throwable th) {
            C00j.A01(-653964021);
            throw th;
        }
    }

    public boolean A1b() {
        return this.A07.A04 == 1 && A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (A03() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1e() {
        /*
            r301 = this;
            r0 = r301
            X.Gji r0 = r0.A07
            r302 = r0
            r0 = r302
            int r0 = r0.A04
            r303 = r0
            r0 = 2
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L1c
            r0 = r301
            boolean r0 = r0.A03()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L20
        L1c:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L20:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigrid.OmniGridLayoutManager.A1e():boolean");
    }

    public final C2626GjK A1g() {
        int A0X = this.A00 + A0X();
        int A0Z = this.A01 + A0Z();
        return new C2626GjK(A0X, A0Z, ((((2XA) this).A03 + A0X) - A0X()) - A0Y(), ((((2XA) this).A00 + A0Z) - A0Z()) - A0W());
    }

    public final void A1h() {
        Object obj;
        C2626GjK A1g = A1g();
        Iterator it = 0QD.A0i(this.A07.A09).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (((C2628GjQ) ((C13h) obj).A01).A02.A00(A1g) < 1.0f);
        C13h c13h = (C13h) obj;
        if (c13h != null) {
            int i = c13h.A00;
            if (Integer.valueOf(i) != null) {
                C2626GjK c2626GjK = C2632Gji.A02(this.A07, i).A02;
                8KZ r0 = new 8KZ(i, c2626GjK.A01 - this.A00, c2626GjK.A03 - this.A01, 1);
                this.A05 = r0;
                0fH.A0j("OmniGridLayoutManager", AnonymousClass001.A0Z(r0, "Saving state: ", AnonymousClass001.A0k()));
            }
        }
    }
}
