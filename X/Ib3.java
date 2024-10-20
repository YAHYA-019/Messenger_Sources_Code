package X;

import com.facebook.advancedcryptotransportmedia.mca.MailboxAdvancedCryptoTransportMediaJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Ib3.class */
public final class Ib3 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public Ib3(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 == 0) {
            AccountSession accountSession = (AccountSession) obj;
            String A1D = 7zM.A1D(GsG.A00, 1);
            NotificationScope CcE = accountSession.getSessionedNotificationCenterCallbackManager().CcE(new Ic4(A1D, this, 0), A1D, 1);
            7zL.A1O(CcE, this.A03, A1D);
            MailboxAdvancedCryptoTransportMediaJNI.dispatchVOOOZ(0, accountSession, this.A02, CcE, this.A04);
            return;
        }
        Number number = (Number) ((MailboxNullable) obj).value;
        if (number != null) {
            long longValue = number.longValue();
            if (longValue > 0) {
                I7b i7b = (I7b) this.A03;
                C2623GjD c2623GjD = (C2623GjD) this.A02;
                boolean z = this.A04;
                Object obj2 = this.A01;
                MailboxFeature A0d = 7zP.A0d(i7b.A03);
                String str = c2623GjD.A04;
                PrivacyContext privacyContext = i7b.A05;
                if (z) {
                    Iaj iaj = new Iaj(obj2, i7b, 18);
                    1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    int A00 = 4uZ.A00(A0P, (1X9) null);
                    TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientContactRestrict");
                    A0P.Cu4(iaj);
                    if (!AQV.Cj2(new IbU(A0P, privacyContext, A0d, str, A00, 1, longValue))) {
                        A0P.cancel(false);
                        4uZ.A03(A00);
                        4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientContactRestrict");
                    }
                } else {
                    Iaj iaj2 = new Iaj(obj2, i7b, 19);
                    1Um AQV2 = A0d.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
                    int A002 = 4uZ.A00(A0P2, (1X9) null);
                    TraceInfo A022 = 4uZ.A02(A0P2, (LoggingOption) null, "MailboxTam", "runTamClientContactUnrestrict");
                    A0P2.Cu4(iaj2);
                    if (!AQV2.Cj2(new IbU(A0P2, privacyContext, A0d, str, A002, 2, longValue))) {
                        A0P2.cancel(false);
                        4uZ.A03(A002);
                        4uZ.A05((LoggingOption) null, A022, "MailboxTam", "runTamClientContactUnrestrict");
                    }
                }
                PlatformLogger.platformEventLog(5);
                return;
            }
        }
        I7b.A00((JFt) this.A01, (I7b) this.A03, (C2623GjD) this.A02, this.A04);
    }
}
