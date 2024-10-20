package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: N7i.class */
public final class N7i implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ PrivacyContext A03;
    public final /* synthetic */ C00683ob A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public N7i(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, Number number, String str, String str2, String str3, String str4, String str5, String str6, int i, long j) {
        this.A04 = c00683ob;
        this.A02 = mailboxFutureImpl;
        this.A03 = privacyContext;
        this.A00 = i;
        this.A01 = j;
        this.A0B = str;
        this.A07 = str2;
        this.A0A = str3;
        this.A05 = number;
        this.A06 = str4;
        this.A09 = str5;
        this.A08 = str6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        PrivacyContext privacyContext = this.A03;
        N85 A00 = N85.A00(this, 89);
        C1qL c1qL = C00683ob.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxSearch", "InsertRecentSearchResult", A00);
    }
}
