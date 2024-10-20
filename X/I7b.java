package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: I7b.class */
public final class I7b {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final PrivacyContext A05;
    public final FbUserSession A06;
    public final 1De A07;

    public I7b(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A06 = fbUserSession;
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 65961);
        this.A04 = 1BK.A0C();
        this.A01 = 1Lm.A03(fbUserSession, r0, 33148);
        this.A03 = 1Lm.A03(fbUserSession, r0, 65962);
        this.A00 = 1Bu.A03(r0, 82605);
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(529121621636450L));
        11T.A0A(newPrivacyContextNative);
        this.A05 = newPrivacyContextNative;
    }

    public static final void A00(JFt jFt, I7b i7b, C2623GjD c2623GjD, boolean z) {
        MailboxFeature A0d = 7zP.A0d(i7b.A01);
        Long valueOf = Long.valueOf(c2623GjD.A00);
        String str = c2623GjD.A04;
        if (z) {
            Iaj iaj = new Iaj(jFt, i7b, 16);
            1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(2);
            MailboxFutureImpl A0Q = 1BK.A0Q(AQV, iaj);
            1Um.A00(AQV, new A1Y(A0Q, A0d, valueOf, str, 2), A0Q);
            return;
        }
        Iaj iaj2 = new Iaj(jFt, i7b, 17);
        1Um A0R = 1BL.A0R(A0d);
        MailboxFutureImpl A0Q2 = 1BK.A0Q(A0R, iaj2);
        1Um.A00(A0R, new A1Y(A0Q2, A0d, valueOf, str, 3), A0Q2);
    }

    public static final void A01(JFt jFt, I7b i7b, C2623GjD c2623GjD, boolean z) {
        int i;
        ThreadKey threadKey = c2623GjD.A02;
        String str = c2623GjD.A05;
        if (str == null || 0CU.A0O(str) || threadKey == null || !threadKey.A0z()) {
            A00(jFt, i7b, c2623GjD, z);
            return;
        }
        if (!1Br.A07(i7b.A04).AZk(36319978623547928L)) {
            ((C3L) 1Br.A0B(i7b.A00)).A00(i7b.A06, new Ib3(1, jFt, i7b, c2623GjD, z), str, c2623GjD.A00);
            return;
        }
        MailboxFeature A0d = 7zP.A0d(i7b.A02);
        Long valueOf = Long.valueOf(c2623GjD.A00);
        String str2 = c2623GjD.A04;
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        if (z) {
            int A00 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "messengerRestrictContact");
            if (!AQV.Cj2(new IbM(A0d, A0P, valueOf, str2, A00, 2))) {
                A0P.cancel(false);
                4uZ.A03(A00);
                4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "messengerRestrictContact");
            }
            PlatformLogger.platformEventLog(5);
            i = 20;
        } else {
            int A002 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A022 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "messengerUnrestrictContact");
            if (!AQV.Cj2(new IbM(A0d, A0P, valueOf, str2, A002, 3))) {
                A0P.cancel(false);
                4uZ.A03(A002);
                4uZ.A05((LoggingOption) null, A022, "MailboxSDK", "messengerUnrestrictContact");
            }
            PlatformLogger.platformEventLog(5);
            i = 21;
        }
        A0P.addResultCallback(new Iaj(jFt, i7b, i));
    }
}
