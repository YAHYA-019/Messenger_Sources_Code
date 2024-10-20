package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* loaded from: N7m.class */
public final class N7m implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 22I A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ PrivacyContext A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public N7m(22I r302, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Number number, Number number2, String str, List list, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = r302;
        this.A04 = mailboxFutureImpl;
        this.A05 = privacyContext;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A08 = str;
        this.A09 = list;
        this.A06 = number;
        this.A07 = number2;
        this.A0B = z;
        this.A0A = z2;
        this.A0D = z3;
        this.A0C = z4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        MailboxNullable A0s = 7zL.A0s((Object) null);
        PrivacyContext privacyContext = this.A05;
        N85 A00 = N85.A00(this, 25);
        C1qL c1qL = 22I.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0s, 0, 0, null, privacyContext, "MCAMailboxCommunity", "GetCommunityMembers", A00);
    }
}
