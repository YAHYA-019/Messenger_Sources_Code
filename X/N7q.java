package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7q.class */
public final class N7q implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1yI A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;

    public N7q(1yI r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, long j2) {
        this.A02 = r302;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A00 = j2;
        this.A0G = str;
        this.A09 = str2;
        this.A0F = str3;
        this.A0H = str4;
        this.A0A = str5;
        this.A0B = str6;
        this.A0D = str7;
        this.A0C = str8;
        this.A06 = number;
        this.A05 = number2;
        this.A0E = str9;
        this.A04 = number3;
        this.A08 = str10;
        this.A07 = str11;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        N85 A00 = N85.A00(this, 56);
        C1qL c1qL = 1yI.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxHighlightsTab", "HighlightsTabMessagesWithAttachmentsInsert", A00);
    }
}
