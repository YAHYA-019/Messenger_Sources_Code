package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.3b6, reason: invalid class name */
/* loaded from: 3b6.class */
public final class C3b6 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C3b6(ThreadKey threadKey, C5fm c5fm, String str, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = c5fm;
            this.A02 = threadKey;
            this.A03 = str;
        } else {
            this.A01 = c5fm;
            this.A02 = threadKey;
            this.A03 = str;
        }
    }

    public C3b6(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C01s A09;
        String A0v;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                MailboxAdvancedCryptoTransportJNI.dispatchVOOOO(20, obj, this.A03, null, null);
                ((MailboxObservableImpl) this.A02).setResult(null);
                return;
            case 1:
                AccountSession accountSession = (AccountSession) obj;
                String str3 = (String) 1xC.A00.A00(45);
                NotificationScope CcE = ((C1y2) accountSession.getNotificationCenterCallbackManager()).CcE(new Czo(str3, this, 2), str3, 1);
                ((MailboxFutureImpl) this.A02).setNotification(str3, CcE);
                MailboxCoreJNI.dispatchVOOO(1, accountSession, this.A03, CcE);
                return;
            case 2:
                AccountSession accountSession2 = (AccountSession) obj;
                String str4 = (String) 1xC.A00.A00(46);
                NotificationScope A00 = ((C1y2) accountSession2.getNotificationCenterCallbackManager()).A00(new Czo(str4, this, 4), str4);
                ((MailboxFutureImpl) this.A02).setNotification(str4, A00);
                MailboxCoreJNI.dispatchVOOO(2, accountSession2, this.A03, A00);
                return;
            case 3:
                5Qb r0 = (5Qb) obj;
                2Wm r02 = ((2Wl) this.A02).A08;
                if (r02 != null) {
                    String str5 = this.A03;
                    11T.A0D(r0);
                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                    11T.A0F(r0, 1);
                    int i2 = r0.A00;
                    if (i2 == 0) {
                        MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A08(fbUserSession, 33183);
                        PrivacyContext A002 = ((AnonymousClass224) 1Br.A0B(r02.A03)).A00("1036814007366859");
                        A1d a1d = new A1d(r02, 59);
                        1Um A0O = 1BK.A0O(mailboxFeature, 0);
                        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, a1d);
                        1Um.A02(A0O, new A1Y(A002, mailboxFeature, A0Q, str5, 1), A0Q, false);
                        return;
                    }
                    String A003 = 4YT.A00(76);
                    if (i2 == 1) {
                        r02.A0P(A003);
                        str2 = "selective_sync_remediation_failed";
                    } else {
                        if (i2 != 2) {
                            return;
                        }
                        r02.A0P(A003);
                        str2 = "selective_sync_remediation_no_task_tracked";
                    }
                    r02.A0J(str2);
                    return;
                }
                return;
            case 4:
                C5fm c5fm = (C5fm) this.A01;
                ThreadKey threadKey = (ThreadKey) this.A02;
                String str6 = this.A03;
                if (!AnonymousClass001.A1V(obj)) {
                    A09 = 1BK.A09(c5fm.A08);
                    A0v = 0Pz.A0v("Failed to delete messages, threadKey: ", threadKey.A0u(), ", messageId: ", str6);
                    i = 1;
                    str = "MsysDeleteMessages";
                    break;
                } else {
                    return;
                }
            case 5:
                if (!AnonymousClass001.A1V(obj)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("delete message fail - threadKey ");
                    A0k.append(this.A02);
                    A0k.append(", messageID ");
                    A0k.append(this.A03);
                    A09 = 1BK.A09(((C5fm) this.A01).A08);
                    A0v = A0k.toString();
                    i = 1;
                    str = "MsysDeleteMessage";
                    break;
                } else {
                    return;
                }
            default:
                if (AnonymousClass001.A1V(obj)) {
                    return;
                }
                String str7 = this.A03;
                ThreadKey threadKey2 = (ThreadKey) this.A02;
                throw AnonymousClass001.A0T(0Pz.A0j(str7, threadKey2.A0z() ? "AdvancedCrypto" : "CarrierMessaging", String.valueOf(threadKey2.A0s())));
        }
        A09.D0w(str, A0v, i);
    }
}
