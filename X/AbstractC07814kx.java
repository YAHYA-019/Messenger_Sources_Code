package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kx.class */
public abstract class AbstractC07814kx {
    public final int instanceKey;
    public final QuickPerformanceLogger qplLogger;
    public C6ic threadLoggerType;

    public AbstractC07814kx(QuickPerformanceLogger quickPerformanceLogger, int i) {
        11T.A0F(quickPerformanceLogger, 1);
        this.qplLogger = quickPerformanceLogger;
        this.instanceKey = i;
        this.threadLoggerType = C6ic.A03;
    }

    public final void addMarkerAnnotate(String str, Integer num) {
        11T.A0F(str, 0);
        if (num != null) {
            this.qplLogger.markerAnnotate(getQplIdentifier(), this.instanceKey, str, num.intValue());
        }
    }

    public final void addMarkerAnnotate(String str, Long l) {
        11T.A0F(str, 0);
        if (l != null) {
            this.qplLogger.markerAnnotate(getQplIdentifier(), this.instanceKey, str, l.longValue());
        }
    }

    public final void addMarkerAnnotate(String str, String str2) {
        11T.A0F(str, 0);
        if (str2 != null) {
            this.qplLogger.markerAnnotate(getQplIdentifier(), this.instanceKey, str, str2);
        }
    }

    public final void addMarkerAnnotate(String str, boolean z) {
        11T.A0F(str, 0);
        this.qplLogger.markerAnnotate(getQplIdentifier(), this.instanceKey, str, z);
    }

    public final void addMarkerPoint(String str) {
        11T.A0F(str, 0);
        addMarkerPoint(str, -1);
    }

    public abstract void addMarkerPoint(String str, long j);

    public final int getInstanceKey() {
        return this.instanceKey;
    }

    public abstract int getQplIdentifier();

    public final QuickPerformanceLogger getQplLogger() {
        return this.qplLogger;
    }

    public final C6ic getThreadLoggerType() {
        return this.threadLoggerType;
    }

    public final void loggingCancelled() {
        loggingCancelled(-1);
    }

    public abstract void loggingCancelled(long j);

    public final void loggingEndedWithAction(short s) {
        loggingEndedWithAction(s, -1);
    }

    public abstract void loggingEndedWithAction(short s, long j);

    public final void loggingFailed() {
        loggingFailed(-1);
    }

    public abstract void loggingFailed(long j);

    public final void loggingFailed(String str) {
        loggingFailed(str, -1);
    }

    public abstract void loggingFailed(String str, long j);

    public final void loggingSucceed() {
        loggingSucceed(-1);
    }

    public abstract void loggingSucceed(long j);

    public abstract void onAfterLoggingFinished();

    public abstract void onAfterLoggingStarted(long j);

    public abstract void onBeforeLoggingStarted();

    public final void setThreadLoggerType(C6ic c6ic) {
        11T.A0F(c6ic, 0);
        this.threadLoggerType = c6ic;
    }

    public final void startLogging(C6ic c6ic) {
        11T.A0F(c6ic, 0);
        startLogging(c6ic, -1);
    }

    public abstract void startLogging(C6ic c6ic, long j);
}
