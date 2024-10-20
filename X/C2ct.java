package X;

import com.facebook.localstoragemanagement.mca.MailboxLocalStorageManagementJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.2ct, reason: invalid class name */
/* loaded from: 2ct.class */
public final class C2ct extends MailboxFeature {
    public static C1qL A00 = new 38C(8);

    public void A00(MailboxCallback mailboxCallback, final int i, final boolean z) {
        1Um AQV = this.mMailboxApiHandleMetaProvider.AQV(2);
        final MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(mailboxCallback);
        if (AQV.Cj2(new MailboxCallback() { // from class: X.2cu
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                AccountSession accountSession = (AccountSession) obj;
                String str = (String) C2ct.A00.A00(0);
                NotificationScope CcE = ((C1y2) accountSession.getNotificationCenterCallbackManager()).CcE(new 30T(str, this, 2), str, 1);
                mailboxFutureImpl.setNotification(str, CcE);
                MailboxLocalStorageManagementJNI.dispatchVIOOZ(0, i, accountSession, CcE, z);
            }
        })) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
