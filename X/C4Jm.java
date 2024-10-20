package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4Jm, reason: invalid class name */
/* loaded from: 4Jm.class */
public final class C4Jm implements C4Jn {
    public static final String A05 = 4IS.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final 4IX A02;
    public final WorkDatabase A03;
    public final C4Jo A04;

    public C4Jm(Context context, 4IX r303, WorkDatabase workDatabase) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C4Jo c4Jo = new C4Jo(context, r303.A02);
        this.A01 = context;
        this.A00 = jobScheduler;
        this.A04 = c4Jo;
        this.A03 = workDatabase;
        this.A02 = r303;
    }

    public static ArrayList A00(JobScheduler jobScheduler, Context context) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            4IS.A00();
            android.util.Log.e(A05, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(list.size());
            ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
            for (JobInfo jobInfo : list) {
                if (componentName.equals(jobInfo.getService())) {
                    arrayList.add(jobInfo);
                }
            }
        }
        return arrayList;
    }

    public static void A01(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            4IS.A00();
            android.util.Log.e(A05, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", AnonymousClass001.A1a(i)), th);
        }
    }

    private void A02(C4Kf c4Kf, int i) {
        JobInfo A00 = this.A04.A00(c4Kf, i);
        4IS A002 = 4IS.A00();
        String str = A05;
        String str2 = c4Kf.A0M;
        A002.A02(str, 0Pz.A0F(i, "Scheduling work ID ", str2, "Job ID "));
        try {
            if (this.A00.schedule(A00) == 0) {
                4IS.A00();
                android.util.Log.w(str, 0Pz.A0W("Unable to schedule work ID ", str2));
                if (c4Kf.A0J && c4Kf.A0G == 0S2.A00) {
                    c4Kf.A0J = false;
                    4IS.A00().A02(str, String.format("Scheduling a non-expedited job (work ID %s)", str2));
                    A02(c4Kf, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList A003 = A00(this.A00, this.A01);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(A003 != null ? A003.size() : 0), Integer.valueOf(this.A03.A0E().B8v().size()), 20);
            4IS.A00();
            android.util.Log.e(str, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            4IS.A00();
            android.util.Log.e(str, AnonymousClass001.A0Z(c4Kf, "Unable to schedule ", AnonymousClass001.A0k()), th);
        }
    }

    @Override // X.C4Jn
    public void ADz(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        ArrayList A00 = A00(jobScheduler, context);
        if (A00 != null) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                            String string = extras.getString("EXTRA_WORK_SPEC_ID");
                            11T.A0F(string, 1);
                            if (str.equals(string)) {
                                arrayList.add(Integer.valueOf(jobInfo.getId()));
                            }
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A01(jobScheduler, ((Number) it2.next()).intValue());
            }
            C4K9 c4k9 = (C4K9) this.A03.A0B();
            C4Il c4Il = c4k9.A00;
            c4Il.A06();
            4KB r0 = c4k9.A02;
            4KS A002 = r0.A00();
            if (str == null) {
                A002.ACC(1);
            } else {
                A002.ACG(1, str);
            }
            c4Il.A07();
            try {
                A002.ARM();
                c4Il.A08();
            } finally {
                C4Il.A01(c4Il);
                r0.A02(A002);
            }
        }
    }

    @Override // X.C4Jn
    public boolean BN9() {
        return true;
    }

    @Override // X.C4Jn
    public void Cje(C4Kf... c4KfArr) {
        int intValue;
        WorkDatabase workDatabase = this.A03;
        C4Kg c4Kg = new C4Kg(workDatabase);
        int length = c4KfArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            C4Kf c4Kf = c4KfArr[i2];
            workDatabase.A07();
            try {
                4JS A0E = workDatabase.A0E();
                String str = c4Kf.A0M;
                C4Kf BKy = A0E.BKy(str);
                if (BKy == null) {
                    4IS.A00();
                    android.util.Log.w(A05, 0Pz.A0j("Skipping scheduling ", str, " because it's no longer in the DB"));
                } else if (BKy.A0E != C4Kb.ENQUEUED) {
                    4IS.A00();
                    android.util.Log.w(A05, 0Pz.A0j("Skipping scheduling ", str, " because it is no longer enqueued"));
                } else {
                    C4Ki A00 = C4Kh.A00(c4Kf);
                    C4Kj BE5 = workDatabase.A0B().BE5(A00);
                    if (BE5 != null) {
                        intValue = BE5.A01;
                    } else {
                        Object A04 = c4Kg.A00.A04(new LtV(c4Kg, 0));
                        11T.A0A(A04);
                        intValue = ((Number) A04).intValue();
                        workDatabase.A0B().BPi(new C4Kj(A00.A01, A00.A00, intValue));
                    }
                    A02(c4Kf, intValue);
                }
                workDatabase.A08();
                C4Il.A01(workDatabase);
                i = i2 + 1;
            } catch (Throwable th) {
                C4Il.A01(workDatabase);
                throw th;
            }
        }
    }
}
