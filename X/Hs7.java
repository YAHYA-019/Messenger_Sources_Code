package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: Hs7.class */
public final class Hs7 {
    public 1X9 A00;
    public final 1Br A01;
    public final 1De A02;

    public Hs7(1De r302) {
        this.A02 = r302;
        this.A01 = GOp.A0J(r302);
    }

    public void A00(JHL jhl, String str, boolean z) {
        MailboxFutureImpl A0P;
        int i;
        11T.A0F(str, 0);
        1X9 r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A00 = null;
        FbUserSession A03 = 1Br.A03(this.A01);
        if (z) {
            22C r02 = (22C) 4YU.A0n(A03, this.A02, 65962);
            1Um A0O = 1BK.A0O(r02, 0);
            A0P = 1BK.A0P(A0O);
            int A00 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientAddStickerToCollection");
            if (!A0O.Cj2(new Ibw(A0P, r02, str, A00, 1))) {
                A0P.cancel(false);
                4uZ.A03(A00);
                4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientAddStickerToCollection");
            }
            PlatformLogger.platformEventLog(5);
            i = 46;
        } else {
            8yH r03 = (8yH) 4YU.A0n(A03, this.A02, 68390);
            long parseLong = Long.parseLong(str);
            1Um A0O2 = 1BK.A0O(r03, 0);
            A0P = 1BK.A0P(A0O2);
            1Um.A02(A0O2, new Ibu(A0P, r03, 10, parseLong), A0P, false);
            i = 45;
        }
        this.A00 = A0P.addResultCallback(new Iby(jhl, i));
    }

    public void A01(JHL jhl, String str, boolean z) {
        MailboxFutureImpl A0P;
        int i;
        11T.A0F(str, 0);
        1X9 r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A00 = null;
        FbUserSession A03 = 1Br.A03(this.A01);
        if (z) {
            22C r02 = (22C) 4YU.A0n(A03, this.A02, 65962);
            1Um A0O = 1BK.A0O(r02, 0);
            A0P = 1BK.A0P(A0O);
            int A00 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientRemoveCustomStickerFromCollection");
            if (!A0O.Cj2(new Ibw(A0P, r02, str, A00, 2))) {
                A0P.cancel(false);
                4uZ.A03(A00);
                4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientRemoveCustomStickerFromCollection");
            }
            PlatformLogger.platformEventLog(5);
            i = 48;
        } else {
            8yH r03 = (8yH) 4YU.A0n(A03, this.A02, 68390);
            long parseLong = Long.parseLong(str);
            1Um A0O2 = 1BK.A0O(r03, 0);
            A0P = 1BK.A0P(A0O2);
            1Um.A02(A0O2, new Ibu(A0P, r03, 11, parseLong), A0P, false);
            i = 47;
        }
        this.A00 = A0P.addResultCallback(new Iby(jhl, i));
    }
}
