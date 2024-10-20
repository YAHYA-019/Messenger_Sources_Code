package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.facebook.inject.FbInjector;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.fb.fragment.LoggingConfiguration;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.base.Platform;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6tg, reason: invalid class name */
/* loaded from: 6tg.class */
public final class C6tg {
    public static final Handler A0L = new Handler(Looper.getMainLooper());
    public 2lK A00;
    public C1qb A01;
    public C2kx A02;
    public Runnable A03;
    public String A04;
    public C5it A05;
    public LoggingConfiguration A06;
    public 6uR A07;
    public final C6tk A0B;
    public final C6tl A0C;
    public final Runnable A0D;
    public final C0et A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final AtomicBoolean A0J;
    public final boolean A0K;
    public final 1gL A09 = new 5W5(this);
    public final C1pu A0A = new C1q6() { // from class: X.6th
        @Override // X.C1q6, X.C1pu, X.C1pv
        public void Bic(Fragment fragment) {
            C6tg.this.A07();
        }

        @Override // X.C1q6, X.C1pu, X.C1pv
        public void BtG(Fragment fragment) {
            C6tg.this.A06();
        }

        @Override // X.C1q6, X.C1pu
        public void CAx(Fragment fragment) {
            C6tg.this.A08();
        }

        @Override // X.C1q6, X.C1pu
        public void CHq(Fragment fragment) {
            C6tg.this.A09();
        }

        @Override // X.C1q6, X.C1pu, X.C1pv
        public void CL1(Fragment fragment, boolean z, boolean z2) {
            Integer num;
            C6tg c6tg = C6tg.this;
            ComponentTree componentTree = c6tg.A0B.A01;
            if (componentTree == null || componentTree.A09 == null) {
                return;
            }
            if (z) {
                if (z2) {
                    return;
                } else {
                    num = 0S2.A00;
                }
            } else if (!z2) {
                return;
            } else {
                num = 0S2.A01;
            }
            C6tg.A01(c6tg, num);
        }
    };
    public final LifecycleObserver A08 = new LifecycleObserver() { // from class: X.6ti
        public void onDestroy() {
            C6tg c6tg = C6tg.this;
            c6tg.A07();
            c6tg.A06();
        }

        public void onPause() {
            C6tg.this.A08();
        }

        public void onResume() {
            C6tg.this.A09();
        }
    };
    public final C00i A0I = new 1BQ(16520);

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, X.6tk] */
    public C6tg() {
        1BQ r0 = new 1BQ(16385);
        this.A0H = r0;
        this.A0G = new 1BV(370);
        this.A0E = (C0et) 1Bi.A03(83604);
        this.A0F = new 1BQ(50184);
        this.A0J = new AtomicBoolean(false);
        this.A0D = new Runnable() { // from class: X.6tj
            public static final String __redex_internal_original_name = "SectionsHelper$1";

            @Override // java.lang.Runnable
            public void run() {
                C2kx c2kx = C6tg.this.A02;
                if (c2kx != null) {
                    c2kx.A09(false);
                }
            }
        };
        this.A0B = new Object();
        this.A0C = new C6tl();
        this.A02 = new C2kx();
        this.A0K = ((2yD) r0.get()).AZk(36315348647355198L);
    }

    public static 2Yf A00(C1qb c1qb, AXV axv, C6tg c6tg) {
        LoggingConfiguration loggingConfiguration;
        String str = null;
        if (!c6tg.A02() || ((loggingConfiguration = c6tg.A06) != null && loggingConfiguration.A06)) {
            return axv.AKs((1Im) null, c1qb);
        }
        C8qq c8qq = new C8qq();
        c8qq.A03 = (QuickPerformanceLogger) c6tg.A0I.get();
        LoggingConfiguration loggingConfiguration2 = c6tg.A06;
        c8qq.A00 = loggingConfiguration2 == null ? -1 : loggingConfiguration2.A01;
        if (c6tg.A02()) {
            str = loggingConfiguration2.A05;
        }
        c8qq.A04 = str;
        c8qq.A01 = loggingConfiguration2 == null ? 0 : loggingConfiguration2.A00;
        c8qq.A02 = axv;
        return c8qq;
    }

    public static void A01(C6tg c6tg, Integer num) {
        if (!1sP.A01()) {
            A0L.post(new Ivz(c6tg, num));
        } else {
            ComponentTree componentTree = c6tg.A0B.A01;
            (componentTree == null ? null : componentTree.A09).Bef(num);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0.A06 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.litho.sections.fb.fragment.LoggingConfiguration r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r302
            java.lang.String r0 = r0.A05
            r303 = r0
            r0 = r303
            boolean r0 = com.google.common.base.Platform.stringIsNullOrEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L24
            r0 = r302
            boolean r0 = r0.A06
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L28
        L24:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L28:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6tg.A02():boolean");
    }

    public LithoView A03(1LI r302) {
        boolean z = this.A0K;
        C6tk c6tk = this.A0B;
        53R r306 = z ? new 53R() : null;
        1Iw r0 = c6tk.A00;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Component context not initialized. Did you call onCreate()?");
        }
        C1s0 A01 = ComponentTree.A01(r302, r0, null);
        A01.A03 = r306;
        ComponentTree A00 = A01.A00();
        LithoView lithoView = new LithoView(c6tk.A00);
        lithoView.A0z(A00);
        c6tk.A02 = lithoView;
        c6tk.A01 = A00;
        return lithoView;
    }

    public C2ki A04(AXV axv) {
        C1qb c1qb = this.A01;
        2kY r0 = new 2kY();
        2XM A00 = AnonymousClass310.A00();
        A00.A0D = false;
        r0.A00 = A00.A00();
        2kZ A002 = r0.A00();
        C2ki A003 = C2kV.A00(c1qb);
        A003.A2e(this.A02);
        2kW r02 = new 2kW();
        r02.A07 = A002;
        A003.A2f(r02.A00());
        A003.A2Z(this.A0C);
        8Sm A004 = C8nz.A00(c1qb);
        A004.A2X(2131956410);
        Context context = ((1Iw) c1qb).A0D;
        2MR r03 = 2MR.A1j;
        int A005 = 5YG.A00(context, r03);
        C8nz c8nz = A004.A01;
        c8nz.A00 = A004.A02.A04(A005);
        Runnable runnable = this.A0D;
        c8nz.A03 = runnable;
        C2kV c2kV = A003.A01;
        c2kV.A0B = A004.A2V();
        7DF A006 = 7DD.A00(c1qb);
        A006.A0J();
        A003.A2c(A006.A01);
        8Sm A007 = C8nz.A00(c1qb);
        A007.A2X(2131957317);
        int A008 = 5YG.A00(context, r03);
        C8nz c8nz2 = A007.A01;
        c8nz2.A00 = A007.A02.A04(A008);
        c8nz2.A03 = runnable;
        c2kV.A0C = A007.A2V();
        A003.A2d(A00(new C1qb(c1qb), axv, this));
        c2kV.A0J = this.A00;
        c2kV.A0R = this.A04;
        return A003;
    }

    public AwJ A05(1Iw r302, AXV axv, 4kO r304) {
        2kZ A00 = new 2kY().A00();
        2kW r0 = new 2kW();
        r0.A07 = A00;
        C2ke A002 = r0.A00();
        AwJ awJ = new AwJ(r302, new 8nX());
        8nX r02 = awJ.A01;
        r02.A0E = r304;
        BitSet bitSet = awJ.A02;
        bitSet.set(0);
        r02.A0C = this.A02;
        r02.A0D = A002;
        C6tl c6tl = this.A0C;
        if (c6tl != null) {
            List list = r02.A0H;
            if (list == Collections.EMPTY_LIST) {
                list = AnonymousClass001.A0s();
                r02.A0H = list;
            }
            list.add(c6tl);
        }
        8Sm A003 = C8nz.A00(r302);
        A003.A2X(2131956410);
        Runnable runnable = this.A0D;
        C8nz c8nz = A003.A01;
        c8nz.A03 = runnable;
        c8nz.A00 = A003.A02.A04(0);
        r02.A06 = A003.A2V();
        7DF A004 = 7DD.A00(r302);
        A004.A0J();
        7DD r03 = A004.A01;
        r02.A08 = r03 == null ? null : r03.A0l();
        8Sm A005 = C8nz.A00(r302);
        A005.A2X(2131957317);
        C8nz c8nz2 = A005.A01;
        c8nz2.A00 = A005.A02.A09(2130969874, 0);
        Runnable runnable2 = this.A03;
        if (runnable2 != null) {
            c8nz2.A03 = runnable2;
            c8nz2.A04 = true;
        } else {
            c8nz2.A03 = runnable;
        }
        r02.A07 = A005.A2W().A0l();
        C1qb c1qb = this.A01;
        if (c1qb == null) {
            c1qb = new C1qb(r302);
        }
        r02.A0B = A00(c1qb, axv, this);
        bitSet.set(1);
        r02.A0A = this.A00;
        r02.A02 = -1;
        r02.A0G = this.A04;
        return awJ;
    }

    public void A06() {
        this.A0B.A00 = null;
        if (A02()) {
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) this.A0I.get();
            LoggingConfiguration loggingConfiguration = this.A06;
            quickPerformanceLogger.markerDrop(loggingConfiguration.A01, loggingConfiguration.A00);
        }
        this.A02 = null;
        this.A06 = null;
        this.A01 = null;
    }

    public void A07() {
        synchronized (this) {
            C6tk c6tk = this.A0B;
            ComponentTree componentTree = c6tk.A01;
            if (componentTree != null && componentTree.A09 != null) {
                A01(this, 0S2.A0C);
            }
            LithoView lithoView = c6tk.A02;
            if (lithoView != null) {
                lithoView.A0w();
            }
            c6tk.A02 = null;
            c6tk.A01 = null;
        }
        C5it c5it = this.A05;
        if (c5it != null) {
            c5it.disable();
            this.A05 = null;
        }
    }

    public void A08() {
        C5it c5it = this.A05;
        if (c5it != null) {
            c5it.disable();
        }
        synchronized (this) {
            ComponentTree componentTree = this.A0B.A01;
            if (componentTree != null && componentTree.A09 != null) {
                A01(this, 0S2.A01);
            }
        }
    }

    public void A09() {
        synchronized (this) {
            ComponentTree componentTree = this.A0B.A01;
            if (componentTree != null && componentTree.A09 != null) {
                A01(this, 0S2.A00);
            }
        }
    }

    public void A0A(Context context) {
        if (context == null) {
            0fH.A0o("SectionsHelper", "Must use a non-null Context to initialize the component context.");
        } else {
            A0C(new 1Iw(context));
        }
    }

    public void A0B(C7z0 c7z0) {
        if (c7z0 == null || c7z0.getMarkerId() == 196685) {
            return;
        }
        AtomicBoolean atomicBoolean = this.A0J;
        if (atomicBoolean.get()) {
            return;
        }
        Context A00 = 1Bf.A00((C1F6) this.A0G.get());
        try {
            2lK r0 = new 2lK(c7z0);
            1Bn.A0K();
            FbInjector.A04(A00);
            this.A00 = r0;
            atomicBoolean.set(true);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public void A0C(1Iw r302) {
        this.A0B.A00 = r302;
        this.A01 = new C1qb(r302);
        if (this.A02 == null) {
            this.A02 = new C2kx();
        }
        if (this.A0E == C0et.A0C) {
            Object A0A = 1Bn.A0A(115948);
            C6tl c6tl = this.A0C;
            ArrayList arrayList = c6tl.A00;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0t(2);
                c6tl.A00 = arrayList;
            }
            arrayList.add(A0A);
        }
    }

    public void A0D(LoggingConfiguration loggingConfiguration) {
        if (this.A01 != null) {
            this.A06 = loggingConfiguration;
            if (!Platform.stringIsNullOrEmpty(loggingConfiguration.A03)) {
                6uP r0 = (6uP) this.A0F.get();
                Context context = ((1Iw) this.A01).A0D;
                LoggingConfiguration loggingConfiguration2 = this.A06;
                C5it A00 = r0.A00(context, loggingConfiguration2.A03, 15990790, loggingConfiguration2.A07);
                this.A05 = A00;
                6uR r02 = new 6uR(A00, true);
                this.A07 = r02;
                C6tl c6tl = this.A0C;
                ArrayList arrayList = c6tl.A00;
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                    c6tl.A00 = arrayList;
                }
                arrayList.add(r02);
            }
            if (A02() && this.A06.A00 == 0) {
                C00i c00i = this.A0I;
                ((QuickPerformanceLogger) c00i.get()).markerStart(this.A06.A01);
                QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) c00i.get();
                LoggingConfiguration loggingConfiguration3 = this.A06;
                quickPerformanceLogger.markerTag(loggingConfiguration3.A01, loggingConfiguration3.A05);
            }
            this.A04 = this.A06.A04;
        }
    }
}
