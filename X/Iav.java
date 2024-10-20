package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Iav.class */
public final class Iav implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Iav(Object obj, Object obj2, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, 1BL.A0T(), 0, 0, "MCAMailboxClientNotifications", "GetGroupInviteNotification", Ic0.A00(this, 8));
                return;
            case 1:
                AccountSession accountSession = (AccountSession) obj;
                String A1D = 7zM.A1D(1xC.A00, 59);
                NotificationScope A00 = Ic4.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 3);
                7zL.A1O(A00, this.A03, A1D);
                MailboxCoreJNI.dispatchVIIJOOOOO(5, 0, 0, this.A01, accountSession, this.A04, null, null, A00);
                return;
            default:
                1qX r0 = (1qX) ((MailboxNullable) obj).value;
                if (r0 == null || 1qX.A00(r0) <= 0) {
                    return;
                }
                int A002 = 1qX.A00(r0);
                for (int i = 0; i < A002; i++) {
                    int integer = r0.mResultSet.getInteger(i, 1);
                    String string = r0.mResultSet.getString(i, 23);
                    int integer2 = r0.mResultSet.getInteger(i, 2);
                    2bM r02 = (2bM) this.A03;
                    HoS hoS = (HoS) 1Br.A0B(r02.A01);
                    FbUserSession fbUserSession = r02.A00;
                    long j = this.A01;
                    String str = this.A04;
                    java.util.Map map = (java.util.Map) this.A02;
                    11T.A0F(fbUserSession, 0);
                    2R2 A08 = AbF.A08(1BK.A08(1Br.A02(hoS.A02), 1BJ.A00(529)), 281);
                    if (4YU.A1X(A08)) {
                        A08.A0D("promotion_id", Long.valueOf(j));
                        A08.A0D("context_surface_id", 1BK.A0l(integer));
                        A08.A0E("instance_log_data", string);
                        ((0D7) A08).A00.A6J(DKB.A00(47), map);
                        A08.BZL();
                    }
                    AnonymousClass231 anonymousClass231 = (AnonymousClass231) 4YU.A0o(fbUserSession, hoS.A00, 33222);
                    1Um A0O = 1BK.A0O(anonymousClass231, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new IbF(A0P, anonymousClass231, integer, integer2, 2, j), A0P, false);
                    C00i c00i = hoS.A01.A00;
                    long A05 = 4YV.A05(c00i);
                    1Um A0O2 = 1BK.A0O(anonymousClass231, 0);
                    MailboxFutureImpl A0P2 = 1BK.A0P(A0O2);
                    1Um.A02(A0O2, new Ibx(anonymousClass231, A0P2, 0, 2, j, A05), A0P2, false);
                    if (str != null) {
                        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", 1BJ.A00(ActionId.HEADER_DATA_LOADED));
                        11T.A0A(newPrivacyContextNative);
                        long A052 = 4YV.A05(c00i);
                        1Um A0O3 = 1BK.A0O(anonymousClass231, 0);
                        MailboxFutureImpl A0P3 = 1BK.A0P(A0O3);
                        1Um.A02(A0O3, new A0w(anonymousClass231, newPrivacyContextNative, A0P3, str, 0, 1, j, A052), A0P3, false);
                    }
                }
                return;
        }
    }
}
