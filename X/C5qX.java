package X;

import android.os.Debug;
import com.facebook.memorytimeline.MemoryTimeline;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.5qX, reason: invalid class name */
/* loaded from: 5qX.class */
public abstract class C5qX implements 0Lt {
    public static final C5qX A00;
    public static final C5qX A01 = new 5qY(0Cu.A0X);
    public static final C5qX A02 = new 5qZ(0Cu.A0u);
    public final 0Cu mMemoryTimelineMetric;
    public final HashMap mSurfaceValues = new HashMap();
    public final HashSet mEnteredSurfaceIds = new HashSet();

    static {
        final 0Cu r0 = 0Cu.A08;
        A00 = new C5qX(r0) { // from class: X.5qa
            public int B7T() {
                return 8;
            }
        };
    }

    public C5qX(0Cu r302, String str, int i) {
        this.mMemoryTimelineMetric = r302;
    }

    public long A00() {
        long freeMemory;
        if (this instanceof 5qZ) {
            freeMemory = Debug.getNativeHeapAllocatedSize();
        } else {
            if (!(this instanceof 5qY)) {
                long[] jArr = new long[1];
                C0dl.A01("/proc/self/statm", 2NN.A02, jArr);
                return jArr[0] * 2NN.A01;
            }
            Runtime runtime = Runtime.getRuntime();
            freeMemory = runtime.totalMemory() - runtime.freeMemory();
        }
        return freeMemory / 1024;
    }

    public void Bwf(0Oo r302) {
    }

    public void C9F(MemoryTimeline memoryTimeline, 0MB r303) {
        for (0M9 r0 : r303.A00) {
            if (this.mMemoryTimelineMetric.equals(r0.A02)) {
                synchronized (this.mSurfaceValues) {
                    Iterator it = this.mEnteredSurfaceIds.iterator();
                    while (it.hasNext()) {
                        C5r3 c5r3 = (C5r3) this.mSurfaceValues.get((Integer) it.next());
                        if (c5r3 != null) {
                            0M9 r02 = c5r3.A02;
                            if (r02 == null || 0M9.A00(r02, r0) == r0) {
                                c5r3.A02 = r0;
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean DAC() {
        return true;
    }
}
