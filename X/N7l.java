package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* loaded from: N7l.class */
public final class N7l implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 22I A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ PrivacyContext A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ boolean A0D;

    public N7l(22I r302, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Boolean bool, Number number, Number number2, String str, String str2, String str3, List list, List list2, int i, long j, boolean z) {
        this.A02 = r302;
        this.A03 = mailboxFutureImpl;
        this.A04 = privacyContext;
        this.A00 = i;
        this.A01 = j;
        this.A0B = list;
        this.A05 = bool;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = number;
        this.A0A = str3;
        this.A0C = list2;
        this.A06 = number2;
        this.A0D = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        PrivacyContext privacyContext = this.A04;
        N85 A00 = N85.A00(this, 22);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxCommunity", "IssueCommunityMemberListFetch", A00);
    }
}
