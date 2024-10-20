package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7d.class */
public final class N7d implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ GsI A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public N7d(GsI gsI, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, int i, int i2, long j) {
        this.A03 = gsI;
        this.A04 = mailboxFutureImpl;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A0A = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A06 = number;
        this.A09 = str4;
        this.A05 = number2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        N85 A00 = N85.A00(this, 65);
        String A002 = AbE.A00(34);
        C1qL c1qL = GsI.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, A002, "MediaReceiverFetchTransportInsertReceiverFetchResponse", A00);
    }
}
