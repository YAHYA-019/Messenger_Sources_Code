package com.facebook.papaya.fb.messenger;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Hz;
import X.4YT;
import X.82O;
import X.AbG;
import X.C00i;
import X.C5gz;
import X.C5h1;
import X.C5h8;
import X.JR1;
import X.JR2;
import X.KX4;
import X.KzV;
import android.content.Context;
import android.os.Bundle;
import androidx.work.WorkerParameters;
import com.facebook.acra.constants.ActionId;
import com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.fb.client.executor.analytics.mldwfalco.AnalyticsMldwFalcoExecutorFactory;
import com.facebook.papaya.fb.client.transport.FBTransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: MessengerPapayaFederatedAnalyticsWorker.class */
public class MessengerPapayaFederatedAnalyticsWorker extends FederatedAnalyticsWorker {
    public static final String LIGHTWEIGHT_ENGINE_QPL_ANNOTATION = "lightweight";
    public static final String POPULATION_NAME = "m4a";
    public static final String TAG = "MessengerPapayaFederatedAnalyticsWorker";
    public 1BY _UL_mInjectionContext;
    public final C00i mICask;
    public final C00i mMessengerPapayaSharedPreference;
    public final C00i mMobileConfig;
    public final C5h1 mPigeonLogger;
    public final C5gz mQPLLogger;
    public final C00i mScheduledExecutorService;

    public MessengerPapayaFederatedAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.mMobileConfig = 1BQ.A00();
        this.mScheduledExecutorService = 1BQ.A02(16465);
        this.mICask = 1BQ.A02(98404);
        this.mMessengerPapayaSharedPreference = 1BQ.A02(131135);
        82O r0 = (82O) 1Bn.A0A(1088);
        82O r02 = (82O) 1Bn.A0A(1089);
        this.mQPLLogger = r0.A0R("m4a_lightweight");
        this.mPigeonLogger = r02.A0S("m4a_lightweight");
    }

    private AnalyticsMldwFalcoExecutorFactory getAnalyticsMldwFalcoExecutorFactory() {
        try {
            Bundle A05 = 1BK.A05();
            A05.putString("mldw_store_path", 0Pz.A0W(JR1.A0v(this.mICask), "/falco.db"));
            A05.putBoolean("enforce_secure_aggregation", false);
            KX4 kx4 = AnalyticsMldwFalcoExecutorFactory.Companion;
            return new AnalyticsMldwFalcoExecutorFactory(this.mAppContext, A05);
        } catch (IOException e) {
            0fH.A0r(TAG, "Failed to create mldw store path", e);
            return null;
        }
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public ImmutableSet getClientTags() {
        return new 1Hz().A07();
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public ImmutableMap getExecutorFactories() {
        ImmutableMap.Builder A0c = 1BK.A0c();
        AnalyticsMldwFalcoExecutorFactory analyticsMldwFalcoExecutorFactory = getAnalyticsMldwFalcoExecutorFactory();
        if (analyticsMldwFalcoExecutorFactory != null) {
            A0c.put(1BK.A0N(this.mMobileConfig).BCy(36880703785600005L), analyticsMldwFalcoExecutorFactory);
        }
        return A0c.build();
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public String getLocalDataDirectoryPath() {
        try {
            return JR1.A0v(this.mICask);
        } catch (IOException e) {
            throw 1BK.A0s("Failed to create local data directory", e);
        }
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public ImmutableMap getLogSinks() {
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put("papaya_m4a_pigeon_logger", this.mPigeonLogger);
        return AbG.A10(A0c, "papaya_m4a_qpl_logger", this.mQPLLogger);
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public IModelLoader getModelLoader() {
        return null;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public String getPopulationName() {
        return "m4a";
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public ScheduledExecutorService getScheduledExecutorService() {
        return (ScheduledExecutorService) this.mScheduledExecutorService.get();
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public String getSharedDataDirectoryPath() {
        try {
            return JR1.A0v(this.mICask);
        } catch (IOException e) {
            throw 1BK.A0s("Failed to create shared data directory", e);
        }
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public KzV getSharedPreferences() {
        return (KzV) this.mMessengerPapayaSharedPreference.get();
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public ITransport getTransport() {
        Bundle A0L = JR2.A0L(this);
        A0L.putInt("acs_config", C5h8.A00(1BK.A0N(this.mMobileConfig).AZk(2342160763044769578L) ? 1BK.A0N(this.mMobileConfig).AZk(2342160763044835115L) ? 0S2.A0C : 0S2.A01 : 0S2.A00));
        A0L.putBoolean("singleton_http_client", false);
        A0L.getString(4YT.A00(ActionId.RTMP_CONNECTION_RELEASE), "");
        return new FBTransport(this.mAppContext, A0L);
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public boolean isFederatedAnalyticsEnabled() {
        return 1BK.A0N(this.mMobileConfig).AZk(36317753832386353L);
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public void onWorkComplete(boolean z, Throwable th) {
        C5gz c5gz = this.mQPLLogger;
        if (z) {
            c5gz.A01();
        } else {
            th.getClass();
            c5gz.A04(th);
        }
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public void onWorkStart() {
        this.mQPLLogger.A02();
        this.mQPLLogger.A03("engine", LIGHTWEIGHT_ENGINE_QPL_ANNOTATION);
    }
}
