package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.3ao, reason: invalid class name */
/* loaded from: 3ao.class */
public final class C3ao implements MailboxCallback {
    public final /* synthetic */ AnonymousClass206 A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C3ao(AnonymousClass206 anonymousClass206, MailboxFutureImpl mailboxFutureImpl, String str, String str2) {
        this.A00 = anonymousClass206;
        this.A01 = mailboxFutureImpl;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass206.A00.A00(24);
        NotificationScope A00 = ((C1y2) accountSession.getNotificationCenterCallbackManager()).A00(new A1k(str, this, 0), str);
        this.A01.setNotification(str, A00);
        MailboxAdvancedCryptoTransportJNI.dispatchVOOOO(13, accountSession, this.A03, this.A02, A00);
    }
}
