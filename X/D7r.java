package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: D7r.class */
public final class D7r implements Runnable {
    public static final String __redex_internal_original_name = "MessageExpirationHelper$triggerErrorLoggingTasks$1";
    public final /* synthetic */ Bwn A00;
    public final /* synthetic */ boolean A01;

    public D7r(Bwn bwn, boolean z) {
        this.A00 = bwn;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bwn bwn = this.A00;
        MailboxFeature A0d = 7zP.A0d(bwn.A02);
        boolean z = this.A01;
        Czk A00 = Czk.A00(bwn, 65);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        int A002 = 4uZ.A00(A0P, (1X9) null);
        TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamTransportScheduleEphemeralMessageErrorLoggingTaskIfNeeded");
        A0P.Cu4(A00);
        if (!AQV.Cj2(new Cxy(A002, 1, A0P, A0d, z))) {
            A0P.cancel(false);
            4uZ.A03(A002);
            4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamTransportScheduleEphemeralMessageErrorLoggingTaskIfNeeded");
        }
        PlatformLogger.platformEventLog(5);
    }
}
