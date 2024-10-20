package com.facebook.memorytimeline.maps;

import X.0Cq;
import X.0M7;
import X.0M8;
import X.C0il;
import X.EnumC02713vz;
import java.util.Map;

/* loaded from: ProcMapsMemoryTimelineMetricsSource.class */
public class ProcMapsMemoryTimelineMetricsSource implements 0Cq {
    public static final ProcMapsMemoryTimelineMetricsSource $redex_init_class = null;
    public final EnumC02713vz[] mMapEntryCategories;
    public final boolean mUseNativeParser;

    static {
        C0il.A0B("mapsreader");
    }

    public ProcMapsMemoryTimelineMetricsSource(boolean z, boolean z2) {
        this.mMapEntryCategories = z ? new EnumC02713vz[]{EnumC02713vz.A07} : EnumC02713vz.values();
        this.mUseNativeParser = z2;
    }

    public static native void nativeParseMaps(String[] strArr, long[] jArr);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x035c, code lost:
    
        if (r303 == false) goto L163;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x019b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection getDataPoints() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.memorytimeline.maps.ProcMapsMemoryTimelineMetricsSource.getDataPoints():java.util.Collection");
    }

    public /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public boolean shouldCollectMetrics(int i) {
        boolean z = false;
        if ((i & 32) != 0) {
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
