package com.facebook.rtcactivity.logger;

import X.11T;
import X.1JF;
import X.4zI;
import X.7zT;
import X.AbstractC2326GOr;
import com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger;
import com.facebook.rtcactivity.interfaces.Version;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: RtcActivityCoordinatorLoggerImpl.class */
public final class RtcActivityCoordinatorLoggerImpl implements RtcActivityCoordinatorLogger {
    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logAbortTimerFired(String str) {
        AbstractC2326GOr.A0U(str).A05("RtcActivityCoordinatorLoggerImpl", "Abort timer fired - activityId: %s", new Object[]{str});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logAbortTimerStarted(String str) {
        AbstractC2326GOr.A0U(str).A05("RtcActivityCoordinatorLoggerImpl", "Started abort timer - activityId: %s", new Object[]{str});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logAbortTimerStopped(String str) {
        AbstractC2326GOr.A0U(str).A05("RtcActivityCoordinatorLoggerImpl", "Stopped abort timer - activityId: %s", new Object[]{str});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logAcceptStartRequest(String str) {
        AbstractC2326GOr.A0U(str).A05("RtcActivityCoordinatorLoggerImpl", "Accepted start request - activityId: %s", new Object[]{str});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logDeclineStartRequest(String str) {
        AbstractC2326GOr.A0U(str).A05("RtcActivityCoordinatorLoggerImpl", "Declined start request - activityId: %s", new Object[]{str});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logInitiatedActivity(String str, String str2, Version version, Iterable iterable, Iterable iterable2, int i) {
        7zT.A1S(str, str2, version);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Initiated activity - activityId: %s, activityType %s, activityVersion %d.%d", new Object[]{str, str2, Integer.valueOf(version.major), Integer.valueOf(version.minor)});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logReadyToStartActivity(String str, Iterable iterable) {
        11T.A0H(str, iterable);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Ready to start activity - activityId: %s, features: %s", new Object[]{str, 1JF.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, new Object[]{iterable})});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logReceivedActivityMessage(String str) {
        AbstractC2326GOr.A0U(str).A05("RtcActivityCoordinatorLoggerImpl", "Received activity message: messageJSON: %s", new Object[]{str});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logReceivedCancelStartRequestFromPeer(String str, String str2, String str3) {
        7zT.A1S(str, str2, str3);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Received cancel start request - activityId: %s, activityType: %s, cancelReason, %s", new Object[]{str, str2, str3});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logReceivedStartRequestFromPeer(String str, String str2, String str3, Version version, Iterable iterable) {
        11T.A0F(str, 0);
        7zT.A1W(str2, str3, version, iterable);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Received start request - initiator: %s, activityId: %s, activityType: %s, activityVersion: %d.%d, supportedFeatures: %s", new Object[]{str, str2, str3, Integer.valueOf(version.major), Integer.valueOf(version.minor), 1JF.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, new Object[]{iterable})});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logRequestedCancelActivityStart(String str, String str2, String str3) {
        7zT.A1S(str, str2, str3);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Requested cancel activity start - activityId: %s, activityType: %s, cancelReason: %s", new Object[]{str, str2, str3});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logSentActivityMessage(String str, String str2, boolean z) {
        11T.A0H(str, str2);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Sent activity message: activityId: %s, messageJSON: %s, sentTransacted: %s", new Object[]{str, str2, z ? "true" : "false"});
    }

    @Override // com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger
    public void logStateTransition(String str, String str2, String str3) {
        7zT.A1S(str, str2, str3);
        4zI.A03.A05("RtcActivityCoordinatorLoggerImpl", "Transitioned from state %s to %s - activityId: %s", new Object[]{str2, str3, str});
    }
}
