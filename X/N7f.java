package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* loaded from: N7f.class */
public final class N7f implements MailboxCallback {
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
    public final /* synthetic */ List A0A;
    public final /* synthetic */ boolean A0B;

    public N7f(22I r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, String str, String str2, String str3, List list, long j, boolean z) {
        this.A01 = r302;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A07 = str;
        this.A04 = number;
        this.A05 = number2;
        this.A08 = str2;
        this.A0A = list;
        this.A06 = number3;
        this.A09 = str3;
        this.A03 = number4;
        this.A0B = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0T = 1BL.A0T();
        N85 A00 = N85.A00(this, 19);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 1, "MCAMailboxCommunity", "CreateCommunityChannelWithStatusV2", A00);
    }
}
