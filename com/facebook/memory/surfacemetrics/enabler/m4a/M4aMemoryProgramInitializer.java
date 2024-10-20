package com.facebook.memory.surfacemetrics.enabler.m4a;

import X.0fH;
import X.11T;
import X.1BV;
import X.1YY;
import X.2yD;
import X.5qT;
import X.5qU;
import X.5qV;
import X.5qW;
import X.C00i;
import X.C2wc;
import X.C5qc;
import X.C5qf;
import X.C5qh;
import X.C5qk;
import X.C5ql;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.util.LruCache;
import com.facebook.common.build.BuildConstants;
import com.facebook.memory.surfacemetrics.SurfaceLifecycleTracker;
import com.facebook.memorytimeline.MemoryTimeline;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: M4aMemoryProgramInitializer.class */
public final class M4aMemoryProgramInitializer {
    public final C00i A02 = new 1BV(49849);
    public final C00i A00 = new 1BV(49850);
    public final C00i A01 = new 1BV(49851);

    public void A00() {
        C00i c00i = this.A02;
        if (((2yD) ((5qT) c00i.get()).A00.get()).AZk(36310473861497129L)) {
            final 5qU r0 = (5qU) this.A00.get();
            C00i c00i2 = r0.A03;
            5qV r02 = new 5qV((MemoryTimeline) c00i2.get(), BuildConstants.A02());
            final MemoryTimeline memoryTimeline = (MemoryTimeline) c00i2.get();
            C00i c00i3 = r0.A02;
            final int Auy = (int) ((2yD) ((5qT) c00i3.get()).A00.get()).Auy(36591948838797540L);
            5qW r03 = new 5qW(memoryTimeline, Auy) { // from class: X.5qb
                public final int A00;
                public final LruCache A01 = new LruCache(30);
                public final LruCache A02 = new LruCache(30);
                public final MemoryTimeline A03;

                {
                    this.A03 = memoryTimeline;
                    this.A00 = Auy;
                }

                public HashMap AGc(int i) {
                    0M9 r04;
                    0MB A00 = 2O2.A00(0M7.A00, this.A03, this.A00, false);
                    HashMap hashMap = new HashMap();
                    LruCache lruCache = this.A01;
                    Integer valueOf = Integer.valueOf(i);
                    0MB r05 = (0MB) lruCache.remove(valueOf);
                    0MB r06 = (0MB) this.A02.remove(valueOf);
                    if (r05 != null && r06 != null) {
                        HashMap hashMap2 = new HashMap();
                        for (0M9 r07 : r06.A00) {
                            hashMap2.put(r07.A02, r07);
                        }
                        HashMap hashMap3 = new HashMap();
                        for (0M9 r08 : A00.A00) {
                            hashMap3.put(r08.A02, r08);
                        }
                        for (0M9 r09 : r05.A00) {
                            0Cu r010 = r09.A02;
                            if (r010 != 0Cu.A0X && r010 != 0Cu.A08 && r010 != 0Cu.A0u && (r04 = (0M9) hashMap2.get(r010)) != null) {
                                String A0v = 0Pz.A0v("_", r010.A00(), "_", 0P8.A00(r010.A01));
                                long j = r09.A00;
                                long j2 = r04.A00;
                                hashMap.put(0Pz.A0W("start", A0v), Long.valueOf(j));
                                hashMap.put(0Pz.A0W("end", A0v), Long.valueOf(j2));
                                hashMap.put(0Pz.A0W("accum", A0v), Long.valueOf(j2 - j));
                                0M9 r011 = (0M9) hashMap3.get(r010);
                                if (r011 != null) {
                                    hashMap.put(0Pz.A0W("after", A0v), Long.valueOf(r011.A00 - j2));
                                }
                            }
                        }
                    }
                    return hashMap;
                }

                public void AQl(int i, boolean z, boolean z2, boolean z3) {
                    this.A01.put(Integer.valueOf(i), 2O2.A00(0M7.A01, this.A03, this.A00, false));
                }

                public void ARW(int i) {
                    this.A02.put(Integer.valueOf(i), 2O2.A00(0M7.A02, this.A03, this.A00, false));
                }
            };
            HashSet hashSet = new HashSet();
            hashSet.add(r02);
            hashSet.add(r03);
            boolean AZk = ((2yD) ((5qT) c00i3.get()).A00.get()).AZk(36310473862152495L);
            C5qc c5qc = null;
            if (((2yD) ((5qT) c00i3.get()).A00.get()).AZk(36310473861824813L)) {
                c5qc = new C5qc(((2yD) ((5qT) c00i3.get()).A00.get()).BCy(36873423815376936L), (int) ((2yD) ((5qT) c00i3.get()).A00.get()).Auy(36591948838273250L), ((2yD) ((5qT) c00i3.get()).A00.get()).AZk(36310473861693739L), ((2yD) ((5qT) c00i3.get()).A00.get()).AZk(36310473861628202L), ((2yD) ((5qT) c00i3.get()).A00.get()).AZk(36310473861890350L));
            }
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) r0.A04.get();
            Handler handler = (Handler) r0.A01.get();
            long Auy2 = ((2yD) ((5qT) c00i3.get()).A00.get()).Auy(36591948838732003L);
            c00i3.get();
            c00i3.get();
            r0.A00 = new C5qf(handler, c5qc, quickPerformanceLogger, hashSet, Auy2, AZk);
            ((C2wc) r0.A05.get()).A02.add(new Object() { // from class: X.5qg
            });
        }
        if (((2yD) ((5qT) c00i.get()).A00.get()).AZk(36310473861759276L)) {
            C5qh c5qh = (C5qh) this.A01.get();
            C00i c00i4 = c5qh.A00;
            if (!(((Context) c00i4.get()).getApplicationContext() instanceof Application)) {
                0fH.A0B(C5qh.class, "getApplicationContext() was not an Application?!");
                return;
            }
            Application application = (Application) ((Context) c00i4.get()).getApplicationContext();
            SurfaceLifecycleTracker surfaceLifecycleTracker = c5qh.A04;
            application.registerActivityLifecycleCallbacks(surfaceLifecycleTracker);
            C5ql c5ql = new C5ql(surfaceLifecycleTracker, (QuickPerformanceLogger) c5qh.A03.get());
            ((MemoryTimeline) c5qh.A02.get()).A7U(c5ql);
            Set set = surfaceLifecycleTracker.A05;
            synchronized (set) {
                set.add(c5ql);
            }
            1YY r04 = (1YY) c5qh.A01.get();
            C5qk c5qk = c5qh.A05;
            synchronized (r04) {
                11T.A0F(c5qk, 0);
                r04.A04.A00("HierarchicalSessionManagerListenerManager", c5qk);
            }
        }
    }
}
