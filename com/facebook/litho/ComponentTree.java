package com.facebook.litho;

import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.1LZ;
import X.1N4;
import X.1cU;
import X.1sD;
import X.1sE;
import X.1sH;
import X.1sK;
import X.1sM;
import X.1sP;
import X.1tE;
import X.2AW;
import X.2XV;
import X.2Yv;
import X.30K;
import X.3gW;
import X.3gX;
import X.3jH;
import X.3jS;
import X.49H;
import X.53Q;
import X.6CS;
import X.6ET;
import X.6pM;
import X.6pO;
import X.7G8;
import X.AnonymousClass001;
import X.AnonymousClass319;
import X.C01i;
import X.C02A;
import X.C0T8;
import X.C1qd;
import X.C1qe;
import X.C1qf;
import X.C1qp;
import X.C1qq;
import X.C1ru;
import X.C1rv;
import X.C1rx;
import X.C1ry;
import X.C1rz;
import X.C1s0;
import X.C1s4;
import X.C1s5;
import X.C1s8;
import X.C1s9;
import X.C1sn;
import X.C1sq;
import X.C1tx;
import X.C23N;
import X.C23P;
import X.C26r;
import X.C2X1;
import X.C2iw;
import X.C2k0;
import X.C2ko;
import X.C2l4;
import X.C2xk;
import X.C3NC;
import X.C3Yq;
import X.C3oi;
import X.C5r1;
import X.InterfaceC00713oe;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: ComponentTree.class */
public class ComponentTree implements C1ru, C1rv, C1rx, C1ry, C1rz {
    public static final ThreadLocal A0j = new ThreadLocal();
    public static volatile Looper A0k;
    public int A00;
    public int A01;
    public int A02;
    public 1LI A03;
    public 6ET A04;
    public C3NC A05;
    public C23N A06;
    public C23N A07;
    public LithoView A08;
    public InterfaceC00713oe A09;
    public C1tx A0A;
    public C1s8 A0B;
    public 1cU A0C;
    public 1cU A0D;
    public String A0E;
    public List A0F;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public C5r1 A0M;
    public C1sn A0N;
    public C1qp A0O;
    public C1qp A0P;
    public List A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final AccessibilityManager A0U;
    public final 1Iw A0V;
    public final C1s4 A0W;
    public final Runnable A0Y;
    public final List A0Z;
    public final List A0a;
    public final C1s5 A0b;
    public final 1sH A0c;
    public final C1qp A0d;
    public final Object A0e;
    public final Object A0f;
    public final Object A0g;
    public final boolean A0h;
    public volatile 2XV A0i;
    public boolean A0G = false;
    public final Object A0X = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89, types: [X.1ru] */
    public ComponentTree(C1s0 c1s0) {
        1Iw r315;
        49H r3152;
        LifecycleOwner lifecycleOwner;
        Looper mainLooper = Looper.getMainLooper();
        11T.A0F(mainLooper, 1);
        this.A0D = new Handler(mainLooper);
        this.A0Y = new Runnable() { // from class: X.1s3
            public static final String __redex_internal_original_name = "ComponentTree$1";

            @Override // java.lang.Runnable
            public void run() {
                ComponentTree.A09(ComponentTree.this);
            }
        };
        this.A0e = new Object();
        this.A0f = new Object();
        this.A0g = new Object();
        this.A0a = new ArrayList();
        this.A0Z = new ArrayList();
        this.A0J = -1;
        this.A00 = -1;
        boolean z = C02A.defaultInstance.A0S;
        this.A0h = z;
        this.A02 = -1;
        this.A01 = -1;
        this.A0I = false;
        this.A0W = new C1s4();
        this.A0b = new C1s5(this);
        this.A03 = c1s0.A01;
        int andIncrement = C1qq.A06.getAndIncrement();
        this.A0T = andIncrement;
        C1qf c1qf = new C1qf(andIncrement);
        A0R(c1s0.A02);
        C1s8 c1s8 = c1s0.A05;
        this.A0B = c1s8 == null ? new C1s8(null) : c1s8;
        this.A0c = C02A.USE_INCREMENTAL_MOUNT_HELPER ? new 1sH(this) : null;
        this.A0C = c1s0.A07;
        this.A0D = 1N4.A00(this.A0D);
        Handler handler = this.A0C;
        if (handler == null) {
            Looper A00 = A00();
            11T.A0F(A00, 1);
            handler = new Handler(A00);
        }
        this.A0C = 1N4.A00(handler);
        Context context = c1s0.A00;
        C1qe c1qe = new C1qe(c1qf, c1s0.A06, C1qd.A00(context));
        ComponentTree componentTree = c1s0.A04;
        componentTree = componentTree == null ? this : componentTree;
        if (z) {
            this.A0d = c1s0.A0A;
        } else {
            this.A0d = null;
        }
        if (C02A.defaultInstance.A0H) {
            C1qp c1qp = c1s0.A0A;
            if (c1qp != null) {
                r3152 = (LifecycleOwner) c1qp.A00(C3oi.A00);
                if (r3152 != null) {
                    if (r3152 instanceof 49H) {
                        49H r0 = r3152;
                        synchronized (r0) {
                            lifecycleOwner = r0.A00;
                        }
                        r3152 = new 49H(lifecycleOwner);
                    }
                    C1qp c1qp2 = new C1qp();
                    c1qp2.A02(C3oi.A00, r3152);
                    this.A0O = c1qp2;
                }
            }
            r3152 = new 49H((LifecycleOwner) null);
            C1qp c1qp22 = new C1qp();
            c1qp22.A02(C3oi.A00, r3152);
            this.A0O = c1qp22;
        }
        if (z) {
            this.A0P = A04(null);
            11T.A0F(componentTree, 1);
            r315 = new 1Iw(context, c1qe, new C1qq(this, this, this, componentTree, this.A0T), C02A.defaultInstance.A0M ? c1s0.A03 : this.A09, (C1qp) null, (C1qp) null, "root");
        } else {
            C1qp c1qp3 = this.A0O;
            C1qp c1qp4 = c1s0.A0A;
            c1qp4 = c1qp3 != null ? A04(c1qp4) : c1qp4;
            11T.A0F(componentTree, 1);
            r315 = new 1Iw(context, c1qe, new C1qq(this, this, this, componentTree, this.A0T), C02A.defaultInstance.A0M ? c1s0.A03 : this.A09, c1qp4, c1s0.A09, "root");
        }
        this.A0V = r315;
        if (c1s0.A06.A02 != null) {
            Looper A002 = A00();
            11T.A0F(A002, 1);
            Handler handler2 = new Handler(A002);
            int i = this.A0T;
            1Iw r02 = this.A0V;
            this.A05 = new C3NC(r02, r02.A03.A01.A03, handler2, new 3jH(this, 4), new 3jS(), i, c1s0.A06.A0A);
        }
        InterfaceC00713oe interfaceC00713oe = C02A.defaultInstance.A0M ? this.A0V.A05 : c1s0.A03;
        if (interfaceC00713oe != null) {
            A0T(interfaceC00713oe);
        }
        if (!z) {
            this.A0P = this.A0V.A08;
        }
        this.A0U = (AccessibilityManager) this.A0V.A0D.getSystemService("accessibility");
    }

    public static Looper A00() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (A0k == null) {
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", C02A.DEFAULT_BACKGROUND_THREAD_PRIORITY);
                C0T8.A00(handlerThread);
                handlerThread.start();
                A0k = handlerThread.getLooper();
            }
            looper = A0k;
        }
        return looper;
    }

    public static C1s0 A01(1LI r301, 1Iw r302, InterfaceC00713oe interfaceC00713oe) {
        C1s0 c1s0 = new C1s0(r302);
        if (r301 != null) {
            c1s0.A01 = r301;
        }
        c1s0.A03 = interfaceC00713oe;
        return c1s0;
    }

    public static C1s0 A02(1Iw r301) {
        InterfaceC00713oe interfaceC00713oe = r301.A05;
        C3Yq c3Yq = interfaceC00713oe == null ? null : new C3Yq(interfaceC00713oe);
        C1s0 c1s0 = new C1s0(1Iw.A01(r301));
        c1s0.A03 = c3Yq;
        return c1s0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f8, code lost:
    
        if (r0.BUi() != true) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r304 == 6) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0299 A[Catch: CancellationException -> 0x0581, InterruptedException -> 0x0595, ExecutionException -> 0x059f, all -> 0x05c0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {InterruptedException -> 0x0595, blocks: (B:114:0x027b, B:116:0x0287, B:119:0x0299, B:120:0x02a0, B:121:0x02a7, B:123:0x02b0, B:125:0x02be, B:127:0x02c5, B:128:0x02cc, B:130:0x02d5, B:131:0x02dc, B:134:0x02e8, B:141:0x030a, B:142:0x0311, B:144:0x031c, B:146:0x0325, B:148:0x0333, B:149:0x033b, B:150:0x0342, B:152:0x034d, B:154:0x0356, B:156:0x0364, B:159:0x036e, B:164:0x0378, B:168:0x037f, B:169:0x0384, B:174:0x039a, B:178:0x03a9, B:179:0x03b0, B:186:0x03d7, B:187:0x03de, B:189:0x03e9, B:191:0x03f2, B:213:0x045d, B:228:0x0571, B:230:0x0578, B:233:0x046e, B:235:0x0478, B:237:0x0482, B:238:0x0489, B:245:0x04a4, B:246:0x04ab, B:248:0x04b6, B:249:0x04bd, B:251:0x04c6, B:252:0x04cd), top: B:113:0x027b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e8 A[Catch: CancellationException -> 0x0581, InterruptedException -> 0x0595, ExecutionException -> 0x059f, all -> 0x05c0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {InterruptedException -> 0x0595, blocks: (B:114:0x027b, B:116:0x0287, B:119:0x0299, B:120:0x02a0, B:121:0x02a7, B:123:0x02b0, B:125:0x02be, B:127:0x02c5, B:128:0x02cc, B:130:0x02d5, B:131:0x02dc, B:134:0x02e8, B:141:0x030a, B:142:0x0311, B:144:0x031c, B:146:0x0325, B:148:0x0333, B:149:0x033b, B:150:0x0342, B:152:0x034d, B:154:0x0356, B:156:0x0364, B:159:0x036e, B:164:0x0378, B:168:0x037f, B:169:0x0384, B:174:0x039a, B:178:0x03a9, B:179:0x03b0, B:186:0x03d7, B:187:0x03de, B:189:0x03e9, B:191:0x03f2, B:213:0x045d, B:228:0x0571, B:230:0x0578, B:233:0x046e, B:235:0x0478, B:237:0x0482, B:238:0x0489, B:245:0x04a4, B:246:0x04ab, B:248:0x04b6, B:249:0x04bd, B:251:0x04c6, B:252:0x04cd), top: B:113:0x027b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036e A[Catch: CancellationException -> 0x0581, InterruptedException -> 0x0595, ExecutionException -> 0x059f, all -> 0x05c0, TRY_ENTER, TryCatch #1 {InterruptedException -> 0x0595, blocks: (B:114:0x027b, B:116:0x0287, B:119:0x0299, B:120:0x02a0, B:121:0x02a7, B:123:0x02b0, B:125:0x02be, B:127:0x02c5, B:128:0x02cc, B:130:0x02d5, B:131:0x02dc, B:134:0x02e8, B:141:0x030a, B:142:0x0311, B:144:0x031c, B:146:0x0325, B:148:0x0333, B:149:0x033b, B:150:0x0342, B:152:0x034d, B:154:0x0356, B:156:0x0364, B:159:0x036e, B:164:0x0378, B:168:0x037f, B:169:0x0384, B:174:0x039a, B:178:0x03a9, B:179:0x03b0, B:186:0x03d7, B:187:0x03de, B:189:0x03e9, B:191:0x03f2, B:213:0x045d, B:228:0x0571, B:230:0x0578, B:233:0x046e, B:235:0x0478, B:237:0x0482, B:238:0x0489, B:245:0x04a4, B:246:0x04ab, B:248:0x04b6, B:249:0x04bd, B:251:0x04c6, B:252:0x04cd), top: B:113:0x027b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0513 A[Catch: all -> 0x05dc, TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:12:0x003c, B:13:0x0044, B:16:0x0052, B:17:0x005b, B:18:0x0062, B:23:0x0070, B:28:0x007d, B:61:0x0513, B:62:0x051a, B:65:0x0526, B:68:0x0532, B:69:0x0538, B:76:0x054a, B:78:0x05db, B:312:0x0096, B:316:0x00a3, B:318:0x05d2), top: B:11:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C1u0 A03(X.C1sq r301, java.lang.Object r302, java.util.List r303, int r304) {
        /*
            Method dump skipped, instructions count: 1511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A03(X.1sq, java.lang.Object, java.util.List, int):X.1u0");
    }

    private C1qp A04(C1qp c1qp) {
        Map map;
        C1qp c1qp2 = this.A0d;
        C1qp A00 = c1qp2 == null ? null : 1sK.A00(c1qp2);
        if (c1qp != null) {
            if (A00 == null) {
                A00 = new C1qp();
            }
            map = c1qp.A00;
            11T.A09(map);
            synchronized (map) {
                try {
                    A00.A00.putAll(map);
                } finally {
                    Map map2 = map;
                }
            }
        }
        if (C02A.defaultInstance.A0H) {
            A00 = map == null ? new C1qp() : map;
            C1qp c1qp3 = this.A0O;
            if (c1qp3 != null) {
                map = c1qp3.A00;
                11T.A09(map);
                synchronized (map) {
                    A00.A00.putAll(map);
                }
            }
        }
        return A00;
    }

    public static void A05(1LI r301, ComponentTree componentTree, C23P c23p, C1qp c1qp, int i, int i2, int i3, int i4, boolean z) {
        1LI r310 = r301;
        if (r301 == null) {
            r310 = new 1LI();
        }
        componentTree.A07(r310, c23p, c1qp, null, i, i2, i3, i4, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f6, code lost:
    
        if (r306 == 6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029c, code lost:
    
        if ("Resuming partial result skipped due to not being on main-thread".equals(r0.A02) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x033e, code lost:
    
        if (X.1rB.A01(r302.A0U) != r0.A0a) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(final X.1LI r301, com.facebook.litho.ComponentTree r302, X.C23P r303, X.C1qp r304, final java.lang.String r305, final int r306, final int r307, final int r308) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A06(X.1LI, com.facebook.litho.ComponentTree, X.23P, X.1qp, java.lang.String, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00fb, code lost:
    
        if (r302 != null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(final X.1LI r302, X.C23P r303, X.C1qp r304, final java.lang.String r305, final int r306, final int r307, final int r308, int r309, boolean r310, final boolean r311) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A07(X.1LI, X.23P, X.1qp, java.lang.String, int, int, int, int, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r308 != (-1)) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.1sn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(final X.1LI r302, X.C23P r303, final X.C1qp r304, final java.lang.String r305, int r306, final int r307, final int r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A08(X.1LI, X.23P, X.1qp, java.lang.String, int, int, int, boolean):void");
    }

    public static void A09(ComponentTree componentTree) {
        boolean BWo = ComponentsSystrace.A00.BWo();
        1sP.A00();
        if (BWo) {
            ComponentsSystrace.A02("backgroundLayoutStateUpdated");
        }
        synchronized (componentTree) {
            if (componentTree.A03 == null) {
                if (BWo) {
                    ComponentsSystrace.A01();
                }
                return;
            }
            if (componentTree.A06 == null) {
                throw AnonymousClass001.A0T("Unexpected null mCommittedLayoutState");
            }
            boolean A0E = componentTree.A0E();
            if (A0E) {
                2XV r0 = componentTree.A0i;
                if (r0 != null) {
                    C2X1.A0P(r0.A00, 0);
                    componentTree.A0i = null;
                }
                if (componentTree.A0H && !componentTree.A0R) {
                    int measuredWidth = componentTree.A08.getMeasuredWidth();
                    int measuredHeight = componentTree.A08.getMeasuredHeight();
                    if (measuredWidth != 0 || measuredHeight != 0) {
                        C23N c23n = componentTree.A07;
                        if (c23n != null && c23n.A0C == measuredWidth && c23n.A09 == measuredHeight) {
                            componentTree.A08.A0v();
                        } else {
                            componentTree.A08.requestLayout();
                        }
                    }
                }
            }
            if (BWo) {
                ComponentsSystrace.A01();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x01f8, code lost:
    
        if (r301.A0a.isEmpty() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0229, code lost:
    
        if (r0.isEmpty() == false) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0A(final com.facebook.litho.ComponentTree r301, final X.C1tx r302, X.C23P r303, final int r304, final int r305, final int r306) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0A(com.facebook.litho.ComponentTree, X.1tx, X.23P, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r305 == 6) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.5r1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0B(final X.C1tx r302, X.C23P r303, final java.lang.String r304, final int r305, final int r306, final int r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0B(X.1tx, X.23P, java.lang.String, int, int, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (r310 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0C(java.lang.String):void");
    }

    private void A0D(String str) {
        1LZ.A05("Litho.StateUpdateEnqueued", new 30K(this, 2), new AnonymousClass319(this, str, false));
        C1s5 c1s5 = this.A0b;
        if (c1s5.A02.getAndIncrement() == 0) {
            AtomicReference atomicReference = c1s5.A04;
            if (atomicReference.get() != null) {
                c1s5.A03.set(str);
                ((Choreographer) atomicReference.get()).postFrameCallback(c1s5.A00);
            }
        }
    }

    private boolean A0E() {
        C23N c23n;
        C23N c23n2 = this.A06;
        if (c23n2 == null || c23n2 == (c23n = this.A07)) {
            return false;
        }
        this.A07 = c23n2;
        if ((c23n == null || (c23n.A0H.A01 instanceof 2AW)) && (c23n2.A0H.A01 instanceof 2AW)) {
            return false;
        }
        C1s8 c1s8 = this.A0B;
        if (this.A0V.A03.A01.A0V && c1s8 != null) {
            List list = c23n2.A04;
            c23n2.A04 = null;
            List list2 = c23n2.A03;
            c23n2.A03 = null;
            c1s8.A0A(list2, list);
        }
        C23N c23n3 = this.A07;
        List list3 = c23n3 != null ? c23n3.A0P : null;
        C1s8 c1s82 = this.A0B;
        c1s82.getClass();
        c1s82.A00.A01(list3);
        LithoView lithoView = this.A08;
        if (lithoView == null) {
            return true;
        }
        ((BaseMountingView) lithoView).A0A = true;
        ((BaseMountingView) lithoView).A0G.setEmpty();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (X.1rB.A01(r301.A0U) != r302.A0a) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0F(com.facebook.litho.ComponentTree r301, X.C23N r302, int r303, int r304) {
        /*
            r0 = r302
            if (r0 == 0) goto L2e
            r0 = r302
            r1 = r303
            r2 = r304
            boolean r0 = r0.A02(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2e
            r0 = r301
            android.view.accessibility.AccessibilityManager r0 = r0.A0U
            r306 = r0
            r0 = r306
            boolean r0 = X.1rB.A01(r0)
            r307 = r0
            r0 = r302
            boolean r0 = r0.A0a
            r308 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            r1 = r308
            if (r0 == r1) goto L34
        L2e:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L34:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0F(com.facebook.litho.ComponentTree, X.23N, int, int):boolean");
    }

    public 1LI A0G() {
        1LI r0;
        synchronized (this) {
            r0 = this.A03;
        }
        return r0;
    }

    public C1s8 A0H() {
        C1s8 c1s8;
        synchronized (this) {
            c1s8 = this.A0B;
        }
        return c1s8;
    }

    public String A0I() {
        String A0a;
        synchronized (this) {
            1LI r0 = this.A03;
            A0a = r0 == null ? null : r0.A0a();
        }
        return A0a;
    }

    public void A0J() {
        1sP.A00();
        LithoView lithoView = this.A08;
        if (lithoView == null) {
            throw AnonymousClass001.A0N("Trying to attach a ComponentTree without a set View");
        }
        this.A0G = true;
        try {
            1sH r0 = this.A0c;
            if (r0 != null) {
                ComponentTree componentTree = r0.A00;
                if (componentTree.A0V.A03.A01.A0N) {
                    ViewParent parent = lithoView.getParent();
                    while (true) {
                        Object obj = parent;
                        if (obj == null) {
                            break;
                        }
                        if (obj instanceof ViewPager) {
                            ViewPager viewPager = (ViewPager) obj;
                            6pM r02 = new 6pM(viewPager, componentTree);
                            try {
                                viewPager.A0S(r02);
                            } catch (ConcurrentModificationException unused) {
                                ((View) obj).postOnAnimation(new 3gX((ViewParent) obj, r02));
                            }
                            r0.A01.add(r02);
                        }
                        parent = ((ViewParent) obj).getParent();
                    }
                }
            }
            synchronized (this) {
                this.A0H = true;
                A0E();
                if (this.A03 == null) {
                    throw AnonymousClass001.A0N(0Pz.A17("Trying to attach a ComponentTree with a null root. Is released: ", ", Released Component name is: ", this.A0E, this.A0S));
                }
            }
            int measuredWidth = this.A08.getMeasuredWidth();
            int measuredHeight = this.A08.getMeasuredHeight();
            if (measuredWidth != 0 || measuredHeight != 0) {
                C23N c23n = this.A07;
                if (c23n != null && c23n.A0C == measuredWidth && c23n.A09 == measuredHeight) {
                    LithoView lithoView2 = this.A08;
                    if (!((BaseMountingView) lithoView2).A0A) {
                        ((BaseMountingView) lithoView2).A0I.A0D();
                    }
                }
                this.A08.requestLayout();
            }
        } finally {
            this.A0G = false;
        }
    }

    public void A0K() {
        1sP.A00();
        1sH r0 = this.A0c;
        if (r0 != null) {
            List<6pM> list = r0.A01;
            for (6pM r02 : list) {
                r02.A00.clear();
                ViewPager viewPager = (ViewPager) r02.A01.get();
                if (viewPager != null) {
                    viewPager.postOnAnimation(new 6pO(viewPager, r02));
                }
            }
            list.clear();
        }
        synchronized (this) {
            this.A0H = false;
        }
    }

    public void A0L() {
        1sD r307;
        1sP.A00();
        LithoView lithoView = this.A08;
        if (lithoView != null && ((BaseMountingView) lithoView).A0B) {
            throw AnonymousClass001.A0N("Releasing a ComponentTree that is currently being mounted");
        }
        synchronized (this) {
            C1s5 c1s5 = this.A0b;
            c1s5.A02.set(0);
            c1s5.A05.A0D.Cdn(c1s5.A01);
            AtomicReference atomicReference = c1s5.A04;
            if (atomicReference.get() != null) {
                ((Choreographer) atomicReference.get()).removeFrameCallback(c1s5.A00);
            }
            this.A0D.Cdn(this.A0Y);
            Object obj = this.A0e;
            synchronized (obj) {
                try {
                    C1sn c1sn = this.A0N;
                    if (c1sn != null) {
                        this.A0C.Cdn(c1sn);
                        this.A0N = null;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            synchronized (obj) {
                try {
                    C5r1 c5r1 = this.A0M;
                    if (c5r1 != null) {
                        this.A0C.Cdn(c5r1);
                        this.A0M = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            synchronized (this.A0X) {
                try {
                    6ET r0 = this.A04;
                    if (r0 != null) {
                        this.A0C.Cdn(r0);
                        this.A04 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            synchronized (this.A0g) {
                try {
                    List list = this.A0a;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1sq) it.next()).A06();
                    }
                    list.clear();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            synchronized (this.A0f) {
                try {
                    List list2 = this.A0Z;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1sq) it2.next()).A06();
                    }
                    list2.clear();
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            C3NC c3nc = this.A05;
            if (c3nc != null) {
                c3nc.A04.Cdn(c3nc.A05);
            }
            1LI r02 = this.A03;
            if (r02 != null) {
                this.A0E = r02.A0a();
            }
            LithoView lithoView2 = this.A08;
            if (lithoView2 != null) {
                lithoView2.A10(null, true);
            }
            this.A0S = true;
            this.A03 = null;
            try {
                C23N c23n = this.A06;
                if (c23n != null) {
                    11T.A0F(this.A0W, 0);
                    C26r c26r = c23n.A0K;
                    if (c26r != null) {
                        C01i c01i = c26r.A00;
                        if (!((Map) c01i.getValue()).isEmpty()) {
                            Iterator A1B = 1BK.A1B((Map) c01i.getValue());
                            if (A1B.hasNext()) {
                                throw (((Map) c01i.getValue()).get(A1B.next()) != null ? AnonymousClass001.A0Q("scopedComponentInfos") : 1BK.A0h());
                            }
                        }
                    }
                }
                this.A0W.A00.clear();
                C1s8 c1s8 = this.A0B;
                if (c1s8 != null) {
                    r307 = c1s8.A00;
                    if (C02A.clearEventHandlersAndTriggers) {
                        c1s8.A03();
                    }
                } else {
                    r307 = null;
                }
                this.A07 = null;
                this.A06 = null;
                this.A0B = null;
                this.A0F = null;
                this.A0A = null;
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
        if (r307 != null) {
            r307.A00();
        }
        List list3 = this.A0Q;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((7G8) it3.next()).CGC();
            }
            this.A0Q = null;
        }
        C1s8 c1s82 = this.A0B;
        if (c1s82 == null || C02A.clearEventHandlersAndTriggers) {
            return;
        }
        c1s82.A04();
    }

    public void A0M(int i, int i2) {
        A07(null, null, null, null, i, i2, 3, -1, true, false);
    }

    public void A0N(LifecycleOwner lifecycleOwner) {
        synchronized (this) {
            boolean z = this.A0h;
            C1qp c1qp = z ? this.A0P : this.A0V.A08;
            if (C02A.defaultInstance.A0H) {
                if (c1qp == null) {
                    throw AnonymousClass001.A0Q("The treePropContainer cannot be null");
                }
                1sM r0 = C3oi.A00;
                49H r02 = (LifecycleOwner) c1qp.A00(r0);
                if (r02 instanceof 49H) {
                    49H r03 = r02;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        r03.A00(lifecycleOwner);
                    } else {
                        this.A0D.CXs(new 3gW(lifecycleOwner, r03), "LifecycleOwnerWrapper.setDelegate");
                    }
                } else {
                    c1qp.A02(r0, r02);
                }
            } else if (z) {
                if (c1qp == null) {
                    c1qp = A04(null);
                    if (c1qp == null) {
                        new C1qp();
                    }
                    this.A0P = c1qp;
                }
                c1qp.A02(C3oi.A00, lifecycleOwner);
            } else {
                1Iw r04 = this.A0V;
                if (!r04.A0C) {
                    r04.A08 = 1sK.A00(c1qp);
                    r04.A0C = true;
                }
                C1qp c1qp2 = r04.A08;
                if (c1qp2 != null) {
                    c1qp2.A02(C3oi.A00, lifecycleOwner);
                }
            }
        }
    }

    public void A0O(1LI r302) {
        A05(r302, this, null, null, -1, -1, 0, -1, false);
    }

    public void A0P(1LI r302) {
        A05(r302, this, null, null, -1, -1, 1, -1, true);
    }

    public void A0Q(1LI r302, C23P c23p, int i, int i2) {
        A05(r302, this, c23p, null, i, i2, 0, -1, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001c: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:8:0x000c, B:11:0x0018] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:java.util.List) from 0x0019: IPUT (r303v3 ?? I:java.util.List), (r301v0 'this' ?? I:com.facebook.litho.ComponentTree A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0027] com.facebook.litho.ComponentTree.A0F java.util.List
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A0R(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001c: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:8:0x000c, B:11:0x0018] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:java.util.List) from 0x0019: IPUT (r303v3 ?? I:java.util.List), (r301v0 'this' ?? I:com.facebook.litho.ComponentTree A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0027] com.facebook.litho.ComponentTree.A0F java.util.List
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public void A0S(C2k0 c2k0) {
        synchronized (this) {
            List list = this.A0F;
            if (list != null) {
                list.remove(c2k0);
            }
        }
    }

    public void A0T(InterfaceC00713oe interfaceC00713oe) {
        synchronized (this) {
            if (this.A09 != null) {
                throw AnonymousClass001.A0N("Already subscribed");
            }
            this.A09 = interfaceC00713oe;
            interfaceC00713oe.A5v(this);
            if (!C02A.defaultInstance.A0K && (interfaceC00713oe instanceof 53Q)) {
                LifecycleOwner Atk = ((53Q) interfaceC00713oe).Atk();
                if (Atk != null) {
                    A0N(Atk);
                }
            }
        }
    }

    public void A0U(C23P c23p, int i, int i2) {
        A07(null, c23p, null, null, i, i2, 2, -1, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: all -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:8:0x0010, B:11:0x0012, B:14:0x001d, B:17:0x0028, B:18:0x002f, B:19:0x0035, B:21:0x003e, B:23:0x0044, B:24:0x0049, B:27:0x0055, B:28:0x005c, B:29:0x0063, B:31:0x006c, B:33:0x0072), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(boolean r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.1LI r0 = r0.A03     // Catch: java.lang.Throwable -> La8
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L12
            r0 = r301
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            return
        L12:
            r0 = r301
            boolean r0 = r0.A0h     // Catch: java.lang.Throwable -> La8
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L76
            r0 = r301
            X.1qp r0 = r0.A0P     // Catch: java.lang.Throwable -> La8
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L76
            r0 = r305
            X.1qp r0 = X.1sK.A00(r0)     // Catch: java.lang.Throwable -> La8
            r307 = r0
        L2f:
            r0 = r301
            X.1s5 r0 = r0.A0b     // Catch: java.lang.Throwable -> La8
            r308 = r0
            r0 = r308
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A02     // Catch: java.lang.Throwable -> La8
            r305 = r0
            r0 = r305
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> La8
            r0 = r308
            java.util.concurrent.atomic.AtomicReference r0 = r0.A04     // Catch: java.lang.Throwable -> La8
            r309 = r0
            r0 = r309
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La8
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L71
            r0 = r309
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La8
            r309 = r0
            r0 = r309
            android.view.Choreographer r0 = (android.view.Choreographer) r0     // Catch: java.lang.Throwable -> La8
            r309 = r0
            r0 = r308
            android.view.Choreographer$FrameCallback r0 = r0.A00     // Catch: java.lang.Throwable -> La8
            r305 = r0
            r0 = r309
            r1 = r305
            r0.removeFrameCallback(r1)     // Catch: java.lang.Throwable -> La8
        L71:
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            goto L7c
        L76:
            r0 = 0
            r307 = r0
            goto L2f
        L7c:
            r0 = r301
            X.1LI r0 = r0.A03
            r310 = r0
            r0 = -1
            r311 = r0
            r0 = 4
            r312 = r0
            r0 = r302
            r313 = r0
            r0 = r302
            if (r0 == 0) goto L92
            r0 = 5
            r312 = r0
        L92:
            r0 = r304
            r1 = r310
            r2 = 0
            r3 = r307
            r4 = r303
            r5 = r311
            r6 = r311
            r7 = r312
            r8 = r311
            r9 = r313
            r10 = 0
            r0.A07(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        La8:
            r305 = move-exception
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0V(boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (X.26N.A00(r301.A07.A0D) != r304) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (X.1rB.A01(r301.A0U) != r0.A0a) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.23P, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0W(int[] r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.A0W(int[], int, int, boolean):void");
    }

    @Override // X.C1rx
    public void A6t(7G8 r302) {
        1sP.A00();
        List list = this.A0Q;
        if (list == null) {
            list = new ArrayList();
            this.A0Q = list;
        }
        list.add(r302);
    }

    @Override // X.C1ru
    public 2Yv A8u(2Yv r302, String str, boolean z) {
        synchronized (this) {
            if (this.A03 != null) {
                C1s8 c1s8 = this.A0B;
                if (c1s8 != null) {
                    return c1s8.A01(r302, str, z);
                }
            }
            return r302;
        }
    }

    @Override // X.C1ru
    public boolean ADm(Object obj, String str, int i, boolean z) {
        C1s8 A0H = A0H();
        if (A0H == null) {
            return false;
        }
        return A0H.A0B(str, new C2xk(obj, 1), i, z);
    }

    @Override // X.C1ru
    public boolean ADn(String str, Function1 function1, int i, boolean z) {
        C1s8 A0H = A0H();
        if (A0H == null) {
            return false;
        }
        return A0H.A0B(str, function1, i, z);
    }

    @Override // X.C1ru
    public Object Aan(Object obj, String str, int i, boolean z) {
        Object obj2;
        synchronized (this) {
            if (!this.A0S) {
                C1s8 c1s8 = this.A0B;
                if (c1s8 != null) {
                    obj2 = c1s8.A02(obj, str, i, z);
                }
            }
            obj2 = null;
        }
        return obj2;
    }

    @Override // X.C1ru
    public C2ko Akn(C2iw c2iw, int i) {
        C2ko A00;
        C1s8 c1s8 = this.A0B;
        if (c1s8 == null) {
            return null;
        }
        11T.A0F(c2iw, 0);
        1sE r0 = c1s8.A02;
        synchronized (r0) {
            A00 = r0.A00(c2iw, i);
        }
        return A00;
    }

    @Override // X.C1ru
    public C2ko Ako(String str) {
        C1s8 c1s8 = this.A0B;
        if (c1s8 == null) {
            return null;
        }
        return c1s8.A00(str);
    }

    @Override // X.C1rv
    public View AyN() {
        return this.A08;
    }

    @Override // X.C1ru
    public boolean BSl() {
        C1s8 A0H = A0H();
        if (A0H == null) {
            return false;
        }
        return A0H.A06.A01;
    }

    @Override // X.C1rx
    public boolean BVK() {
        boolean z;
        synchronized (this) {
            z = this.A0S;
        }
        return z;
    }

    @Override // X.C1ry
    public void C7m(Integer num) {
        LithoView lithoView;
        boolean z;
        int intValue = num.intValue();
        if (intValue == 0) {
            lithoView = this.A08;
            if (lithoView == null) {
                return;
            } else {
                z = true;
            }
        } else {
            if (intValue != 1) {
                A0L();
                InterfaceC00713oe interfaceC00713oe = this.A09;
                if (interfaceC00713oe != null) {
                    interfaceC00713oe.CeS(this);
                    this.A09 = null;
                    return;
                }
                return;
            }
            lithoView = this.A08;
            if (lithoView == null) {
                return;
            } else {
                z = false;
            }
        }
        lithoView.A0q(z);
    }

    @Override // X.C1ru
    public void Ca4(Object obj, Object obj2, String str, int i, boolean z) {
        synchronized (this) {
            if (!this.A0S) {
                C1s8 c1s8 = this.A0B;
                if (c1s8 != null) {
                    c1s8.A09(obj, obj2, str, i, z);
                }
            }
        }
    }

    @Override // X.C1ru
    public void Cey(String str, boolean z) {
        C1s8 c1s8;
        if (this.A0S || (c1s8 = this.A0B) == null) {
            return;
        }
        11T.A0F(str, 0);
        C1s9 c1s9 = z ? c1s8.A04 : c1s8.A05;
        synchronized (c1s9) {
            try {
                c1s9.A07.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X.C1ru
    public void Coo(boolean z) {
        C1s8 A0H = A0H();
        if (A0H != null) {
            A0H.A06.A01 = z;
        }
    }

    @Override // X.C1ru
    public final void D72(6CS r302, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C1s8 c1s8 = this.A0B;
            if (c1s8 != null) {
                c1s8.A06(r302, str, z);
            }
            1tE.A04.addAndGet(1L);
            A0D(str2);
        }
    }

    @Override // X.C1ru
    public final void D73(6CS r302, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C1s8 c1s8 = this.A0B;
            if (c1s8 != null) {
                c1s8.A06(r302, str, z);
            }
            A0C(str2);
        }
    }

    @Override // X.C1ru
    public void D81(C2l4 c2l4, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C1s8 c1s8 = this.A0B;
            if (c1s8 != null) {
                c1s8.A08(c2l4, str, false, z);
            }
            1tE.A04.addAndGet(1L);
            A0D(str2);
        }
    }

    @Override // X.C1ru
    public void D82(C2l4 c2l4, String str, boolean z) {
        synchronized (this) {
            if (this.A03 != null) {
                C1s8 c1s8 = this.A0B;
                if (c1s8 != null) {
                    c1s8.A08(c2l4, str, true, z);
                }
            }
        }
    }

    @Override // X.C1ru
    public void D83(C2l4 c2l4, String str, String str2, boolean z) {
        synchronized (this) {
            if (this.A03 == null) {
                return;
            }
            C1s8 c1s8 = this.A0B;
            if (c1s8 != null) {
                try {
                    c1s8.A08(c2l4, str, false, z);
                } catch (Exception e) {
                    1Iw r0 = this.A0V;
                    r0.A03.A01.A01.A02(r0, e);
                    throw 0Q8.createAndThrow();
                }
            }
            A0C(str2);
        }
    }

    public LithoView getLithoView() {
        return this.A08;
    }
}
