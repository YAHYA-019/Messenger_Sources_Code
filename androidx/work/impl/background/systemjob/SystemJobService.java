package androidx.work.impl.background.systemjob;

import X.0FI;
import X.0Pz;
import X.11T;
import X.4IR;
import X.4IS;
import X.4IT;
import X.4IU;
import X.C01w;
import X.C08o;
import X.C4Ji;
import X.C4Jq;
import X.C4Jr;
import X.C4Ki;
import X.C4Kl;
import X.C4Km;
import X.C4Kn;
import X.C4S6;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: SystemJobService.class */
public class SystemJobService extends JobService implements 4IR {
    public static final String A04 = 4IS.A01("SystemJobService");
    public C4Jr A00;
    public 4IU A01;
    public final Map A03 = new HashMap();
    public final 4IT A02 = new 4IT();

    public void Bwy(C4Ki c4Ki, boolean z) {
        JobParameters jobParameters;
        4IS.A00().A02(A04, 0Pz.A0W(c4Ki.A01, " executed on JobScheduler"));
        Map map = this.A03;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(c4Ki);
        }
        this.A02.A00(c4Ki);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 314533705);
        int A042 = 0FI.A04(798936809);
        super.onCreate();
        try {
            4IU A002 = 4IU.A00(getApplicationContext());
            this.A01 = A002;
            C4Ji c4Ji = A002.A03;
            this.A00 = new C4Jq(c4Ji, A002.A06);
            c4Ji.A02(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                0FI.A0A(-1228448829, A042);
                C08o.A02(-1210785322, A00);
                throw illegalStateException;
            }
            4IS.A00();
            Log.w(A04, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
        0FI.A0A(1192924338, A042);
        C08o.A02(509370196, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A042 = 0FI.A04(-1556002774);
        super.onDestroy();
        4IU r0 = this.A01;
        if (r0 != null) {
            r0.A03.A03(this);
        }
        0FI.A0A(2143181020, A042);
        C01w.A00(this);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.A01 == null) {
            4IS.A00().A02(A04, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C4Ki c4Ki = new C4Ki(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                Map map = this.A03;
                synchronized (map) {
                    if (map.containsKey(c4Ki)) {
                        4IS A00 = 4IS.A00();
                        String str = A04;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Job is already being executed by SystemJobService: ");
                        sb.append(c4Ki);
                        A00.A02(str, sb.toString());
                        return false;
                    }
                    4IS A002 = 4IS.A00();
                    String str2 = A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onStartJob for ");
                    sb2.append(c4Ki);
                    A002.A02(str2, sb2.toString());
                    map.put(c4Ki, jobParameters);
                    C4Kl c4Kl = new C4Kl();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        c4Kl.A02 = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        c4Kl.A01 = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    c4Kl.A00 = jobParameters.getNetwork();
                    C4Jr c4Jr = this.A00;
                    C4Km A01 = this.A02.A01(c4Ki);
                    C4Jq c4Jq = (C4Jq) c4Jr;
                    11T.A0F(A01, 0);
                    c4Jq.A01.ARK(new C4Kn(c4Kl, c4Jq.A00, A01));
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        4IS.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.A01 == null) {
            4IS.A00().A02(A04, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C4Ki c4Ki = new C4Ki(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                4IS A00 = 4IS.A00();
                String str = A04;
                StringBuilder sb = new StringBuilder();
                sb.append("onStopJob for ");
                sb.append(c4Ki);
                A00.A02(str, sb.toString());
                Map map = this.A03;
                synchronized (map) {
                    map.remove(c4Ki);
                }
                C4Km A002 = this.A02.A00(c4Ki);
                if (A002 != null) {
                    this.A00.D31(A002, Build.VERSION.SDK_INT >= 31 ? C4S6.A00(jobParameters) : -512);
                }
                C4Ji c4Ji = this.A01.A03;
                String str2 = c4Ki.A01;
                synchronized (c4Ji.A09) {
                    contains = c4Ji.A07.contains(str2);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        4IS.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }
}
