package X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1fq, reason: invalid class name */
/* loaded from: 1fq.class */
public final class C1fq {
    public static final HashSet A06 = new HashSet(Arrays.asList(1, 2));
    public 1fB A00 = null;
    public 1fD A01 = null;
    public Set A02 = null;
    public final int A03;
    public final int A04;
    public final C1hi A05;

    public C1fq(C1hi c1hi, int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = c1hi;
        if (c1hi != null) {
            c1hi.A01 = i;
        }
    }

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "cpuBoost";
            case 2:
                return "gpuBoost";
            case 3:
                return "delayedGC";
            case 4:
                return "layoutPreinflation";
            case 5:
                return "threadAffinity";
            case 6:
                return "renderThreadBoost";
            case 7:
                return "classPreloading";
            case 8:
                return "uiThreadBoost";
            case 9:
                return "lithoLayoutThreadBoost";
            case 10:
                return "delayedAnalytics";
            case 11:
                return "deepDataCollection";
            case 12:
                return "memoryManagerTrim";
            case 13:
                return "softKeyboard";
            case 14:
                return "jitSampleOnly";
            case 15:
                return "blockIdleJob";
            case 16:
                return "activityThread";
            case 17:
                return "uiThreadPeriodic";
            case 18:
                return "ioThreadPeriodic";
            case 19:
                return "graphQLExecutor";
            case 20:
                return "binder";
            case 21:
                return "smartFsync";
            case 22:
                return "mlock";
            case 23:
                return "threadBoostByName";
            case 24:
                return "displayCache";
            case 25:
                return "ditto";
            case 26:
                return "msysThreadsBoost";
            case 27:
                return "noOp";
            case 28:
                return "perfHintManagerBoost";
            default:
                return "";
        }
    }

    public static int[] A01() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    }
}
