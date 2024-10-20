package com.facebook.litho;

import X.0BF;
import X.0Pz;
import X.0S2;
import X.1Iw;
import X.1LI;
import X.1O3;
import X.1rB;
import X.1rL;
import X.1sP;
import X.2JF;
import X.2Q8;
import X.3xQ;
import X.AnonymousClass001;
import X.C02A;
import X.C1s8;
import X.C23N;
import X.C53s;
import X.InterfaceC00713oe;
import X.InterfaceC00733og;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;

/* loaded from: LithoView.class */
public class LithoView extends BaseMountingView {
    public static final int[] A0C = new int[2];
    public ComponentTree A00;
    public ComponentTree A01;
    public 3xQ A02;
    public InterfaceC00733og A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final 1Iw A09;
    public final AccessibilityManager A0A;
    public final 1rL A0B;

    public LithoView(1Iw r302) {
        this(r302, (AttributeSet) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LithoView(X.1Iw r302, android.util.AttributeSet r303) {
        /*
            r301 = this;
            r0 = r302
            android.content.Context r0 = r0.A0D
            r304 = r0
            r0 = r301
            r1 = r304
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r301
            r1 = 0
            r0.A08 = r1
            r0 = r301
            r1 = 0
            r0.A06 = r1
            r0 = r301
            r1 = 0
            r0.A03 = r1
            X.1rL r0 = new X.1rL
            r305 = r0
            r0 = r305
            r1 = r301
            r0.<init>(r1)
            r0 = r301
            r1 = r305
            r0.A0B = r1
            r0 = r301
            r1 = r302
            r0.A09 = r1
            r0 = r304
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A0A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.<init>(X.1Iw, android.util.AttributeSet):void");
    }

    public LithoView(Context context) {
        this(context, (AttributeSet) null);
    }

    public LithoView(Context context, AttributeSet attributeSet) {
        this(new 1Iw(context), attributeSet);
    }

    public static LithoView A00(Context context, 1LI r302) {
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        lithoView.A10(ComponentTree.A01(r302, new 1Iw(context), null).A00(), true);
        return lithoView;
    }

    public static LithoView A01(Context context, 1LI r302, InterfaceC00713oe interfaceC00713oe) {
        return A03(r302, new 1Iw(context), interfaceC00713oe);
    }

    public static LithoView A02(1LI r301, 1Iw r302) {
        LithoView lithoView = new LithoView(r302, (AttributeSet) null);
        lithoView.A10(ComponentTree.A01(r301, r302, null).A00(), true);
        return lithoView;
    }

    public static LithoView A03(1LI r301, 1Iw r302, InterfaceC00713oe interfaceC00713oe) {
        LithoView lithoView = new LithoView(r302, (AttributeSet) null);
        lithoView.A10(ComponentTree.A01(r301, r302, interfaceC00713oe).A00(), true);
        return lithoView;
    }

    public static LithoView A04(1Iw r301, ComponentTree componentTree) {
        LithoView lithoView = new LithoView(r301, (AttributeSet) null);
        lithoView.A10(componentTree, true);
        return lithoView;
    }

    private void A05() {
        A06(this, this.A07);
    }

    public static void A06(ViewGroup viewGroup, boolean z) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= viewGroup.getChildCount()) {
                return;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof LithoView) {
                LithoView lithoView = (LithoView) childAt;
                boolean z2 = lithoView.A07;
                if (z) {
                    if (!z2) {
                        lithoView.onAttachedToWindow();
                        lithoView.A07 = true;
                        lithoView.A05();
                    }
                } else if (z2) {
                    lithoView.A07 = false;
                    lithoView.onDetachedFromWindow();
                    lithoView.A05();
                }
            } else if (childAt instanceof ViewGroup) {
                A06((ViewGroup) childAt, z);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (r304 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A07(com.facebook.litho.LithoView r301) {
        /*
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            com.facebook.litho.ComponentTree r0 = r0.A00     // Catch: java.lang.Throwable -> L35
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = r302
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L35
            r0 = r302
            X.3oe r0 = r0.A09     // Catch: java.lang.Throwable -> L1f
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = 1
            r304 = r0
        L1a:
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            goto L24
        L1f:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            r0 = r303
            throw r0     // Catch: java.lang.Throwable -> L35
        L24:
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L30
        L2b:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L30:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            return r0
        L35:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A07(com.facebook.litho.LithoView):boolean");
    }

    @Override // X.C1qv
    public String A0U() {
        1LI A0G;
        ComponentTree componentTree = this.A00;
        String str = null;
        if (componentTree != null && (A0G = componentTree.A0G()) != null) {
            str = 2JF.A00(A0G.getClass());
        }
        return str;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C23N A0b() {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            return null;
        }
        return componentTree.A07;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C1s8 A0c() {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            return null;
        }
        return componentTree.A0H();
    }

    @Override // com.facebook.litho.BaseMountingView
    public C02A A0d() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            return componentTree.A0V.A03.A01;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r310 >= (r311 - r304)) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    @Override // com.facebook.litho.BaseMountingView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A0e():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, X.0BF, java.lang.Object] */
    @Override // com.facebook.litho.BaseMountingView
    public void A0j() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            componentTree.A0J();
        }
        A0Y(1rB.A00(getContext()));
        AccessibilityManager accessibilityManager = this.A0A;
        1rL r0 = this.A0B;
        if (r0 != null) {
            ?? obj = new Object();
            ((0BF) obj).A00 = r0;
            accessibilityManager.addAccessibilityStateChangeListener(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, X.0BF, java.lang.Object] */
    @Override // com.facebook.litho.BaseMountingView
    public void A0k() {
        super.A0k();
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            componentTree.A0K();
        }
        AccessibilityManager accessibilityManager = this.A0A;
        1rL r0 = this.A0B;
        if (r0 != null) {
            ?? obj = new Object();
            ((0BF) obj).A00 = r0;
            accessibilityManager.removeAccessibilityStateChangeListener(obj);
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public void A0l(int i, int i2, int i3, int i4) {
        ComponentTree componentTree = this.A00;
        if (componentTree == null || componentTree.BVK()) {
            throw AnonymousClass001.A0N("Trying to layout a LithoView holding onto a released ComponentTree");
        }
        if (this.A04 || this.A00.A07 == null) {
            int max = Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft());
            int max2 = Math.max(0, ((i4 - i2) - getPaddingTop()) - getPaddingBottom());
            this.A00.A0W(A0C, View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824), false);
            this.A06 = false;
            this.A04 = false;
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public void A0n(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2) {
        ComponentTree componentTree;
        if (!C02A.defaultInstance.A0K || (componentTree = this.A00) == null || lifecycleOwner2 == null) {
            return;
        }
        componentTree.A0N(lifecycleOwner2);
    }

    @Override // com.facebook.litho.BaseMountingView
    public void A0o(Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0N("Should have received wether firs and last mount should be logged");
        }
        int intValue = ((Number) obj).intValue();
        if (this.A07) {
            A05();
        }
        if ((intValue & 1) != 0) {
            3xQ r0 = this.A02;
            r0.A00.A01("_firstmount", "_end", r0.A01);
            r0.A04[0] = true;
        }
        if ((intValue & 2) != 0) {
            3xQ r02 = this.A02;
            r02.A00.A01("_lastmount", "_end", r02.A01);
            r02.A05[0] = true;
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public void A0p(boolean z) {
        if (A07(this)) {
            C53s.A00("lithoView:LithoVisibilityEventsControllerFound", 0S2.A00, "Setting visibility hint but a LithoVisibilityEventsController was found, ignoring.");
        } else {
            BaseMountingView.A0G(this, z, true);
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public boolean A0s() {
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0.A0V.A03.A01.A0N == false) goto L6;
     */
    @Override // com.facebook.litho.BaseMountingView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0t() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.litho.ComponentTree r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1f
            r0 = r302
            X.1Iw r0 = r0.A0V
            X.1qe r0 = r0.A03
            X.02A r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0N
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L23
        L1f:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L23:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A0t():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0.A0V.A03.A01.A0Y == false) goto L6;
     */
    @Override // com.facebook.litho.BaseMountingView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0u() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.litho.ComponentTree r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1f
            r0 = r302
            X.1Iw r0 = r0.A0V
            X.1qe r0 = r0.A03
            X.02A r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0Y
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L23
        L1f:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L23:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A0u():boolean");
    }

    public void A0w() {
        1sP.A00();
        if (A07(this)) {
            C53s.A00("lithoView:LithoVisibilityEventsControllerFound", 0S2.A00, "Trying to release a LithoView but a LithoVisibilityEventsController was found, ignoring.");
            return;
        }
        Iterator it = BaseMountingView.A0A(((BaseMountingView) this).A0I).iterator();
        while (it.hasNext()) {
            BaseMountingView baseMountingView = (BaseMountingView) it.next();
            if (baseMountingView instanceof LithoView) {
                ((LithoView) baseMountingView).A0w();
            }
        }
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            componentTree.A0L();
            if (1O3.A05) {
                getOverlay().clear();
            }
            this.A00 = null;
        }
    }

    public void A0x(1LI r302) {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            A10(ComponentTree.A01(r302, this.A09, null).A00(), true);
        } else {
            componentTree.A0O(r302);
        }
    }

    public void A0y(1LI r302) {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            A10(ComponentTree.A01(r302, this.A09, null).A00(), true);
        } else {
            componentTree.A0P(r302);
        }
    }

    public void A0z(ComponentTree componentTree) {
        A10(componentTree, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0.A0T != r302.A0T) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A10(com.facebook.litho.ComponentTree r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A10(com.facebook.litho.ComponentTree, boolean):void");
    }

    public void A11(InterfaceC00713oe interfaceC00713oe) {
        boolean z;
        synchronized (this) {
            ComponentTree componentTree = this.A00;
            if (componentTree != null) {
                synchronized (componentTree) {
                    z = false;
                    if (componentTree.A09 != null) {
                        z = true;
                    }
                }
                if (!z) {
                    this.A00.A0T(interfaceC00713oe);
                }
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            try {
                ComponentsSystrace.A02("LithoView.draw");
            } finally {
                if (BWo) {
                    ComponentsSystrace.A01();
                }
            }
        }
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
            InterfaceC00733og interfaceC00733og = this.A03;
            if (interfaceC00733og != null) {
                interfaceC00733og.CCx();
            }
        } catch (Throwable th) {
            throw new 2Q8(this.A00, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r303 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Deque] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Deque findTestItems(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            X.1sQ r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r303
            X.1sX r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L47
            r0 = r303
            X.1sS r0 = r0.A01
            X.39z r0 = (X.C39z) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L47
            r0 = r303
            java.util.Map r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L40
            r0 = r303
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            java.util.Deque r0 = (java.util.Deque) r0
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3e
        L36:
            java.util.LinkedList r0 = new java.util.LinkedList
            r303 = r0
            r0 = r303
            r0.<init>()
        L3e:
            r0 = r303
            return r0
        L40:
            java.lang.String r0 = "Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0q(r0)
            throw r0
        L47:
            java.lang.String r0 = "Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.findTestItems(java.lang.String):java.util.Deque");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019b, code lost:
    
        r0 = getPaddingTop() + getPaddingBottom();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a2, code lost:
    
        r0 = android.view.View.MeasureSpec.getMode(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01aa, code lost:
    
        if (r0 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c0, code lost:
    
        r303 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, android.view.View.MeasureSpec.getSize(r303) - r0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c6, code lost:
    
        r0 = com.facebook.litho.LithoView.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cf, code lost:
    
        r0.A0W(r0, r302, r303, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d5, code lost:
    
        r313 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01da, code lost:
    
        r314 = r0[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e0, code lost:
    
        r301.A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ea, code lost:
    
        if (r301.A00 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f5, code lost:
    
        if (r301.A06 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f8, code lost:
    
        r0 = A0c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01fe, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0201, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0207, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0212, code lost:
    
        if (r0.A00 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x022a, code lost:
    
        A0f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x022f, code lost:
    
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0234, code lost:
    
        r0 = A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023a, code lost:
    
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x023d, code lost:
    
        r315 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x024d, code lost:
    
        r0 = com.facebook.litho.BaseMountingView.A08(r301, r315, X.C2jm.A07, r306, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0258, code lost:
    
        if (r0 == (-1)) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x026b, code lost:
    
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0271, code lost:
    
        r0 = A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0277, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027a, code lost:
    
        r315 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x028a, code lost:
    
        r0 = com.facebook.litho.BaseMountingView.A08(r301, r315, X.C2jm.A01, r311, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0295, code lost:
    
        if (r0 == (-1)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02a4, code lost:
    
        r314 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029b, code lost:
    
        r315 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0267, code lost:
    
        r313 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x025e, code lost:
    
        r315 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0218, code lost:
    
        setMeasuredDimension(r313, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x021e, code lost:
    
        r301.A06 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0223, code lost:
    
        r301.A08 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0045, code lost:
    
        if (r306 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (((com.facebook.litho.BaseMountingView) r301).A00 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r306 = getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r311 = ((com.facebook.litho.BaseMountingView) r301).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r311 != (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r311 = getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        ((com.facebook.litho.BaseMountingView) r301).A01 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        ((com.facebook.litho.BaseMountingView) r301).A00 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r310 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (((com.facebook.litho.BaseMountingView) r301).A0A != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        setMeasuredDimension(r306, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        r0 = getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if ((r0 instanceof X.C22b) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r0 = (X.C22b) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        r0 = r0.BKk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        r0 = X.C22b.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (r0 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r302 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r0 = r0.Aox();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c9, code lost:
    
        if (r0 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
    
        r303 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
    
        r313 = android.view.View.MeasureSpec.getSize(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        r314 = android.view.View.MeasureSpec.getSize(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        r0 = r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        if (r301.A00 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        A10(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fd, code lost:
    
        r301.A01 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r301.A05 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (android.view.View.MeasureSpec.getMode(r302) != 1073741824) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0128, code lost:
    
        if (android.view.View.MeasureSpec.getMode(r303) != 1073741824) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012c, code lost:
    
        r301.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0134, code lost:
    
        setMeasuredDimension(r313, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013d, code lost:
    
        r301.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0143, code lost:
    
        r0 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014a, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
    
        r0 = r301.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0154, code lost:
    
        r301.A05 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0164, code lost:
    
        r0 = getPaddingRight() + getPaddingLeft();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016b, code lost:
    
        r0 = android.view.View.MeasureSpec.getMode(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0173, code lost:
    
        if (r0 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0189, code lost:
    
        r302 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, android.view.View.MeasureSpec.getSize(r302) - r0), r0);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public String toString() {
        return 0Pz.A0W(super.toString(), LithoViewTestHelper.viewToString(this, true));
    }
}
