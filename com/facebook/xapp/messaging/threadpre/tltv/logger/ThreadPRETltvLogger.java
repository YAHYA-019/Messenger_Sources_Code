package com.facebook.xapp.messaging.threadpre.tltv.logger;

import X.0Pz;
import X.11T;
import X.45R;
import X.AbstractC07814kx;
import X.AnonymousClass001;
import X.C03953ze;
import X.C07834kz;
import X.C47l;
import X.C47n;
import X.C47s;
import X.C47t;
import X.C47u;
import X.C6ia;
import X.C6ic;
import X.C6id;
import X.C6ie;
import X.C6if;
import X.C6ih;
import X.C6ik;
import X.C6il;
import X.C6in;
import X.C6io;
import X.C6ip;
import X.C6iq;
import X.C6is;
import X.C6iu;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: ThreadPRETltvLogger.class */
public abstract class ThreadPRETltvLogger extends AbstractC07814kx {
    public static final String ANNOTATION_LOGGER_TYPE = "logger_type";
    public static final String ANNOTATION_MARKER_FINAL_TTRC_STATUS = "marker_final_ttrc_status";
    public static final String ANNOTATION_RESTART_MARKER_ATTEMPT = "restart_marker_attempt";
    public static final String ANNOTATION_SUFFIX_CC_TIMESTAMP_DIFF_IN_NC = "_cc_timestamp_diff_in_nc";
    public static final String ANNOTATION_SUFFIX_HAS_MEANINGFUL_CHANGE_FROM_NETWORK = "_has_meaningful_change_from_network";
    public static final String ANNOTATION_VALUE_TTCC = "ttcc";
    public static final String ANNOTATION_VALUE_TTNC = "ttnc";
    public static final C07834kz Companion = new Object();
    public static final int MAX_POINT_INDEX = 10;
    public static final String POINT_RESTART_MARKER_ATTEMPT = "restart_marker_attempt";
    public final HashMap allComponents;
    public final HashMap cacheCompletedComponentTimestamps;
    public final HashMap cacheCompletedNoNetworkExpectationComponents;
    public C6ip composer;
    public final C6ie indexTracker;
    public boolean isLoggingInProgress;
    public Boolean isMessageListDataFromNetwork;
    public long lastCompletionTimestamp;
    public final Set loggerListeners;
    public final Map pointIndexTracker;
    public final C6ia preErrorReporter;
    public boolean shouldMarkerEndWithNC;
    public C6il threadView;
    public C6ih threadViewLifecycle;
    public C6iq threadViewLifecycleListener;
    public C6io titleBarUI;
    public C47t ttrcTrace;
    public final C6id ttrcTraceFactory;
    public final HashMap unfinishedRequiredComponents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadPRETltvLogger(QuickPerformanceLogger quickPerformanceLogger, int i, C6ia c6ia) {
        super(quickPerformanceLogger, i);
        11T.A0F(quickPerformanceLogger, 1);
        11T.A0F(c6ia, 3);
        this.preErrorReporter = c6ia;
        this.ttrcTraceFactory = new C6id(c6ia);
        C6if c6if = C6ie.A02;
        Object obj = c6if.A01;
        if (obj == null) {
            synchronized (c6if) {
                obj = c6if.A01;
                if (obj == null) {
                    Function1 function1 = c6if.A00;
                    11T.A0D(function1);
                    obj = function1.invoke(c6ia);
                    c6if.A01 = obj;
                    c6if.A00 = null;
                }
            }
        }
        this.indexTracker = (C6ie) obj;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        this.loggerListeners = newSetFromMap;
        this.allComponents = new HashMap();
        this.unfinishedRequiredComponents = new HashMap();
        this.cacheCompletedNoNetworkExpectationComponents = new HashMap();
        this.cacheCompletedComponentTimestamps = new HashMap();
        this.pointIndexTracker = new LinkedHashMap();
    }

    public static /* synthetic */ void addEndPointWithIndex$default(ThreadPRETltvLogger threadPRETltvLogger, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw AnonymousClass001.A0q("Super calls with default arguments not supported in this target, function: addEndPointWithIndex");
        }
        if ((i & 2) != 0) {
            j = -1;
        }
        threadPRETltvLogger.addEndPointWithIndex(str, j);
    }

    public static /* synthetic */ void addStartPointWithIndex$default(ThreadPRETltvLogger threadPRETltvLogger, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw AnonymousClass001.A0q("Super calls with default arguments not supported in this target, function: addStartPointWithIndex");
        }
        if ((i & 2) != 0) {
            j = -1;
        }
        threadPRETltvLogger.addStartPointWithIndex(str, j);
    }

    private final int getPointIndex(String str) {
        Map map = this.pointIndexTracker;
        Object obj = map.get(str);
        if (obj == null) {
            obj = 1;
            map.put(str, 1);
        }
        int intValue = ((Number) obj).intValue();
        this.pointIndexTracker.put(str, Integer.valueOf(intValue + 1));
        return intValue;
    }

    public static /* synthetic */ void maybeFinishLoggingWithSuccess$default(ThreadPRETltvLogger threadPRETltvLogger, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: maybeFinishLoggingWithSuccess");
        }
        if ((i & 1) != 0) {
            j = -1;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        threadPRETltvLogger.maybeFinishLoggingWithSuccess(j, z);
    }

    private final void notifyAfterLoggingFinished() {
        Iterator it = this.loggerListeners.iterator();
        while (it.hasNext()) {
            ((C6is) it.next()).BiR(this);
        }
    }

    private final void resetLogger() {
        C47t c47t = this.ttrcTrace;
        if (c47t != null) {
            45R.A05.A00().A04(c47t);
        }
        this.ttrcTrace = null;
        setThreadLoggerType(C6ic.A03);
        this.indexTracker.A00.remove(Integer.valueOf(this.instanceKey));
        this.loggerListeners.clear();
        this.allComponents.clear();
        this.unfinishedRequiredComponents.clear();
        this.cacheCompletedNoNetworkExpectationComponents.clear();
        this.cacheCompletedComponentTimestamps.clear();
        this.lastCompletionTimestamp = 0L;
        this.isLoggingInProgress = false;
        this.shouldMarkerEndWithNC = false;
        this.isMessageListDataFromNetwork = null;
        this.threadViewLifecycle = null;
        this.threadView = null;
        this.titleBarUI = null;
        this.composer = null;
        this.threadViewLifecycleListener = null;
        this.pointIndexTracker.clear();
    }

    public final void addEndPointWithIndex(String str) {
        11T.A0F(str, 0);
        addEndPointWithIndex(str, -1);
    }

    public final void addEndPointWithIndex(String str, long j) {
        11T.A0F(str, 0);
        if (this.isLoggingInProgress) {
            C6ie c6ie = this.indexTracker;
            int i = this.instanceKey;
            C6ie.A01(c6ie, str, "end", i);
            addMarkerPoint(C6ie.A00(c6ie, str, "end", i, false), j);
        }
    }

    @Override // X.AbstractC07814kx
    public void addMarkerPoint(String str, long j) {
        11T.A0F(str, 0);
        if (this.isLoggingInProgress) {
            this.qplLogger.markerPoint(getQplIdentifier(), this.instanceKey, str, j, TimeUnit.MILLISECONDS);
        }
    }

    public final void addStartPointWithIndex(String str) {
        11T.A0F(str, 0);
        addStartPointWithIndex(str, -1);
    }

    public final void addStartPointWithIndex(String str, long j) {
        11T.A0F(str, 0);
        if (this.isLoggingInProgress) {
            C6ie c6ie = this.indexTracker;
            int i = this.instanceKey;
            C6ie.A01(c6ie, str, "start", i);
            addMarkerPoint(C6ie.A00(c6ie, str, "start", i, false), j);
        }
    }

    public void attachComponent(C6ik c6ik, boolean z) {
        11T.A0F(c6ik, 0);
        HashMap hashMap = this.allComponents;
        String str = c6ik.A04;
        hashMap.put(str, c6ik);
        if (z) {
            this.unfinishedRequiredComponents.put(str, c6ik);
        }
    }

    public C6ik attachComponentIgnoringTimestamp(String str, boolean z) {
        11T.A0F(str, 0);
        C6ia c6ia = this.preErrorReporter;
        11T.A0F(c6ia, 3);
        C6ik c6ik = new C6ik(this, c6ia, str);
        attachComponent(c6ik, z);
        return c6ik;
    }

    public C6ik attachComponentWithValidation(String str, boolean z) {
        11T.A0F(str, 0);
        C6ia c6ia = this.preErrorReporter;
        11T.A0F(c6ia, 3);
        C6ik c6ik = new C6ik(this, c6ia, str);
        attachComponent(c6ik, z);
        return c6ik;
    }

    public C6ik attachRepeatableComponent(String str, boolean z) {
        11T.A0F(str, 0);
        C6in c6in = new C6in(this, this.preErrorReporter, str);
        attachComponent(c6in, z);
        return c6in;
    }

    public C6ik attachSimpleComponent(String str, boolean z) {
        11T.A0F(str, 0);
        C6ia c6ia = this.preErrorReporter;
        11T.A0F(c6ia, 3);
        C6ik c6ik = new C6ik(this, c6ia, str);
        attachComponent(c6ik, z);
        return c6ik;
    }

    public final C6ip getComposer() {
        return this.composer;
    }

    public abstract boolean getIsMessageListContentFresh();

    public final C6ik getPerfComponent(String str) {
        11T.A0F(str, 0);
        return (C6ik) this.allComponents.get(str);
    }

    public final C6ia getPreErrorReporter() {
        return this.preErrorReporter;
    }

    public final C6il getThreadView() {
        return this.threadView;
    }

    public final C6ih getThreadViewLifecycle() {
        return this.threadViewLifecycle;
    }

    public final C6iq getThreadViewLifecycleListener() {
        return this.threadViewLifecycleListener;
    }

    public final C6io getTitleBarUI() {
        return this.titleBarUI;
    }

    public final boolean isLoggerActive() {
        return this.qplLogger.isMarkerOn(getQplIdentifier(), this.instanceKey);
    }

    public boolean isLoggingInProgress() {
        return this.isLoggingInProgress;
    }

    public final void logEvent(PRELoggingEvent pRELoggingEvent) {
        11T.A0F(pRELoggingEvent, 0);
        if (this.isLoggingInProgress) {
            HashMap hashMap = this.allComponents;
            String A00 = pRELoggingEvent.A00();
            C6ik c6ik = (C6ik) hashMap.get(A00);
            if (c6ik == null) {
                addMarkerPoint(0Pz.A0W(A00, pRELoggingEvent.A01()), pRELoggingEvent.A00);
                return;
            }
            String A01 = pRELoggingEvent.A01();
            if (11T.A0O(A01, "_start")) {
                c6ik.A02(pRELoggingEvent.A00);
            } else if (11T.A0O(A01, "_end")) {
                c6ik.A03(pRELoggingEvent.A00);
            }
        }
    }

    public final void logEventWithIndex(PRELoggingEvent pRELoggingEvent) {
        11T.A0F(pRELoggingEvent, 0);
        if (this.isLoggingInProgress) {
            String A0W = 0Pz.A0W(pRELoggingEvent.A00(), pRELoggingEvent.A01());
            int pointIndex = getPointIndex(A0W);
            String A0M = 0Pz.A0M(A0W, '/', pointIndex);
            if (pointIndex <= 10) {
                this.qplLogger.markerPoint(getQplIdentifier(), this.instanceKey, A0M, pRELoggingEvent.A00, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // X.AbstractC07814kx
    public void loggingCancelled(long j) {
        if (this.isLoggingInProgress) {
            this.qplLogger.markerEndForUserFlow(getQplIdentifier(), null, this.instanceKey, (short) 4, j, TimeUnit.MILLISECONDS);
            notifyAfterLoggingFinished();
            resetLogger();
            onAfterLoggingFinished();
        }
    }

    @Override // X.AbstractC07814kx
    public void loggingEndedWithAction(short s, long j) {
        if (this.isLoggingInProgress) {
            this.qplLogger.markerEndForUserFlow(getQplIdentifier(), null, this.instanceKey, s, j, TimeUnit.MILLISECONDS);
            notifyAfterLoggingFinished();
            resetLogger();
            onAfterLoggingFinished();
        }
    }

    @Override // X.AbstractC07814kx
    public void loggingFailed(long j) {
        if (this.isLoggingInProgress) {
            this.qplLogger.markerEndForUserFlow(getQplIdentifier(), null, this.instanceKey, (short) 3, j, TimeUnit.MILLISECONDS);
            notifyAfterLoggingFinished();
            resetLogger();
            onAfterLoggingFinished();
        }
    }

    @Override // X.AbstractC07814kx
    public void loggingFailed(String str, long j) {
        if (this.isLoggingInProgress) {
            addMarkerAnnotate("error_message", str);
            loggingFailed(j);
        }
    }

    @Override // X.AbstractC07814kx
    public void loggingSucceed(long j) {
        if (this.isLoggingInProgress) {
            this.qplLogger.markerEndForUserFlow(getQplIdentifier(), null, this.instanceKey, (short) 2, j, TimeUnit.MILLISECONDS);
            notifyAfterLoggingFinished();
            resetLogger();
            onAfterLoggingFinished();
        }
    }

    public final void maybeFinishLoggingWithSuccess() {
        maybeFinishLoggingWithSuccess(-1, true);
    }

    public final void maybeFinishLoggingWithSuccess(long j) {
        maybeFinishLoggingWithSuccess(j, true);
    }

    public final void maybeFinishLoggingWithSuccess(long j, boolean z) {
        if (z) {
            this.lastCompletionTimestamp = j;
        }
        if (this.isLoggingInProgress && this.unfinishedRequiredComponents.isEmpty()) {
            addMarkerAnnotate(ANNOTATION_MARKER_FINAL_TTRC_STATUS, this.shouldMarkerEndWithNC ? ANNOTATION_VALUE_TTNC : ANNOTATION_VALUE_TTCC);
            loggingSucceed(this.lastCompletionTimestamp);
        }
    }

    public void onComponentFailed(C6ik c6ik, long j, String str, boolean z) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str2 = c6ik.A04;
            addMarkerPoint(0Pz.A0W(str2, "_failed"), j);
            this.unfinishedRequiredComponents.remove(str2);
            String A0j = 0Pz.A0j(str2, ": ", str);
            if (z) {
                loggingFailed(A0j, j);
            } else {
                addMarkerAnnotate("error_message", A0j);
                maybeFinishLoggingWithSuccess(j, true);
            }
        }
    }

    public void onComponentPrefetched(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str = c6ik.A04;
            addMarkerPoint(0Pz.A0W(str, "_prefetched"), j);
            this.unfinishedRequiredComponents.remove(str);
            maybeFinishLoggingWithSuccess(j, true);
        }
    }

    public void onComponentSkipped(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str = c6ik.A04;
            addMarkerPoint(0Pz.A0W(str, "_skipped"), j);
            this.unfinishedRequiredComponents.remove(str);
            maybeFinishLoggingWithSuccess(j, true);
        }
    }

    public void onComponentStarted(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            addMarkerPoint(0Pz.A0W(c6ik.A04, "_start"), j);
        }
    }

    public void onComponentStartedWithIndex(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            addStartPointWithIndex(c6ik.A04, j);
        }
    }

    public void onComponentSucceeded(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str = c6ik.A04;
            addMarkerPoint(0Pz.A0W(str, "_end"), j);
            this.unfinishedRequiredComponents.remove(str);
            maybeFinishLoggingWithSuccess(j, true);
        }
    }

    public void onComponentSucceededIgnoringTimestamp(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str = c6ik.A04;
            addMarkerPoint(0Pz.A0W(str, "_end"), j);
            this.unfinishedRequiredComponents.remove(str);
            maybeFinishLoggingWithSuccess(j, false);
        }
    }

    public void onComponentSucceededWithCache(C6ik c6ik, long j, boolean z) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str = c6ik.A04;
            String str2 = str;
            if (c6ik instanceof C6in) {
                C6ie c6ie = this.indexTracker;
                int i = this.instanceKey;
                C6ie.A01(c6ie, str, "end", i);
                str2 = C6ie.A00(c6ie, str, "end", i, true);
            }
            addMarkerAnnotate(0Pz.A0W(str2, "_cache_complete"), true);
            this.cacheCompletedComponentTimestamps.put(str, Long.valueOf(j));
            if (!z) {
                addMarkerPoint(0Pz.A0W(str2, "_cache_complete"), j);
                return;
            }
            addMarkerPoint(0Pz.A0W(str2, "_end"), j);
            this.unfinishedRequiredComponents.remove(str);
            this.cacheCompletedNoNetworkExpectationComponents.put(str, c6ik);
            maybeFinishLoggingWithSuccess(j, true);
        }
    }

    public void onComponentSucceededWithIndex(C6ik c6ik, long j) {
        11T.A0F(c6ik, 0);
        if (this.isLoggingInProgress) {
            String str = c6ik.A04;
            addEndPointWithIndex(str, j);
            this.unfinishedRequiredComponents.remove(str);
            maybeFinishLoggingWithSuccess(j, true);
        }
    }

    public boolean onComponentSucceededWithNetwork(C6ik c6ik, long j, boolean z, boolean z2) {
        11T.A0F(c6ik, 0);
        if (!this.isLoggingInProgress) {
            return false;
        }
        if (z2) {
            c6ik.A01 = true;
        }
        String str = c6ik.A04;
        String str2 = str;
        if (c6ik instanceof C6in) {
            C6ie c6ie = this.indexTracker;
            int i = this.instanceKey;
            C6ie.A01(c6ie, str, "end", i);
            str2 = C6ie.A00(c6ie, str, "end", i, true);
        }
        addMarkerAnnotate(0Pz.A0W(str2, "_network_complete"), true);
        if (this.cacheCompletedNoNetworkExpectationComponents.containsKey(str)) {
            addMarkerPoint(0Pz.A0W(str2, "_network_complete"), j);
            this.cacheCompletedNoNetworkExpectationComponents.remove(str);
            return false;
        }
        if (!z) {
            addMarkerPoint(0Pz.A0W(str2, "_network_complete_with_stale_content"), j);
            return false;
        }
        if (c6ik.A01) {
            this.shouldMarkerEndWithNC = true;
        } else {
            Number number = (Number) this.cacheCompletedComponentTimestamps.get(str);
            long longValue = number == null ? j : number.longValue();
            addMarkerAnnotate(0Pz.A0W(str2, ANNOTATION_SUFFIX_CC_TIMESTAMP_DIFF_IN_NC), Long.valueOf(j - longValue));
            j = longValue;
        }
        addMarkerAnnotate(0Pz.A0W(str2, ANNOTATION_SUFFIX_HAS_MEANINGFUL_CHANGE_FROM_NETWORK), c6ik.A01);
        addMarkerPoint(0Pz.A0W(str2, "_end"), j);
        this.unfinishedRequiredComponents.remove(str);
        maybeFinishLoggingWithSuccess(j, true);
        return true;
    }

    public final void queryContentDisplayed(boolean z, long j) {
        Iterator it = this.loggerListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void registerListener(C6is c6is) {
        11T.A0F(c6is, 0);
        this.loggerListeners.add(c6is);
    }

    public final void removeListener(C6is c6is) {
        11T.A0F(c6is, 0);
        this.loggerListeners.remove(c6is);
    }

    public final void setComposer(C6ip c6ip) {
        this.composer = c6ip;
    }

    public final void setThreadView(C6il c6il) {
        this.threadView = c6il;
    }

    public final void setThreadViewLifecycle(C6ih c6ih) {
        this.threadViewLifecycle = c6ih;
    }

    public final void setThreadViewLifecycleListener(C6iq c6iq) {
        this.threadViewLifecycleListener = c6iq;
    }

    public final void setTitleBarUI(C6io c6io) {
        this.titleBarUI = c6io;
    }

    @Override // X.AbstractC07814kx
    public void startLogging(C6ic c6ic, long j) {
        11T.A0F(c6ic, 0);
        if (this.qplLogger.isMarkerOn(getQplIdentifier(), this.instanceKey)) {
            addMarkerAnnotate("restart_marker_attempt", true);
            addMarkerPoint("restart_marker_attempt", j);
            return;
        }
        resetLogger();
        this.threadLoggerType = c6ic;
        onBeforeLoggingStarted();
        C6id c6id = this.ttrcTraceFactory;
        QuickPerformanceLogger quickPerformanceLogger = this.qplLogger;
        int qplIdentifier = getQplIdentifier();
        int i = this.instanceKey;
        Long valueOf = Long.valueOf(j);
        11T.A0F(quickPerformanceLogger, 0);
        C6iu c6iu = new C47l() { // from class: X.6iu
            @Override // X.C47l
            public final long now() {
                return AwakeTimeSinceBootClock.INSTANCE.now();
            }
        };
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        long longValue = valueOf != null ? valueOf.longValue() : now;
        C03953ze c03953ze = C03953ze.A03;
        long A01 = C47u.A01(longValue, c03953ze.A02.get(), c03953ze.A01.get());
        45R r0 = c6id.A01;
        C47n c47n = c6id.A00;
        if (valueOf != null) {
            now = valueOf.longValue();
        }
        C47s c47s = new C47s(c6iu, c47n, r0, quickPerformanceLogger, null, qplIdentifier, i, now, A01, true, true);
        r0.A03(c47s);
        this.ttrcTrace = c47s;
        this.isLoggingInProgress = true;
        addMarkerAnnotate(ANNOTATION_LOGGER_TYPE, c6ic.name());
        Iterator it = this.loggerListeners.iterator();
        while (it.hasNext()) {
            ((C6is) it.next()).BiS(this, j);
        }
        onAfterLoggingStarted(j);
    }
}
