package com.facebook.smartcapture.logging;

import X.04J;
import X.0Pz;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1EZ;
import X.1Fw;
import X.1UG;
import X.7zK;
import X.7zM;
import X.7zP;
import X.AbF;
import X.AbG;
import X.AnonymousClass001;
import X.C01s;
import X.C06w;
import X.C06z;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DefaultSmartCaptureLogger.class */
public final class DefaultSmartCaptureLogger implements SmartCaptureLogger {
    public static final String ANNOTATION_KEY_PRODUCT = "product";
    public static final int ERROR_SAMPLING_FREQUENCY = 10;
    public static final String LOG_VIEW_CATEGORY = "smart_capture: ";
    public final 1Br cardDataLogger$delegate;
    public CommonLoggingFields commonFields;
    public final 1Br fbErrorReporter$delegate;
    public final 1De kinjector;
    public final 1Br logger$delegate;
    public final 1Br qpl$delegate;
    public String screen;
    public final 1Br viewerContextManager$delegate;
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(DefaultSmartCaptureLogger.class, "viewerContextManager", "getViewerContextManager()Lcom/facebook/auth/viewercontext/ViewerContextManager;", 0), new C06w(DefaultSmartCaptureLogger.class, "logger", "getLogger()Lcom/facebook/analytics/structuredlogger/base/Logger;", 0), new C06w(DefaultSmartCaptureLogger.class, "qpl", "getQpl()Lcom/facebook/quicklog/QuickPerformanceLogger;", 0), new C06w(DefaultSmartCaptureLogger.class, "fbErrorReporter", "getFbErrorReporter()Lcom/facebook/common/errorreporting/FbErrorReporter;", 0), new C06w(DefaultSmartCaptureLogger.class, "cardDataLogger", "getCardDataLogger()Lcom/facebook/smartcapture/logging/CardDataLogger;", 0)};
    public static final Companion Companion = new Object();

    /* loaded from: DefaultSmartCaptureLogger$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DefaultSmartCaptureLogger(1De r302) {
        11T.A0F(r302, 1);
        this.kinjector = r302;
        1BY r0 = r302.A00;
        this.viewerContextManager$delegate = 1Bu.A03(r0, 16428);
        this.logger$delegate = 1BK.A0D();
        this.qpl$delegate = 7zM.A0S();
        this.fbErrorReporter$delegate = AbG.A0M();
        this.cardDataLogger$delegate = 1Bu.A03(r0, 116429);
        this.commonFields = CommonLoggingFields.NO_OP_LOGGING_FIELDS;
        this.screen = "";
    }

    private final CardDataLogger getCardDataLogger() {
        return (CardDataLogger) 1Br.A0B(this.cardDataLogger$delegate);
    }

    private final C01s getFbErrorReporter() {
        return 1Br.A04(this.fbErrorReporter$delegate);
    }

    private final 04J getLogger() {
        return 1Br.A02(this.logger$delegate);
    }

    private final QuickPerformanceLogger getQpl() {
        return 7zP.A0e(this.qpl$delegate);
    }

    private final 1EZ getViewerContextManager() {
        return (1EZ) 1Br.A0B(this.viewerContextManager$delegate);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public CommonLoggingFields getCommonFields() {
        return this.commonFields;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logError(String str, String str2, Throwable th) {
        11T.A0F(str, 0);
        if (str2 != null) {
            C01s A04 = 1Br.A04(this.fbErrorReporter$delegate);
            String A0W = 0Pz.A0W(LOG_VIEW_CATEGORY, str);
            if (th == null) {
                A04.D0w(A0W, str2, 10);
            } else {
                A04.D0y(A0W, str2, 10, th);
            }
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
        logEvent(str, null);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logEvent(String str, Map map) {
        11T.A0F(str, 0);
        HashMap hashMap = map != null ? new HashMap(map) : AnonymousClass001.A0u();
        1UG A08 = 1BK.A08(1Br.A02(this.logger$delegate), "scp_event");
        if (A08.isSampled()) {
            AbF.A1L(A08, str);
            int ordinal = this.commonFields.featureLevel.ordinal();
            String str2 = "low";
            if (ordinal == 2) {
                str2 = "high";
            } else if (ordinal == 1) {
                str2 = "mid";
            }
            A08.A7R("feature_level", str2);
            A08.A7R("flow_type", this.commonFields.flowType);
            A08.A7R("product", this.commonFields.product);
            A08.A6J("tags", this.commonFields.getTagsMap());
            A08.A7R("session_id", this.commonFields.sessionId);
            A08.A7R(7zK.A00(430), this.commonFields.submissionId);
            hashMap.put("wizard_screen", this.screen);
            A08.A6J("event_specific_fields", hashMap);
            A08.BZL();
        }
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData) {
        11T.A0F(federatedAnalyticsCardData, 0);
        getCardDataLogger().logFederatedAnalyticsCardData(1Fw.A04(getViewerContextManager()), federatedAnalyticsCardData);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerAnnotate(int i, String str, long j) {
        11T.A0F(str, 1);
        7zP.A0e(this.qpl$delegate).markerAnnotate(i, str, j);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerAnnotate(int i, String str, String str2) {
        1BL.A1F(str, str2);
        7zP.A0e(this.qpl$delegate).markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerEnd(int i, boolean z) {
        QuickPerformanceLogger A0e = 7zP.A0e(this.qpl$delegate);
        short s = 3;
        if (z) {
            s = 2;
        }
        A0e.markerEnd(i, s);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void qplMarkerStart(int i) {
        7zP.A0e(this.qpl$delegate).markerStart(i);
        7zP.A0e(this.qpl$delegate).markerAnnotate(i, "product", this.commonFields.product);
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void setCommonFields(CommonLoggingFields commonLoggingFields) {
        11T.A0F(commonLoggingFields, 0);
        this.commonFields = commonLoggingFields;
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLogger
    public void setCurrentScreen(String str) {
        11T.A0F(str, 0);
        this.screen = str;
    }
}
