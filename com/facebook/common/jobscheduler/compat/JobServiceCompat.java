package com.facebook.common.jobscheduler.compat;

import X.0FI;
import X.0fH;
import X.0jH;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.49R;
import X.4CM;
import X.4PX;
import X.4PZ;
import X.AnonymousClass001;
import X.C08o;
import X.C2490Gel;
import X.C2491Gem;
import X.C3278Jor;
import X.C3279Jox;
import X.C49d;
import X.C49f;
import X.C49i;
import X.C4PY;
import X.JQw;
import X.JRL;
import X.JRU;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.bugreporter.core.scheduler.LollipopBugReportService;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.errorreporting.memory.service.jobschedulercompat.fbsvc.DumperUploadService;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;
import com.facebook.conditionalworker.LollipopConditionalWorkerService;
import com.facebook.graphql.executor.offlinemutations.OfflineMutationsRetryJobService;
import com.facebook.memory.fbmemorymanager.FBMemoryManager;
import com.facebook.profilo.upload.TraceUploadRetryJob;
import com.facebook.push.adm.AdmWorkLollipopService;
import com.facebook.push.fcm.GetFcmTokenRegistrarLollipopService;
import com.facebook.push.registration.FacebookPushServerFinishNotifiedLollipopService;
import com.facebook.push.registration.FacebookPushServerRegistrarLollipopService;
import com.facebook.push.registration.PushNegativeFeedbackLollipopService;
import com.facebook.pushlite.PushLiteLollipopJobService;

/* loaded from: JobServiceCompat.class */
public abstract class JobServiceCompat extends JobService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [X.49d] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.49d] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Gem] */
    private C49d A00() {
        Object obj;
        JRU jru;
        C49d c49d;
        if (this instanceof FacebookPushServerFinishNotifiedLollipopService) {
            FacebookPushServerFinishNotifiedLollipopService facebookPushServerFinishNotifiedLollipopService = (FacebookPushServerFinishNotifiedLollipopService) this;
            synchronized (this) {
                C49d c49d2 = facebookPushServerFinishNotifiedLollipopService.A00;
                c49d = c49d2;
                if (c49d2 == null) {
                    C49i c49i = (C49i) 1Bi.A03(32925);
                    facebookPushServerFinishNotifiedLollipopService.A00 = c49i;
                    c49d = c49i;
                }
            }
            return c49d;
        }
        if (this instanceof DumperUploadService) {
            final DumperUploadService dumperUploadService = (DumperUploadService) this;
            FBMemoryManager fBMemoryManager = (FBMemoryManager) 1Bn.A0A(32988);
            if (0jH.A0B == null) {
                synchronized (FBMemoryManager.class) {
                    FBMemoryManager.A0J = true;
                }
                return new C49d() { // from class: X.4PW
                };
            }
            fBMemoryManager.A01();
            obj = new Object();
        } else {
            if (!(this instanceof LollipopConditionalWorkerService)) {
                if (this instanceof PushNegativeFeedbackLollipopService) {
                    PushNegativeFeedbackLollipopService pushNegativeFeedbackLollipopService = (PushNegativeFeedbackLollipopService) this;
                    synchronized (this) {
                        jru = pushNegativeFeedbackLollipopService.A00;
                        if (jru == null) {
                            jru = (JRU) 1Bi.A03(131220);
                            pushNegativeFeedbackLollipopService.A00 = jru;
                        }
                    }
                    return jru;
                }
                if (this instanceof GetFcmTokenRegistrarLollipopService) {
                    GetFcmTokenRegistrarLollipopService getFcmTokenRegistrarLollipopService = (GetFcmTokenRegistrarLollipopService) this;
                    synchronized (this) {
                        C49d c49d3 = getFcmTokenRegistrarLollipopService.A00;
                        C49d c49d4 = c49d3;
                        if (c49d3 == null) {
                            C4PY c4py = (C4PY) 1Bi.A03(131225);
                            getFcmTokenRegistrarLollipopService.A00 = c4py;
                            c49d4 = c4py;
                        }
                        11T.A0D(c49d4);
                        c49d = c49d4;
                    }
                } else {
                    if (this instanceof PushLiteLollipopJobService) {
                        return C3278Jor.A03;
                    }
                    if (this instanceof TraceUploadRetryJob) {
                        return new 4PX((TraceUploadRetryJob) this);
                    }
                    if (this instanceof FacebookPushServerRegistrarLollipopService) {
                        FacebookPushServerRegistrarLollipopService facebookPushServerRegistrarLollipopService = (FacebookPushServerRegistrarLollipopService) this;
                        synchronized (this) {
                            jru = facebookPushServerRegistrarLollipopService.A00;
                            if (jru == null) {
                                jru = (4PZ) 1Bi.A03(131217);
                                facebookPushServerRegistrarLollipopService.A00 = jru;
                            }
                        }
                    } else if (this instanceof AdmWorkLollipopService) {
                        AdmWorkLollipopService admWorkLollipopService = (AdmWorkLollipopService) this;
                        synchronized (this) {
                            jru = admWorkLollipopService.A00;
                            if (jru == null) {
                                jru = (C3279Jox) 1Bi.A03(131215);
                                admWorkLollipopService.A00 = jru;
                            }
                        }
                    } else if (this instanceof OfflineMutationsRetryJobService) {
                        OfflineMutationsRetryJobService offlineMutationsRetryJobService = (OfflineMutationsRetryJobService) this;
                        synchronized (this) {
                            jru = offlineMutationsRetryJobService.A00;
                            if (jru == null) {
                                jru = (C2490Gel) 1Bi.A03(115952);
                                offlineMutationsRetryJobService.A00 = jru;
                            }
                        }
                    } else {
                        LollipopBugReportService lollipopBugReportService = (LollipopBugReportService) this;
                        obj = lollipopBugReportService.A00;
                        if (obj == null) {
                            obj = (C2491Gem) 1Bi.A03(114713);
                        }
                        if (lollipopBugReportService.A00 == null) {
                            lollipopBugReportService.A00 = obj;
                            return obj;
                        }
                    }
                }
                return jru;
            }
            LollipopConditionalWorkerService lollipopConditionalWorkerService = (LollipopConditionalWorkerService) this;
            obj = lollipopConditionalWorkerService.A00;
            if (obj == null) {
                JRL jrl = (JRL) 1Bi.A03(131227);
                lollipopConditionalWorkerService.A00 = jrl;
                return jrl;
            }
        }
        return obj;
        return c49d;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, -1247149497);
        int A04 = 0FI.A04(925118995);
        A00();
        0FI.A0A(901688396, A04);
        C08o.A03(2098813214, A01);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            0fH.A0k("JobServiceCompat", JQw.A00(51));
        } else {
            int i = extras.getInt("__VERSION_CODE", 0);
            if (BuildConstants.A01() != i) {
                0fH.A0h(Integer.valueOf(i), "JobServiceCompat", "Job with old build ID: %d, cancelling job");
            } else {
                z = true;
            }
        }
        boolean z2 = false;
        if (z) {
            int jobId = jobParameters.getJobId();
            try {
            } catch (RuntimeException unused) {
                0fH.A14("JobServiceCompat", "Runtime error getting service info, cancelling: %d", AnonymousClass001.A1a(jobId));
            }
            if (!49R.A00(this, 0).A01(getClass(), jobId)) {
                0fH.A0h(Integer.valueOf(jobId), "JobServiceCompat", "Invalid JS jobId, cancelling: %d");
                ((JobScheduler) getSystemService("jobscheduler")).cancel(jobParameters.getJobId());
                return false;
            }
            z2 = A00().A02(new Bundle(jobParameters.getExtras()), new C49f(jobParameters, this, this) { // from class: X.49e
                public final JobParameters A00;
                public final Context A01;
                public final /* synthetic */ JobServiceCompat A02;

                {
                    this.A02 = this;
                    this.A00 = jobParameters;
                    this.A01 = this;
                }

                @Override // X.C49f
                public void C2v(boolean z3) {
                    JobServiceCompat jobServiceCompat = this.A02;
                    JobParameters jobParameters2 = this.A00;
                    jobServiceCompat.jobFinished(jobParameters2, z3);
                    if (z3) {
                        return;
                    }
                    4CM A00 = 4CM.A00(this.A01);
                    synchronized (A00) {
                        A00.A00.put(jobParameters2.getJobId(), false);
                    }
                }
            }, jobParameters.getJobId());
            if (!z2) {
                4CM A00 = 4CM.A00(this);
                synchronized (A00) {
                    A00.A00.put(jobParameters.getJobId(), false);
                }
                return z2;
            }
        } else {
            0fH.A0h(Integer.valueOf(jobParameters.getJobId()), "JobServiceCompat", "Stale job parameters, cancelling jobId: %d");
        }
        return z2;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean A01 = A00().A01(jobParameters.getJobId());
        if (A01) {
            return A01;
        }
        4CM A00 = 4CM.A00(this);
        synchronized (A00) {
            A00.A00.put(jobParameters.getJobId(), false);
        }
        return A01;
    }
}
