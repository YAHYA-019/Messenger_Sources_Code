package X;

import com.facebook.messaging.privacyframework.cmcd.messenger.plugins.cmcddbsource.cmcdperiodicdataloading.CMCDPeriodicDataUpdateImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: AG9.class */
public final class AG9 implements Runnable {
    public static final String __redex_internal_original_name = "CMCDPeriodicDataUpdateImplementation$loadMessageRunnable$1";
    public final /* synthetic */ CMCDPeriodicDataUpdateImplementation A02;
    public final MailboxCallback A01 = A1N.A00;
    public final MailboxCallback A00 = A1M.A00;

    public AG9(CMCDPeriodicDataUpdateImplementation cMCDPeriodicDataUpdateImplementation) {
        this.A02 = cMCDPeriodicDataUpdateImplementation;
    }

    @Override // java.lang.Runnable
    public void run() {
        CMCDPeriodicDataUpdateImplementation cMCDPeriodicDataUpdateImplementation = this.A02;
        C00i c00i = cMCDPeriodicDataUpdateImplementation.A02.A00;
        if (((1OC) c00i.get()).A06) {
            MailboxFeature A0d = 7zP.A0d(cMCDPeriodicDataUpdateImplementation.A01);
            MailboxCallback mailboxCallback = this.A00;
            1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            int A00 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxOrca", "loadOrcaClientMessagesTextPayLoad");
            A0P.Cu4(mailboxCallback);
            if (!AQV.Cj2(new A0G(A00, 5, A0d, A0P))) {
                A0P.cancel(false);
                4uZ.A03(A00);
                4uZ.A05((LoggingOption) null, A02, "MailboxOrca", "loadOrcaClientMessagesTextPayLoad");
            }
            PlatformLogger.platformEventLog(5);
        }
        if (((1OC) c00i.get()).A05) {
            MailboxFeature A0d2 = 7zP.A0d(cMCDPeriodicDataUpdateImplementation.A01);
            MailboxCallback mailboxCallback2 = this.A01;
            1Um AQV2 = A0d2.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
            int A002 = 4uZ.A00(A0P2, (1X9) null);
            TraceInfo A022 = 4uZ.A02(A0P2, (LoggingOption) null, "MailboxOrca", "loadOrcaMessageTextPayloadv2");
            A0P2.Cu4(mailboxCallback2);
            if (!AQV2.Cj2(new A0G(A002, 4, A0d2, A0P2))) {
                A0P2.cancel(false);
                4uZ.A03(A002);
                4uZ.A05((LoggingOption) null, A022, "MailboxOrca", "loadOrcaMessageTextPayloadv2");
            }
            PlatformLogger.platformEventLog(5);
        }
        cMCDPeriodicDataUpdateImplementation.A00.postDelayed(this, 300000L);
    }
}
