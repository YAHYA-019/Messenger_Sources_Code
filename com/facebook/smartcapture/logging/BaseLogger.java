package com.facebook.smartcapture.logging;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import com.facebook.smartcapture.logging.SCEventNames;
import java.util.Map;

/* loaded from: BaseLogger.class */
public class BaseLogger implements SmartCaptureLogger {
    public static final Companion Companion = new Object();
    public final SmartCaptureLogger logger;

    public BaseLogger(SmartCaptureLogger smartCaptureLogger) {
        this.logger = smartCaptureLogger;
    }

    public static final Map buildMap(Object... objArr) {
        return Companion.buildMap(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.smartcapture.logging.CommonLoggingFields getCommonFields() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.smartcapture.logging.SmartCaptureLogger r0 = r0.logger
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            com.facebook.smartcapture.logging.CommonLoggingFields r0 = r0.getCommonFields()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L18
        L14:
            com.facebook.smartcapture.logging.CommonLoggingFields r0 = com.facebook.smartcapture.logging.CommonLoggingFields.NO_OP_LOGGING_FIELDS
            r302 = r0
        L18:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.logging.BaseLogger.getCommonFields():com.facebook.smartcapture.logging.CommonLoggingFields");
    }

    public final void logButtonClick(String str) {
        11T.A0F(str, 0);
        logEvent(SCEventNames.BUTTON_CLICK, Companion.buildMap(new Object[]{SCEventNames.Params.BUTTON_NAME, str}));
    }

    public final void logCameraInitialize(int i, int i2, int i3, int i4, int i5, int i6) {
        logEvent(SCEventNames.CAMERA_INITIALIZE, Companion.buildMap(new Object[]{SCEventNames.Params.PREVIEW_WIDTH, Integer.valueOf(i), SCEventNames.Params.PREVIEW_HEIGHT, Integer.valueOf(i2), SCEventNames.Params.IMAGE_WIDTH, Integer.valueOf(i3), SCEventNames.Params.IMAGE_HEIGHT, Integer.valueOf(i4), SCEventNames.Params.VIEW_WIDTH, Integer.valueOf(i5), SCEventNames.Params.VIEW_HEIGHT, Integer.valueOf(i6)}));
    }

    public final void logCaptureSessionEnd(String str) {
        11T.A0F(str, 0);
        logEvent(SCEventNames.CAPTURE_SESSION_END, Companion.buildMap(new Object[]{SCEventNames.Params.CAPTURE_END_HISTORY, str}));
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logError(String str, String str2, Throwable th) {
        11T.A0F(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logError(str, str2, th);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logError(String str, Throwable th) {
        11T.A0F(str, 0);
        logError(str, "", th);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logEvent(String str) {
        11T.A0F(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logEvent(str);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logEvent(String str, Map map) {
        11T.A0F(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logEvent(str, map);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData) {
        11T.A0F(federatedAnalyticsCardData, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.logFederatedAnalyticsCardData(federatedAnalyticsCardData);
        }
    }

    public final void logFlowCancel(CancelReason cancelReason) {
        11T.A0F(cancelReason, 0);
        logEvent(SCEventNames.FLOW_CANCEL, Companion.buildMap(new Object[]{"cancel_reason", cancelReason.getReason()}));
    }

    public final void logFlowEnd() {
        logEvent(SCEventNames.FLOW_END);
    }

    public final void logFlowStart() {
        logEvent(SCEventNames.FLOW_START);
    }

    public final void logPermissionExplain() {
        logEvent(SCEventNames.PERMISSION_EXPLAIN);
    }

    public final void logPermissionGrant(int i) {
        logEvent(SCEventNames.PERMISSION_GRANT, Companion.buildMap(AnonymousClass001.A1b(SCEventNames.Params.PERMISSION_ATTEMPTS, i)));
    }

    public final void logPermissionNeverAskAgain() {
        logEvent(SCEventNames.PERMISSION_NEVER_ASK_AGAIN);
    }

    public final void logPermissionReject() {
        logEvent(SCEventNames.PERMISSION_REJECT);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerAnnotate(int i, String str, long j) {
        11T.A0F(str, 1);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerAnnotate(i, str, j);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerAnnotate(int i, String str, String str2) {
        1BL.A1F(str, str2);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerAnnotate(i, str, str2);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerEnd(int i, boolean z) {
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerEnd(i, z);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerStart(int i) {
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.qplMarkerStart(i);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void setCommonFields(CommonLoggingFields commonLoggingFields) {
        11T.A0F(commonLoggingFields, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.setCommonFields(commonLoggingFields);
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void setCurrentScreen(String str) {
        11T.A0F(str, 0);
        SmartCaptureLogger smartCaptureLogger = this.logger;
        if (smartCaptureLogger != null) {
            smartCaptureLogger.setCurrentScreen(str);
        }
    }
}
