package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.5c8, reason: invalid class name */
/* loaded from: 5c8.class */
public final class C5c8 implements MailboxCallback {
    public final /* synthetic */ 1yI A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ PrivacyContext A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ List A0C;

    public C5c8(1yI r302, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, PrivacyContext privacyContext, Boolean bool, Boolean bool2, Boolean bool3, Number number, Number number2, Number number3, String str, List list, List list2) {
        this.A00 = r302;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A03 = privacyContext;
        this.A0A = str;
        this.A05 = bool;
        this.A04 = bool2;
        this.A08 = number;
        this.A0C = list;
        this.A09 = number2;
        this.A0B = list2;
        this.A06 = bool3;
        this.A07 = number3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(1yI.A00, this.A02, mailbox);
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A01, false, 0, 1, listenForTaskCompletion, this.A03, 7zK.A00(65), "IssueHighlightsTabContentQuery", new 30P(this, 1));
    }
}
