package X;

import com.facebook.advancedcryptotransportdiskmanager.mca.MailboxAdvancedCryptoTransportDiskManagerJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: A0t.class */
public final class A0t implements MailboxCallback {
    public final /* synthetic */ C2cx A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ boolean A07;

    public A0t(C2cx c2cx, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, boolean z) {
        this.A00 = c2cx;
        this.A01 = mailboxFutureImpl;
        this.A06 = number;
        this.A03 = number2;
        this.A04 = number3;
        this.A05 = number4;
        this.A02 = number5;
        this.A07 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A1D = 7zM.A1D(C2cx.A00, 54);
        NotificationScope A00 = A1k.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 7);
        this.A01.setNotification(A1D, A00);
        MailboxAdvancedCryptoTransportDiskManagerJNI.dispatchVOOOOOOOZ(0, accountSession, this.A06, this.A03, this.A04, this.A05, this.A02, A00, this.A07);
    }
}
