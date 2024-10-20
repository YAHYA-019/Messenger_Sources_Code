package X;

import com.facebook.messengerrankingextension.mca.MailboxMessengerRankingExtensionJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Cyl.class */
public final class Cyl implements MailboxCallback {
    public final /* synthetic */ BDX A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ PrivacyContext A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ java.util.Map A07;
    public final /* synthetic */ java.util.Map A08;

    public Cyl(BDX bdx, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Number number, Number number2, Number number3, Number number4, java.util.Map map, java.util.Map map2) {
        this.A00 = bdx;
        this.A01 = mailboxFutureImpl;
        this.A03 = number;
        this.A04 = number2;
        this.A06 = number3;
        this.A05 = number4;
        this.A08 = map;
        this.A07 = map2;
        this.A02 = privacyContext;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(BDX.A00, 1);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new Czo(A1D, this, 9), A1D, 1);
        this.A01.setNotification(A1D, CcE);
        MailboxMessengerRankingExtensionJNI.dispatchVOOOOOOOOOO(0, mailbox, "mldw_key", this.A03, this.A04, this.A06, this.A05, this.A08, this.A07, this.A02, CcE);
    }
}
