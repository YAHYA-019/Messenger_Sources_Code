package com.facebook.analytics2.logger.legacy.uploader;

import X.0eC;
import X.0fH;
import X.49O;
import X.4EL;
import X.C0k4;
import X.C0ob;
import X.C0oc;
import X.C1lR;
import X.C5ej;
import X.LTE;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;

/* loaded from: LollipopUploadServiceDelegate.class */
public class LollipopUploadServiceDelegate extends C0oc {
    public static boolean A01;
    public 49O A00;

    public LollipopUploadServiceDelegate(C0ob c0ob) {
        super(c0ob);
    }

    @Override // X.C0oc
    public int A00(Intent intent, int i, int i2) {
        ConditionVariable conditionVariable = 0eC.A00;
        49O r0 = this.A00;
        C0k4.A00(r0);
        return r0.A03(intent, new C5ej(this.A02, i2), 0);
    }

    @Override // X.C0oc
    public void A01() {
        super.A01();
        this.A00 = null;
    }

    @Override // X.C0oc
    public void A02() {
        ConditionVariable conditionVariable = 0eC.A00;
        this.A00 = 49O.A00(this.A02);
    }

    @Override // X.C0oc
    public boolean A03(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            0fH.A0k("LollipopUploadServiceDel", "Job with no build ID, cancelling job");
        } else {
            try {
                int i = extras.getInt("__VERSION_CODE", 0);
                if (BuildConstants.A01() != i) {
                    0fH.A0h(Integer.valueOf(i), "LollipopUploadServiceDel", "Job with old build ID: %d, cancelling job");
                } else {
                    z = true;
                }
            } catch (Exception e) {
                0fH.A0s("LollipopUploadServiceDel", "Corrupt bundle, cancelling job", e);
            }
        }
        if (!z) {
            0fH.A0h(Integer.valueOf(jobParameters.getJobId()), "LollipopUploadServiceDel", "Stale job parameters, cancelling jobId: %d");
            return false;
        }
        ConditionVariable conditionVariable = 0eC.A00;
        try {
            49O r0 = this.A00;
            C0k4.A00(r0);
            A01 = r0.A06(new C1lR(new Bundle(jobParameters.getExtras())), new LTE(jobParameters, this), jobParameters.getExtras().getString("action"), jobParameters.getJobId(), 0);
            return true;
        } catch (4EL e2) {
            0fH.A0u("LollipopUploadServiceDel", "Misunderstood job service extras: %s", e2);
            return false;
        }
    }

    @Override // X.C0oc
    public boolean A04(JobParameters jobParameters) {
        49O r0 = this.A00;
        if (r0 == null) {
            return true;
        }
        r0.A04(jobParameters.getJobId());
        return true;
    }
}
