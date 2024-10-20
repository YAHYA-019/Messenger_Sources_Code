package X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2X1, reason: invalid class name */
/* loaded from: 2X1.class */
public final class C2X1 implements C2X2, C2X3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public RecyclerView A08;
    public 1Im A09;
    public C23P A0A;
    public 3xK A0B;
    public C2mg A0C;
    public String A0D;
    public boolean A0F;
    public boolean A0G;
    public int A0I;
    public int A0J;
    public Integer A0K;
    public boolean A0L;
    public final float A0M;
    public final 2Xd A0Q;
    public final 1Iw A0R;
    public final 2lK A0T;
    public final C2X7 A0U;
    public final 2Xb A0W;
    public final 2XL A0X;
    public final 2Xg A0Y;
    public final 2Xf A0Z;
    public final 2Xj A0a;
    public final Runnable A0f;
    public final List A0i;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean[] A0v;
    public final boolean[] A0w;
    public final int A0x;
    public final int A0y;
    public final int A0z;
    public final InterfaceC00713oe A10;
    public final C02A A11;
    public final C2kk A12;
    public final 2X5 A13;
    public final C2yt A15;
    public final 2XZ A16;
    public final boolean A19;
    public final boolean A1A;
    public volatile C23P A1B;
    public volatile boolean A1C;
    public static final C23P A1F = new Object();
    public static final Rect A1D = new Rect();
    public static final Rect A1E = new Rect();
    public final List A0k = new ArrayList();
    public final List A0j = new ArrayList();
    public final Handler A0N = new Handler(Looper.getMainLooper());
    public final AtomicBoolean A0m = new AtomicBoolean(false);
    public final AtomicBoolean A18 = new AtomicBoolean(false);
    public final AtomicLong A0n = new AtomicLong(-1);
    public final Deque A0g = new ArrayDeque();
    public final AtomicBoolean A0l = new AtomicBoolean(false);
    public final AtomicBoolean A17 = new AtomicBoolean(false);
    public final Deque A0h = new ArrayDeque();
    public final Runnable A0e = new 2XP(this);
    public Deque A0E = new ArrayDeque();
    public final Object A0b = new Object();
    public boolean A0H = false;
    public final Runnable A0d = new Runnable() { // from class: X.551
        public static final String __redex_internal_original_name = "RecyclerBinder$$ExternalSyntheticLambda0";

        @Override // java.lang.Runnable
        public final void run() {
            C2X1 c2x1 = C2X1.this;
            synchronized (c2x1.A0b) {
                c2x1.A0H = false;
                if (c2x1.A0E.isEmpty()) {
                    return;
                }
                c2x1.A0E = new ArrayDeque();
                for (2iK r0 : c2x1.A0E) {
                    if (r0 != null) {
                        C2X1.A0C(r0);
                    }
                }
            }
        }
    };
    public final 2XR A0V = new 2XQ(this);
    public final ViewTreeObserver.OnPreDrawListener A0P = new 2XS(this);
    public final View.OnAttachStateChangeListener A0O = new 2XT(this);
    public final Runnable A0c = new 2XU(this);
    public final 2XV A14 = new 2XV(this);
    public final 2XX A0S = new 2XW(this);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0272, code lost:
    
        if (r316 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x022d, code lost:
    
        if (r313.A0N == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2X1(X.C2ys r302) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.<init>(X.2ys):void");
    }

    public static int A00(C23P c23p, 2iK r302, C2X1 c2x1, int i) {
        boolean z = c2x1.A19;
        boolean A0W = c2x1.A0W();
        if (z) {
            if (!A0W) {
                return 0;
            }
            float B1M = r302.A02().B1M();
            if (B1M < 0.0f || B1M > 100.0f) {
                return 0;
            }
        } else {
            if (!A0W) {
                return c2x1.A0U.AcQ(r302.A02(), i);
            }
            float B1M2 = r302.A02().B1M();
            if (B1M2 < 0.0f || B1M2 > 100.0f) {
                return c2x1.A0U.AcQ(r302.A02(), View.MeasureSpec.makeMeasureSpec(c23p.A00, 1073741824));
            }
        }
        return View.MeasureSpec.makeMeasureSpec(AnonymousClass272.A00((c23p.A00 * r302.A02().B1M()) / 100.0f), 1073741824);
    }

    public static int A01(C23P c23p, 2iK r302, C2X1 c2x1, int i) {
        if (!c2x1.A0W()) {
            return c2x1.A0U.AcU(r302.A02(), i);
        }
        float B1R = r302.A02().B1R();
        if (B1R >= 0.0f && B1R <= 100.0f) {
            return View.MeasureSpec.makeMeasureSpec(AnonymousClass272.A00((c23p.A01 * r302.A02().B1R()) / 100.0f), 1073741824);
        }
        return c2x1.A0U.AcU(r302.A02(), View.MeasureSpec.makeMeasureSpec(c23p.A01, 1073741824));
    }

    public static int A02(C2X1 c2x1, Object obj) {
        synchronized (c2x1) {
            if (obj != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    List list = c2x1.A0k;
                    if (i2 >= list.size()) {
                        break;
                    }
                    C2hn A02 = ((2iK) list.get(i2)).A02();
                    if (A02 != null && obj.equals(A02.AgD(PublicKeyCredentialControllerUtility.JSON_KEY_ID))) {
                        return i2;
                    }
                    i = i2 + 1;
                }
            }
            return -1;
        }
    }

    public static int A03(List list, boolean z) {
        int i;
        if (!z) {
            i = 0;
            int size = list.size();
            while (i < size) {
                if (!((2iK) list.get(i)).A02().Cfi()) {
                    i++;
                }
            }
            return -1;
        }
        i = list.size();
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!((2iK) list.get(i)).A02().Cfi());
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.23P, java.lang.Object] */
    private C23P A04(int i, int i2, boolean z) {
        int size;
        ?? obj = new Object();
        int B9E = this.A0U.B9E();
        boolean z2 = false;
        if ((B9E == 1 ? View.MeasureSpec.getMode(i) : View.MeasureSpec.getMode(i2)) != 1073741824 && z) {
            z2 = true;
        }
        int i3 = 0;
        if (B9E != 1) {
            i3 = View.MeasureSpec.getSize(i);
            size = !z2 ? View.MeasureSpec.getSize(i2) : this.A1B != null ? this.A1B.A00 : 0;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!z2) {
                i3 = View.MeasureSpec.getSize(i);
            } else if (this.A1B != null) {
                i3 = this.A1B.A01;
            }
        }
        obj.A01 = i3;
        obj.A00 = size;
        return obj;
    }

    public static 2iK A05(C2X1 c2x1, C2hn c2hn) {
        C2hn c2hn2 = c2hn;
        C2kk c2kk = c2x1.A12;
        C03483y7 AK5 = c2kk != null ? c2kk.AK5(c2hn) : null;
        2X5 r0 = c2x1.A13;
        C02A c02a = c2x1.A11;
        InterfaceC00713oe interfaceC00713oe = c2x1.A10;
        if (c2hn == null) {
            c2hn2 = C2hl.A00();
        }
        if (c2hn2 != null) {
            return new 2iK(interfaceC00713oe, c02a, r0, c2hn2, AK5);
        }
        throw AnonymousClass001.A0L("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    public static String A06(View view) {
        return view != null ? A07(view.getParent(), new ArrayList()) : "EMPTY";
    }

    public static String A07(ViewParent viewParent, List list) {
        if (viewParent != null) {
            list.add(viewParent);
            return A07(viewParent.getParent(), list);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        int i = 0;
        for (int A04 = AnonymousClass001.A04(list); A04 >= 0; A04--) {
            Object obj = list.get(A04);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < i) {
                    A0k.append("  ");
                    i2 = i3 + 1;
                }
            }
            A0k.append(obj);
            A0k.append("\n");
            i++;
        }
        return A0k.toString();
    }

    public static void A08(RecyclerView recyclerView, C2X1 c2x1) {
        if (!(recyclerView instanceof 2Mp)) {
            if (recyclerView.getViewTreeObserver() != null) {
                recyclerView.getViewTreeObserver().removeOnPreDrawListener(c2x1.A0P);
            }
        } else {
            2Mp r0 = (2Mp) recyclerView;
            r0.D66(c2x1.A0V);
            Iterator it = c2x1.A0i.iterator();
            while (it.hasNext()) {
                r0.D66((2XR) it.next());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r301.A01 < r311.size()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        if (r309 != (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(X.C23P r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A09(X.23P, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.23P, java.lang.Object] */
    private void A0A(C23P c23p, List list, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        C2X7 c2x7 = this.A0U;
        C3m5 ALL = c2x7.ALL(i2, i3);
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            ComponentsSystrace.A02("computeLayoutsToFillListViewport");
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ?? obj = new Object();
        int i6 = 0;
        while (true) {
            i4 = i6;
            if (!ALL.DAB() || i5 >= list.size()) {
                break;
            }
            2iK r0 = (2iK) list.get(i5);
            C2hn A02 = r0.A02();
            if (A02.Cfl()) {
                break;
            }
            r0.A07(this.A0R, (C23P) obj, c2x7.AcU(A02, makeMeasureSpec), c2x7.AcQ(A02, makeMeasureSpec2));
            ALL.A4z(A02, obj.A01, obj.A00);
            i5++;
            i6 = i4 + 1;
        }
        if (c23p != null) {
            int AmU = ALL.AmU();
            if (c2x7.B9E() == 1) {
                c23p.A01 = i2;
                c23p.A00 = Math.min(AmU, i3);
            } else {
                c23p.A01 = Math.min(AmU, i2);
                c23p.A00 = i3;
            }
        }
        if (BWo) {
            ComponentsSystrace.A01();
        }
        int size = list.size();
        if (2Yn.A00) {
            android.util.Log.d("SectionsDebug", 0Pz.A0y("(", ") filled viewport with ", " items (holder.size() = ", ")", hashCode(), i4, size));
        }
    }

    private void A0B(2iK r302) {
        int A01 = A01(this.A0A, r302, this, this.A06);
        int A00 = A00(this.A0A, r302, this, this.A05);
        if (!r302.A0A(A01, A00)) {
            r302.A06(this.A0R, (C2k0) null, A01, A00);
        } else if (r302.A08()) {
            ComponentTree A012 = r302.A01();
            if (A012.A0i != null) {
                A012.A0i = null;
            }
        }
    }

    public static void A0C(2iK r301) {
        if (A0X(r301) && r301.A01() != null && r301.A01().A08 == null) {
            r301.A03();
        }
    }

    public static void A0D(final 2iK r301, C2X1 c2x1) {
        if (1sP.A01()) {
            A0C(r301);
            return;
        }
        if (!C02A.defaultInstance.A0L) {
            c2x1.A0N.post(new Runnable() { // from class: X.3ew
                public static final String __redex_internal_original_name = "RecyclerBinder$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C2X1.A0C(r301);
                }
            });
            return;
        }
        synchronized (c2x1.A0b) {
            c2x1.A0E.addLast(r301);
            if (!c2x1.A0H) {
                c2x1.A0N.post(c2x1.A0d);
                c2x1.A0H = true;
            }
        }
    }

    private void A0E(2iK r302, C2hn c2hn) {
        C2hn A02 = r302.A02();
        synchronized (r302) {
            try {
                r302.A07 = false;
                r302.A04 = c2hn;
            } catch (Throwable th) {
                th = th;
            }
        }
        C2kk c2kk = this.A12;
        if (c2kk == null || !c2kk.Cz2(A02, c2hn)) {
            return;
        }
        C03483y7 AK5 = c2kk.AK5(c2hn);
        synchronized (r302) {
            r302.A05 = AK5;
            ComponentTree componentTree = r302.A01;
            if (componentTree != null) {
                synchronized (componentTree.A0X) {
                    try {
                        6ET r0 = componentTree.A04;
                        if (r0 != null) {
                            componentTree.A0C.Cdn(r0);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (AK5 == null) {
                    Looper A00 = ComponentTree.A00();
                    11T.A0F(A00, 1);
                    new Handler(A00);
                } else if (ComponentTree.A0k != null) {
                    int i = C02A.DEFAULT_BACKGROUND_THREAD_PRIORITY;
                }
                componentTree.A0C = 1N4.A00(AK5);
            }
        }
    }

    private void A0F(3xK r302) {
        Iterator it = r302.A03.iterator();
        while (it.hasNext()) {
            C6r8 c6r8 = (C6r8) it.next();
            if (c6r8 instanceof C6r9) {
                A0B(((C6r9) c6r8).A01);
            }
        }
    }

    public static void A0G(C6r9 c6r9, C2X1 c2x1) {
        A0H(c6r9, c2x1);
        2iK r0 = c6r9.A01;
        2XV r02 = c2x1.A14;
        synchronized (r0) {
            ComponentTree componentTree = r0.A01;
            if (componentTree != null) {
                componentTree.A0i = r02;
            } else {
                r0.A03 = r02;
            }
        }
        if (c2x1.A0W()) {
            if (C02A.enableComputeLayoutAsyncAfterInsertion || c2x1.A00 == 1) {
                c2x1.A0B(r0);
            }
        }
    }

    public static void A0H(C6r8 c6r8, C2X1 c2x1) {
        3xK r303 = c2x1.A0B;
        if (r303 == null) {
            r303 = new 3xK(c2x1.A00);
            c2x1.A0B = r303;
        }
        r303.A03.add(c6r8);
    }

    public static void A0I(C2jy c2jy, C2X1 c2x1) {
        C23P c23p;
        int i;
        int i2;
        2iK next = c2jy.next();
        if (c2x1.A0k.isEmpty() || next == null || c2x1.A04 != -1) {
            return;
        }
        synchronized (c2x1) {
            c23p = c2x1.A0A;
            i = c2x1.A06;
            i2 = c2x1.A05;
        }
        int A01 = A01(c23p, next, c2x1, i);
        int A00 = A00(c23p, next, c2x1, i2);
        if (next.A0A(A01, A00)) {
            return;
        }
        next.A06(c2x1.A0R, new 2zV(next, c2jy, c2x1), A01, A00);
    }

    public static void A0J(C2X1 c2x1) {
        if (c2x1.A0r && !c2x1.A0k.isEmpty()) {
            throw AnonymousClass001.A0q("Circular lists do not support insert operation");
        }
    }

    public static void A0K(C2X1 c2x1) {
        if (C02A.isEndToEndTestRun) {
            long id = Thread.currentThread().getId();
            long andSet = c2x1.A0n.getAndSet(id);
            if (id != andSet && andSet != -1) {
                throw AnonymousClass001.A0N(0Pz.A0u("Multiple threads applying change sets at once! (", " and ", ")", andSet, id));
            }
        }
    }

    public static void A0L(final C2X1 c2x1) {
        boolean z;
        1sP.A00();
        Deque deque = c2x1.A0h;
        if (deque.isEmpty() || !c2x1.A0L) {
            return;
        }
        RecyclerView recyclerView = c2x1.A08;
        if (recyclerView != null) {
            if (recyclerView.A1L() && recyclerView.A0U && recyclerView.getWindowVisibility() == 0) {
                ViewParent viewParent = recyclerView;
                while (true) {
                    Object obj = viewParent;
                    if (obj instanceof View) {
                        View view = (View) obj;
                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                            break;
                        } else {
                            viewParent = view.getParent();
                        }
                    } else {
                        Rect rect = A1D;
                        if (recyclerView.getGlobalVisibleRect(rect)) {
                            if (deque.size() > 20) {
                                deque.clear();
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("recyclerView: ");
                                A0k.append(recyclerView);
                                A0k.append(", hasPendingAdapterUpdates(): ");
                                A0k.append(recyclerView.A1L());
                                A0k.append(", isAttachedToWindow(): ");
                                Object obj2 = recyclerView;
                                A0k.append(recyclerView.A0U);
                                A0k.append(", getWindowVisibility(): ");
                                A0k.append(recyclerView.getWindowVisibility());
                                A0k.append(", vie visible hierarchy: ");
                                ArrayList A0s = AnonymousClass001.A0s();
                                while (obj2 instanceof View) {
                                    RecyclerView recyclerView2 = (View) obj2;
                                    StringBuilder A0k2 = AnonymousClass001.A0k();
                                    A0k2.append("view=");
                                    A0k2.append(AnonymousClass001.A0X(recyclerView2));
                                    A0k2.append(JQw.A00(39));
                                    A0k2.append(recyclerView2.getAlpha());
                                    A0k2.append(", visibility=");
                                    A0k2.append(recyclerView2.getVisibility());
                                    1BK.A1N(A0k2, A0s);
                                    if (recyclerView2.getAlpha() <= 0.0f || recyclerView2.getVisibility() != 0) {
                                        break;
                                    } else {
                                        obj2 = recyclerView2.getParent();
                                    }
                                }
                                A0k.append(A0s);
                                A0k.append(", getGlobalVisibleRect(): ");
                                A0k.append(recyclerView.getGlobalVisibleRect(rect));
                                A0k.append(", isComputingLayout(): ");
                                A0k.append(AnonymousClass001.A1P(recyclerView.A01));
                                A0k.append(", isSubAdapter: ");
                                A0k.append(false);
                                A0k.append(", visible range: [");
                                A0k.append(c2x1.A01);
                                AnonymousClass001.A1H(A0k);
                                A0k.append(c2x1.A02);
                                A0k.append("]");
                                C53s.A00("RecyclerBinder:DataRenderedNotTriggered", 0S2.A01, AnonymousClass001.A0Z(A0k, "@OnDataRendered callbacks aren't triggered as expected: ", AnonymousClass001.A0k()));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        final ArrayDeque arrayDeque = new ArrayDeque(deque);
        deque.clear();
        final boolean z2 = z;
        c2x1.A0N.postAtFrontOfQueue(new Runnable() { // from class: X.6r7
            public static final String __redex_internal_original_name = "RecyclerBinder$13";

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    Deque deque2 = arrayDeque;
                    if (deque2.isEmpty()) {
                        return;
                    } else {
                        ((2Z0) deque2.pollFirst()).Bsh(z2, uptimeMillis);
                    }
                }
            }
        });
    }

    public static void A0M(C2X1 c2x1) {
        RecyclerView recyclerView = c2x1.A08;
        if (recyclerView != null && c2x1.A0a.A02()) {
            Runnable runnable = c2x1.A0f;
            recyclerView.removeCallbacks(runnable);
            c2x1.A08.postOnAnimation(runnable);
        }
        A0S(c2x1, c2x1.A0Y, c2x1.A01, c2x1.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r0.A00 == r0.A00) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.23P, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0N(X.C2X1 r301) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A0N(X.2X1):void");
    }

    public static void A0O(C2X1 c2x1) {
        if (2Yn.A00) {
            android.util.Log.d("SectionsDebug", 0Pz.A0d("(", ") requestRemeasure", c2x1.hashCode()));
        }
        RecyclerView recyclerView = c2x1.A08;
        Handler handler = c2x1.A0N;
        Runnable runnable = c2x1.A0e;
        handler.removeCallbacks(runnable);
        if (recyclerView == null) {
            handler.post(runnable);
        } else {
            recyclerView.removeCallbacks(runnable);
            recyclerView.postOnAnimation(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        if (r0.A0A() == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0P(X.C2X1 r301, int r302) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A0P(X.2X1, int):void");
    }

    public static void A0Q(C2X1 c2x1, int i) {
        if (c2x1.A0r) {
            List list = c2x1.A0k;
            if (!list.isEmpty() && list.size() != i) {
                throw AnonymousClass001.A0q("Circular lists do not support insert operation");
            }
        }
    }

    public static void A0R(C2X1 c2x1, int i, boolean z) {
        int i2;
        int i3 = c2x1.A0y;
        if (i3 == 1) {
            if (!z) {
                return;
            } else {
                i = c2x1.A02;
            }
        } else if (i3 != 2 || i != (i2 = c2x1.A02) || c2x1.A01 != i2) {
            return;
        }
        RecyclerView recyclerView = c2x1.A08;
        if (recyclerView == null) {
            c2x1.A01 = i;
        } else {
            recyclerView.A0u(i);
        }
    }

    public static void A0S(final C2X1 c2x1, 2Xg r302, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        2zR r317;
        int i5 = i2;
        int i6 = i;
        synchronized (c2x1) {
            if (c2x1.A0W()) {
                int i7 = c2x1.A04;
                float f = 0.0f / 0.0f;
                if (i7 != -1) {
                    if (i == -1 || i2 == -1) {
                        i6 = 0;
                        i5 = 0;
                    }
                    int max = Math.max(i7, i5 - i6);
                    final int size = c2x1.A0k.size();
                    if (c2x1.A0r) {
                        i4 = size;
                        i3 = 0;
                    } else {
                        int i8 = (int) (max * c2x1.A0M);
                        i3 = i6 - i8;
                        i4 = max + i6 + i8;
                    }
                    if (i3 < c2x1.A0J || i4 > c2x1.A0I) {
                        c2x1.A0J = i3;
                        c2x1.A0I = i4;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c2x1.A0z != 1) {
                        r317 = new 2zR(c2x1, i3, i4, size);
                    } else {
                        final int i9 = i3;
                        final int i10 = i4;
                        final boolean z2 = z;
                        r317 = new C2k4() { // from class: X.3Z0
                            /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
                            @Override // X.C2k4
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public boolean CZ7(int r302) {
                                /*
                                    Method dump skipped, instructions count: 276
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C3Z0.CZ7(int):boolean");
                            }
                        };
                    }
                    r302.D57(r317, 0, size, i6, i5);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.23P, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0T(X.C2X1 r301, java.util.List r302, int r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A0T(X.2X1, java.util.List, int, int, int):void");
    }

    public static void A0U(C2hn c2hn) {
        if (c2hn == null) {
            throw AnonymousClass001.A0T("Received null RenderInfo to insert/update!");
        }
    }

    public static void A0V(C2hn c2hn, String str, int i, int i2, boolean z) {
        if (z) {
            if (i2 >= 0 && i2 <= i) {
                return;
            }
        } else if (i2 >= 0 && i2 < i) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Trying to [");
        A0k.append(str);
        A0k.append("] while index is out of bounds (index=");
        A0k.append(i2);
        A0k.append(", size=");
        A0k.append(i);
        A0k.append("). This likely means data passed to the section had duplicates or a mutable data model. Component involved in the error whose backing data model may have duplicates: ");
        A0k.append(c2hn == null ? "NULL" : c2hn.getName());
        String A0d = AnonymousClass001.A0d(". Read more here: https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception", A0k);
        11T.A0F(A0d, 1);
        throw new RuntimeException(A0d, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301.A18.get() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0W() {
        /*
            r301 = this;
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0m
            r302 = r0
            r0 = r302
            boolean r0 = r0.get()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A18
            r302 = r0
            r0 = r302
            boolean r0 = r0.get()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L1e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A0W():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r301.A01() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0X(X.2iK r301) {
        /*
            r0 = r301
            boolean r0 = r0.A09()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L47
            r0 = r301
            X.2hn r0 = r0.A04
            r303 = r0
            java.lang.String r0 = "prevent_release"
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = r0.AgD(r1)
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof java.lang.Boolean
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2c
            r0 = r303
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L47
        L2c:
            r0 = r301
            X.2hn r0 = r0.A02()
            r304 = r0
            r0 = r304
            boolean r0 = r0.BWO()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L47
            r0 = r301
            com.facebook.litho.ComponentTree r0 = r0.A01()
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L4b
        L47:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L4b:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A0X(X.2iK):boolean");
    }

    public final void A0Y(int i) {
        2iK r0;
        1sP.A00();
        A0Q(this, 1);
        if (2Yn.A00) {
            android.util.Log.d("SectionsDebug", 0Pz.A0C(hashCode(), i, "(", ") removeItemAt "));
        }
        synchronized (this) {
            List list = this.A0k;
            A0V(null, "removeItemAt", list.size(), i, false);
            r0 = (2iK) list.remove(i);
        }
        boolean z = true;
        this.A0Q.A01.A03(i, 1);
        2Xj r02 = this.A0a;
        if (!r02.A02() && i > r02.A01) {
            z = false;
        }
        r02.A01(z);
        if (r0 == null || C02A.disableReleaseComponentTreeInRecyclerBinder) {
            return;
        }
        if (C02A.enableFixForDisappearTransitionInRecyclerBinder) {
            r0.A05();
        } else {
            this.A0N.post(new 5O8(r0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        if (r0 > (r301.A02 + r0)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017d, code lost:
    
        if (r303 > ((r0 + r0) - 1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a3, code lost:
    
        if (r302 > ((r0 + r0) - 1)) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Z(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.A0Z(int, int):void");
    }

    public final void A0a(int i, int i2) {
        1sP.A00();
        A0Q(this, i2);
        if (2Yn.A00) {
            android.util.Log.d("SectionsDebug", 0Pz.A0q("(", ") removeRangeAt ", ", size: ", hashCode(), i, i2));
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= i2) {
                    break;
                }
                List list = this.A0k;
                A0V(null, "removeRangeAt", list.size(), i, false);
                arrayList.add((2iK) list.remove(i));
                i3 = i4 + 1;
            }
        }
        this.A0Q.A01.A03(i, i2);
        2Xj r0 = this.A0a;
        boolean z = true;
        if (!r0.A02() && i > r0.A01) {
            z = false;
        }
        r0.A01(z);
        if (C02A.disableReleaseComponentTreeInRecyclerBinder) {
            return;
        }
        if (!C02A.enableFixForDisappearTransitionInRecyclerBinder) {
            this.A0N.post(new C31l(arrayList));
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((2iK) arrayList.get(i5)).A05();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x025b, code lost:
    
        if (r0 != false) goto L67;
     */
    @Override // X.C2X2
    /* renamed from: A0b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BeW(androidx.recyclerview.widget.RecyclerView r302) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.BeW(androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // X.C2X2
    /* renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public void D5n(RecyclerView recyclerView) {
        int i;
        int top;
        int A0Z;
        int bottom;
        int i2;
        1sP.A00();
        C2X7 c2x7 = this.A0U;
        2XA AtW = c2x7.AtW();
        View A0c = AtW.A0c(this.A01);
        if (A0c != null) {
            boolean z = AtW instanceof LinearLayoutManager ? ((LinearLayoutManager) AtW).A07 : false;
            if (c2x7.B9E() == 0) {
                if (z) {
                    top = recyclerView.getWidth() - AtW.A0Y();
                    bottom = A0c.getRight();
                    i2 = ((C2lg) A0c.getLayoutParams()).A02.right;
                    A0Z = bottom + i2;
                    i = top - A0Z;
                } else {
                    top = A0c.getLeft() - ((C2lg) A0c.getLayoutParams()).A02.left;
                    A0Z = AtW.A0X();
                    i = top - A0Z;
                }
            } else if (z) {
                top = recyclerView.getHeight() - AtW.A0W();
                bottom = A0c.getBottom();
                i2 = ((C2lg) A0c.getLayoutParams()).A02.bottom;
                A0Z = bottom + i2;
                i = top - A0Z;
            } else {
                top = A0c.getTop() - ((C2lg) A0c.getLayoutParams()).A02.top;
                A0Z = AtW.A0Z();
                i = top - A0Z;
            }
        } else {
            i = 0;
        }
        this.A03 = i;
        2Xj r0 = this.A0a;
        recyclerView.A1G(r0.A06);
        A08(recyclerView, this);
        A0L(this);
        recyclerView.A16(null);
        recyclerView.A1D(null);
        2XZ r02 = this.A16;
        if (r02 != null) {
            synchronized (r0) {
                List list = r0.A07;
                if (!list.isEmpty()) {
                    list.remove(r02);
                }
            }
        }
        if (this.A08 == recyclerView) {
            this.A08 = null;
            C2mg c2mg = this.A0C;
            if (c2mg != null) {
                c2mg.A08();
            }
            c2x7.Ctp(null);
        }
    }

    public void A0d(2Z0 r302, boolean z) {
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            ComponentsSystrace.A02("notifyChangeSetComplete");
        }
        try {
            if (2Yn.A00) {
                android.util.Log.d("SectionsDebug", 0Pz.A0d("(", ") notifyChangeSetComplete", hashCode()));
            }
            1sP.A00();
            if (this.A1C) {
                throw AnonymousClass001.A0T("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
            }
            r302.BsR();
            this.A0h.addLast(r302);
            A0L(this);
            if (z) {
                2lK r0 = this.A0T;
                if (2Z1.A00(r0)) {
                    this.A0D = r0.A00;
                }
                A0N(this);
            }
        } finally {
            if (BWo) {
                ComponentsSystrace.A01();
            }
        }
    }

    public final void A0e(C2hn c2hn, int i) {
        1sP.A00();
        A0J(this);
        if (2Yn.A00) {
            android.util.Log.d("SectionsDebug", 0Pz.A0x("(", ") insertItemAt ", ", name: ", c2hn.getName(), hashCode(), i));
        }
        A0U(c2hn);
        2iK A05 = A05(this, c2hn);
        synchronized (this) {
            if (this.A1C) {
                throw AnonymousClass001.A0T("Trying to do a sync insert when using asynchronous mutations!");
            }
            this.A0k.add(i, A05);
            this.A0Z.A00(c2hn);
        }
        this.A0Q.A01.A02(i, 1);
        2Xj r0 = this.A0a;
        boolean A03 = r0.A03(i, this.A04);
        A0R(this, i, A03);
        r0.A01(A03);
    }

    public final void A0f(C2hn c2hn, int i) {
        boolean Cfl;
        1sP.A00();
        if (2Yn.A00) {
            android.util.Log.d("SectionsDebug", 0Pz.A0x("(", ") updateItemAt ", ", name: ", c2hn.getName(), hashCode(), i));
        }
        synchronized (this) {
            List list = this.A0k;
            A0V(c2hn, "updateItemAt", list.size(), i, false);
            2iK r0 = (2iK) list.get(i);
            Cfl = r0.A02().Cfl();
            A0U(c2hn);
            this.A0Z.A00(c2hn);
            A0E(r0, c2hn);
        }
        if (Cfl || c2hn.Cfl()) {
            this.A0Q.A08(i);
        }
        2Xj r02 = this.A0a;
        boolean z = true;
        if (!r02.A02()) {
            int i2 = i;
            while (true) {
                int i3 = i2;
                if (i3 >= i + 1) {
                    z = false;
                    break;
                } else if (r02.A00 <= i3 && i3 <= r02.A01) {
                    break;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        r02.A01(z);
    }

    public void A0g(Integer num, int i, int i2) {
        if (this.A08 == null) {
            this.A01 = i;
            this.A03 = i2;
            this.A0K = num;
        } else {
            C02833wb A00 = C2kc.A00(this.A0R.A0D, num, i2);
            ((AbstractC02843wc) A00).A00 = i;
            this.A08.A0F.A0x(A00);
        }
    }

    public final void A0h(List list, int i) {
        1sP.A00();
        if (2Yn.A00) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((C2hn) list.get(i2)).getName();
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("(");
            A0k.append(hashCode());
            A0k.append(") updateRangeAt ");
            1BL.A1N(A0k, list, strArr, i);
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C2hn c2hn = (C2hn) list.get(i3);
                int i4 = i + i3;
                List list2 = this.A0k;
                A0V(c2hn, "updateRangeAt", list2.size(), i4, false);
                2iK r0 = (2iK) list2.get(i4);
                A0U(c2hn);
                if (c2hn.Cfl() || r0.A02().Cfl()) {
                    this.A0Q.A08(i4);
                }
                this.A0Z.A00(c2hn);
                A0E(r0, c2hn);
            }
        }
        2Xj r02 = this.A0a;
        int size2 = list.size();
        boolean z = true;
        if (!r02.A02()) {
            int i5 = i;
            while (true) {
                int i6 = i5;
                if (i6 >= i + size2) {
                    z = false;
                    break;
                } else if (r02.A00 <= i6 && i6 <= r02.A01) {
                    break;
                } else {
                    i5 = i6 + 1;
                }
            }
        }
        r02.A01(z);
    }

    @Override // X.C2X2
    public boolean ADb() {
        return this.A0F;
    }

    @Override // X.C2X2
    public void AN3() {
        ArrayList A17;
        if (this.A10 == null) {
            if (!1sP.A01()) {
                synchronized (this) {
                    A17 = 1BK.A17(this.A0k);
                }
                this.A0N.post(new C31l(A17));
            } else {
                List list = this.A0k;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((2iK) list.get(i)).A04();
                }
            }
        }
    }

    @Override // X.C2X4
    public int ASi() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.C2X4
    public int ASk() {
        return this.A0U.ASk();
    }

    @Override // X.C2X4
    public int ASn() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.C2X4
    public int ASo() {
        return this.A0U.ASo();
    }

    @Override // X.C2X2
    public int AcT(int i) {
        int A01;
        synchronized (this) {
            2iK r0 = (2iK) this.A0k.get(i);
            r0.getClass();
            A01 = A01(this.A0A, r0, this, this.A06);
        }
        return A01;
    }

    @Override // X.C2X3
    public final ComponentTree AdH(int i) {
        2iK r306;
        C23P c23p;
        int i2;
        int i3;
        if (C02A.enableFixForStickyHeader) {
            r306 = (2iK) this.A0k.get(i);
        } else {
            synchronized (this) {
                1sP.A00();
                r306 = (2iK) this.A0k.get(i);
            }
        }
        synchronized (this) {
            c23p = this.A0A;
            i2 = this.A06;
            i3 = this.A05;
        }
        int A01 = A01(c23p, r306, this, i2);
        int A00 = A00(c23p, r306, this, i3);
        if (!r306.A0A(A01, A00)) {
            r306.A07(this.A0R, (C23P) null, A01, A00);
        }
        return r306.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (((X.2iK) r301.A0k.get(r302)).A02().BWO() == false) goto L6;
     */
    @Override // X.C2X3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BWP(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.BXA(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2a
            r0 = r301
            java.util.List r0 = r0.A0k
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            X.2iK r0 = (X.2iK) r0
            X.2hn r0 = r0.A02()
            r304 = r0
            r0 = r304
            boolean r0 = r0.BWO()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L2e
        L2a:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L2e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.BWP(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r302 >= r301.A0k.size()) goto L6;
     */
    @Override // X.C2X3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BXA(int r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 < 0) goto L18
            r0 = r301
            java.util.List r0 = r0.A0k
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 < r1) goto L1d
        L18:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.BXA(int):boolean");
    }

    @Override // X.C2X2
    public boolean BXQ() {
        return this.A0u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x028d, code lost:
    
        if (r301.A0u == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f7, code lost:
    
        r316 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x031b, code lost:
    
        r313.set(r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x02f1, code lost:
    
        r316 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x02ee, code lost:
    
        if (r301.A0u == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0200, code lost:
    
        if (r301.A01 < r320.size()) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0655 A[Catch: all -> 0x06ac, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:40:0x0115, B:41:0x011a, B:44:0x0129, B:45:0x0130, B:48:0x013c, B:53:0x014f, B:56:0x015b, B:57:0x0162, B:59:0x016d, B:62:0x0179, B:64:0x0181, B:66:0x0188, B:67:0x018d, B:69:0x05b3, B:71:0x05ba, B:82:0x05be, B:84:0x05c7, B:85:0x05cb, B:87:0x05d0, B:91:0x05e3, B:95:0x05f2, B:98:0x05ff, B:100:0x0606, B:101:0x060d, B:105:0x061f, B:106:0x0628, B:108:0x0631, B:113:0x063a, B:119:0x06a8, B:121:0x06ab, B:123:0x0644, B:124:0x0649, B:127:0x0655, B:130:0x0661, B:133:0x068d, B:134:0x0694, B:137:0x069e, B:138:0x066d, B:139:0x0674, B:141:0x067d, B:142:0x0684, B:143:0x056c, B:146:0x0578, B:147:0x057f, B:149:0x058a, B:152:0x0596, B:153:0x059d, B:155:0x05a5, B:157:0x05ac, B:159:0x0199, B:160:0x01a0, B:162:0x01a7, B:165:0x01b1, B:170:0x0251, B:175:0x026a, B:179:0x0278, B:181:0x027f, B:182:0x0284, B:187:0x031b, B:189:0x0322, B:192:0x032c, B:193:0x0331, B:195:0x0338, B:196:0x033d, B:198:0x034a, B:200:0x0351, B:202:0x0358, B:204:0x035f, B:206:0x0366, B:207:0x036b, B:209:0x0370, B:210:0x0377, B:211:0x037e, B:212:0x0385, B:214:0x038c, B:216:0x0393, B:218:0x039a, B:221:0x03a4, B:225:0x03b2, B:226:0x03b7, B:231:0x03c3, B:233:0x03c9, B:234:0x0406, B:235:0x040d, B:238:0x041b, B:239:0x0422, B:240:0x0429, B:242:0x0435, B:243:0x043a, B:245:0x043f, B:247:0x0448, B:248:0x0450, B:249:0x0457, B:252:0x0465, B:253:0x046a, B:254:0x0473, B:255:0x047a, B:256:0x0481, B:257:0x0488, B:260:0x0496, B:261:0x049f, B:265:0x04b2, B:266:0x04b9, B:268:0x04c2, B:273:0x04cb, B:274:0x04d2, B:275:0x04d9, B:277:0x04fe, B:279:0x03d0, B:280:0x03d5, B:281:0x03de, B:284:0x03ec, B:285:0x03f5, B:287:0x03fe, B:289:0x0525, B:293:0x0533, B:295:0x053a, B:298:0x0549, B:299:0x0550, B:300:0x0557, B:302:0x0564, B:303:0x0506, B:305:0x050f, B:307:0x0516, B:309:0x051d, B:311:0x0293, B:314:0x029f, B:319:0x02b0, B:321:0x02b7, B:323:0x02be, B:326:0x02cb, B:330:0x02d9, B:332:0x02e0, B:333:0x02e5, B:336:0x0300, B:341:0x0311, B:344:0x01c7, B:345:0x01ce, B:348:0x01dc, B:350:0x01e5, B:351:0x01ec, B:352:0x01f3, B:357:0x0230, B:358:0x0237, B:360:0x0246, B:361:0x0206, B:362:0x020d, B:365:0x021b, B:367:0x0224, B:111:0x0634), top: B:39:0x0115, outer: #1, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x069e A[Catch: all -> 0x06ac, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:40:0x0115, B:41:0x011a, B:44:0x0129, B:45:0x0130, B:48:0x013c, B:53:0x014f, B:56:0x015b, B:57:0x0162, B:59:0x016d, B:62:0x0179, B:64:0x0181, B:66:0x0188, B:67:0x018d, B:69:0x05b3, B:71:0x05ba, B:82:0x05be, B:84:0x05c7, B:85:0x05cb, B:87:0x05d0, B:91:0x05e3, B:95:0x05f2, B:98:0x05ff, B:100:0x0606, B:101:0x060d, B:105:0x061f, B:106:0x0628, B:108:0x0631, B:113:0x063a, B:119:0x06a8, B:121:0x06ab, B:123:0x0644, B:124:0x0649, B:127:0x0655, B:130:0x0661, B:133:0x068d, B:134:0x0694, B:137:0x069e, B:138:0x066d, B:139:0x0674, B:141:0x067d, B:142:0x0684, B:143:0x056c, B:146:0x0578, B:147:0x057f, B:149:0x058a, B:152:0x0596, B:153:0x059d, B:155:0x05a5, B:157:0x05ac, B:159:0x0199, B:160:0x01a0, B:162:0x01a7, B:165:0x01b1, B:170:0x0251, B:175:0x026a, B:179:0x0278, B:181:0x027f, B:182:0x0284, B:187:0x031b, B:189:0x0322, B:192:0x032c, B:193:0x0331, B:195:0x0338, B:196:0x033d, B:198:0x034a, B:200:0x0351, B:202:0x0358, B:204:0x035f, B:206:0x0366, B:207:0x036b, B:209:0x0370, B:210:0x0377, B:211:0x037e, B:212:0x0385, B:214:0x038c, B:216:0x0393, B:218:0x039a, B:221:0x03a4, B:225:0x03b2, B:226:0x03b7, B:231:0x03c3, B:233:0x03c9, B:234:0x0406, B:235:0x040d, B:238:0x041b, B:239:0x0422, B:240:0x0429, B:242:0x0435, B:243:0x043a, B:245:0x043f, B:247:0x0448, B:248:0x0450, B:249:0x0457, B:252:0x0465, B:253:0x046a, B:254:0x0473, B:255:0x047a, B:256:0x0481, B:257:0x0488, B:260:0x0496, B:261:0x049f, B:265:0x04b2, B:266:0x04b9, B:268:0x04c2, B:273:0x04cb, B:274:0x04d2, B:275:0x04d9, B:277:0x04fe, B:279:0x03d0, B:280:0x03d5, B:281:0x03de, B:284:0x03ec, B:285:0x03f5, B:287:0x03fe, B:289:0x0525, B:293:0x0533, B:295:0x053a, B:298:0x0549, B:299:0x0550, B:300:0x0557, B:302:0x0564, B:303:0x0506, B:305:0x050f, B:307:0x0516, B:309:0x051d, B:311:0x0293, B:314:0x029f, B:319:0x02b0, B:321:0x02b7, B:323:0x02be, B:326:0x02cb, B:330:0x02d9, B:332:0x02e0, B:333:0x02e5, B:336:0x0300, B:341:0x0311, B:344:0x01c7, B:345:0x01ce, B:348:0x01dc, B:350:0x01e5, B:351:0x01ec, B:352:0x01f3, B:357:0x0230, B:358:0x0237, B:360:0x0246, B:361:0x0206, B:362:0x020d, B:365:0x021b, B:367:0x0224, B:111:0x0634), top: B:39:0x0115, outer: #1, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05ed  */
    /* JADX WARN: Type inference failed for: r0v128, types: [X.23P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v233, types: [X.23P, java.lang.Object] */
    @Override // X.C2X2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bdw(X.1Im r302, X.C23P r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.Bdw(X.1Im, X.23P, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r304 == false) goto L34;
     */
    @Override // X.C2X2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Cuf(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            int r0 = r0.A06     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            int r0 = X.C22b.A00     // Catch: java.lang.Throwable -> Laf
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L83
            r0 = 1073741824(0x40000000, float:2.0)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)     // Catch: java.lang.Throwable -> Laf
            r306 = r0
            r0 = r303
            r1 = r304
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)     // Catch: java.lang.Throwable -> Laf
            r307 = r0
            r0 = r301
            X.23P r0 = r0.A0A     // Catch: java.lang.Throwable -> Laf
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L83
            r0 = r301
            X.2X7 r0 = r0.A0U     // Catch: java.lang.Throwable -> Laf
            r309 = r0
            r0 = r309
            int r0 = r0.B9E()     // Catch: java.lang.Throwable -> Laf
            r310 = r0
            r0 = r301
            int r0 = r0.A06     // Catch: java.lang.Throwable -> Laf
            r311 = r0
            r0 = r311
            r1 = r305
            if (r0 == r1) goto L83
            r0 = r310
            if (r0 == 0) goto L6a
            r0 = 1
            r304 = r0
            r0 = r310
            r1 = r304
            if (r0 != r1) goto L83
            r0 = r308
            int r0 = r0.A01     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            r0 = r311
            r1 = r306
            r2 = r304
            boolean r0 = X.2AR.A00(r0, r1, r2)     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            goto L7f
        L6a:
            r0 = r301
            int r0 = r0.A05     // Catch: java.lang.Throwable -> Laf
            r311 = r0
            r0 = r308
            int r0 = r0.A00     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            r0 = r311
            r1 = r307
            r2 = r304
            boolean r0 = X.2AR.A00(r0, r1, r2)     // Catch: java.lang.Throwable -> Laf
            r304 = r0
        L7f:
            r0 = r304
            if (r0 != 0) goto Lac
        L83:
            X.23P r0 = X.C2X1.A1F     // Catch: java.lang.Throwable -> Laf
            r308 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)     // Catch: java.lang.Throwable -> Laf
            r310 = r0
            r0 = r303
            r1 = r304
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)     // Catch: java.lang.Throwable -> Laf
            r311 = r0
            r0 = r301
            X.1Im r0 = r0.A09     // Catch: java.lang.Throwable -> Laf
            r309 = r0
            r0 = r301
            r1 = r309
            r2 = r308
            r3 = r310
            r4 = r311
            r0.Bdw(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Laf
        Lac:
            r0 = r301
            monitor-exit(r0)
            return
        Laf:
            r309 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r309
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X1.Cuf(int, int):void");
    }

    @Override // X.C2X4
    public int getItemCount() {
        return this.A0Q.getItemCount();
    }
}
