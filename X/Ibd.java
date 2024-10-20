package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.payments.mca.MailboxPaymentsJNI;
import com.facebook.reportingsdk.mca.MailboxReportingSDKJNI;

/* loaded from: Ibd.class */
public final class Ibd implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public Ibd(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A07 = str;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A06 = str2;
        this.A05 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            Mailbox mailbox = (Mailbox) obj;
            String A1D = 7zM.A1D(BDY.A00, 3);
            NotificationScope A00 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 11);
            7zL.A1O(A00, this.A03, A1D);
            MailboxReportingSDKJNI.dispatchVOOOOOOO(5, mailbox, this.A06, this.A04, this.A07, this.A02, this.A05, A00);
            return;
        }
        AccountSession accountSession = (AccountSession) obj;
        String A1D2 = 7zM.A1D(GsL.A00, 3);
        NotificationScope CcE = accountSession.getSessionedNotificationCenterCallbackManager().CcE(new Ic4(A1D2, this, 9), A1D2, 1);
        7zL.A1O(CcE, this.A02, A1D2);
        MailboxPaymentsJNI.dispatchVOOOOOOO(1, accountSession, this.A07, this.A04, this.A03, this.A06, this.A05, CcE);
    }
}
