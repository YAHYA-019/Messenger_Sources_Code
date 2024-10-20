package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Ibo.class */
public final class Ibo implements MailboxCallback {
    public final /* synthetic */ 22I A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ PrivacyContext A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public Ibo(22I r302, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, PrivacyContext privacyContext, Boolean bool, Number number, Number number2, Number number3, String str, String str2, String str3) {
        this.A00 = r302;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A03 = privacyContext;
        this.A05 = number;
        this.A07 = number2;
        this.A06 = number3;
        this.A08 = str;
        this.A04 = bool;
        this.A0A = str2;
        this.A09 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A01, false, 0, 1, MailboxFeature.listenForTaskCompletion(22I.A00, this.A02, mailbox), this.A03, "MCAMailboxCommunity", "JoinCommunityOrThread", Ic0.A00(this, 25));
    }
}
