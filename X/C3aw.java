package X;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.qp.mca.MailboxQPJNI;

/* renamed from: X.3aw, reason: invalid class name */
/* loaded from: 3aw.class */
public final class C3aw implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C3aw(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj5;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, 1BL.A0T(), 0, 1, "MCAMailboxClientNotificationsSilentPush", "NotPresentedClientNotificationsSilentPush", new A1g(this, 18));
                return;
            case 1:
                AccountSession accountSession = (AccountSession) obj;
                String str = (String) 1xC.A00.A00(29);
                NotificationScope A00 = ((C1y2) accountSession.getNotificationCenterCallbackManager()).A00(new A1k(str, this, 14), str);
                ((MailboxFutureImpl) this.A03).setNotification(str, A00);
                MailboxCoreJNI.dispatchVOOOOO(24, accountSession, this.A05, this.A04, this.A02, A00);
                return;
            case 2:
                AccountSession accountSession2 = (AccountSession) obj;
                String str2 = (String) 1xA.A00.A00(340);
                NotificationScope A002 = ((C1y2) accountSession2.getNotificationCenterCallbackManager()).A00(new A1j(this, 14), str2);
                ((MailboxFutureImpl) this.A03).setNotification(str2, A002);
                MailboxEncryptedBackupsJNI.dispatchVOOOOOOO(28, accountSession2, this.A02, null, this.A04, this.A05, null, A002);
                return;
            case 3:
                5Qb r0 = (5Qb) obj;
                11T.A0F(r0, 0);
                2kU r02 = (2kU) this.A05;
                ((Handler) 1Br.A0B(r02.A06)).removeCallbacks((Runnable) this.A03);
                if (r02.A0C.get()) {
                    return;
                }
                int i = r0.A00;
                Context context = (Context) this.A01;
                ViewGroup viewGroup = (ViewGroup) this.A04;
                if (i == 0) {
                    2kU.A01(context, viewGroup, r02, (String[]) this.A02);
                    return;
                } else {
                    2kU.A00(context, viewGroup, r02);
                    return;
                }
            default:
                Mailbox mailbox = (Mailbox) obj;
                String str3 = (String) AnonymousClass231.A00.A00(0);
                NotificationScope A003 = mailbox.getSessionedNotificationCenterCallbackManager().A00(new A1k(str3, this, 24), str3);
                ((MailboxFutureImpl) this.A02).setNotification(str3, A003);
                MailboxQPJNI.dispatchVOOOOO(0, mailbox, this.A05, this.A04, this.A03, A003);
                return;
        }
    }
}
