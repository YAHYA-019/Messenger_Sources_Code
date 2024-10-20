package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D1o.class */
public final class D1o implements 79Q {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;

    public D1o(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
        1Br A00 = 1Bu.A00(16671);
        this.A02 = A00;
        java.util.Map A1D = 1BK.A1D(7zN.A0i(), AbL.A0R(A00).BCy(36882928577217868L));
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(this.A00, this.A01, 65961);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        int A002 = 4uZ.A00(A0P, (1X9) null);
        TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "gifApiKeyInitialize");
        if (!AQV.Cj2(new CzW(A002, 3, A1D, mailboxFeature, A0P))) {
            A0P.cancel(false);
            4uZ.A03(A002);
            4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "gifApiKeyInitialize");
        }
        PlatformLogger.platformEventLog(5);
    }

    public /* bridge */ /* synthetic */ ListenableFuture D1r(Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        1FV A0j = 4YU.A0j();
        5P8 r0 = (5P8) 1Lm.A05(this.A00, this.A01, 65961);
        1Um A0O = 1BK.A0O(r0, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        int A00 = 4uZ.A00(A0P, (1X9) null);
        TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "gifSearch");
        if (!A0O.Cj2(new CzX(A0P, r0, str, A00, 0))) {
            A0P.cancel(false);
            4uZ.A03(A00);
            4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "gifSearch");
        }
        PlatformLogger.platformEventLog(5);
        Czj.A02(A0P, this, A0j, 13);
        return A0j;
    }
}
