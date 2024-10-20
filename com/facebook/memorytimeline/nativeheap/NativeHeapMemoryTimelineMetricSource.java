package com.facebook.memorytimeline.nativeheap;

import X.0Cq;
import X.0Cu;
import X.0M7;
import X.0M8;
import X.0M9;
import X.C0il;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: NativeHeapMemoryTimelineMetricSource.class */
public class NativeHeapMemoryTimelineMetricSource implements 0Cq {
    public boolean mLibraryLoaded;

    public static native void nativeGetNativeHeapStats(long[] jArr);

    public Collection getDataPoints() {
        if (!this.mLibraryLoaded) {
            C0il.A0B("nativeheapstats");
            this.mLibraryLoaded = true;
        }
        long[] jArr = new long[3];
        nativeGetNativeHeapStats(jArr);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new 0M9(0Cu.A0s, jArr[0] / 1024));
        arrayList.add(new 0M9(0Cu.A0t, jArr[1] / 1024));
        arrayList.add(new 0M9(0Cu.A0u, jArr[2] / 1024));
        return arrayList;
    }

    public /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public boolean shouldCollectMetrics(int i) {
        boolean z = false;
        if ((i & 4) != 0) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ boolean shouldCollectMetrics(int i, 0M7 r303) {
        return 0M8.A00(r303, this, i);
    }

    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }
}
