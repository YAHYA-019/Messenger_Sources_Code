package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: D26.class */
public final class D26 implements 1Vf {
    public final FbUserSession A00;
    public final 1Br A01 = 1Bu.A00(82497);
    public final 1Br A02;
    public final ThreadKey A03;
    public final Context A04;

    public D26(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A03 = threadKey;
        this.A04 = context;
        this.A00 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 65962);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
            throw 0Pz.A05(1BJ.A00(ActionId.MESSENGER_DELTA_REQUEST), str);
        }
        22C r0 = (22C) 1Br.A0B(this.A02);
        boolean A00 = ((7EL) 1Br.A0B(this.A01)).A00(this.A00);
        long j = this.A03.A01;
        Czk A002 = Czk.A00(this, 72);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        int A003 = 4uZ.A00(A0P, (1X9) null);
        TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamInternalThreadBannerEnsureDisappearingMessageBanner");
        A0P.Cu4(A002);
        if (!AQV.Cj2(new Cy9(A0P, r0, A003, 1, j, A00))) {
            A0P.cancel(false);
            4uZ.A03(A003);
            4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamInternalThreadBannerEnsureDisappearingMessageBanner");
        }
        PlatformLogger.platformEventLog(5);
    }
}
