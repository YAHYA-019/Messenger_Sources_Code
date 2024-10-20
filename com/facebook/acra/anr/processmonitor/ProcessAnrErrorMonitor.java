package com.facebook.acra.anr.processmonitor;

import X.0EP;
import X.0Pz;
import X.0fH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0ft;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: ProcessAnrErrorMonitor.class */
public class ProcessAnrErrorMonitor {
    public static final int DEFAULT_POLLING_TIME_MS = 500;
    public static final String LOG_TAG = "ProcessAnrErrorMonitor";
    public static final int UNLIMITED_NUMBER_OF_CHECKS = 0;
    public final Context mContext;
    public final boolean mContinuousMonitoring;
    public long mCurrentMonitorThreadId;
    public int mDurationWritePos;
    public MonitorThread mErrorCheckThread;
    public boolean mFullHistoryData;
    public final int mMaxNumberOfChecksAfterError;
    public final int mMaxNumberOfChecksBeforeError;
    public final int mMyUid;
    public final int mPollingTime;
    public final String mProcessName;
    public final long[] mQueryDurationHistory;
    public State mState;

    /* renamed from: com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$1, reason: invalid class name */
    /* loaded from: ProcessAnrErrorMonitor$1.class */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$acra$anr$processmonitor$ProcessAnrErrorMonitor$StateChangeReason;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x008f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason[] r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.values()
                r301 = r0
                r0 = r301
                int r0 = r0.length
                r302 = r0
                r0 = r302
                int[] r0 = new int[r0]
                r303 = r0
                r0 = r303
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.AnonymousClass1.$SwitchMap$com$facebook$acra$anr$processmonitor$ProcessAnrErrorMonitor$StateChangeReason = r0
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.MONITOR_STARTED     // Catch: java.lang.NoSuchFieldError -> L7b
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
                r304 = r0
                r0 = 1
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            L1e:
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.ERROR_DETECTED     // Catch: java.lang.NoSuchFieldError -> L7b java.lang.NoSuchFieldError -> L7f
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r304 = r0
                r0 = 2
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
            L2d:
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.ERROR_CLEARED     // Catch: java.lang.NoSuchFieldError -> L7f java.lang.NoSuchFieldError -> L83
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r304 = r0
                r0 = 3
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L3c:
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.MAX_NUMBER_AFTER_ERROR     // Catch: java.lang.NoSuchFieldError -> L83 java.lang.NoSuchFieldError -> L87
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L87
                r304 = r0
                r0 = 4
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L87
            L4b:
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.MAX_NUMBER_BEFORE_ERROR     // Catch: java.lang.NoSuchFieldError -> L87 java.lang.NoSuchFieldError -> L8b
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8b
                r304 = r0
                r0 = 5
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8b
            L5a:
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.STOP_REQUESTED     // Catch: java.lang.NoSuchFieldError -> L8b java.lang.NoSuchFieldError -> L8f
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r304 = r0
                r0 = 6
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L6a:
                com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$StateChangeReason r0 = com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.StateChangeReason.ERROR_QUERYING_ACTIVITY_MANAGER     // Catch: java.lang.NoSuchFieldError -> L8f java.lang.NoSuchFieldError -> L93
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L93
                r304 = r0
                r0 = 7
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L93
            L7a:
                return
            L7b:
                goto L1e
            L7f:
                goto L2d
            L83:
                goto L3c
            L87:
                goto L4b
            L8b:
                goto L5a
            L8f:
                goto L6a
            L93:
                goto L7a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.AnonymousClass1.m5553clinit():void");
        }
    }

    /* loaded from: ProcessAnrErrorMonitor$AnrCheckState.class */
    public class AnrCheckState {
        public boolean mAnrConfirmed;
        public int mCount;
    }

    /* loaded from: ProcessAnrErrorMonitor$AnrErrorState.class */
    public class AnrErrorState {
        public String mErrorMsg;
        public String mProcessName;
        public String mTag;
    }

    /* loaded from: ProcessAnrErrorMonitor$Api17Utils.class */
    public class Api17Utils {
        public static long getTimeInNanos() {
            return SystemClock.elapsedRealtimeNanos();
        }
    }

    /* loaded from: ProcessAnrErrorMonitor$MonitorThread.class */
    public class MonitorThread extends Thread {
        public final ActivityManager mAm;
        public final long mDelay;
        public boolean mFirstCheck;
        public final long mId;
        public volatile ProcessErrorStateListener mListener;
        public final Object mMonitorLock;
        public boolean mPauseRequested;
        public final Set mProcessesInAnr;
        public boolean mStopRequested;

        public MonitorThread(ActivityManager activityManager, ProcessErrorStateListener processErrorStateListener, long j, long j2) {
            super(0Pz.A0W("ProcessAnrErrorMonitorThread:", C0ft.A02()));
            this.mMonitorLock = new Object();
            this.mProcessesInAnr = new HashSet();
            this.mAm = activityManager;
            this.mListener = processErrorStateListener;
            this.mId = j;
            this.mDelay = j2;
            this.mFirstCheck = true;
        }

        public /* synthetic */ MonitorThread(ProcessAnrErrorMonitor processAnrErrorMonitor, ActivityManager activityManager, ProcessErrorStateListener processErrorStateListener, long j, long j2, AnonymousClass1 anonymousClass1) {
            this(activityManager, processErrorStateListener, j, j2);
        }

        private void maybeCallIterationListener() {
            if (this.mListener != null) {
                this.mListener.onCheckPerformed();
            }
        }

        private void maybeLogAnrStateFromOtherProcesses(LinkedList linkedList, String str) {
            if (this.mListener != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    AnrErrorState anrErrorState = (AnrErrorState) it.next();
                    String str2 = anrErrorState.mProcessName;
                    if (!str.equals(str2)) {
                        0fH.A17(ProcessAnrErrorMonitor.LOG_TAG, "Error found in process '%s' different from process being searched '%s'", new Object[]{str2, str});
                        String str3 = anrErrorState.mProcessName;
                        if (str3 != null && !this.mProcessesInAnr.contains(str3) && this.mListener.onErrorDetectOnOtherProcess(anrErrorState.mProcessName, anrErrorState.mErrorMsg, anrErrorState.mTag)) {
                            this.mProcessesInAnr.add(anrErrorState.mProcessName);
                        }
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v62, types: [com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$AnrCheckState, java.lang.Object] */
        private void monitorLoop() {
            boolean z;
            boolean z2;
            if (this.mDelay > 0 || this.mListener == null) {
                long j = this.mDelay;
                synchronized (this.mMonitorLock) {
                    boolean z3 = j <= 0 ? this.mListener == null : !this.mStopRequested;
                    z = this.mStopRequested;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (z3) {
                        while (true) {
                            try {
                                this.mMonitorLock.wait(j);
                            } catch (InterruptedException unused) {
                            }
                            boolean z4 = j <= 0 ? this.mListener == null : !this.mStopRequested;
                            z = this.mStopRequested;
                            if (!z4) {
                                break;
                            }
                            if (j > 0) {
                                j = this.mDelay - (SystemClock.uptimeMillis() - uptimeMillis);
                                if (j < 1) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    return;
                }
            }
            ?? obj = new Object();
            obj.mAnrConfirmed = false;
            obj.mCount = 0;
            while (checkIteration(obj)) {
                synchronized (this.mMonitorLock) {
                    z2 = this.mStopRequested;
                    if (!z2) {
                        int i = ProcessAnrErrorMonitor.this.mPollingTime;
                        do {
                            if (this.mPauseRequested) {
                                i = 0;
                            }
                            try {
                                this.mMonitorLock.wait(i);
                            } catch (InterruptedException unused2) {
                            }
                            if (!this.mPauseRequested) {
                                break;
                            }
                        } while (!this.mStopRequested);
                        z2 = this.mStopRequested;
                    }
                }
                if (z2) {
                    ProcessAnrErrorMonitor.this.updateStateAndMaybeCallListener(StateChangeReason.STOP_REQUESTED, this.mListener);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pauseRequested() {
            synchronized (this.mMonitorLock) {
                this.mPauseRequested = true;
                this.mMonitorLock.notifyAll();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resumeRequested() {
            synchronized (this.mMonitorLock) {
                this.mPauseRequested = false;
                this.mMonitorLock.notifyAll();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stopRequested() {
            synchronized (this.mMonitorLock) {
                this.mStopRequested = true;
                this.mMonitorLock.notifyAll();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0159  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean checkIteration(com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.AnrCheckState r302) {
            /*
                Method dump skipped, instructions count: 738
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.MonitorThread.checkIteration(com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$AnrCheckState):boolean");
        }

        public long getMonitorId() {
            return this.mId;
        }

        public boolean hasListener() {
            return AnonymousClass001.A1T(this.mListener);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            monitorLoop();
        }

        public void setListener(ProcessErrorStateListener processErrorStateListener) {
            synchronized (this.mMonitorLock) {
                this.mListener = processErrorStateListener;
                this.mMonitorLock.notifyAll();
            }
        }
    }

    /* loaded from: ProcessAnrErrorMonitor$State.class */
    public enum State {
        NOT_MONITORING,
        MONITORING_NO_ERROR_DETECTED,
        MONITORING_ERROR_DETECTED
    }

    /* loaded from: ProcessAnrErrorMonitor$StateChangeReason.class */
    public enum StateChangeReason {
        MONITOR_STARTED,
        ERROR_CLEARED,
        ERROR_DETECTED,
        MAX_NUMBER_BEFORE_ERROR,
        MAX_NUMBER_AFTER_ERROR,
        STOP_REQUESTED,
        ERROR_QUERYING_ACTIVITY_MANAGER
    }

    public ProcessAnrErrorMonitor(Context context, String str, int i, int i2) {
        this(context, str, false, 500, false, i, i2, 0);
    }

    public ProcessAnrErrorMonitor(Context context, String str, boolean z, int i, int i2) {
        this(context, str, z, 500, false, i, i2, 0);
    }

    public ProcessAnrErrorMonitor(Context context, String str, boolean z, int i, boolean z2, int i2, int i3, int i4) {
        this.mContext = context;
        this.mProcessName = str;
        this.mState = State.NOT_MONITORING;
        this.mPollingTime = i;
        this.mContinuousMonitoring = z2;
        this.mMaxNumberOfChecksBeforeError = i2;
        this.mMaxNumberOfChecksAfterError = i3;
        this.mMyUid = Process.myUid();
        if (i4 > 0) {
            this.mQueryDurationHistory = new long[i4];
        } else {
            this.mQueryDurationHistory = null;
        }
        this.mFullHistoryData = false;
        this.mDurationWritePos = 0;
        if (z) {
            startMonitoringAfterDelay(null, 0L);
        }
    }

    public static long getTimeInNanos() {
        return Api17Utils.getTimeInNanos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logDuration(long j) {
        long[] jArr = this.mQueryDurationHistory;
        if (jArr != null) {
            synchronized (jArr) {
                long[] jArr2 = this.mQueryDurationHistory;
                int i = this.mDurationWritePos;
                jArr2[i] = j;
                int i2 = i + 1;
                this.mDurationWritePos = i2;
                if (i2 >= jArr2.length) {
                    this.mFullHistoryData = true;
                    this.mDurationWritePos = 0;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$AnrErrorState] */
    public LinkedList checkProcessError(ActivityManager activityManager) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        LinkedList linkedList = new LinkedList();
        if (processesInErrorState != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == this.mMyUid) {
                    ?? obj = new Object();
                    obj.mErrorMsg = processErrorStateInfo.shortMsg;
                    obj.mTag = processErrorStateInfo.tag;
                    String str = processErrorStateInfo.processName;
                    obj.mProcessName = str;
                    if (this.mProcessName.equals(str)) {
                        linkedList.addFirst(obj);
                    } else {
                        linkedList.addLast(obj);
                    }
                }
            }
        }
        return linkedList;
    }

    public 0EP getDurationHistory() {
        0EP r0;
        long[] jArr = this.mQueryDurationHistory;
        if (jArr == null) {
            return null;
        }
        synchronized (jArr) {
            long[] jArr2 = this.mQueryDurationHistory;
            int length = jArr2.length;
            long[] jArr3 = new long[length];
            System.arraycopy(jArr2, 0, jArr3, 0, length);
            r0 = new 0EP(jArr3, this.mDurationWritePos, this.mFullHistoryData);
        }
        return r0;
    }

    public MonitorThread getErrorCheckThread() {
        MonitorThread monitorThread;
        synchronized (this) {
            monitorThread = this.mErrorCheckThread;
        }
        return monitorThread;
    }

    public State getState() {
        State state;
        synchronized (this) {
            state = this.mState;
        }
        return state;
    }

    public void pause() {
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING) {
                MonitorThread monitorThread = this.mErrorCheckThread;
                if (monitorThread != null) {
                    monitorThread.pauseRequested();
                }
            }
        }
    }

    public void resume() {
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING) {
                MonitorThread monitorThread = this.mErrorCheckThread;
                if (monitorThread != null) {
                    monitorThread.resumeRequested();
                }
            }
        }
    }

    public void setErrorCheckThread(MonitorThread monitorThread) {
        synchronized (this) {
            this.mErrorCheckThread = monitorThread;
        }
    }

    public void startMonitoring(ProcessErrorStateListener processErrorStateListener) {
        startMonitoringAfterDelay(processErrorStateListener, 0L);
    }

    public void startMonitoringAfterDelay(ProcessErrorStateListener processErrorStateListener, long j) {
        IllegalArgumentException A0L;
        0fH.A17(LOG_TAG, "startMonitoring with delay: %d", new Object[]{Long.valueOf(j)});
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        synchronized (this) {
            if (processErrorStateListener != null || j == 0) {
                MonitorThread monitorThread = this.mErrorCheckThread;
                if (monitorThread == null || AnonymousClass001.A1T(monitorThread.mListener)) {
                    State state = this.mState;
                    State state2 = State.NOT_MONITORING;
                    if (state != state2) {
                        MonitorThread monitorThread2 = this.mErrorCheckThread;
                        if (monitorThread2 != null) {
                            monitorThread2.stopRequested();
                        }
                    }
                    long j2 = this.mCurrentMonitorThreadId + 1;
                    this.mCurrentMonitorThreadId = j2;
                    MonitorThread monitorThread3 = new MonitorThread(activityManager, processErrorStateListener, j2, j);
                    this.mErrorCheckThread = monitorThread3;
                    if (processErrorStateListener != null) {
                        state2 = State.MONITORING_NO_ERROR_DETECTED;
                    }
                    this.mState = state2;
                    monitorThread3.start();
                } else if (processErrorStateListener != null) {
                    this.mErrorCheckThread.setListener(processErrorStateListener);
                } else {
                    A0L = AnonymousClass001.A0L("Listener cannot be null");
                }
            } else {
                A0L = AnonymousClass001.A0L("Cannot delay and wait for listener at the same time");
            }
            throw A0L;
        }
    }

    public MonitorThread startMonitoringForTest(ProcessErrorStateListener processErrorStateListener) {
        MonitorThread monitorThread;
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING) {
                MonitorThread monitorThread2 = this.mErrorCheckThread;
                if (monitorThread2 != null) {
                    monitorThread2.stopRequested();
                }
            }
            long j = this.mCurrentMonitorThreadId + 1;
            this.mCurrentMonitorThreadId = j;
            monitorThread = new MonitorThread(activityManager, processErrorStateListener, j, 0L);
            this.mErrorCheckThread = monitorThread;
        }
        return monitorThread;
    }

    public void stopMonitoring() {
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING) {
                MonitorThread monitorThread = this.mErrorCheckThread;
                if (monitorThread != null) {
                    monitorThread.stopRequested();
                }
            }
        }
    }

    public void updateStateAndMaybeCallListener(StateChangeReason stateChangeReason, ProcessErrorStateListener processErrorStateListener) {
        updateStateAndMaybeCallListener(stateChangeReason, processErrorStateListener, null, null);
    }

    public void updateStateAndMaybeCallListener(StateChangeReason stateChangeReason, ProcessErrorStateListener processErrorStateListener, String str, String str2) {
        synchronized (this) {
            MonitorThread monitorThread = this.mErrorCheckThread;
            if (monitorThread == null || monitorThread.mId == this.mCurrentMonitorThreadId) {
                switch (stateChangeReason) {
                    case MONITOR_STARTED:
                        if (processErrorStateListener != null) {
                            processErrorStateListener.onStart();
                            break;
                        }
                        break;
                    case ERROR_CLEARED:
                        if (this.mContinuousMonitoring) {
                            this.mState = State.MONITORING_NO_ERROR_DETECTED;
                        } else {
                            this.mState = State.NOT_MONITORING;
                        }
                        if (processErrorStateListener != null) {
                            processErrorStateListener.onErrorCleared();
                            break;
                        }
                        break;
                    case ERROR_DETECTED:
                        this.mState = State.MONITORING_ERROR_DETECTED;
                        if (processErrorStateListener != null) {
                            processErrorStateListener.onErrorDetected(str, str2);
                            break;
                        }
                        break;
                    case MAX_NUMBER_BEFORE_ERROR:
                        this.mState = State.NOT_MONITORING;
                        if (processErrorStateListener != null) {
                            processErrorStateListener.onMaxChecksReachedBeforeError();
                            break;
                        }
                        break;
                    case MAX_NUMBER_AFTER_ERROR:
                        this.mState = State.NOT_MONITORING;
                        if (processErrorStateListener != null) {
                            processErrorStateListener.onMaxChecksReachedAfterError();
                            break;
                        }
                        break;
                    case STOP_REQUESTED:
                        this.mState = State.NOT_MONITORING;
                        break;
                    case ERROR_QUERYING_ACTIVITY_MANAGER:
                        this.mState = State.NOT_MONITORING;
                        if (processErrorStateListener != null) {
                            processErrorStateListener.onCheckFailed();
                            break;
                        }
                        break;
                    default:
                        throw AnonymousClass002.A0C(stateChangeReason, "Unexpected state change reason: ", AnonymousClass001.A0k());
                }
            }
        }
    }
}
