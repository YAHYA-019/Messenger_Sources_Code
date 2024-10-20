package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Cyu.class */
public final class Cyu implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1xC A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public Cyu(1xC r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j) {
        this.A02 = r302;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = str3;
        this.A04 = number;
        this.A0A = str4;
        this.A05 = number2;
        this.A0C = str5;
        this.A0B = str6;
        this.A07 = str7;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(1xC.A00, 44);
        NotificationScope A00 = Czn.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 4);
        this.A03.setNotification(A1D, A00);
        MailboxCoreJNI.dispatchVIJOOOOOOOOOOOOOO(22, this.A00, this.A01, mailbox, this.A08, this.A09, null, this.A06, this.A04, null, this.A0A, this.A05, A00, this.A0C, this.A0B, this.A07, null);
    }
}
