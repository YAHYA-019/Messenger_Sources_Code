package com.facebook.analytics2.logger.legacy.uploader;

import X.0FI;
import X.0eC;
import X.0fH;
import X.49O;
import X.4EL;
import X.C01w;
import X.C08o;
import X.C0k4;
import X.C1lR;
import X.C49m;
import X.C5ej;
import X.JQw;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;
import com.facebook.common.build.BuildConstants;

/* loaded from: LollipopUploadService.class */
public class LollipopUploadService extends JobService {
    public 49O A00;

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1518969629);
        int A04 = 0FI.A04(1318666777);
        ConditionVariable conditionVariable = 0eC.A00;
        this.A00 = 49O.A00(this);
        0FI.A0A(1169257248, A04);
        C08o.A02(-774739361, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(-2137746405);
        super.onDestroy();
        this.A00 = null;
        0FI.A0A(1150396897, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, -2051245152);
        int A04 = 0FI.A04(948061333);
        49O r0 = this.A00;
        C0k4.A00(r0);
        int A03 = r0.A03(intent, new C5ej(this, i2), 0);
        0FI.A0A(-468707303, A04);
        C08o.A03(-1833833334, A01);
        return A03;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            0fH.A0k("PostLolliopUploadService", JQw.A00(51));
        } else {
            try {
                int i = extras.getInt("__VERSION_CODE", 0);
                if (BuildConstants.A01() != i) {
                    0fH.A0h(Integer.valueOf(i), "PostLolliopUploadService", "Job with old build ID: %d, cancelling job");
                } else {
                    z = true;
                }
            } catch (Exception e) {
                0fH.A0s("PostLolliopUploadService", JQw.A00(ActionId.FILE_SYSTEM_FAIL), e);
            }
        }
        if (!z) {
            0fH.A0h(Integer.valueOf(jobParameters.getJobId()), "PostLolliopUploadService", "Stale job parameters, cancelling jobId: %d");
            return false;
        }
        ConditionVariable conditionVariable = 0eC.A00;
        try {
            49O r0 = this.A00;
            C0k4.A00(r0);
            r0.A06(new C1lR(new Bundle(jobParameters.getExtras())), new C49m(jobParameters, this) { // from class: X.49l
                public final JobParameters A00;
                public final /* synthetic */ LollipopUploadService A01;

                {
                    this.A01 = this;
                    this.A00 = jobParameters;
                }

                @Override // X.C49m
                public void CUy(boolean z2) {
                    JobParameters jobParameters2 = this.A00;
                    0fH.A0d(Integer.valueOf(jobParameters2.getJobId()), Boolean.valueOf(z2), "PostLolliopUploadService", "onVoluntaryCompletion callback fired for jobId: %d needsReschedule: %s");
                    this.A01.jobFinished(jobParameters2, z2);
                }
            }, jobParameters.getExtras().getString("action"), jobParameters.getJobId(), 0);
            return true;
        } catch (4EL e2) {
            0fH.A0u("PostLolliopUploadService", JQw.A00(177), e2);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        49O r0 = this.A00;
        if (r0 == null) {
            return true;
        }
        r0.A04(jobParameters.getJobId());
        return true;
    }
}
