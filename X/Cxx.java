package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cxx.class */
public final class Cxx implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Cxx(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r303;
        this.A01 = i;
        this.A03 = mailboxFutureImpl;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope A00;
        String str;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        switch (i2) {
            case 0:
                String A1D = 7zM.A1D(AbF.A0r(1BJ.A00(1463), i3), 13);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 29);
                7zL.A1O(A00, this.A03, A1D);
                str = this.A04;
                i = 33;
                break;
            case 1:
                String A1D2 = 7zM.A1D(AbF.A0r(1BJ.A00(975), i3), 2);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D2, 44);
                7zL.A1O(A00, this.A03, A1D2);
                str = this.A04;
                i = 73;
                break;
            case 2:
                String A1D3 = 7zM.A1D(AbF.A0r(4YT.A00(1036), i3), 7);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D3, 45);
                7zL.A1O(A00, this.A03, A1D3);
                str = this.A04;
                i = 75;
                break;
            case 3:
                String A1D4 = 7zM.A1D(AbF.A0r(1BJ.A00(1538), i3), 18);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D4, 47);
                7zL.A1O(A00, this.A03, A1D4);
                str = this.A04;
                i = 82;
                break;
            default:
                String A1D5 = 7zM.A1D(AbF.A0r(1BJ.A00(2096), i3), 34);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D5, 51);
                7zL.A1O(A00, this.A03, A1D5);
                str = this.A04;
                i = 89;
                break;
        }
        MailboxSDKJNI.dispatchVOOO(i, mailbox, str, A00);
    }
}
