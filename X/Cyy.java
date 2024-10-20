package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Cyy.class */
public final class Cyy implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 1xC A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ boolean A0J;

    public Cyy(1xC r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, long j, long j2, boolean z) {
        this.A03 = r302;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A0F = str;
        this.A09 = number;
        this.A0G = str2;
        this.A08 = number2;
        this.A0H = str3;
        this.A0C = str4;
        this.A0E = str5;
        this.A0D = str6;
        this.A06 = number3;
        this.A0I = str7;
        this.A05 = number4;
        this.A07 = number5;
        this.A0B = str8;
        this.A0A = str9;
        this.A0J = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(1xC.A00, 44);
        NotificationScope A00 = Czn.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 2);
        this.A04.setNotification(A1D, A00);
        MailboxCoreJNI.dispatchVIIIJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOZ(14, 0, 0, this.A00, this.A02, this.A01, mailbox, this.A0F, this.A09, this.A0G, this.A08, null, null, null, null, "", null, null, "", null, null, null, null, this.A0H, null, this.A0C, null, null, null, null, this.A0E, this.A0D, this.A06, null, this.A0I, this.A05, this.A07, null, this.A0B, null, null, this.A0A, A00, this.A0J);
    }
}
