package X;

import com.facebook.memory.surfacemetrics.SurfaceLifecycleTracker;
import com.facebook.memorytimeline.MemoryTimeline;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.5ql, reason: invalid class name */
/* loaded from: 5ql.class */
public final class C5ql implements 0Lt {
    public final QuickPerformanceLogger A00;
    public final SurfaceLifecycleTracker A03;
    public final HashSet A02 = new HashSet();
    public final HashMap A01 = new HashMap();

    public C5ql(SurfaceLifecycleTracker surfaceLifecycleTracker, QuickPerformanceLogger quickPerformanceLogger) {
        this.A03 = surfaceLifecycleTracker;
        this.A00 = quickPerformanceLogger;
        0fH.A0A(C5ql.class, "Starting to track surface lifecycles");
    }

    public int B7T() {
        return -1;
    }

    public void Bwf(0Oo r302) {
    }

    public void C9F(MemoryTimeline memoryTimeline, 0MB r303) {
        C5qj c5qj;
        HashMap hashMap;
        SurfaceLifecycleTracker surfaceLifecycleTracker = this.A03;
        synchronized (surfaceLifecycleTracker.A01) {
            c5qj = surfaceLifecycleTracker.A00;
        }
        if (c5qj != null) {
            int i = c5qj.A00;
            HashMap hashMap2 = this.A01;
            synchronized (hashMap2) {
                Integer valueOf = Integer.valueOf(i);
                hashMap = (HashMap) hashMap2.get(valueOf);
                if (hashMap == null) {
                    hashMap = AnonymousClass001.A0u();
                    hashMap2.put(valueOf, hashMap);
                }
            }
            synchronized (hashMap) {
                try {
                    for (0M9 r0 : r303.A00) {
                        0Cu r02 = r0.A02;
                        0M9 r03 = (0M9) hashMap.get(r02);
                        if (r03 == null || 0M9.A00(r0, r03) == r0) {
                            hashMap.put(r02, r0);
                            this.A00.markerAnnotate(21379434, i, 0Pz.A0z("peak", ":", r02.A00(), ":", 0P8.A00(r02.A01)), Long.toString(r0.A00));
                        }
                    }
                } finally {
                    HashMap hashMap3 = hashMap;
                }
            }
        }
    }

    public boolean DAC() {
        return true;
    }
}
