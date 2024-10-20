package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.3u5, reason: invalid class name */
/* loaded from: 3u5.class */
public final class C3u5 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C3u4 A01;
    public final /* synthetic */ List A02;

    public C3u5(MailboxFutureImpl mailboxFutureImpl, C3u4 c3u4, List list) {
        this.A01 = c3u4;
        this.A00 = mailboxFutureImpl;
        this.A02 = list;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A00, new MailboxNullable(null), 0, 0, "MCAMailboxThreadActionSystemList", "ThreadActionSystemStatusList", new C4W1(this, 1));
    }
}
