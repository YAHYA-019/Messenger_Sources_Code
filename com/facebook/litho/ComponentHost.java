package com.facebook.litho;

import X.02L;
import X.0AE;
import X.0FI;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Im;
import X.1LI;
import X.1LV;
import X.1LZ;
import X.1Lc;
import X.1rB;
import X.1sP;
import X.25F;
import X.29K;
import X.2JG;
import X.2JK;
import X.2Q8;
import X.3vD;
import X.54I;
import X.5B4;
import X.AnonymousClass001;
import X.C02423v5;
import X.C02433v6;
import X.C02A;
import X.C0Ad;
import X.C0Ak;
import X.C0ty;
import X.C1qv;
import X.C1qz;
import X.C1r9;
import X.C1rj;
import X.C29f;
import X.C2kg;
import X.C2ks;
import X.C53s;
import X.Jux;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: ComponentHost.class */
public class ComponentHost extends C1qv implements C1qz {
    public static boolean A0Q;
    public float A00;
    public float A01;
    public SparseArray A02;
    public 0AE A03;
    public 0AE A04;
    public 0AE A05;
    public 3vD A06;
    public 54I A07;
    public C2kg A08;
    public 5B4 A09;
    public 1Im A0A;
    public C02423v5 A0B;
    public CharSequence A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int[] A0K;
    public final 0AE A0L;
    public final 0AE A0M;
    public final 0AE A0N;
    public final C1r9 A0O;
    public final Integer A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentHost(Context context, AttributeSet attributeSet, Integer num) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        setClipChildren(true);
        this.A0P = num;
        this.A0M = new 0AE(10);
        this.A0N = new 0AE(10);
        this.A0L = new 0AE(10);
        this.A0O = new C1r9(this);
        this.A0K = new int[0];
        this.A00 = Float.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        setWillNotDraw(C02A.defaultInstance.A0G);
        setChildrenDrawingOrderEnabled(true);
        A0Y(1rB.A00(context));
    }

    private final ArrayList A0I() {
        CharSequence charSequence;
        ArrayList A0s = AnonymousClass001.A0s();
        0AE r0 = this.A0L;
        int A00 = r0.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                CharSequence charSequence2 = this.A0C;
                if (charSequence2 != null) {
                    A0s.add(charSequence2);
                }
                return A0s;
            }
            Object A05 = r0.A05(i2);
            if (A05 == null) {
                throw 1BK.A0e();
            }
            2JG r02 = (2JG) A05;
            11T.A0F(r02, 0);
            29K r03 = 2JK.A00(r02.A01).A05;
            if (r03 != null && (charSequence = r03.A0a) != null) {
                A0s.add(charSequence);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.AbstractCollection] */
    private final void A0J() {
        Integer num;
        if (this.A0J || (num = this.A0P) == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                throw new RuntimeException("Should not modify component host outside of the Litho View Attributes Extensions. Let us know if your use case is valid");
            }
            return;
        }
        1Lc r0 = 1Lc.A02;
        long currentTimeMillis = System.currentTimeMillis();
        if (r0.compareTo(1LZ.A00()) >= 0) {
            Set set = 1LZ.A00;
            if (set.isEmpty()) {
                return;
            }
            List list = null;
            for (Object obj : set) {
                String[] strArr = ((1LV) obj).A00;
                if (02L.A0C("Litho.DebugInfo", strArr) || 02L.A0C("*", strArr)) {
                    if (list == null) {
                        list = AnonymousClass001.A0s();
                    }
                    list.add(obj);
                }
            }
            if (list == null) {
                list = C0ty.A00;
            }
            if (1BK.A1Y(list)) {
                LinkedHashMap A1C = 1BK.A1C();
                A1C.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "unsafe-component-host-modification");
                Jux jux = new Jux(r0, "Litho.DebugInfo", ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL, A1C, currentTimeMillis);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    1LV.A00(jux, it);
                }
            }
        }
    }

    public static final void A0K(View view, ComponentHost componentHost) {
        componentHost.A0H = true;
        if (componentHost.A0G) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
        view.setDuplicateParentStateEnabled(false);
        if (view instanceof ComponentHost) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.addStatesFromChildren()) {
                viewGroup.setAddStatesFromChildren(false);
            }
        }
    }

    public static final void A0L(0AE r301, 0AE r302, int i) {
        Object A00;
        if (r301 == null || r302 == null || (A00 = C0Ak.A00(r301, i)) == null) {
            return;
        }
        r302.A09(i, A00);
    }

    public static final void A0M(0AE r301, 0AE r302, int i, int i2) {
        Object A00;
        11T.A0F(r301, 2);
        if (r302 == null || C0Ak.A00(r302, i) == null) {
            A00 = C0Ak.A00(r301, i);
            r301.A08(i);
        } else {
            A00 = C0Ak.A00(r302, i);
            r302.A08(i);
        }
        if (A00 != null) {
            r301.A09(i2, A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A00() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0N(com.facebook.litho.ComponentHost r301) {
        /*
            r0 = r301
            X.0AE r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            int r0 = r0.A00()
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
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L23
            r0 = r301
            r1 = 0
            r0.A04 = r1
        L23:
            r0 = r301
            X.0AE r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3a
            r0 = r302
            int r0 = r0.A00()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3a
            r0 = r301
            r1 = 0
            r0.A05 = r1
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.A0N(com.facebook.litho.ComponentHost):void");
    }

    public static final void A0O(ComponentHost componentHost, 25F r302) {
        3vD r0;
        1LI r02 = r302.A03;
        if (r302.A0K() && (r02 instanceof C1rj) && ((C1rj) r02).A1W()) {
            componentHost.A0F = true;
        }
        if (componentHost.A0I && componentHost.A0F && (r0 = componentHost.A06) != null) {
            r0.A0e();
        }
        if (componentHost.A0M.A00() == 0) {
            componentHost.A0F = false;
        }
    }

    public static final void A0P(ComponentHost componentHost, 2JG r302, int i) {
        C02423v5 c02423v5;
        0AE r304;
        if (componentHost.A0B == null || componentHost.equals(r302.A04) || (c02423v5 = componentHost.A0B) == null) {
            return;
        }
        0AE r0 = c02423v5.A00;
        if (r0 == null || C0Ak.A00(r0, i) == null) {
            r304 = c02423v5.A01;
        } else {
            r304 = c02423v5.A00;
            if (r304 == null) {
                return;
            }
        }
        r304.A08(i);
    }

    @Override // X.C1qv
    public void A0V() {
        this.A0G = true;
    }

    @Override // X.C1qv
    public void A0W() {
        this.A0G = false;
    }

    @Override // X.C1qv
    public void A0X(2JG r302, int i) {
        Rect rect = r302.A01.A03;
        11T.A0F(rect, 2);
        Object obj = r302.A04;
        25F A00 = 2JK.A00(r302.A01);
        if (obj instanceof Drawable) {
            1sP.A00();
            this.A0L.A09(i, r302);
            11T.A0I(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            Drawable drawable = (Drawable) obj;
            2JK.A00(r302.A01);
            boolean z = false;
            if (getVisibility() == 0) {
                z = true;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            invalidate(rect);
        } else if (obj instanceof View) {
            this.A0N.A09(i, r302);
            View view = (View) obj;
            int i2 = A00.A00;
            if ((i2 & 1) == 1) {
                view.setDuplicateParentStateEnabled(true);
                this.A0E = true;
            }
            boolean z2 = view instanceof ComponentHost;
            if (z2 && (i2 & 16) == 16) {
                ((ViewGroup) view).setAddStatesFromChildren(true);
            }
            this.A0H = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            boolean z3 = this.A0G;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z3) {
                super.addViewInLayout(view, -1, layoutParams, true);
                invalidate();
            } else {
                super.addView(view, -1, layoutParams);
            }
            if (C29f.A00(r302.A01.A07).A04 != null && !equals(obj)) {
                if (this.A0B == null) {
                    C02423v5 c02423v5 = new C02423v5(this);
                    this.A0B = c02423v5;
                    setTouchDelegate(c02423v5);
                }
                C02423v5 c02423v52 = this.A0B;
                if (c02423v52 != null) {
                    11T.A0I(obj, "null cannot be cast to non-null type android.view.View");
                    c02423v52.A01.A09(i, new C02433v6(view, r302));
                }
            }
            if (!z2) {
                Object tag = view.getTag(2131363225);
                29K r306 = tag instanceof 29K ? (29K) tag : null;
                if (this.A0I && r306 != null) {
                    Rect rect2 = 3vD.A03;
                    C0Ad.A0B(view, new 3vD(view, r306, view.getImportantForAccessibility(), view.isFocusable()));
                }
            }
        }
        this.A0M.A09(i, r302);
        r302.A00 = this;
        A0O(this, A00);
    }

    public final void A0Y(boolean z) {
        3vD r304;
        29K r0;
        if (z == this.A0I) {
            return;
        }
        if (z) {
            r304 = this.A06;
            if (r304 == null) {
                Rect rect = 3vD.A03;
                r304 = new 3vD(this, (29K) null, getImportantForAccessibility(), isFocusable());
                this.A06 = r304;
            }
        } else {
            r304 = null;
        }
        C0Ad.A0B(this, r304);
        this.A0I = z;
        if (!z) {
            return;
        }
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = getChildAt(i2);
            if (childAt instanceof ComponentHost) {
                ((ComponentHost) childAt).A0Y(true);
            } else {
                Object tag = childAt.getTag(2131363225);
                if ((tag instanceof 29K) && (r0 = (29K) tag) != null) {
                    Rect rect2 = 3vD.A03;
                    C0Ad.A0B(childAt, new 3vD(childAt, r0, childAt.getImportantForAccessibility(), childAt.isFocusable()));
                }
            }
            i = i2 + 1;
        }
    }

    public void A0Z(boolean z, int i, int i2, int i3, int i4) {
    }

    public boolean A0a() {
        return !this.A0G;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        throw AnonymousClass001.A0q("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        throw AnonymousClass001.A0q("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A0q("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw AnonymousClass001.A0q("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A0q("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        C1r9 c1r9 = this.A0O;
        c1r9.A02 = canvas;
        c1r9.A00 = 0;
        c1r9.A01 = c1r9.A03.A0M.A00();
        int i = 0;
        try {
            super.dispatchDraw(canvas);
            if (c1r9.A02 != null && c1r9.A00 < c1r9.A01) {
                c1r9.A00();
            }
            c1r9.A02 = null;
            ArrayList arrayList = this.A0D;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i < size) {
                    ArrayList arrayList2 = this.A0D;
                    if (arrayList2 == null) {
                        throw 1BK.A0h();
                    }
                    2JG r0 = (2JG) arrayList2.get(i);
                    Object obj = r0 != null ? r0.A04 : null;
                    if (obj instanceof Drawable) {
                        ((Drawable) obj).draw(canvas);
                    }
                    i++;
                }
            }
        } catch (2Q8 e) {
            0AE r02 = this.A0M;
            int A00 = r02.A00();
            StringBuilder sb = new StringBuilder("[");
            while (i < A00) {
                2JG r03 = (2JG) C0Ak.A00(r02, i);
                sb.append(r03 != null ? 2JK.A00(r03.A01).A03.A0a() : "null");
                sb.append(i < A00 + (-1) ? ", " : "]");
                i++;
            }
            e.customMetadata.put("component_names_from_mount_items", 11T.A02(sb));
            throw e;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        3vD r0 = this.A06;
        boolean z = false;
        if ((r0 != null && this.A0F && r0.A0p(motionEvent)) || super.dispatchHoverEvent(motionEvent)) {
            z = true;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        3vD r0 = this.A06;
        boolean z = false;
        if ((r0 != null && this.A0F && r0.A0o(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            z = true;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        0AE r0 = this.A0L;
        int A00 = r0.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                return;
            }
            2JG r02 = (2JG) r0.A05(i2);
            11T.A0F(r02, 0);
            25F A002 = 2JK.A00(r02.A01);
            Object obj = r02.A04;
            11T.A0I(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            Drawable drawable = (Drawable) obj;
            int i3 = A002.A00;
            11T.A0F(drawable, 1);
            if (((i3 & 32) == 32 || (i3 & 1) == 1) && drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3;
        if (this.A0H) {
            int childCount = getChildCount();
            if (this.A0K.length < childCount) {
                this.A0K = new int[childCount + 5];
            }
            0AE r0 = this.A0N;
            int A00 = r0.A00();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i3 = i5;
                if (i4 >= A00) {
                    break;
                }
                Object obj = ((2JG) r0.A05(i4)).A04;
                11T.A0I(obj, "null cannot be cast to non-null type android.view.View");
                this.A0K[i3] = indexOfChild((View) obj);
                i4++;
                i5 = i3 + 1;
            }
            ArrayList arrayList = this.A0D;
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 >= size) {
                        break;
                    }
                    ArrayList arrayList2 = this.A0D;
                    if (arrayList2 == null) {
                        throw 1BK.A0h();
                    }
                    2JG r02 = (2JG) arrayList2.get(i7);
                    Object obj2 = r02 != null ? r02.A04 : null;
                    if (obj2 instanceof View) {
                        this.A0K[i3] = indexOfChild((View) obj2);
                        i3++;
                    }
                    i6 = i7 + 1;
                }
            }
            this.A0H = false;
        }
        C1r9 c1r9 = this.A0O;
        if (c1r9.A02 != null && c1r9.A00 < c1r9.A01) {
            c1r9.A00();
        }
        return this.A0K[i2];
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        return this.A0C;
    }

    @Override // android.view.View
    public Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A02;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    public final List getTextContent() {
        0AE r0 = this.A0M;
        11T.A0F(r0, 0);
        int A00 = r0.A00();
        ArrayList A0t = AnonymousClass001.A0t(A00);
        for (int i = 0; i < A00; i++) {
            A0t.add(((2JG) r0.A05(i)).A04);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : A0t) {
            if (obj instanceof TextContent) {
                A0s.add(obj);
            }
        }
        return A0s;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        boolean z = false;
        if (getWidth() > 0 && getHeight() > 0 && getWidth() <= C02A.overlappingRenderingViewSizeLimit && getHeight() <= C02A.overlappingRenderingViewSizeLimit) {
            z = super.hasOverlappingRendering();
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        0AE r0 = this.A0L;
        int A00 = r0.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                return;
            }
            Object obj = ((2JG) r0.A05(i2)).A04;
            11T.A0I(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            ((Drawable) obj).jumpToCurrentState();
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = 0FI.A06(-921366992);
        super.onFocusChanged(z, i, rect);
        3vD r0 = this.A06;
        if (r0 != null && this.A0F) {
            r0.A0m(z, i, rect);
        }
        0FI.A0C(1911265296, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.3xF, java.lang.Object] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.1Im r0 = r0.A0A
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L56
            X.1sP.A00()
            X.3xF r0 = new X.3xF
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r304
            r1 = r302
            r0.A00 = r1
            r0 = r304
            r1 = r301
            r0.A01 = r1
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.A00(r1)
            r305 = r0
            r0 = r305
            boolean r0 = r0 instanceof java.lang.Boolean
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L50
            r0 = r305
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L54
        L50:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L54:
            r0 = r303
            return r0
        L56:
            r0 = r301
            r1 = r302
            boolean r0 = super.onInterceptTouchEvent(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0G = true;
        A0Z(z, i, i2, i3, i4);
        this.A0G = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1851574840);
        if (this.A00 != Float.MIN_VALUE && this.A01 != Float.MIN_VALUE) {
            setPivotX((getWidth() * this.A00) / 100.0f);
            setPivotY((getHeight() * this.A01) / 100.0f);
            if (this.A00 == 50.0f && this.A01 == 50.0f) {
                this.A00 = Float.MIN_VALUE;
                this.A01 = Float.MIN_VALUE;
            }
        }
        0FI.A0C(-1326411130, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(483675907);
        11T.A0F(motionEvent, 0);
        1sP.A00();
        boolean z = true;
        if (isEnabled()) {
            0AE r0 = this.A0L;
            int A00 = r0.A00() - 1;
            while (true) {
                int i = A00;
                if (-1 >= i) {
                    break;
                }
                2JG r02 = (2JG) r0.A05(i);
                Object obj = r02 != null ? r02.A04 : null;
                if (obj instanceof C2ks) {
                    11T.A0F(r02, 0);
                    if ((2JK.A00(r02.A01).A00 & 2) != 2) {
                        C2ks c2ks = (C2ks) obj;
                        if (c2ks.Cxj(motionEvent) && c2ks.CR6(this, motionEvent)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                A00 = i - 1;
            }
            0FI.A0B(-1079944834, A05);
            return z;
        }
        z = super.onTouchEvent(motionEvent);
        0FI.A0B(-1079944834, A05);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (X.1BK.A1Y(r308) != false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(int r302, android.os.Bundle r303) {
        /*
            r301 = this;
            r0 = 256(0x100, float:3.59E-43)
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L1d
            r0 = 512(0x200, float:7.17E-43)
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L1d
        L12:
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.performAccessibilityAction(r1, r2)
            r305 = r0
        L1a:
            r0 = r305
            return r0
        L1d:
            r0 = r301
            java.lang.CharSequence r0 = r0.A0C
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L51
            r0 = r306
            int r0 = r0.length()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L51
            r0 = r301
            java.lang.CharSequence r0 = r0.A0C
            r306 = r0
        L3d:
            r0 = r306
            if (r0 == 0) goto L1a
            r0 = r301
            r1 = r306
            r0.A0C = r1
            r0 = r301
            r1 = r306
            super.setContentDescription(r1)
            goto L12
        L51:
            r0 = r301
            java.util.ArrayList r0 = r0.A0I()
            r306 = r0
            r0 = r306
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r304 = r0
            java.lang.String r0 = ", "
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L89
            r0 = r301
            java.util.ArrayList r0 = r0.A0I()
            r308 = r0
        L6e:
            java.lang.String r0 = ""
            r309 = r0
            r0 = -1
            r310 = r0
            r0 = r307
            r1 = r309
            r2 = r309
            r3 = r308
            r4 = 0
            r5 = r310
            java.lang.String r0 = X.0QD.A0K(r0, r1, r2, r3, r4, r5)
            r306 = r0
            goto L3d
        L89:
            r0 = r301
            java.util.List r0 = r0.getTextContent()
            r306 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r308 = r0
            r0 = r306
            java.util.Iterator r0 = r0.iterator()
            r311 = r0
        L9d:
            r0 = r311
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lbf
            r0 = r311
            java.lang.Object r0 = r0.next()
            java.util.List r0 = X.C2ku.A02(r0)
            r306 = r0
            r0 = r306
            r1 = r308
            X.0QU.A0t(r0, r1)
            goto L9d
        Lbf:
            r0 = r308
            boolean r0 = X.1BK.A1Y(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1a
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        throw AnonymousClass001.A0q("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        ViewParent viewParent = this;
        while (true) {
            ViewParent viewParent2 = viewParent;
            if (!(viewParent2 instanceof ComponentHost)) {
                super.requestLayout();
                return;
            }
            ComponentHost componentHost = (ComponentHost) viewParent2;
            if (!componentHost.A0a()) {
                return;
            } else {
                viewParent = componentHost.getParent();
            }
        }
    }

    @Override // android.view.View
    public void resetPivot() {
        this.A00 = Float.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        super.resetPivot();
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.A0I = false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (f != 0.0f && f != 1.0f && (getWidth() >= C02A.partialAlphaWarningSizeThresold || getHeight() >= C02A.partialAlphaWarningSizeThresold)) {
            if (A0Q) {
                return;
            }
            A0Q = true;
            Integer num = 0S2.A01;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Partial alpha (");
            A0k.append(f);
            A0k.append(") with large view (");
            A0k.append(getWidth());
            AnonymousClass001.A1H(A0k);
            A0k.append(getHeight());
            C53s.A01("PartialAlphaTextureTooBig", num, AnonymousClass001.A0g(A0k, ')'));
        }
        super.setAlpha(f);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.A0C = charSequence;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        A0J();
        super.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        A0J();
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        A0J();
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        A0J();
        super.setOnLongClickListener(onLongClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        A0J();
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        29K r0;
        super.setTag(i, obj);
        if (i != 2131363225 || obj == null) {
            return;
        }
        Context context = getContext();
        11T.A0A(context);
        A0Y(1rB.A00(context));
        3vD r02 = this.A06;
        if (r02 == null || !(obj instanceof 29K) || (r0 = (29K) obj) == null) {
            return;
        }
        r02.A00 = r0;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        A0J();
        super.setTag(obj);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        0AE r0 = this.A0L;
        int A00 = r0.A00();
        if (A00 > 0) {
            1sP.A00();
            int i2 = 0;
            do {
                Object obj = ((2JG) r0.A05(i2)).A04;
                11T.A0I(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                Drawable drawable = (Drawable) obj;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                drawable.setVisible(z, false);
                i2++;
            } while (i2 < A00);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }
}
