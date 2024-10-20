package com.facebook.papaya.client.engine.lightweight;

import X.0fH;
import X.11T;
import X.1BL;
import X.1G2;
import X.1G3;
import X.1Hz;
import X.1Ql;
import X.4IU;
import X.5hH;
import X.AbM;
import X.AnonymousClass001;
import X.C00i;
import X.C4Kq;
import X.C4Kr;
import X.C4P3;
import X.JR1;
import X.KX2;
import X.KX3;
import X.KzV;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.fb.messenger.MessengerPapayaFederatedAnalyticsWorker;
import com.facebook.papaya.log.Log;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: FederatedAnalyticsWorker.class */
public abstract class FederatedAnalyticsWorker extends Worker {
    public static final long DEFAULT_FREQUENCY_IN_HOURS = 0;
    public static final String FEDERATED_ANALYTICS_JOB_FREQUENCY_KEY = "background_job_frequency";
    public static final String FEDERATED_ANALYTICS_JOB_SCHEDULED_KEY = "background_job_scheduled";
    public static final String TAG = "FederatedAnalyticsWorker";
    public static final String WORK_NAME = "federated_analytics_background_work";
    public static final KX3 Companion = new Object();
    public static final Object LOCK = AnonymousClass001.A0R();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FederatedAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
    }

    private final void addLogSinks(ImmutableMap immutableMap) {
        if (immutableMap != null) {
            Iterator A14 = AbM.A14(immutableMap);
            while (A14.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A14);
                String A0j = AnonymousClass001.A0j(A0z);
                5hH r0 = 5hH.A04;
                Log.nativeAddLogSink(A0j, r0.value, (LogSink) A0z.getValue());
            }
        }
    }

    private final void cancelWork() {
        synchronized (LOCK) {
            4IU.A00(this.mAppContext).A03(WORK_NAME);
            C00i c00i = getSharedPreferences().A00;
            1Ql A0V = 1BL.A0V(c00i);
            1G2 r0 = KzV.A01;
            1Ql.A01(A0V, 1G3.A01(r0, "background_job_scheduled"), false);
            1Ql A0V2 = 1BL.A0V(c00i);
            A0V2.CaH(1G3.A01(r0, "background_job_frequency"), 0L);
            A0V2.commit();
            0fH.A0j(TAG, "Cancelled Federated Analytics background worker");
        }
    }

    private final void removeLogSinks(ImmutableMap immutableMap) {
        if (immutableMap != null) {
            Iterator A14 = AbM.A14(immutableMap);
            while (A14.hasNext()) {
                Log.nativeRemoveLogSink((String) JR1.A0r(A14));
            }
        }
    }

    @Override // androidx.work.Worker
    public C4Kr doWork() {
        0fH.A0j(TAG, "Start to run Federated Analytics");
        onWorkStart();
        if (isFederatedAnalyticsEnabled()) {
            ImmutableMap logSinks = getLogSinks();
            try {
                addLogSinks(logSinks);
                KX2 kx2 = Engine.Companion;
                ScheduledExecutorService scheduledExecutorService = getScheduledExecutorService();
                ImmutableMap executorFactories = getExecutorFactories();
                ITransport transport = getTransport();
                Context context = this.mAppContext;
                11T.A0A(context);
                new Engine(scheduledExecutorService, "m4a", executorFactories, transport, context, getLocalDataDirectoryPath(), getSharedDataDirectoryPath(), null, new 1Hz().A07()).run().get();
                removeLogSinks(logSinks);
                ((MessengerPapayaFederatedAnalyticsWorker) this).mQPLLogger.A01();
                0fH.A0j(TAG, "Finished running Federated Analytics successfully");
            } catch (Exception e) {
                removeLogSinks(logSinks);
                ((MessengerPapayaFederatedAnalyticsWorker) this).mQPLLogger.A04(e);
                0fH.A0r(TAG, "Failed to run Federated Analytics background worker", e);
                return new C4Kq();
            }
        } else {
            0fH.A0j(TAG, "Federated Analytics is disabled");
            cancelWork();
            ((MessengerPapayaFederatedAnalyticsWorker) this).mQPLLogger.A01();
        }
        return new C4P3();
    }

    public abstract ImmutableSet getClientTags();

    public abstract ImmutableMap getExecutorFactories();

    public abstract String getLocalDataDirectoryPath();

    public abstract ImmutableMap getLogSinks();

    public abstract IModelLoader getModelLoader();

    public abstract String getPopulationName();

    public abstract ScheduledExecutorService getScheduledExecutorService();

    public abstract String getSharedDataDirectoryPath();

    public abstract KzV getSharedPreferences();

    public abstract ITransport getTransport();

    public abstract boolean isFederatedAnalyticsEnabled();

    public abstract void onWorkComplete(boolean z, Throwable th);

    public abstract void onWorkStart();
}
