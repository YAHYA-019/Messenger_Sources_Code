package com.facebook.voltron.download.scheduledinstaller;

import X.01V;
import X.0FI;
import X.0Q8;
import X.0QD;
import X.0fH;
import X.11T;
import X.1Fe;
import X.AnonymousClass001;
import X.AnonymousClass036;
import X.C02r;
import X.C08o;
import X.L7w;
import X.Lo2;
import X.QQa;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: OxygenScheduledInstallerJobService.class */
public final class OxygenScheduledInstallerJobService extends JobService {
    public static final L7w A05 = new Object();
    public HandlerThread A00;
    public 1Fe A01;
    public QQa A02;
    public ExecutorService A03;
    public ExecutorService A04;

    public static final List A00(1Fe r301, OxygenScheduledInstallerJobService oxygenScheduledInstallerJobService) {
        Set keySet = r301.A00("AppModules::ScheduledInstallRequestTimestamp").getAll().keySet();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (AnonymousClass036.A00(str) != -1 && !C02r.A01(oxygenScheduledInstallerJobService, str)) {
                A0s.add(obj);
            }
        }
        return 0QD.A0V(A0s);
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, -746841003);
        int A04 = 0FI.A04(-494773045);
        super.onCreate();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        11T.A0A(newSingleThreadExecutor);
        this.A04 = newSingleThreadExecutor;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        11T.A0A(newSingleThreadExecutor2);
        this.A03 = newSingleThreadExecutor2;
        this.A01 = new 01V(this).A00();
        0FI.A0A(-1667323479, A04);
        C08o.A02(3097609, A00);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        11T.A0F(jobParameters, 0);
        0fH.A0j("OxygenScheduledInstallerJobService", "Starting OxygenScheduledInstallerJobService...");
        ExecutorService executorService = this.A04;
        if (executorService == null) {
            11T.A0L("executorService");
            throw 0Q8.createAndThrow();
        }
        executorService.execute(new Lo2(jobParameters, this));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        1Fe r0 = this.A01;
        if (r0 == null) {
            11T.A0L("lightSharedPreferencesFactory");
            throw 0Q8.createAndThrow();
        }
        if (!A00(r0, this).isEmpty()) {
            return true;
        }
        0fH.A0j("OxygenScheduledInstallerJobService", "No missing modules to install, do not retry job");
        return false;
    }
}
