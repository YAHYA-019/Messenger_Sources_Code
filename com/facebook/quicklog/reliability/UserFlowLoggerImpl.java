package com.facebook.quicklog.reliability;

import X.0Pz;
import X.1BL;
import X.C03n;
import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: UserFlowLoggerImpl.class */
public class UserFlowLoggerImpl implements UserFlowLogger {
    public static final String CANCEL_REASON_ANNOTATION = "cancel_reason";
    public static final String DEBUG_INFO_ANNOTATION = "uf_debug_info";
    public static final String HAS_ERROR_ANNOTATION = "uf_has_error";
    public static final AtomicInteger INSTANCE_KEY_COUNTER = new AtomicInteger(1);
    public static final String INVALID_REASON_ANNOTATION = "uf_invalid_reason";
    public static final String SOURCE_ANNOTATION = "trigger_source";
    public static final String SOURCE_OF_RESTART_ANNOTATION = "trigger_source_of_restart";
    public static final String UNSTARTED_DEBUG_INFO_ANNOTATION = "uf_unstarted_debug_info";
    public final boolean mAnnotateTriggerSourceAsCrucial;
    public final Set mOngoingBgCancellableFlows;
    public final Set mOngoingFlows;
    public final QuickPerformanceLogger mQPL;
    public final boolean mStrictMode;

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger) {
        this(quickPerformanceLogger, false, false);
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z) {
        this(quickPerformanceLogger, z, true);
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z, boolean z2) {
        this.mOngoingFlows = new HashSet();
        this.mOngoingBgCancellableFlows = new HashSet();
        quickPerformanceLogger.getClass();
        this.mQPL = quickPerformanceLogger;
        this.mStrictMode = z;
        this.mAnnotateTriggerSourceAsCrucial = z2;
    }

    public static int extractInstanceId(long j) {
        return (int) (j >>> 32);
    }

    public static int extractMarkerId(long j) {
        return (int) j;
    }

    private void flowMarkDebugInfo(long j, String str, boolean z, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.mQPL;
        MarkerEditor withMarker = quickPerformanceLogger.withMarker((int) j, (int) (j >>> 32));
        withMarker.annotate(HAS_ERROR_ANNOTATION, z);
        PointEditor pointEditor = withMarker.pointEditor(str);
        if (str2 != null) {
            pointEditor.addPointData(DEBUG_INFO_ANNOTATION, str2);
        }
        withMarker.markerEditingCompleted();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0064, code lost:
    
        if (r305 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000e, B:7:0x0016, B:12:0x0041, B:23:0x006c, B:25:0x0077, B:27:0x0085, B:29:0x008e, B:31:0x009d, B:33:0x00a6, B:36:0x00b0, B:37:0x00b7, B:39:0x00c8, B:41:0x00d1, B:44:0x00db, B:46:0x00e6, B:48:0x00f5, B:51:0x0145, B:53:0x014e, B:58:0x0159, B:60:0x0162, B:61:0x011f, B:63:0x012a, B:65:0x0139, B:66:0x00ff, B:67:0x0106, B:69:0x0115), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000e, B:7:0x0016, B:12:0x0041, B:23:0x006c, B:25:0x0077, B:27:0x0085, B:29:0x008e, B:31:0x009d, B:33:0x00a6, B:36:0x00b0, B:37:0x00b7, B:39:0x00c8, B:41:0x00d1, B:44:0x00db, B:46:0x00e6, B:48:0x00f5, B:51:0x0145, B:53:0x014e, B:58:0x0159, B:60:0x0162, B:61:0x011f, B:63:0x012a, B:65:0x0139, B:66:0x00ff, B:67:0x0106, B:69:0x0115), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145 A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000e, B:7:0x0016, B:12:0x0041, B:23:0x006c, B:25:0x0077, B:27:0x0085, B:29:0x008e, B:31:0x009d, B:33:0x00a6, B:36:0x00b0, B:37:0x00b7, B:39:0x00c8, B:41:0x00d1, B:44:0x00db, B:46:0x00e6, B:48:0x00f5, B:51:0x0145, B:53:0x014e, B:58:0x0159, B:60:0x0162, B:61:0x011f, B:63:0x012a, B:65:0x0139, B:66:0x00ff, B:67:0x0106, B:69:0x0115), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159 A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000e, B:7:0x0016, B:12:0x0041, B:23:0x006c, B:25:0x0077, B:27:0x0085, B:29:0x008e, B:31:0x009d, B:33:0x00a6, B:36:0x00b0, B:37:0x00b7, B:39:0x00c8, B:41:0x00d1, B:44:0x00db, B:46:0x00e6, B:48:0x00f5, B:51:0x0145, B:53:0x014e, B:58:0x0159, B:60:0x0162, B:61:0x011f, B:63:0x012a, B:65:0x0139, B:66:0x00ff, B:67:0x0106, B:69:0x0115), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000e, B:7:0x0016, B:12:0x0041, B:23:0x006c, B:25:0x0077, B:27:0x0085, B:29:0x008e, B:31:0x009d, B:33:0x00a6, B:36:0x00b0, B:37:0x00b7, B:39:0x00c8, B:41:0x00d1, B:44:0x00db, B:46:0x00e6, B:48:0x00f5, B:51:0x0145, B:53:0x014e, B:58:0x0159, B:60:0x0162, B:61:0x011f, B:63:0x012a, B:65:0x0139, B:66:0x00ff, B:67:0x0106, B:69:0x0115), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000e, B:7:0x0016, B:12:0x0041, B:23:0x006c, B:25:0x0077, B:27:0x0085, B:29:0x008e, B:31:0x009d, B:33:0x00a6, B:36:0x00b0, B:37:0x00b7, B:39:0x00c8, B:41:0x00d1, B:44:0x00db, B:46:0x00e6, B:48:0x00f5, B:51:0x0145, B:53:0x014e, B:58:0x0159, B:60:0x0162, B:61:0x011f, B:63:0x012a, B:65:0x0139, B:66:0x00ff, B:67:0x0106, B:69:0x0115), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean flowStartInternal(long r302, com.facebook.quicklog.reliability.UserFlowConfig r304, boolean r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.reliability.UserFlowLoggerImpl.flowStartInternal(long, com.facebook.quicklog.reliability.UserFlowConfig, boolean, java.lang.String):boolean");
    }

    public static long generateUserFlowId(int i, int i2) {
        return i | (i2 << 32);
    }

    private void logUnstartedSession(int i, short s, String str, String str2) {
        EventBuilder annotate = this.mQPL.markEventBuilder(i, "user_flow_strict_mode").setActionId(s).annotate(INVALID_REASON_ANNOTATION, str);
        if (!TextUtils.isEmpty(str2)) {
            annotate = annotate.annotate(UNSTARTED_DEBUG_INFO_ANNOTATION, str2);
        }
        annotate.report();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, double d) {
        flowAnnotate(j, str, d, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, double d, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || 1BL.A1T(this, j)) {
            this.mQPL.markerAnnotate(i, i2, str, d);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, int i) {
        flowAnnotate(j, str, i, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        if (!this.mStrictMode || 1BL.A1T(this, j)) {
            this.mQPL.markerAnnotate(i2, i3, str, i);
        } else {
            logUnstartedSession(i2, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, long j2) {
        flowAnnotate(j, str, j2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, long j2, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i, i2, str, j2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, String str2) {
        flowAnnotate(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i, i2, str, str2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str3);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, boolean z) {
        flowAnnotate(j, str, z, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, boolean z, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || 1BL.A1T(this, j)) {
            this.mQPL.markerAnnotate(i, i2, str, z);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, int i) {
        flowAnnotateWithCrucialData(j, str, i, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotateWithCrucialData(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        if (!this.mStrictMode || 1BL.A1T(this, j)) {
            this.mQPL.markerAnnotateCrucialForUserFlow(i2, i3, str, i);
        } else {
            logUnstartedSession(i2, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, String str2) {
        flowAnnotateWithCrucialData(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotateWithCrucialData(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotateCrucialForUserFlow(i, i2, str, str2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str3);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowCancelAtPoint(long j, String str, String str2) {
        flowCancelAtPoint(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowCancelAtPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        this.mQPL.markerAnnotate(i, i2, "cancel_reason", str2);
        synchronized (this) {
            if (!this.mStrictMode || 1BL.A1T(this, j)) {
                this.mQPL.markerEndForUserFlow(i, str, i2, (short) 4);
            } else {
                logUnstartedSession(i, (short) 10294, 0Pz.A0W("flowCancelAtPoint|", str2), str3);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowDrop(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                this.mQPL.markerDropForUserFlow(i, i2);
            }
            this.mOngoingFlows.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndAbort(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.mStrictMode || 1BL.A1T(this, j)) {
                this.mQPL.markerEndForUserFlow(i, null, i2, (short) 105);
            } else {
                logUnstartedSession(i, (short) 10294, "flowEndAbort", "");
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndCancel(long j, String str) {
        flowEndCancel(j, str, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndCancel(long j, String str, String str2) {
        flowCancelAtPoint(j, null, str, str2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndFail(long j, String str, String str2) {
        flowEndFail(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndFail(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        flowMarkError(j, str, str2);
        synchronized (this) {
            if (!this.mStrictMode || 1BL.A1T(this, j)) {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 3);
            } else {
                logUnstartedSession(i, (short) 10294, 0Pz.A0W("flowEndFail|", str), str3);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    public void flowEndNewStartFound(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.mStrictMode || 1BL.A1T(this, j)) {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 111);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndSuccess(long j) {
        flowEndSuccess(j, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndSuccess(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 2);
            } else {
                logUnstartedSession(i, (short) 10294, "flowEndSuccess", str);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndTimeout(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.mStrictMode || 1BL.A1T(this, j)) {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 113);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkError(long j, String str, String str2) {
        flowMarkDebugInfo(j, str, true, str2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkPoint(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerPoint(i, i2, str);
        } else {
            logUnstartedSession(i, (short) 10088, str, "");
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowMarkPoint(long j, String str, String str2) {
        flowMarkPoint(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (this.mStrictMode && !1BL.A1T(this, j)) {
            logUnstartedSession(i, (short) 10088, str, str3);
            return;
        }
        MarkerEditor withMarker = this.mQPL.withMarker(i, i2);
        withMarker.pointEditor(str).addPointData(DEBUG_INFO_ANNOTATION, str2);
        withMarker.markerEditingCompleted();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, UserFlowConfig userFlowConfig) {
        flowStartInternal(j, userFlowConfig, false, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, UserFlowConfig userFlowConfig) {
        flowStartInternal(j, userFlowConfig, false, str);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, boolean z) {
        flowStartInternal(j, new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), false, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, boolean z, long j2) {
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j2;
        flowStartInternal(j, userFlowConfig, false, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long flowStartForMarker(int i, String str, boolean z) {
        long incrementAndGet = i | (INSTANCE_KEY_COUNTER.incrementAndGet() << 32);
        flowStartInternal(incrementAndGet, new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), false, null);
        return incrementAndGet;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig) {
        return flowStartInternal(j, userFlowConfig, true, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig) {
        return flowStartInternal(j, userFlowConfig, true, str);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j) {
        long j2 = i | (i2 << 32);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j;
        if (flowStartInternal(j2, userFlowConfig, true, null)) {
            return Long.valueOf(j2);
        }
        return null;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long generateFlowId(int i, int i2) {
        return i | (i2 << 32);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long generateNewFlowId(int i) {
        return i | (INSTANCE_KEY_COUNTER.incrementAndGet() << 32);
    }

    public int[] getOngoingFlows() {
        int[] iArr;
        synchronized (this) {
            iArr = new int[this.mOngoingFlows.size()];
            int i = 0;
            for (Long l : this.mOngoingFlows) {
                int i2 = i + 1;
                iArr[i] = (int) l.longValue();
                i = i2;
            }
        }
        return iArr;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean isOngoingFlow(long j) {
        boolean contains;
        synchronized (this) {
            contains = this.mOngoingFlows.contains(Long.valueOf(j));
        }
        return contains;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ PointEditor markPointWithEditor(long j, String str) {
        return markPointWithEditor(j, str, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public PointEditor markPointWithEditor(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || 1BL.A1T(this, j)) {
            return this.mQPL.withMarker(i, i2).pointEditor(str);
        }
        logUnstartedSession(i, (short) 10088, str, str2);
        return C03n.A00;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void onAppBackgrounded() {
        synchronized (this) {
            this.mOngoingFlows.removeAll(this.mOngoingBgCancellableFlows);
            this.mOngoingBgCancellableFlows.clear();
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public MarkerEditor withFlow(long j) {
        int i = (int) (j >>> 32);
        return this.mQPL.withMarker((int) j, i);
    }
}
