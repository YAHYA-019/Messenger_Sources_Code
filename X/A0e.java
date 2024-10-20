package X;

import com.facebook.advancedcryptotransportdiskmanager.mca.MailboxAdvancedCryptoTransportDiskManagerJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: A0e.class */
public final class A0e implements MailboxCallback {
    public final /* synthetic */ C2cx A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ boolean A06;

    public A0e(C2cx c2cx, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, boolean z) {
        this.A00 = c2cx;
        this.A01 = mailboxFutureImpl;
        this.A03 = number;
        this.A04 = number2;
        this.A05 = number3;
        this.A02 = number4;
        this.A06 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A1D = 7zM.A1D(C2cx.A00, 45);
        NotificationScope CcE = accountSession.getSessionedNotificationCenterCallbackManager().CcE(new A1k(A1D, this, 8), A1D, 1);
        this.A01.setNotification(A1D, CcE);
        MailboxAdvancedCryptoTransportDiskManagerJNI.dispatchVOOOOOOZ(1, accountSession, this.A03, this.A04, this.A05, this.A02, CcE, this.A06);
    }
}
