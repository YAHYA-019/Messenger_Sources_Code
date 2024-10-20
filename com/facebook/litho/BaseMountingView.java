package com.facebook.litho;

import X.06Z;
import X.0FI;
import X.0Pz;
import X.0S2;
import X.11T;
import X.1BL;
import X.1Iw;
import X.1O3;
import X.1rH;
import X.1sB;
import X.1sP;
import X.1sQ;
import X.1sW;
import X.1sX;
import X.1sY;
import X.1tE;
import X.2AS;
import X.2JE;
import X.2JG;
import X.2Q8;
import X.2Z7;
import X.32J;
import X.32Y;
import X.36Y;
import X.5Rn;
import X.5X9;
import X.AnonymousClass001;
import X.C00p;
import X.C02A;
import X.C1qe;
import X.C1r0;
import X.C1r1;
import X.C1rF;
import X.C1s8;
import X.C1sa;
import X.C1sb;
import X.C1sk;
import X.C23N;
import X.C2jo;
import X.C3s9;
import X.C53s;
import X.C5ht;
import X.InterfaceC00723of;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.facebook.rendercore.RenderTreeNode;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* loaded from: BaseMountingView.class */
public abstract class BaseMountingView extends ComponentHost implements C1r0, C1r1 {
    public static final Rect A0J = new Rect();
    public int A00;
    public int A01;
    public int A02;
    public LifecycleOwner A03;
    public InterfaceC00723of A04;
    public 1sQ A05;
    public Boolean A06;
    public Deque A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final Rect A0G;
    public final Rect A0H;
    public final C1rF A0I;

    public BaseMountingView(Context context, AttributeSet attributeSet) {
        super(new 1Iw(context).A0D, attributeSet, null);
        this.A01 = -1;
        this.A00 = -1;
        this.A0G = new Rect();
        this.A06 = false;
        this.A0H = new Rect();
        this.A04 = null;
        this.A0I = new C1rF(this, ComponentsSystrace.A00);
        this.A0F = 1rH.A00(this);
    }

    public static int A08(BaseMountingView baseMountingView, 2JE r302, C2jo c2jo, int i, boolean z) {
        1sB r0;
        if (r302 != null) {
            C1s8 A0c = baseMountingView.A0c();
            if (A0c == null || (r0 = A0c.A06) == null || !r0.A00) {
                5X9 r02 = r302.A00;
                if (r02 != null) {
                    C23N A0b = baseMountingView.A0b();
                    A0b.getClass();
                    5Rn r03 = C3s9.A04;
                    return (int) r02.A04.Chv(new C5ht(A0b.A0J, c2jo), new 32Y(A0b, c2jo));
                }
            } else if (!z) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LifecycleOwner A09(Context context) {
        if (context instanceof LifecycleOwner) {
            return (LifecycleOwner) context;
        }
        if (context instanceof ContextWrapper) {
            return A09(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static ArrayList A0A(C1rF c1rF) {
        2JG r0;
        ArrayList arrayList = new ArrayList();
        C00p c00p = c1rF.A06;
        int A00 = c00p.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                return arrayList;
            }
            2AS r02 = c1rF.A02;
            Object obj = null;
            if (r02 != null) {
                RenderTreeNode[] renderTreeNodeArr = r02.A05;
                if (i2 < renderTreeNodeArr.length && (r0 = (2JG) c00p.A05(renderTreeNodeArr[i2].A06.A0I())) != null) {
                    obj = r0.A04;
                }
            }
            if (obj instanceof 2Z7) {
                ((2Z7) obj).Bgv(arrayList);
            }
            i = i2 + 1;
        }
    }

    private void A0B() {
        LifecycleOwner A09;
        LifecycleOwner lifecycleOwner;
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (C02A.defaultInstance.A0D) {
            try {
                A09 = 06Z.A02(this);
            } catch (IllegalStateException unused) {
                A09 = A09(getContext());
            }
        } else {
            A09 = ViewTreeLifecycleOwner.get(this);
        }
        if (A09 != null && (lifecycleOwner = this.A03) != A09) {
            this.A03 = A09;
            A0n(lifecycleOwner, A09);
        }
        A0j();
    }

    private void A0C() {
        if (A0s() && (getParent() instanceof View)) {
            int width = ((View) getParent()).getWidth();
            int height = ((View) getParent()).getHeight();
            int translationX = (int) getTranslationX();
            int translationY = (int) getTranslationY();
            int top = getTop() + translationY;
            int bottom = getBottom() + translationY;
            int left = getLeft() + translationX;
            int right = getRight() + translationX;
            Rect rect = this.A0G;
            if (left < 0 || top < 0 || right > width || bottom > height || rect.left < 0 || rect.top < 0 || rect.right > width || rect.bottom > height || rect.width() != getWidth() || rect.height() != getHeight()) {
                Rect rect2 = new Rect();
                if (getLocalVisibleRect(rect2)) {
                    Bgp(rect2, true);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r0 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r0 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (1 == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.graphics.Rect, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0D(android.graphics.Rect r302) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.BaseMountingView.A0D(android.graphics.Rect):void");
    }

    private void A0E(Rect rect) {
        if (A0b() == null || !A0u()) {
            return;
        }
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            ComponentsSystrace.A02("BaseMountingView.processVisibilityOutputs");
        }
        try {
            C23N A0b = A0b();
            if (A0b == null) {
                Log.w("BaseMountingView", "Main Thread Layout state is not found");
            } else {
                A0b.A06 = true;
                1sQ r0 = this.A05;
                if (r0 != null) {
                    boolean z = this.A0A;
                    C1rF c1rF = r0.A06;
                    1sW r02 = c1rF.A01;
                    if (r02 != null) {
                        r02.A03();
                    }
                    1sX r03 = r0.A05;
                    if (r03 != null) {
                        if (!z) {
                            Object obj = r03.A01;
                            if (obj instanceof C1sa) {
                                ((C1sa) obj).CUu(rect, r03);
                            }
                        } else if (C1sk.A05(r03)) {
                            C1sk.A02(rect, r0.A05, true);
                        }
                    }
                    1sW r04 = c1rF.A01;
                    if (r04 != null) {
                        r04.A02();
                    }
                }
                this.A0G.set(rect);
            }
        } finally {
            if (BWo) {
                ComponentsSystrace.A01();
            }
        }
    }

    private void A0F(Rect rect, boolean z) {
        2Q8 r314;
        1O3 r0;
        C23N A0b = A0b();
        if (A0b != null) {
            if (this.A0D && this.A08 && !this.A0E) {
                return;
            }
            boolean z2 = this.A0A;
            try {
                try {
                    C1s8 A0c = A0c();
                    1sB r309 = A0c != null ? A0c.A06 : null;
                    if (r309 != null && !r309.A00) {
                        r309.A01 = true;
                        r309.A00 = true;
                    }
                    this.A0B = true;
                    Object A0e = A0e();
                    A0b.A06 = z;
                    2AS A01 = A0b.A01();
                    A0h();
                    this.A05.getClass();
                    1sQ r02 = this.A05;
                    1sX r03 = r02.A03;
                    if (r03 != null) {
                        r03.A01.A0C(rect, r03, A0b);
                    }
                    1sX r04 = r02.A04;
                    if (r04 != null) {
                        r04.A01.A0C(rect, r04, A0b);
                    }
                    1sX r05 = r02.A01;
                    if (r05 != null) {
                        r05.A01.A0C(rect, r05, A0b);
                    }
                    1sX r06 = r02.A00;
                    if (r06 != null) {
                        r06.A01.A0C(rect, r06, A0b);
                    }
                    1sX r07 = r02.A05;
                    if (r07 != null) {
                        r07.A01.A0C(rect, r07, A0b);
                    }
                    1sX r08 = r02.A02;
                    if (r08 != null) {
                        r08.A01.A0C(rect, r08, A0b);
                    }
                    this.A0I.A0H(A01);
                    1tE.A03.addAndGet(1L);
                    int i = A0b.A08;
                    if (1O3.A05) {
                        synchronized (1O3.class) {
                            synchronized (1O3.A06) {
                                r0 = new 1O3((List) 1BL.A0k(1O3.A08, i));
                            }
                        }
                        if (1O3.A05) {
                            getOverlay().clear();
                        }
                        r0.setBounds(0, 0, getWidth(), getHeight());
                        getOverlay().add((Drawable) r0);
                    }
                    A0o(A0e);
                    this.A0A = false;
                    C1s8 A0c2 = A0c();
                    if (z2 && A0c2 != null) {
                        A0b.A0H.A07.A07(A0b);
                        A0c2.A07(A0b);
                    }
                    C1s8 A0c3 = A0c();
                    if (A0c3 != null && A0c3.A06 != null) {
                        C1s8 A0c4 = A0c();
                        (A0c4 != null ? A0c4.A06 : null).A01 = false;
                    }
                    this.A0B = false;
                    if (z2) {
                        synchronized (this) {
                            InterfaceC00723of interfaceC00723of = this.A04;
                            if (interfaceC00723of != null) {
                                interfaceC00723of.Btn(this);
                            }
                        }
                    }
                } catch (Exception e) {
                    if (this instanceof LithoView) {
                        r314 = e instanceof 2Q8 ? e : new 2Q8(((LithoView) this).A00, e);
                    } else {
                        new 2Q8((1Iw) null, (String) null, (String) null, e);
                    }
                    throw r314;
                }
            } catch (Throwable th) {
                C1s8 A0c5 = A0c();
                if (A0c5 != null && A0c5.A06 != null) {
                    C1s8 A0c6 = A0c();
                    (A0c6 != null ? A0c6.A06 : null).A01 = false;
                }
                this.A0B = false;
                if (z2) {
                    synchronized (this) {
                        InterfaceC00723of interfaceC00723of2 = this.A04;
                        if (interfaceC00723of2 != null) {
                            interfaceC00723of2.Btn(this);
                        }
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r301.A0E != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0G(com.facebook.litho.BaseMountingView r301, boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.BaseMountingView.A0G(com.facebook.litho.BaseMountingView, boolean, boolean):void");
    }

    public static void A0H(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        if (childCount != 0) {
            View[] viewArr = new View[childCount];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childCount) {
                    break;
                }
                viewArr[i2] = componentHost.getChildAt(i2);
                i = i2 + 1;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View view = viewArr[i3];
                if (view.getParent() == componentHost) {
                    if (view.isLayoutRequested()) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                    if (view instanceof ComponentHost) {
                        A0H((ComponentHost) view);
                    }
                }
            }
        }
    }

    @Override // com.facebook.litho.ComponentHost
    public void A0Z(boolean z, int i, int i2, int i3, int i4) {
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            try {
                ComponentsSystrace.A02("LithoView.performLayout");
            } finally {
                if (BWo) {
                    ComponentsSystrace.A01();
                }
            }
        }
        if (A0s()) {
            A0l(i, i2, i3, i4);
            if (!A0v()) {
                Bgo();
                A0H(this);
            }
        }
    }

    @Override // com.facebook.litho.ComponentHost
    public boolean A0a() {
        if (A0s() && this.A0B) {
            return false;
        }
        return !super.A0G;
    }

    public C23N A0b() {
        return ((36Y) this).A00;
    }

    public C1s8 A0c() {
        return ((36Y) this).A01;
    }

    public C02A A0d() {
        C1qe c1qe;
        C23N c23n = ((36Y) this).A00;
        if (c23n == null || (c1qe = c23n.A0H.A02.A03) == null) {
            return null;
        }
        return c1qe.A01;
    }

    public Object A0e() {
        return null;
    }

    public void A0f() {
        C23N A0b;
        1sQ r0;
        1sX r02;
        if (!this.A0A || !A0s() || (A0b = A0b()) == null || A0b.A0J == null || (r0 = this.A05) == null || (r02 = r0.A04) == null) {
            return;
        }
        1sY.A01(A0b, r02);
    }

    public void A0g() {
        1sX r0;
        1sX r02;
        1sQ r03 = this.A05;
        if (r03 != null && (r02 = r03.A05) != null) {
            C1sk.A03(r02);
        }
        1sQ r04 = this.A05;
        if (r04 == null || (r0 = r04.A04) == null) {
            return;
        }
        ((C1sb) r0.A02).A00 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
    
        if (r0.A0U == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Type inference failed for: r0v98, types: [X.1sS, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0h() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.BaseMountingView.A0h():void");
    }

    public void A0i() {
        this.A0I.A0F();
        this.A05 = null;
        this.A0G.setEmpty();
    }

    public void A0j() {
        this.A0I.A0D();
    }

    public void A0k() {
        C02A A0d = A0d();
        if (A0d != null && A0d.A0F && !this.A0C && !hasTransientState()) {
            A0D(A0J);
        }
        this.A0I.A0E();
    }

    public void A0l(int i, int i2, int i3, int i4) {
    }

    public void A0m(Rect rect, boolean z) {
        String str;
        1sP.A00();
        if (!this.A0B) {
            C23N A0b = A0b();
            if (A0b != null && (!this.A0D || !this.A08 || this.A0E)) {
                if (this.A02 > 0 && A0s() && A0t()) {
                    if (this.A0A) {
                        rect = new Rect(0, 0, getWidth(), getHeight());
                        z = false;
                    }
                }
                this.A0G.set(rect);
                if (!this.A0A) {
                    C1rF c1rF = this.A0I;
                    if (!c1rF.A03) {
                        try {
                            this.A0B = true;
                            A0b.A06 = z;
                            1sW r0 = c1rF.A01;
                            r0.getClass();
                            r0.A04(rect);
                        } finally {
                            this.A0B = false;
                        }
                    }
                }
                A0F(rect, z);
            }
            Deque deque = this.A07;
            if (deque != null) {
                ArrayDeque arrayDeque = new ArrayDeque(deque);
                this.A07.clear();
                while (!arrayDeque.isEmpty()) {
                    Object pollFirst = arrayDeque.pollFirst();
                    pollFirst.getClass();
                    32J r02 = (32J) pollFirst;
                    this.A0A = true;
                    this.A0G.setEmpty();
                    A0F(r02.A00, r02.A01);
                }
                return;
            }
            return;
        }
        32J r03 = new 32J(rect, z);
        Deque deque2 = this.A07;
        if (deque2 == null) {
            this.A07 = new ArrayDeque();
        } else if (deque2.size() > 25) {
            String viewToString = LithoViewTestHelper.viewToString(this, true);
            if (viewToString.length() == 0) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("(");
                A0k.append(getLeft());
                A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A0k.append(getTop());
                A0k.append("-");
                A0k.append(getRight());
                A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A0k.append(getBottom());
                viewToString = AnonymousClass001.A0d(")", A0k);
                11T.A0A(viewToString);
            }
            if (A0s()) {
                if (this instanceof LithoView) {
                    ComponentTree componentTree = ((LithoView) this).A00;
                    if (componentTree != null) {
                        str = componentTree.A0I();
                    }
                } else {
                    C23N A0b2 = A0b();
                    if (A0b2 != null) {
                        str = A0b2.A0H.A01.A0a();
                        11T.A0A(str);
                    } else {
                        str = "";
                    }
                }
                C53s.A00("ComponentTree:ReentrantMountsExceedMaxAttempts", 0S2.A0C, 0Pz.A0v("Reentrant mounts exceed max attempts, view=", viewToString, ", component=", str));
                this.A07.clear();
                return;
            }
            str = null;
            C53s.A00("ComponentTree:ReentrantMountsExceedMaxAttempts", 0S2.A0C, 0Pz.A0v("Reentrant mounts exceed max attempts, view=", viewToString, ", component=", str));
            this.A07.clear();
            return;
        }
        this.A07.add(r03);
    }

    public void A0n(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        36Y r0 = (36Y) this;
        if (lifecycleOwner != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
            lifecycle2.removeObserver(r0);
        }
        if (lifecycleOwner2 == null || (lifecycle = lifecycleOwner2.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(r0);
    }

    public void A0o(Object obj) {
    }

    public void A0p(boolean z) {
        A0G(this, z, true);
    }

    public void A0q(boolean z) {
        1sX r0;
        1sP.A00();
        if (A0s()) {
            if (this.A08 || !z) {
                boolean z2 = true;
                this.A08 = true;
                this.A0D = true;
                if (this.A0E) {
                    z2 = false;
                }
                this.A0E = z;
                if (!z) {
                    1sQ r02 = this.A05;
                    if (r02 == null || (r0 = r02.A05) == null) {
                        return;
                    }
                    C1sk.A03(r0);
                    return;
                }
                C02A A0d = A0d();
                if (A0d == null || !A0d.A0F || this.A09) {
                    if (z2) {
                        Bgo();
                        return;
                    }
                    Rect rect = this.A0H;
                    if (getLocalVisibleRect(rect)) {
                        A0E(rect);
                    }
                }
            }
        }
    }

    public void A0r(boolean z, boolean z2) {
        if (!(this instanceof LithoView)) {
            A0G(this, z, z2);
            return;
        }
        LithoView lithoView = (LithoView) this;
        if (LithoView.A07(lithoView)) {
            C53s.A00("lithoView:LithoVisibilityEventsControllerFound", 0S2.A00, "Setting visibility hint but a LithoVisibilityEventsController was found, ignoring.");
        } else {
            A0G(lithoView, z, z2);
        }
    }

    public boolean A0s() {
        boolean z = false;
        if (((36Y) this).A00 != null) {
            z = true;
        }
        return z;
    }

    public boolean A0t() {
        C23N c23n = ((36Y) this).A00;
        if (c23n != null) {
            return c23n.A0H.A02.A03.A01.A0N;
        }
        return false;
    }

    public boolean A0u() {
        C23N c23n = ((36Y) this).A00;
        if (c23n != null) {
            return c23n.A0H.A02.A03.A01.A0Y;
        }
        return false;
    }

    public boolean A0v() {
        boolean z;
        if (this.A0A || this.A0I.A03) {
            boolean BWo = ComponentsSystrace.A00.BWo();
            if (BWo) {
                ComponentsSystrace.A02("BaseMountingView::mountComponentIfNeeded");
            }
            z = true;
            if (A0t()) {
                A0D(null);
            } else {
                Rect rect = new Rect();
                getLocalVisibleRect(rect);
                A0m(rect, true);
            }
            if (BWo) {
                ComponentsSystrace.A01();
                return true;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // X.C1r0
    public void Bgo() {
        if (A0b() != null) {
            boolean BWo = ComponentsSystrace.A00.BWo();
            if (BWo) {
                ComponentsSystrace.A02("BaseMountingView.notifyVisibleBoundsChanged");
            }
            A0D(null);
            if (BWo) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.C1r1
    public void Bgp(Rect rect, boolean z) {
        if (A0b() != null) {
            boolean BWo = ComponentsSystrace.A00.BWo();
            if (BWo) {
                ComponentsSystrace.A02("BaseMountingView.notifyVisibleBoundsChangedWithRect");
            }
            if (A0t()) {
                A0m(rect, z);
            } else if (z) {
                A0E(rect);
            }
            if (BWo) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasTransientState() {
        return C02A.shouldOverrideHasTransientState ? this.A06.booleanValue() : super.hasTransientState();
    }

    @Override // android.view.View
    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        A0C();
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        A0C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-726227269);
        super.onAttachedToWindow();
        A0B();
        0FI.A0C(-1827561941, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2084887368);
        super.onDetachedFromWindow();
        if (this.A09) {
            this.A09 = false;
            A0k();
            LifecycleOwner lifecycleOwner = this.A03;
            if (lifecycleOwner != null) {
                this.A03 = null;
                A0n(lifecycleOwner, null);
            }
        }
        0FI.A0C(366563585, A06);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        this.A0C = false;
        super.onFinishTemporaryDetach();
        A0B();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        this.A0C = true;
        super.onStartTemporaryDetach();
        if (this.A09) {
            this.A09 = false;
            A0k();
            LifecycleOwner lifecycleOwner = this.A03;
            if (lifecycleOwner != null) {
                this.A03 = null;
                A0n(lifecycleOwner, null);
            }
        }
    }

    @Override // android.view.View
    public void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        int i = this.A02;
        if (z) {
            if (i == 0 && A0s()) {
                Bgp(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            int i2 = this.A02;
            if (i2 == 0) {
                this.A06 = true;
            }
            this.A02 = i2 + 1;
            return;
        }
        int i3 = i - 1;
        this.A02 = i3;
        if (i3 == 0) {
            this.A06 = false;
            if (A0s()) {
                Bgo();
            }
        }
        if (this.A02 < 0) {
            this.A02 = 0;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            A0C();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            A0C();
        }
    }
}
