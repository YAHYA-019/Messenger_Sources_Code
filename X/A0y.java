package X;

import com.facebook.msgorcapinnedmessages.mca.MailboxMSGOrcaPinnedMessages$LoadViewDataOptions;
import com.facebook.msgorcapinnedmessages.mca.MailboxMSGOrcaPinnedMessagesJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: A0y.class */
public final class A0y implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxMSGOrcaPinnedMessages$LoadViewDataOptions A02;
    public final /* synthetic */ 8yX A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public A0y(MailboxMSGOrcaPinnedMessages$LoadViewDataOptions mailboxMSGOrcaPinnedMessages$LoadViewDataOptions, 8yX r303, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A03 = r303;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A05 = str;
        this.A02 = mailboxMSGOrcaPinnedMessages$LoadViewDataOptions;
        this.A06 = z;
        this.A08 = z2;
        this.A07 = z3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(8yX.A00, 0);
        NotificationScope A00 = A1j.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 18);
        this.A04.setNotification(A1D, A00);
        MailboxMSGOrcaPinnedMessagesJNI.dispatchVIJOOOOOZZZZ(2, this.A00, this.A01, mailbox, this.A05, null, this.A02, A00, false, this.A06, this.A08, this.A07);
    }
}
