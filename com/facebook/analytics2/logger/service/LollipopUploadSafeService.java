package com.facebook.analytics2.logger.service;

import X.0FI;
import X.0fH;
import X.49O;
import X.4EL;
import X.C01w;
import X.C08o;
import X.C0k4;
import X.C1lR;
import X.C5ej;
import X.LTF;
import X.MC3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;
import com.facebook.common.build.BuildConstants;

/* loaded from: LollipopUploadSafeService.class */
public class LollipopUploadSafeService extends JobService implements MC3 {
    public LollipopUpload A00;

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, -1174714972);
        int A04 = 0FI.A04(-1140422133);
        try {
            LollipopUpload lollipopUpload = (LollipopUpload) Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUpload").newInstance();
            this.A00 = lollipopUpload;
            lollipopUpload.A00 = 49O.A00(this);
        } catch (Exception e) {
            0fH.A12("LollipopUploadSafeService", "LollipopUpload failed to be created, className %s", e, new Object[]{"com.facebook.analytics2.logger.legacy.uploader.LollipopUpload"});
        }
        0FI.A0A(-2064716903, A04);
        C08o.A02(1878151090, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(2115989313);
        super.onDestroy();
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null) {
            lollipopUpload.A00 = null;
        }
        this.A00 = null;
        0FI.A0A(-1362703904, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A03;
        int i3;
        int A01 = C08o.A01(this, -1465034373);
        int A04 = 0FI.A04(-2147350927);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            A03 = 1;
            0FI.A0A(-742844753, A04);
            i3 = 133377669;
        } else {
            49O r0 = lollipopUpload.A00;
            C0k4.A00(r0);
            A03 = r0.A03(intent, new C5ej(this, i2), 0);
            0FI.A0A(-193123129, A04);
            i3 = 861333969;
        }
        C08o.A03(i3, A01);
        return A03;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            0fH.A0k("PostLolliopUploadService", "Job with no build ID, cancelling job");
        } else {
            try {
                int i = extras.getInt("__VERSION_CODE", 0);
                if (BuildConstants.A01() != i) {
                    0fH.A0h(Integer.valueOf(i), "PostLolliopUploadService", "Job with old build ID: %d, cancelling job");
                } else {
                    z = true;
                }
            } catch (Exception e) {
                0fH.A0s("PostLolliopUploadService", "Corrupt bundle, cancelling job", e);
            }
        }
        if (!z) {
            0fH.A0h(Integer.valueOf(jobParameters.getJobId()), "PostLolliopUploadService", "Stale job parameters, cancelling jobId: %d");
            return false;
        }
        try {
            49O r0 = lollipopUpload.A00;
            C0k4.A00(r0);
            r0.A06(new C1lR(new Bundle(jobParameters.getExtras())), new LTF(jobParameters, lollipopUpload, this), jobParameters.getExtras().getString("action"), jobParameters.getJobId(), 0);
            return true;
        } catch (4EL e2) {
            0fH.A0u("PostLolliopUploadService", "Misunderstood job service extras: %s", e2);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        49O r0;
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null || (r0 = lollipopUpload.A00) == null) {
            return true;
        }
        r0.A04(jobParameters.getJobId());
        return true;
    }
}
