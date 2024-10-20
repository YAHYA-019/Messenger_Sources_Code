package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: N7g.class */
public final class N7g implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 22I A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;

    public N7g(22I r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, String str, String str2, String str3, String str4, List list, long j) {
        this.A01 = r302;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A0A = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0B = list;
        this.A03 = number;
        this.A05 = number2;
        this.A09 = str4;
        this.A06 = number3;
        this.A04 = number4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        N85 A00 = N85.A00(this, 20);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxCommunity", "CreateCommunityChatSuggestion", A00);
    }
}
