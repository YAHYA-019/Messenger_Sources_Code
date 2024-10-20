package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.0Cc;
import X.0Pz;
import X.0jV;
import X.0oD;
import X.11T;
import X.1BL;
import X.1Br;
import X.1gS;
import X.AnonymousClass001;
import X.C0fl;
import X.C0g4;
import X.C0g6;
import X.FbP;
import X.HAs;
import X.HAu;
import X.I8T;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: AnalyticsLoggerImpl.class */
public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public AndroidAsyncExecutorFactory mAsyncExecutorFactory;
    public I8T mCameraARAnalyticsLogger;
    public final FbP mCameraARBugReportLogger;
    public final CameraARCrashMetadataLogger mCrashMetadataLogger;
    public HAu mEffectStartIntent;
    public final HAs mOptimizedPerfLoggerOption;
    public String mProductName;

    public AnalyticsLoggerImpl(I8T i8t, FbP fbP) {
        HAs hAs = HAs.A02;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(Executors.newScheduledThreadPool(1));
        this.mAsyncExecutorFactory = androidAsyncExecutorFactory2;
        this.mCameraARAnalyticsLogger = i8t;
        this.mProductName = i8t.A00;
        this.mCameraARBugReportLogger = fbP;
        this.mCrashMetadataLogger = new CameraARCrashMetadataLogger();
        this.mEffectStartIntent = HAu.A01;
        this.mOptimizedPerfLoggerOption = hAs;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, hAs.mCppValue);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public String getEffectStartIntentString() {
        int ordinal = this.mEffectStartIntent.ordinal();
        return ordinal != 1 ? ordinal != 2 ? "unknown" : "system" : PublicKeyCredentialControllerUtility.JSON_KEY_USER;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public String getProductName() {
        return this.mProductName;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public XAnalyticsHolder getXAnalytics() {
        I8T i8t = this.mCameraARAnalyticsLogger;
        if (i8t != null) {
            return ((1gS) 1Br.A0B(i8t.A09)).A03;
        }
        return null;
    }

    public native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i);

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void logForBugReport(String str, String str2) {
        FbP fbP = this.mCameraARBugReportLogger;
        if (fbP != null) {
            11T.A0H(str, str2);
            Map map = fbP.A01;
            String A0j = map.containsKey(str) ? 0Cc.A0j(0Pz.A0j("\n   ", AnonymousClass001.A0b(str, map), "\n   \n   ")) : "";
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append('[');
            A0k.append(timestamp);
            String A0W = 0Pz.A0W(A0j, 1BL.A0u("]: ", str2, A0k));
            11T.A0A(A0W);
            map.put(str, A0W);
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void logRawEvent(String str, String str2) {
        I8T i8t = this.mCameraARAnalyticsLogger;
        if (i8t != null) {
            i8t.A00(str, str2);
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void logSessionEvent(boolean z) {
        0oD r0;
        I8T i8t = this.mCameraARAnalyticsLogger;
        if (i8t != null && !i8t.A06 && (r0 = C0fl.A00) != null) {
            0jV r02 = C0g6.A4v;
            if (z) {
                r0.A01(r02, i8t.A00);
                String str = i8t.A02;
                if (str != null) {
                    0jV r03 = C0g6.A4s;
                    11T.A0D(str);
                    r0.A01(r03, str);
                }
                if (i8t.A03 != null) {
                    0jV A01 = C0g4.A01("CAMERA_CORE_EFFECT_INSTANCE_ID");
                    String str2 = i8t.A03;
                    11T.A0D(str2);
                    r0.A01(A01, str2);
                }
                if (BreakpadManager.isActive()) {
                    BreakpadManager.setCustomData("CAMERA_CORE_PRODUCT_NAME", i8t.A00, new Object[0]);
                    BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_ID", i8t.A02, new Object[0]);
                    BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID", i8t.A03, new Object[0]);
                }
                i8t.A00("camera_ar_session", null);
            } else {
                r0.A00(r02);
                r0.A00(C0g6.A4s);
                r0.A00(C0g4.A01("CAMERA_CORE_EFFECT_INSTANCE_ID"));
                if (BreakpadManager.isActive()) {
                    BreakpadManager.removeCustomData("CAMERA_CORE_PRODUCT_NAME");
                    BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_ID");
                    BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID");
                }
            }
        }
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger == null || z) {
            return;
        }
        cameraARCrashMetadataLogger.cleanupBreakpadData();
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void setBreakpadData(String str, String str2) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null) {
            cameraARCrashMetadataLogger.setBreakpadData(str, str2);
        }
    }
}
