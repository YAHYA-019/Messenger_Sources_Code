package X;

import android.app.job.JobParameters;

/* renamed from: X.4S6, reason: invalid class name */
/* loaded from: 4S6.class */
public abstract class C4S6 {
    public static int A00(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            default:
                stopReason = -512;
                break;
        }
        return stopReason;
    }
}
