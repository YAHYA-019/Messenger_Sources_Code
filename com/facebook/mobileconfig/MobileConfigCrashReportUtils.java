package com.facebook.mobileconfig;

import X.C0gh;
import com.facebook.jni.HybridData;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: MobileConfigCrashReportUtils.class */
public class MobileConfigCrashReportUtils {
    public static MobileConfigCrashReportUtils sInstance;
    public final HybridData mHybridData = initHybrid();

    static {
        C0gh.A03("mobileconfig-jni");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:com.facebook.mobileconfig.MobileConfigCrashReportUtils) from 0x0016: SPUT (r302v3 ?? I:com.facebook.mobileconfig.MobileConfigCrashReportUtils) A[Catch: all -> 0x001d] com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance com.facebook.mobileconfig.MobileConfigCrashReportUtils
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
    public static com.facebook.mobileconfig.MobileConfigCrashReportUtils getInstance() {
        /*
            java.lang.Class<com.facebook.mobileconfig.MobileConfigCrashReportUtils> r0 = com.facebook.mobileconfig.MobileConfigCrashReportUtils.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.mobileconfig.MobileConfigCrashReportUtils r0 = com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            com.facebook.mobileconfig.MobileConfigCrashReportUtils r0 = new com.facebook.mobileconfig.MobileConfigCrashReportUtils     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            com.facebook.mobileconfig.MobileConfigCrashReportUtils.sInstance = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobileconfig.MobileConfigCrashReportUtils.getInstance():com.facebook.mobileconfig.MobileConfigCrashReportUtils");
    }

    public static native HybridData initHybrid();

    public native void addCanaryData(String str, String str2);

    public native void clear();

    public native long count();

    public native Map getAllCanaryData();

    public native Map getAllLastFetchTimestamps();

    public String getSerializedCanaryData() {
        Map allCanaryData = getAllCanaryData();
        StringBuilder sb = new StringBuilder((allCanaryData.size() * 100) + 50);
        sb.append("[");
        boolean z = true;
        for (Map.Entry entry : allCanaryData.entrySet()) {
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            z = false;
            sb.append("\"");
            sb.append((String) entry.getKey());
            sb.append("\"");
        }
        sb.append("]");
        return sb.toString();
    }

    public native void setUpdateListener(MobileConfigCanaryChangeListener mobileConfigCanaryChangeListener);
}
