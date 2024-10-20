package X;

import android.app.job.JobParameters;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.papaya.fb.messenger.MessengerPapayaExecutionJobService;

/* loaded from: Lnh.class */
public final class Lnh implements Runnable {
    public static final String __redex_internal_original_name = "PapayaJobService$1";
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ MessengerPapayaExecutionJobService A01;

    public Lnh(JobParameters jobParameters, MessengerPapayaExecutionJobService messengerPapayaExecutionJobService) {
        this.A01 = messengerPapayaExecutionJobService;
        this.A00 = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessengerPapayaExecutionJobService messengerPapayaExecutionJobService = this.A01;
        JobParameters jobParameters = this.A00;
        synchronized (messengerPapayaExecutionJobService) {
            C5gy c5gy = messengerPapayaExecutionJobService.A02;
            if (c5gy != null) {
                c5gy.onStart();
            }
            FbUserSession A0D = 4YV.A0D(messengerPapayaExecutionJobService);
            Object A03 = 1Lo.A03(messengerPapayaExecutionJobService, A0D, 49818);
            ((C5gp) 1Lo.A03(messengerPapayaExecutionJobService, A0D, 49817)).A01();
            LfP.A00(1Kd.A0A(A03), jobParameters, messengerPapayaExecutionJobService, 12);
        }
    }
}
