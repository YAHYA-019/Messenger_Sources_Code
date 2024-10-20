package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Czc.class */
public final class Czc implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public Czc(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, Number number, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = r303;
        this.A01 = i;
        if (i2 != 0) {
            this.A03 = mailboxFutureImpl;
            this.A06 = str;
            this.A04 = number;
            this.A05 = str2;
        } else {
            this.A04 = mailboxFutureImpl;
            this.A06 = str;
            this.A05 = str2;
            this.A03 = number;
        }
    }

    public Czc(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A06 = str;
        this.A05 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope A00;
        String str;
        Object obj2;
        Object obj3;
        int i;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        switch (i2) {
            case 0:
                String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1552), i3), 41);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 18);
                7zL.A1O(A00, this.A04, A1D);
                str = this.A06;
                obj2 = this.A05;
                obj3 = this.A03;
                i = 93;
                MailboxSDKJNI.dispatchVOOOOO(i, mailbox, str, obj2, obj3, A00);
                return;
            case 1:
                String A1D2 = 7zM.A1D(AbF.A0r(4YT.A00(1481), i3), 46);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D2, 30);
                7zL.A1O(A00, this.A03, A1D2);
                str = this.A06;
                obj2 = this.A04;
                obj3 = this.A05;
                i = 39;
                MailboxSDKJNI.dispatchVOOOOO(i, mailbox, str, obj2, obj3, A00);
                return;
            case 2:
                C1qL A0r = AbF.A0r(1BJ.A00(1229), i3);
                NotificationScope A0j = AbM.A0j(A0r, mailbox, this.A04);
                String A1D3 = 7zM.A1D(A0r, 6);
                NotificationScope A002 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D3, 35);
                7zL.A1O(A002, this.A03, A1D3);
                MailboxSDKJNI.dispatchVOOOOO(47, mailbox, this.A06, this.A05, A002, A0j);
                return;
            default:
                String A1D4 = 7zM.A1D(AbF.A0r(4YT.A00(1477), i3), 29);
                A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D4, 39);
                7zL.A1O(A00, this.A03, A1D4);
                str = this.A06;
                obj2 = this.A05;
                obj3 = this.A04;
                i = 59;
                MailboxSDKJNI.dispatchVOOOOO(i, mailbox, str, obj2, obj3, A00);
                return;
        }
    }
}
