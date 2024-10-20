package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;
import java.util.List;

/* loaded from: N84.class */
public final class N84 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public N84(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, Number number, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r303;
        this.A01 = i;
        this.A03 = mailboxFutureImpl;
        this.A05 = str;
        this.A04 = number;
    }

    public N84(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, String str, List list, int i, int i2) {
        this.A00 = i2;
        this.A02 = r303;
        this.A01 = i;
        this.A03 = mailboxFutureImpl;
        this.A05 = str;
        this.A04 = list;
    }

    public static NotificationScope A00(C1y2 c1y2, N84 n84, String str, int i) {
        NotificationScope A00 = c1y2.A00(new N89(str, n84, i), str);
        ((MailboxFutureImpl) n84.A03).setNotification(str, A00);
        return A00;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope A00;
        String str;
        Object obj2;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        switch (i2) {
            case 0:
                MailboxSDKJNI.dispatchVOOOOOO(97, mailbox, this.A05, this.A04, null, null, A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r(4YT.A00(1553), i3), 42), 7));
                return;
            case 1:
                A00 = A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r(4YT.A00(1040), i3), 45), 9);
                str = this.A05;
                obj2 = this.A04;
                i = 31;
                MailboxSDKJNI.dispatchVOOOO(i, mailbox, str, obj2, A00);
                return;
            case 2:
                A00 = A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r(4YT.A00(1391), i3), 45), 11);
                str = this.A05;
                obj2 = this.A04;
                i = 34;
                MailboxSDKJNI.dispatchVOOOO(i, mailbox, str, obj2, A00);
                return;
            case 3:
                A00 = A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r(4YT.A00(1418), i3), 20), 14);
                str = this.A05;
                obj2 = this.A04;
                i = 37;
                MailboxSDKJNI.dispatchVOOOO(i, mailbox, str, obj2, A00);
                return;
            case 4:
                A00 = A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r(4YT.A00(1035), i3), 6), 15);
                str = this.A05;
                obj2 = this.A04;
                i = 48;
                MailboxSDKJNI.dispatchVOOOO(i, mailbox, str, obj2, A00);
                return;
            case 5:
                A00 = A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r(4YT.A00(1550), i3), 40), 17);
                str = this.A05;
                obj2 = this.A04;
                i = 57;
                MailboxSDKJNI.dispatchVOOOO(i, mailbox, str, obj2, A00);
                return;
            default:
                A00 = A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, 7zM.A1D(AbF.A0r("markAsReadThreadWithThreadIdentifier", i3), 17), 22);
                str = this.A05;
                obj2 = this.A04;
                i = 80;
                MailboxSDKJNI.dispatchVOOOO(i, mailbox, str, obj2, A00);
                return;
        }
    }
}
