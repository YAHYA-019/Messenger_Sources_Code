package X;

import com.facebook.common.appjobs.ondemand.AppJobsListenableWorker;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: In5.class */
public final class In5 implements 2eF {
    public final int A00;
    public final Object A01;

    public In5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Long A0f;
        switch (this.A00) {
            case 0:
                AppJobsListenableWorker appJobsListenableWorker = (AppJobsListenableWorker) this.A01;
                Object obj2 = appJobsListenableWorker.mWorkerParams.A02.A00.get(4YT.A00(977));
                int A03 = obj2 instanceof Integer ? AnonymousClass001.A03(obj2) : 0;
                if (A03 == 0) {
                    0fH.A0k("AppJobsListenableWorker", "No jobId was given to WorkManager");
                } else {
                    C00i c00i = appJobsListenableWorker.A01;
                    Runnable A00 = ((5GF) c00i.get()).A00(A03);
                    if (A00 != null) {
                        1wH r0 = new 1wH();
                        ((1wJ) r0).A02 = Integer.valueOf(A03);
                        ((1wJ) r0).A03 = StringFormatUtil.formatStrLocaleSafe(((5GF) c00i.get()).A01(A03), new Object[0]);
                        r0.A00(((5GF) c00i.get()).A02(A03));
                        r0.A00 = A00;
                        1wM A01 = r0.A01();
                        0fH.A0g(Integer.valueOf(((1wN) A01).A00), "AppJobsListenableWorker", "Starting work with WorkManager. JobID: %d");
                        return 2FP.A01(new Imb(appJobsListenableWorker, 1), C1vh.A00((C1vh) appJobsListenableWorker.A00.get(), A01, true));
                    }
                    0fH.A14("AppJobsListenableWorker", "No runnable resolved for job: %d", AnonymousClass001.A1a(A03));
                }
                1FV A0j = 4YU.A0j();
                A0j.set(new C4Kq());
                return A0j;
            case 1:
                return (ListenableFuture) obj;
            case 2:
                String str = (String) obj;
                long longValue = (str == null || (A0f = 0CW.A0f(str)) == null) ? -1 : A0f.longValue();
                77H r02 = (77H) this.A01;
                1FV A0j2 = 4YU.A0j();
                ((6CT) 1Br.A0B(r02.A03)).A01(new Iay(2, longValue, null, A0j2, r02));
                return A0j2;
            default:
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return null;
                }
                Euz euz = ((FoR) this.A01).A09;
                ImmutableList immutableList = euz.A04;
                if (immutableList.isEmpty()) {
                    return new 1hM(new Elq(ELQ.A04, euz.A00, euz.A01));
                }
                2eH A0A = ((Ezy) 1BK.A0r(immutableList)).A0A("SEND");
                int i = 1;
                while (true) {
                    int i2 = i;
                    if (i2 >= immutableList.size()) {
                        return 2FP.A01(new Imb(euz, 9), A0A);
                    }
                    A0A = 2FP.A00(new Fvn((Ezy) immutableList.get(i2), euz, 4), A0A, 1BK.A1E(euz.A03));
                    i = i2 + 1;
                }
                break;
        }
    }
}
